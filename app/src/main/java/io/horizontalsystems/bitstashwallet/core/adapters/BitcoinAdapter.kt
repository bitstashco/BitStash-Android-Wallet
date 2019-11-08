package io.horizontalsystems.bitstashwallet.core.adapters

import io.horizontalsystems.bitstashwallet.core.AdapterState
import io.horizontalsystems.bitstashwallet.core.App
import io.horizontalsystems.bitstashwallet.core.ISendBitcoinAdapter
import io.horizontalsystems.bitstashwallet.core.UnsupportedAccountException
import io.horizontalsystems.bitstashwallet.entities.AccountType
import io.horizontalsystems.bitstashwallet.entities.AccountType.Derivation
import io.horizontalsystems.bitstashwallet.entities.SyncMode
import io.horizontalsystems.bitstashwallet.entities.TransactionRecord
import io.horizontalsystems.bitstashwallet.entities.Wallet
import io.horizontalsystems.bitstashwallet.viewHelpers.DateHelper
import io.horizontalsystems.bitcoincore.BitcoinCore
import io.horizontalsystems.bitcoincore.core.Bip
import io.horizontalsystems.bitcoincore.models.BlockInfo
import io.horizontalsystems.bitcoincore.models.TransactionInfo
import io.horizontalsystems.bitcoinkit.BitcoinKit
import io.horizontalsystems.bitcoinkit.BitcoinKit.NetworkType
import io.reactivex.Single
import java.math.BigDecimal
import java.util.*

class BitcoinAdapter(override val kit: BitcoinKit)
    : BitcoinBaseAdapter(kit), BitcoinKit.Listener, ISendBitcoinAdapter {

    constructor(wallet: Wallet, testMode: Boolean) : this(createKit(wallet, testMode))

    init {
        kit.listener = this
    }

    //
    // BitcoinBaseAdapter
    //

    override val satoshisInBitcoin: BigDecimal = BigDecimal.valueOf(Math.pow(10.0, decimal.toDouble()))

    //
    // BitcoinKit Listener
    //

    override fun onBalanceUpdate(balance: Long) {
        balanceUpdatedSubject.onNext(Unit)
    }

    override fun onLastBlockInfoUpdate(blockInfo: BlockInfo) {
        lastBlockHeightUpdatedSubject.onNext(Unit)
    }

    override fun onKitStateUpdate(state: BitcoinCore.KitState) {
        when (state) {
            is BitcoinCore.KitState.Synced -> {
                if (this.state !is AdapterState.Synced) {
                    this.state = AdapterState.Synced
                }
            }
            is BitcoinCore.KitState.NotSynced -> {
                if (this.state !is AdapterState.NotSynced) {
                    this.state = AdapterState.NotSynced
                }
            }
            is BitcoinCore.KitState.Syncing -> {
                this.state.let { currentState ->
                    val newProgress = (state.progress * 100).toInt()
                    val newDate = kit.lastBlockInfo?.timestamp?.let { Date(it * 1000) }

                    if (currentState is AdapterState.Syncing && currentState.progress == newProgress) {
                        val currentDate = currentState.lastBlockDate
                        if (newDate != null && currentDate != null && DateHelper.isSameDay(newDate, currentDate)) {
                            return
                        }
                    }

                    this.state = AdapterState.Syncing(newProgress, newDate)
                }
            }
        }
    }

    override fun onTransactionsUpdate(inserted: List<TransactionInfo>, updated: List<TransactionInfo>) {
        val records = mutableListOf<TransactionRecord>()

        for (info in inserted) {
            records.add(transactionRecord(info))
        }

        for (info in updated) {
            records.add(transactionRecord(info))
        }

        transactionRecordsSubject.onNext(records)
    }

    override fun onTransactionsDelete(hashes: List<String>) {
        // ignored for now
    }

    override fun getTransactions(from: Pair<String, Int>?, limit: Int): Single<List<TransactionRecord>> {
        return kit.transactions(from?.first, limit).map { it.map { tx -> transactionRecord(tx) } }
    }

    companion object {

        private fun getNetworkType(testMode: Boolean) =
                if (testMode) NetworkType.TestNet else NetworkType.MainNet

        private fun getBip(derivation: Derivation): Bip = when (derivation) {
            Derivation.bip44 -> Bip.BIP44
            Derivation.bip49 -> Bip.BIP49
            Derivation.bip84 -> Bip.BIP84
        }

        private fun createKit(wallet: Wallet, testMode: Boolean): BitcoinKit {
            val account = wallet.account
            val accountType = account.type
            if (accountType is AccountType.Mnemonic) {
                return BitcoinKit(context = App.instance,
                        words = accountType.words,
                        walletId = account.id,
                        syncMode = SyncMode.fromSyncMode(account.defaultSyncMode),
                        networkType = getNetworkType(testMode),
                        confirmationsThreshold = defaultConfirmationsThreshold,
                        bip = getBip(accountType.derivation))
            }

            throw UnsupportedAccountException()
        }

        fun clear(walletId: String, testMode: Boolean) {
            BitcoinKit.clear(App.instance, getNetworkType(testMode), walletId)
        }
    }
}

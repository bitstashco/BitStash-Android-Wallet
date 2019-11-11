package app.odapplications.bitstashwallet.modules.managecoins

import app.odapplications.bitstashwallet.core.DefaultAccountType
import app.odapplications.bitstashwallet.core.IPredefinedAccountType
import app.odapplications.bitstashwallet.entities.AccountType
import app.odapplications.bitstashwallet.entities.Coin
import app.odapplications.bitstashwallet.entities.SyncMode
import app.odapplications.bitstashwallet.entities.Wallet

class ManageWalletsPresenter(private val interactor: ManageWalletsModule.IInteractor, private val router: ManageWalletsModule.IRouter)
    : ManageWalletsModule.IViewDelegate, ManageWalletsModule.IInteractorDelegate {

    var view: ManageWalletsModule.IView? = null

    private var items = mutableListOf<ManageWalletItem>()
    private var popularItems = mutableListOf<ManageWalletItem>()
    private val popularCoinCodes = listOf("BTC", "BCH", "ETH", "DASH", "EOS", "BNB")
    private var currentItem: ManageWalletItem? = null

    //  ViewDelegate

    override fun viewDidLoad() {
        val wallets = interactor.wallets

        val popularCoins = interactor.coins.filter { popularCoinCodes.contains(it.code) }
        val coins = interactor.coins.filter { !popularCoinCodes.contains(it.code) }

        popularItems = popularCoins.map { coin ->
            ManageWalletItem(coin, wallets.find { it.coin == coin })
        }.toMutableList()

        items = coins.map { coin ->
            ManageWalletItem(coin, wallets.find { it.coin == coin })
        }.toMutableList()
    }

    override fun onClickCreateKey() {
        val item = currentItem ?: return

        try {
            item.wallet = interactor.createWallet(item.coin)
            view?.showSuccess()
        } catch (e: Exception) {
            view?.showError(e)
        }
    }

    override fun onClickRestoreKey() {
        val item = currentItem ?: return

        when (val accountType = item.coin.type.defaultAccountType) {
            is DefaultAccountType.Mnemonic -> {
                router.openRestoreWordsModule(accountType.wordsCount)
            }
            is DefaultAccountType.Eos -> {
                router.openRestoreEosModule()
            }
        }
    }

    override fun onClickCancel() {
        view?.updateCoins()
    }

    override fun onRestore(accountType: AccountType, syncMode: SyncMode?) {
        val item = currentItem ?: return

        try {
            item.wallet = interactor.restoreWallet(item.coin, accountType, syncMode)
        } catch (e: Exception) {
            view?.showError(e)
        }
    }

    override val popularItemsCount: Int
        get() = popularItems.size

    override fun popularItem(position: Int): ManageWalletViewItem {
        return viewItem(popularItems[position])
    }

    override val itemsCount: Int
        get() = items.size

    override fun item(position: Int): ManageWalletViewItem {
        return viewItem(items[position])
    }

    override fun enablePopularCoin(position: Int) {
        enable(popularItems[position])
    }

    override fun disablePopularCoin(position: Int) {
        disable(popularItems[position])
    }

    override fun enableCoin(position: Int) {
        enable(items[position])
    }

    override fun disableCoin(position: Int) {
        disable(items[position])
    }

    override fun saveChanges() {
        interactor.saveWallets((items + popularItems).mapNotNull { it.wallet })
    }

    //  InteractorDelegate

    override fun didSaveChanges() {
        router.close()
    }

    //  Private

    private fun enable(item: ManageWalletItem) {
        val coin = item.coin
        val wallet = interactor.wallet(coin)
        if (wallet == null) {
            currentItem = item
            val accountType = getPredefinedAccountType(coin.type.defaultAccountType)
            accountType?.let {
                view?.showNoAccountDialog(coin, it)
            }
        } else {
            item.wallet = wallet
        }
    }

    private fun getPredefinedAccountType(coinDefaultAccountType: DefaultAccountType): IPredefinedAccountType? {
        return interactor.predefinedAccountTypes.firstOrNull {
            it.defaultAccountType == coinDefaultAccountType
        }
    }

    private fun disable(item: ManageWalletItem) {
        item.wallet = null
    }

    private fun viewItem(item: ManageWalletItem): ManageWalletViewItem {
        return ManageWalletViewItem(item.coin, enabled = item.wallet != null)
    }
}

data class ManageWalletItem(val coin: Coin, var wallet: Wallet?)
data class ManageWalletViewItem(val coin: Coin, val enabled: Boolean)

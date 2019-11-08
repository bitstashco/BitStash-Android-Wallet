package io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.adapters

import com.google.gson.JsonObject
import io.horizontalsystems.bitstashwallet.R
import io.horizontalsystems.bitstashwallet.core.App
import io.horizontalsystems.bitstashwallet.core.factories.FeeCoinProvider
import io.horizontalsystems.bitstashwallet.entities.*
import io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule
import java.math.BigDecimal

class FullTransactionBinanceAdapter(private val provider: FullTransactionInfoModule.BinanceProvider,
                                    private val feeCoinProvider: FeeCoinProvider,
                                    private val coin: Coin)
    : FullTransactionInfoModule.Adapter {

    override fun convert(json: JsonObject): FullTransactionRecord {
        val data = provider.convert(json)
        val sections = mutableListOf<FullTransactionSection>()

        mutableListOf<FullTransactionItem>().let { section ->
            section.add(FullTransactionItem(R.string.FullInfo_Block, value = data.blockHeight, icon = FullTransactionIcon.BLOCK))
            sections.add(FullTransactionSection(section))
        }

        mutableListOf<FullTransactionItem>().let { section ->

            val amount = data.value.divide(BigDecimal.TEN.pow(8))
            val feeCoin = feeCoinProvider.feeCoinData(coin)?.first ?: coin

            section.add(FullTransactionItem(R.string.FullInfo_Fee, value = App.numberFormatter.format(CoinValue(feeCoin, data.fee))))
            section.add(FullTransactionItem(R.string.FullInfoEth_Amount, value = App.numberFormatter.format(CoinValue(coin, amount))))
            sections.add(FullTransactionSection(section))
        }

        mutableListOf<FullTransactionItem>().let { section ->

            section.add(FullTransactionItem(R.string.FullInfo_From, value = data.from, clickable = true, icon = FullTransactionIcon.PERSON))
            section.add(FullTransactionItem(R.string.FullInfo_To, value = data.to, clickable = true, icon = FullTransactionIcon.PERSON))

            sections.add(FullTransactionSection(section))
        }

        return FullTransactionRecord(provider.name, sections)
    }
}

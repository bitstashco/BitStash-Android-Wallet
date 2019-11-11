package app.odapplications.bitstashwallet.entities

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.util.*

@Parcelize
class Wallet(val coin: Coin, val account: Account, val syncMode: SyncMode?) : Parcelable {
    override fun equals(other: Any?): Boolean {
        if (other is Wallet) {
            return coin == other.coin && account == other.account
        }

        return super.equals(other)
    }

    override fun hashCode(): Int {
        return Objects.hash(coin, account)
    }
}

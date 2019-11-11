package app.odapplications.bitstashwallet.core.storage

import androidx.room.Entity
import app.odapplications.bitstashwallet.entities.AccountType
import app.odapplications.bitstashwallet.entities.SyncMode

class SecretString(val value: String)

class SecretList(val list: List<String>)

@Entity(primaryKeys = ["id"])
data class AccountRecord(var id: String,
                         var name: String,
                         var type: String,
                         var isBackedUp: Boolean,
                         var syncMode: SyncMode?,
                         var words: SecretList?,
                         var derivation: AccountType.Derivation?,
                         var salt: SecretString?,
                         var key: SecretString?,
                         var eosAccount: String?) {

    var deleted = false

    override fun equals(other: Any?): Boolean {
        if (other is AccountRecord) {
            return id == other.id
        }

        return false
    }

    override fun hashCode(): Int {
        return id.hashCode()
    }

}

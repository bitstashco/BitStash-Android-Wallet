package app.odapplications.bitstashwallet.core.factories

import app.odapplications.bitstashwallet.core.IAccountFactory
import app.odapplications.bitstashwallet.entities.Account
import app.odapplications.bitstashwallet.entities.AccountType
import app.odapplications.bitstashwallet.entities.SyncMode
import java.util.*

class AccountFactory : IAccountFactory {

    override fun account(type: AccountType, backedUp: Boolean, defaultSyncMode: SyncMode?): Account {
        val id = UUID.randomUUID().toString()

        return Account(
                id = id,
                name = id,
                type = type,
                isBackedUp = backedUp,
                defaultSyncMode = defaultSyncMode
        )
    }
}

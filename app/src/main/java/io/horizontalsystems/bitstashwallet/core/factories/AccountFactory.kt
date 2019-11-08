package io.horizontalsystems.bitstashwallet.core.factories

import io.horizontalsystems.bitstashwallet.core.IAccountFactory
import io.horizontalsystems.bitstashwallet.entities.Account
import io.horizontalsystems.bitstashwallet.entities.AccountType
import io.horizontalsystems.bitstashwallet.entities.SyncMode
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

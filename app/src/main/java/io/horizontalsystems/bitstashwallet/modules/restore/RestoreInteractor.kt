package io.horizontalsystems.bitstashwallet.modules.restore

import io.horizontalsystems.bitstashwallet.core.IAccountCreator
import io.horizontalsystems.bitstashwallet.entities.AccountType
import io.horizontalsystems.bitstashwallet.entities.SyncMode

class RestoreInteractor(private val accountCreator: IAccountCreator) : RestoreModule.Interactor {

    var delegate: RestoreModule.InteractorDelegate? = null

    override fun restore(accountType: AccountType, syncMode: SyncMode?) {
        try {
            accountCreator.createRestoredAccount(accountType, syncMode, createDefaultWallets = true)
            delegate?.didRestore()
        } catch (e: Exception) {
            delegate?.didFailRestore(e)
        }
    }
}

package app.odapplications.bitstashwallet.modules.restore

import app.odapplications.bitstashwallet.core.IAccountCreator
import app.odapplications.bitstashwallet.entities.AccountType
import app.odapplications.bitstashwallet.entities.SyncMode

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

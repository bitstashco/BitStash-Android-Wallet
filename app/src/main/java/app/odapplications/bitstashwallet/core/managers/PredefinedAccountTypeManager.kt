package app.odapplications.bitstashwallet.core.managers

import app.odapplications.bitstashwallet.core.*
import app.odapplications.bitstashwallet.entities.Account
import app.odapplications.bitstashwallet.entities.AccountType

class PredefinedAccountTypeManager(private val appConfigProvider: IAppConfigProvider, private val accountManager: IAccountManager, private val accountCreator: IAccountCreator)
    : IPredefinedAccountTypeManager {

    override val allTypes: List<IPredefinedAccountType>
        get() = appConfigProvider.predefinedAccountTypes

    override fun account(predefinedAccountType: IPredefinedAccountType): Account? {
        return accountManager.accounts.find { predefinedAccountType.supports(it.type) }
    }

    override fun createAccount(predefinedAccountType: IPredefinedAccountType): Account? {
        return accountCreator.createNewAccount(predefinedAccountType.defaultAccountType, createDefaultWallets = true)
    }

    override fun predefinedAccountType(type: AccountType): IPredefinedAccountType? {
        return allTypes.firstOrNull { it.supports(type) }
    }
}

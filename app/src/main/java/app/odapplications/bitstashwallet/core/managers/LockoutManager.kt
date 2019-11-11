package app.odapplications.bitstashwallet.core.managers

import app.odapplications.bitstashwallet.core.ILocalStorage
import app.odapplications.bitstashwallet.core.ILockoutManager
import app.odapplications.bitstashwallet.core.ILockoutUntilDateFactory
import app.odapplications.bitstashwallet.core.IUptimeProvider
import app.odapplications.bitstashwallet.entities.LockoutState

class LockoutManager(
        private val localStorage: ILocalStorage,
        private val uptimeProvider: IUptimeProvider,
        private val lockoutUntilDateFactory: ILockoutUntilDateFactory) : ILockoutManager {

    private val lockoutThreshold = 5

    override val currentState: LockoutState
        get() {
            val failedAttempts = localStorage.failedAttempts
            val attemptsLeft = failedAttempts?.let {
                if (it >= lockoutThreshold) {
                    val lockoutUptime = localStorage.lockoutUptime ?: uptimeProvider.uptime
                    lockoutUntilDateFactory.lockoutUntilDate(it, lockoutUptime, uptimeProvider.uptime)?.let { untilDate ->
                        return LockoutState.Locked(untilDate)
                    }
                }

                //calculate attempts left
                val attempts = lockoutThreshold - it
                if (attempts < 1) 1 else attempts
            }

            return LockoutState.Unlocked(attemptsLeft != null)
        }

    override fun didFailUnlock() {
        val attempts = (localStorage.failedAttempts ?: 0) + 1
        if (attempts >= lockoutThreshold) {
            localStorage.lockoutUptime = uptimeProvider.uptime
        }
        localStorage.failedAttempts = attempts
    }

    override fun dropFailedAttempts() {
        localStorage.failedAttempts = null
    }

}

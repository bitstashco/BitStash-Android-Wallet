package io.horizontalsystems.bitstashwallet.core.security

import android.security.keystore.KeyGenParameterSpec
import android.security.keystore.KeyPermanentlyInvalidatedException
import android.security.keystore.KeyProperties
import android.security.keystore.UserNotAuthenticatedException
import io.horizontalsystems.bitstashwallet.core.IKeyProvider
import io.horizontalsystems.bitstashwallet.core.IKeyStoreManager
import org.jetbrains.anko.getStackTraceString
import java.security.KeyStore
import java.security.KeyStoreException
import java.security.UnrecoverableKeyException
import java.util.logging.Logger
import javax.crypto.KeyGenerator
import javax.crypto.SecretKey

class KeyStoreManager(private val keyAlias: String) : IKeyStoreManager, IKeyProvider {
    private val ANDROID_KEY_STORE = "AndroidKeyStore"
    private val BLOCK_MODE = KeyProperties.BLOCK_MODE_CBC
    private val PADDING = KeyProperties.ENCRYPTION_PADDING_PKCS7
    private val AUTH_DURATION_SEC = 86400 //24 hours in seconds (24x60x60)

    private val keyStore: KeyStore

    private val logger = Logger.getLogger("KeyStoreManager")

    init {
        keyStore = KeyStore.getInstance(ANDROID_KEY_STORE)
        keyStore.load(null)
    }

    override val isKeyInvalidated: Boolean
        get() = try {
            validateKey()
            false
        } catch (ex: Exception) {
            logger.warning("isKeyInvalidated: \n ${ex.getStackTraceString()}")
            ex is KeyPermanentlyInvalidatedException || ex is UnrecoverableKeyException
        }

    override val isUserNotAuthenticated: Boolean
        get() = try {
            validateKey()
            false
        } catch (ex: Exception) {
            logger.warning("isUserNotAuthenticated: \n ${ex.getStackTraceString()}")
            ex is UserNotAuthenticatedException
        }

    override fun getKey(): SecretKey {
        val key = keyStore.getKey(keyAlias, null) ?: createKey()
        return key as SecretKey
    }

    override fun removeKey() {
        try {
            keyStore.deleteEntry(keyAlias)
        } catch (ex: KeyStoreException) {
            logger.warning("removeKey: \n ${ex.getStackTraceString()}")
        }
    }

    private fun createKey(): SecretKey {
        val keyGenerator = KeyGenerator.getInstance(KeyProperties.KEY_ALGORITHM_AES, ANDROID_KEY_STORE)

        keyGenerator.init(KeyGenParameterSpec.Builder(keyAlias, KeyProperties.PURPOSE_ENCRYPT or KeyProperties.PURPOSE_DECRYPT)
                .setBlockModes(BLOCK_MODE)
                .setUserAuthenticationRequired(true)
                .setUserAuthenticationValidityDurationSeconds(AUTH_DURATION_SEC)
                .setRandomizedEncryptionRequired(false)
                .setEncryptionPaddings(PADDING)
                .build())

        return keyGenerator.generateKey()
    }

    private fun validateKey() {
        CipherWrapper().encrypt("abc", getKey())
    }

}

package app.odapplications.bitstashwallet.entities

import androidx.room.Entity
import androidx.room.ForeignKey
import app.odapplications.bitstashwallet.core.storage.AccountRecord

@Entity(primaryKeys = ["coinCode", "accountId"],
        foreignKeys = [ForeignKey(
                entity = AccountRecord::class,
                parentColumns = ["id"],
                childColumns = ["accountId"],
                onUpdate = ForeignKey.CASCADE,
                onDelete = ForeignKey.CASCADE,
                deferred = true)
        ])

data class EnabledWallet(
        val coinCode: String,
        val accountId: String,
        val walletOrder: Int? = null,
        val syncMode: SyncMode? = null
)

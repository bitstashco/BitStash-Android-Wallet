package app.odapplications.bitstashwallet.modules.backup.words

import app.odapplications.bitstashwallet.core.IRandomProvider
import java.util.*

class BackupWordsInteractor(private val indexesProvider: IRandomProvider, private val words: Array<String>)
    : BackupWordsModule.IInteractor {

    var delegate: BackupWordsModule.IInteractorDelegate? = null

    override fun getConfirmationIndices(): List<Int> {
        return indexesProvider.getRandomIndexes(2)
    }

    override fun validate(confirmationWords: HashMap<Int, String>) {
        for ((index, word) in confirmationWords) {
            if (words[index - 1] != word.trim()) {
                delegate?.onValidateFailure()
                return
            }
        }

        delegate?.onValidateSuccess()
    }
}

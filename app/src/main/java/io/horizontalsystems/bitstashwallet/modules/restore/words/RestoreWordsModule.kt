package io.horizontalsystems.bitstashwallet.modules.restore.words

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import io.horizontalsystems.bitstashwallet.core.App
import io.horizontalsystems.bitstashwallet.core.utils.ModuleField

object RestoreWordsModule {

    interface View {
        fun showError(error: Int)
    }

    interface ViewDelegate {
        val words: List<String>
        fun onChange(position: Int, word: String)
        fun onDone()
    }

    interface Interactor {
        fun validate(words: List<String>)
    }

    interface InteractorDelegate {
        fun didValidate()
        fun didFailToValidate(exception: Exception)
    }

    interface Router {
        fun notifyRestored()
        fun startSyncModeModule()
    }

    fun startForResult(context: AppCompatActivity, wordsCount: Int, requestCode: Int) {
        val intent = Intent(context, RestoreWordsActivity::class.java).apply {
            putExtra(ModuleField.WORDS_COUNT, wordsCount)
        }

        context.startActivityForResult(intent, requestCode)
    }

    fun init(view: RestoreWordsViewModel, router: Router, wordsCount: Int) {
        val interactor = RestoreWordsInteractor(App.wordsManager)
        val showSyncMode = wordsCount == 12
        val presenter = RestoreWordsPresenter(wordsCount, showSyncMode, interactor, router)

        view.delegate = presenter
        presenter.view = view
        interactor.delegate = presenter
    }
}

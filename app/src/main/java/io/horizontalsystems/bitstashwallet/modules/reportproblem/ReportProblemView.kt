package io.horizontalsystems.bitstashwallet.modules.reportproblem

import androidx.lifecycle.MutableLiveData
import io.horizontalsystems.bitstashwallet.SingleLiveEvent

class ReportProblemView : ReportProblemModule.IView {
    val emailLiveData = MutableLiveData<String>()
    val telegramGroupLiveData = MutableLiveData<String>()
    val showCopiedLiveEvent = SingleLiveEvent<Unit>()

    override fun setEmail(email: String) {
        emailLiveData.postValue(email)
    }

    override fun setTelegramGroup(group: String) {
        telegramGroupLiveData.postValue(group)
    }

    override fun showCopied() {
        showCopiedLiveEvent.call()
    }
}

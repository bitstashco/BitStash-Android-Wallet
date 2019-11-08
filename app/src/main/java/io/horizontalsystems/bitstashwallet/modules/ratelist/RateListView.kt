package io.horizontalsystems.bitstashwallet.modules.ratelist

import androidx.lifecycle.MutableLiveData
import io.horizontalsystems.bitstashwallet.SingleLiveEvent
import java.util.*

class RateListView : RateListModule.IView {

    var currentDate = MutableLiveData<Date>()
    val reloadLiveEvent = SingleLiveEvent<Void>()


    override fun showCurrentDate(currentDate: Date) {
        this.currentDate.postValue(currentDate)
    }

    override fun reload() {
        reloadLiveEvent.call()
    }
}

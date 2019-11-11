package app.odapplications.bitstashwallet.modules.lockscreen

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import app.odapplications.bitstashwallet.BaseActivity
import app.odapplications.bitstashwallet.R
import app.odapplications.bitstashwallet.modules.pin.PinFragment
import app.odapplications.bitstashwallet.modules.pin.PinInteractionType
import app.odapplications.bitstashwallet.modules.pin.PinModule
import app.odapplications.bitstashwallet.modules.ratelist.RatesFragment
import kotlinx.android.synthetic.main.activity_lockscreen.*


class LockScreenActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lockscreen)

        val pinFragment = PinFragment().apply {
            arguments = intent.extras
        }

        val fragments = listOf(pinFragment, RatesFragment())

        viewPager.adapter = LockScreenViewPagerAdapter(fragments, supportFragmentManager)

        circleIndicator.setViewPager(viewPager)
    }

    override fun onBackPressed() {
        finishAffinity()
    }

    companion object {

        fun startForResult(context: AppCompatActivity, requestCode: Int = 0) {
            val intent = Intent(context, LockScreenActivity::class.java)
            intent.putExtra(PinModule.keyInteractionType, PinInteractionType.UNLOCK)
            intent.putExtra(PinModule.keyShowCancel, false)

            context.startActivityForResult(intent, requestCode)
        }
    }
}

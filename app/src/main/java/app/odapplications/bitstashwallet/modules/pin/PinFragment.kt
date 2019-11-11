package app.odapplications.bitstashwallet.modules.pin

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.biometric.BiometricPrompt
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import app.odapplications.bitstashwallet.R
import app.odapplications.bitstashwallet.modules.main.MainModule
import app.odapplications.bitstashwallet.modules.pin.edit.EditPinModule
import app.odapplications.bitstashwallet.modules.pin.edit.EditPinPresenter
import app.odapplications.bitstashwallet.modules.pin.edit.EditPinRouter
import app.odapplications.bitstashwallet.modules.pin.set.SetPinModule
import app.odapplications.bitstashwallet.modules.pin.set.SetPinPresenter
import app.odapplications.bitstashwallet.modules.pin.set.SetPinRouter
import app.odapplications.bitstashwallet.modules.pin.unlock.UnlockPinModule
import app.odapplications.bitstashwallet.modules.pin.unlock.UnlockPinPresenter
import app.odapplications.bitstashwallet.modules.pin.unlock.UnlockPinRouter
import app.odapplications.bitstashwallet.ui.extensions.*
import app.odapplications.bitstashwallet.viewHelpers.DateHelper
import app.odapplications.bitstashwallet.viewHelpers.HudHelper
import kotlinx.android.synthetic.main.fragment_pin.*
import java.util.concurrent.Executor


class PinFragment : Fragment(), NumPadItemsAdapter.Listener {

    private val interactionType: PinInteractionType by lazy {
        arguments?.getSerializable(PinModule.keyInteractionType) as? PinInteractionType
                ?: PinInteractionType.UNLOCK
    }

    private val showCancelButton: Boolean by lazy {
        arguments?.getBoolean(PinModule.keyShowCancel) ?: true
    }

    private lateinit var pinView: PinView
    private lateinit var viewDelegate: PinModule.IViewDelegate
    private lateinit var layoutManager: LinearLayoutManager
    private lateinit var pinPagesAdapter: PinPagesAdapter
    private lateinit var numpadAdapter: NumPadItemsAdapter
    private val executor = Executor { command -> command.run() }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_pin, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        pinPagesAdapter = PinPagesAdapter()
        context?.let {
            layoutManager = SmoothLinearLayoutManager(it, LinearLayoutManager.HORIZONTAL, false)
            pinPagesRecyclerView.layoutManager = layoutManager
        }
        val snapHelper = PagerSnapHelper()
        snapHelper.attachToRecyclerView(pinPagesRecyclerView)
        pinPagesRecyclerView.adapter = pinPagesAdapter

        pinPagesRecyclerView.setOnTouchListener { _, _ -> true /*disable RecyclerView scroll*/ }

        when (interactionType) {
            PinInteractionType.UNLOCK -> {
                val unlockPresenter = ViewModelProviders.of(this, UnlockPinModule.Factory(showCancelButton)).get(UnlockPinPresenter::class.java)
                val unlockRouter = unlockPresenter.router as UnlockPinRouter
                pinView = unlockPresenter.view as PinView
                viewDelegate = unlockPresenter

                unlockRouter.dismissWithSuccess.observe(viewLifecycleOwner, Observer { dismissWithSuccess() })
            }
            PinInteractionType.EDIT_PIN -> {
                val editPresenter = ViewModelProviders.of(this, EditPinModule.Factory()).get(EditPinPresenter::class.java)
                val editRouter = editPresenter.router as EditPinRouter
                pinView = editPresenter.view as PinView
                viewDelegate = editPresenter

                editRouter.dismissWithSuccess.observe(viewLifecycleOwner, Observer { dismissWithSuccess() })
            }
            PinInteractionType.SET_PIN -> {
                val setPresenter = ViewModelProviders.of(this, SetPinModule.Factory()).get(SetPinPresenter::class.java)
                val setRouter = setPresenter.router as SetPinRouter
                pinView = setPresenter.view as PinView
                viewDelegate = setPresenter

                setRouter.dismissWithSuccess.observe(viewLifecycleOwner, Observer { dismissWithSuccess() })

                setRouter.navigateToMain.observe(viewLifecycleOwner, Observer {
                    context?.let { ctx -> MainModule.start(ctx) }
                    activity?.finish()
                })
            }
        }

        viewDelegate.viewDidLoad()

        numpadAdapter = NumPadItemsAdapter(this, NumPadItemType.FINGER)

        numPadItemsRecyclerView.adapter = numpadAdapter
        numPadItemsRecyclerView.layoutManager = GridLayoutManager(context, 3)

        observeData()
    }

    private fun dismissWithSuccess() {
        activity?.setResult(PinModule.RESULT_OK)
        activity?.finish()
    }

    private fun observeData() {
        pinView.hideToolbar.observe(viewLifecycleOwner, Observer {
            shadowlessToolbar.visibility = View.GONE
        })

        pinView.showBackButton.observe(viewLifecycleOwner, Observer {
            shadowlessToolbar.bind(null, TopMenuItem(R.drawable.back, onClick = { activity?.onBackPressed() }))
        })

        pinView.title.observe(viewLifecycleOwner, Observer {
            shadowlessToolbar.bindTitle(getString(it))
        })

        pinView.addPages.observe(viewLifecycleOwner, Observer {
            pinPagesAdapter.pinPages.addAll(it)
            pinPagesAdapter.notifyDataSetChanged()
        })

        pinView.showPageAtIndex.observe(viewLifecycleOwner, Observer {
            Handler().postDelayed({
                pinPagesRecyclerView.smoothScrollToPosition(it)
                viewDelegate.resetPin()
                pinPagesAdapter.setEnteredPinLength(layoutManager.findFirstVisibleItemPosition(), 0)
            }, 300)
        })

        pinView.updateTopTextForPage.observe(viewLifecycleOwner, Observer { (error, pageIndex) ->
            pinPagesAdapter.updateTopTextForPage(error, pageIndex)
        })

        pinView.showError.observe(viewLifecycleOwner, Observer {
            HudHelper.showErrorMessage(it)
        })

        pinView.fillPinCircles.observe(viewLifecycleOwner, Observer { (length, pageIndex) ->
            pinPagesAdapter.setEnteredPinLength(pageIndex, length)
        })

        pinView.showFingerprintInput.observe(viewLifecycleOwner, Observer {
            showFingerprintDialog(it)
            numpadAdapter.showFingerPrintButton = true
        })

        pinView.resetCirclesWithShakeAndDelayForPage.observe(viewLifecycleOwner, Observer { pageIndex ->
            pinPagesAdapter.shakePageIndex = pageIndex
            pinPagesAdapter.notifyDataSetChanged()
            Handler().postDelayed({
                pinPagesAdapter.shakePageIndex = null
                viewDelegate.resetPin()
                pinPagesAdapter.setEnteredPinLength(pageIndex, 0)
            }, 300)
        })

        pinView.showPinInput.observe(viewLifecycleOwner, Observer {
            pinUnlock.visibility = View.VISIBLE
            pinUnlockBlocked.visibility = View.GONE
        })

        pinView.showLockedView.observe(viewLifecycleOwner, Observer {
            pinUnlock.visibility = View.GONE
            pinUnlockBlocked.visibility = View.VISIBLE
            val time = DateHelper.formatDate(it, "HH:mm:ss")
            blockedScreenMessage.text = getString(R.string.UnlockPin_WalletDisabledUntil, time)
        })
    }

    override fun onItemClick(item: NumPadItem) {
        when (item.type) {
            NumPadItemType.NUMBER -> viewDelegate.onEnter(item.number.toString(), layoutManager.findFirstVisibleItemPosition())
            NumPadItemType.DELETE -> viewDelegate.onDelete(layoutManager.findFirstVisibleItemPosition())
            NumPadItemType.FINGER -> viewDelegate.showFingerprintUnlock()
        }
    }

    private fun showFingerprintDialog(cryptoObject: BiometricPrompt.CryptoObject) {
        val promptInfo = BiometricPrompt.PromptInfo.Builder()
                .setTitle(getString(R.string.Fingerprint_DialogTitle))
                .setNegativeButtonText(getString(R.string.Button_Cancel))
                .build()

        val biometricPrompt = BiometricPrompt(this, executor, object : BiometricPrompt.AuthenticationCallback() {
            override fun onAuthenticationSucceeded(result: BiometricPrompt.AuthenticationResult) {
                super.onAuthenticationSucceeded(result)
                viewDelegate.onFingerprintUnlock()
            }
        })

        biometricPrompt.authenticate(promptInfo, cryptoObject)
    }

}


class PinPage(var topText: TopText, var enteredDigitsLength: Int = 0)

class PinPagesAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var pinPages = mutableListOf<PinPage>()
    var shakePageIndex: Int? = null

    fun updateTopTextForPage(text: TopText, pageIndex: Int) {
        pinPages[pageIndex].topText = text
        notifyDataSetChanged()
    }

    fun setEnteredPinLength(pageIndex: Int, enteredLength: Int) {
        pinPages[pageIndex].enteredDigitsLength = enteredLength
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return PinPageViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.view_pin_page, parent, false))
    }

    override fun getItemCount() = pinPages.count()

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is PinPageViewHolder) {
            holder.bind(pinPages[position], shakePageIndex == position)//, { listener.onChangeProvider(numPadItems[position]) }, listener.isBiometricEnabled())
        }
    }

}

class PinPageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private var txtTitle: TextView = itemView.findViewById(R.id.txtTitle)
    private var bigError: TextView = itemView.findViewById(R.id.txtBigError)
    private var txtDesc: TextView = itemView.findViewById(R.id.txtDescription)
    private var smallError: TextView = itemView.findViewById(R.id.txtSmallError)
    private var pinCirclesWrapper = itemView.findViewById<ConstraintLayout>(R.id.pinCirclesWrapper)

    private var imgPinMask1: ImageView = itemView.findViewById(R.id.imgPinMaskOne)
    private var imgPinMask2: ImageView = itemView.findViewById(R.id.imgPinMaskTwo)
    private var imgPinMask3: ImageView = itemView.findViewById(R.id.imgPinMaskThree)
    private var imgPinMask4: ImageView = itemView.findViewById(R.id.imgPinMaskFour)
    private var imgPinMask5: ImageView = itemView.findViewById(R.id.imgPinMaskFive)
    private var imgPinMask6: ImageView = itemView.findViewById(R.id.imgPinMaskSix)

    fun bind(pinPage: PinPage, shake: Boolean) {
        bigError.visibility = View.GONE
        txtDesc.visibility = View.GONE
        txtTitle.visibility = View.GONE
        smallError.visibility = View.GONE

        when (pinPage.topText) {
            is TopText.Title -> {
                txtTitle.visibility = View.VISIBLE
                txtTitle.setText(pinPage.topText.text)
            }
            is TopText.BigError -> {
                bigError.visibility = View.VISIBLE
                bigError.setText(pinPage.topText.text)
            }
            is TopText.Description -> {
                txtDesc.visibility = View.VISIBLE
                txtDesc.setText(pinPage.topText.text)
            }
            is TopText.SmallError -> {
                smallError.visibility = View.VISIBLE
                smallError.setText(pinPage.topText.text)
            }
        }

        updatePinCircles(pinPage.enteredDigitsLength)
        if (shake) {
            val shakeAnim = AnimationUtils.loadAnimation(itemView.context, R.anim.shake_pin_circles)
            pinCirclesWrapper.startAnimation(shakeAnim)
        }
    }

    private fun updatePinCircles(length: Int) {
        val filledCircle = R.drawable.ic_pin_ellipse_yellow
        val emptyCircle = R.drawable.ic_pin_ellipse

        imgPinMask1.setImageResource(if (length > 0) filledCircle else emptyCircle)
        imgPinMask2.setImageResource(if (length > 1) filledCircle else emptyCircle)
        imgPinMask3.setImageResource(if (length > 2) filledCircle else emptyCircle)
        imgPinMask4.setImageResource(if (length > 3) filledCircle else emptyCircle)
        imgPinMask5.setImageResource(if (length > 4) filledCircle else emptyCircle)
        imgPinMask6.setImageResource(if (length > 5) filledCircle else emptyCircle)
    }
}

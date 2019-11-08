package io.horizontalsystems.bitstashwallet.modules.settings.main

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CompoundButton
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import io.horizontalsystems.bitstashwallet.BuildConfig
import io.horizontalsystems.bitstashwallet.R
import io.horizontalsystems.bitstashwallet.modules.main.MainActivity
import io.horizontalsystems.bitstashwallet.modules.main.MainModule
import io.horizontalsystems.bitstashwallet.modules.managecoins.ManageWalletsModule
import io.horizontalsystems.bitstashwallet.modules.notifications.NotificationsModule
import io.horizontalsystems.bitstashwallet.modules.reportproblem.ReportProblemModule
import io.horizontalsystems.bitstashwallet.modules.settings.AboutSettingsActivity
import io.horizontalsystems.bitstashwallet.modules.settings.basecurrency.BaseCurrencySettingsModule
import io.horizontalsystems.bitstashwallet.modules.settings.language.LanguageSettingsModule
import io.horizontalsystems.bitstashwallet.modules.settings.security.SecuritySettingsModule
import kotlinx.android.synthetic.main.fragment_settings.*

class MainSettingsFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_settings, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val presenter = ViewModelProviders.of(this, MainSettingsModule.Factory()).get(MainSettingsPresenter::class.java)
        val presenterView = presenter.view as MainSettingsView
        val router = presenter.router as MainSettingsRouter

        bindViewListeners(presenter)

        subscribeToViewEvents(presenterView, presenter)

        subscribeToRouterEvents(router)

        presenter.viewDidLoad()
    }

    private fun bindViewListeners(presenter: MainSettingsPresenter) {
        securityCenter.setOnClickListener { presenter.didTapSecurity() }

        notifications.setOnClickListener { presenter.didTapNotifications() }

        manageCoins.setOnClickListener { presenter.didManageCoins() }

        baseCurrency.setOnClickListener { presenter.didTapBaseCurrency() }

        language.setOnClickListener { presenter.didTapLanguage() }

        lightMode.setOnClickListener { lightMode.switchToggle() }

        about.setOnClickListener { presenter.didTapAbout() }

        report.setOnClickListener { presenter.didTapReportProblem() }

        shareApp.setOnClickListener { presenter.didTapTellFriends() }

        companyLogo.setOnClickListener { presenter.didTapCompanyLogo() }
    }

    private fun subscribeToViewEvents(presenterView: MainSettingsView, presenter: MainSettingsPresenter) {
        presenterView.baseCurrency.observe(viewLifecycleOwner, Observer { currency ->
            currency?.let {
                baseCurrency.selectedValue = it
            }
        })

        presenterView.backedUp.observe(viewLifecycleOwner, Observer { wordListBackedUp ->
            securityCenter.setInfoBadgeVisibility(!wordListBackedUp)
        })

        presenterView.language.observe(viewLifecycleOwner, Observer { languageCode ->
            languageCode?.let {
                language.selectedValue = it
            }
        })

        presenterView.lightMode.observe(viewLifecycleOwner, Observer { lightModeValue ->
            lightModeValue?.let {
                lightMode.apply {
                    switchIsChecked = it

                    switchOnCheckedChangeListener = CompoundButton.OnCheckedChangeListener { _, isChecked ->
                        presenter.didSwitchLightMode(isChecked)
                    }
                }
            }
        })

        presenterView.appVersion.observe(viewLifecycleOwner, Observer { version ->
            version?.let {
                var appVersion = getString(R.string.Settings_InfoTitleWithVersion, it)
                if (getString(R.string.is_release) == "false") {
                    appVersion = "$appVersion (${BuildConfig.VERSION_CODE})"
                }
                appName.text = appVersion
            }
        })
    }

    private fun subscribeToRouterEvents(router: MainSettingsRouter) {
        router.showBaseCurrencySettingsLiveEvent.observe(viewLifecycleOwner, Observer {
            context?.let { context -> BaseCurrencySettingsModule.start(context) }
        })

        router.showLanguageSettingsLiveEvent.observe(viewLifecycleOwner, Observer {
            context?.let { context -> LanguageSettingsModule.start(context) }
        })

        router.showAboutLiveEvent.observe(viewLifecycleOwner, Observer {
            activity?.let {
                AboutSettingsActivity.start(it)
            }
        })

        router.showNotificationsLiveEvent.observe(viewLifecycleOwner, Observer {
            activity?.let {
                NotificationsModule.start(it)
            }
        })

        router.showReportProblemLiveEvent.observe(viewLifecycleOwner, Observer {
            activity?.let {
                ReportProblemModule.start(it)
            }
        })

        router.showSecuritySettingsLiveEvent.observe(viewLifecycleOwner, Observer {
            context?.let {
                SecuritySettingsModule.start(it)
            }
        })

        router.showManageCoinsLiveEvent.observe(viewLifecycleOwner, Observer {
            context?.let { ManageWalletsModule.start(it) }
        })

        router.openLinkLiveEvent.observe(viewLifecycleOwner, Observer { link ->
            val uri = Uri.parse(link)
            val intent = Intent(Intent.ACTION_VIEW, uri)
            activity?.startActivity(intent)
        })

        router.shareAppLiveEvent.observe(viewLifecycleOwner, Observer { appWebPageLink ->
            val shareMessage = getString(R.string.SettingsShare_Text) + "\n" + appWebPageLink + "\n"
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage)
            startActivity(Intent.createChooser(shareIntent, getString(R.string.SettingsShare_Title)))
        })

        router.reloadAppLiveEvent.observe(viewLifecycleOwner, Observer {
            activity?.let { MainModule.startAsNewTask(it, MainActivity.SETTINGS_TAB_POSITION) }
        })
    }
}

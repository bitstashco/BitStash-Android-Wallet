package io.horizontalsystems.bitstashwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/App;", "Landroid/app/Application;", "()V", "onCreate", "", "Companion", "app_devMainnetMasterDebug"})
public final class App extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    public static android.content.SharedPreferences preferences;
    @org.jetbrains.annotations.NotNull()
    public static io.horizontalsystems.bitstashwallet.core.managers.FeeRateProvider feeRateProvider;
    @org.jetbrains.annotations.NotNull()
    public static io.horizontalsystems.bitstashwallet.core.ISecuredStorage secureStorage;
    @org.jetbrains.annotations.NotNull()
    public static io.horizontalsystems.bitstashwallet.core.ILocalStorage localStorage;
    @org.jetbrains.annotations.NotNull()
    public static io.horizontalsystems.bitstashwallet.core.IKeyStoreManager keyStoreManager;
    @org.jetbrains.annotations.NotNull()
    public static io.horizontalsystems.bitstashwallet.core.IKeyProvider keyProvider;
    @org.jetbrains.annotations.NotNull()
    public static io.horizontalsystems.bitstashwallet.core.IEncryptionManager encryptionManager;
    @org.jetbrains.annotations.NotNull()
    public static io.horizontalsystems.bitstashwallet.core.managers.WordsManager wordsManager;
    @org.jetbrains.annotations.NotNull()
    public static io.horizontalsystems.bitstashwallet.core.IRandomProvider randomManager;
    @org.jetbrains.annotations.NotNull()
    public static io.horizontalsystems.bitstashwallet.core.INetworkManager networkManager;
    @org.jetbrains.annotations.NotNull()
    public static io.horizontalsystems.bitstashwallet.core.ICurrencyManager currencyManager;
    @org.jetbrains.annotations.NotNull()
    public static io.horizontalsystems.bitstashwallet.core.managers.BackgroundManager backgroundManager;
    @org.jetbrains.annotations.NotNull()
    public static io.horizontalsystems.bitstashwallet.core.ILanguageManager languageManager;
    @org.jetbrains.annotations.NotNull()
    public static io.horizontalsystems.bitstashwallet.core.ISystemInfoManager systemInfoManager;
    @org.jetbrains.annotations.NotNull()
    public static io.horizontalsystems.bitstashwallet.core.IPinManager pinManager;
    @org.jetbrains.annotations.NotNull()
    public static io.horizontalsystems.bitstashwallet.core.ILockManager lockManager;
    @org.jetbrains.annotations.NotNull()
    public static io.horizontalsystems.bitstashwallet.core.managers.KeyStoreChangeListener keyStoreChangeListener;
    @org.jetbrains.annotations.NotNull()
    public static io.horizontalsystems.bitstashwallet.core.IAppConfigProvider appConfigProvider;
    @org.jetbrains.annotations.NotNull()
    public static io.horizontalsystems.bitstashwallet.core.IAdapterManager adapterManager;
    @org.jetbrains.annotations.NotNull()
    public static io.horizontalsystems.bitstashwallet.core.IWalletManager walletManager;
    @org.jetbrains.annotations.NotNull()
    public static io.horizontalsystems.bitstashwallet.core.IWalletFactory walletFactory;
    @org.jetbrains.annotations.NotNull()
    public static io.horizontalsystems.bitstashwallet.core.IWalletStorage walletStorage;
    @org.jetbrains.annotations.NotNull()
    public static io.horizontalsystems.bitstashwallet.core.IAccountManager accountManager;
    @org.jetbrains.annotations.NotNull()
    public static io.horizontalsystems.bitstashwallet.core.IBackupManager backupManager;
    @org.jetbrains.annotations.NotNull()
    public static io.horizontalsystems.bitstashwallet.core.IAccountCreator accountCreator;
    @org.jetbrains.annotations.NotNull()
    public static io.horizontalsystems.bitstashwallet.core.IPredefinedAccountTypeManager predefinedAccountTypeManager;
    @org.jetbrains.annotations.NotNull()
    public static io.horizontalsystems.bitstashwallet.core.managers.DefaultWalletCreator defaultWalletCreator;
    @org.jetbrains.annotations.NotNull()
    public static io.horizontalsystems.bitstashwallet.core.managers.WalletRemover walletRemover;
    @org.jetbrains.annotations.NotNull()
    public static io.horizontalsystems.bitstashwallet.core.managers.RateSyncScheduler rateSyncScheduler;
    @org.jetbrains.annotations.NotNull()
    public static io.horizontalsystems.bitstashwallet.core.managers.RateManager rateManager;
    @org.jetbrains.annotations.NotNull()
    public static io.horizontalsystems.bitstashwallet.core.IRateStatsManager rateStatsManager;
    @org.jetbrains.annotations.NotNull()
    public static io.horizontalsystems.bitstashwallet.core.managers.ConnectivityManager connectivityManager;
    @org.jetbrains.annotations.NotNull()
    public static io.horizontalsystems.bitstashwallet.core.storage.AppDatabase appDatabase;
    @org.jetbrains.annotations.NotNull()
    public static io.horizontalsystems.bitstashwallet.core.IRateStorage rateStorage;
    @org.jetbrains.annotations.NotNull()
    public static io.horizontalsystems.bitstashwallet.core.IAccountsStorage accountsStorage;
    @org.jetbrains.annotations.NotNull()
    public static io.horizontalsystems.bitstashwallet.core.IPriceAlertsStorage priceAlertsStorage;
    @org.jetbrains.annotations.NotNull()
    public static io.horizontalsystems.bitstashwallet.core.managers.PriceAlertManager priceAlertManager;
    @org.jetbrains.annotations.NotNull()
    public static io.horizontalsystems.bitstashwallet.core.IEnabledWalletStorage enabledWalletsStorage;
    @org.jetbrains.annotations.NotNull()
    public static io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoFactory transactionInfoFactory;
    @org.jetbrains.annotations.NotNull()
    public static io.horizontalsystems.bitstashwallet.core.managers.TransactionDataProviderManager transactionDataProviderManager;
    @org.jetbrains.annotations.NotNull()
    public static io.horizontalsystems.bitstashwallet.core.IEthereumKitManager ethereumKitManager;
    @org.jetbrains.annotations.NotNull()
    public static io.horizontalsystems.bitstashwallet.core.IEosKitManager eosKitManager;
    @org.jetbrains.annotations.NotNull()
    public static io.horizontalsystems.bitstashwallet.core.managers.BinanceKitManager binanceKitManager;
    @org.jetbrains.annotations.NotNull()
    public static io.horizontalsystems.bitstashwallet.core.IAppNumberFormatter numberFormatter;
    @org.jetbrains.annotations.NotNull()
    public static io.horizontalsystems.bitstashwallet.core.factories.AddressParserFactory addressParserFactory;
    @org.jetbrains.annotations.NotNull()
    public static io.horizontalsystems.bitstashwallet.core.factories.FeeCoinProvider feeCoinProvider;
    @org.jetbrains.annotations.NotNull()
    public static io.horizontalsystems.bitstashwallet.core.IPriceAlertHandler priceAlertHandler;
    @org.jetbrains.annotations.NotNull()
    public static io.horizontalsystems.bitstashwallet.core.IBackgroundPriceAlertManager backgroundPriceAlertManager;
    @org.jetbrains.annotations.NotNull()
    public static io.horizontalsystems.bitstashwallet.core.IEmojiHelper emojiHelper;
    @org.jetbrains.annotations.NotNull()
    public static io.horizontalsystems.bitstashwallet.core.INotificationManager notificationManager;
    @org.jetbrains.annotations.NotNull()
    public static io.horizontalsystems.bitstashwallet.core.INotificationFactory notificationFactory;
    @org.jetbrains.annotations.NotNull()
    private static io.horizontalsystems.bitstashwallet.core.App instance;
    private static long lastExitDate;
    public static final io.horizontalsystems.bitstashwallet.core.App.Companion Companion = null;
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public App() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00b4\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\'\u001a\u00020(X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020.X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00103\u001a\u000204X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u00109\u001a\u00020:X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001a\u0010?\u001a\u00020@X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001a\u0010E\u001a\u00020FX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001a\u0010K\u001a\u00020LX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001a\u0010Q\u001a\u00020RX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u001a\u0010W\u001a\u00020XX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u001a\u0010]\u001a\u00020^X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u001a\u0010c\u001a\u00020dX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u001a\u0010i\u001a\u00020jX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\u001a\u0010o\u001a\u00020pX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\u001a\u0010u\u001a\u00020vX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\u001b\u0010{\u001a\u00020|X\u0086.\u00a2\u0006\u000f\n\u0000\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R,\u0010\u0083\u0001\u001a\u00030\u0082\u00012\b\u0010\u0081\u0001\u001a\u00030\u0082\u0001@BX\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R \u0010\u0088\u0001\u001a\u00030\u0089\u0001X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R \u0010\u008e\u0001\u001a\u00030\u008f\u0001X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R \u0010\u0094\u0001\u001a\u00030\u0095\u0001X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R \u0010\u009a\u0001\u001a\u00030\u009b\u0001X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R \u0010\u00a0\u0001\u001a\u00030\u00a1\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00a2\u0001\u0010\u00a3\u0001\"\u0006\b\u00a4\u0001\u0010\u00a5\u0001R \u0010\u00a6\u0001\u001a\u00030\u00a7\u0001X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00a8\u0001\u0010\u00a9\u0001\"\u0006\b\u00aa\u0001\u0010\u00ab\u0001R \u0010\u00ac\u0001\u001a\u00030\u00ad\u0001X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00ae\u0001\u0010\u00af\u0001\"\u0006\b\u00b0\u0001\u0010\u00b1\u0001R \u0010\u00b2\u0001\u001a\u00030\u00b3\u0001X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00b4\u0001\u0010\u00b5\u0001\"\u0006\b\u00b6\u0001\u0010\u00b7\u0001R \u0010\u00b8\u0001\u001a\u00030\u00b9\u0001X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00ba\u0001\u0010\u00bb\u0001\"\u0006\b\u00bc\u0001\u0010\u00bd\u0001R \u0010\u00be\u0001\u001a\u00030\u00bf\u0001X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00c0\u0001\u0010\u00c1\u0001\"\u0006\b\u00c2\u0001\u0010\u00c3\u0001R \u0010\u00c4\u0001\u001a\u00030\u00c5\u0001X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00c6\u0001\u0010\u00c7\u0001\"\u0006\b\u00c8\u0001\u0010\u00c9\u0001R \u0010\u00ca\u0001\u001a\u00030\u00cb\u0001X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00cc\u0001\u0010\u00cd\u0001\"\u0006\b\u00ce\u0001\u0010\u00cf\u0001R \u0010\u00d0\u0001\u001a\u00030\u00d1\u0001X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00d2\u0001\u0010\u00d3\u0001\"\u0006\b\u00d4\u0001\u0010\u00d5\u0001R \u0010\u00d6\u0001\u001a\u00030\u00d7\u0001X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00d8\u0001\u0010\u00d9\u0001\"\u0006\b\u00da\u0001\u0010\u00db\u0001R \u0010\u00dc\u0001\u001a\u00030\u00dd\u0001X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00de\u0001\u0010\u00df\u0001\"\u0006\b\u00e0\u0001\u0010\u00e1\u0001R \u0010\u00e2\u0001\u001a\u00030\u00e3\u0001X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00e4\u0001\u0010\u00e5\u0001\"\u0006\b\u00e6\u0001\u0010\u00e7\u0001R \u0010\u00e8\u0001\u001a\u00030\u00e9\u0001X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00ea\u0001\u0010\u00eb\u0001\"\u0006\b\u00ec\u0001\u0010\u00ed\u0001R \u0010\u00ee\u0001\u001a\u00030\u00ef\u0001X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00f0\u0001\u0010\u00f1\u0001\"\u0006\b\u00f2\u0001\u0010\u00f3\u0001R \u0010\u00f4\u0001\u001a\u00030\u00f5\u0001X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00f6\u0001\u0010\u00f7\u0001\"\u0006\b\u00f8\u0001\u0010\u00f9\u0001R \u0010\u00fa\u0001\u001a\u00030\u00fb\u0001X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00fc\u0001\u0010\u00fd\u0001\"\u0006\b\u00fe\u0001\u0010\u00ff\u0001R \u0010\u0080\u0002\u001a\u00030\u0081\u0002X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0082\u0002\u0010\u0083\u0002\"\u0006\b\u0084\u0002\u0010\u0085\u0002R \u0010\u0086\u0002\u001a\u00030\u0087\u0002X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0088\u0002\u0010\u0089\u0002\"\u0006\b\u008a\u0002\u0010\u008b\u0002R \u0010\u008c\u0002\u001a\u00030\u008d\u0002X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u008e\u0002\u0010\u008f\u0002\"\u0006\b\u0090\u0002\u0010\u0091\u0002R \u0010\u0092\u0002\u001a\u00030\u0093\u0002X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0094\u0002\u0010\u0095\u0002\"\u0006\b\u0096\u0002\u0010\u0097\u0002R \u0010\u0098\u0002\u001a\u00030\u0099\u0002X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u009a\u0002\u0010\u009b\u0002\"\u0006\b\u009c\u0002\u0010\u009d\u0002R \u0010\u009e\u0002\u001a\u00030\u009f\u0002X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00a0\u0002\u0010\u00a1\u0002\"\u0006\b\u00a2\u0002\u0010\u00a3\u0002R \u0010\u00a4\u0002\u001a\u00030\u00a5\u0002X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00a6\u0002\u0010\u00a7\u0002\"\u0006\b\u00a8\u0002\u0010\u00a9\u0002R \u0010\u00aa\u0002\u001a\u00030\u00ab\u0002X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00ac\u0002\u0010\u00ad\u0002\"\u0006\b\u00ae\u0002\u0010\u00af\u0002R \u0010\u00b0\u0002\u001a\u00030\u00b1\u0002X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00b2\u0002\u0010\u00b3\u0002\"\u0006\b\u00b4\u0002\u0010\u00b5\u0002R \u0010\u00b6\u0002\u001a\u00030\u00b7\u0002X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00b8\u0002\u0010\u00b9\u0002\"\u0006\b\u00ba\u0002\u0010\u00bb\u0002R \u0010\u00bc\u0002\u001a\u00030\u00bd\u0002X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00be\u0002\u0010\u00bf\u0002\"\u0006\b\u00c0\u0002\u0010\u00c1\u0002\u00a8\u0006\u00c2\u0002"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/App$Companion;", "", "()V", "accountCreator", "Lio/horizontalsystems/bitstashwallet/core/IAccountCreator;", "getAccountCreator", "()Lio/horizontalsystems/bitstashwallet/core/IAccountCreator;", "setAccountCreator", "(Lio/horizontalsystems/bitstashwallet/core/IAccountCreator;)V", "accountManager", "Lio/horizontalsystems/bitstashwallet/core/IAccountManager;", "getAccountManager", "()Lio/horizontalsystems/bitstashwallet/core/IAccountManager;", "setAccountManager", "(Lio/horizontalsystems/bitstashwallet/core/IAccountManager;)V", "accountsStorage", "Lio/horizontalsystems/bitstashwallet/core/IAccountsStorage;", "getAccountsStorage", "()Lio/horizontalsystems/bitstashwallet/core/IAccountsStorage;", "setAccountsStorage", "(Lio/horizontalsystems/bitstashwallet/core/IAccountsStorage;)V", "adapterManager", "Lio/horizontalsystems/bitstashwallet/core/IAdapterManager;", "getAdapterManager", "()Lio/horizontalsystems/bitstashwallet/core/IAdapterManager;", "setAdapterManager", "(Lio/horizontalsystems/bitstashwallet/core/IAdapterManager;)V", "addressParserFactory", "Lio/horizontalsystems/bitstashwallet/core/factories/AddressParserFactory;", "getAddressParserFactory", "()Lio/horizontalsystems/bitstashwallet/core/factories/AddressParserFactory;", "setAddressParserFactory", "(Lio/horizontalsystems/bitstashwallet/core/factories/AddressParserFactory;)V", "appConfigProvider", "Lio/horizontalsystems/bitstashwallet/core/IAppConfigProvider;", "getAppConfigProvider", "()Lio/horizontalsystems/bitstashwallet/core/IAppConfigProvider;", "setAppConfigProvider", "(Lio/horizontalsystems/bitstashwallet/core/IAppConfigProvider;)V", "appDatabase", "Lio/horizontalsystems/bitstashwallet/core/storage/AppDatabase;", "getAppDatabase", "()Lio/horizontalsystems/bitstashwallet/core/storage/AppDatabase;", "setAppDatabase", "(Lio/horizontalsystems/bitstashwallet/core/storage/AppDatabase;)V", "backgroundManager", "Lio/horizontalsystems/bitstashwallet/core/managers/BackgroundManager;", "getBackgroundManager", "()Lio/horizontalsystems/bitstashwallet/core/managers/BackgroundManager;", "setBackgroundManager", "(Lio/horizontalsystems/bitstashwallet/core/managers/BackgroundManager;)V", "backgroundPriceAlertManager", "Lio/horizontalsystems/bitstashwallet/core/IBackgroundPriceAlertManager;", "getBackgroundPriceAlertManager", "()Lio/horizontalsystems/bitstashwallet/core/IBackgroundPriceAlertManager;", "setBackgroundPriceAlertManager", "(Lio/horizontalsystems/bitstashwallet/core/IBackgroundPriceAlertManager;)V", "backupManager", "Lio/horizontalsystems/bitstashwallet/core/IBackupManager;", "getBackupManager", "()Lio/horizontalsystems/bitstashwallet/core/IBackupManager;", "setBackupManager", "(Lio/horizontalsystems/bitstashwallet/core/IBackupManager;)V", "binanceKitManager", "Lio/horizontalsystems/bitstashwallet/core/managers/BinanceKitManager;", "getBinanceKitManager", "()Lio/horizontalsystems/bitstashwallet/core/managers/BinanceKitManager;", "setBinanceKitManager", "(Lio/horizontalsystems/bitstashwallet/core/managers/BinanceKitManager;)V", "connectivityManager", "Lio/horizontalsystems/bitstashwallet/core/managers/ConnectivityManager;", "getConnectivityManager", "()Lio/horizontalsystems/bitstashwallet/core/managers/ConnectivityManager;", "setConnectivityManager", "(Lio/horizontalsystems/bitstashwallet/core/managers/ConnectivityManager;)V", "currencyManager", "Lio/horizontalsystems/bitstashwallet/core/ICurrencyManager;", "getCurrencyManager", "()Lio/horizontalsystems/bitstashwallet/core/ICurrencyManager;", "setCurrencyManager", "(Lio/horizontalsystems/bitstashwallet/core/ICurrencyManager;)V", "defaultWalletCreator", "Lio/horizontalsystems/bitstashwallet/core/managers/DefaultWalletCreator;", "getDefaultWalletCreator", "()Lio/horizontalsystems/bitstashwallet/core/managers/DefaultWalletCreator;", "setDefaultWalletCreator", "(Lio/horizontalsystems/bitstashwallet/core/managers/DefaultWalletCreator;)V", "emojiHelper", "Lio/horizontalsystems/bitstashwallet/core/IEmojiHelper;", "getEmojiHelper", "()Lio/horizontalsystems/bitstashwallet/core/IEmojiHelper;", "setEmojiHelper", "(Lio/horizontalsystems/bitstashwallet/core/IEmojiHelper;)V", "enabledWalletsStorage", "Lio/horizontalsystems/bitstashwallet/core/IEnabledWalletStorage;", "getEnabledWalletsStorage", "()Lio/horizontalsystems/bitstashwallet/core/IEnabledWalletStorage;", "setEnabledWalletsStorage", "(Lio/horizontalsystems/bitstashwallet/core/IEnabledWalletStorage;)V", "encryptionManager", "Lio/horizontalsystems/bitstashwallet/core/IEncryptionManager;", "getEncryptionManager", "()Lio/horizontalsystems/bitstashwallet/core/IEncryptionManager;", "setEncryptionManager", "(Lio/horizontalsystems/bitstashwallet/core/IEncryptionManager;)V", "eosKitManager", "Lio/horizontalsystems/bitstashwallet/core/IEosKitManager;", "getEosKitManager", "()Lio/horizontalsystems/bitstashwallet/core/IEosKitManager;", "setEosKitManager", "(Lio/horizontalsystems/bitstashwallet/core/IEosKitManager;)V", "ethereumKitManager", "Lio/horizontalsystems/bitstashwallet/core/IEthereumKitManager;", "getEthereumKitManager", "()Lio/horizontalsystems/bitstashwallet/core/IEthereumKitManager;", "setEthereumKitManager", "(Lio/horizontalsystems/bitstashwallet/core/IEthereumKitManager;)V", "feeCoinProvider", "Lio/horizontalsystems/bitstashwallet/core/factories/FeeCoinProvider;", "getFeeCoinProvider", "()Lio/horizontalsystems/bitstashwallet/core/factories/FeeCoinProvider;", "setFeeCoinProvider", "(Lio/horizontalsystems/bitstashwallet/core/factories/FeeCoinProvider;)V", "feeRateProvider", "Lio/horizontalsystems/bitstashwallet/core/managers/FeeRateProvider;", "getFeeRateProvider", "()Lio/horizontalsystems/bitstashwallet/core/managers/FeeRateProvider;", "setFeeRateProvider", "(Lio/horizontalsystems/bitstashwallet/core/managers/FeeRateProvider;)V", "<set-?>", "Lio/horizontalsystems/bitstashwallet/core/App;", "instance", "getInstance", "()Lio/horizontalsystems/bitstashwallet/core/App;", "setInstance", "(Lio/horizontalsystems/bitstashwallet/core/App;)V", "keyProvider", "Lio/horizontalsystems/bitstashwallet/core/IKeyProvider;", "getKeyProvider", "()Lio/horizontalsystems/bitstashwallet/core/IKeyProvider;", "setKeyProvider", "(Lio/horizontalsystems/bitstashwallet/core/IKeyProvider;)V", "keyStoreChangeListener", "Lio/horizontalsystems/bitstashwallet/core/managers/KeyStoreChangeListener;", "getKeyStoreChangeListener", "()Lio/horizontalsystems/bitstashwallet/core/managers/KeyStoreChangeListener;", "setKeyStoreChangeListener", "(Lio/horizontalsystems/bitstashwallet/core/managers/KeyStoreChangeListener;)V", "keyStoreManager", "Lio/horizontalsystems/bitstashwallet/core/IKeyStoreManager;", "getKeyStoreManager", "()Lio/horizontalsystems/bitstashwallet/core/IKeyStoreManager;", "setKeyStoreManager", "(Lio/horizontalsystems/bitstashwallet/core/IKeyStoreManager;)V", "languageManager", "Lio/horizontalsystems/bitstashwallet/core/ILanguageManager;", "getLanguageManager", "()Lio/horizontalsystems/bitstashwallet/core/ILanguageManager;", "setLanguageManager", "(Lio/horizontalsystems/bitstashwallet/core/ILanguageManager;)V", "lastExitDate", "", "getLastExitDate", "()J", "setLastExitDate", "(J)V", "localStorage", "Lio/horizontalsystems/bitstashwallet/core/ILocalStorage;", "getLocalStorage", "()Lio/horizontalsystems/bitstashwallet/core/ILocalStorage;", "setLocalStorage", "(Lio/horizontalsystems/bitstashwallet/core/ILocalStorage;)V", "lockManager", "Lio/horizontalsystems/bitstashwallet/core/ILockManager;", "getLockManager", "()Lio/horizontalsystems/bitstashwallet/core/ILockManager;", "setLockManager", "(Lio/horizontalsystems/bitstashwallet/core/ILockManager;)V", "networkManager", "Lio/horizontalsystems/bitstashwallet/core/INetworkManager;", "getNetworkManager", "()Lio/horizontalsystems/bitstashwallet/core/INetworkManager;", "setNetworkManager", "(Lio/horizontalsystems/bitstashwallet/core/INetworkManager;)V", "notificationFactory", "Lio/horizontalsystems/bitstashwallet/core/INotificationFactory;", "getNotificationFactory", "()Lio/horizontalsystems/bitstashwallet/core/INotificationFactory;", "setNotificationFactory", "(Lio/horizontalsystems/bitstashwallet/core/INotificationFactory;)V", "notificationManager", "Lio/horizontalsystems/bitstashwallet/core/INotificationManager;", "getNotificationManager", "()Lio/horizontalsystems/bitstashwallet/core/INotificationManager;", "setNotificationManager", "(Lio/horizontalsystems/bitstashwallet/core/INotificationManager;)V", "numberFormatter", "Lio/horizontalsystems/bitstashwallet/core/IAppNumberFormatter;", "getNumberFormatter", "()Lio/horizontalsystems/bitstashwallet/core/IAppNumberFormatter;", "setNumberFormatter", "(Lio/horizontalsystems/bitstashwallet/core/IAppNumberFormatter;)V", "pinManager", "Lio/horizontalsystems/bitstashwallet/core/IPinManager;", "getPinManager", "()Lio/horizontalsystems/bitstashwallet/core/IPinManager;", "setPinManager", "(Lio/horizontalsystems/bitstashwallet/core/IPinManager;)V", "predefinedAccountTypeManager", "Lio/horizontalsystems/bitstashwallet/core/IPredefinedAccountTypeManager;", "getPredefinedAccountTypeManager", "()Lio/horizontalsystems/bitstashwallet/core/IPredefinedAccountTypeManager;", "setPredefinedAccountTypeManager", "(Lio/horizontalsystems/bitstashwallet/core/IPredefinedAccountTypeManager;)V", "preferences", "Landroid/content/SharedPreferences;", "getPreferences", "()Landroid/content/SharedPreferences;", "setPreferences", "(Landroid/content/SharedPreferences;)V", "priceAlertHandler", "Lio/horizontalsystems/bitstashwallet/core/IPriceAlertHandler;", "getPriceAlertHandler", "()Lio/horizontalsystems/bitstashwallet/core/IPriceAlertHandler;", "setPriceAlertHandler", "(Lio/horizontalsystems/bitstashwallet/core/IPriceAlertHandler;)V", "priceAlertManager", "Lio/horizontalsystems/bitstashwallet/core/managers/PriceAlertManager;", "getPriceAlertManager", "()Lio/horizontalsystems/bitstashwallet/core/managers/PriceAlertManager;", "setPriceAlertManager", "(Lio/horizontalsystems/bitstashwallet/core/managers/PriceAlertManager;)V", "priceAlertsStorage", "Lio/horizontalsystems/bitstashwallet/core/IPriceAlertsStorage;", "getPriceAlertsStorage", "()Lio/horizontalsystems/bitstashwallet/core/IPriceAlertsStorage;", "setPriceAlertsStorage", "(Lio/horizontalsystems/bitstashwallet/core/IPriceAlertsStorage;)V", "randomManager", "Lio/horizontalsystems/bitstashwallet/core/IRandomProvider;", "getRandomManager", "()Lio/horizontalsystems/bitstashwallet/core/IRandomProvider;", "setRandomManager", "(Lio/horizontalsystems/bitstashwallet/core/IRandomProvider;)V", "rateManager", "Lio/horizontalsystems/bitstashwallet/core/managers/RateManager;", "getRateManager", "()Lio/horizontalsystems/bitstashwallet/core/managers/RateManager;", "setRateManager", "(Lio/horizontalsystems/bitstashwallet/core/managers/RateManager;)V", "rateStatsManager", "Lio/horizontalsystems/bitstashwallet/core/IRateStatsManager;", "getRateStatsManager", "()Lio/horizontalsystems/bitstashwallet/core/IRateStatsManager;", "setRateStatsManager", "(Lio/horizontalsystems/bitstashwallet/core/IRateStatsManager;)V", "rateStorage", "Lio/horizontalsystems/bitstashwallet/core/IRateStorage;", "getRateStorage", "()Lio/horizontalsystems/bitstashwallet/core/IRateStorage;", "setRateStorage", "(Lio/horizontalsystems/bitstashwallet/core/IRateStorage;)V", "rateSyncScheduler", "Lio/horizontalsystems/bitstashwallet/core/managers/RateSyncScheduler;", "getRateSyncScheduler", "()Lio/horizontalsystems/bitstashwallet/core/managers/RateSyncScheduler;", "setRateSyncScheduler", "(Lio/horizontalsystems/bitstashwallet/core/managers/RateSyncScheduler;)V", "secureStorage", "Lio/horizontalsystems/bitstashwallet/core/ISecuredStorage;", "getSecureStorage", "()Lio/horizontalsystems/bitstashwallet/core/ISecuredStorage;", "setSecureStorage", "(Lio/horizontalsystems/bitstashwallet/core/ISecuredStorage;)V", "systemInfoManager", "Lio/horizontalsystems/bitstashwallet/core/ISystemInfoManager;", "getSystemInfoManager", "()Lio/horizontalsystems/bitstashwallet/core/ISystemInfoManager;", "setSystemInfoManager", "(Lio/horizontalsystems/bitstashwallet/core/ISystemInfoManager;)V", "transactionDataProviderManager", "Lio/horizontalsystems/bitstashwallet/core/managers/TransactionDataProviderManager;", "getTransactionDataProviderManager", "()Lio/horizontalsystems/bitstashwallet/core/managers/TransactionDataProviderManager;", "setTransactionDataProviderManager", "(Lio/horizontalsystems/bitstashwallet/core/managers/TransactionDataProviderManager;)V", "transactionInfoFactory", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoFactory;", "getTransactionInfoFactory", "()Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoFactory;", "setTransactionInfoFactory", "(Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoFactory;)V", "walletFactory", "Lio/horizontalsystems/bitstashwallet/core/IWalletFactory;", "getWalletFactory", "()Lio/horizontalsystems/bitstashwallet/core/IWalletFactory;", "setWalletFactory", "(Lio/horizontalsystems/bitstashwallet/core/IWalletFactory;)V", "walletManager", "Lio/horizontalsystems/bitstashwallet/core/IWalletManager;", "getWalletManager", "()Lio/horizontalsystems/bitstashwallet/core/IWalletManager;", "setWalletManager", "(Lio/horizontalsystems/bitstashwallet/core/IWalletManager;)V", "walletRemover", "Lio/horizontalsystems/bitstashwallet/core/managers/WalletRemover;", "getWalletRemover", "()Lio/horizontalsystems/bitstashwallet/core/managers/WalletRemover;", "setWalletRemover", "(Lio/horizontalsystems/bitstashwallet/core/managers/WalletRemover;)V", "walletStorage", "Lio/horizontalsystems/bitstashwallet/core/IWalletStorage;", "getWalletStorage", "()Lio/horizontalsystems/bitstashwallet/core/IWalletStorage;", "setWalletStorage", "(Lio/horizontalsystems/bitstashwallet/core/IWalletStorage;)V", "wordsManager", "Lio/horizontalsystems/bitstashwallet/core/managers/WordsManager;", "getWordsManager", "()Lio/horizontalsystems/bitstashwallet/core/managers/WordsManager;", "setWordsManager", "(Lio/horizontalsystems/bitstashwallet/core/managers/WordsManager;)V", "app_devMainnetMasterDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.SharedPreferences getPreferences() {
            return null;
        }
        
        public final void setPreferences(@org.jetbrains.annotations.NotNull()
        android.content.SharedPreferences p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.core.managers.FeeRateProvider getFeeRateProvider() {
            return null;
        }
        
        public final void setFeeRateProvider(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.managers.FeeRateProvider p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.core.ISecuredStorage getSecureStorage() {
            return null;
        }
        
        public final void setSecureStorage(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.ISecuredStorage p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.core.ILocalStorage getLocalStorage() {
            return null;
        }
        
        public final void setLocalStorage(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.ILocalStorage p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.core.IKeyStoreManager getKeyStoreManager() {
            return null;
        }
        
        public final void setKeyStoreManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.IKeyStoreManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.core.IKeyProvider getKeyProvider() {
            return null;
        }
        
        public final void setKeyProvider(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.IKeyProvider p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.core.IEncryptionManager getEncryptionManager() {
            return null;
        }
        
        public final void setEncryptionManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.IEncryptionManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.core.managers.WordsManager getWordsManager() {
            return null;
        }
        
        public final void setWordsManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.managers.WordsManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.core.IRandomProvider getRandomManager() {
            return null;
        }
        
        public final void setRandomManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.IRandomProvider p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.core.INetworkManager getNetworkManager() {
            return null;
        }
        
        public final void setNetworkManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.INetworkManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.core.ICurrencyManager getCurrencyManager() {
            return null;
        }
        
        public final void setCurrencyManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.ICurrencyManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.core.managers.BackgroundManager getBackgroundManager() {
            return null;
        }
        
        public final void setBackgroundManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.managers.BackgroundManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.core.ILanguageManager getLanguageManager() {
            return null;
        }
        
        public final void setLanguageManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.ILanguageManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.core.ISystemInfoManager getSystemInfoManager() {
            return null;
        }
        
        public final void setSystemInfoManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.ISystemInfoManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.core.IPinManager getPinManager() {
            return null;
        }
        
        public final void setPinManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.IPinManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.core.ILockManager getLockManager() {
            return null;
        }
        
        public final void setLockManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.ILockManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.core.managers.KeyStoreChangeListener getKeyStoreChangeListener() {
            return null;
        }
        
        public final void setKeyStoreChangeListener(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.managers.KeyStoreChangeListener p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.core.IAppConfigProvider getAppConfigProvider() {
            return null;
        }
        
        public final void setAppConfigProvider(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.IAppConfigProvider p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.core.IAdapterManager getAdapterManager() {
            return null;
        }
        
        public final void setAdapterManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.IAdapterManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.core.IWalletManager getWalletManager() {
            return null;
        }
        
        public final void setWalletManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.IWalletManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.core.IWalletFactory getWalletFactory() {
            return null;
        }
        
        public final void setWalletFactory(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.IWalletFactory p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.core.IWalletStorage getWalletStorage() {
            return null;
        }
        
        public final void setWalletStorage(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.IWalletStorage p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.core.IAccountManager getAccountManager() {
            return null;
        }
        
        public final void setAccountManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.IAccountManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.core.IBackupManager getBackupManager() {
            return null;
        }
        
        public final void setBackupManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.IBackupManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.core.IAccountCreator getAccountCreator() {
            return null;
        }
        
        public final void setAccountCreator(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.IAccountCreator p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.core.IPredefinedAccountTypeManager getPredefinedAccountTypeManager() {
            return null;
        }
        
        public final void setPredefinedAccountTypeManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.IPredefinedAccountTypeManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.core.managers.DefaultWalletCreator getDefaultWalletCreator() {
            return null;
        }
        
        public final void setDefaultWalletCreator(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.managers.DefaultWalletCreator p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.core.managers.WalletRemover getWalletRemover() {
            return null;
        }
        
        public final void setWalletRemover(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.managers.WalletRemover p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.core.managers.RateSyncScheduler getRateSyncScheduler() {
            return null;
        }
        
        public final void setRateSyncScheduler(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.managers.RateSyncScheduler p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.core.managers.RateManager getRateManager() {
            return null;
        }
        
        public final void setRateManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.managers.RateManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.core.IRateStatsManager getRateStatsManager() {
            return null;
        }
        
        public final void setRateStatsManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.IRateStatsManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.core.managers.ConnectivityManager getConnectivityManager() {
            return null;
        }
        
        public final void setConnectivityManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.managers.ConnectivityManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.core.storage.AppDatabase getAppDatabase() {
            return null;
        }
        
        public final void setAppDatabase(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.storage.AppDatabase p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.core.IRateStorage getRateStorage() {
            return null;
        }
        
        public final void setRateStorage(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.IRateStorage p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.core.IAccountsStorage getAccountsStorage() {
            return null;
        }
        
        public final void setAccountsStorage(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.IAccountsStorage p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.core.IPriceAlertsStorage getPriceAlertsStorage() {
            return null;
        }
        
        public final void setPriceAlertsStorage(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.IPriceAlertsStorage p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.core.managers.PriceAlertManager getPriceAlertManager() {
            return null;
        }
        
        public final void setPriceAlertManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.managers.PriceAlertManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.core.IEnabledWalletStorage getEnabledWalletsStorage() {
            return null;
        }
        
        public final void setEnabledWalletsStorage(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.IEnabledWalletStorage p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoFactory getTransactionInfoFactory() {
            return null;
        }
        
        public final void setTransactionInfoFactory(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoFactory p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.core.managers.TransactionDataProviderManager getTransactionDataProviderManager() {
            return null;
        }
        
        public final void setTransactionDataProviderManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.managers.TransactionDataProviderManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.core.IEthereumKitManager getEthereumKitManager() {
            return null;
        }
        
        public final void setEthereumKitManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.IEthereumKitManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.core.IEosKitManager getEosKitManager() {
            return null;
        }
        
        public final void setEosKitManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.IEosKitManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.core.managers.BinanceKitManager getBinanceKitManager() {
            return null;
        }
        
        public final void setBinanceKitManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.managers.BinanceKitManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.core.IAppNumberFormatter getNumberFormatter() {
            return null;
        }
        
        public final void setNumberFormatter(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.IAppNumberFormatter p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.core.factories.AddressParserFactory getAddressParserFactory() {
            return null;
        }
        
        public final void setAddressParserFactory(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.factories.AddressParserFactory p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.core.factories.FeeCoinProvider getFeeCoinProvider() {
            return null;
        }
        
        public final void setFeeCoinProvider(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.factories.FeeCoinProvider p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.core.IPriceAlertHandler getPriceAlertHandler() {
            return null;
        }
        
        public final void setPriceAlertHandler(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.IPriceAlertHandler p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.core.IBackgroundPriceAlertManager getBackgroundPriceAlertManager() {
            return null;
        }
        
        public final void setBackgroundPriceAlertManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.IBackgroundPriceAlertManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.core.IEmojiHelper getEmojiHelper() {
            return null;
        }
        
        public final void setEmojiHelper(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.IEmojiHelper p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.core.INotificationManager getNotificationManager() {
            return null;
        }
        
        public final void setNotificationManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.INotificationManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.core.INotificationFactory getNotificationFactory() {
            return null;
        }
        
        public final void setNotificationFactory(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.INotificationFactory p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.core.App getInstance() {
            return null;
        }
        
        private final void setInstance(io.horizontalsystems.bitstashwallet.core.App p0) {
        }
        
        public final long getLastExitDate() {
            return 0L;
        }
        
        public final void setLastExitDate(long p0) {
        }
        
        private Companion() {
            super();
        }
    }
}
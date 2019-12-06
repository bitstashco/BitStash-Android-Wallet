package app.odapplications.bitstashwallet.modules.fulltransactioninfo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0010\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001fB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u001e\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n\u00a8\u0006 "}, d2 = {"Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule;", "", "()V", "init", "", "view", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoViewModel;", "router", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$Router;", "wallet", "Lapp/odapplications/bitstashwallet/entities/Wallet;", "transactionHash", "", "start", "activity", "Landroidx/fragment/app/FragmentActivity;", "Adapter", "BinanceProvider", "BitcoinForksProvider", "EosProvider", "EthereumForksProvider", "FullProvider", "Interactor", "InteractorDelegate", "Provider", "ProviderDelegate", "ProviderFactory", "Request", "Router", "State", "View", "ViewDelegate", "app_productionMainnetRelease"})
public final class FullTransactionInfoModule {
    public static final app.odapplications.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule INSTANCE = null;
    
    public final void init(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoViewModel view, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.Router router, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Wallet wallet, @org.jetbrains.annotations.NotNull()
    java.lang.String transactionHash) {
    }
    
    public final void start(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String transactionHash, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Wallet wallet) {
    }
    
    private FullTransactionInfoModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0018\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\tH&J\b\u0010\f\u001a\u00020\u0003H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\tH&J\b\u0010\u000e\u001a\u00020\u0003H&J\u0012\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\tH&J\b\u0010\u0011\u001a\u00020\u0003H&J\b\u0010\u0012\u001a\u00020\u0003H&\u00a8\u0006\u0013"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$View;", "", "hideError", "", "hideLoading", "openProviderSettings", "coin", "Lapp/odapplications/bitstashwallet/entities/Coin;", "transactionHash", "", "openUrl", "url", "reload", "share", "showCopied", "showError", "providerName", "showLoading", "showShareButton", "app_productionMainnetRelease"})
    public static abstract interface View {
        
        public abstract void reload();
        
        public abstract void showLoading();
        
        public abstract void hideLoading();
        
        public abstract void hideError();
        
        public abstract void showError(@org.jetbrains.annotations.Nullable()
        java.lang.String providerName);
        
        public abstract void showCopied();
        
        public abstract void openUrl(@org.jetbrains.annotations.NotNull()
        java.lang.String url);
        
        public abstract void openProviderSettings(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.Coin coin, @org.jetbrains.annotations.NotNull()
        java.lang.String transactionHash);
        
        public abstract void share(@org.jetbrains.annotations.NotNull()
        java.lang.String url);
        
        public abstract void showShareButton();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000bH&J\b\u0010\u0011\u001a\u00020\u0012H&J\b\u0010\u0013\u001a\u00020\u0012H&J\b\u0010\u0014\u001a\u00020\u0012H&J\b\u0010\u0015\u001a\u00020\u0012H&J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H&J\b\u0010\u0019\u001a\u00020\u0012H&J\b\u0010\u001a\u001a\u00020\u0012H&J\b\u0010\u001b\u001a\u00020\u0012H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001c"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$ViewDelegate;", "", "canShowTransactionInProviderSite", "", "getCanShowTransactionInProviderSite", "()Z", "providerName", "", "getProviderName", "()Ljava/lang/String;", "sectionCount", "", "getSectionCount", "()I", "getSection", "Lapp/odapplications/bitstashwallet/entities/FullTransactionSection;", "row", "onClear", "", "onRetryLoad", "onShare", "onTapChangeProvider", "onTapItem", "item", "Lapp/odapplications/bitstashwallet/entities/FullTransactionItem;", "onTapProvider", "onTapResource", "viewDidLoad", "app_productionMainnetRelease"})
    public static abstract interface ViewDelegate {
        
        public abstract void viewDidLoad();
        
        public abstract void onRetryLoad();
        
        public abstract boolean getCanShowTransactionInProviderSite();
        
        @org.jetbrains.annotations.Nullable()
        public abstract java.lang.String getProviderName();
        
        public abstract int getSectionCount();
        
        @org.jetbrains.annotations.Nullable()
        public abstract app.odapplications.bitstashwallet.entities.FullTransactionSection getSection(int row);
        
        public abstract void onTapItem(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.FullTransactionItem item);
        
        public abstract void onTapProvider();
        
        public abstract void onTapResource();
        
        public abstract void onTapChangeProvider();
        
        public abstract void onShare();
        
        public abstract void onClear();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0006H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u0006H&\u00a8\u0006\u000f"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$Interactor;", "", "clear", "", "copyToClipboard", "value", "", "didLoad", "retrieveTransactionInfo", "transactionHash", "updateProvider", "wallet", "Lapp/odapplications/bitstashwallet/entities/Wallet;", "url", "hash", "app_productionMainnetRelease"})
    public static abstract interface Interactor {
        
        public abstract void didLoad();
        
        public abstract void updateProvider(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.Wallet wallet);
        
        @org.jetbrains.annotations.Nullable()
        public abstract java.lang.String url(@org.jetbrains.annotations.NotNull()
        java.lang.String hash);
        
        public abstract void retrieveTransactionInfo(@org.jetbrains.annotations.NotNull()
        java.lang.String transactionHash);
        
        public abstract void copyToClipboard(@org.jetbrains.annotations.NotNull()
        java.lang.String value);
        
        public abstract void clear();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&\u00a8\u0006\u000b"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$InteractorDelegate;", "", "onError", "", "providerName", "", "onProviderChange", "onReceiveTransactionInfo", "transactionRecord", "Lapp/odapplications/bitstashwallet/entities/FullTransactionRecord;", "retryLoadInfo", "app_productionMainnetRelease"})
    public static abstract interface InteractorDelegate {
        
        public abstract void onProviderChange();
        
        public abstract void onReceiveTransactionInfo(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.FullTransactionRecord transactionRecord);
        
        public abstract void onError(@org.jetbrains.annotations.Nullable()
        java.lang.String providerName);
        
        public abstract void retryLoadInfo();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$Router;", "", "app_productionMainnetRelease"})
    public static abstract interface Router {
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H&J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0003H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\n"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$Provider;", "", "name", "", "getName", "()Ljava/lang/String;", "apiRequest", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$Request;", "hash", "url", "app_productionMainnetRelease"})
    public static abstract interface Provider {
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.lang.String getName();
        
        @org.jetbrains.annotations.Nullable()
        public abstract java.lang.String url(@org.jetbrains.annotations.NotNull()
        java.lang.String hash);
        
        @org.jetbrains.annotations.NotNull()
        public abstract app.odapplications.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.Request apiRequest(@org.jetbrains.annotations.NotNull()
        java.lang.String hash);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n\u00a8\u0006\u000b"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$Request;", "", "url", "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "GetRequest", "PostRequest", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$Request$GetRequest;", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$Request$PostRequest;", "app_productionMainnetRelease"})
    public static abstract class Request {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String url = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUrl() {
            return null;
        }
        
        private Request(java.lang.String url) {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$Request$GetRequest;", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$Request;", "url", "", "(Ljava/lang/String;)V", "app_productionMainnetRelease"})
        public static final class GetRequest extends app.odapplications.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.Request {
            
            public GetRequest(@org.jetbrains.annotations.NotNull()
            java.lang.String url) {
                super(null);
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$Request$PostRequest;", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$Request;", "url", "", "body", "", "", "(Ljava/lang/String;Ljava/util/Map;)V", "getBody", "()Ljava/util/Map;", "app_productionMainnetRelease"})
        public static final class PostRequest extends app.odapplications.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.Request {
            @org.jetbrains.annotations.NotNull()
            private final java.util.Map<java.lang.String, java.lang.Object> body = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.Map<java.lang.String, java.lang.Object> getBody() {
                return null;
            }
            
            public PostRequest(@org.jetbrains.annotations.NotNull()
            java.lang.String url, @org.jetbrains.annotations.NotNull()
            java.util.Map<java.lang.String, ? extends java.lang.Object> body) {
                super(null);
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\u0003H&J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\u0003H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\f"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$FullProvider;", "", "providerName", "", "getProviderName", "()Ljava/lang/String;", "retrieveTransactionInfo", "Lio/reactivex/Flowable;", "Lapp/odapplications/bitstashwallet/entities/FullTransactionRecord;", "transactionHash", "url", "hash", "app_productionMainnetRelease"})
    public static abstract interface FullProvider {
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.lang.String getProviderName();
        
        @org.jetbrains.annotations.Nullable()
        public abstract java.lang.String url(@org.jetbrains.annotations.NotNull()
        java.lang.String hash);
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.reactivex.Flowable<app.odapplications.bitstashwallet.entities.FullTransactionRecord> retrieveTransactionInfo(@org.jetbrains.annotations.NotNull()
        java.lang.String transactionHash);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$BitcoinForksProvider;", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$Provider;", "convert", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/providers/BitcoinResponse;", "json", "Lcom/google/gson/JsonObject;", "app_productionMainnetRelease"})
    public static abstract interface BitcoinForksProvider extends app.odapplications.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.Provider {
        
        @org.jetbrains.annotations.NotNull()
        public abstract app.odapplications.bitstashwallet.modules.fulltransactioninfo.providers.BitcoinResponse convert(@org.jetbrains.annotations.NotNull()
        com.google.gson.JsonObject json);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$EthereumForksProvider;", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$Provider;", "convert", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/providers/EthereumResponse;", "json", "Lcom/google/gson/JsonObject;", "app_productionMainnetRelease"})
    public static abstract interface EthereumForksProvider extends app.odapplications.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.Provider {
        
        @org.jetbrains.annotations.NotNull()
        public abstract app.odapplications.bitstashwallet.modules.fulltransactioninfo.providers.EthereumResponse convert(@org.jetbrains.annotations.NotNull()
        com.google.gson.JsonObject json);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$BinanceProvider;", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$Provider;", "convert", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/providers/BinanceResponse;", "json", "Lcom/google/gson/JsonObject;", "app_productionMainnetRelease"})
    public static abstract interface BinanceProvider extends app.odapplications.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.Provider {
        
        @org.jetbrains.annotations.NotNull()
        public abstract app.odapplications.bitstashwallet.modules.fulltransactioninfo.providers.BinanceResponse convert(@org.jetbrains.annotations.NotNull()
        com.google.gson.JsonObject json);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$EosProvider;", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$Provider;", "convert", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/providers/EosResponse;", "json", "Lcom/google/gson/JsonObject;", "eosAccount", "", "app_productionMainnetRelease"})
    public static abstract interface EosProvider extends app.odapplications.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.Provider {
        
        @org.jetbrains.annotations.NotNull()
        public abstract app.odapplications.bitstashwallet.modules.fulltransactioninfo.providers.EosResponse convert(@org.jetbrains.annotations.NotNull()
        com.google.gson.JsonObject json, @org.jetbrains.annotations.NotNull()
        java.lang.String eosAccount);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$Adapter;", "", "convert", "Lapp/odapplications/bitstashwallet/entities/FullTransactionRecord;", "json", "Lcom/google/gson/JsonObject;", "app_productionMainnetRelease"})
    public static abstract interface Adapter {
        
        @org.jetbrains.annotations.NotNull()
        public abstract app.odapplications.bitstashwallet.entities.FullTransactionRecord convert(@org.jetbrains.annotations.NotNull()
        com.google.gson.JsonObject json);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$ProviderFactory;", "", "providerFor", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$FullProvider;", "wallet", "Lapp/odapplications/bitstashwallet/entities/Wallet;", "app_productionMainnetRelease"})
    public static abstract interface ProviderFactory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract app.odapplications.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.FullProvider providerFor(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.Wallet wallet);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$ProviderDelegate;", "", "onReceiveTransactionInfo", "", "transactionRecord", "Lapp/odapplications/bitstashwallet/entities/FullTransactionRecord;", "app_productionMainnetRelease"})
    public static abstract interface ProviderDelegate {
        
        public abstract void onReceiveTransactionInfo(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.FullTransactionRecord transactionRecord);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$State;", "", "transactionHash", "", "getTransactionHash", "()Ljava/lang/String;", "transactionRecord", "Lapp/odapplications/bitstashwallet/entities/FullTransactionRecord;", "getTransactionRecord", "()Lapp/odapplications/bitstashwallet/entities/FullTransactionRecord;", "setTransactionRecord", "(Lapp/odapplications/bitstashwallet/entities/FullTransactionRecord;)V", "wallet", "Lapp/odapplications/bitstashwallet/entities/Wallet;", "getWallet", "()Lapp/odapplications/bitstashwallet/entities/Wallet;", "app_productionMainnetRelease"})
    public static abstract interface State {
        
        @org.jetbrains.annotations.NotNull()
        public abstract app.odapplications.bitstashwallet.entities.Wallet getWallet();
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.lang.String getTransactionHash();
        
        @org.jetbrains.annotations.Nullable()
        public abstract app.odapplications.bitstashwallet.entities.FullTransactionRecord getTransactionRecord();
        
        public abstract void setTransactionRecord(@org.jetbrains.annotations.Nullable()
        app.odapplications.bitstashwallet.entities.FullTransactionRecord p0);
    }
}
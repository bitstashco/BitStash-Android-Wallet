package app.odapplications.bitstashwallet.modules.fulltransactioninfo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0012\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020\u0017H\u0016J\b\u0010#\u001a\u00020$H\u0016J\u0012\u0010%\u001a\u00020$2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010&\u001a\u00020$H\u0016J\u0010\u0010\'\u001a\u00020$2\u0006\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020$H\u0016J\b\u0010+\u001a\u00020$H\u0016J\b\u0010,\u001a\u00020$H\u0016J\u0010\u0010-\u001a\u00020$2\u0006\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u00020$H\u0016J\b\u00101\u001a\u00020$H\u0016J\b\u00102\u001a\u00020$H\u0016J\b\u00103\u001a\u00020$H\u0002J\b\u00104\u001a\u00020$H\u0016R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f\u00a8\u00065"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoPresenter;", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$ViewDelegate;", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$InteractorDelegate;", "interactor", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoInteractor;", "router", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$Router;", "state", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoState;", "(Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoInteractor;Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$Router;Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoState;)V", "canShowTransactionInProviderSite", "", "getCanShowTransactionInProviderSite", "()Z", "getInteractor", "()Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoInteractor;", "providerName", "", "getProviderName", "()Ljava/lang/String;", "getRouter", "()Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$Router;", "sectionCount", "", "getSectionCount", "()I", "view", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$View;", "getView", "()Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$View;", "setView", "(Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$View;)V", "getSection", "Lapp/odapplications/bitstashwallet/entities/FullTransactionSection;", "row", "onClear", "", "onError", "onProviderChange", "onReceiveTransactionInfo", "transactionRecord", "Lapp/odapplications/bitstashwallet/entities/FullTransactionRecord;", "onRetryLoad", "onShare", "onTapChangeProvider", "onTapItem", "item", "Lapp/odapplications/bitstashwallet/entities/FullTransactionItem;", "onTapProvider", "onTapResource", "retryLoadInfo", "tryLoadInfo", "viewDidLoad", "app_productionMainnetRelease"})
public final class FullTransactionInfoPresenter implements app.odapplications.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.ViewDelegate, app.odapplications.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.InteractorDelegate {
    @org.jetbrains.annotations.Nullable()
    private app.odapplications.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.View view;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoInteractor interactor = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.Router router = null;
    private final app.odapplications.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoState state = null;
    
    @org.jetbrains.annotations.Nullable()
    public final app.odapplications.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.View getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.View p0) {
    }
    
    @java.lang.Override()
    public boolean getCanShowTransactionInProviderSite() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getProviderName() {
        return null;
    }
    
    @java.lang.Override()
    public int getSectionCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public app.odapplications.bitstashwallet.entities.FullTransactionSection getSection(int row) {
        return null;
    }
    
    @java.lang.Override()
    public void viewDidLoad() {
    }
    
    @java.lang.Override()
    public void onRetryLoad() {
    }
    
    @java.lang.Override()
    public void onTapItem(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.FullTransactionItem item) {
    }
    
    @java.lang.Override()
    public void onTapProvider() {
    }
    
    @java.lang.Override()
    public void onTapChangeProvider() {
    }
    
    @java.lang.Override()
    public void onTapResource() {
    }
    
    @java.lang.Override()
    public void onShare() {
    }
    
    @java.lang.Override()
    public void onClear() {
    }
    
    @java.lang.Override()
    public void onProviderChange() {
    }
    
    @java.lang.Override()
    public void onReceiveTransactionInfo(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.FullTransactionRecord transactionRecord) {
    }
    
    @java.lang.Override()
    public void onError(@org.jetbrains.annotations.Nullable()
    java.lang.String providerName) {
    }
    
    @java.lang.Override()
    public void retryLoadInfo() {
    }
    
    private final void tryLoadInfo() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoInteractor getInteractor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.Router getRouter() {
        return null;
    }
    
    public FullTransactionInfoPresenter(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoInteractor interactor, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.Router router, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoState state) {
        super();
    }
}
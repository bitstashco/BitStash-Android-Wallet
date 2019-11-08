package io.horizontalsystems.bitstashwallet.modules.send;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\"\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0012\u0010\u0016\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/SendActivity;", "Lio/horizontalsystems/bitstashwallet/BaseActivity;", "()V", "mainPresenter", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$IViewDelegate;", "mainViewModel", "Lio/horizontalsystems/bitstashwallet/modules/send/SendViewModel;", "proceedButtonView", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/sendbutton/ProceedButtonView;", "addInputItems", "", "wallet", "Lio/horizontalsystems/bitstashwallet/entities/Wallet;", "inputItems", "", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$Input;", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_productionMainnetRelease"})
public final class SendActivity extends io.horizontalsystems.bitstashwallet.BaseActivity {
    private io.horizontalsystems.bitstashwallet.modules.send.SendModule.IViewDelegate mainPresenter;
    private io.horizontalsystems.bitstashwallet.modules.send.SendViewModel mainViewModel;
    private io.horizontalsystems.bitstashwallet.modules.send.submodules.sendbutton.ProceedButtonView proceedButtonView;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WALLET = "wallet_key";
    public static final io.horizontalsystems.bitstashwallet.modules.send.SendActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void addInputItems(io.horizontalsystems.bitstashwallet.entities.Wallet wallet, java.util.List<? extends io.horizontalsystems.bitstashwallet.modules.send.SendModule.Input> inputItems) {
    }
    
    public SendActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/SendActivity$Companion;", "", "()V", "WALLET", "", "app_productionMainnetRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
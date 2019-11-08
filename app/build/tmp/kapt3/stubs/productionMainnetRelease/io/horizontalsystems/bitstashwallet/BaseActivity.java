package io.horizontalsystems.bitstashwallet;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\u0004H\u0004J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\bH\u0016J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u0004H\u0004J\u0006\u0010\u0013\u001a\u00020\u0004J\b\u0010\u0014\u001a\u00020\u0004H\u0002J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0002J\u0018\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0019H\u0003J\u0018\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0019H\u0002\u00a8\u0006\u001b"}, d2 = {"Lio/horizontalsystems/bitstashwallet/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "attachBaseContext", "", "newBase", "Landroid/content/Context;", "getStatusBarHeight", "", "hideSoftKeyboard", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setContentView", "layoutResID", "setTopMarginByStatusBarHeight", "view", "Landroid/view/View;", "setTransparentStatusBar", "showCustomKeyboardAlert", "showTestLabel", "updateBaseContextLocale", "context", "updateResourcesLocale", "locale", "Ljava/util/Locale;", "updateResourcesLocaleLegacy", "app_productionMainnetRelease"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void attachBaseContext(@org.jetbrains.annotations.Nullable()
    android.content.Context newBase) {
    }
    
    @java.lang.Override()
    public void setContentView(int layoutResID) {
    }
    
    protected final void hideSoftKeyboard() {
    }
    
    protected final void setTransparentStatusBar() {
    }
    
    public final void showCustomKeyboardAlert() {
    }
    
    public final void setTopMarginByStatusBarHeight(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    private final int getStatusBarHeight() {
        return 0;
    }
    
    private final void showTestLabel() {
    }
    
    private final android.content.Context updateBaseContextLocale(android.content.Context context) {
        return null;
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.N)
    private final android.content.Context updateResourcesLocale(android.content.Context context, java.util.Locale locale) {
        return null;
    }
    
    @java.lang.SuppressWarnings(value = {"deprecation"})
    private final android.content.Context updateResourcesLocaleLegacy(android.content.Context context, java.util.Locale locale) {
        return null;
    }
    
    public BaseActivity() {
        super();
    }
}
package app.odapplications.bitstashwallet.modules.pin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014\u00a8\u0006\t"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/pin/PinActivity;", "Lapp/odapplications/bitstashwallet/BaseActivity;", "()V", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_productionMainnetRelease"})
public final class PinActivity extends app.odapplications.bitstashwallet.BaseActivity {
    public static final app.odapplications.bitstashwallet.modules.pin.PinActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public PinActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f\u00a8\u0006\r"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/pin/PinActivity$Companion;", "", "()V", "startForResult", "", "context", "Landroidx/appcompat/app/AppCompatActivity;", "interactionType", "Lapp/odapplications/bitstashwallet/modules/pin/PinInteractionType;", "requestCode", "", "showCancel", "", "app_productionMainnetRelease"})
    public static final class Companion {
        
        public final void startForResult(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.app.AppCompatActivity context, @org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.modules.pin.PinInteractionType interactionType, int requestCode, boolean showCancel) {
        }
        
        private Companion() {
            super();
        }
    }
}
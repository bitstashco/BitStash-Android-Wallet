package io.horizontalsystems.bitstashwallet.ui.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lio/horizontalsystems/bitstashwallet/ui/view/SingleClickListener;", "Landroid/view/View$OnClickListener;", "()V", "onClick", "", "v", "Landroid/view/View;", "onSingleClick", "app_productionMainnetRelease"})
public abstract class SingleClickListener implements android.view.View.OnClickListener {
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    public abstract void onSingleClick(@org.jetbrains.annotations.NotNull()
    android.view.View v);
    
    public SingleClickListener() {
        super();
    }
}
package io.horizontalsystems.bitstashwallet.modules.pin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/pin/PinPageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bigError", "Landroid/widget/TextView;", "imgPinMask1", "Landroid/widget/ImageView;", "imgPinMask2", "imgPinMask3", "imgPinMask4", "imgPinMask5", "imgPinMask6", "pinCirclesWrapper", "Landroidx/constraintlayout/widget/ConstraintLayout;", "kotlin.jvm.PlatformType", "smallError", "txtDesc", "txtTitle", "bind", "", "pinPage", "Lio/horizontalsystems/bitstashwallet/modules/pin/PinPage;", "shake", "", "updatePinCircles", "length", "", "app_devMainnetMasterDebug"})
public final class PinPageViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    private android.widget.TextView txtTitle;
    private android.widget.TextView bigError;
    private android.widget.TextView txtDesc;
    private android.widget.TextView smallError;
    private androidx.constraintlayout.widget.ConstraintLayout pinCirclesWrapper;
    private android.widget.ImageView imgPinMask1;
    private android.widget.ImageView imgPinMask2;
    private android.widget.ImageView imgPinMask3;
    private android.widget.ImageView imgPinMask4;
    private android.widget.ImageView imgPinMask5;
    private android.widget.ImageView imgPinMask6;
    
    public final void bind(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.pin.PinPage pinPage, boolean shake) {
    }
    
    private final void updatePinCircles(int length) {
    }
    
    public PinPageViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View itemView) {
        super(null);
    }
}
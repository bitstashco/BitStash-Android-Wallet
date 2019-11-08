package io.horizontalsystems.bitstashwallet.ui.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0010B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lio/horizontalsystems/bitstashwallet/ui/dialogs/ViewHolderSortType;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lkotlinx/android/extensions/LayoutContainer;", "containerView", "Landroid/view/View;", "listener", "Lio/horizontalsystems/bitstashwallet/ui/dialogs/ViewHolderSortType$ClickListener;", "(Landroid/view/View;Lio/horizontalsystems/bitstashwallet/ui/dialogs/ViewHolderSortType$ClickListener;)V", "getContainerView", "()Landroid/view/View;", "bind", "", "titleRes", "", "selected", "", "ClickListener", "app_productionMainnetRelease"})
public final class ViewHolderSortType extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements kotlinx.android.extensions.LayoutContainer {
    @org.jetbrains.annotations.NotNull()
    private final android.view.View containerView = null;
    private final io.horizontalsystems.bitstashwallet.ui.dialogs.ViewHolderSortType.ClickListener listener = null;
    private java.util.HashMap _$_findViewCache;
    
    public final void bind(int titleRes, boolean selected) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View getContainerView() {
        return null;
    }
    
    public ViewHolderSortType(@org.jetbrains.annotations.NotNull()
    android.view.View containerView, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.ui.dialogs.ViewHolderSortType.ClickListener listener) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bitstashwallet/ui/dialogs/ViewHolderSortType$ClickListener;", "", "onClick", "", "position", "", "app_productionMainnetRelease"})
    public static abstract interface ClickListener {
        
        public abstract void onClick(int position);
    }
}
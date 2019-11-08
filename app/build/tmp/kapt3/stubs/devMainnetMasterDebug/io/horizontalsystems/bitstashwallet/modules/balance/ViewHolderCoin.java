package io.horizontalsystems.bitstashwallet.modules.balance;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bJ\u001e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bJ\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J(\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/balance/ViewHolderCoin;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lkotlinx/android/extensions/LayoutContainer;", "containerView", "Landroid/view/View;", "listener", "Lio/horizontalsystems/bitstashwallet/modules/balance/BalanceCoinAdapter$Listener;", "(Landroid/view/View;Lio/horizontalsystems/bitstashwallet/modules/balance/BalanceCoinAdapter$Listener;)V", "getContainerView", "()Landroid/view/View;", "syncing", "", "bind", "", "balanceViewItem", "Lio/horizontalsystems/bitstashwallet/modules/balance/BalanceViewItem;", "expanded", "chartEnabled", "bindPartial", "setChartVisibility", "show", "fiatAmountVisibility", "", "showChart", "viewItem", "showFiatAmount", "app_devMainnetMasterDebug"})
public final class ViewHolderCoin extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements kotlinx.android.extensions.LayoutContainer {
    private boolean syncing;
    @org.jetbrains.annotations.NotNull()
    private final android.view.View containerView = null;
    private final io.horizontalsystems.bitstashwallet.modules.balance.BalanceCoinAdapter.Listener listener = null;
    private java.util.HashMap _$_findViewCache;
    
    public final void bind(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.balance.BalanceViewItem balanceViewItem, boolean expanded, boolean chartEnabled) {
    }
    
    public final void bindPartial(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.balance.BalanceViewItem balanceViewItem, boolean expanded, boolean chartEnabled) {
    }
    
    private final void showFiatAmount(io.horizontalsystems.bitstashwallet.modules.balance.BalanceViewItem balanceViewItem) {
    }
    
    private final void showChart(io.horizontalsystems.bitstashwallet.modules.balance.BalanceViewItem viewItem, boolean expanded, boolean chartEnabled, int fiatAmountVisibility) {
    }
    
    private final void setChartVisibility(boolean show, int fiatAmountVisibility) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View getContainerView() {
        return null;
    }
    
    public ViewHolderCoin(@org.jetbrains.annotations.NotNull()
    android.view.View containerView, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.balance.BalanceCoinAdapter.Listener listener) {
        super(null);
    }
}
package io.horizontalsystems.bitstashwallet.ui.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J@\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0010H\u0016JH\u0010\u0015\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J(\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0010H\u0002\u00a8\u0006\u001b"}, d2 = {"Lio/horizontalsystems/bitstashwallet/ui/extensions/FixAppBarLayoutBehavior;", "Lcom/google/android/material/appbar/AppBarLayout$Behavior;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "onNestedPreScroll", "", "coordinatorLayout", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "child", "Lcom/google/android/material/appbar/AppBarLayout;", "target", "Landroid/view/View;", "dx", "", "dy", "consumed", "", "type", "onNestedScroll", "dxConsumed", "dyConsumed", "dxUnconsumed", "dyUnconsumed", "stopNestedScrollIfNeeded", "app_productionMainnetRelease"})
public final class FixAppBarLayoutBehavior extends com.google.android.material.appbar.AppBarLayout.Behavior {
    
    @java.lang.Override()
    public void onNestedScroll(@org.jetbrains.annotations.NotNull()
    androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, @org.jetbrains.annotations.NotNull()
    com.google.android.material.appbar.AppBarLayout child, @org.jetbrains.annotations.NotNull()
    android.view.View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
    }
    
    @java.lang.Override()
    public void onNestedPreScroll(@org.jetbrains.annotations.NotNull()
    androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, @org.jetbrains.annotations.NotNull()
    com.google.android.material.appbar.AppBarLayout child, @org.jetbrains.annotations.NotNull()
    android.view.View target, int dx, int dy, @org.jetbrains.annotations.NotNull()
    int[] consumed, int type) {
    }
    
    private final void stopNestedScrollIfNeeded(int dy, com.google.android.material.appbar.AppBarLayout child, android.view.View target, int type) {
    }
    
    public FixAppBarLayoutBehavior(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super();
    }
}
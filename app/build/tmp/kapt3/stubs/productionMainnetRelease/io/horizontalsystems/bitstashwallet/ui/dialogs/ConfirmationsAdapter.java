package io.horizontalsystems.bitstashwallet.ui.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lio/horizontalsystems/bitstashwallet/ui/dialogs/ConfirmationsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lio/horizontalsystems/bitstashwallet/ui/dialogs/ViewHolderConfirmation;", "listener", "Lio/horizontalsystems/bitstashwallet/ui/dialogs/ConfirmationsAdapter$Listener;", "confirmations", "", "Lio/horizontalsystems/bitstashwallet/ui/dialogs/CheckBoxItem;", "(Lio/horizontalsystems/bitstashwallet/ui/dialogs/ConfirmationsAdapter$Listener;Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Listener", "app_productionMainnetRelease"})
public final class ConfirmationsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<io.horizontalsystems.bitstashwallet.ui.dialogs.ViewHolderConfirmation> {
    private io.horizontalsystems.bitstashwallet.ui.dialogs.ConfirmationsAdapter.Listener listener;
    private final java.util.List<io.horizontalsystems.bitstashwallet.ui.dialogs.CheckBoxItem> confirmations = null;
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bitstashwallet.ui.dialogs.ViewHolderConfirmation onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.ui.dialogs.ViewHolderConfirmation holder, int position) {
    }
    
    public ConfirmationsAdapter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.ui.dialogs.ConfirmationsAdapter.Listener listener, @org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bitstashwallet.ui.dialogs.CheckBoxItem> confirmations) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lio/horizontalsystems/bitstashwallet/ui/dialogs/ConfirmationsAdapter$Listener;", "", "onItemCheckMarkClick", "", "position", "", "checked", "", "app_productionMainnetRelease"})
    public static abstract interface Listener {
        
        public abstract void onItemCheckMarkClick(int position, boolean checked);
    }
}
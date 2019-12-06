package app.odapplications.bitstashwallet.ui.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0016B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\fH\u0016R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lapp/odapplications/bitstashwallet/ui/dialogs/SortingAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lapp/odapplications/bitstashwallet/ui/dialogs/ViewHolderSortType;", "Lapp/odapplications/bitstashwallet/ui/dialogs/ViewHolderSortType$ClickListener;", "list", "", "Lapp/odapplications/bitstashwallet/modules/balance/BalanceSortType;", "currentSortingType", "listener", "Lapp/odapplications/bitstashwallet/ui/dialogs/SortingAdapter$Listener;", "(Ljava/util/List;Lapp/odapplications/bitstashwallet/modules/balance/BalanceSortType;Lapp/odapplications/bitstashwallet/ui/dialogs/SortingAdapter$Listener;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onClick", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Listener", "app_productionMainnetRelease"})
public final class SortingAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<app.odapplications.bitstashwallet.ui.dialogs.ViewHolderSortType> implements app.odapplications.bitstashwallet.ui.dialogs.ViewHolderSortType.ClickListener {
    private final java.util.List<app.odapplications.bitstashwallet.modules.balance.BalanceSortType> list = null;
    private final app.odapplications.bitstashwallet.modules.balance.BalanceSortType currentSortingType = null;
    private final app.odapplications.bitstashwallet.ui.dialogs.SortingAdapter.Listener listener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public app.odapplications.bitstashwallet.ui.dialogs.ViewHolderSortType onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.ui.dialogs.ViewHolderSortType holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onClick(int position) {
    }
    
    public SortingAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends app.odapplications.bitstashwallet.modules.balance.BalanceSortType> list, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.balance.BalanceSortType currentSortingType, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.ui.dialogs.SortingAdapter.Listener listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lapp/odapplications/bitstashwallet/ui/dialogs/SortingAdapter$Listener;", "", "onClick", "", "sortType", "Lapp/odapplications/bitstashwallet/modules/balance/BalanceSortType;", "app_productionMainnetRelease"})
    public static abstract interface Listener {
        
        public abstract void onClick(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.modules.balance.BalanceSortType sortType);
    }
}
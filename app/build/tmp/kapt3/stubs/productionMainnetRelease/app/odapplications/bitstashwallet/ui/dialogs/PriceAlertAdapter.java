package app.odapplications.bitstashwallet.ui.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\tH\u0016J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\tH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\tH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lapp/odapplications/bitstashwallet/ui/dialogs/PriceAlertAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lapp/odapplications/bitstashwallet/ui/dialogs/PriceAlertStateViewHolder;", "list", "", "Lapp/odapplications/bitstashwallet/entities/PriceAlert$State;", "selectedItem", "onClickCallback", "Lkotlin/Function1;", "", "", "(Ljava/util/List;Lapp/odapplications/bitstashwallet/entities/PriceAlert$State;Lkotlin/jvm/functions/Function1;)V", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_productionMainnetRelease"})
public final class PriceAlertAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<app.odapplications.bitstashwallet.ui.dialogs.PriceAlertStateViewHolder> {
    private final java.util.List<app.odapplications.bitstashwallet.entities.PriceAlert.State> list = null;
    private final app.odapplications.bitstashwallet.entities.PriceAlert.State selectedItem = null;
    private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> onClickCallback = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public app.odapplications.bitstashwallet.ui.dialogs.PriceAlertStateViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.ui.dialogs.PriceAlertStateViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public PriceAlertAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends app.odapplications.bitstashwallet.entities.PriceAlert.State> list, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.PriceAlert.State selectedItem, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onClickCallback) {
        super();
    }
}
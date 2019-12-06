package app.odapplications.bitstashwallet.modules.send.submodules.fee;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0015B\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/send/submodules/fee/FeeRatesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lapp/odapplications/bitstashwallet/modules/send/submodules/fee/ViewHolderFeeRatePriority;", "Lapp/odapplications/bitstashwallet/modules/send/submodules/fee/ViewHolderFeeRatePriority$ClickListener;", "list", "", "Lapp/odapplications/bitstashwallet/modules/send/submodules/fee/SendFeeModule$FeeRateInfoViewItem;", "listener", "Lapp/odapplications/bitstashwallet/modules/send/submodules/fee/FeeRatesAdapter$Listener;", "(Ljava/util/List;Lapp/odapplications/bitstashwallet/modules/send/submodules/fee/FeeRatesAdapter$Listener;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onClick", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Listener", "app_productionMainnetRelease"})
public final class FeeRatesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<app.odapplications.bitstashwallet.modules.send.submodules.fee.ViewHolderFeeRatePriority> implements app.odapplications.bitstashwallet.modules.send.submodules.fee.ViewHolderFeeRatePriority.ClickListener {
    private final java.util.List<app.odapplications.bitstashwallet.modules.send.submodules.fee.SendFeeModule.FeeRateInfoViewItem> list = null;
    private final app.odapplications.bitstashwallet.modules.send.submodules.fee.FeeRatesAdapter.Listener listener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public app.odapplications.bitstashwallet.modules.send.submodules.fee.ViewHolderFeeRatePriority onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.send.submodules.fee.ViewHolderFeeRatePriority holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onClick(int position) {
    }
    
    public FeeRatesAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<app.odapplications.bitstashwallet.modules.send.submodules.fee.SendFeeModule.FeeRateInfoViewItem> list, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.send.submodules.fee.FeeRatesAdapter.Listener listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/send/submodules/fee/FeeRatesAdapter$Listener;", "", "onClick", "", "feeRate", "Lapp/odapplications/bitstashwallet/entities/FeeRateInfo;", "app_productionMainnetRelease"})
    public static abstract interface Listener {
        
        public abstract void onClick(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.FeeRateInfo feeRate);
    }
}
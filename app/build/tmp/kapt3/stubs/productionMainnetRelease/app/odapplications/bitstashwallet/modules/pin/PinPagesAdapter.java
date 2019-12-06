package app.odapplications.bitstashwallet.modules.pin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\fH\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\fH\u0016J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0016\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\fJ\u0016\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006!"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/pin/PinPagesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "()V", "pinPages", "", "Lapp/odapplications/bitstashwallet/modules/pin/PinPage;", "getPinPages", "()Ljava/util/List;", "setPinPages", "(Ljava/util/List;)V", "shakePageIndex", "", "getShakePageIndex", "()Ljava/lang/Integer;", "setShakePageIndex", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setEnteredPinLength", "pageIndex", "enteredLength", "updateTopTextForPage", "text", "Lapp/odapplications/bitstashwallet/modules/pin/TopText;", "app_productionMainnetRelease"})
public final class PinPagesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<app.odapplications.bitstashwallet.modules.pin.PinPage> pinPages;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer shakePageIndex;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<app.odapplications.bitstashwallet.modules.pin.PinPage> getPinPages() {
        return null;
    }
    
    public final void setPinPages(@org.jetbrains.annotations.NotNull()
    java.util.List<app.odapplications.bitstashwallet.modules.pin.PinPage> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getShakePageIndex() {
        return null;
    }
    
    public final void setShakePageIndex(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public final void updateTopTextForPage(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.pin.TopText text, int pageIndex) {
    }
    
    public final void setEnteredPinLength(int pageIndex, int enteredLength) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    public PinPagesAdapter() {
        super();
    }
}
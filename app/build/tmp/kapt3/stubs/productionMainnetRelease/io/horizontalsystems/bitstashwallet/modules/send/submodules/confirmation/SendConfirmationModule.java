package io.horizontalsystems.bitstashwallet.modules.send.submodules.confirmation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0007\f\r\u000e\u000f\u0010\u0011\u0012B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/submodules/confirmation/SendConfirmationModule;", "", "()V", "ConfirmationInfoKey", "", "init", "", "view", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/confirmation/SendConfirmationViewModel;", "confirmationViewItems", "", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$SendConfirmationViewItem;", "IInteractor", "IInteractorDelegate", "IView", "IViewDelegate", "PrimaryItemData", "SecondaryItemData", "SendButtonState", "app_productionMainnetRelease"})
public final class SendConfirmationModule {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ConfirmationInfoKey = "confirmation_info_key";
    public static final io.horizontalsystems.bitstashwallet.modules.send.submodules.confirmation.SendConfirmationModule INSTANCE = null;
    
    public final void init(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.send.submodules.confirmation.SendConfirmationViewModel view, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.horizontalsystems.bitstashwallet.modules.send.SendModule.SendConfirmationViewItem> confirmationViewItems) {
    }
    
    private SendConfirmationModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u0003H&\u00a8\u0006\u000e"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/submodules/confirmation/SendConfirmationModule$IView;", "", "loadPrimaryItems", "", "primaryItemData", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/confirmation/SendConfirmationModule$PrimaryItemData;", "loadSecondaryItems", "secondaryItemData", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/confirmation/SendConfirmationModule$SecondaryItemData;", "loadSendButton", "setSendButtonState", "state", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/confirmation/SendConfirmationModule$SendButtonState;", "showCopied", "app_productionMainnetRelease"})
    public static abstract interface IView {
        
        public abstract void loadPrimaryItems(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.modules.send.submodules.confirmation.SendConfirmationModule.PrimaryItemData primaryItemData);
        
        public abstract void loadSecondaryItems(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.modules.send.submodules.confirmation.SendConfirmationModule.SecondaryItemData secondaryItemData);
        
        public abstract void showCopied();
        
        public abstract void loadSendButton();
        
        public abstract void setSendButtonState(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.modules.send.submodules.confirmation.SendConfirmationModule.SendButtonState state);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/submodules/confirmation/SendConfirmationModule$IViewDelegate;", "", "onReceiverClick", "", "onSendError", "onViewDidLoad", "app_productionMainnetRelease"})
    public static abstract interface IViewDelegate {
        
        public abstract void onViewDidLoad();
        
        public abstract void onReceiverClick();
        
        public abstract void onSendError();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/submodules/confirmation/SendConfirmationModule$IInteractor;", "", "copyToClipboard", "", "coinAddress", "", "app_productionMainnetRelease"})
    public static abstract interface IInteractor {
        
        public abstract void copyToClipboard(@org.jetbrains.annotations.NotNull()
        java.lang.String coinAddress);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/submodules/confirmation/SendConfirmationModule$IInteractorDelegate;", "", "didCopyToClipboard", "", "app_productionMainnetRelease"})
    public static abstract interface IInteractorDelegate {
        
        public abstract void didCopyToClipboard();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/submodules/confirmation/SendConfirmationModule$SendButtonState;", "", "(Ljava/lang/String;I)V", "ACTIVE", "SENDING", "app_productionMainnetRelease"})
    public static enum SendButtonState {
        /*public static final*/ ACTIVE /* = new ACTIVE() */,
        /*public static final*/ SENDING /* = new SENDING() */;
        
        SendButtonState() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003JK\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b\u00a8\u0006\u001e"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/submodules/confirmation/SendConfirmationModule$PrimaryItemData;", "", "primaryName", "", "primaryAmount", "secondaryName", "secondaryAmount", "receiver", "memo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMemo", "()Ljava/lang/String;", "getPrimaryAmount", "getPrimaryName", "getReceiver", "getSecondaryAmount", "getSecondaryName", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionMainnetRelease"})
    public static final class PrimaryItemData {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String primaryName = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String primaryAmount = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String secondaryName = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String secondaryAmount = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String receiver = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String memo = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPrimaryName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPrimaryAmount() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSecondaryName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSecondaryAmount() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReceiver() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getMemo() {
            return null;
        }
        
        public PrimaryItemData(@org.jetbrains.annotations.NotNull()
        java.lang.String primaryName, @org.jetbrains.annotations.NotNull()
        java.lang.String primaryAmount, @org.jetbrains.annotations.Nullable()
        java.lang.String secondaryName, @org.jetbrains.annotations.Nullable()
        java.lang.String secondaryAmount, @org.jetbrains.annotations.NotNull()
        java.lang.String receiver, @org.jetbrains.annotations.Nullable()
        java.lang.String memo) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.modules.send.submodules.confirmation.SendConfirmationModule.PrimaryItemData copy(@org.jetbrains.annotations.NotNull()
        java.lang.String primaryName, @org.jetbrains.annotations.NotNull()
        java.lang.String primaryAmount, @org.jetbrains.annotations.Nullable()
        java.lang.String secondaryName, @org.jetbrains.annotations.Nullable()
        java.lang.String secondaryAmount, @org.jetbrains.annotations.NotNull()
        java.lang.String receiver, @org.jetbrains.annotations.Nullable()
        java.lang.String memo) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\bJ&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/submodules/confirmation/SendConfirmationModule$SecondaryItemData;", "", "feeAmount", "", "estimatedTime", "", "(Ljava/lang/String;Ljava/lang/Long;)V", "getEstimatedTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getFeeAmount", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Long;)Lio/horizontalsystems/bitstashwallet/modules/send/submodules/confirmation/SendConfirmationModule$SecondaryItemData;", "equals", "", "other", "hashCode", "", "toString", "app_productionMainnetRelease"})
    public static final class SecondaryItemData {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String feeAmount = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Long estimatedTime = null;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getFeeAmount() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long getEstimatedTime() {
            return null;
        }
        
        public SecondaryItemData(@org.jetbrains.annotations.Nullable()
        java.lang.String feeAmount, @org.jetbrains.annotations.Nullable()
        java.lang.Long estimatedTime) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.modules.send.submodules.confirmation.SendConfirmationModule.SecondaryItemData copy(@org.jetbrains.annotations.Nullable()
        java.lang.String feeAmount, @org.jetbrains.annotations.Nullable()
        java.lang.Long estimatedTime) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
}
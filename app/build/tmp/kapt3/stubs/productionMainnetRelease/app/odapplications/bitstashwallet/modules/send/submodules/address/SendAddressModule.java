package app.odapplications.bitstashwallet.modules.send.submodules.address;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0007\u000b\f\r\u000e\u000f\u0010\u0011B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n\u00a8\u0006\u0012"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/send/submodules/address/SendAddressModule;", "", "()V", "init", "Lapp/odapplications/bitstashwallet/modules/send/submodules/address/SendAddressPresenter;", "view", "Lapp/odapplications/bitstashwallet/modules/send/submodules/address/SendAddressViewModel;", "coin", "Lapp/odapplications/bitstashwallet/entities/Coin;", "moduleDelegate", "Lapp/odapplications/bitstashwallet/modules/send/submodules/address/SendAddressModule$IAddressModuleDelegate;", "IAddressModule", "IAddressModuleDelegate", "IInteractor", "IInteractorDelegate", "IView", "IViewDelegate", "ValidationError", "app_productionMainnetRelease"})
public final class SendAddressModule {
    public static final app.odapplications.bitstashwallet.modules.send.submodules.address.SendAddressModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.modules.send.submodules.address.SendAddressPresenter init(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.send.submodules.address.SendAddressViewModel view, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Coin coin, @org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.modules.send.submodules.address.SendAddressModule.IAddressModuleDelegate moduleDelegate) {
        return null;
    }
    
    private SendAddressModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&\u00a8\u0006\r"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/send/submodules/address/SendAddressModule$IView;", "", "setAddress", "", "address", "", "setAddressError", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "setPasteButtonState", "enabled", "", "app_productionMainnetRelease"})
    public static abstract interface IView {
        
        public abstract void setAddress(@org.jetbrains.annotations.Nullable()
        java.lang.String address);
        
        public abstract void setAddressError(@org.jetbrains.annotations.Nullable()
        java.lang.Exception error);
        
        public abstract void setPasteButtonState(boolean enabled);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/send/submodules/address/SendAddressModule$IViewDelegate;", "", "onAddressDeleteClicked", "", "onAddressPasteClicked", "onAddressScanClicked", "onViewDidLoad", "app_productionMainnetRelease"})
    public static abstract interface IViewDelegate {
        
        public abstract void onViewDidLoad();
        
        public abstract void onAddressPasteClicked();
        
        public abstract void onAddressDeleteClicked();
        
        public abstract void onAddressScanClicked();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b2\u0006\u0010\r\u001a\u00020\u0003H&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\u000e"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/send/submodules/address/SendAddressModule$IInteractor;", "", "addressFromClipboard", "", "getAddressFromClipboard", "()Ljava/lang/String;", "clipboardHasPrimaryClip", "", "getClipboardHasPrimaryClip", "()Z", "parseAddress", "Lkotlin/Pair;", "Ljava/math/BigDecimal;", "address", "app_productionMainnetRelease"})
    public static abstract interface IInteractor {
        
        @org.jetbrains.annotations.Nullable()
        public abstract java.lang.String getAddressFromClipboard();
        
        public abstract boolean getClipboardHasPrimaryClip();
        
        @org.jetbrains.annotations.NotNull()
        public abstract kotlin.Pair<java.lang.String, java.math.BigDecimal> parseAddress(@org.jetbrains.annotations.NotNull()
        java.lang.String address);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/send/submodules/address/SendAddressModule$IInteractorDelegate;", "", "app_productionMainnetRelease"})
    public static abstract interface IInteractorDelegate {
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\n"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/send/submodules/address/SendAddressModule$IAddressModule;", "", "currentAddress", "", "getCurrentAddress", "()Ljava/lang/String;", "didScanQrCode", "", "address", "validAddress", "app_productionMainnetRelease"})
    public static abstract interface IAddressModule {
        
        @org.jetbrains.annotations.Nullable()
        public abstract java.lang.String getCurrentAddress();
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.lang.String validAddress();
        
        public abstract void didScanQrCode(@org.jetbrains.annotations.NotNull()
        java.lang.String address);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/send/submodules/address/SendAddressModule$IAddressModuleDelegate;", "", "onUpdateAddress", "", "onUpdateAmount", "amount", "Ljava/math/BigDecimal;", "scanQrCode", "validate", "address", "", "app_productionMainnetRelease"})
    public static abstract interface IAddressModuleDelegate {
        
        public abstract void validate(@org.jetbrains.annotations.NotNull()
        java.lang.String address);
        
        public abstract void onUpdateAddress();
        
        public abstract void onUpdateAmount(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal amount);
        
        public abstract void scanQrCode();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0004B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0005"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/send/submodules/address/SendAddressModule$ValidationError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "InvalidAddress", "app_productionMainnetRelease"})
    public static class ValidationError extends java.lang.Exception {
        
        public ValidationError() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/send/submodules/address/SendAddressModule$ValidationError$InvalidAddress;", "Lapp/odapplications/bitstashwallet/modules/send/submodules/address/SendAddressModule$ValidationError;", "()V", "app_productionMainnetRelease"})
        public static final class InvalidAddress extends app.odapplications.bitstashwallet.modules.send.submodules.address.SendAddressModule.ValidationError {
            
            public InvalidAddress() {
                super();
            }
        }
    }
}
package app.odapplications.bitstashwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lapp/odapplications/bitstashwallet/core/IKeyProvider;", "", "getKey", "Ljavax/crypto/SecretKey;", "app_productionMainnetRelease"})
public abstract interface IKeyProvider {
    
    @org.jetbrains.annotations.NotNull()
    public abstract javax.crypto.SecretKey getKey();
}
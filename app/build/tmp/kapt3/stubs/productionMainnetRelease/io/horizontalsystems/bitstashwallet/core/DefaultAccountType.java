package io.horizontalsystems.bitstashwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/DefaultAccountType;", "", "()V", "Eos", "Mnemonic", "Lio/horizontalsystems/bitstashwallet/core/DefaultAccountType$Mnemonic;", "Lio/horizontalsystems/bitstashwallet/core/DefaultAccountType$Eos;", "app_productionMainnetRelease"})
public abstract class DefaultAccountType {
    
    private DefaultAccountType() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000b\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/DefaultAccountType$Mnemonic;", "Lio/horizontalsystems/bitstashwallet/core/DefaultAccountType;", "wordsCount", "", "(I)V", "getWordsCount", "()I", "equals", "", "other", "", "hashCode", "app_productionMainnetRelease"})
    public static final class Mnemonic extends io.horizontalsystems.bitstashwallet.core.DefaultAccountType {
        private final int wordsCount = 0;
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        public final int getWordsCount() {
            return 0;
        }
        
        public Mnemonic(int wordsCount) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0096\u0002\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/DefaultAccountType$Eos;", "Lio/horizontalsystems/bitstashwallet/core/DefaultAccountType;", "()V", "equals", "", "other", "", "app_productionMainnetRelease"})
    public static final class Eos extends io.horizontalsystems.bitstashwallet.core.DefaultAccountType {
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        public Eos() {
            super();
        }
    }
}
package app.odapplications.bitstashwallet.core.factories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J7\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lapp/odapplications/bitstashwallet/core/factories/TransactionViewItemFactory;", "", "feeCoinProvider", "Lapp/odapplications/bitstashwallet/core/factories/FeeCoinProvider;", "(Lapp/odapplications/bitstashwallet/core/factories/FeeCoinProvider;)V", "isSentToSelf", "", "record", "Lapp/odapplications/bitstashwallet/entities/TransactionRecord;", "item", "Lapp/odapplications/bitstashwallet/modules/transactions/TransactionViewItem;", "wallet", "Lapp/odapplications/bitstashwallet/entities/Wallet;", "transactionItem", "Lapp/odapplications/bitstashwallet/entities/TransactionItem;", "lastBlockHeight", "", "threshold", "rate", "Lapp/odapplications/bitstashwallet/entities/CurrencyValue;", "(Lapp/odapplications/bitstashwallet/entities/Wallet;Lapp/odapplications/bitstashwallet/entities/TransactionItem;Ljava/lang/Integer;ILapp/odapplications/bitstashwallet/entities/CurrencyValue;)Lapp/odapplications/bitstashwallet/modules/transactions/TransactionViewItem;", "showFromAddress", "coinType", "Lapp/odapplications/bitstashwallet/entities/CoinType;", "app_productionMainnetRelease"})
public final class TransactionViewItemFactory {
    private final app.odapplications.bitstashwallet.core.factories.FeeCoinProvider feeCoinProvider = null;
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.modules.transactions.TransactionViewItem item(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Wallet wallet, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.TransactionItem transactionItem, @org.jetbrains.annotations.Nullable()
    java.lang.Integer lastBlockHeight, int threshold, @org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.entities.CurrencyValue rate) {
        return null;
    }
    
    private final boolean isSentToSelf(app.odapplications.bitstashwallet.entities.TransactionRecord record) {
        return false;
    }
    
    private final boolean showFromAddress(app.odapplications.bitstashwallet.entities.CoinType coinType) {
        return false;
    }
    
    public TransactionViewItemFactory(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.factories.FeeCoinProvider feeCoinProvider) {
        super();
    }
}
package app.odapplications.bitstashwallet.modules.restore.words;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0011\u0012B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0004H\u0016J\u001c\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\u0004H\u0016J\u001c\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/restore/words/RestoreWordsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lapp/odapplications/bitstashwallet/modules/restore/words/RestoreWordsAdapter$InputTextViewHolder;", "wordsCount", "", "listener", "Lapp/odapplications/bitstashwallet/modules/restore/words/RestoreWordsAdapter$Listener;", "(ILapp/odapplications/bitstashwallet/modules/restore/words/RestoreWordsAdapter$Listener;)V", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "InputTextViewHolder", "Listener", "app_productionMainnetRelease"})
public final class RestoreWordsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<app.odapplications.bitstashwallet.modules.restore.words.RestoreWordsAdapter.InputTextViewHolder> {
    private final int wordsCount = 0;
    private final app.odapplications.bitstashwallet.modules.restore.words.RestoreWordsAdapter.Listener listener = null;
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public app.odapplications.bitstashwallet.modules.restore.words.RestoreWordsAdapter.InputTextViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.restore.words.RestoreWordsAdapter.InputTextViewHolder holder, int position) {
    }
    
    public RestoreWordsAdapter(int wordsCount, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.restore.words.RestoreWordsAdapter.Listener listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&\u00a8\u0006\t"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/restore/words/RestoreWordsAdapter$Listener;", "", "onChange", "", "position", "", "word", "", "onDone", "app_productionMainnetRelease"})
    public static abstract interface Listener {
        
        public abstract void onChange(int position, @org.jetbrains.annotations.NotNull()
        java.lang.String word);
        
        public abstract void onDone();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/restore/words/RestoreWordsAdapter$InputTextViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "inputTextView", "Lapp/odapplications/bitstashwallet/ui/extensions/InputTextView;", "(Lapp/odapplications/bitstashwallet/modules/restore/words/RestoreWordsAdapter;Lapp/odapplications/bitstashwallet/ui/extensions/InputTextView;)V", "bind", "", "position", "", "lastElement", "", "app_productionMainnetRelease"})
    public final class InputTextViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final app.odapplications.bitstashwallet.ui.extensions.InputTextView inputTextView = null;
        
        public final void bind(int position, boolean lastElement) {
        }
        
        public InputTextViewHolder(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.ui.extensions.InputTextView inputTextView) {
            super(null);
        }
    }
}
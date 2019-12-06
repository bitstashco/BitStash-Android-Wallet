package app.odapplications.bitstashwallet.modules.settings;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010,\u001a\u00020-2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010.\u001a\u00020-H\u0014J\u000e\u0010/\u001a\u00020-2\u0006\u00100\u001a\u00020\u000eJ\u0006\u00101\u001a\u00020-R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R(\u0010\u0015\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082.\u00a2\u0006\u0002\n\u0000R$\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000e@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R(\u0010&\u001a\u0004\u0018\u00010%2\b\u0010\u0014\u001a\u0004\u0018\u00010%@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u000e\u0010+\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/settings/SettingsItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "arrowImageView", "Landroid/widget/ImageView;", "attrArrow", "", "attrIcon", "Landroid/graphics/drawable/Drawable;", "attrTitle", "", "badgeImageView", "value", "selectedValue", "getSelectedValue", "()Ljava/lang/String;", "setSelectedValue", "(Ljava/lang/String;)V", "selectedValueTextView", "Landroid/widget/TextView;", "settingIconImageView", "switch", "Landroid/widget/Switch;", "isChecked", "switchIsChecked", "getSwitchIsChecked", "()Z", "setSwitchIsChecked", "(Z)V", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "switchOnCheckedChangeListener", "getSwitchOnCheckedChangeListener", "()Landroid/widget/CompoundButton$OnCheckedChangeListener;", "setSwitchOnCheckedChangeListener", "(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V", "titleTextView", "loadAttributes", "", "onFinishInflate", "setInfoBadgeVisibility", "isVisible", "switchToggle", "app_productionMainnetRelease"})
public final class SettingsItemView extends androidx.constraintlayout.widget.ConstraintLayout {
    private java.lang.String attrTitle;
    private android.graphics.drawable.Drawable attrIcon;
    private boolean attrArrow;
    private android.widget.ImageView settingIconImageView;
    private android.widget.TextView titleTextView;
    private android.widget.TextView selectedValueTextView;
    private android.widget.ImageView badgeImageView;
    private android.widget.ImageView arrowImageView;
    private boolean switchIsChecked;
    @org.jetbrains.annotations.Nullable()
    private android.widget.CompoundButton.OnCheckedChangeListener switchOnCheckedChangeListener;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String selectedValue;
    private java.util.HashMap _$_findViewCache;
    
    private final void loadAttributes(android.util.AttributeSet attrs) {
    }
    
    @java.lang.Override()
    protected void onFinishInflate() {
    }
    
    public final boolean getSwitchIsChecked() {
        return false;
    }
    
    public final void setSwitchIsChecked(boolean isChecked) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.CompoundButton.OnCheckedChangeListener getSwitchOnCheckedChangeListener() {
        return null;
    }
    
    public final void setSwitchOnCheckedChangeListener(@org.jetbrains.annotations.Nullable()
    android.widget.CompoundButton.OnCheckedChangeListener value) {
    }
    
    public final void switchToggle() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSelectedValue() {
        return null;
    }
    
    public final void setSelectedValue(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    public final void setInfoBadgeVisibility(boolean isVisible) {
    }
    
    public SettingsItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public SettingsItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public SettingsItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
}
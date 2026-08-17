package p233n;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.view.AbstractC1896b;
import p074e1.b;

/* JADX INFO: loaded from: classes.dex */
public class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f49404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f49405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f49406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CharSequence f49407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f49408e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Intent f49409f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private char f49410g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private char f49412i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Drawable f49414k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Context f49415l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f49416m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private CharSequence f49417n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private CharSequence f49418o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f49411h = 4096;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f49413j = 4096;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ColorStateList f49419p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private PorterDuff.Mode f49420q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f49421r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f49422s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f49423t = 16;

    public a(Context context, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f49415l = context;
        this.f49404a = i11;
        this.f49405b = i10;
        this.f49406c = i13;
        this.f49407d = charSequence;
    }

    private void c() {
        Drawable drawable = this.f49414k;
        if (drawable != null) {
            if (this.f49421r || this.f49422s) {
                Drawable drawableR = p038c1.a.r(drawable);
                this.f49414k = drawableR;
                Drawable drawableMutate = drawableR.mutate();
                this.f49414k = drawableMutate;
                if (this.f49421r) {
                    p038c1.a.o(drawableMutate, this.f49419p);
                }
                if (this.f49422s) {
                    p038c1.a.p(this.f49414k, this.f49420q);
                }
            }
        }
    }

    @Override // p074e1.b
    public AbstractC1896b a() {
        return null;
    }

    @Override // p074e1.b
    public b b(AbstractC1896b abstractC1896b) {
        throw new UnsupportedOperationException();
    }

    @Override // p074e1.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // p074e1.b, android.view.MenuItem
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public b setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // p074e1.b, android.view.MenuItem
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // p074e1.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // p074e1.b, android.view.MenuItem
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // p074e1.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // p074e1.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f49413j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f49412i;
    }

    @Override // p074e1.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f49417n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f49405b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f49414k;
    }

    @Override // p074e1.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f49419p;
    }

    @Override // p074e1.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f49420q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f49409f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f49404a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p074e1.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f49411h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f49410g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f49406c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f49407d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f49408e;
        return charSequence != null ? charSequence : this.f49407d;
    }

    @Override // p074e1.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f49418o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // p074e1.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f49423t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f49423t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f49423t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f49423t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f49412i = Character.toLowerCase(c10);
        return this;
    }

    @Override // p074e1.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f49412i = Character.toLowerCase(c10);
        this.f49413j = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f49423t = (z10 ? 1 : 0) | (this.f49423t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f49423t = (z10 ? 2 : 0) | (this.f49423t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public b setContentDescription(CharSequence charSequence) {
        this.f49417n = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f49423t = (z10 ? 16 : 0) | (this.f49423t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f49414k = Z0.b.e(this.f49415l, i10);
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f49414k = drawable;
        c();
        return this;
    }

    @Override // p074e1.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f49419p = colorStateList;
        this.f49421r = true;
        c();
        return this;
    }

    @Override // p074e1.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f49420q = mode;
        this.f49422s = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f49409f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f49410g = c10;
        return this;
    }

    @Override // p074e1.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f49410g = c10;
        this.f49411h = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f49416m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f49410g = c10;
        this.f49412i = Character.toLowerCase(c11);
        return this;
    }

    @Override // p074e1.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f49410g = c10;
        this.f49411h = KeyEvent.normalizeMetaState(i10);
        this.f49412i = Character.toLowerCase(c11);
        this.f49413j = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // p074e1.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f49407d = this.f49415l.getResources().getString(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f49407d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f49408e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public b setTooltipText(CharSequence charSequence) {
        this.f49418o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        this.f49423t = (this.f49423t & 8) | (z10 ? 0 : 8);
        return this;
    }
}

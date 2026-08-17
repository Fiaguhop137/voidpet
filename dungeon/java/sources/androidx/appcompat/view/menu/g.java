package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.AbstractC1896b;

/* JADX INFO: loaded from: classes.dex */
public final class g implements p074e1.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private View f20361A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private AbstractC1896b f20362B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private MenuItem.OnActionExpandListener f20363C;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f20365E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f20366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f20368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f20369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f20370e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CharSequence f20371f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Intent f20372g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private char f20373h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private char f20375j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Drawable f20377l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    e f20379n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private m f20380o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Runnable f20381p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f20382q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private CharSequence f20383r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private CharSequence f20384s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f20391z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f20374i = 4096;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f20376k = 4096;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f20378m = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ColorStateList f20385t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private PorterDuff.Mode f20386u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f20387v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f20388w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f20389x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f20390y = 16;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f20364D = false;

    class a implements AbstractC1896b.InterfaceC0280b {
        a() {
        }

        @Override // androidx.core.view.AbstractC1896b.InterfaceC0280b
        public void onActionProviderVisibilityChanged(boolean z10) {
            g gVar = g.this;
            gVar.f20379n.M(gVar);
        }
    }

    g(e eVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f20379n = eVar;
        this.f20366a = i11;
        this.f20367b = i10;
        this.f20368c = i12;
        this.f20369d = i13;
        this.f20370e = charSequence;
        this.f20391z = i14;
    }

    private static void d(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable != null && this.f20389x && (this.f20387v || this.f20388w)) {
            drawable = p038c1.a.r(drawable).mutate();
            if (this.f20387v) {
                p038c1.a.o(drawable, this.f20385t);
            }
            if (this.f20388w) {
                p038c1.a.p(drawable, this.f20386u);
            }
            this.f20389x = false;
        }
        return drawable;
    }

    boolean A() {
        return this.f20379n.K() && g() != 0;
    }

    public boolean B() {
        return (this.f20391z & 4) == 4;
    }

    @Override // p074e1.b
    public AbstractC1896b a() {
        return this.f20362B;
    }

    @Override // p074e1.b
    public p074e1.b b(AbstractC1896b abstractC1896b) {
        AbstractC1896b abstractC1896b2 = this.f20362B;
        if (abstractC1896b2 != null) {
            abstractC1896b2.g();
        }
        this.f20361A = null;
        this.f20362B = abstractC1896b;
        this.f20379n.N(true);
        AbstractC1896b abstractC1896b3 = this.f20362B;
        if (abstractC1896b3 != null) {
            abstractC1896b3.i(new a());
        }
        return this;
    }

    public void c() {
        this.f20379n.L(this);
    }

    @Override // p074e1.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f20391z & 8) == 0) {
            return false;
        }
        if (this.f20361A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f20363C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f20379n.f(this);
        }
        return false;
    }

    @Override // p074e1.b, android.view.MenuItem
    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f20363C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f20379n.m(this);
        }
        return false;
    }

    public int f() {
        return this.f20369d;
    }

    char g() {
        return this.f20379n.J() ? this.f20375j : this.f20373h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // p074e1.b, android.view.MenuItem
    public View getActionView() {
        View view = this.f20361A;
        if (view != null) {
            return view;
        }
        AbstractC1896b abstractC1896b = this.f20362B;
        if (abstractC1896b == null) {
            return null;
        }
        View viewC = abstractC1896b.c(this);
        this.f20361A = viewC;
        return viewC;
    }

    @Override // p074e1.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f20376k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f20375j;
    }

    @Override // p074e1.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f20383r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f20367b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f20377l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f20378m == 0) {
            return null;
        }
        Drawable drawableB = p161j.a.b(this.f20379n.w(), this.f20378m);
        this.f20378m = 0;
        this.f20377l = drawableB;
        return e(drawableB);
    }

    @Override // p074e1.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f20385t;
    }

    @Override // p074e1.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f20386u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f20372g;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f20366a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f20365E;
    }

    @Override // p074e1.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f20374i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f20373h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f20368c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f20380o;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f20370e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f20371f;
        return charSequence != null ? charSequence : this.f20370e;
    }

    @Override // p074e1.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f20384s;
    }

    String h() {
        char cG = g();
        if (cG == 0) {
            return "";
        }
        Resources resources = this.f20379n.w().getResources();
        StringBuilder sb2 = new StringBuilder();
        if (ViewConfiguration.get(this.f20379n.w()).hasPermanentMenuKey()) {
            sb2.append(resources.getString(p144i.h.f43241m));
        }
        int i10 = this.f20379n.J() ? this.f20376k : this.f20374i;
        d(sb2, i10, 65536, resources.getString(p144i.h.f43237i));
        d(sb2, i10, 4096, resources.getString(p144i.h.f43233e));
        d(sb2, i10, 2, resources.getString(p144i.h.f43232d));
        d(sb2, i10, 1, resources.getString(p144i.h.f43238j));
        d(sb2, i10, 4, resources.getString(p144i.h.f43240l));
        d(sb2, i10, 8, resources.getString(p144i.h.f43236h));
        if (cG == '\b') {
            sb2.append(resources.getString(p144i.h.f43234f));
        } else if (cG == '\n') {
            sb2.append(resources.getString(p144i.h.f43235g));
        } else if (cG != ' ') {
            sb2.append(cG);
        } else {
            sb2.append(resources.getString(p144i.h.f43239k));
        }
        return sb2.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f20380o != null;
    }

    CharSequence i(k.a aVar) {
        return (aVar == null || !aVar.d()) ? getTitle() : getTitleCondensed();
    }

    @Override // p074e1.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f20364D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f20390y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f20390y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f20390y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        AbstractC1896b abstractC1896b = this.f20362B;
        if (abstractC1896b == null || !abstractC1896b.f()) {
            return (this.f20390y & 8) == 0;
        }
        return (this.f20390y & 8) == 0 && this.f20362B.b();
    }

    public boolean j() {
        AbstractC1896b abstractC1896b;
        if ((this.f20391z & 8) != 0) {
            if (this.f20361A == null && (abstractC1896b = this.f20362B) != null) {
                this.f20361A = abstractC1896b.c(this);
            }
            if (this.f20361A != null) {
                return true;
            }
        }
        return false;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f20382q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        e eVar = this.f20379n;
        if (eVar.h(eVar, this)) {
            return true;
        }
        Runnable runnable = this.f20381p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f20372g != null) {
            try {
                this.f20379n.w().startActivity(this.f20372g);
                return true;
            } catch (ActivityNotFoundException e10) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
            }
        }
        AbstractC1896b abstractC1896b = this.f20362B;
        return abstractC1896b != null && abstractC1896b.d();
    }

    public boolean l() {
        return (this.f20390y & 32) == 32;
    }

    public boolean m() {
        return (this.f20390y & 4) != 0;
    }

    public boolean n() {
        return (this.f20391z & 1) == 1;
    }

    public boolean o() {
        return (this.f20391z & 2) == 2;
    }

    @Override // p074e1.b, android.view.MenuItem
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public p074e1.b setActionView(int i10) {
        Context contextW = this.f20379n.w();
        setActionView(LayoutInflater.from(contextW).inflate(i10, (ViewGroup) new LinearLayout(contextW), false));
        return this;
    }

    @Override // p074e1.b, android.view.MenuItem
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public p074e1.b setActionView(View view) {
        int i10;
        this.f20361A = view;
        this.f20362B = null;
        if (view != null && view.getId() == -1 && (i10 = this.f20366a) > 0) {
            view.setId(i10);
        }
        this.f20379n.L(this);
        return this;
    }

    public void r(boolean z10) {
        this.f20364D = z10;
        this.f20379n.N(false);
    }

    void s(boolean z10) {
        int i10 = this.f20390y;
        int i11 = (z10 ? 2 : 0) | (i10 & (-3));
        this.f20390y = i11;
        if (i10 != i11) {
            this.f20379n.N(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        if (this.f20375j == c10) {
            return this;
        }
        this.f20375j = Character.toLowerCase(c10);
        this.f20379n.N(false);
        return this;
    }

    @Override // p074e1.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f20375j == c10 && this.f20376k == i10) {
            return this;
        }
        this.f20375j = Character.toLowerCase(c10);
        this.f20376k = KeyEvent.normalizeMetaState(i10);
        this.f20379n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        int i10 = this.f20390y;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f20390y = i11;
        if (i10 != i11) {
            this.f20379n.N(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        if ((this.f20390y & 4) != 0) {
            this.f20379n.Y(this);
            return this;
        }
        s(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public p074e1.b setContentDescription(CharSequence charSequence) {
        this.f20383r = charSequence;
        this.f20379n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f20390y |= 16;
        } else {
            this.f20390y &= -17;
        }
        this.f20379n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f20377l = null;
        this.f20378m = i10;
        this.f20389x = true;
        this.f20379n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f20378m = 0;
        this.f20377l = drawable;
        this.f20389x = true;
        this.f20379n.N(false);
        return this;
    }

    @Override // p074e1.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f20385t = colorStateList;
        this.f20387v = true;
        this.f20389x = true;
        this.f20379n.N(false);
        return this;
    }

    @Override // p074e1.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f20386u = mode;
        this.f20388w = true;
        this.f20389x = true;
        this.f20379n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f20372g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        if (this.f20373h == c10) {
            return this;
        }
        this.f20373h = c10;
        this.f20379n.N(false);
        return this;
    }

    @Override // p074e1.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f20373h == c10 && this.f20374i == i10) {
            return this;
        }
        this.f20373h = c10;
        this.f20374i = KeyEvent.normalizeMetaState(i10);
        this.f20379n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f20363C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f20382q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f20373h = c10;
        this.f20375j = Character.toLowerCase(c11);
        this.f20379n.N(false);
        return this;
    }

    @Override // p074e1.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f20373h = c10;
        this.f20374i = KeyEvent.normalizeMetaState(i10);
        this.f20375j = Character.toLowerCase(c11);
        this.f20376k = KeyEvent.normalizeMetaState(i11);
        this.f20379n.N(false);
        return this;
    }

    @Override // p074e1.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f20391z = i10;
        this.f20379n.L(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        return setTitle(this.f20379n.w().getString(i10));
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f20370e = charSequence;
        this.f20379n.N(false);
        m mVar = this.f20380o;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f20371f = charSequence;
        this.f20379n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public p074e1.b setTooltipText(CharSequence charSequence) {
        this.f20384s = charSequence;
        this.f20379n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        if (y(z10)) {
            this.f20379n.M(this);
        }
        return this;
    }

    public void t(boolean z10) {
        this.f20390y = (z10 ? 4 : 0) | (this.f20390y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f20370e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z10) {
        if (z10) {
            this.f20390y |= 32;
        } else {
            this.f20390y &= -33;
        }
    }

    void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f20365E = contextMenuInfo;
    }

    @Override // p074e1.b, android.view.MenuItem
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public p074e1.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    public void x(m mVar) {
        this.f20380o = mVar;
        mVar.setHeaderTitle(getTitle());
    }

    boolean y(boolean z10) {
        int i10 = this.f20390y;
        int i11 = (z10 ? 0 : 8) | (i10 & (-9));
        this.f20390y = i11;
        return i10 != i11;
    }

    public boolean z() {
        return this.f20379n.C();
    }
}

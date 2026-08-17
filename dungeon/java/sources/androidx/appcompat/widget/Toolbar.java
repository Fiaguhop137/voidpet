package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AbstractC1812a;
import androidx.core.view.AbstractC1929s;
import androidx.core.view.C1939x;
import androidx.core.view.InterfaceC1937w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements InterfaceC1937w {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private ColorStateList f20735A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f20736B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f20737C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final ArrayList f20738D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final ArrayList f20739E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final int[] f20740F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    final C1939x f20741G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private ArrayList f20742H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    h f20743I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final ActionMenuView.e f20744J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private l0 f20745K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private C1815c f20746L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private f f20747M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private androidx.appcompat.view.menu.j.a f20748N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    androidx.appcompat.view.menu.e.a f20749O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private boolean f20750P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private OnBackInvokedCallback f20751Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private OnBackInvokedDispatcher f20752R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f20753S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final Runnable f20754T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ActionMenuView f20755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f20756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f20757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ImageButton f20758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ImageView f20759e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f20760f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private CharSequence f20761g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    ImageButton f20762h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    View f20763i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Context f20764j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f20765k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f20766l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f20767m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f20768n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f20769o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f20770p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f20771q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f20772r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f20773s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Z f20774t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f20775u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f20776v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f20777w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private CharSequence f20778x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private CharSequence f20779y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private ColorStateList f20780z;

    class a implements ActionMenuView.e {
        a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.f20741G.d(menuItem)) {
                return true;
            }
            h hVar = Toolbar.this.f20743I;
            if (hVar != null) {
                return hVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.S();
        }
    }

    class c implements androidx.appcompat.view.menu.e.a {
        c() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            androidx.appcompat.view.menu.e.a aVar = Toolbar.this.f20749O;
            return aVar != null && aVar.a(eVar, menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (!Toolbar.this.f20755a.H()) {
                Toolbar.this.f20741G.e(eVar);
            }
            androidx.appcompat.view.menu.e.a aVar = Toolbar.this.f20749O;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    static class e {
        static OnBackInvokedDispatcher a(@NonNull View view) {
            return view.findOnBackInvokedDispatcher();
        }

        @NonNull
        static OnBackInvokedCallback b(@NonNull Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new k0(runnable);
        }

        static void c(@NonNull Object obj, @NonNull Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        static void d(@NonNull Object obj, @NonNull Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    private class f implements androidx.appcompat.view.menu.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        androidx.appcompat.view.menu.e f20785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        androidx.appcompat.view.menu.g f20786b;

        f() {
        }

        @Override // androidx.appcompat.view.menu.j
        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean d(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.f20762h.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f20762h);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f20762h);
            }
            Toolbar.this.f20763i = gVar.getActionView();
            this.f20786b = gVar;
            ViewParent parent2 = Toolbar.this.f20763i.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f20763i);
                }
                g gVarGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                gVarGenerateDefaultLayoutParams.f19987a = (toolbar4.f20768n & 112) | 8388611;
                gVarGenerateDefaultLayoutParams.f20788b = 2;
                toolbar4.f20763i.setLayoutParams(gVarGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f20763i);
            }
            Toolbar.this.K();
            Toolbar.this.requestLayout();
            gVar.r(true);
            KeyEvent.Callback callback = Toolbar.this.f20763i;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).onActionViewExpanded();
            }
            Toolbar.this.T();
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public void f(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean g(androidx.appcompat.view.menu.m mVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.j
        public Parcelable h() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.j
        public void i(boolean z10) {
            if (this.f20786b != null) {
                androidx.appcompat.view.menu.e eVar = this.f20785a;
                if (eVar != null) {
                    int size = eVar.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f20785a.getItem(i10) == this.f20786b) {
                            return;
                        }
                    }
                }
                k(this.f20785a, this.f20786b);
            }
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean j() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean k(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            KeyEvent.Callback callback = Toolbar.this.f20763i;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f20763i);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f20762h);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f20763i = null;
            toolbar3.a();
            this.f20786b = null;
            Toolbar.this.requestLayout();
            gVar.r(false);
            Toolbar.this.T();
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public void l(Context context, androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.g gVar;
            androidx.appcompat.view.menu.e eVar2 = this.f20785a;
            if (eVar2 != null && (gVar = this.f20786b) != null) {
                eVar2.f(gVar);
            }
            this.f20785a = eVar;
        }
    }

    public static class g extends AbstractC1812a.C0251a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f20788b;

        public g(int i10, int i11) {
            super(i10, i11);
            this.f20788b = 0;
            this.f19987a = 8388627;
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f20788b = 0;
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f20788b = 0;
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f20788b = 0;
            a(marginLayoutParams);
        }

        public g(AbstractC1812a.C0251a c0251a) {
            super(c0251a);
            this.f20788b = 0;
        }

        public g(g gVar) {
            super((AbstractC1812a.C0251a) gVar);
            this.f20788b = 0;
            this.f20788b = gVar.f20788b;
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    public interface h {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public static class i extends p325s1.a {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f20789c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f20790d;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public i[] newArray(int i10) {
                return new i[i10];
            }
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f20789c = parcel.readInt();
            this.f20790d = parcel.readInt() != 0;
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // p325s1.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f20789c);
            parcel.writeInt(this.f20790d ? 1 : 0);
        }
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p144i.a.f43072M);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f20777w = 8388627;
        this.f20738D = new ArrayList();
        this.f20739E = new ArrayList();
        this.f20740F = new int[2];
        this.f20741G = new C1939x(new j0(this));
        this.f20742H = new ArrayList();
        this.f20744J = new a();
        this.f20754T = new b();
        h0 h0VarV = h0.v(getContext(), attributeSet, p144i.j.f43388d3, i10, 0);
        androidx.core.view.Z.k0(this, context, p144i.j.f43388d3, attributeSet, h0VarV.r(), i10, 0);
        this.f20766l = h0VarV.n(p144i.j.f43276F3, 0);
        this.f20767m = h0VarV.n(p144i.j.f43483w3, 0);
        this.f20777w = h0VarV.l(p144i.j.f43393e3, this.f20777w);
        this.f20768n = h0VarV.l(p144i.j.f43398f3, 48);
        int iE = h0VarV.e(p144i.j.f43498z3, 0);
        iE = h0VarV.s(p144i.j.f43271E3) ? h0VarV.e(p144i.j.f43271E3, iE) : iE;
        this.f20773s = iE;
        this.f20772r = iE;
        this.f20771q = iE;
        this.f20770p = iE;
        int iE2 = h0VarV.e(p144i.j.f43261C3, -1);
        if (iE2 >= 0) {
            this.f20770p = iE2;
        }
        int iE3 = h0VarV.e(p144i.j.f43256B3, -1);
        if (iE3 >= 0) {
            this.f20771q = iE3;
        }
        int iE4 = h0VarV.e(p144i.j.f43266D3, -1);
        if (iE4 >= 0) {
            this.f20772r = iE4;
        }
        int iE5 = h0VarV.e(p144i.j.f43251A3, -1);
        if (iE5 >= 0) {
            this.f20773s = iE5;
        }
        this.f20769o = h0VarV.f(p144i.j.f43453q3, -1);
        int iE6 = h0VarV.e(p144i.j.f43433m3, Integer.MIN_VALUE);
        int iE7 = h0VarV.e(p144i.j.f43413i3, Integer.MIN_VALUE);
        int iF = h0VarV.f(p144i.j.f43423k3, 0);
        int iF2 = h0VarV.f(p144i.j.f43428l3, 0);
        h();
        this.f20774t.e(iF, iF2);
        if (iE6 != Integer.MIN_VALUE || iE7 != Integer.MIN_VALUE) {
            this.f20774t.g(iE6, iE7);
        }
        this.f20775u = h0VarV.e(p144i.j.f43438n3, Integer.MIN_VALUE);
        this.f20776v = h0VarV.e(p144i.j.f43418j3, Integer.MIN_VALUE);
        this.f20760f = h0VarV.g(p144i.j.f43408h3);
        this.f20761g = h0VarV.p(p144i.j.f43403g3);
        CharSequence charSequenceP = h0VarV.p(p144i.j.f43493y3);
        if (!TextUtils.isEmpty(charSequenceP)) {
            setTitle(charSequenceP);
        }
        CharSequence charSequenceP2 = h0VarV.p(p144i.j.f43478v3);
        if (!TextUtils.isEmpty(charSequenceP2)) {
            setSubtitle(charSequenceP2);
        }
        this.f20764j = getContext();
        setPopupTheme(h0VarV.n(p144i.j.f43473u3, 0));
        Drawable drawableG = h0VarV.g(p144i.j.f43468t3);
        if (drawableG != null) {
            setNavigationIcon(drawableG);
        }
        CharSequence charSequenceP3 = h0VarV.p(p144i.j.f43463s3);
        if (!TextUtils.isEmpty(charSequenceP3)) {
            setNavigationContentDescription(charSequenceP3);
        }
        Drawable drawableG2 = h0VarV.g(p144i.j.f43443o3);
        if (drawableG2 != null) {
            setLogo(drawableG2);
        }
        CharSequence charSequenceP4 = h0VarV.p(p144i.j.f43448p3);
        if (!TextUtils.isEmpty(charSequenceP4)) {
            setLogoDescription(charSequenceP4);
        }
        if (h0VarV.s(p144i.j.f43281G3)) {
            setTitleTextColor(h0VarV.c(p144i.j.f43281G3));
        }
        if (h0VarV.s(p144i.j.f43488x3)) {
            setSubtitleTextColor(h0VarV.c(p144i.j.f43488x3));
        }
        if (h0VarV.s(p144i.j.f43458r3)) {
            z(h0VarV.n(p144i.j.f43458r3, 0));
        }
        h0VarV.x();
    }

    private boolean B(View view) {
        return view.getParent() == this || this.f20739E.contains(view);
    }

    private int E(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int iMax = i10 + Math.max(0, i12);
        iArr[0] = Math.max(0, -i12);
        int iR = r(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iR, iMax + measuredWidth, view.getMeasuredHeight() + iR);
        return iMax + measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).rightMargin;
    }

    private int F(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int iMax = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int iR = r(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iR, iMax, view.getMeasuredHeight() + iR);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    private int G(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i14) + Math.max(0, i15);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + iMax + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    private void H(View view, int i10, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i14 >= 0) {
            if (mode != 0) {
                i14 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i14);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void I() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.f20741G.b(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f20742H = currentMenuItems2;
    }

    private void J() {
        removeCallbacks(this.f20754T);
        post(this.f20754T);
    }

    private boolean Q() {
        if (!this.f20750P) {
            return false;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (R(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean R(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void b(List list, int i10) {
        boolean z10 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int iB = AbstractC1929s.b(i10, getLayoutDirection());
        list.clear();
        if (!z10) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f20788b == 0 && R(childAt) && q(gVar.f19987a) == iB) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            View childAt2 = getChildAt(i12);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.f20788b == 0 && R(childAt2) && q(gVar2.f19987a) == iB) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z10) {
        g gVarGenerateLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            gVarGenerateLayoutParams = generateDefaultLayoutParams();
        } else {
            gVarGenerateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (g) layoutParams;
        }
        gVarGenerateLayoutParams.f20788b = 1;
        if (!z10 || this.f20763i == null) {
            addView(view, gVarGenerateLayoutParams);
        } else {
            view.setLayoutParams(gVarGenerateLayoutParams);
            this.f20739E.add(view);
        }
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new androidx.appcompat.view.g(getContext());
    }

    private void h() {
        if (this.f20774t == null) {
            this.f20774t = new Z();
        }
    }

    private void i() {
        if (this.f20759e == null) {
            this.f20759e = new r(getContext());
        }
    }

    private void j() {
        k();
        if (this.f20755a.L() == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) this.f20755a.getMenu();
            if (this.f20747M == null) {
                this.f20747M = new f();
            }
            this.f20755a.setExpandedActionViewsExclusive(true);
            eVar.c(this.f20747M, this.f20764j);
            T();
        }
    }

    private void k() {
        if (this.f20755a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f20755a = actionMenuView;
            actionMenuView.setPopupTheme(this.f20765k);
            this.f20755a.setOnMenuItemClickListener(this.f20744J);
            this.f20755a.M(this.f20748N, new c());
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f19987a = (this.f20768n & 112) | 8388613;
            this.f20755a.setLayoutParams(gVarGenerateDefaultLayoutParams);
            c(this.f20755a, false);
        }
    }

    private void l() {
        if (this.f20758d == null) {
            this.f20758d = new C1828p(getContext(), null, p144i.a.f43071L);
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f19987a = (this.f20768n & 112) | 8388611;
            this.f20758d.setLayoutParams(gVarGenerateDefaultLayoutParams);
        }
    }

    private int q(int i10) {
        int layoutDirection = getLayoutDirection();
        int iB = AbstractC1929s.b(i10, layoutDirection) & 7;
        if (iB == 1 || iB == 3 || iB == 5) {
            return iB;
        }
        return layoutDirection == 1 ? 5 : 3;
    }

    private int r(View view, int i10) {
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int iS = s(gVar.f19987a);
        if (iS == 48) {
            return getPaddingTop() - i11;
        }
        if (iS == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
        if (iMax < i12) {
            iMax = i12;
        } else {
            int i13 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i14 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
            if (i13 < i14) {
                iMax = Math.max(0, iMax - (i14 - i13));
            }
        }
        return paddingTop + iMax;
    }

    private int s(int i10) {
        int i11 = i10 & 112;
        return (i11 == 16 || i11 == 48 || i11 == 80) ? i11 : this.f20777w & 112;
    }

    private int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    private int u(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int v(List list, int[] iArr) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int size = list.size();
        int i12 = 0;
        int measuredWidth = 0;
        while (i12 < size) {
            View view = (View) list.get(i12);
            g gVar = (g) view.getLayoutParams();
            int i13 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - i10;
            int i14 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - i11;
            int iMax = Math.max(0, i13);
            int iMax2 = Math.max(0, i14);
            int iMax3 = Math.max(0, -i13);
            int iMax4 = Math.max(0, -i14);
            measuredWidth += iMax + view.getMeasuredWidth() + iMax2;
            i12++;
            i11 = iMax4;
            i10 = iMax3;
        }
        return measuredWidth;
    }

    public void A() {
        Iterator it = this.f20742H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        I();
    }

    public boolean C() {
        ActionMenuView actionMenuView = this.f20755a;
        return actionMenuView != null && actionMenuView.G();
    }

    public boolean D() {
        ActionMenuView actionMenuView = this.f20755a;
        return actionMenuView != null && actionMenuView.H();
    }

    void K() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((g) childAt.getLayoutParams()).f20788b != 2 && childAt != this.f20755a) {
                removeViewAt(childCount);
                this.f20739E.add(childAt);
            }
        }
    }

    public void L(int i10, int i11) {
        h();
        this.f20774t.g(i10, i11);
    }

    public void M(androidx.appcompat.view.menu.e eVar, C1815c c1815c) {
        if (eVar == null && this.f20755a == null) {
            return;
        }
        k();
        androidx.appcompat.view.menu.e eVarL = this.f20755a.L();
        if (eVarL == eVar) {
            return;
        }
        if (eVarL != null) {
            eVarL.R(this.f20746L);
            eVarL.R(this.f20747M);
        }
        if (this.f20747M == null) {
            this.f20747M = new f();
        }
        c1815c.I(true);
        if (eVar != null) {
            eVar.c(c1815c, this.f20764j);
            eVar.c(this.f20747M, this.f20764j);
        } else {
            c1815c.l(this.f20764j, null);
            this.f20747M.l(this.f20764j, null);
            c1815c.i(true);
            this.f20747M.i(true);
        }
        this.f20755a.setPopupTheme(this.f20765k);
        this.f20755a.setPresenter(c1815c);
        this.f20746L = c1815c;
        T();
    }

    public void N(androidx.appcompat.view.menu.j.a aVar, androidx.appcompat.view.menu.e.a aVar2) {
        this.f20748N = aVar;
        this.f20749O = aVar2;
        ActionMenuView actionMenuView = this.f20755a;
        if (actionMenuView != null) {
            actionMenuView.M(aVar, aVar2);
        }
    }

    public void O(Context context, int i10) {
        this.f20767m = i10;
        TextView textView = this.f20757c;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public void P(Context context, int i10) {
        this.f20766l = i10;
        TextView textView = this.f20756b;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public boolean S() {
        ActionMenuView actionMenuView = this.f20755a;
        return actionMenuView != null && actionMenuView.N();
    }

    void T() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = e.a(this);
            boolean z10 = w() && onBackInvokedDispatcherA != null && isAttachedToWindow() && this.f20753S;
            if (z10 && this.f20752R == null) {
                if (this.f20751Q == null) {
                    this.f20751Q = e.b(new i0(this));
                }
                e.c(onBackInvokedDispatcherA, this.f20751Q);
                this.f20752R = onBackInvokedDispatcherA;
                return;
            }
            if (z10 || (onBackInvokedDispatcher = this.f20752R) == null) {
                return;
            }
            e.d(onBackInvokedDispatcher, this.f20751Q);
            this.f20752R = null;
        }
    }

    void a() {
        for (int size = this.f20739E.size() - 1; size >= 0; size--) {
            addView((View) this.f20739E.get(size));
        }
        this.f20739E.clear();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f20755a) != null && actionMenuView.I();
    }

    public void e() {
        f fVar = this.f20747M;
        androidx.appcompat.view.menu.g gVar = fVar == null ? null : fVar.f20786b;
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f20755a;
        if (actionMenuView != null) {
            actionMenuView.z();
        }
    }

    void g() {
        if (this.f20762h == null) {
            C1828p c1828p = new C1828p(getContext(), null, p144i.a.f43071L);
            this.f20762h = c1828p;
            c1828p.setImageDrawable(this.f20760f);
            this.f20762h.setContentDescription(this.f20761g);
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f19987a = (this.f20768n & 112) | 8388611;
            gVarGenerateDefaultLayoutParams.f20788b = 2;
            this.f20762h.setLayoutParams(gVarGenerateDefaultLayoutParams);
            this.f20762h.setOnClickListener(new d());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f20762h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f20762h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        Z z10 = this.f20774t;
        if (z10 != null) {
            return z10.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.f20776v;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        Z z10 = this.f20774t;
        if (z10 != null) {
            return z10.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        Z z10 = this.f20774t;
        if (z10 != null) {
            return z10.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        Z z10 = this.f20774t;
        if (z10 != null) {
            return z10.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.f20775u;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.e eVarL;
        ActionMenuView actionMenuView = this.f20755a;
        return (actionMenuView == null || (eVarL = actionMenuView.L()) == null || !eVarL.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f20776v, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f20775u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f20759e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f20759e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f20755a.getMenu();
    }

    View getNavButtonView() {
        return this.f20758d;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f20758d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f20758d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    C1815c getOuterActionMenuPresenter() {
        return this.f20746L;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f20755a.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f20764j;
    }

    public int getPopupTheme() {
        return this.f20765k;
    }

    public CharSequence getSubtitle() {
        return this.f20779y;
    }

    final TextView getSubtitleTextView() {
        return this.f20757c;
    }

    public CharSequence getTitle() {
        return this.f20778x;
    }

    public int getTitleMarginBottom() {
        return this.f20773s;
    }

    public int getTitleMarginEnd() {
        return this.f20771q;
    }

    public int getTitleMarginStart() {
        return this.f20770p;
    }

    public int getTitleMarginTop() {
        return this.f20772r;
    }

    final TextView getTitleTextView() {
        return this.f20756b;
    }

    public J getWrapper() {
        if (this.f20745K == null) {
            this.f20745K = new l0(this, true);
        }
        return this.f20745K;
    }

    @Override // androidx.core.view.InterfaceC1937w
    public void m(androidx.core.view.A a10) {
        this.f20741G.f(a10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        T();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f20754T);
        T();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f20737C = false;
        }
        if (!this.f20737C) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f20737C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f20737C = false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0280  */
    /* JADX WARN: Code duplicated, block: B:102:0x0283  */
    /* JADX WARN: Code duplicated, block: B:105:0x0297 A[LOOP:0: B:104:0x0295->B:105:0x0297, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:108:0x02b5 A[LOOP:1: B:107:0x02b3->B:108:0x02b5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:112:0x02dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x02df  */
    /* JADX WARN: Code duplicated, block: B:114:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:117:0x02ec A[LOOP:2: B:116:0x02ea->B:117:0x02ec, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0062  */
    /* JADX WARN: Code duplicated, block: B:21:0x0069  */
    /* JADX WARN: Code duplicated, block: B:24:0x0077 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0079  */
    /* JADX WARN: Code duplicated, block: B:26:0x0080  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:42:0x0104  */
    /* JADX WARN: Code duplicated, block: B:43:0x011d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0127 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0129  */
    /* JADX WARN: Code duplicated, block: B:50:0x012c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0130  */
    /* JADX WARN: Code duplicated, block: B:53:0x0133  */
    /* JADX WARN: Code duplicated, block: B:56:0x0145  */
    /* JADX WARN: Code duplicated, block: B:58:0x014d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:65:0x0166  */
    /* JADX WARN: Code duplicated, block: B:67:0x016a  */
    /* JADX WARN: Code duplicated, block: B:69:0x017d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0180  */
    /* JADX WARN: Code duplicated, block: B:72:0x018c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0198  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:77:0x01af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:83:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:86:0x0212  */
    /* JADX WARN: Code duplicated, block: B:88:0x0215  */
    /* JADX WARN: Code duplicated, block: B:90:0x021e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0220  */
    /* JADX WARN: Code duplicated, block: B:93:0x0224  */
    /* JADX WARN: Code duplicated, block: B:96:0x0238  */
    /* JADX WARN: Code duplicated, block: B:97:0x025b  */
    /* JADX WARN: Code duplicated, block: B:99:0x025e  */
    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iE;
        int iF;
        int iMax;
        int iMin;
        boolean zR;
        boolean zR2;
        int measuredHeight;
        TextView textView;
        TextView textView2;
        g gVar;
        g gVar2;
        int i14;
        boolean z11;
        int i15;
        int i16;
        int paddingTop;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int iMax2;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int size;
        int iE2;
        int i29;
        int size2;
        int i30;
        int i31;
        int i32;
        int size3;
        boolean z12 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i33 = width - paddingRight;
        int[] iArr = this.f20740F;
        iArr[1] = 0;
        iArr[0] = 0;
        int iA = androidx.core.view.Z.A(this);
        int iMin2 = iA >= 0 ? Math.min(iA, i13 - i11) : 0;
        if (R(this.f20758d)) {
            if (z12) {
                iF = F(this.f20758d, i33, iArr, iMin2);
                iE = paddingLeft;
            } else {
                iE = E(this.f20758d, paddingLeft, iArr, iMin2);
            }
            if (R(this.f20762h)) {
                if (z12) {
                    iF = F(this.f20762h, iF, iArr, iMin2);
                } else {
                    iE = E(this.f20762h, iE, iArr, iMin2);
                }
            }
            if (R(this.f20755a)) {
                if (z12) {
                    iE = E(this.f20755a, iE, iArr, iMin2);
                } else {
                    iF = F(this.f20755a, iF, iArr, iMin2);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iE);
            iArr[1] = Math.max(0, currentContentInsetRight - (i33 - iF));
            iMax = Math.max(iE, currentContentInsetLeft);
            iMin = Math.min(iF, i33 - currentContentInsetRight);
            if (R(this.f20763i)) {
                if (z12) {
                    iMin = F(this.f20763i, iMin, iArr, iMin2);
                } else {
                    iMax = E(this.f20763i, iMax, iArr, iMin2);
                }
            }
            if (R(this.f20759e)) {
                if (z12) {
                    iMin = F(this.f20759e, iMin, iArr, iMin2);
                } else {
                    iMax = E(this.f20759e, iMax, iArr, iMin2);
                }
            }
            zR = R(this.f20756b);
            zR2 = R(this.f20757c);
            if (zR) {
                g gVar3 = (g) this.f20756b.getLayoutParams();
                measuredHeight = ((ViewGroup.MarginLayoutParams) gVar3).bottomMargin + ((ViewGroup.MarginLayoutParams) gVar3).topMargin + this.f20756b.getMeasuredHeight();
            } else {
                measuredHeight = 0;
            }
            if (zR2) {
                g gVar4 = (g) this.f20757c.getLayoutParams();
                measuredHeight += ((ViewGroup.MarginLayoutParams) gVar4).topMargin + this.f20757c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar4).bottomMargin;
            }
            if (!zR || zR2) {
                if (zR) {
                    textView = this.f20756b;
                } else {
                    textView = this.f20757c;
                }
                if (zR2) {
                    textView2 = this.f20757c;
                } else {
                    textView2 = this.f20756b;
                }
                gVar = (g) textView.getLayoutParams();
                gVar2 = (g) textView2.getLayoutParams();
                i14 = measuredHeight;
                z11 = (!zR && this.f20756b.getMeasuredWidth() > 0) || (zR2 && this.f20757c.getMeasuredWidth() > 0);
                i15 = this.f20777w & 112;
                i16 = iMax;
                if (i15 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + this.f20772r;
                } else if (i15 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - i14) / 2;
                    i24 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
                    i25 = this.f20772r;
                    if (iMax2 < i24 + i25) {
                        iMax2 = i24 + i25;
                    } else {
                        i26 = (((height - paddingBottom) - i14) - iMax2) - paddingTop2;
                        i27 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                        i28 = this.f20773s;
                        if (i26 < i27 + i28) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) gVar2).bottomMargin + i28) - i26));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin) - this.f20773s) - i14;
                }
                if (z12) {
                    if (z11) {
                        i21 = this.f20770p;
                    } else {
                        i21 = 0;
                    }
                    int i34 = i21 - iArr[1];
                    iMin -= Math.max(0, i34);
                    iArr[1] = Math.max(0, -i34);
                    if (zR) {
                        g gVar5 = (g) this.f20756b.getLayoutParams();
                        int measuredWidth = iMin - this.f20756b.getMeasuredWidth();
                        int measuredHeight2 = this.f20756b.getMeasuredHeight() + paddingTop;
                        this.f20756b.layout(measuredWidth, paddingTop, iMin, measuredHeight2);
                        i22 = measuredWidth - this.f20771q;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) gVar5).bottomMargin;
                    } else {
                        i22 = iMin;
                    }
                    if (zR2) {
                        int i35 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f20757c.getLayoutParams())).topMargin;
                        this.f20757c.layout(iMin - this.f20757c.getMeasuredWidth(), i35, iMin, this.f20757c.getMeasuredHeight() + i35);
                        i23 = iMin - this.f20771q;
                    } else {
                        i23 = iMin;
                    }
                    if (z11) {
                        iMin = Math.min(i22, i23);
                    }
                    iMax = i16;
                    i18 = 0;
                } else {
                    if (z11) {
                        i17 = this.f20770p;
                    } else {
                        i17 = 0;
                    }
                    i18 = 0;
                    int i36 = i17 - iArr[0];
                    iMax = i16 + Math.max(0, i36);
                    iArr[0] = Math.max(0, -i36);
                    if (zR) {
                        g gVar6 = (g) this.f20756b.getLayoutParams();
                        int measuredWidth2 = this.f20756b.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.f20756b.getMeasuredHeight() + paddingTop;
                        this.f20756b.layout(iMax, paddingTop, measuredWidth2, measuredHeight3);
                        i19 = measuredWidth2 + this.f20771q;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) gVar6).bottomMargin;
                    } else {
                        i19 = iMax;
                    }
                    if (zR2) {
                        int i37 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f20757c.getLayoutParams())).topMargin;
                        int measuredWidth3 = this.f20757c.getMeasuredWidth() + iMax;
                        this.f20757c.layout(iMax, i37, measuredWidth3, this.f20757c.getMeasuredHeight() + i37);
                        i20 = measuredWidth3 + this.f20771q;
                    } else {
                        i20 = iMax;
                    }
                    if (z11) {
                        iMax = Math.max(i19, i20);
                    }
                }
            } else {
                i18 = 0;
            }
            b(this.f20738D, 3);
            size = this.f20738D.size();
            iE2 = iMax;
            for (i29 = i18; i29 < size; i29++) {
                iE2 = E((View) this.f20738D.get(i29), iE2, iArr, iMin2);
            }
            b(this.f20738D, 5);
            size2 = this.f20738D.size();
            for (i30 = i18; i30 < size2; i30++) {
                iMin = F((View) this.f20738D.get(i30), iMin, iArr, iMin2);
            }
            b(this.f20738D, 1);
            int iV = v(this.f20738D, iArr);
            i31 = (paddingLeft + (((width - paddingLeft) - paddingRight) / 2)) - (iV / 2);
            i32 = iV + i31;
            if (i31 >= iE2) {
                if (i32 > iMin) {
                    iE2 = i31 - (i32 - iMin);
                } else {
                    iE2 = i31;
                }
            }
            size3 = this.f20738D.size();
            while (i18 < size3) {
                iE2 = E((View) this.f20738D.get(i18), iE2, iArr, iMin2);
                i18++;
            }
            this.f20738D.clear();
        }
        iE = paddingLeft;
        iF = i33;
        if (R(this.f20762h)) {
            if (z12) {
                iF = F(this.f20762h, iF, iArr, iMin2);
            } else {
                iE = E(this.f20762h, iE, iArr, iMin2);
            }
        }
        if (R(this.f20755a)) {
            if (z12) {
                iE = E(this.f20755a, iE, iArr, iMin2);
            } else {
                iF = F(this.f20755a, iF, iArr, iMin2);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iE);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i33 - iF));
        iMax = Math.max(iE, currentContentInsetLeft2);
        iMin = Math.min(iF, i33 - currentContentInsetRight2);
        if (R(this.f20763i)) {
            if (z12) {
                iMin = F(this.f20763i, iMin, iArr, iMin2);
            } else {
                iMax = E(this.f20763i, iMax, iArr, iMin2);
            }
        }
        if (R(this.f20759e)) {
            if (z12) {
                iMin = F(this.f20759e, iMin, iArr, iMin2);
            } else {
                iMax = E(this.f20759e, iMax, iArr, iMin2);
            }
        }
        zR = R(this.f20756b);
        zR2 = R(this.f20757c);
        if (zR) {
            g gVar7 = (g) this.f20756b.getLayoutParams();
            measuredHeight = ((ViewGroup.MarginLayoutParams) gVar7).bottomMargin + ((ViewGroup.MarginLayoutParams) gVar7).topMargin + this.f20756b.getMeasuredHeight();
        } else {
            measuredHeight = 0;
        }
        if (zR2) {
            g gVar8 = (g) this.f20757c.getLayoutParams();
            measuredHeight += ((ViewGroup.MarginLayoutParams) gVar8).topMargin + this.f20757c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar8).bottomMargin;
        }
        if (zR) {
            if (zR) {
                textView = this.f20756b;
            } else {
                textView = this.f20757c;
            }
            if (zR2) {
                textView2 = this.f20757c;
            } else {
                textView2 = this.f20756b;
            }
            gVar = (g) textView.getLayoutParams();
            gVar2 = (g) textView2.getLayoutParams();
            i14 = measuredHeight;
            if (zR) {
            }
            i15 = this.f20777w & 112;
            i16 = iMax;
            if (i15 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + this.f20772r;
            } else if (i15 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i14) / 2;
                i24 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
                i25 = this.f20772r;
                if (iMax2 < i24 + i25) {
                    iMax2 = i24 + i25;
                } else {
                    i26 = (((height - paddingBottom) - i14) - iMax2) - paddingTop2;
                    i27 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                    i28 = this.f20773s;
                    if (i26 < i27 + i28) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) gVar2).bottomMargin + i28) - i26));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin) - this.f20773s) - i14;
            }
            if (z12) {
                if (z11) {
                    i21 = this.f20770p;
                } else {
                    i21 = 0;
                }
                int i38 = i21 - iArr[1];
                iMin -= Math.max(0, i38);
                iArr[1] = Math.max(0, -i38);
                if (zR) {
                    g gVar9 = (g) this.f20756b.getLayoutParams();
                    int measuredWidth4 = iMin - this.f20756b.getMeasuredWidth();
                    int measuredHeight4 = this.f20756b.getMeasuredHeight() + paddingTop;
                    this.f20756b.layout(measuredWidth4, paddingTop, iMin, measuredHeight4);
                    i22 = measuredWidth4 - this.f20771q;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) gVar9).bottomMargin;
                } else {
                    i22 = iMin;
                }
                if (zR2) {
                    int i39 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f20757c.getLayoutParams())).topMargin;
                    this.f20757c.layout(iMin - this.f20757c.getMeasuredWidth(), i39, iMin, this.f20757c.getMeasuredHeight() + i39);
                    i23 = iMin - this.f20771q;
                } else {
                    i23 = iMin;
                }
                if (z11) {
                    iMin = Math.min(i22, i23);
                }
                iMax = i16;
                i18 = 0;
            } else {
                if (z11) {
                    i17 = this.f20770p;
                } else {
                    i17 = 0;
                }
                i18 = 0;
                int i310 = i17 - iArr[0];
                iMax = i16 + Math.max(0, i310);
                iArr[0] = Math.max(0, -i310);
                if (zR) {
                    g gVar10 = (g) this.f20756b.getLayoutParams();
                    int measuredWidth5 = this.f20756b.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.f20756b.getMeasuredHeight() + paddingTop;
                    this.f20756b.layout(iMax, paddingTop, measuredWidth5, measuredHeight5);
                    i19 = measuredWidth5 + this.f20771q;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) gVar10).bottomMargin;
                } else {
                    i19 = iMax;
                }
                if (zR2) {
                    int i311 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f20757c.getLayoutParams())).topMargin;
                    int measuredWidth6 = this.f20757c.getMeasuredWidth() + iMax;
                    this.f20757c.layout(iMax, i311, measuredWidth6, this.f20757c.getMeasuredHeight() + i311);
                    i20 = measuredWidth6 + this.f20771q;
                } else {
                    i20 = iMax;
                }
                if (z11) {
                    iMax = Math.max(i19, i20);
                }
            }
        } else {
            if (zR) {
                textView = this.f20756b;
            } else {
                textView = this.f20757c;
            }
            if (zR2) {
                textView2 = this.f20757c;
            } else {
                textView2 = this.f20756b;
            }
            gVar = (g) textView.getLayoutParams();
            gVar2 = (g) textView2.getLayoutParams();
            i14 = measuredHeight;
            if (zR) {
            }
            i15 = this.f20777w & 112;
            i16 = iMax;
            if (i15 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + this.f20772r;
            } else if (i15 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i14) / 2;
                i24 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
                i25 = this.f20772r;
                if (iMax2 < i24 + i25) {
                    iMax2 = i24 + i25;
                } else {
                    i26 = (((height - paddingBottom) - i14) - iMax2) - paddingTop2;
                    i27 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                    i28 = this.f20773s;
                    if (i26 < i27 + i28) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) gVar2).bottomMargin + i28) - i26));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin) - this.f20773s) - i14;
            }
            if (z12) {
                if (z11) {
                    i21 = this.f20770p;
                } else {
                    i21 = 0;
                }
                int i312 = i21 - iArr[1];
                iMin -= Math.max(0, i312);
                iArr[1] = Math.max(0, -i312);
                if (zR) {
                    g gVar11 = (g) this.f20756b.getLayoutParams();
                    int measuredWidth7 = iMin - this.f20756b.getMeasuredWidth();
                    int measuredHeight6 = this.f20756b.getMeasuredHeight() + paddingTop;
                    this.f20756b.layout(measuredWidth7, paddingTop, iMin, measuredHeight6);
                    i22 = measuredWidth7 - this.f20771q;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) gVar11).bottomMargin;
                } else {
                    i22 = iMin;
                }
                if (zR2) {
                    int i313 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f20757c.getLayoutParams())).topMargin;
                    this.f20757c.layout(iMin - this.f20757c.getMeasuredWidth(), i313, iMin, this.f20757c.getMeasuredHeight() + i313);
                    i23 = iMin - this.f20771q;
                } else {
                    i23 = iMin;
                }
                if (z11) {
                    iMin = Math.min(i22, i23);
                }
                iMax = i16;
                i18 = 0;
            } else {
                if (z11) {
                    i17 = this.f20770p;
                } else {
                    i17 = 0;
                }
                i18 = 0;
                int i314 = i17 - iArr[0];
                iMax = i16 + Math.max(0, i314);
                iArr[0] = Math.max(0, -i314);
                if (zR) {
                    g gVar12 = (g) this.f20756b.getLayoutParams();
                    int measuredWidth8 = this.f20756b.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.f20756b.getMeasuredHeight() + paddingTop;
                    this.f20756b.layout(iMax, paddingTop, measuredWidth8, measuredHeight7);
                    i19 = measuredWidth8 + this.f20771q;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) gVar12).bottomMargin;
                } else {
                    i19 = iMax;
                }
                if (zR2) {
                    int i315 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f20757c.getLayoutParams())).topMargin;
                    int measuredWidth9 = this.f20757c.getMeasuredWidth() + iMax;
                    this.f20757c.layout(iMax, i315, measuredWidth9, this.f20757c.getMeasuredHeight() + i315);
                    i20 = measuredWidth9 + this.f20771q;
                } else {
                    i20 = iMax;
                }
                if (z11) {
                    iMax = Math.max(i19, i20);
                }
            }
        }
        b(this.f20738D, 3);
        size = this.f20738D.size();
        iE2 = iMax;
        while (i29 < size) {
            iE2 = E((View) this.f20738D.get(i29), iE2, iArr, iMin2);
        }
        b(this.f20738D, 5);
        size2 = this.f20738D.size();
        while (i30 < size2) {
            iMin = F((View) this.f20738D.get(i30), iMin, iArr, iMin2);
        }
        b(this.f20738D, 1);
        int iV2 = v(this.f20738D, iArr);
        i31 = (paddingLeft + (((width - paddingLeft) - paddingRight) / 2)) - (iV2 / 2);
        i32 = iV2 + i31;
        if (i31 >= iE2) {
            if (i32 > iMin) {
                iE2 = i31 - (i32 - iMin);
            } else {
                iE2 = i31;
            }
        }
        size3 = this.f20738D.size();
        while (i18 < size3) {
            iE2 = E((View) this.f20738D.get(i18), iE2, iArr, iMin2);
            i18++;
        }
        this.f20738D.clear();
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int[] iArr;
        int iMax2;
        int iCombineMeasuredStates2;
        int measuredHeight;
        int[] iArr2 = this.f20740F;
        boolean zB = s0.b(this);
        int i12 = !zB ? 1 : 0;
        if (R(this.f20758d)) {
            H(this.f20758d, i10, 0, i11, 0, this.f20769o);
            measuredWidth = this.f20758d.getMeasuredWidth() + t(this.f20758d);
            iMax = Math.max(0, this.f20758d.getMeasuredHeight() + u(this.f20758d));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f20758d.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (R(this.f20762h)) {
            H(this.f20762h, i10, 0, i11, 0, this.f20769o);
            measuredWidth = this.f20762h.getMeasuredWidth() + t(this.f20762h);
            iMax = Math.max(iMax, this.f20762h.getMeasuredHeight() + u(this.f20762h));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f20762h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, measuredWidth);
        iArr2[zB ? 1 : 0] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (R(this.f20755a)) {
            H(this.f20755a, i10, iMax3, i11, 0, this.f20769o);
            measuredWidth2 = this.f20755a.getMeasuredWidth() + t(this.f20755a);
            iMax = Math.max(iMax, this.f20755a.getMeasuredHeight() + u(this.f20755a));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f20755a.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr2[i12] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (R(this.f20763i)) {
            iArr = iArr2;
            iMax4 += G(this.f20763i, i10, iMax4, i11, 0, iArr);
            iMax = Math.max(iMax, this.f20763i.getMeasuredHeight() + u(this.f20763i));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f20763i.getMeasuredState());
        } else {
            iArr = iArr2;
        }
        if (R(this.f20759e)) {
            iMax4 += G(this.f20759e, i10, iMax4, i11, 0, iArr);
            iMax = Math.max(iMax, this.f20759e.getMeasuredHeight() + u(this.f20759e));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f20759e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((g) childAt.getLayoutParams()).f20788b == 0 && R(childAt)) {
                iMax4 += G(childAt, i10, iMax4, i11, 0, iArr);
                int iMax5 = Math.max(iMax, childAt.getMeasuredHeight() + u(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax5;
            } else {
                iMax4 = iMax4;
            }
        }
        int i14 = iMax4;
        int i15 = this.f20772r + this.f20773s;
        int i16 = this.f20770p + this.f20771q;
        if (R(this.f20756b)) {
            G(this.f20756b, i10, i14 + i16, i11, i15, iArr);
            int measuredWidth3 = this.f20756b.getMeasuredWidth() + t(this.f20756b);
            int measuredHeight2 = this.f20756b.getMeasuredHeight() + u(this.f20756b);
            iMax2 = measuredWidth3;
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f20756b.getMeasuredState());
            measuredHeight = measuredHeight2;
        } else {
            iMax2 = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            measuredHeight = 0;
        }
        if (R(this.f20757c)) {
            iMax2 = Math.max(iMax2, G(this.f20757c, i10, i14 + i16, i11, i15 + measuredHeight, iArr));
            measuredHeight += this.f20757c.getMeasuredHeight() + u(this.f20757c);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f20757c.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i14 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, (-16777216) & iCombineMeasuredStates2), Q() ? 0 : View.resolveSizeAndState(Math.max(Math.max(iMax, measuredHeight) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.f());
        ActionMenuView actionMenuView = this.f20755a;
        androidx.appcompat.view.menu.e eVarL = actionMenuView != null ? actionMenuView.L() : null;
        int i10 = iVar.f20789c;
        if (i10 != 0 && this.f20747M != null && eVarL != null && (menuItemFindItem = eVarL.findItem(i10)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (iVar.f20790d) {
            J();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        h();
        this.f20774t.f(i10 == 1);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.g gVar;
        i iVar = new i(super.onSaveInstanceState());
        f fVar = this.f20747M;
        if (fVar != null && (gVar = fVar.f20786b) != null) {
            iVar.f20789c = gVar.getItemId();
        }
        iVar.f20790d = D();
        return iVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f20736B = false;
        }
        if (!this.f20736B) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f20736B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f20736B = false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof g) {
            return new g((g) layoutParams);
        }
        if (layoutParams instanceof AbstractC1812a.C0251a) {
            return new g((AbstractC1812a.C0251a) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new g((ViewGroup.MarginLayoutParams) layoutParams) : new g(layoutParams);
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.f20753S != z10) {
            this.f20753S = z10;
            T();
        }
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f20762h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(p161j.a.b(getContext(), i10));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.f20762h.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f20762h;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f20760f);
            }
        }
    }

    public void setCollapsible(boolean z10) {
        this.f20750P = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f20776v) {
            this.f20776v = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f20775u) {
            this.f20775u = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(p161j.a.b(getContext(), i10));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!B(this.f20759e)) {
                c(this.f20759e, true);
            }
        } else {
            ImageView imageView = this.f20759e;
            if (imageView != null && B(imageView)) {
                removeView(this.f20759e);
                this.f20739E.remove(this.f20759e);
            }
        }
        ImageView imageView2 = this.f20759e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f20759e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f20758d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            m0.a(this.f20758d, charSequence);
        }
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(p161j.a.b(getContext(), i10));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!B(this.f20758d)) {
                c(this.f20758d, true);
            }
        } else {
            ImageButton imageButton = this.f20758d;
            if (imageButton != null && B(imageButton)) {
                removeView(this.f20758d);
                this.f20739E.remove(this.f20758d);
            }
        }
        ImageButton imageButton2 = this.f20758d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f20758d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
        this.f20743I = hVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f20755a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f20765k != i10) {
            this.f20765k = i10;
            if (i10 == 0) {
                this.f20764j = getContext();
            } else {
                this.f20764j = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f20757c;
            if (textView != null && B(textView)) {
                removeView(this.f20757c);
                this.f20739E.remove(this.f20757c);
            }
        } else {
            if (this.f20757c == null) {
                Context context = getContext();
                D d10 = new D(context);
                this.f20757c = d10;
                d10.setSingleLine();
                this.f20757c.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f20767m;
                if (i10 != 0) {
                    this.f20757c.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f20735A;
                if (colorStateList != null) {
                    this.f20757c.setTextColor(colorStateList);
                }
            }
            if (!B(this.f20757c)) {
                c(this.f20757c, true);
            }
        }
        TextView textView2 = this.f20757c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f20779y = charSequence;
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setSubtitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f20735A = colorStateList;
        TextView textView = this.f20757c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f20756b;
            if (textView != null && B(textView)) {
                removeView(this.f20756b);
                this.f20739E.remove(this.f20756b);
            }
        } else {
            if (this.f20756b == null) {
                Context context = getContext();
                D d10 = new D(context);
                this.f20756b = d10;
                d10.setSingleLine();
                this.f20756b.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f20766l;
                if (i10 != 0) {
                    this.f20756b.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f20780z;
                if (colorStateList != null) {
                    this.f20756b.setTextColor(colorStateList);
                }
            }
            if (!B(this.f20756b)) {
                c(this.f20756b, true);
            }
        }
        TextView textView2 = this.f20756b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f20778x = charSequence;
    }

    public void setTitleMarginBottom(int i10) {
        this.f20773s = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f20771q = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f20770p = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f20772r = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f20780z = colorStateList;
        TextView textView = this.f20756b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public boolean w() {
        f fVar = this.f20747M;
        return (fVar == null || fVar.f20786b == null) ? false : true;
    }

    @Override // androidx.core.view.InterfaceC1937w
    public void x(androidx.core.view.A a10) {
        this.f20741G.a(a10);
    }

    public boolean y() {
        ActionMenuView actionMenuView = this.f20755a;
        return actionMenuView != null && actionMenuView.F();
    }

    public void z(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }
}

package com.swmansion.rnscreens.gamma.tabs;

import android.content.res.Configuration;
import android.view.Choreographer;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.x;
import com.facebook.react.uimanager.C2262k0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends LinearLayout implements com.swmansion.rnscreens.gamma.tabs.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2262k0 f39114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f39115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.appcompat.view.d f39116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.material.bottomnavigation.c f39117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final FrameLayout f39118e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r f39119f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private androidx.fragment.app.q f39120g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f39121h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Integer f39122i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f39123j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.swmansion.rnscreens.gamma.tabs.p f39124k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Pd.d f39125l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Pd.d f39126m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Pd.d f39127n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Pd.d f39128o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Pd.d f39129p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Pd.d f39130q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Pd.d f39131r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Pd.d f39132s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Pd.d f39133t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Pd.d f39134u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Pd.d f39135v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Pd.d f39136w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Pd.d f39137x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Pd.d f39138y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Choreographer.FrameCallback f39139z;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.k[] f39113B = {F.d(new kotlin.jvm.internal.q(m.class, "tabBarBackgroundColor", "getTabBarBackgroundColor()Ljava/lang/Integer;", 0)), F.d(new kotlin.jvm.internal.q(m.class, "tabBarItemActiveIndicatorColor", "getTabBarItemActiveIndicatorColor()Ljava/lang/Integer;", 0)), F.d(new kotlin.jvm.internal.q(m.class, "isTabBarItemActiveIndicatorEnabled", "isTabBarItemActiveIndicatorEnabled()Z", 0)), F.d(new kotlin.jvm.internal.q(m.class, "tabBarItemIconColor", "getTabBarItemIconColor()Ljava/lang/Integer;", 0)), F.d(new kotlin.jvm.internal.q(m.class, "tabBarItemTitleFontFamily", "getTabBarItemTitleFontFamily()Ljava/lang/String;", 0)), F.d(new kotlin.jvm.internal.q(m.class, "tabBarItemIconColorActive", "getTabBarItemIconColorActive()Ljava/lang/Integer;", 0)), F.d(new kotlin.jvm.internal.q(m.class, "tabBarItemTitleFontColor", "getTabBarItemTitleFontColor()Ljava/lang/Integer;", 0)), F.d(new kotlin.jvm.internal.q(m.class, "tabBarItemTitleFontColorActive", "getTabBarItemTitleFontColorActive()Ljava/lang/Integer;", 0)), F.d(new kotlin.jvm.internal.q(m.class, "tabBarItemTitleFontSize", "getTabBarItemTitleFontSize()Ljava/lang/Float;", 0)), F.d(new kotlin.jvm.internal.q(m.class, "tabBarItemTitleFontSizeActive", "getTabBarItemTitleFontSizeActive()Ljava/lang/Float;", 0)), F.d(new kotlin.jvm.internal.q(m.class, "tabBarItemTitleFontWeight", "getTabBarItemTitleFontWeight()Ljava/lang/String;", 0)), F.d(new kotlin.jvm.internal.q(m.class, "tabBarItemTitleFontStyle", "getTabBarItemTitleFontStyle()Ljava/lang/String;", 0)), F.d(new kotlin.jvm.internal.q(m.class, "tabBarItemRippleColor", "getTabBarItemRippleColor()Ljava/lang/Integer;", 0)), F.d(new kotlin.jvm.internal.q(m.class, "tabBarItemLabelVisibilityMode", "getTabBarItemLabelVisibilityMode()Ljava/lang/String;", 0))};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final a f39112A = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f39140a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f39141b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f39142c;

        public b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(b bVar) {
            bVar.i();
        }

        private final void i() {
            if (this.f39140a) {
                h();
            }
        }

        public final void b() {
            d();
            c();
        }

        public final void c() {
            this.f39142c = true;
        }

        public final void d() {
            this.f39141b = true;
        }

        public final void e() {
            this.f39140a = true;
            m.this.post(new com.swmansion.rnscreens.gamma.tabs.n(this));
        }

        public final void g() {
            if (this.f39140a) {
                return;
            }
            e();
        }

        public final void h() {
            this.f39140a = false;
            if (this.f39141b) {
                this.f39141b = false;
                m.this.H();
            }
            if (this.f39142c) {
                this.f39142c = false;
                m.this.E();
            }
        }
    }

    public static final class c extends Pd.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f39144b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Object obj, m mVar) {
            super(obj);
            this.f39144b = mVar;
        }

        @Override // Pd.b
        protected void c(kotlin.reflect.k property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            m mVar = this.f39144b;
            mVar.G((Float) obj, (Float) obj2);
        }
    }

    public static final class d extends Pd.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f39145b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Object obj, m mVar) {
            super(obj);
            this.f39145b = mVar;
        }

        @Override // Pd.b
        protected void c(kotlin.reflect.k property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            m mVar = this.f39145b;
            mVar.G((String) obj, (String) obj2);
        }
    }

    public static final class e extends Pd.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f39146b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Object obj, m mVar) {
            super(obj);
            this.f39146b = mVar;
        }

        @Override // Pd.b
        protected void c(kotlin.reflect.k property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            m mVar = this.f39146b;
            mVar.G((String) obj, (String) obj2);
        }
    }

    public static final class f extends Pd.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f39147b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Object obj, m mVar) {
            super(obj);
            this.f39147b = mVar;
        }

        @Override // Pd.b
        protected void c(kotlin.reflect.k property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            m mVar = this.f39147b;
            mVar.G((Integer) obj, (Integer) obj2);
        }
    }

    public static final class g extends Pd.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f39148b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Object obj, m mVar) {
            super(obj);
            this.f39148b = mVar;
        }

        @Override // Pd.b
        protected void c(kotlin.reflect.k property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            m mVar = this.f39148b;
            mVar.G((String) obj, (String) obj2);
        }
    }

    public static final class h extends Pd.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f39149b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Object obj, m mVar) {
            super(obj);
            this.f39149b = mVar;
        }

        @Override // Pd.b
        protected void c(kotlin.reflect.k property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            m mVar = this.f39149b;
            mVar.G((Integer) obj, (Integer) obj2);
        }
    }

    public static final class i extends Pd.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f39150b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Object obj, m mVar) {
            super(obj);
            this.f39150b = mVar;
        }

        @Override // Pd.b
        protected void c(kotlin.reflect.k property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            m mVar = this.f39150b;
            mVar.G((Integer) obj, (Integer) obj2);
        }
    }

    public static final class j extends Pd.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f39151b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Object obj, m mVar) {
            super(obj);
            this.f39151b = mVar;
        }

        @Override // Pd.b
        protected void c(kotlin.reflect.k property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            Boolean bool = (Boolean) obj2;
            bool.booleanValue();
            Boolean bool2 = (Boolean) obj;
            bool2.booleanValue();
            this.f39151b.G(bool2, bool);
        }
    }

    public static final class k extends Pd.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f39152b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Object obj, m mVar) {
            super(obj);
            this.f39152b = mVar;
        }

        @Override // Pd.b
        protected void c(kotlin.reflect.k property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            m mVar = this.f39152b;
            mVar.G((Integer) obj, (Integer) obj2);
        }
    }

    public static final class l extends Pd.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f39153b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Object obj, m mVar) {
            super(obj);
            this.f39153b = mVar;
        }

        @Override // Pd.b
        protected void c(kotlin.reflect.k property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            m mVar = this.f39153b;
            mVar.G((String) obj, (String) obj2);
        }
    }

    /* JADX INFO: renamed from: com.swmansion.rnscreens.gamma.tabs.m$m, reason: collision with other inner class name */
    public static final class C0431m extends Pd.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f39154b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0431m(Object obj, m mVar) {
            super(obj);
            this.f39154b = mVar;
        }

        @Override // Pd.b
        protected void c(kotlin.reflect.k property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            m mVar = this.f39154b;
            mVar.G((Integer) obj, (Integer) obj2);
        }
    }

    public static final class n extends Pd.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f39155b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Object obj, m mVar) {
            super(obj);
            this.f39155b = mVar;
        }

        @Override // Pd.b
        protected void c(kotlin.reflect.k property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            m mVar = this.f39155b;
            mVar.G((Integer) obj, (Integer) obj2);
        }
    }

    public static final class o extends Pd.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f39156b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Object obj, m mVar) {
            super(obj);
            this.f39156b = mVar;
        }

        @Override // Pd.b
        protected void c(kotlin.reflect.k property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            m mVar = this.f39156b;
            mVar.G((Integer) obj, (Integer) obj2);
        }
    }

    public static final class p extends Pd.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f39157b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Object obj, m mVar) {
            super(obj);
            this.f39157b = mVar;
        }

        @Override // Pd.b
        protected void c(kotlin.reflect.k property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            m mVar = this.f39157b;
            mVar.G((Float) obj, (Float) obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(C2262k0 reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f39114a = reactContext;
        this.f39115b = new b();
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(reactContext, Y8.j.f17200e);
        this.f39116c = dVar;
        com.google.android.material.bottomnavigation.c cVar = new com.google.android.material.bottomnavigation.c(dVar);
        cVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f39117d = cVar;
        FrameLayout frameLayout = new FrameLayout(reactContext);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 1.0f;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setId(Oa.e.f8537a.a());
        this.f39118e = frameLayout;
        ArrayList arrayList = new ArrayList();
        this.f39121h = arrayList;
        this.f39124k = new com.swmansion.rnscreens.gamma.tabs.p(dVar, cVar, arrayList);
        Pd.a aVar = Pd.a.f8891a;
        this.f39125l = new h(null, this);
        this.f39126m = new i(null, this);
        this.f39127n = new j(Boolean.TRUE, this);
        this.f39128o = new k(null, this);
        this.f39129p = new l(null, this);
        this.f39130q = new C0431m(null, this);
        this.f39131r = new n(null, this);
        this.f39132s = new o(null, this);
        this.f39133t = new p(null, this);
        this.f39134u = new c(null, this);
        this.f39135v = new d(null, this);
        this.f39136w = new e(null, this);
        this.f39137x = new f(null, this);
        this.f39138y = new g(null, this);
        setOrientation(1);
        addView(frameLayout);
        addView(cVar);
        cVar.addOnLayoutChangeListener(new com.swmansion.rnscreens.gamma.tabs.g());
        cVar.setOnItemSelectedListener(new com.swmansion.rnscreens.gamma.tabs.h(this));
        this.f39139z = new com.swmansion.rnscreens.gamma.tabs.i(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean A(com.swmansion.rnscreens.gamma.tabs.a aVar, com.swmansion.rnscreens.gamma.tabs.e it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.V1() == aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean B(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E() {
        Ta.f.f12386a.a("TabsHost", "updateBottomNavigationViewAppearance");
        this.f39124k.c(this);
        com.google.android.material.bottomnavigation.c cVar = this.f39117d;
        Integer selectedTabScreenFragmentId = getSelectedTabScreenFragmentId();
        if (selectedTabScreenFragmentId == null) {
            throw new IllegalStateException("[RNScreens] A single selected tab must be present");
        }
        cVar.setSelectedItemId(selectedTabScreenFragmentId.intValue());
        post(new com.swmansion.rnscreens.gamma.tabs.l(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(m mVar) {
        mVar.y();
        Ta.f.f12386a.a("TabsHost", "BottomNavigationView request layout");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(Object obj, Object obj2) {
        if (Intrinsics.b(obj2, obj)) {
            return;
        }
        b bVar = this.f39115b;
        bVar.c();
        bVar.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H() {
        Object next;
        Iterator it = this.f39121h.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((com.swmansion.rnscreens.gamma.tabs.e) next).V1().b());
        if (next == null) {
            throw new IllegalStateException("[RNScreens] No focused tab present");
        }
        com.swmansion.rnscreens.gamma.tabs.e eVar = (com.swmansion.rnscreens.gamma.tabs.e) next;
        if (getRequireFragmentManager().t0().size() > 1) {
            throw new IllegalStateException("[RNScreens] There can be only a single focused tab");
        }
        List listT0 = getRequireFragmentManager().t0();
        Intrinsics.checkNotNullExpressionValue(listT0, "getFragments(...)");
        androidx.fragment.app.i iVar = (androidx.fragment.app.i) CollectionsKt.firstOrNull(listT0);
        if (eVar == iVar) {
            return;
        }
        x xVarS = getRequireFragmentManager().m().s(true);
        if (iVar != null) {
            xVarS.m(iVar);
        }
        xVarS.b(this.f39118e.getId(), eVar);
        xVarS.j();
    }

    private final androidx.fragment.app.q getRequireFragmentManager() {
        androidx.fragment.app.q qVar = this.f39120g;
        if (qVar != null) {
            return qVar;
        }
        throw new IllegalStateException("[RNScreens] Nullish fragment manager");
    }

    private final Integer getSelectedTabScreenFragmentId() {
        if (this.f39121h.isEmpty()) {
            return null;
        }
        Iterator it = this.f39121h.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (((com.swmansion.rnscreens.gamma.tabs.e) it.next()).V1().b()) {
                return Integer.valueOf(i10);
            }
            i10++;
        }
        i10 = -1;
        return Integer.valueOf(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        Ta.f.f12386a.a("TabsHost", "BottomNavigationView layout changed {" + i10 + ", " + i11 + "} {" + (i12 - i10) + ", " + (i13 - i11) + "}");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(m mVar, MenuItem item) {
        String tabKey;
        com.swmansion.rnscreens.gamma.tabs.a aVarV1;
        Intrinsics.checkNotNullParameter(item, "item");
        Ta.f.f12386a.a("TabsHost", "Item selected " + item);
        com.swmansion.rnscreens.gamma.tabs.e eVarR = mVar.r(item.getItemId());
        if (eVarR == null || (aVarV1 = eVarR.V1()) == null || (tabKey = aVarV1.getTabKey()) == null) {
            tabKey = "undefined";
        }
        mVar.getEventEmitter$react_native_screens_release().d(tabKey);
        return true;
    }

    private final void p(int i10) {
        Integer num = this.f39122i;
        if (num != null && i10 == num.intValue()) {
            return;
        }
        if (i10 == 16) {
            this.f39116c.setTheme(Y8.j.f17201f);
        } else if (i10 != 32) {
            this.f39116c.setTheme(Y8.j.f17200e);
        } else {
            this.f39116c.setTheme(Y8.j.f17199d);
        }
        this.f39124k.c(this);
        this.f39122i = Integer.valueOf(i10);
    }

    private final void q() {
        measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
        layout(getLeft(), getTop(), getRight(), getBottom());
    }

    private final com.swmansion.rnscreens.gamma.tabs.e r(int i10) {
        return (com.swmansion.rnscreens.gamma.tabs.e) CollectionsKt.l0(this.f39121h, i10);
    }

    private final MenuItem t(com.swmansion.rnscreens.gamma.tabs.a aVar) {
        Iterator it = this.f39121h.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (((com.swmansion.rnscreens.gamma.tabs.e) it.next()).V1() == aVar) {
                break;
            }
            i10++;
        }
        Integer numValueOf = Integer.valueOf(i10);
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return null;
        }
        return this.f39117d.getMenu().findItem(numValueOf.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(m mVar, long j10) {
        mVar.f39123j = false;
        mVar.q();
    }

    private final void y() {
        if (this.f39123j || this.f39139z == null) {
            return;
        }
        this.f39123j = true;
        com.facebook.react.modules.core.b.f29885f.a().k(com.facebook.react.modules.core.b.a.NATIVE_ANIMATED_MODULE, this.f39139z);
    }

    public final void C(com.swmansion.rnscreens.gamma.tabs.a reactSubview) {
        Intrinsics.checkNotNullParameter(reactSubview, "reactSubview");
        boolean zRemoveIf = this.f39121h.removeIf(new com.swmansion.rnscreens.gamma.tabs.k(new com.swmansion.rnscreens.gamma.tabs.j(reactSubview)));
        Boolean boolValueOf = Boolean.valueOf(zRemoveIf);
        if (!zRemoveIf) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            reactSubview.setTabScreenDelegate$react_native_screens_release(null);
            b bVar = this.f39115b;
            bVar.b();
            bVar.g();
        }
    }

    public final void D(int i10) {
        ((com.swmansion.rnscreens.gamma.tabs.e) this.f39121h.remove(i10)).V1().setTabScreenDelegate$react_native_screens_release(null);
        b bVar = this.f39115b;
        bVar.b();
        bVar.g();
    }

    @Override // com.swmansion.rnscreens.gamma.tabs.b
    public void b(com.swmansion.rnscreens.gamma.tabs.a tabScreen, Configuration config) {
        Intrinsics.checkNotNullParameter(tabScreen, "tabScreen");
        Intrinsics.checkNotNullParameter(config, "config");
        onConfigurationChanged(config);
    }

    @Override // com.swmansion.rnscreens.gamma.tabs.b
    public void c(com.swmansion.rnscreens.gamma.tabs.a tabScreen) {
        Intrinsics.checkNotNullParameter(tabScreen, "tabScreen");
        MenuItem menuItemT = t(tabScreen);
        if (menuItemT != null) {
            this.f39124k.a(menuItemT, tabScreen);
        }
    }

    @Override // com.swmansion.rnscreens.gamma.tabs.b
    public void d(com.swmansion.rnscreens.gamma.tabs.a tabScreen, boolean z10) {
        Intrinsics.checkNotNullParameter(tabScreen, "tabScreen");
        b bVar = this.f39115b;
        bVar.b();
        bVar.g();
    }

    @NotNull
    public final r getEventEmitter$react_native_screens_release() {
        r rVar = this.f39119f;
        if (rVar != null) {
            return rVar;
        }
        Intrinsics.r("eventEmitter");
        return null;
    }

    @NotNull
    public final C2262k0 getReactContext() {
        return this.f39114a;
    }

    @Nullable
    public final Integer getTabBarBackgroundColor() {
        return (Integer) this.f39125l.a(this, f39113B[0]);
    }

    @Nullable
    public final Integer getTabBarItemActiveIndicatorColor() {
        return (Integer) this.f39126m.a(this, f39113B[1]);
    }

    @Nullable
    public final Integer getTabBarItemIconColor() {
        return (Integer) this.f39128o.a(this, f39113B[3]);
    }

    @Nullable
    public final Integer getTabBarItemIconColorActive() {
        return (Integer) this.f39130q.a(this, f39113B[5]);
    }

    @Nullable
    public final String getTabBarItemLabelVisibilityMode() {
        return (String) this.f39138y.a(this, f39113B[13]);
    }

    @Nullable
    public final Integer getTabBarItemRippleColor() {
        return (Integer) this.f39137x.a(this, f39113B[12]);
    }

    @Nullable
    public final Integer getTabBarItemTitleFontColor() {
        return (Integer) this.f39131r.a(this, f39113B[6]);
    }

    @Nullable
    public final Integer getTabBarItemTitleFontColorActive() {
        return (Integer) this.f39132s.a(this, f39113B[7]);
    }

    @Nullable
    public final String getTabBarItemTitleFontFamily() {
        return (String) this.f39129p.a(this, f39113B[4]);
    }

    @Nullable
    public final Float getTabBarItemTitleFontSize() {
        return (Float) this.f39133t.a(this, f39113B[8]);
    }

    @Nullable
    public final Float getTabBarItemTitleFontSizeActive() {
        return (Float) this.f39134u.a(this, f39113B[9]);
    }

    @Nullable
    public final String getTabBarItemTitleFontStyle() {
        return (String) this.f39136w.a(this, f39113B[11]);
    }

    @Nullable
    public final String getTabBarItemTitleFontWeight() {
        return (String) this.f39135v.a(this, f39113B[10]);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        Ta.f.f12386a.a("TabsHost", "TabsHost [" + getId() + "] attached to window");
        super.onAttachedToWindow();
        androidx.fragment.app.q qVarA = Oa.b.f8535a.a(this);
        if (qVarA == null) {
            throw new IllegalStateException("[RNScreens] Nullish fragment manager - can't run container operations");
        }
        this.f39120g = qVarA;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (configuration != null) {
            p(configuration.uiMode & 48);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        y();
    }

    @Override // com.swmansion.rnscreens.gamma.tabs.b
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public com.swmansion.rnscreens.gamma.tabs.e a(com.swmansion.rnscreens.gamma.tabs.a tabScreen) {
        Object next;
        Intrinsics.checkNotNullParameter(tabScreen, "tabScreen");
        Iterator it = this.f39121h.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((com.swmansion.rnscreens.gamma.tabs.e) next).V1() == tabScreen) {
                return (com.swmansion.rnscreens.gamma.tabs.e) next;
            }
        }
        next = null;
        return (com.swmansion.rnscreens.gamma.tabs.e) next;
    }

    public final void setEventEmitter$react_native_screens_release(@NotNull r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<set-?>");
        this.f39119f = rVar;
    }

    public final void setTabBarBackgroundColor(@Nullable Integer num) {
        this.f39125l.b(this, f39113B[0], num);
    }

    public final void setTabBarItemActiveIndicatorColor(@Nullable Integer num) {
        this.f39126m.b(this, f39113B[1], num);
    }

    public final void setTabBarItemActiveIndicatorEnabled(boolean z10) {
        this.f39127n.b(this, f39113B[2], Boolean.valueOf(z10));
    }

    public final void setTabBarItemIconColor(@Nullable Integer num) {
        this.f39128o.b(this, f39113B[3], num);
    }

    public final void setTabBarItemIconColorActive(@Nullable Integer num) {
        this.f39130q.b(this, f39113B[5], num);
    }

    public final void setTabBarItemLabelVisibilityMode(@Nullable String str) {
        this.f39138y.b(this, f39113B[13], str);
    }

    public final void setTabBarItemRippleColor(@Nullable Integer num) {
        this.f39137x.b(this, f39113B[12], num);
    }

    public final void setTabBarItemTitleFontColor(@Nullable Integer num) {
        this.f39131r.b(this, f39113B[6], num);
    }

    public final void setTabBarItemTitleFontColorActive(@Nullable Integer num) {
        this.f39132s.b(this, f39113B[7], num);
    }

    public final void setTabBarItemTitleFontFamily(@Nullable String str) {
        this.f39129p.b(this, f39113B[4], str);
    }

    public final void setTabBarItemTitleFontSize(@Nullable Float f10) {
        this.f39133t.b(this, f39113B[8], f10);
    }

    public final void setTabBarItemTitleFontSizeActive(@Nullable Float f10) {
        this.f39134u.b(this, f39113B[9], f10);
    }

    public final void setTabBarItemTitleFontStyle(@Nullable String str) {
        this.f39136w.b(this, f39113B[11], str);
    }

    public final void setTabBarItemTitleFontWeight(@Nullable String str) {
        this.f39135v.b(this, f39113B[10], str);
    }

    public final boolean u() {
        return ((Boolean) this.f39127n.a(this, f39113B[2])).booleanValue();
    }

    public final void w(com.swmansion.rnscreens.gamma.tabs.a tabScreen, int i10) {
        Intrinsics.checkNotNullParameter(tabScreen, "tabScreen");
        if (i10 < this.f39117d.getMaxItemCount()) {
            this.f39121h.add(i10, new com.swmansion.rnscreens.gamma.tabs.e(tabScreen));
            tabScreen.setTabScreenDelegate$react_native_screens_release(this);
            b bVar = this.f39115b;
            bVar.b();
            bVar.g();
            return;
        }
        throw new IllegalArgumentException(("[RNScreens] Attempt to insert TabScreen at index " + i10 + "; BottomNavigationView supports at most " + this.f39117d.getMaxItemCount() + " items").toString());
    }

    public final void x() {
        if (getId() == -1) {
            throw new IllegalStateException("[RNScreens] TabsHost must have its tag set when registering event emitters");
        }
        setEventEmitter$react_native_screens_release(new r(this.f39114a, getId()));
    }

    public final void z() {
        Iterator it = this.f39121h.iterator();
        while (it.hasNext()) {
            ((com.swmansion.rnscreens.gamma.tabs.e) it.next()).V1().setTabScreenDelegate$react_native_screens_release(null);
        }
        this.f39121h.clear();
        b bVar = this.f39115b;
        bVar.b();
        bVar.g();
    }
}

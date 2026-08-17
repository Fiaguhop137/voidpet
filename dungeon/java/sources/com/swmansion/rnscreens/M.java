package com.swmansion.rnscreens;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.C2270o0;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class M extends C3210v {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f38969r = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ArrayList f38970h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Set f38971i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List f38972j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List f38973k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List f38974l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private V f38975m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f38976n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Ra.a f38977o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List f38978p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f38979q;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b(B b10, C3208t.d dVar) {
            if (dVar == null) {
                dVar = b10.j().getStackAnimation();
            }
            return (Build.VERSION.SDK_INT >= 33 || dVar == C3208t.d.SLIDE_FROM_BOTTOM || dVar == C3208t.d.FADE_FROM_BOTTOM || dVar == C3208t.d.IOS_FROM_RIGHT || dVar == C3208t.d.IOS_FROM_LEFT) && dVar != C3208t.d.NONE;
        }
    }

    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Canvas f38980a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private View f38981b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f38982c;

        public b() {
        }

        public final void a() {
            M.this.b0(this);
            this.f38980a = null;
            this.f38981b = null;
            this.f38982c = 0L;
        }

        public final Canvas b() {
            return this.f38980a;
        }

        public final View c() {
            return this.f38981b;
        }

        public final long d() {
            return this.f38982c;
        }

        public final void e(Canvas canvas) {
            this.f38980a = canvas;
        }

        public final void f(View view) {
            this.f38981b = view;
        }

        public final void g(long j10) {
            this.f38982c = j10;
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38984a;

        static {
            int[] iArr = new int[C3208t.e.values().length];
            try {
                iArr[C3208t.e.FORM_SHEET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f38984a = iArr;
        }
    }

    public M(Context context) {
        super(context);
        this.f38970h = new ArrayList();
        this.f38971i = new HashSet();
        this.f38972j = new ArrayList();
        this.f38973k = new ArrayList();
        this.f38974l = new ArrayList();
        this.f38978p = new ArrayList();
    }

    private final void N() {
        int iF = C2270o0.f(this);
        Context context = getContext();
        Intrinsics.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher eventDispatcherC = C2270o0.c((ReactContext) context, getId());
        if (eventDispatcherC != null) {
            eventDispatcherC.d(new La.t(iF, getId()));
        }
    }

    private final void O() {
        List<b> list = this.f38974l;
        this.f38974l = new ArrayList();
        for (b bVar : list) {
            bVar.a();
            this.f38973k.add(bVar);
        }
    }

    private final b P() {
        if (this.f38973k.isEmpty()) {
            return new b();
        }
        List list = this.f38973k;
        return (b) list.remove(CollectionsKt.n(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Q(kotlin.jvm.internal.E e10, B it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it != e10.f48338a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean R(kotlin.jvm.internal.E e10, M m10, B it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return !(it == e10.f48338a || CollectionsKt.b0(m10.f38971i, it)) || it.j().getActivityState() == C3208t.a.INACTIVE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean S(kotlin.jvm.internal.E e10, B it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it != e10.f48338a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(B b10) {
        C3208t c3208tJ;
        if (b10 == null || (c3208tJ = b10.j()) == null) {
            return;
        }
        c3208tJ.bringToFront();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final V U(B it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (V) it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean V(B it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.j().getActivityState() == C3208t.a.INACTIVE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean W(M m10, V wrapper) {
        Intrinsics.checkNotNullParameter(wrapper, "wrapper");
        return !m10.f39333a.contains(wrapper) || m10.f38971i.contains(wrapper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean X(M m10, B it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (CollectionsKt.b0(m10.f38971i, it) || it.j().getActivityState() == C3208t.a.INACTIVE) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Y(B it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Z(kotlin.jvm.internal.E e10, V it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it != e10.f48338a && it.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b0(b bVar) {
        Canvas canvasB = bVar.b();
        Intrinsics.c(canvasB);
        super.drawChild(canvasB, bVar.c(), bVar.d());
    }

    private final void c0(B b10) {
        V v10;
        if (this.f39333a.size() > 1 && b10 != null && (v10 = this.f38975m) != null && v10.k()) {
            ArrayList arrayList = this.f39333a;
            for (B b11 : CollectionsKt.R(CollectionsKt.I0(arrayList, kotlin.ranges.e.t(0, arrayList.size() - 1)))) {
                b11.j().b(4);
                if (Intrinsics.b(b11, b10)) {
                    break;
                }
            }
        }
        C3208t topScreen = getTopScreen();
        if (topScreen != null) {
            topScreen.b(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.swmansion.rnscreens.C3210v
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public V c(C3208t screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        return c.f38984a[screen.getStackPresentation().ordinal()] == 1 ? new U(screen) : new U(screen);
    }

    public final void M(V screenFragment) {
        Intrinsics.checkNotNullParameter(screenFragment, "screenFragment");
        this.f38971i.add(screenFragment);
        v();
    }

    public final void a0() {
        if (this.f38976n) {
            return;
        }
        N();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
        Ra.a aVar = this.f38977o;
        if (aVar != null) {
            aVar.a(this.f38974l);
        }
        O();
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View child, long j10) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(child, "child");
        List list = this.f38974l;
        b bVarP = P();
        bVarP.e(canvas);
        bVarP.f(child);
        bVarP.g(j10);
        list.add(bVarP);
        return true;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        Ra.a aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.endViewTransition(view);
        this.f38978p.remove(view);
        if (this.f38978p.isEmpty() && (aVar = this.f38977o) != null) {
            aVar.disable();
        }
        if (this.f38976n) {
            this.f38976n = false;
            N();
        }
    }

    @NotNull
    public final ArrayList<V> getFragments() {
        return this.f38970h;
    }

    public final boolean getGoingForward() {
        return this.f38979q;
    }

    @NotNull
    public final C3208t getRootScreen() {
        Object next;
        C3208t c3208tJ;
        Iterator it = this.f39333a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (CollectionsKt.b0(this.f38971i, (B) next));
        B b10 = (B) next;
        if (b10 == null || (c3208tJ = b10.j()) == null) {
            throw new IllegalStateException("[RNScreens] Stack has no root screen set");
        }
        return c3208tJ;
    }

    @NotNull
    public final List<String> getScreenIds() {
        ArrayList arrayList = this.f39333a;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.w(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((B) it.next()).j().getScreenId());
        }
        return arrayList2;
    }

    @Override // com.swmansion.rnscreens.C3210v
    @Nullable
    public C3208t getTopScreen() {
        V v10 = this.f38975m;
        if (v10 != null) {
            return v10.j();
        }
        return null;
    }

    @Override // com.swmansion.rnscreens.C3210v
    public boolean n(B b10) {
        return super.n(b10) && !CollectionsKt.b0(this.f38971i, b10);
    }

    @Override // com.swmansion.rnscreens.C3210v
    protected void o() {
        Iterator it = this.f38970h.iterator();
        while (it.hasNext()) {
            ((V) it.next()).o();
        }
    }

    public final void setGoingForward(boolean z10) {
        this.f38979q = z10;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        Ra.a aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        if (!(view instanceof Ra.e)) {
            throw new IllegalStateException(("[RNScreens] Unexpected type of ScreenStack direct subview " + view.getClass()).toString());
        }
        super.startViewTransition(view);
        if (((Ra.e) view).getFragment$react_native_screens_release().t0()) {
            this.f38978p.add(view);
        }
        if (!this.f38978p.isEmpty() && (aVar = this.f38977o) != null) {
            aVar.enable();
        }
        this.f38976n = true;
    }

    @Override // com.swmansion.rnscreens.C3210v
    public void t() {
        C3208t.d stackAnimation;
        boolean z10;
        C3208t c3208tJ;
        V v10;
        int iZ;
        Object obj;
        C3208t c3208tJ2;
        kotlin.jvm.internal.E e10 = new kotlin.jvm.internal.E();
        kotlin.jvm.internal.E e11 = new kotlin.jvm.internal.E();
        this.f38977o = null;
        Sequence sequenceC = kotlin.sequences.k.C(CollectionsKt.Z(CollectionsKt.S(this.f39333a)), new C(this));
        e10.f48338a = kotlin.sequences.k.G(sequenceC);
        B b10 = (B) kotlin.sequences.k.G(kotlin.sequences.k.B(sequenceC, new D()));
        if (b10 == null || b10 == e10.f48338a) {
            b10 = null;
        }
        e11.f48338a = b10;
        boolean z11 = CollectionsKt.b0(this.f38970h, e10.f48338a) && !CollectionsKt.b0(this.f38972j, e10.f48338a);
        Object obj2 = e10.f48338a;
        V v11 = this.f38975m;
        boolean z12 = obj2 != v11;
        if (obj2 == null || z11) {
            if (obj2 == null || v11 == null || !z12) {
                stackAnimation = null;
                z10 = true;
            } else {
                stackAnimation = (v11 == null || (c3208tJ = v11.j()) == null) ? null : c3208tJ.getStackAnimation();
                z10 = false;
            }
        } else if (v11 != null) {
            z10 = (v11 != null && this.f39333a.contains(v11)) || (((B) e10.f48338a).j().getReplaceAnimation() == C3208t.c.PUSH);
            if (z10) {
                c3208tJ2 = ((B) e10.f48338a).j();
            } else {
                V v12 = this.f38975m;
                if (v12 == null || (c3208tJ2 = v12.j()) == null) {
                    stackAnimation = null;
                }
            }
            stackAnimation = c3208tJ2.getStackAnimation();
        } else {
            stackAnimation = C3208t.d.NONE;
            this.f38979q = true;
            z10 = true;
        }
        this.f38979q = z10;
        if (z10 && (obj = e10.f48338a) != null && f38969r.b((B) obj, stackAnimation) && e11.f48338a == null) {
            this.f38977o = new Ra.d();
        } else if (e10.f48338a != null && z11 && (v10 = this.f38975m) != null && v10.k() && !((B) e10.f48338a).k() && (iZ = kotlin.sequences.k.z(kotlin.sequences.k.T(CollectionsKt.Z(CollectionsKt.S(this.f38970h)), new E(e10)))) > 1) {
            this.f38977o = new Ra.c(Math.max((CollectionsKt.n(this.f38970h) - iZ) + 1, 0));
        }
        androidx.fragment.app.x xVarG = g();
        if (stackAnimation != null) {
            Ta.c.a(xVarG, stackAnimation, z10);
        }
        Iterator it = kotlin.sequences.k.C(CollectionsKt.Z(this.f38970h), new F(this)).iterator();
        while (it.hasNext()) {
            xVarG.m(((V) it.next()).b());
        }
        Iterator it2 = kotlin.sequences.k.C(kotlin.sequences.k.T(CollectionsKt.Z(this.f39333a), new G(e11)), new H(e10, this)).iterator();
        while (it2.hasNext()) {
            xVarG.m(((B) it2.next()).b());
        }
        Object obj3 = e11.f48338a;
        if (obj3 == null || ((B) obj3).b().n0()) {
            Object obj4 = e10.f48338a;
            if (obj4 != null && !((B) obj4).b().n0()) {
                if (Ka.k.c(((B) e10.f48338a).j())) {
                    ((B) e10.f48338a).b().C1();
                }
                xVarG.b(getId(), ((B) e10.f48338a).b());
            }
        } else {
            B b11 = (B) e10.f48338a;
            Iterator it3 = kotlin.sequences.k.B(CollectionsKt.Z(this.f39333a), new I(e11)).iterator();
            while (it3.hasNext()) {
                xVarG.b(getId(), ((B) it3.next()).b()).p(new J(b11));
            }
        }
        Object obj5 = e10.f48338a;
        this.f38975m = obj5 instanceof V ? (V) obj5 : null;
        this.f38970h.clear();
        CollectionsKt.C(this.f38970h, kotlin.sequences.k.N(CollectionsKt.Z(this.f39333a), new K()));
        this.f38972j = kotlin.sequences.k.V(kotlin.sequences.k.C(CollectionsKt.Z(this.f39333a), new L()));
        c0((B) e11.f48338a);
        xVarG.j();
    }

    @Override // com.swmansion.rnscreens.C3210v
    public void w() {
        this.f38971i.clear();
        super.w();
    }

    @Override // com.swmansion.rnscreens.C3210v
    public void y(int i10) {
        Set set = this.f38971i;
        kotlin.jvm.internal.K.a(set).remove(m(i10));
        super.y(i10);
    }
}

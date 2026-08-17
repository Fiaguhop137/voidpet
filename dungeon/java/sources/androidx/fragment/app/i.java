package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.view.AbstractC1933u;
import androidx.lifecycle.AbstractC1987j;
import androidx.lifecycle.AbstractC1999w;
import androidx.lifecycle.C1995s;
import androidx.lifecycle.InterfaceC1985h;
import androidx.lifecycle.InterfaceC1991n;
import androidx.lifecycle.InterfaceC1994q;
import androidx.lifecycle.J;
import androidx.lifecycle.N;
import androidx.lifecycle.S;
import androidx.lifecycle.T;
import androidx.lifecycle.U;
import androidx.lifecycle.V;
import androidx.lifecycle.W;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class i implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC1994q, U, InterfaceC1985h, p237n3.i {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    static final Object f23984c0 = new Object();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    boolean f23985A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    boolean f23986B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    boolean f23987C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    boolean f23988D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    boolean f23989E;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f23991G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    ViewGroup f23992H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    View f23993I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    boolean f23994J;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    g f23996L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    Handler f23997M;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    boolean f23999O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    LayoutInflater f24000P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    boolean f24001Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public String f24002R;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    C1995s f24004T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    B f24005U;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    S.c f24007W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    p237n3.h f24008X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private int f24009Y;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Bundle f24013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    SparseArray f24015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Bundle f24016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Boolean f24017e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Bundle f24019g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    i f24020h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f24022j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f24024l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f24025m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f24026n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f24027o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    boolean f24028p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    boolean f24029q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    boolean f24030r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f24031s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    q f24032t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    n f24033u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    i f24035w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    int f24036x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    int f24037y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    String f24038z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f24011a = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f24018f = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    String f24021i = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Boolean f24023k = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    q f24034v = new r();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    boolean f23990F = true;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    boolean f23995K = true;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    Runnable f23998N = new a();

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    AbstractC1987j.b f24003S = AbstractC1987j.b.RESUMED;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    androidx.lifecycle.y f24006V = new androidx.lifecycle.y();

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final AtomicInteger f24010Z = new AtomicInteger();

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final ArrayList f24012a0 = new ArrayList();

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final j f24014b0 = new b();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.U1();
        }
    }

    class b extends j {
        b() {
            super(null);
        }

        @Override // androidx.fragment.app.i.j
        void a() {
            i.this.f24008X.c();
            J.c(i.this);
            Bundle bundle = i.this.f24013b;
            i.this.f24008X.d(bundle != null ? bundle.getBundle("registryState") : null);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.u(false);
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ F f24042a;

        d(F f10) {
            this.f24042a = f10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f24042a.k();
        }
    }

    class e extends G1.k {
        e() {
        }

        @Override // G1.k
        public View f(int i10) {
            View view = i.this.f23993I;
            if (view != null) {
                return view.findViewById(i10);
            }
            throw new IllegalStateException("Fragment " + i.this + " does not have a view");
        }

        @Override // G1.k
        public boolean j() {
            return i.this.f23993I != null;
        }
    }

    class f implements InterfaceC1991n {
        f() {
        }

        @Override // androidx.lifecycle.InterfaceC1991n
        public void f(InterfaceC1994q interfaceC1994q, AbstractC1987j.a aVar) {
            View view;
            if (aVar != AbstractC1987j.a.ON_STOP || (view = i.this.f23993I) == null) {
                return;
            }
            h.a(view);
        }
    }

    static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        View f24046a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f24047b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f24048c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f24049d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f24050e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f24051f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f24052g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        ArrayList f24053h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        ArrayList f24054i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f24055j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f24056k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f24057l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f24058m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f24059n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f24060o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Boolean f24061p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Boolean f24062q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        float f24063r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        View f24064s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f24065t;

        g() {
            Object obj = i.f23984c0;
            this.f24056k = obj;
            this.f24057l = null;
            this.f24058m = obj;
            this.f24059n = null;
            this.f24060o = obj;
            this.f24063r = 1.0f;
            this.f24064s = null;
        }
    }

    static class h {
        static void a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.i$i, reason: collision with other inner class name */
    public static class C0296i extends RuntimeException {
        public C0296i(String str, Exception exc) {
            super(str, exc);
        }
    }

    private static abstract class j {
        private j() {
        }

        /* synthetic */ j(a aVar) {
            this();
        }

        abstract void a();
    }

    public i() {
        k0();
    }

    private void D1(j jVar) {
        if (this.f24011a >= 0) {
            jVar.a();
        } else {
            this.f24012a0.add(jVar);
        }
    }

    private void J1() {
        if (q.H0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.f23993I != null) {
            Bundle bundle = this.f24013b;
            K1(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.f24013b = null;
    }

    private int R() {
        AbstractC1987j.b bVar = this.f24003S;
        return (bVar == AbstractC1987j.b.INITIALIZED || this.f24035w == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.f24035w.R());
    }

    public static /* synthetic */ void h(i iVar) {
        iVar.f24005U.d(iVar.f24016d);
        iVar.f24016d = null;
    }

    private i h0(boolean z10) {
        String str;
        if (z10) {
            H1.c.h(this);
        }
        i iVar = this.f24020h;
        if (iVar != null) {
            return iVar;
        }
        q qVar = this.f24032t;
        if (qVar == null || (str = this.f24021i) == null) {
            return null;
        }
        return qVar.d0(str);
    }

    private void k0() {
        this.f24004T = new C1995s(this);
        this.f24008X = p237n3.h.a(this);
        this.f24007W = null;
        if (this.f24012a0.contains(this.f24014b0)) {
            return;
        }
        D1(this.f24014b0);
    }

    public static i m0(Context context, String str, Bundle bundle) {
        try {
            i iVar = (i) m.d(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle == null) {
                return iVar;
            }
            bundle.setClassLoader(iVar.getClass().getClassLoader());
            iVar.M1(bundle);
            return iVar;
        } catch (IllegalAccessException e10) {
            throw new C0296i("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e10);
        } catch (InstantiationException e11) {
            throw new C0296i("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e11);
        } catch (NoSuchMethodException e12) {
            throw new C0296i("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e12);
        } catch (InvocationTargetException e13) {
            throw new C0296i("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e13);
        }
    }

    private g x() {
        if (this.f23996L == null) {
            this.f23996L = new g();
        }
        return this.f23996L;
    }

    public final androidx.fragment.app.j A() {
        n nVar = this.f24033u;
        if (nVar == null) {
            return null;
        }
        return (androidx.fragment.app.j) nVar.l();
    }

    public void A0(Context context) {
        this.f23991G = true;
        n nVar = this.f24033u;
        Activity activityL = nVar == null ? null : nVar.l();
        if (activityL != null) {
            this.f23991G = false;
            z0(activityL);
        }
    }

    void A1() {
        this.f24034v.R();
        if (this.f23993I != null) {
            this.f24005U.a(AbstractC1987j.a.ON_STOP);
        }
        this.f24004T.i(AbstractC1987j.a.ON_STOP);
        this.f24011a = 4;
        this.f23991G = false;
        b1();
        if (this.f23991G) {
            return;
        }
        throw new H("Fragment " + this + " did not call through to super.onStop()");
    }

    public boolean B() {
        Boolean bool;
        g gVar = this.f23996L;
        if (gVar == null || (bool = gVar.f24062q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void B0(i iVar) {
    }

    void B1() {
        Bundle bundle = this.f24013b;
        c1(this.f23993I, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.f24034v.S();
    }

    public boolean C() {
        Boolean bool;
        g gVar = this.f23996L;
        if (gVar == null || (bool = gVar.f24061p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean C0(MenuItem menuItem) {
        return false;
    }

    public void C1() {
        x().f24065t = true;
    }

    View D() {
        g gVar = this.f23996L;
        if (gVar == null) {
            return null;
        }
        return gVar.f24046a;
    }

    public void D0(Bundle bundle) {
        this.f23991G = true;
        I1();
        if (this.f24034v.N0(1)) {
            return;
        }
        this.f24034v.z();
    }

    public final Bundle E() {
        return this.f24019g;
    }

    public Animation E0(int i10, boolean z10, int i11) {
        return null;
    }

    public final androidx.fragment.app.j E1() {
        androidx.fragment.app.j jVarA = A();
        if (jVarA != null) {
            return jVarA;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final q F() {
        if (this.f24033u != null) {
            return this.f24034v;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public Animator F0(int i10, boolean z10, int i11) {
        return null;
    }

    public final Bundle F1() {
        Bundle bundleE = E();
        if (bundleE != null) {
            return bundleE;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    public Context G() {
        n nVar = this.f24033u;
        if (nVar == null) {
            return null;
        }
        return nVar.n();
    }

    public void G0(Menu menu, MenuInflater menuInflater) {
    }

    public final Context G1() {
        Context contextG = G();
        if (contextG != null) {
            return contextG;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    int H() {
        g gVar = this.f23996L;
        if (gVar == null) {
            return 0;
        }
        return gVar.f24048c;
    }

    public View H0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = this.f24009Y;
        if (i10 != 0) {
            return layoutInflater.inflate(i10, viewGroup, false);
        }
        return null;
    }

    public final View H1() {
        View viewI0 = i0();
        if (viewI0 != null) {
            return viewI0;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public Object I() {
        g gVar = this.f23996L;
        if (gVar == null) {
            return null;
        }
        return gVar.f24055j;
    }

    public void I0() {
        this.f23991G = true;
    }

    void I1() {
        Bundle bundle;
        Bundle bundle2 = this.f24013b;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.f24034v.d1(bundle);
        this.f24034v.z();
    }

    Y0.v J() {
        g gVar = this.f23996L;
        if (gVar == null) {
            return null;
        }
        gVar.getClass();
        return null;
    }

    public void J0() {
    }

    int K() {
        g gVar = this.f23996L;
        if (gVar == null) {
            return 0;
        }
        return gVar.f24049d;
    }

    public void K0() {
        this.f23991G = true;
    }

    final void K1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f24015c;
        if (sparseArray != null) {
            this.f23993I.restoreHierarchyState(sparseArray);
            this.f24015c = null;
        }
        this.f23991G = false;
        d1(bundle);
        if (this.f23991G) {
            if (this.f23993I != null) {
                this.f24005U.a(AbstractC1987j.a.ON_CREATE);
            }
        } else {
            throw new H("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public Object L() {
        g gVar = this.f23996L;
        if (gVar == null) {
            return null;
        }
        return gVar.f24057l;
    }

    public void L0() {
        this.f23991G = true;
    }

    void L1(int i10, int i11, int i12, int i13) {
        if (this.f23996L == null && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return;
        }
        x().f24048c = i10;
        x().f24049d = i11;
        x().f24050e = i12;
        x().f24051f = i13;
    }

    Y0.v M() {
        g gVar = this.f23996L;
        if (gVar == null) {
            return null;
        }
        gVar.getClass();
        return null;
    }

    public LayoutInflater M0(Bundle bundle) {
        return Q(bundle);
    }

    public void M1(Bundle bundle) {
        if (this.f24032t != null && v0()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f24019g = bundle;
    }

    View N() {
        g gVar = this.f23996L;
        if (gVar == null) {
            return null;
        }
        return gVar.f24064s;
    }

    public void N0(boolean z10) {
    }

    void N1(View view) {
        x().f24064s = view;
    }

    public final Object O() {
        n nVar = this.f24033u;
        if (nVar == null) {
            return null;
        }
        return nVar.s();
    }

    public void O0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f23991G = true;
    }

    public void O1(boolean z10) {
        if (this.f23989E != z10) {
            this.f23989E = z10;
            if (!n0() || p0()) {
                return;
            }
            this.f24033u.A();
        }
    }

    public final int P() {
        return this.f24036x;
    }

    public void P0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f23991G = true;
        n nVar = this.f24033u;
        Activity activityL = nVar == null ? null : nVar.l();
        if (activityL != null) {
            this.f23991G = false;
            O0(activityL, attributeSet, bundle);
        }
    }

    void P1(int i10) {
        if (this.f23996L == null && i10 == 0) {
            return;
        }
        x();
        this.f23996L.f24052g = i10;
    }

    public LayoutInflater Q(Bundle bundle) {
        n nVar = this.f24033u;
        if (nVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflaterU = nVar.u();
        AbstractC1933u.a(layoutInflaterU, this.f24034v.v0());
        return layoutInflaterU;
    }

    public void Q0(boolean z10) {
    }

    void Q1(boolean z10) {
        if (this.f23996L == null) {
            return;
        }
        x().f24047b = z10;
    }

    public boolean R0(MenuItem menuItem) {
        return false;
    }

    void R1(float f10) {
        x().f24063r = f10;
    }

    int S() {
        g gVar = this.f23996L;
        if (gVar == null) {
            return 0;
        }
        return gVar.f24052g;
    }

    public void S0(Menu menu) {
    }

    void S1(ArrayList arrayList, ArrayList arrayList2) {
        x();
        g gVar = this.f23996L;
        gVar.f24053h = arrayList;
        gVar.f24054i = arrayList2;
    }

    public final i T() {
        return this.f24035w;
    }

    public void T0() {
        this.f23991G = true;
    }

    public void T1(Intent intent, int i10, Bundle bundle) {
        if (this.f24033u != null) {
            U().P0(this, intent, i10, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final q U() {
        q qVar = this.f24032t;
        if (qVar != null) {
            return qVar;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public void U0(boolean z10) {
    }

    public void U1() {
        if (this.f23996L == null || !x().f24065t) {
            return;
        }
        if (this.f24033u == null) {
            x().f24065t = false;
        } else if (Looper.myLooper() != this.f24033u.o().getLooper()) {
            this.f24033u.o().postAtFrontOfQueue(new c());
        } else {
            u(true);
        }
    }

    boolean V() {
        g gVar = this.f23996L;
        if (gVar == null) {
            return false;
        }
        return gVar.f24047b;
    }

    public void V0(Menu menu) {
    }

    int W() {
        g gVar = this.f23996L;
        if (gVar == null) {
            return 0;
        }
        return gVar.f24050e;
    }

    public void W0(boolean z10) {
    }

    int X() {
        g gVar = this.f23996L;
        if (gVar == null) {
            return 0;
        }
        return gVar.f24051f;
    }

    public void X0(int i10, String[] strArr, int[] iArr) {
    }

    float Y() {
        g gVar = this.f23996L;
        if (gVar == null) {
            return 1.0f;
        }
        return gVar.f24063r;
    }

    public void Y0() {
        this.f23991G = true;
    }

    public Object Z() {
        g gVar = this.f23996L;
        if (gVar == null) {
            return null;
        }
        Object obj = gVar.f24058m;
        return obj == f23984c0 ? L() : obj;
    }

    public void Z0(Bundle bundle) {
    }

    public final Resources a0() {
        return G1().getResources();
    }

    public void a1() {
        this.f23991G = true;
    }

    public Object b0() {
        g gVar = this.f23996L;
        if (gVar == null) {
            return null;
        }
        Object obj = gVar.f24056k;
        return obj == f23984c0 ? I() : obj;
    }

    public void b1() {
        this.f23991G = true;
    }

    public Object c0() {
        g gVar = this.f23996L;
        if (gVar == null) {
            return null;
        }
        return gVar.f24059n;
    }

    public void c1(View view, Bundle bundle) {
    }

    public Object d0() {
        g gVar = this.f23996L;
        if (gVar == null) {
            return null;
        }
        Object obj = gVar.f24060o;
        return obj == f23984c0 ? c0() : obj;
    }

    public void d1(Bundle bundle) {
        this.f23991G = true;
    }

    ArrayList e0() {
        ArrayList arrayList;
        g gVar = this.f23996L;
        return (gVar == null || (arrayList = gVar.f24053h) == null) ? new ArrayList() : arrayList;
    }

    void e1(Bundle bundle) {
        this.f24034v.R0();
        this.f24011a = 3;
        this.f23991G = false;
        x0(bundle);
        if (this.f23991G) {
            J1();
            this.f24034v.v();
        } else {
            throw new H("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    ArrayList f0() {
        ArrayList arrayList;
        g gVar = this.f23996L;
        return (gVar == null || (arrayList = gVar.f24054i) == null) ? new ArrayList() : arrayList;
    }

    void f1() {
        Iterator it = this.f24012a0.iterator();
        while (it.hasNext()) {
            ((j) it.next()).a();
        }
        this.f24012a0.clear();
        this.f24034v.k(this.f24033u, v(), this);
        this.f24011a = 0;
        this.f23991G = false;
        A0(this.f24033u.n());
        if (this.f23991G) {
            this.f24032t.F(this);
            this.f24034v.w();
        } else {
            throw new H("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    @Override // androidx.lifecycle.U
    public T g() {
        if (this.f24032t == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (R() != AbstractC1987j.b.INITIALIZED.ordinal()) {
            return this.f24032t.C0(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    public final String g0(int i10) {
        return a0().getString(i10);
    }

    void g1(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    boolean h1(MenuItem menuItem) {
        if (this.f23985A) {
            return false;
        }
        if (C0(menuItem)) {
            return true;
        }
        return this.f24034v.y(menuItem);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    @Override // p237n3.i
    public final p237n3.f i() {
        return this.f24008X.b();
    }

    public View i0() {
        return this.f23993I;
    }

    void i1(Bundle bundle) {
        this.f24034v.R0();
        this.f24011a = 1;
        this.f23991G = false;
        this.f24004T.a(new f());
        D0(bundle);
        this.f24001Q = true;
        if (this.f23991G) {
            this.f24004T.i(AbstractC1987j.a.ON_CREATE);
            return;
        }
        throw new H("Fragment " + this + " did not call through to super.onCreate()");
    }

    public AbstractC1999w j0() {
        return this.f24006V;
    }

    boolean j1(Menu menu, MenuInflater menuInflater) {
        boolean z10 = false;
        if (this.f23985A) {
            return false;
        }
        if (this.f23989E && this.f23990F) {
            G0(menu, menuInflater);
            z10 = true;
        }
        return this.f24034v.A(menu, menuInflater) | z10;
    }

    void k1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f24034v.R0();
        this.f24030r = true;
        this.f24005U = new B(this, g(), new G1.f(this));
        View viewH0 = H0(layoutInflater, viewGroup, bundle);
        this.f23993I = viewH0;
        if (viewH0 == null) {
            if (this.f24005U.c()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f24005U = null;
            return;
        }
        this.f24005U.b();
        if (q.H0(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.f23993I + " for Fragment " + this);
        }
        V.b(this.f23993I, this.f24005U);
        W.b(this.f23993I, this.f24005U);
        p237n3.m.b(this.f23993I, this.f24005U);
        this.f24006V.n(this.f24005U);
    }

    void l0() {
        k0();
        this.f24002R = this.f24018f;
        this.f24018f = UUID.randomUUID().toString();
        this.f24024l = false;
        this.f24025m = false;
        this.f24027o = false;
        this.f24028p = false;
        this.f24029q = false;
        this.f24031s = 0;
        this.f24032t = null;
        this.f24034v = new r();
        this.f24033u = null;
        this.f24036x = 0;
        this.f24037y = 0;
        this.f24038z = null;
        this.f23985A = false;
        this.f23986B = false;
    }

    void l1() {
        this.f24034v.B();
        this.f24004T.i(AbstractC1987j.a.ON_DESTROY);
        this.f24011a = 0;
        this.f23991G = false;
        this.f24001Q = false;
        I0();
        if (this.f23991G) {
            return;
        }
        throw new H("Fragment " + this + " did not call through to super.onDestroy()");
    }

    void m1() {
        this.f24034v.C();
        if (this.f23993I != null && this.f24005U.y().b().g(AbstractC1987j.b.CREATED)) {
            this.f24005U.a(AbstractC1987j.a.ON_DESTROY);
        }
        this.f24011a = 1;
        this.f23991G = false;
        K0();
        if (this.f23991G) {
            androidx.loader.app.a.b(this).d();
            this.f24030r = false;
        } else {
            throw new H("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    public final boolean n0() {
        return this.f24033u != null && this.f24024l;
    }

    void n1() {
        this.f24011a = -1;
        this.f23991G = false;
        L0();
        this.f24000P = null;
        if (this.f23991G) {
            if (this.f24034v.G0()) {
                return;
            }
            this.f24034v.B();
            this.f24034v = new r();
            return;
        }
        throw new H("Fragment " + this + " did not call through to super.onDetach()");
    }

    public final boolean o0() {
        return this.f23986B;
    }

    LayoutInflater o1(Bundle bundle) {
        LayoutInflater layoutInflaterM0 = M0(bundle);
        this.f24000P = layoutInflaterM0;
        return layoutInflaterM0;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f23991G = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        E1().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f23991G = true;
    }

    public final boolean p0() {
        if (this.f23985A) {
            return true;
        }
        q qVar = this.f24032t;
        return qVar != null && qVar.K0(this.f24035w);
    }

    void p1() {
        onLowMemory();
    }

    final boolean q0() {
        return this.f24031s > 0;
    }

    void q1(boolean z10) {
        Q0(z10);
    }

    @Override // androidx.lifecycle.InterfaceC1985h
    public S.c r() {
        Application application;
        if (this.f24032t == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.f24007W == null) {
            Context applicationContext = G1().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && q.H0(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + G1().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.f24007W = new N(application, this, E());
        }
        return this.f24007W;
    }

    public final boolean r0() {
        if (!this.f23990F) {
            return false;
        }
        q qVar = this.f24032t;
        return qVar == null || qVar.L0(this.f24035w);
    }

    boolean r1(MenuItem menuItem) {
        if (this.f23985A) {
            return false;
        }
        if (this.f23989E && this.f23990F && R0(menuItem)) {
            return true;
        }
        return this.f24034v.H(menuItem);
    }

    @Override // androidx.lifecycle.InterfaceC1985h
    public O1.a s() {
        Application application;
        Context applicationContext = G1().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && q.H0(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + G1().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        O1.b bVar = new O1.b();
        if (application != null) {
            bVar.c(S.a.f24321h, application);
        }
        bVar.c(J.f24287a, this);
        bVar.c(J.f24288b, this);
        if (E() != null) {
            bVar.c(J.f24289c, E());
        }
        return bVar;
    }

    boolean s0() {
        g gVar = this.f23996L;
        if (gVar == null) {
            return false;
        }
        return gVar.f24065t;
    }

    void s1(Menu menu) {
        if (this.f23985A) {
            return;
        }
        if (this.f23989E && this.f23990F) {
            S0(menu);
        }
        this.f24034v.I(menu);
    }

    public void startActivityForResult(Intent intent, int i10) {
        T1(intent, i10, null);
    }

    public final boolean t0() {
        return this.f24025m;
    }

    void t1() {
        this.f24034v.K();
        if (this.f23993I != null) {
            this.f24005U.a(AbstractC1987j.a.ON_PAUSE);
        }
        this.f24004T.i(AbstractC1987j.a.ON_PAUSE);
        this.f24011a = 6;
        this.f23991G = false;
        T0();
        if (this.f23991G) {
            return;
        }
        throw new H("Fragment " + this + " did not call through to super.onPause()");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("}");
        sb2.append(" (");
        sb2.append(this.f24018f);
        if (this.f24036x != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f24036x));
        }
        if (this.f24038z != null) {
            sb2.append(" tag=");
            sb2.append(this.f24038z);
        }
        sb2.append(")");
        return sb2.toString();
    }

    void u(boolean z10) {
        ViewGroup viewGroup;
        q qVar;
        g gVar = this.f23996L;
        if (gVar != null) {
            gVar.f24065t = false;
        }
        if (this.f23993I == null || (viewGroup = this.f23992H) == null || (qVar = this.f24032t) == null) {
            return;
        }
        F fR = F.r(viewGroup, qVar);
        fR.t();
        if (z10) {
            this.f24033u.o().post(new d(fR));
        } else {
            fR.k();
        }
        Handler handler = this.f23997M;
        if (handler != null) {
            handler.removeCallbacks(this.f23998N);
            this.f23997M = null;
        }
    }

    public final boolean u0() {
        return this.f24011a >= 7;
    }

    void u1(boolean z10) {
        U0(z10);
    }

    G1.k v() {
        return new e();
    }

    public final boolean v0() {
        q qVar = this.f24032t;
        if (qVar == null) {
            return false;
        }
        return qVar.O0();
    }

    boolean v1(Menu menu) {
        boolean z10 = false;
        if (this.f23985A) {
            return false;
        }
        if (this.f23989E && this.f23990F) {
            V0(menu);
            z10 = true;
        }
        return this.f24034v.M(menu) | z10;
    }

    public void w(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f24036x));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f24037y));
        printWriter.print(" mTag=");
        printWriter.println(this.f24038z);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f24011a);
        printWriter.print(" mWho=");
        printWriter.print(this.f24018f);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f24031s);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f24024l);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f24025m);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f24027o);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f24028p);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f23985A);
        printWriter.print(" mDetached=");
        printWriter.print(this.f23986B);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f23990F);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f23989E);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f23987C);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f23995K);
        if (this.f24032t != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f24032t);
        }
        if (this.f24033u != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f24033u);
        }
        if (this.f24035w != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f24035w);
        }
        if (this.f24019g != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f24019g);
        }
        if (this.f24013b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f24013b);
        }
        if (this.f24015c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f24015c);
        }
        if (this.f24016d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f24016d);
        }
        i iVarH0 = h0(false);
        if (iVarH0 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(iVarH0);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f24022j);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(V());
        if (H() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(H());
        }
        if (K() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(K());
        }
        if (W() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(W());
        }
        if (X() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(X());
        }
        if (this.f23992H != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f23992H);
        }
        if (this.f23993I != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f23993I);
        }
        if (D() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(D());
        }
        if (G() != null) {
            androidx.loader.app.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f24034v + ":");
        this.f24034v.U(str + "  ", fileDescriptor, printWriter, strArr);
    }

    void w0() {
        this.f24034v.R0();
    }

    void w1() {
        boolean zM0 = this.f24032t.M0(this);
        Boolean bool = this.f24023k;
        if (bool == null || bool.booleanValue() != zM0) {
            this.f24023k = Boolean.valueOf(zM0);
            W0(zM0);
            this.f24034v.N();
        }
    }

    public void x0(Bundle bundle) {
        this.f23991G = true;
    }

    void x1() {
        this.f24034v.R0();
        this.f24034v.Y(true);
        this.f24011a = 7;
        this.f23991G = false;
        Y0();
        if (!this.f23991G) {
            throw new H("Fragment " + this + " did not call through to super.onResume()");
        }
        C1995s c1995s = this.f24004T;
        AbstractC1987j.a aVar = AbstractC1987j.a.ON_RESUME;
        c1995s.i(aVar);
        if (this.f23993I != null) {
            this.f24005U.a(aVar);
        }
        this.f24034v.O();
    }

    @Override // androidx.lifecycle.InterfaceC1994q
    public AbstractC1987j y() {
        return this.f24004T;
    }

    public void y0(int i10, int i11, Intent intent) {
        if (q.H0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    void y1(Bundle bundle) {
        Z0(bundle);
    }

    i z(String str) {
        return str.equals(this.f24018f) ? this : this.f24034v.i0(str);
    }

    public void z0(Activity activity) {
        this.f23991G = true;
    }

    void z1() {
        this.f24034v.R0();
        this.f24034v.Y(true);
        this.f24011a = 5;
        this.f23991G = false;
        a1();
        if (!this.f23991G) {
            throw new H("Fragment " + this + " did not call through to super.onStart()");
        }
        C1995s c1995s = this.f24004T;
        AbstractC1987j.a aVar = AbstractC1987j.a.ON_START;
        c1995s.i(aVar);
        if (this.f23993I != null) {
            this.f24005U.a(aVar);
        }
        this.f24034v.P();
    }
}

package p170j8;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.C2333b;
import com.google.android.gms.common.C2335d;
import com.google.android.gms.common.C2342k;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: j8.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3839d {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f46905A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private volatile n0 f46906B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    protected AtomicInteger f46907C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f46908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f46909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f46910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f46911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f46912e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile String f46913f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    w0 f46914g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f46915h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Looper f46916i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AbstractC3844i f46917j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C2342k f46918k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final Handler f46919l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object f46920m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f46921n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private InterfaceC3848m f46922o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected c f46923p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private IInterface f46924q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ArrayList f46925r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private k0 f46926s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f46927t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final a f46928u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final b f46929v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f46930w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final String f46931x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private volatile String f46932y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private C2333b f46933z;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final C2335d[] f46904E = new C2335d[0];

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final String[] f46903D = {"service_esmobile", "service_googleme"};

    /* JADX INFO: renamed from: j8.d$a */
    public interface a {
        void g(Bundle bundle);

        void h(int i10);
    }

    /* JADX INFO: renamed from: j8.d$b */
    public interface b {
        void k(C2333b c2333b);
    }

    /* JADX INFO: renamed from: j8.d$c */
    public interface c {
        void a(C2333b c2333b);
    }

    /* JADX INFO: renamed from: j8.d$d, reason: collision with other inner class name */
    protected class C0551d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC3839d f46934a;

        public C0551d(AbstractC3839d abstractC3839d) {
            Objects.requireNonNull(abstractC3839d);
            this.f46934a = abstractC3839d;
        }

        @Override // p170j8.AbstractC3839d.c
        public final void a(C2333b c2333b) {
            if (c2333b.f4()) {
                AbstractC3839d abstractC3839d = this.f46934a;
                abstractC3839d.i(null, abstractC3839d.C());
            } else {
                AbstractC3839d abstractC3839d2 = this.f46934a;
                if (abstractC3839d2.e0() != null) {
                    abstractC3839d2.e0().k(c2333b);
                }
            }
        }
    }

    /* JADX INFO: renamed from: j8.d$e */
    public interface e {
        void a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    protected AbstractC3839d(Context context, Looper looper, int i10, a aVar, b bVar, String str) {
        AbstractC3844i abstractC3844iB = AbstractC3844i.b(context);
        C2342k c2342kF = C2342k.f();
        r.l(aVar);
        r.l(bVar);
        this(context, looper, abstractC3844iB, c2342kF, i10, aVar, bVar, str);
    }

    protected AbstractC3839d(Context context, Looper looper, AbstractC3844i abstractC3844i, C2342k c2342k, int i10, a aVar, b bVar, String str) {
        this.f46913f = null;
        this.f46920m = new Object();
        this.f46921n = new Object();
        this.f46925r = new ArrayList();
        this.f46927t = 1;
        this.f46933z = null;
        this.f46905A = false;
        this.f46906B = null;
        this.f46907C = new AtomicInteger(0);
        r.m(context, "Context must not be null");
        this.f46915h = context;
        r.m(looper, "Looper must not be null");
        this.f46916i = looper;
        r.m(abstractC3844i, "Supervisor must not be null");
        this.f46917j = abstractC3844i;
        r.m(c2342k, "API availability must not be null");
        this.f46918k = c2342k;
        this.f46919l = new h0(this, looper);
        this.f46930w = i10;
        this.f46928u = aVar;
        this.f46929v = bVar;
        this.f46931x = str;
    }

    private final void i0(int i10, IInterface iInterface) {
        w0 w0Var;
        r.a((i10 == 4) == (iInterface != null));
        synchronized (this.f46920m) {
            try {
                this.f46927t = i10;
                this.f46924q = iInterface;
                Bundle bundle = null;
                if (i10 == 1) {
                    k0 k0Var = this.f46926s;
                    if (k0Var != null) {
                        AbstractC3844i abstractC3844i = this.f46917j;
                        String strA = this.f46914g.a();
                        r.l(strA);
                        abstractC3844i.f(strA, this.f46914g.b(), 4225, k0Var, T(), this.f46914g.c());
                        this.f46926s = null;
                    }
                } else if (i10 == 2 || i10 == 3) {
                    k0 k0Var2 = this.f46926s;
                    if (k0Var2 != null && (w0Var = this.f46914g) != null) {
                        String strA2 = w0Var.a();
                        String strB = w0Var.b();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(strA2).length() + 70 + String.valueOf(strB).length());
                        sb2.append("Calling connect() while still connected, missing disconnect() for ");
                        sb2.append(strA2);
                        sb2.append(" on ");
                        sb2.append(strB);
                        Log.e("GmsClient", sb2.toString());
                        AbstractC3844i abstractC3844i2 = this.f46917j;
                        String strA3 = this.f46914g.a();
                        r.l(strA3);
                        abstractC3844i2.f(strA3, this.f46914g.b(), 4225, k0Var2, T(), this.f46914g.c());
                        this.f46907C.incrementAndGet();
                    }
                    k0 k0Var3 = new k0(this, this.f46907C.get());
                    this.f46926s = k0Var3;
                    w0 w0Var2 = (this.f46927t != 3 || B() == null) ? new w0(G(), F(), false, 4225, I()) : new w0(y().getPackageName(), B(), true, 4225, false);
                    this.f46914g = w0Var2;
                    if (w0Var2.c() && m() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f46914g.a())));
                    }
                    AbstractC3844i abstractC3844i3 = this.f46917j;
                    String strA4 = this.f46914g.a();
                    r.l(strA4);
                    C2333b c2333bE = abstractC3844i3.e(new r0(strA4, this.f46914g.b(), 4225, this.f46914g.c()), k0Var3, T(), w());
                    if (!c2333bE.f4()) {
                        String strA5 = this.f46914g.a();
                        String strB2 = this.f46914g.b();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(strA5).length() + 34 + String.valueOf(strB2).length());
                        sb3.append("unable to connect to service: ");
                        sb3.append(strA5);
                        sb3.append(" on ");
                        sb3.append(strB2);
                        Log.w("GmsClient", sb3.toString());
                        int iB4 = c2333bE.b4() == -1 ? 16 : c2333bE.b4();
                        if (c2333bE.d4() != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", c2333bE.d4());
                        }
                        U(iB4, bundle, this.f46907C.get());
                    }
                } else if (i10 == 4) {
                    r.l(iInterface);
                    K(iInterface);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected Bundle A() {
        return new Bundle();
    }

    protected String B() {
        return null;
    }

    protected Set C() {
        return Collections.EMPTY_SET;
    }

    public final IInterface D() {
        IInterface iInterface;
        synchronized (this.f46920m) {
            try {
                if (this.f46927t == 5) {
                    throw new DeadObjectException();
                }
                r();
                IInterface iInterface2 = this.f46924q;
                r.m(iInterface2, "Client is connected but service is null");
                iInterface = iInterface2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    protected abstract String E();

    protected abstract String F();

    protected String G() {
        return "com.google.android.gms";
    }

    public C3841f H() {
        n0 n0Var = this.f46906B;
        if (n0Var == null) {
            return null;
        }
        return n0Var.f47006d;
    }

    protected boolean I() {
        return m() >= 211700000;
    }

    public boolean J() {
        return this.f46906B != null;
    }

    protected void K(IInterface iInterface) {
        this.f46910c = System.currentTimeMillis();
    }

    protected void L(C2333b c2333b) {
        this.f46911d = c2333b.b4();
        this.f46912e = System.currentTimeMillis();
    }

    protected void M(int i10) {
        this.f46908a = i10;
        this.f46909b = System.currentTimeMillis();
    }

    protected void N(int i10, IBinder iBinder, Bundle bundle, int i11) {
        l0 l0Var = new l0(this, i10, iBinder, bundle);
        Handler handler = this.f46919l;
        handler.sendMessage(handler.obtainMessage(1, i11, -1, l0Var));
    }

    public boolean O() {
        return false;
    }

    public void P(String str) {
        this.f46932y = str;
    }

    public void Q(int i10) {
        int i11 = this.f46907C.get();
        Handler handler = this.f46919l;
        handler.sendMessage(handler.obtainMessage(6, i11, i10));
    }

    protected void R(c cVar, int i10, PendingIntent pendingIntent) {
        r.m(cVar, "Connection progress callbacks cannot be null.");
        this.f46923p = cVar;
        int i11 = this.f46907C.get();
        Handler handler = this.f46919l;
        handler.sendMessage(handler.obtainMessage(3, i11, i10, pendingIntent));
    }

    public boolean S() {
        return false;
    }

    protected final String T() {
        String str = this.f46931x;
        return str == null ? this.f46915h.getClass().getName() : str;
    }

    protected final void U(int i10, Bundle bundle, int i11) {
        m0 m0Var = new m0(this, i10, bundle);
        Handler handler = this.f46919l;
        handler.sendMessage(handler.obtainMessage(7, i11, -1, m0Var));
    }

    final /* synthetic */ void V(n0 n0Var) {
        this.f46906B = n0Var;
        if (S()) {
            C3841f c3841f = n0Var.f47006d;
            C3853s.b().c(c3841f == null ? null : c3841f.f4());
        }
    }

    final /* synthetic */ void W(int i10, IInterface iInterface) {
        i0(i10, null);
    }

    final /* synthetic */ boolean X(int i10, int i11, IInterface iInterface) {
        synchronized (this.f46920m) {
            try {
                if (this.f46927t != i10) {
                    return false;
                }
                i0(i11, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ void Y(int i10) {
        int i11;
        int i12;
        synchronized (this.f46920m) {
            i11 = this.f46927t;
        }
        if (i11 == 3) {
            this.f46905A = true;
            i12 = 5;
        } else {
            i12 = 4;
        }
        Handler handler = this.f46919l;
        handler.sendMessage(handler.obtainMessage(i12, this.f46907C.get(), 16));
    }

    final /* synthetic */ boolean Z() {
        if (this.f46905A || TextUtils.isEmpty(E()) || TextUtils.isEmpty(B())) {
            return false;
        }
        try {
            Class.forName(E());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public boolean a() {
        boolean z10;
        synchronized (this.f46920m) {
            z10 = this.f46927t == 4;
        }
        return z10;
    }

    final /* synthetic */ Object a0() {
        return this.f46921n;
    }

    public void b(String str) {
        this.f46913f = str;
        k();
    }

    final /* synthetic */ void b0(InterfaceC3848m interfaceC3848m) {
        this.f46922o = interfaceC3848m;
    }

    public boolean c() {
        boolean z10;
        synchronized (this.f46920m) {
            int i10 = this.f46927t;
            z10 = true;
            if (i10 != 2 && i10 != 3) {
                z10 = false;
            }
        }
        return z10;
    }

    final /* synthetic */ ArrayList c0() {
        return this.f46925r;
    }

    public String d() {
        w0 w0Var;
        if (!a() || (w0Var = this.f46914g) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return w0Var.b();
    }

    final /* synthetic */ a d0() {
        return this.f46928u;
    }

    public boolean e() {
        return true;
    }

    final /* synthetic */ b e0() {
        return this.f46929v;
    }

    public boolean f() {
        return false;
    }

    final /* synthetic */ C2333b f0() {
        return this.f46933z;
    }

    final /* synthetic */ void g0(C2333b c2333b) {
        this.f46933z = c2333b;
    }

    public void h(c cVar) {
        r.m(cVar, "Connection progress callbacks cannot be null.");
        this.f46923p = cVar;
        i0(2, null);
    }

    final /* synthetic */ boolean h0() {
        return this.f46905A;
    }

    public void i(InterfaceC3846k interfaceC3846k, Set set) {
        Bundle bundleA = A();
        String str = Build.VERSION.SDK_INT < 31 ? this.f46932y : this.f46932y;
        int i10 = this.f46930w;
        int i11 = C2342k.f31910a;
        Scope[] scopeArr = C3842g.f46961o;
        Bundle bundle = new Bundle();
        C2335d[] c2335dArr = C3842g.f46962p;
        C3842g c3842g = new C3842g(6, i10, i11, null, null, scopeArr, bundle, null, c2335dArr, c2335dArr, true, 0, false, str);
        c3842g.f46966d = this.f46915h.getPackageName();
        c3842g.f46969g = bundleA;
        if (set != null) {
            c3842g.f46968f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (f()) {
            Account accountU = u();
            if (accountU == null) {
                accountU = new Account("<<default account>>", "com.google");
            }
            c3842g.f46970h = accountU;
            if (interfaceC3846k != null) {
                c3842g.f46967e = interfaceC3846k.asBinder();
            }
        } else if (O()) {
            c3842g.f46970h = u();
        }
        c3842g.f46971i = f46904E;
        c3842g.f46972j = v();
        if (S()) {
            c3842g.f46975m = true;
        }
        try {
            synchronized (this.f46921n) {
                try {
                    InterfaceC3848m interfaceC3848m = this.f46922o;
                    if (interfaceC3848m != null) {
                        interfaceC3848m.z(new j0(this, this.f46907C.get()), c3842g);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (DeadObjectException e10) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            Q(3);
        } catch (RemoteException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            N(8, null, null, this.f46907C.get());
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            e = e13;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            N(8, null, null, this.f46907C.get());
        }
    }

    public void k() {
        this.f46907C.incrementAndGet();
        ArrayList arrayList = this.f46925r;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((i0) arrayList.get(i10)).d();
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f46921n) {
            this.f46922o = null;
        }
        i0(1, null);
    }

    public int m() {
        return C2342k.f31910a;
    }

    public void n(e eVar) {
        eVar.a();
    }

    public final C2335d[] o() {
        n0 n0Var = this.f46906B;
        if (n0Var == null) {
            return null;
        }
        return n0Var.f47004b;
    }

    public String p() {
        return this.f46913f;
    }

    public void q() {
        int iH = this.f46918k.h(this.f46915h, m());
        if (iH == 0) {
            h(new C0551d(this));
        } else {
            i0(1, null);
            R(new C0551d(this), iH, null);
        }
    }

    protected final void r() {
        if (!a()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    protected abstract IInterface s(IBinder iBinder);

    protected boolean t() {
        return false;
    }

    public Account u() {
        return null;
    }

    public C2335d[] v() {
        return f46904E;
    }

    protected Executor w() {
        return null;
    }

    public Bundle x() {
        return null;
    }

    public final Context y() {
        return this.f46915h;
    }

    public int z() {
        return this.f46930w;
    }
}

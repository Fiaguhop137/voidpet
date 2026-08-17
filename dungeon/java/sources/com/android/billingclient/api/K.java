package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.AbstractBinderC2806e;
import com.google.android.gms.internal.play_billing.C2903z;
import com.google.android.gms.internal.play_billing.D3;
import com.google.android.gms.internal.play_billing.E3;
import com.google.android.gms.internal.play_billing.F2;
import com.google.android.gms.internal.play_billing.G3;
import com.google.android.gms.internal.play_billing.H2;
import com.google.android.gms.internal.play_billing.InterfaceC2811f;
import com.google.android.gms.internal.play_billing.J2;
import com.google.android.gms.internal.play_billing.M2;
import com.google.android.gms.internal.play_billing.N2;
import com.google.android.gms.internal.play_billing.P2;
import com.google.android.gms.internal.play_billing.R2;
import com.google.android.gms.internal.play_billing.U2;
import com.google.android.gms.internal.play_billing.x3;
import com.google.android.gms.internal.play_billing.z3;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p131h4.InterfaceC3451g;

/* JADX INFO: loaded from: classes.dex */
final class K implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3451g f27529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2903z f27530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2903z f27531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f27532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ C2130c f27533e;

    /* synthetic */ K(C2130c c2130c, InterfaceC3451g interfaceC3451g, int i10, p131h4.D d10) {
        Objects.requireNonNull(c2130c);
        this.f27533e = c2130c;
        this.f27530b = C2903z.c(c2130c.f27615K);
        this.f27531c = C2903z.c(c2130c.f27615K);
        this.f27529a = interfaceC3451g;
        this.f27532d = i10;
    }

    public static /* synthetic */ Object a(K k10) {
        Bundle bundle;
        InterfaceC2811f interfaceC2811f;
        P2 p10;
        C2130c c2130c = k10.f27533e;
        synchronized (c2130c.f27616a) {
            try {
                if (c2130c.f27617b != 3) {
                    boolean z10 = true;
                    if (c2130c.f27617b != 1) {
                        z10 = false;
                    }
                    if (TextUtils.isEmpty(null)) {
                        bundle = null;
                    } else {
                        bundle = new Bundle();
                        bundle.putString("accountName", null);
                        com.google.android.gms.internal.play_billing.O.c(bundle, c2130c.f27618c, c2130c.f27619d, c2130c.f27614J.longValue());
                    }
                    P2 p11 = P2.REASON_UNSPECIFIED;
                    synchronized (c2130c.f27616a) {
                        interfaceC2811f = c2130c.f27624i;
                    }
                    if (interfaceC2811f == null) {
                        C2130c c2130c2 = k10.f27533e;
                        C2130c.L(c2130c2, 0);
                        int i10 = k10.f27532d;
                        P2 p12 = P2.SERVICE_RESET_TO_NULL;
                        C2133f c2133f = c0.f27659j;
                        c2130c2.e0(p12, c2133f, i10);
                        k10.g(c2133f);
                    } else {
                        C2130c c2130c3 = k10.f27533e;
                        String packageName = c2130c3.f27622g.getPackageName();
                        int iF = 3;
                        int i11 = 27;
                        while (true) {
                            if (i11 < 3) {
                                i11 = 0;
                                break;
                            }
                            try {
                                com.google.android.gms.internal.play_billing.O.l("BillingClient", "trying subs apiVersion: " + i11);
                                iF = bundle == null ? interfaceC2811f.F(i11, packageName, "subs") : interfaceC2811f.R0(i11, packageName, "subs", bundle);
                                if (iF == 0) {
                                    com.google.android.gms.internal.play_billing.O.l("BillingClient", "highestLevelSupportedForSubs: " + i11);
                                    break;
                                }
                                i11--;
                            } catch (Exception e10) {
                                com.google.android.gms.internal.play_billing.O.n("BillingClient", "Exception while checking if billing is supported; try to reconnect", e10);
                                if (e10 instanceof DeadObjectException) {
                                    p10 = P2.IS_BILLING_SUPPORTED_DEAD_OBJECT_EXCEPTION;
                                } else if (e10 instanceof RemoteException) {
                                    p10 = P2.IS_BILLING_SUPPORTED_REMOTE_EXCEPTION;
                                } else {
                                    p10 = e10 instanceof SecurityException ? P2.IS_BILLING_SUPPORTED_SECURITY_EXCEPTION : P2.IS_BILLING_SUPPORTED_SERVICE_CALL_EXCEPTION;
                                }
                                P2 p13 = p10;
                                String strA = p13.equals(P2.IS_BILLING_SUPPORTED_SERVICE_CALL_EXCEPTION) ? a0.a(e10) : null;
                                C2130c.L(k10.f27533e, 0);
                                k10.f(C2130c.F0(e10), p13, strA, z10, 0);
                                k10.g(C2130c.F0(e10));
                            }
                        }
                        c2130c3.f27627l = i11 >= 5;
                        c2130c3.f27626k = i11 >= 3;
                        if (i11 < 3) {
                            p11 = P2.SUBSCRIPTIONS_NOT_SUPPORTED;
                            com.google.android.gms.internal.play_billing.O.l("BillingClient", "In-app billing API does not support subscription on this device.");
                        }
                        for (int i12 = 27; i12 >= 3; i12--) {
                            com.google.android.gms.internal.play_billing.O.l("BillingClient", "trying inapp apiVersion: " + i12);
                            iF = bundle == null ? interfaceC2811f.F(i12, packageName, "inapp") : interfaceC2811f.R0(i12, packageName, "inapp", bundle);
                            if (iF == 0) {
                                c2130c3.f27628m = i12;
                                com.google.android.gms.internal.play_billing.O.l("BillingClient", "mHighestLevelSupportedForInApp: " + c2130c3.f27628m);
                                break;
                            }
                        }
                        C2130c.K(c2130c3, c2130c3.f27628m);
                        if (c2130c3.f27628m < 3) {
                            p11 = P2.ONE_TIME_PRODUCT_NOT_SUPPORTED;
                            com.google.android.gms.internal.play_billing.O.m("BillingClient", "In-app billing API version 3 is not supported on this device.");
                        }
                        P2 p14 = p11;
                        C2130c.M(c2130c3, iF);
                        if (iF != 0) {
                            C2133f c2133f2 = c0.f27651b;
                            k10.f(c2133f2, p14, null, z10, 0);
                            k10.g(c2133f2);
                        } else {
                            try {
                                Long lE = k10.e(z10);
                                if (z10) {
                                    J2 j2D = M2.D();
                                    j2D.p(6);
                                    E3 e3C = G3.C();
                                    int i13 = k10.f27532d;
                                    e3C.l(i13 > 0);
                                    e3C.m(i13);
                                    e3C.p(0);
                                    if (lE != null) {
                                        e3C.n(lE.longValue());
                                    }
                                    C2130c c2130c4 = k10.f27533e;
                                    j2D.n(e3C);
                                    c2130c4.d0((M2) j2D.f());
                                } else {
                                    x3 x3VarC = z3.C();
                                    N2 n2D = R2.D();
                                    n2D.r(0);
                                    n2D.n(0);
                                    x3VarC.l(n2D);
                                    if (lE != null) {
                                        x3VarC.m(lE.longValue());
                                    }
                                    k10.f27533e.f27623h.e((z3) x3VarC.f());
                                }
                            } catch (Throwable th) {
                                com.google.android.gms.internal.play_billing.O.n("BillingClient", "Unable to log.", th);
                            }
                            k10.g(c0.f27658i);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return null;
    }

    public static /* synthetic */ void b(K k10) {
        C2130c c2130c = k10.f27533e;
        C2130c.L(c2130c, 0);
        P2 p10 = P2.EXECUTE_ASYNC_TIMEOUT;
        C2133f c2133f = c0.f27660k;
        c2130c.e0(p10, c2133f, k10.f27532d);
        k10.g(c2133f);
    }

    private final Long e(boolean z10) {
        try {
            if (z10) {
                synchronized (this.f27533e.f27616a) {
                    try {
                        C2903z c2903z = this.f27530b;
                        if (!c2903z.g()) {
                            return null;
                        }
                        c2903z.f();
                        return Long.valueOf(c2903z.a(TimeUnit.MILLISECONDS));
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            synchronized (this.f27533e.f27616a) {
                try {
                    C2903z c2903z2 = this.f27531c;
                    if (!c2903z2.g()) {
                        return null;
                    }
                    c2903z2.f();
                    return Long.valueOf(c2903z2.a(TimeUnit.MILLISECONDS));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            com.google.android.gms.internal.play_billing.O.n("BillingClient", "Exception getting connection establishment duration.", th3);
        }
        com.google.android.gms.internal.play_billing.O.n("BillingClient", "Exception getting connection establishment duration.", th3);
        return null;
    }

    private final void f(C2133f c2133f, P2 p10, String str, boolean z10, int i10) {
        try {
            N2 n2D = R2.D();
            n2D.r(c2133f.c());
            n2D.m(c2133f.a());
            n2D.q(p10);
            n2D.n(0);
            if (str != null) {
                n2D.l(str);
            }
            Long lE = e(z10);
            if (!z10) {
                x3 x3VarC = z3.C();
                x3VarC.l(n2D);
                if (lE != null) {
                    x3VarC.m(lE.longValue());
                }
                this.f27533e.f27623h.e((z3) x3VarC.f());
                return;
            }
            E3 e3C = G3.C();
            int i11 = this.f27532d;
            e3C.l(i11 > 0);
            e3C.m(i11);
            e3C.p(0);
            if (lE != null) {
                e3C.n(lE.longValue());
            }
            C2130c c2130c = this.f27533e;
            F2 f2F = H2.F();
            f2F.m(n2D);
            f2F.q(6);
            f2F.p(e3C);
            c2130c.b0((H2) f2F.f());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.O.n("BillingClient", "Unable to log.", th);
        }
    }

    private final void g(C2133f c2133f) {
        C2130c c2130c = this.f27533e;
        synchronized (c2130c.f27616a) {
            try {
                if (c2130c.f27617b == 3) {
                    return;
                }
                try {
                    this.f27529a.a(c2133f);
                } catch (Throwable th) {
                    com.google.android.gms.internal.play_billing.O.n("BillingClient", "Exception while calling onBillingSetupFinished.", th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        synchronized (this.f27533e.f27616a) {
            C2903z c2903z = this.f27530b;
            c2903z.d();
            c2903z.e();
        }
    }

    final boolean d() {
        return this.f27532d > 0;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        com.google.android.gms.internal.play_billing.O.m("BillingClient", "Billing service died.");
        try {
            C2130c c2130c = this.f27533e;
            if (C2130c.Q(c2130c)) {
                b0 b0Var = c2130c.f27623h;
                F2 f2F = H2.F();
                f2F.q(6);
                N2 n2D = R2.D();
                n2D.q(P2.BINDING_DIED);
                f2F.m(n2D);
                E3 e3C = G3.C();
                int i10 = this.f27532d;
                e3C.l(i10 > 0);
                e3C.m(i10);
                f2F.p(e3C);
                b0Var.k((H2) f2F.f());
            } else {
                c2130c.f27623h.b(U2.D());
            }
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.O.n("BillingClient", "Unable to log.", th);
        }
        C2130c c2130c2 = this.f27533e;
        synchronized (c2130c2.f27616a) {
            if (c2130c2.f27617b != 3 && c2130c2.f27617b != 0) {
                C2130c.L(c2130c2, 0);
                c2130c2.i0();
                try {
                    this.f27529a.b();
                } catch (Throwable th2) {
                    com.google.android.gms.internal.play_billing.O.n("BillingClient", "Exception while calling onBillingServiceDisconnected.", th2);
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.O.l("BillingClient", "Billing service connected.");
        C2130c c2130c = this.f27533e;
        synchronized (c2130c.f27616a) {
            try {
                if (c2130c.f27617b == 3) {
                    return;
                }
                c2130c.f27624i = AbstractBinderC2806e.c1(iBinder);
                if (C2130c.n(new I(this), 30000L, new J(this), c2130c.V(), c2130c.m()) == null) {
                    int i10 = this.f27532d;
                    C2133f c2133fY = c2130c.Y();
                    c2130c.e0(P2.MISSING_RESULT_FROM_EXECUTE_ASYNC, c2133fY, i10);
                    g(c2133fY);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.internal.play_billing.O.m("BillingClient", "Billing service disconnected.");
        try {
            C2130c c2130c = this.f27533e;
            if (C2130c.Q(c2130c)) {
                b0 b0Var = c2130c.f27623h;
                F2 f2F = H2.F();
                f2F.q(6);
                N2 n2D = R2.D();
                n2D.q(P2.SERVICE_DISCONNECTED);
                f2F.m(n2D);
                E3 e3C = G3.C();
                int i10 = this.f27532d;
                e3C.l(i10 > 0);
                e3C.m(i10);
                f2F.p(e3C);
                b0Var.k((H2) f2F.f());
            } else {
                c2130c.f27623h.h(D3.D());
            }
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.O.n("BillingClient", "Unable to log.", th);
        }
        C2130c c2130c2 = this.f27533e;
        synchronized (c2130c2.f27616a) {
            try {
                C2903z c2903z = this.f27531c;
                c2903z.d();
                c2903z.e();
                if (c2130c2.f27617b == 3) {
                    return;
                }
                C2130c.L(c2130c2, 0);
                try {
                    this.f27529a.b();
                } catch (Throwable th2) {
                    com.google.android.gms.internal.play_billing.O.n("BillingClient", "Exception while calling onBillingServiceDisconnected.", th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}

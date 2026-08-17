package com.android.billingclient.api;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.google.android.gms.internal.play_billing.AbstractC2900y0;
import com.google.android.gms.internal.play_billing.E0;
import com.google.android.gms.internal.play_billing.H2;
import com.google.android.gms.internal.play_billing.InterfaceC2841l;
import com.google.android.gms.internal.play_billing.L3;
import com.google.android.gms.internal.play_billing.M2;
import com.google.android.gms.internal.play_billing.P2;
import com.google.android.gms.internal.play_billing.Q3;
import com.google.android.gms.internal.play_billing.W2;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p131h4.C3445a;
import p131h4.C3456l;
import p131h4.InterfaceC3446b;
import p131h4.InterfaceC3451g;
import p131h4.InterfaceC3457m;
import p131h4.InterfaceC3459o;
import p131h4.InterfaceC3462s;
import p131h4.InterfaceC3464u;
import p131h4.InterfaceC3466w;

/* JADX INFO: loaded from: classes.dex */
final class Z extends C2130c {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final Context f27585L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private volatile int f27586M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private volatile InterfaceC2841l f27587N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private volatile Y f27588O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private volatile ScheduledExecutorService f27589P;

    Z(String str, Context context, b0 b0Var, ExecutorService executorService, AbstractC2129b.a aVar) {
        super(null, context, null, null, aVar);
        this.f27586M = 0;
        this.f27585L = context;
    }

    Z(String str, C2136i c2136i, Context context, p131h4.N n10, b0 b0Var, ExecutorService executorService, AbstractC2129b.a aVar) {
        super(null, c2136i, context, null, null, null, aVar);
        this.f27586M = 0;
        this.f27585L = context;
    }

    Z(String str, C2136i c2136i, Context context, InterfaceC3464u interfaceC3464u, p131h4.C c10, b0 b0Var, ExecutorService executorService, AbstractC2129b.a aVar) {
        super(null, c2136i, context, interfaceC3464u, null, null, null, aVar);
        this.f27586M = 0;
        this.f27585L = context;
    }

    Z(String str, C2136i c2136i, Context context, InterfaceC3464u interfaceC3464u, InterfaceC3466w interfaceC3466w, InterfaceC3459o interfaceC3459o, b0 b0Var, ExecutorService executorService, AbstractC2129b.a aVar) {
        super(null, c2136i, context, interfaceC3464u, interfaceC3466w, interfaceC3459o, null, null, aVar);
        this.f27586M = 0;
        this.f27585L = context;
    }

    public static /* synthetic */ Object V0(Z z10, int i10, L3 l10) {
        String str;
        try {
            if (z10.f27587N == null) {
                throw null;
            }
            InterfaceC2841l interfaceC2841l = z10.f27587N;
            String packageName = z10.f27585L.getPackageName();
            if (i10 == 2) {
                str = "LAUNCH_BILLING_FLOW";
            } else if (i10 == 3) {
                str = "ACKNOWLEDGE_PURCHASE";
            } else if (i10 == 4) {
                str = "CONSUME_ASYNC";
            } else if (i10 != 5) {
                str = i10 != 6 ? "QUERY_PRODUCT_DETAILS_ASYNC" : "START_CONNECTION";
            } else {
                str = "IS_FEATURE_SUPPORTED";
            }
            interfaceC2841l.n0(packageName, str, new X(l10));
            return "billingOverrideService.getBillingOverride";
        } catch (Exception e10) {
            z10.f1(P2.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION, 28, c0.f27646E);
            com.google.android.gms.internal.play_billing.O.n("BillingClientTesting", "An error occurred while retrieving billing override.", e10);
            l10.b(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    private final int Y0(E0 e10) {
        try {
            return ((Integer) e10.get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e11) {
            f1(P2.BILLING_OVERRIDE_SERVICE_CALL_TIMEOUT, 28, c0.f27646E);
            com.google.android.gms.internal.play_billing.O.n("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e11);
            return 0;
        } catch (Exception e12) {
            if (e12 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            f1(P2.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION, 28, c0.f27646E);
            com.google.android.gms.internal.play_billing.O.n("BillingClientTesting", "An error occurred while retrieving billing override.", e12);
            return 0;
        }
    }

    private final synchronized ScheduledExecutorService Z0() {
        try {
            if (this.f27589P == null) {
                this.f27589P = Executors.newSingleThreadScheduledExecutor();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f27589P;
    }

    private final synchronized void a1() {
        g1(27);
        try {
            try {
                if (this.f27588O != null && this.f27587N != null) {
                    com.google.android.gms.internal.play_billing.O.l("BillingClientTesting", "Unbinding from Billing Override Service.");
                    this.f27585L.unbindService(this.f27588O);
                    this.f27588O = new Y(this, null);
                }
                this.f27587N = null;
                if (this.f27589P != null) {
                    this.f27589P.shutdownNow();
                    this.f27589P = null;
                }
            } catch (RuntimeException e10) {
                com.google.android.gms.internal.play_billing.O.n("BillingClientTesting", "There was an exception while ending Billing Override Service connection!", e10);
            }
            this.f27586M = 3;
        } catch (Throwable th) {
            this.f27586M = 3;
            throw th;
        }
    }

    private final synchronized void b1() {
        if (T0()) {
            com.google.android.gms.internal.play_billing.O.l("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
            g1(26);
            return;
        }
        if (this.f27586M == 1) {
            com.google.android.gms.internal.play_billing.O.m("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
            return;
        }
        if (this.f27586M == 3) {
            com.google.android.gms.internal.play_billing.O.m("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
            f1(P2.BILLING_CLIENT_CLOSED, 26, c0.a(-1, "Billing Override Service connection is disconnected."));
            return;
        }
        this.f27586M = 1;
        com.google.android.gms.internal.play_billing.O.l("BillingClientTesting", "Starting Billing Override Service setup.");
        this.f27588O = new Y(this, null);
        Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
        intent.setPackage("com.google.android.apps.play.billingtestcompanion");
        Context context = this.f27585L;
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        P2 p10 = P2.REASON_UNSPECIFIED;
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            p10 = P2.INTENT_SERVICE_NOT_FOUND;
        } else {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            if (serviceInfo != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                    p10 = P2.BILLING_SERVICE_BLOCKED;
                    com.google.android.gms.internal.play_billing.O.m("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                } else {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    if (context.bindService(intent2, this.f27588O, 1)) {
                        com.google.android.gms.internal.play_billing.O.l("BillingClientTesting", "Billing Override Service was bonded successfully.");
                        return;
                    } else {
                        p10 = P2.BILLING_SERVICE_BLOCKED;
                        com.google.android.gms.internal.play_billing.O.m("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                    }
                }
            }
        }
        this.f27586M = 0;
        com.google.android.gms.internal.play_billing.O.l("BillingClientTesting", "Billing Override Service unavailable on device.");
        f1(p10, 26, c0.a(2, "Billing Override Service unavailable on device."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c1(int i10) {
        return i10 > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2133f d1(int i10, int i11) {
        C2133f c2133fA = c0.a(i11, "Billing override value was set by a license tester.");
        f1(P2.LICENSE_TESTER_BILLING_OVERRIDE, i10, c2133fA);
        return c2133fA;
    }

    private final E0 e1(int i10) {
        if (T0()) {
            return Q3.a(new S(this, i10));
        }
        com.google.android.gms.internal.play_billing.O.m("BillingClientTesting", "Billing Override Service is not ready.");
        f1(P2.BILLING_OVERRIDE_SERVICE_CONNECTION_NOT_READY, 28, c0.a(-1, "Billing Override Service connection is disconnected."));
        return AbstractC2900y0.a(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f1(P2 p10, int i10, C2133f c2133f) {
        int i11 = a0.f27592a;
        H2 h2B = a0.b(p10, i10, c2133f, null, W2.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(h2B, "ApiFailure should not be null");
        D0().k(h2B);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g1(int i10) {
        int i11 = a0.f27592a;
        M2 m2C = a0.c(i10, W2.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(m2C, "ApiSuccess should not be null");
        D0().g(m2C);
    }

    private final void h1(int i10, p199l1.b bVar, Runnable runnable) {
        AbstractC2900y0.c(AbstractC2900y0.b(e1(i10), 28500L, TimeUnit.MILLISECONDS, Z0()), new W(this, i10, bVar, runnable), m());
    }

    public final synchronized boolean T0() {
        return (this.f27586M != 2 || this.f27587N == null || this.f27588O == null) ? false : true;
    }

    @Override // com.android.billingclient.api.C2130c, com.android.billingclient.api.AbstractC2129b
    public final void a(C3445a c3445a, InterfaceC3446b interfaceC3446b) {
        Objects.requireNonNull(interfaceC3446b);
        h1(3, new p131h4.F(interfaceC3446b), new T(this, c3445a, interfaceC3446b));
    }

    @Override // com.android.billingclient.api.C2130c, com.android.billingclient.api.AbstractC2129b
    public final void b(C3456l c3456l, InterfaceC3457m interfaceC3457m) {
        h1(4, new p131h4.E(interfaceC3457m, c3456l), new Q(this, c3456l, interfaceC3457m));
    }

    @Override // com.android.billingclient.api.C2130c, com.android.billingclient.api.AbstractC2129b
    public final void c() {
        a1();
        super.c();
    }

    @Override // com.android.billingclient.api.C2130c, com.android.billingclient.api.AbstractC2129b
    public final C2133f f(Activity activity, C2132e c2132e) {
        U u10 = new U(this);
        V v10 = new V(this, activity, c2132e);
        int iY0 = Y0(e1(2));
        if (c1(iY0)) {
            C2133f c2133fD1 = d1(2, iY0);
            u10.accept(c2133fD1);
            return c2133fD1;
        }
        try {
            return (C2133f) v10.call();
        } catch (Exception e10) {
            P2 p10 = P2.BILLING_OVERRIDE_SERVICE_FALLBACK_ERROR;
            C2133f c2133f = c0.f27657h;
            f1(p10, 2, c2133f);
            com.google.android.gms.internal.play_billing.O.n("BillingClientTesting", "An internal error occurred.", e10);
            return c2133f;
        }
    }

    @Override // com.android.billingclient.api.C2130c, com.android.billingclient.api.AbstractC2129b
    public final void h(C2138k c2138k, InterfaceC3462s interfaceC3462s) {
        h1(7, new O(interfaceC3462s), new P(this, c2138k, interfaceC3462s));
    }

    @Override // com.android.billingclient.api.C2130c, com.android.billingclient.api.AbstractC2129b
    public final void j(InterfaceC3451g interfaceC3451g) {
        b1();
        super.j(interfaceC3451g);
    }
}

package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import io.sentry.A3;
import io.sentry.AbstractC3725j2;
import io.sentry.AbstractC3732l;
import io.sentry.EnumC3721i3;
import io.sentry.V2;
import io.sentry.protocol.C3757a;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: io.sentry.android.core.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3671u0 implements io.sentry.C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f45166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3636g0 f45167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SentryAndroidOptions f45168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Future f45169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.sentry.util.p f45170e = new io.sentry.util.p(new C3665r0());

    public C3671u0(Context context, C3636g0 c3636g0, SentryAndroidOptions sentryAndroidOptions) {
        Future futureSubmit;
        this.f45166a = (Context) io.sentry.util.w.c(AbstractC3662p0.g(context), "The application context is required.");
        this.f45167b = (C3636g0) io.sentry.util.w.c(c3636g0, "The BuildInfoProvider is required.");
        this.f45168c = (SentryAndroidOptions) io.sentry.util.w.c(sentryAndroidOptions, "The options object is required.");
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        try {
            futureSubmit = executorServiceNewSingleThreadExecutor.submit(new CallableC3667s0(this, sentryAndroidOptions));
        } catch (RejectedExecutionException e10) {
            sentryAndroidOptions.getLogger().b(EnumC3721i3.WARNING, "Device info caching task rejected.", e10);
            futureSubmit = null;
        }
        this.f45169d = futureSubmit;
        executorServiceNewSingleThreadExecutor.shutdown();
    }

    private static void g(V2 v10) {
        io.sentry.protocol.C cI;
        List listE;
        List listP0 = v10.p0();
        if (listP0 == null || listP0.size() <= 1) {
            return;
        }
        io.sentry.protocol.s sVar = (io.sentry.protocol.s) listP0.get(listP0.size() - 1);
        if (!"java.lang".equals(sVar.h()) || (cI = sVar.i()) == null || (listE = cI.e()) == null) {
            return;
        }
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            if ("com.android.internal.os.RuntimeInit$MethodAndArgsCaller".equals(((io.sentry.protocol.B) it.next()).v())) {
                Collections.reverse(listP0);
                return;
            }
        }
    }

    private void h(AbstractC3725j2 abstractC3725j2) {
        String str;
        io.sentry.protocol.n nVarH = abstractC3725j2.C().h();
        Future future = this.f45169d;
        if (future != null) {
            try {
                abstractC3725j2.C().u(((C3681z0) future.get()).l());
            } catch (Throwable th) {
                this.f45168c.getLogger().b(EnumC3721i3.ERROR, "Failed to retrieve os system", th);
            }
        } else {
            this.f45168c.getLogger().c(EnumC3721i3.ERROR, "Failed to retrieve device info", new Object[0]);
        }
        if (nVarH != null) {
            String strG = nVarH.g();
            if (strG == null || strG.isEmpty()) {
                str = "os_1";
            } else {
                str = "os_" + strG.trim().toLowerCase(Locale.ROOT);
            }
            abstractC3725j2.C().l(str, nVarH);
        }
    }

    private void i(AbstractC3725j2 abstractC3725j2) {
        io.sentry.protocol.I iQ = abstractC3725j2.Q();
        if (iQ == null) {
            iQ = new io.sentry.protocol.I();
            abstractC3725j2.f0(iQ);
        }
        if (iQ.i() == null) {
            iQ.o((String) this.f45168c.getRuntimeManager().a(new C3669t0(this)));
        }
        if (iQ.j() == null && this.f45168c.isSendDefaultPii()) {
            iQ.p("{{auto}}");
        }
    }

    private void j(AbstractC3725j2 abstractC3725j2, io.sentry.H h10) {
        C3757a c3757aD = abstractC3725j2.C().d();
        if (c3757aD == null) {
            c3757aD = new C3757a();
        }
        k(c3757aD, h10);
        o(abstractC3725j2, c3757aD);
        abstractC3725j2.C().o(c3757aD);
    }

    private void k(C3757a c3757a, io.sentry.H h10) {
        Boolean boolH;
        c3757a.o(AbstractC3662p0.i(this.f45166a));
        io.sentry.android.core.performance.h hVarM = io.sentry.android.core.performance.f.q().m(this.f45168c);
        if (hVarM.x()) {
            c3757a.p(AbstractC3732l.o(hVarM.r()));
        }
        if (io.sentry.util.l.g(h10) || c3757a.l() != null || (boolH = C3628c0.g().h()) == null) {
            return;
        }
        c3757a.r(Boolean.valueOf(!boolH.booleanValue()));
    }

    private void l(AbstractC3725j2 abstractC3725j2, boolean z10, boolean z11) {
        i(abstractC3725j2);
        m(abstractC3725j2, z10, z11);
        p(abstractC3725j2);
    }

    private void m(AbstractC3725j2 abstractC3725j2, boolean z10, boolean z11) {
        if (abstractC3725j2.C().e() == null) {
            if (this.f45169d != null) {
                try {
                    abstractC3725j2.C().q(((C3681z0) this.f45169d.get()).c(z10, z11));
                } catch (Throwable th) {
                    this.f45168c.getLogger().b(EnumC3721i3.ERROR, "Failed to retrieve device info", th);
                }
            } else {
                this.f45168c.getLogger().c(EnumC3721i3.ERROR, "Failed to retrieve device info", new Object[0]);
            }
            h(abstractC3725j2);
        }
    }

    private void n(AbstractC3725j2 abstractC3725j2, String str) {
        if (abstractC3725j2.E() == null) {
            abstractC3725j2.U(str);
        }
    }

    private void o(AbstractC3725j2 abstractC3725j2, C3757a c3757a) {
        C3681z0 c3681z0;
        PackageInfo packageInfoO = AbstractC3662p0.o(this.f45166a, 4096, this.f45168c.getLogger(), this.f45167b);
        if (packageInfoO != null) {
            n(abstractC3725j2, AbstractC3662p0.q(packageInfoO, this.f45167b));
            Future future = this.f45169d;
            if (future != null) {
                try {
                    c3681z0 = (C3681z0) future.get();
                } catch (Throwable th) {
                    this.f45168c.getLogger().b(EnumC3721i3.ERROR, "Failed to retrieve device info", th);
                    c3681z0 = null;
                }
                AbstractC3662p0.x(packageInfoO, this.f45167b, c3681z0, c3757a);
            }
            this.f45168c.getLogger().c(EnumC3721i3.ERROR, "Failed to retrieve device info", new Object[0]);
            c3681z0 = null;
            AbstractC3662p0.x(packageInfoO, this.f45167b, c3681z0, c3757a);
        }
    }

    private void p(AbstractC3725j2 abstractC3725j2) {
        Future future = this.f45169d;
        if (future == null) {
            this.f45168c.getLogger().c(EnumC3721i3.ERROR, "Failed to retrieve device info", new Object[0]);
            return;
        }
        try {
            AbstractC3662p0.a aVarN = ((C3681z0) future.get()).n();
            if (aVarN != null) {
                for (Map.Entry entry : aVarN.a().entrySet()) {
                    abstractC3725j2.d0((String) entry.getKey(), (String) entry.getValue());
                }
            }
        } catch (Throwable th) {
            this.f45168c.getLogger().b(EnumC3721i3.ERROR, "Error getting side loaded info.", th);
        }
    }

    private void q(V2 v10, io.sentry.H h10) {
        if (v10.u0() != null) {
            boolean zG = io.sentry.util.l.g(h10);
            for (io.sentry.protocol.D d10 : v10.u0()) {
                boolean zH = io.sentry.android.core.internal.util.m.e().h(d10);
                if (d10.o() == null) {
                    d10.r(Boolean.valueOf(zH));
                }
                if (!zG && d10.p() == null) {
                    d10.v(Boolean.valueOf(zH));
                }
            }
        }
    }

    private boolean r(AbstractC3725j2 abstractC3725j2, io.sentry.H h10) {
        if (io.sentry.util.l.n(h10)) {
            return true;
        }
        this.f45168c.getLogger().c(EnumC3721i3.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", abstractC3725j2.G());
        return false;
    }

    @Override // io.sentry.C
    public A3 a(A3 a10, io.sentry.H h10) {
        boolean zR = r(a10, h10);
        if (zR) {
            j(a10, h10);
        }
        l(a10, false, zR);
        return a10;
    }

    @Override // io.sentry.C
    public V2 b(V2 v10, io.sentry.H h10) {
        boolean zR = r(v10, h10);
        if (zR) {
            j(v10, h10);
            q(v10, h10);
        }
        l(v10, true, zR);
        g(v10);
        return v10;
    }

    @Override // io.sentry.C
    public io.sentry.protocol.E c(io.sentry.protocol.E e10, io.sentry.H h10) {
        boolean zR = r(e10, h10);
        if (zR) {
            j(e10, h10);
        }
        l(e10, false, zR);
        return e10;
    }
}

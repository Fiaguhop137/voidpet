package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.util.DisplayMetrics;
import io.sentry.AbstractC3725j2;
import io.sentry.C3833z3;
import io.sentry.D3;
import io.sentry.EnumC3721i3;
import io.sentry.InterfaceC3687c;
import io.sentry.T3;
import io.sentry.V2;
import io.sentry.W2;
import io.sentry.protocol.C3757a;
import io.sentry.protocol.C3759c;
import io.sentry.protocol.C3760d;
import io.sentry.protocol.C3761e;
import io.sentry.protocol.DebugImage;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: io.sentry.android.core.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3632e0 implements InterfaceC3687c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f44874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SentryAndroidOptions f44875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3636g0 f44876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final W2 f44877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.sentry.cache.t f44878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f44879f = Collections.singletonList(new b(this, null));

    /* JADX INFO: renamed from: io.sentry.android.core.e0$b */
    private final class b implements c {
        private b() {
        }

        /* synthetic */ b(C3632e0 c3632e0, a aVar) {
            this();
        }

        private io.sentry.protocol.D d(List list) {
            if (list == null) {
                return null;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                io.sentry.protocol.D d10 = (io.sentry.protocol.D) it.next();
                String strM = d10.m();
                if (strM != null && strM.equals("main")) {
                    return d10;
                }
            }
            return null;
        }

        private boolean e(Object obj) {
            if (obj instanceof io.sentry.hints.a) {
                return "anr_background".equals(((io.sentry.hints.a) obj).h());
            }
            return false;
        }

        private void f(V2 v10, io.sentry.hints.c cVar, boolean z10) {
            if (v10.p0() != null) {
                return;
            }
            io.sentry.protocol.l lVar = new io.sentry.protocol.l();
            if (cVar.b()) {
                lVar.r("AppExitInfo");
            } else {
                lVar.r("HistoricalAppExitInfo");
            }
            String str = "ANR";
            if (z10) {
                str = "Background ANR";
            }
            ApplicationNotResponding applicationNotResponding = new ApplicationNotResponding(str, Thread.currentThread());
            io.sentry.protocol.D d10 = d(v10.u0());
            if (d10 == null) {
                d10 = new io.sentry.protocol.D();
                d10.y(new io.sentry.protocol.C());
            }
            v10.A0(C3632e0.this.f44877d.f(d10, lVar, applicationNotResponding));
        }

        private void g(AbstractC3725j2 abstractC3725j2, boolean z10) {
            C3757a c3757aD = abstractC3725j2.C().d();
            if (c3757aD == null) {
                c3757aD = new C3757a();
                abstractC3725j2.C().o(c3757aD);
            }
            if (c3757aD.l() == null) {
                c3757aD.r(Boolean.valueOf(z10));
            }
        }

        private void h(V2 v10, boolean z10) {
            if (v10.q0() == null) {
                v10.B0(Arrays.asList("{{ default }}", z10 ? "background-anr" : "foreground-anr"));
            }
        }

        @Override // io.sentry.android.core.C3632e0.c
        public void a(V2 v10, io.sentry.hints.c cVar, Object obj) {
            boolean zE = e(obj);
            C3632e0.this.u(v10);
            f(v10, cVar, zE);
        }

        @Override // io.sentry.android.core.C3632e0.c
        public boolean b(Object obj) {
            return obj instanceof io.sentry.hints.a;
        }

        @Override // io.sentry.android.core.C3632e0.c
        public void c(V2 v10, io.sentry.hints.c cVar, Object obj) {
            boolean zE = e(obj);
            g(v10, !zE);
            h(v10, zE);
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.core.e0$c */
    private interface c {
        void a(V2 v10, io.sentry.hints.c cVar, Object obj);

        boolean b(Object obj);

        void c(V2 v10, io.sentry.hints.c cVar, Object obj);
    }

    public C3632e0(Context context, SentryAndroidOptions sentryAndroidOptions, C3636g0 c3636g0) {
        this.f44874a = AbstractC3662p0.g(context);
        this.f44875b = sentryAndroidOptions;
        this.f44876c = c3636g0;
        this.f44878e = sentryAndroidOptions.findPersistingScopeObserver();
        this.f44877d = new W2(new D3(sentryAndroidOptions));
    }

    private void A(V2 v10) {
        EnumC3721i3 enumC3721i3 = (EnumC3721i3) o(this.f44875b, "level.json", EnumC3721i3.class);
        if (v10.r0() == null) {
            v10.C0(enumC3721i3);
        }
    }

    private void B(AbstractC3725j2 abstractC3725j2) {
        Map map = (Map) io.sentry.cache.h.b(this.f44875b, "tags.json", Map.class);
        if (map == null) {
            return;
        }
        if (abstractC3725j2.N() == null) {
            abstractC3725j2.e0(new HashMap(map));
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!abstractC3725j2.N().containsKey(entry.getKey())) {
                abstractC3725j2.d0((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    private void C(AbstractC3725j2 abstractC3725j2) {
        if (abstractC3725j2.J() == null) {
            abstractC3725j2.Z((String) io.sentry.cache.h.b(this.f44875b, "release.json", String.class));
        }
    }

    private void D(V2 v10) {
        String str = (String) o(this.f44875b, "replay.json", String.class);
        String cacheDirPath = this.f44875b.getCacheDirPath();
        if (cacheDirPath == null) {
            return;
        }
        if (!new File(cacheDirPath, "replay_" + str).exists()) {
            if (!p(v10)) {
                return;
            }
            File[] fileArrListFiles = new File(cacheDirPath).listFiles();
            String strSubstring = null;
            if (fileArrListFiles != null) {
                long jLastModified = Long.MIN_VALUE;
                for (File file : fileArrListFiles) {
                    if (file.isDirectory() && file.getName().startsWith("replay_") && file.lastModified() > jLastModified && file.lastModified() <= v10.v0().getTime()) {
                        jLastModified = file.lastModified();
                        strSubstring = file.getName().substring(7);
                    }
                }
            }
            str = strSubstring;
        }
        if (str == null) {
            return;
        }
        io.sentry.cache.t.E(this.f44875b, str, "replay.json");
        v10.C().l("replay_id", str);
    }

    private void E(AbstractC3725j2 abstractC3725j2) {
        if (abstractC3725j2.K() == null) {
            abstractC3725j2.a0((io.sentry.protocol.o) o(this.f44875b, "request.json", io.sentry.protocol.o.class));
        }
    }

    private void F(AbstractC3725j2 abstractC3725j2) {
        Map map = (Map) o(this.f44875b, "tags.json", Map.class);
        if (map == null) {
            return;
        }
        if (abstractC3725j2.N() == null) {
            abstractC3725j2.e0(new HashMap(map));
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!abstractC3725j2.N().containsKey(entry.getKey())) {
                abstractC3725j2.d0((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    private void G(AbstractC3725j2 abstractC3725j2) {
        if (abstractC3725j2.L() == null) {
            abstractC3725j2.b0((io.sentry.protocol.r) io.sentry.cache.h.b(this.f44875b, "sdk-version.json", io.sentry.protocol.r.class));
        }
    }

    private void H(AbstractC3725j2 abstractC3725j2) {
        try {
            AbstractC3662p0.a aVarN = C3681z0.k(this.f44874a, this.f44875b).n();
            if (aVarN != null) {
                for (Map.Entry entry : aVarN.a().entrySet()) {
                    abstractC3725j2.d0((String) entry.getKey(), (String) entry.getValue());
                }
            }
        } catch (Throwable th) {
            this.f44875b.getLogger().b(EnumC3721i3.ERROR, "Error getting side loaded info.", th);
        }
    }

    private void I(V2 v10) {
        n(v10);
        H(v10);
    }

    private void J(V2 v10) {
        T3 t10 = (T3) o(this.f44875b, "trace.json", T3.class);
        if (v10.C().j() != null || t10 == null) {
            return;
        }
        v10.C().z(t10);
    }

    private void K(V2 v10) {
        String str = (String) o(this.f44875b, "transaction.json", String.class);
        if (v10.w0() == null) {
            v10.H0(str);
        }
    }

    private void L(AbstractC3725j2 abstractC3725j2) {
        if (abstractC3725j2.Q() == null) {
            abstractC3725j2.f0((io.sentry.protocol.I) o(this.f44875b, "user.json", io.sentry.protocol.I.class));
        }
    }

    private void g(V2 v10) {
        C(v10);
        x(v10);
        w(v10);
        t(v10);
        G(v10);
        q(v10);
        B(v10);
    }

    private void h(V2 v10) {
        E(v10);
        L(v10);
        F(v10);
        r(v10);
        y(v10);
        s(v10);
        K(v10);
        z(v10);
        A(v10);
        J(v10);
        D(v10);
    }

    private c i(Object obj) {
        for (c cVar : this.f44879f) {
            if (cVar.b(obj)) {
                return cVar;
            }
        }
        return null;
    }

    private C3761e j() {
        C3761e c3761e = new C3761e();
        c3761e.b0(Build.MANUFACTURER);
        c3761e.P(Build.BRAND);
        c3761e.V(AbstractC3662p0.l(this.f44875b.getLogger()));
        c3761e.d0(Build.MODEL);
        c3761e.e0(Build.ID);
        c3761e.L(AbstractC3662p0.j());
        ActivityManager.MemoryInfo memoryInfoN = AbstractC3662p0.n(this.f44874a, this.f44875b.getLogger());
        if (memoryInfoN != null) {
            c3761e.c0(l(memoryInfoN));
        }
        c3761e.n0(this.f44876c.f());
        DisplayMetrics displayMetricsK = AbstractC3662p0.k(this.f44874a, this.f44875b.getLogger());
        if (displayMetricsK != null) {
            c3761e.m0(Integer.valueOf(displayMetricsK.widthPixels));
            c3761e.l0(Integer.valueOf(displayMetricsK.heightPixels));
            c3761e.j0(Float.valueOf(displayMetricsK.density));
            c3761e.k0(Integer.valueOf(displayMetricsK.densityDpi));
        }
        if (c3761e.J() == null) {
            c3761e.Y(k());
        }
        List listC = io.sentry.android.core.internal.util.p.a().c();
        if (!listC.isEmpty()) {
            c3761e.i0(Double.valueOf(((Integer) Collections.max(listC)).doubleValue()));
            c3761e.h0(Integer.valueOf(listC.size()));
        }
        return c3761e;
    }

    private String k() {
        try {
            return (String) this.f44875b.getRuntimeManager().a(new C3630d0(this));
        } catch (Throwable th) {
            this.f44875b.getLogger().b(EnumC3721i3.ERROR, "Error getting installationId.", th);
            return null;
        }
    }

    private Long l(ActivityManager.MemoryInfo memoryInfo) {
        return Long.valueOf(memoryInfo.totalMem);
    }

    private void m(AbstractC3725j2 abstractC3725j2) {
        String str;
        io.sentry.protocol.n nVarH = abstractC3725j2.C().h();
        abstractC3725j2.C().u(C3681z0.k(this.f44874a, this.f44875b).l());
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

    private void n(AbstractC3725j2 abstractC3725j2) {
        io.sentry.protocol.I iQ = abstractC3725j2.Q();
        if (iQ == null) {
            iQ = new io.sentry.protocol.I();
            abstractC3725j2.f0(iQ);
        }
        if (iQ.i() == null) {
            iQ.o(k());
        }
        if (iQ.j() == null && this.f44875b.isSendDefaultPii()) {
            iQ.p("{{auto}}");
        }
    }

    private Object o(C3833z3 c3833z3, String str, Class cls) {
        io.sentry.cache.t tVar = this.f44878e;
        if (tVar == null) {
            return null;
        }
        return tVar.B(c3833z3, str, cls);
    }

    private boolean p(V2 v10) {
        String str = (String) io.sentry.cache.h.b(this.f44875b, "replay-error-sample-rate.json", String.class);
        if (str == null) {
            return false;
        }
        try {
            if (Double.parseDouble(str) >= io.sentry.util.B.a().c()) {
                return true;
            }
            this.f44875b.getLogger().c(EnumC3721i3.DEBUG, "Not capturing replay for ANR %s due to not being sampled.", v10.G());
            return false;
        } catch (Throwable th) {
            this.f44875b.getLogger().b(EnumC3721i3.ERROR, "Error parsing replay sample rate.", th);
            return false;
        }
    }

    private void q(AbstractC3725j2 abstractC3725j2) {
        C3757a c3757aD = abstractC3725j2.C().d();
        if (c3757aD == null) {
            c3757aD = new C3757a();
        }
        c3757aD.o(AbstractC3662p0.i(this.f44874a));
        PackageInfo packageInfoP = AbstractC3662p0.p(this.f44874a, this.f44876c);
        if (packageInfoP != null) {
            c3757aD.n(packageInfoP.packageName);
        }
        String strJ = abstractC3725j2.J() != null ? abstractC3725j2.J() : (String) io.sentry.cache.h.b(this.f44875b, "release.json", String.class);
        if (strJ != null) {
            try {
                String strSubstring = strJ.substring(strJ.indexOf(64) + 1, strJ.indexOf(43));
                String strSubstring2 = strJ.substring(strJ.indexOf(43) + 1);
                c3757aD.q(strSubstring);
                c3757aD.m(strSubstring2);
            } catch (Throwable unused) {
                this.f44875b.getLogger().c(EnumC3721i3.WARNING, "Failed to parse release from scope cache: %s", strJ);
            }
        }
        try {
            AbstractC3662p0.b bVarO = C3681z0.k(this.f44874a, this.f44875b).o();
            if (bVarO != null) {
                c3757aD.t(Boolean.valueOf(bVarO.b()));
                if (bVarO.a() != null) {
                    c3757aD.u(Arrays.asList(bVarO.a()));
                }
            }
        } catch (Throwable th) {
            this.f44875b.getLogger().b(EnumC3721i3.ERROR, "Error getting split apks info.", th);
        }
        abstractC3725j2.C().o(c3757aD);
    }

    private void r(AbstractC3725j2 abstractC3725j2) {
        List list = (List) o(this.f44875b, "breadcrumbs.json", List.class);
        if (list == null) {
            return;
        }
        if (abstractC3725j2.B() == null) {
            abstractC3725j2.S(list);
        } else {
            abstractC3725j2.B().addAll(list);
        }
    }

    private void s(AbstractC3725j2 abstractC3725j2) {
        C3759c c3759c = (C3759c) o(this.f44875b, "contexts.json", C3759c.class);
        if (c3759c == null) {
            return;
        }
        C3759c c3759cC = abstractC3725j2.C();
        for (Map.Entry entry : new C3759c(c3759c).b()) {
            Object value = entry.getValue();
            if (!"trace".equals(entry.getKey()) || !(value instanceof T3)) {
                if (!c3759cC.a(entry.getKey())) {
                    c3759cC.l((String) entry.getKey(), value);
                }
            }
        }
    }

    private void t(AbstractC3725j2 abstractC3725j2) {
        C3760d c3760dD = abstractC3725j2.D();
        if (c3760dD == null) {
            c3760dD = new C3760d();
        }
        if (c3760dD.d() == null) {
            c3760dD.e(new ArrayList());
        }
        List listD = c3760dD.d();
        if (listD != null) {
            String str = (String) io.sentry.cache.h.b(this.f44875b, "proguard-uuid.json", String.class);
            if (str != null) {
                DebugImage debugImage = new DebugImage();
                debugImage.setType("proguard");
                debugImage.setUuid(str);
                listD.add(debugImage);
            }
            abstractC3725j2.T(c3760dD);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(AbstractC3725j2 abstractC3725j2) {
        if (abstractC3725j2.I() == null) {
            abstractC3725j2.Y("java");
        }
    }

    private void v(AbstractC3725j2 abstractC3725j2) {
        if (abstractC3725j2.C().e() == null) {
            abstractC3725j2.C().q(j());
        }
    }

    private void w(AbstractC3725j2 abstractC3725j2) {
        String str;
        if (abstractC3725j2.E() == null) {
            abstractC3725j2.U((String) io.sentry.cache.h.b(this.f44875b, "dist.json", String.class));
        }
        if (abstractC3725j2.E() != null || (str = (String) io.sentry.cache.h.b(this.f44875b, "release.json", String.class)) == null) {
            return;
        }
        try {
            abstractC3725j2.U(str.substring(str.indexOf(43) + 1));
        } catch (Throwable unused) {
            this.f44875b.getLogger().c(EnumC3721i3.WARNING, "Failed to parse release from scope cache: %s", str);
        }
    }

    private void x(AbstractC3725j2 abstractC3725j2) {
        if (abstractC3725j2.F() == null) {
            String environment = (String) io.sentry.cache.h.b(this.f44875b, "environment.json", String.class);
            if (environment == null) {
                environment = this.f44875b.getEnvironment();
            }
            abstractC3725j2.V(environment);
        }
    }

    private void y(AbstractC3725j2 abstractC3725j2) {
        Map map = (Map) o(this.f44875b, "extras.json", Map.class);
        if (map == null) {
            return;
        }
        if (abstractC3725j2.H() == null) {
            abstractC3725j2.X(new HashMap(map));
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!abstractC3725j2.H().containsKey(entry.getKey())) {
                abstractC3725j2.H().put((String) entry.getKey(), entry.getValue());
            }
        }
    }

    private void z(V2 v10) {
        List list = (List) o(this.f44875b, "fingerprint.json", List.class);
        if (v10.q0() == null) {
            v10.B0(list);
        }
    }

    @Override // io.sentry.C
    public V2 b(V2 v10, io.sentry.H h10) {
        Object objE = io.sentry.util.l.e(h10);
        if (!(objE instanceof io.sentry.hints.c)) {
            this.f44875b.getLogger().c(EnumC3721i3.WARNING, "The event is not Backfillable, but has been passed to BackfillingEventProcessor, skipping.", new Object[0]);
            return v10;
        }
        io.sentry.hints.c cVar = (io.sentry.hints.c) objE;
        c cVarI = i(objE);
        if (cVarI != null) {
            cVarI.a(v10, cVar, objE);
        }
        m(v10);
        v(v10);
        if (!cVar.b()) {
            this.f44875b.getLogger().c(EnumC3721i3.DEBUG, "The event is Backfillable, but should not be enriched, skipping.", new Object[0]);
            return v10;
        }
        h(v10);
        g(v10);
        I(v10);
        if (cVarI != null) {
            cVarI.c(v10, cVar, objE);
        }
        return v10;
    }

    @Override // io.sentry.C
    public io.sentry.protocol.E c(io.sentry.protocol.E e10, io.sentry.H h10) {
        return e10;
    }
}

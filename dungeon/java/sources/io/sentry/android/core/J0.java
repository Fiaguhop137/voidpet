package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import io.sentry.AbstractC3732l;
import io.sentry.C3771q2;
import io.sentry.C3833z3;
import io.sentry.EnumC3721i3;
import io.sentry.I1;
import io.sentry.ILogger;
import io.sentry.InterfaceC3619a0;
import io.sentry.InterfaceC3703f0;
import io.sentry.O3;
import io.sentry.Q1;
import io.sentry.T2;
import io.sentry.V2;
import io.sentry.protocol.C3757a;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class J0 {
    public static /* synthetic */ void c(O3.b bVar, boolean z10, AtomicReference atomicReference, C3833z3 c3833z3, io.sentry.Y y10) {
        O3 o3F = y10.F();
        if (o3F == null) {
            c3833z3.getLogger().c(EnumC3721i3.INFO, "Session is null on updateSession", new Object[0]);
        } else if (o3F.q(bVar, null, z10, null)) {
            if (o3F.l() == O3.b.Crashed) {
                o3F.c();
                y10.N();
            }
            atomicReference.set(o3F);
        }
    }

    private static void e(io.sentry.android.core.performance.h hVar, List list) {
        if (hVar.v()) {
            Q1.b().g().getLogger().c(EnumC3721i3.WARNING, "Can not convert not-started TimeSpan to Map for Hybrid SDKs.", new Object[0]);
            return;
        }
        if (hVar.w()) {
            Q1.b().g().getLogger().c(EnumC3721i3.WARNING, "Can not convert not-stopped TimeSpan to Map for Hybrid SDKs.", new Object[0]);
            return;
        }
        HashMap map = new HashMap();
        map.put("description", hVar.g());
        map.put("start_timestamp_ms", Long.valueOf(hVar.s()));
        map.put("end_timestamp_ms", Long.valueOf(hVar.o()));
        list.add(map);
    }

    public static io.sentry.protocol.x f(byte[] bArr, boolean z10) {
        Q1 q1B = Q1.b();
        C3833z3 c3833z3G = q1B.g();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                InterfaceC3703f0 serializer = c3833z3G.getSerializer();
                C3771q2 c3771q2A = c3833z3G.getEnvelopeReader().a(byteArrayInputStream);
                if (c3771q2A == null) {
                    byteArrayInputStream.close();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                O3.b bVar = null;
                boolean z11 = false;
                for (T2 t10 : c3771q2A.c()) {
                    arrayList.add(t10);
                    V2 v2N = t10.N(serializer);
                    if (v2N != null) {
                        if (v2N.y0()) {
                            bVar = O3.b.Crashed;
                        }
                        if (v2N.y0() || v2N.z0()) {
                            z11 = true;
                        }
                    }
                }
                O3 o3L = l(q1B, c3833z3G, bVar, z11);
                if (o3L != null) {
                    arrayList.add(T2.K(serializer, o3L));
                    h(c3833z3G, (z10 && q1B.g().getThreadChecker().a()) ? false : true);
                    if (z10) {
                        q1B.n();
                    }
                }
                io.sentry.protocol.x xVarF = q1B.F(new C3771q2(c3771q2A.b(), arrayList));
                byteArrayInputStream.close();
                return xVarF;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            c3833z3G.getLogger().b(EnumC3721i3.ERROR, "Failed to capture envelope", th3);
            return null;
        }
        c3833z3G.getLogger().b(EnumC3721i3.ERROR, "Failed to capture envelope", th3);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(C3833z3 c3833z3) {
        String cacheDirPath = c3833z3.getCacheDirPath();
        if (cacheDirPath == null) {
            c3833z3.getLogger().c(EnumC3721i3.INFO, "Cache dir is not set, not deleting the current session.", new Object[0]);
        } else if (!c3833z3.isEnableAutoSessionTracking()) {
            c3833z3.getLogger().c(EnumC3721i3.DEBUG, "Session tracking is disabled, bailing from deleting current session file.", new Object[0]);
        } else {
            if (io.sentry.cache.f.y(cacheDirPath).delete()) {
                return;
            }
            c3833z3.getLogger().c(EnumC3721i3.WARNING, "Failed to delete the current session file.", new Object[0]);
        }
    }

    private static void h(C3833z3 c3833z3, boolean z10) {
        if (z10) {
            g(c3833z3);
            return;
        }
        try {
            c3833z3.getExecutorService().submit(new I0(c3833z3));
        } catch (Throwable th) {
            c3833z3.getLogger().b(EnumC3721i3.WARNING, "Submission of deletion of the current session file rejected.", th);
        }
    }

    public static Map i() {
        io.sentry.android.core.performance.f fVarQ = io.sentry.android.core.performance.f.q();
        ArrayList arrayList = new ArrayList();
        e(fVarQ.g(), arrayList);
        e(fVarQ.o(), arrayList);
        Iterator it = fVarQ.p().iterator();
        while (it.hasNext()) {
            e((io.sentry.android.core.performance.h) it.next(), arrayList);
        }
        for (io.sentry.android.core.performance.c cVar : fVarQ.h()) {
            e(cVar.g(), arrayList);
            e(cVar.h(), arrayList);
        }
        HashMap map = new HashMap();
        map.put("spans", arrayList);
        map.put("type", fVarQ.n().toString().toLowerCase(Locale.ROOT));
        if (fVarQ.l().x()) {
            map.put("app_start_timestamp_ms", Long.valueOf(fVarQ.l().s()));
        }
        return map;
    }

    public static io.sentry.Y j() {
        AtomicReference atomicReference = new AtomicReference();
        Q1.b().B(I1.COMBINED, new G0(atomicReference));
        return (io.sentry.Y) atomicReference.get();
    }

    public static Map k(Context context, SentryAndroidOptions sentryAndroidOptions, io.sentry.Y y10) {
        HashMap map = new HashMap();
        if (y10 != null) {
            try {
                ILogger logger = sentryAndroidOptions.getLogger();
                io.sentry.util.v vVar = new io.sentry.util.v(map);
                C3681z0 c3681z0K = C3681z0.k(context, sentryAndroidOptions);
                y10.v().q(c3681z0K.c(true, true));
                y10.v().u(c3681z0K.l());
                io.sentry.protocol.I iZ = y10.z();
                if (iZ == null) {
                    iZ = new io.sentry.protocol.I();
                    y10.h(iZ);
                }
                if (iZ.i() == null) {
                    try {
                        iZ.o((String) sentryAndroidOptions.getRuntimeManager().a(new F0(context)));
                    } catch (RuntimeException e10) {
                        logger.b(EnumC3721i3.ERROR, "Could not retrieve installation ID", e10);
                    }
                }
                C3757a c3757aD = y10.v().d();
                if (c3757aD == null) {
                    c3757aD = new C3757a();
                }
                c3757aD.o(AbstractC3662p0.i(context));
                io.sentry.android.core.performance.h hVarM = io.sentry.android.core.performance.f.q().m(sentryAndroidOptions);
                if (hVarM.x()) {
                    c3757aD.p(AbstractC3732l.o(hVarM.r()));
                }
                C3636g0 c3636g0 = new C3636g0(sentryAndroidOptions.getLogger());
                PackageInfo packageInfoO = AbstractC3662p0.o(context, 4096, sentryAndroidOptions.getLogger(), c3636g0);
                if (packageInfoO != null) {
                    AbstractC3662p0.x(packageInfoO, c3636g0, c3681z0K, c3757aD);
                }
                y10.v().o(c3757aD);
                vVar.d("user").j(logger, y10.z());
                vVar.d("contexts").j(logger, y10.v());
                vVar.d("tags").j(logger, y10.s());
                vVar.d("extras").j(logger, y10.getExtras());
                vVar.d("fingerprint").j(logger, y10.y());
                vVar.d("level").j(logger, y10.G());
                vVar.d("breadcrumbs").j(logger, y10.q());
            } catch (Throwable th) {
                sentryAndroidOptions.getLogger().b(EnumC3721i3.ERROR, "Could not serialize scope.", th);
                return new HashMap();
            }
        }
        return map;
    }

    private static O3 l(InterfaceC3619a0 interfaceC3619a0, C3833z3 c3833z3, O3.b bVar, boolean z10) {
        AtomicReference atomicReference = new AtomicReference();
        interfaceC3619a0.z(new H0(bVar, z10, atomicReference, c3833z3));
        return (O3) atomicReference.get();
    }
}

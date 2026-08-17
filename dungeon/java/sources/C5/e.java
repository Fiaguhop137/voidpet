package C5;

import Ad.n;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f1429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicInteger f1430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicInteger f1431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AtomicInteger f1432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ConcurrentHashMap f1433e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Lazy f1434f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Runnable f1435g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Runnable f1436h;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1437a;

        static {
            int[] iArr = new int[l.a.values().length];
            try {
                iArr[l.a.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.a.NEAREST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.a.MISSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f1437a = iArr;
        }
    }

    static {
        e eVar = new e();
        f1429a = eVar;
        f1430b = new AtomicInteger(0);
        f1431c = new AtomicInteger(0);
        f1432d = new AtomicInteger(0);
        f1433e = new ConcurrentHashMap();
        f1434f = Ad.j.b(new b());
        c cVar = new c();
        f1435g = cVar;
        d dVar = new d();
        f1436h = dVar;
        eVar.f().post(cVar);
        eVar.f().post(dVar);
    }

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d() {
        float andSet = f1430b.getAndSet(0);
        float andSet2 = f1431c.getAndSet(0);
        float andSet3 = f1432d.getAndSet(0);
        float f10 = andSet + andSet2 + andSet3;
        if (f10 > 0.0f) {
            float f11 = andSet / f10;
            float f12 = andSet3 / f10;
            if (andSet2 / f10 > 0.25f || f12 > 0.1f) {
                for (Map.Entry entry : f1433e.entrySet()) {
                    f1429a.k((i) entry.getKey(), -((Number) entry.getValue()).intValue());
                }
            } else if (f11 > 0.98f) {
                for (Map.Entry entry2 : f1433e.entrySet()) {
                    f1429a.k((i) entry2.getKey(), ((Number) entry2.getValue()).intValue());
                }
            }
            f1433e.clear();
        }
        f1429a.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e() {
        k.f1458d.a(new Date(System.currentTimeMillis() - 10000));
        f1429a.i();
    }

    private final Handler f() {
        return (Handler) f1434f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler g() {
        HandlerThread handlerThread = new HandlerThread("FrescoAnimationWorker");
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }

    private final boolean i() {
        return f().postDelayed(f1436h, 10000L);
    }

    private final boolean j() {
        return f().postDelayed(f1435g, 2000L);
    }

    private final void k(i iVar, int i10) {
        int iM = kotlin.ranges.e.m(iVar.a() + i10, (int) kotlin.ranges.e.d(iVar.c() * 0.5f, 1.0f), iVar.c());
        if (iM != iVar.a()) {
            iVar.b(iM);
        }
    }

    public final void h(i animation, l frameResult) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Intrinsics.checkNotNullParameter(frameResult, "frameResult");
        ConcurrentHashMap concurrentHashMap = f1433e;
        if (!concurrentHashMap.contains(animation)) {
            concurrentHashMap.put(animation, Integer.valueOf((int) (animation.c() * 0.2f)));
        }
        int i10 = a.f1437a[frameResult.b().ordinal()];
        if (i10 == 1) {
            f1430b.incrementAndGet();
        } else if (i10 == 2) {
            f1431c.incrementAndGet();
        } else {
            if (i10 != 3) {
                throw new n();
            }
            f1432d.incrementAndGet();
        }
    }
}

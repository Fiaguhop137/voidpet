package p079e6;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f40495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f40496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f40497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile g f40498d;

    static {
        h hVar = new h();
        f40495a = hVar;
        f40496b = hVar.b();
        f40497c = 384;
    }

    private h() {
    }

    public static final g a() {
        if (f40498d == null) {
            synchronized (h.class) {
                try {
                    if (f40498d == null) {
                        f40498d = new g(f40497c, f40496b);
                    }
                    Unit unit = Unit.f48228a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        g gVar = f40498d;
        Intrinsics.c(gVar);
        return gVar;
    }

    private final int b() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return ((long) iMin) > 16777216 ? (iMin / 4) * 3 : iMin / 2;
    }
}

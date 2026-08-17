package E;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0052a f2491a = new C0052a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f2492b = b(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: E.a$a, reason: collision with other inner class name */
    public static final class C0052a {
        private C0052a() {
        }

        public /* synthetic */ C0052a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return a.f2492b;
        }
    }

    public static long b(float f10, float f11) {
        return c((((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    private static long c(long j10) {
        return j10;
    }

    public static long d(O0.d dVar) {
        return b(dVar.getDensity(), dVar.b1());
    }

    public static final boolean e(long j10, long j11) {
        return j10 == j11;
    }

    public static final float f(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float g(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static String h(long j10) {
        return "InlineDensity(density=" + f(j10) + ", fontScale=" + g(j10) + ')';
    }
}

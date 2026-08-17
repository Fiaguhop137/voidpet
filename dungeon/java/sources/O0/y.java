package O0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f8306b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f8307c = c(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f8308a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return y.f8307c;
        }
    }

    private /* synthetic */ y(long j10) {
        this.f8308a = j10;
    }

    public static final /* synthetic */ y b(long j10) {
        return new y(j10);
    }

    public static long c(long j10) {
        return j10;
    }

    public static boolean d(long j10, Object obj) {
        return (obj instanceof y) && j10 == ((y) obj).l();
    }

    public static final float e(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float f(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static int g(long j10) {
        return Long.hashCode(j10);
    }

    public static final long h(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) - Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) - Float.intBitsToFloat((int) (j11 & 4294967295L));
        return c((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    public static final long i(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) + Float.intBitsToFloat((int) (j11 & 4294967295L));
        return c((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    public static final long j(long j10, float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) * f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) * f10;
        return c((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    public static String k(long j10) {
        return '(' + e(j10) + ", " + f(j10) + ") px/sec";
    }

    public boolean equals(Object obj) {
        return d(this.f8308a, obj);
    }

    public int hashCode() {
        return g(this.f8308a);
    }

    public final /* synthetic */ long l() {
        return this.f8308a;
    }

    public String toString() {
        return k(this.f8308a);
    }
}

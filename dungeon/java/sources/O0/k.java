package O0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f8276a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f8277b = b(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f8278c = b(9205357640488583168L);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return k.f8277b;
        }
    }

    public static long b(long j10) {
        return j10;
    }

    public static final boolean c(long j10, long j11) {
        return j10 == j11;
    }

    public static final float d(long j10) {
        return h.o(Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    public static final float e(long j10) {
        return h.o(Float.intBitsToFloat((int) (j10 >> 32)));
    }

    public static int f(long j10) {
        return Long.hashCode(j10);
    }
}

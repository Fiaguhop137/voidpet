package p019b0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0342a f25799a = new C0342a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f25800b = b(0);

    /* JADX INFO: renamed from: b0.a$a, reason: collision with other inner class name */
    public static final class C0342a {
        private C0342a() {
        }

        public /* synthetic */ C0342a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return a.f25800b;
        }
    }

    public static long b(long j10) {
        return j10;
    }

    public static final boolean c(long j10, long j11) {
        return j10 == j11;
    }

    public static int d(long j10) {
        return Long.hashCode(j10);
    }

    public static String e(long j10) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        if (Float.intBitsToFloat(i10) == Float.intBitsToFloat(i11)) {
            return "CornerRadius.circular(" + b.a(Float.intBitsToFloat(i10), 1) + ')';
        }
        return "CornerRadius.elliptical(" + b.a(Float.intBitsToFloat(i10), 1) + ", " + b.a(Float.intBitsToFloat(i11), 1) + ')';
    }
}

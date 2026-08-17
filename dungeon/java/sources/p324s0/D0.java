package p324s0;

import O0.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public abstract class D0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f52809a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f52810b = E0.b(0, 0, 0, 0, 14, null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final long d(int i10, int i11) {
            return ((long) (i10 & 32767)) << (i11 * 15);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int e(long j10, int i10) {
            return ((int) (j10 >> (i10 * 15))) & 32767;
        }

        public final long b() {
            return D0.f52810b;
        }

        public final long c(int i10, int i11, int i12, int i13, boolean z10) {
            return d(i11, 1) | d(i10, 0) | d(i12, 2) | d(i13, 3) | (z10 ? Long.MIN_VALUE : 0L);
        }
    }

    public static final int b(long j10, t tVar) {
        return (!i(j10) || tVar == t.Ltr) ? g(j10) : f(j10);
    }

    public static final int c(long j10, t tVar) {
        return (!i(j10) || tVar == t.Ltr) ? f(j10) : g(j10);
    }

    public static long d(long j10) {
        return j10;
    }

    public static final int e(long j10) {
        return f52809a.e(j10, 3);
    }

    public static final int f(long j10) {
        return f52809a.e(j10, 2);
    }

    public static final int g(long j10) {
        return f52809a.e(j10, 0);
    }

    public static final int h(long j10) {
        return f52809a.e(j10, 1);
    }

    public static final boolean i(long j10) {
        return (j10 & Long.MIN_VALUE) != 0;
    }
}

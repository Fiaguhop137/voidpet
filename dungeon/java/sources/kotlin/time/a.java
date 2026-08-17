package kotlin.time;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.e;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C0570a f48546b = new C0570a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f48547c = p(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f48548d = b.i(4611686018427387903L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f48549e = b.i(-4611686018427387903L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f48550a;

    /* JADX INFO: renamed from: kotlin.time.a$a, reason: collision with other inner class name */
    public static final class C0570a {
        private C0570a() {
        }

        public /* synthetic */ C0570a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ a(long j10) {
        this.f48550a = j10;
    }

    public static final long A(long j10) {
        return P(j10, p070df.b.SECONDS);
    }

    public static final int B(long j10) {
        if (K(j10)) {
            return 0;
        }
        return (int) (y(j10) % ((long) 60));
    }

    public static final int C(long j10) {
        if (K(j10)) {
            return 0;
        }
        return (int) (I(j10) ? b.m(F(j10) % ((long) 1000)) : F(j10) % ((long) 1000000000));
    }

    public static final int D(long j10) {
        if (K(j10)) {
            return 0;
        }
        return (int) (A(j10) % ((long) 60));
    }

    private static final p070df.b E(long j10) {
        return J(j10) ? p070df.b.NANOSECONDS : p070df.b.MILLISECONDS;
    }

    private static final long F(long j10) {
        return j10 >> 1;
    }

    public static int G(long j10) {
        return Long.hashCode(j10);
    }

    public static final boolean H(long j10) {
        return !K(j10);
    }

    private static final boolean I(long j10) {
        return (((int) j10) & 1) == 1;
    }

    private static final boolean J(long j10) {
        return (((int) j10) & 1) == 0;
    }

    public static final boolean K(long j10) {
        return j10 == f48548d || j10 == f48549e;
    }

    public static final boolean L(long j10) {
        return j10 < 0;
    }

    public static final long M(long j10, long j11) {
        return N(j10, R(j11));
    }

    public static final long N(long j10, long j11) {
        if (K(j10)) {
            if (H(j11) || (j11 ^ j10) >= 0) {
                return j10;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (K(j11)) {
            return j11;
        }
        if ((((int) j10) & 1) != (((int) j11) & 1)) {
            return I(j10) ? e(j10, F(j10), F(j11)) : e(j10, F(j11), F(j10));
        }
        long jF = F(j10) + F(j11);
        return J(j10) ? b.l(jF) : b.j(jF);
    }

    public static final double O(long j10, p070df.b unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j10 == f48548d) {
            return Double.POSITIVE_INFINITY;
        }
        if (j10 == f48549e) {
            return Double.NEGATIVE_INFINITY;
        }
        return c.a(F(j10), E(j10), unit);
    }

    public static final long P(long j10, p070df.b unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j10 == f48548d) {
            return Long.MAX_VALUE;
        }
        if (j10 == f48549e) {
            return Long.MIN_VALUE;
        }
        return c.b(F(j10), E(j10), unit);
    }

    public static String Q(long j10) {
        if (j10 == 0) {
            return "0s";
        }
        if (j10 == f48548d) {
            return "Infinity";
        }
        if (j10 == f48549e) {
            return "-Infinity";
        }
        boolean zL = L(j10);
        StringBuilder sb2 = new StringBuilder();
        if (zL) {
            sb2.append('-');
        }
        long jT = t(j10);
        long jV = v(jT);
        int iU = u(jT);
        int iB = B(jT);
        int iD = D(jT);
        int iC = C(jT);
        int i10 = 0;
        boolean z10 = jV != 0;
        boolean z11 = iU != 0;
        boolean z12 = iB != 0;
        boolean z13 = (iD == 0 && iC == 0) ? false : true;
        if (z10) {
            sb2.append(jV);
            sb2.append('d');
            i10 = 1;
        }
        if (z11 || (z10 && (z12 || z13))) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(iU);
            sb2.append('h');
            i10 = i11;
        }
        if (z12 || (z13 && (z11 || z10))) {
            int i12 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(iB);
            sb2.append('m');
            i10 = i12;
        }
        if (z13) {
            int i13 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            if (iD != 0 || z10 || z11 || z12) {
                g(j10, sb2, iD, iC, 9, "s", false);
            } else if (iC >= 1000000) {
                g(j10, sb2, iC / 1000000, iC % 1000000, 6, "ms", false);
            } else if (iC >= 1000) {
                g(j10, sb2, iC / 1000, iC % 1000, 3, "us", false);
            } else {
                sb2.append(iC);
                sb2.append("ns");
            }
            i10 = i13;
        }
        if (zL && i10 > 1) {
            sb2.insert(1, '(').append(')');
        }
        return sb2.toString();
    }

    public static final long R(long j10) {
        return b.h(-F(j10), ((int) j10) & 1);
    }

    private static final long e(long j10, long j11, long j12) {
        long jN = b.n(j12);
        long j13 = j11 + jN;
        if (-4611686018426L > j13 || j13 >= 4611686018427L) {
            return b.i(e.o(j13, -4611686018427387903L, 4611686018427387903L));
        }
        return b.k(b.m(j13) + (j12 - b.m(jN)));
    }

    private static final void g(long j10, StringBuilder sb2, int i10, int i11, int i12, String str, boolean z10) {
        sb2.append(i10);
        if (i11 != 0) {
            sb2.append('.');
            String strS0 = StringsKt.s0(String.valueOf(i11), i12, '0');
            int i13 = -1;
            int length = strS0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (strS0.charAt(length) != '0') {
                        i13 = length;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (z10 || i15 >= 3) {
                sb2.append((CharSequence) strS0, 0, ((i13 + 3) / 3) * 3);
                Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            } else {
                sb2.append((CharSequence) strS0, 0, i15);
                Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            }
        }
        sb2.append(str);
    }

    public static final /* synthetic */ a h(long j10) {
        return new a(j10);
    }

    public static int o(long j10, long j11) {
        long j12 = j10 ^ j11;
        if (j12 < 0 || (((int) j12) & 1) == 0) {
            return Intrinsics.f(j10, j11);
        }
        int i10 = (((int) j10) & 1) - (((int) j11) & 1);
        return L(j10) ? -i10 : i10;
    }

    public static long p(long j10) {
        if (!p070df.a.a()) {
            return j10;
        }
        if (J(j10)) {
            long jF = F(j10);
            if (-4611686018426999999L <= jF && jF < 4611686018427000000L) {
                return j10;
            }
            throw new AssertionError(F(j10) + " ns is out of nanoseconds range");
        }
        long jF2 = F(j10);
        if (-4611686018427387903L > jF2 || jF2 >= 4611686018427387904L) {
            throw new AssertionError(F(j10) + " ms is out of milliseconds range");
        }
        long jF3 = F(j10);
        if (-4611686018426L > jF3 || jF3 >= 4611686018427L) {
            return j10;
        }
        throw new AssertionError(F(j10) + " ms is denormalized");
    }

    public static boolean r(long j10, Object obj) {
        return (obj instanceof a) && j10 == ((a) obj).S();
    }

    public static final boolean s(long j10, long j11) {
        return j10 == j11;
    }

    public static final long t(long j10) {
        return L(j10) ? R(j10) : j10;
    }

    public static final int u(long j10) {
        if (K(j10)) {
            return 0;
        }
        return (int) (w(j10) % ((long) 24));
    }

    public static final long v(long j10) {
        return P(j10, p070df.b.DAYS);
    }

    public static final long w(long j10) {
        return P(j10, p070df.b.HOURS);
    }

    public static final long x(long j10) {
        return (I(j10) && H(j10)) ? F(j10) : P(j10, p070df.b.MILLISECONDS);
    }

    public static final long y(long j10) {
        return P(j10, p070df.b.MINUTES);
    }

    public static final long z(long j10) {
        long jF = F(j10);
        if (J(j10)) {
            return jF;
        }
        if (jF > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (jF < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return b.m(jF);
    }

    public final /* synthetic */ long S() {
        return this.f48550a;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return i(((a) obj).S());
    }

    public boolean equals(Object obj) {
        return r(this.f48550a, obj);
    }

    public int hashCode() {
        return G(this.f48550a);
    }

    public int i(long j10) {
        return o(this.f48550a, j10);
    }

    public String toString() {
        return Q(this.f48550a);
    }
}

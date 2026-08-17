package kotlin.ranges;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public class g extends f {
    public static double c(double d10, double d11) {
        return d10 < d11 ? d11 : d10;
    }

    public static float d(float f10, float f11) {
        return f10 < f11 ? f11 : f10;
    }

    public static int e(int i10, int i11) {
        return i10 < i11 ? i11 : i10;
    }

    public static long f(long j10, long j11) {
        return j10 < j11 ? j11 : j10;
    }

    public static double g(double d10, double d11) {
        return d10 > d11 ? d11 : d10;
    }

    public static float h(float f10, float f11) {
        return f10 > f11 ? f11 : f10;
    }

    public static int i(int i10, int i11) {
        return i10 > i11 ? i11 : i10;
    }

    public static long j(long j10, long j11) {
        return j10 > j11 ? j11 : j10;
    }

    public static double k(double d10, double d11, double d12) {
        if (d11 <= d12) {
            if (d10 < d11) {
                return d11;
            }
            return d10 > d12 ? d12 : d10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d12 + " is less than minimum " + d11 + '.');
    }

    public static float l(float f10, float f11, float f12) {
        if (f11 <= f12) {
            if (f10 < f11) {
                return f11;
            }
            return f10 > f12 ? f12 : f10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + '.');
    }

    public static int m(int i10, int i11, int i12) {
        if (i11 <= i12) {
            if (i10 < i11) {
                return i11;
            }
            return i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    public static int n(int i10, Rd.b range) {
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof Rd.a) {
            return ((Number) p(Integer.valueOf(i10), (Rd.a) range)).intValue();
        }
        if (!range.isEmpty()) {
            if (i10 < ((Number) range.c()).intValue()) {
                return ((Number) range.c()).intValue();
            }
            return i10 > ((Number) range.e()).intValue() ? ((Number) range.e()).intValue() : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    public static long o(long j10, long j11, long j12) {
        if (j11 <= j12) {
            if (j10 < j11) {
                return j11;
            }
            return j10 > j12 ? j12 : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j12 + " is less than minimum " + j11 + '.');
    }

    public static final Comparable p(Comparable comparable, Rd.a range) {
        Intrinsics.checkNotNullParameter(comparable, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (!range.isEmpty()) {
            if (!range.a(comparable, range.c()) || range.a(range.c(), comparable)) {
                return (!range.a(range.e(), comparable) || range.a(comparable, range.e())) ? comparable : range.e();
            }
            return range.c();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    public static b q(int i10, int i11) {
        return b.f48377d.a(i10, i11, -1);
    }

    public static b r(b bVar, int i10) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        f.a(i10 > 0, Integer.valueOf(i10));
        b.a aVar = b.f48377d;
        int iG = bVar.g();
        int iH = bVar.h();
        if (bVar.i() <= 0) {
            i10 = -i10;
        }
        return aVar.a(iG, iH, i10);
    }

    public static c s(c cVar, long j10) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        f.a(j10 > 0, Long.valueOf(j10));
        c.a aVar = c.f48381d;
        long jG = cVar.g();
        long jH = cVar.h();
        if (cVar.i() <= 0) {
            j10 = -j10;
        }
        return aVar.a(jG, jH, j10);
    }

    public static IntRange t(int i10, int i11) {
        return i11 <= Integer.MIN_VALUE ? IntRange.INSTANCE.a() : new IntRange(i10, i11 - 1);
    }

    public static d u(long j10, long j11) {
        return j11 <= Long.MIN_VALUE ? d.f48385e.a() : new d(j10, j11 - 1);
    }
}

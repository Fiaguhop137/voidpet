package kotlin.time;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.e;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long h(long j10, int i10) {
        return a.p((j10 << 1) + ((long) i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long i(long j10) {
        return a.p((j10 << 1) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long j(long j10) {
        return (-4611686018426L > j10 || j10 >= 4611686018427L) ? i(e.o(j10, -4611686018427387903L, 4611686018427387903L)) : k(m(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long k(long j10) {
        return a.p(j10 << 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long l(long j10) {
        return (-4611686018426999999L > j10 || j10 >= 4611686018427000000L) ? i(n(j10)) : k(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long m(long j10) {
        return j10 * ((long) 1000000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long n(long j10) {
        return j10 / ((long) 1000000);
    }

    public static final long o(double d10, p070df.b unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        double dA = c.a(d10, unit, p070df.b.NANOSECONDS);
        if (Double.isNaN(dA)) {
            throw new IllegalArgumentException("Duration value cannot be NaN.");
        }
        long jD = Od.a.d(dA);
        return (-4611686018426999999L > jD || jD >= 4611686018427000000L) ? j(Od.a.d(c.a(d10, unit, p070df.b.MILLISECONDS))) : k(jD);
    }

    public static final long p(int i10, p070df.b unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return unit.compareTo(p070df.b.SECONDS) <= 0 ? k(c.c(i10, unit, p070df.b.NANOSECONDS)) : q(i10, unit);
    }

    public static final long q(long j10, p070df.b unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        p070df.b bVar = p070df.b.NANOSECONDS;
        long jC = c.c(4611686018426999999L, bVar, unit);
        return ((-jC) > j10 || j10 > jC) ? i(e.o(c.b(j10, unit, p070df.b.MILLISECONDS), -4611686018427387903L, 4611686018427387903L)) : k(c.c(j10, unit, bVar));
    }
}

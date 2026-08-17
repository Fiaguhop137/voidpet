package p057d2;

import R1.r;
import U1.S;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final i f39705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f39706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f39707c;

    public static abstract class a extends k {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final long f39708d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final long f39709e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final List f39710f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f39711g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final long f39712h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final long f39713i;

        public a(i iVar, long j10, long j11, long j12, long j13, List list, long j14, long j15, long j16) {
            super(iVar, j10, j11);
            this.f39708d = j12;
            this.f39709e = j13;
            this.f39710f = list;
            this.f39713i = j14;
            this.f39711g = j15;
            this.f39712h = j16;
        }

        public long c(long j10, long j11) {
            long jG = g(j10);
            return jG != -1 ? jG : (int) (i((j11 - this.f39712h) + this.f39713i, j10) - d(j10, j11));
        }

        public long d(long j10, long j11) {
            if (g(j10) == -1) {
                long j12 = this.f39711g;
                if (j12 != -9223372036854775807L) {
                    return Math.max(e(), i((j11 - this.f39712h) - j12, j10));
                }
            }
            return e();
        }

        public long e() {
            return this.f39708d;
        }

        public long f(long j10, long j11) {
            if (this.f39710f != null) {
                return -9223372036854775807L;
            }
            long jD = d(j10, j11) + c(j10, j11);
            return (j(jD) + h(jD, j10)) - this.f39713i;
        }

        public abstract long g(long j10);

        public final long h(long j10, long j11) {
            List list = this.f39710f;
            if (list != null) {
                return (((d) list.get((int) (j10 - this.f39708d))).f39719b * 1000000) / this.f39706b;
            }
            long jG = g(j11);
            return (jG == -1 || j10 != (e() + jG) - 1) ? (this.f39709e * 1000000) / this.f39706b : j11 - j(j10);
        }

        public long i(long j10, long j11) {
            long jE = e();
            long jG = g(j11);
            if (jG != 0) {
                if (this.f39710f != null) {
                    long j12 = (jG + jE) - 1;
                    long j13 = jE;
                    while (j13 <= j12) {
                        long j14 = ((j12 - j13) / 2) + j13;
                        long j15 = j(j14);
                        if (j15 < j10) {
                            j13 = j14 + 1;
                        } else {
                            if (j15 <= j10) {
                                return j14;
                            }
                            j12 = j14 - 1;
                        }
                    }
                    return j13 == jE ? j13 : j12;
                }
                long j16 = this.f39708d + (j10 / ((this.f39709e * 1000000) / this.f39706b));
                if (j16 >= jE) {
                    return jG == -1 ? j16 : Math.min(j16, (jE + jG) - 1);
                }
            }
            return jE;
        }

        public final long j(long j10) {
            List list = this.f39710f;
            return S.a1(list != null ? ((d) list.get((int) (j10 - this.f39708d))).f39718a - this.f39707c : (j10 - this.f39708d) * this.f39709e, 1000000L, this.f39706b);
        }

        public abstract i k(j jVar, long j10);

        public boolean l() {
            return this.f39710f != null;
        }
    }

    public static final class b extends a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final List f39714j;

        public b(i iVar, long j10, long j11, long j12, long j13, List list, long j14, List list2, long j15, long j16) {
            super(iVar, j10, j11, j12, j13, list, j14, j15, j16);
            this.f39714j = list2;
        }

        @Override // d2.k.a
        public long g(long j10) {
            return this.f39714j.size();
        }

        @Override // d2.k.a
        public i k(j jVar, long j10) {
            return (i) this.f39714j.get((int) (j10 - this.f39708d));
        }

        @Override // d2.k.a
        public boolean l() {
            return true;
        }
    }

    public static final class c extends a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final n f39715j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final n f39716k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final long f39717l;

        public c(i iVar, long j10, long j11, long j12, long j13, long j14, List list, long j15, n nVar, n nVar2, long j16, long j17) {
            super(iVar, j10, j11, j12, j14, list, j15, j16, j17);
            this.f39715j = nVar;
            this.f39716k = nVar2;
            this.f39717l = j13;
        }

        @Override // p057d2.k
        public i a(j jVar) {
            n nVar = this.f39715j;
            if (nVar == null) {
                return super.a(jVar);
            }
            r rVar = jVar.f39692b;
            return new i(nVar.a(rVar.f10263a, 0L, rVar.f10272j, 0L), 0L, -1L);
        }

        @Override // d2.k.a
        public long g(long j10) {
            List list = this.f39710f;
            if (list != null) {
                return list.size();
            }
            long j11 = this.f39717l;
            if (j11 != -1) {
                return (j11 - this.f39708d) + 1;
            }
            if (j10 != -9223372036854775807L) {
                return E9.a.a(BigInteger.valueOf(j10).multiply(BigInteger.valueOf(this.f39706b)), BigInteger.valueOf(this.f39709e).multiply(BigInteger.valueOf(1000000L)), RoundingMode.CEILING).longValue();
            }
            return -1L;
        }

        @Override // d2.k.a
        public i k(j jVar, long j10) {
            List list = this.f39710f;
            long j11 = list != null ? ((d) list.get((int) (j10 - this.f39708d))).f39718a : (j10 - this.f39708d) * this.f39709e;
            n nVar = this.f39716k;
            r rVar = jVar.f39692b;
            return new i(nVar.a(rVar.f10263a, j10, rVar.f10272j, j11), 0L, -1L);
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final long f39718a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f39719b;

        public d(long j10, long j11) {
            this.f39718a = j10;
            this.f39719b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.f39718a == dVar.f39718a && this.f39719b == dVar.f39719b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((int) this.f39718a) * 31) + ((int) this.f39719b);
        }
    }

    public static class e extends k {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final long f39720d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final long f39721e;

        public e() {
            this(null, 1L, 0L, 0L, 0L);
        }

        public e(i iVar, long j10, long j11, long j12, long j13) {
            super(iVar, j10, j11);
            this.f39720d = j12;
            this.f39721e = j13;
        }

        public i c() {
            long j10 = this.f39721e;
            if (j10 <= 0) {
                return null;
            }
            return new i(null, this.f39720d, j10);
        }
    }

    public k(i iVar, long j10, long j11) {
        this.f39705a = iVar;
        this.f39706b = j10;
        this.f39707c = j11;
    }

    public i a(j jVar) {
        return this.f39705a;
    }

    public long b() {
        return S.a1(this.f39707c, 1000000L, this.f39706b);
    }
}

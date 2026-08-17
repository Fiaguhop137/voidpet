package p040c3;

import U1.F;
import U1.K;
import U1.S;
import p380v2.AbstractC4242e;
import p380v2.InterfaceC4254q;

/* JADX INFO: loaded from: classes.dex */
final class z extends AbstractC4242e {

    private static final class b implements AbstractC4242e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final K f27186a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final F f27187b;

        private b(K k10) {
            this.f27186a = k10;
            this.f27187b = new F();
        }

        /* synthetic */ b(K k10, a aVar) {
            this(k10);
        }

        private AbstractC4242e.C0712e c(F f10, long j10, long j11) {
            int iG = -1;
            int iG2 = -1;
            long j12 = -9223372036854775807L;
            while (f10.a() >= 4) {
                if (z.k(f10.f(), f10.g()) != 442) {
                    f10.b0(1);
                } else {
                    f10.b0(4);
                    long jL = A.l(f10);
                    if (jL != -9223372036854775807L) {
                        long jB = this.f27186a.b(jL);
                        if (jB > j10) {
                            return j12 == -9223372036854775807L ? AbstractC4242e.C0712e.d(jB, j11) : AbstractC4242e.C0712e.e(j11 + ((long) iG2));
                        }
                        if (100000 + jB > j10) {
                            return AbstractC4242e.C0712e.e(j11 + ((long) f10.g()));
                        }
                        iG2 = f10.g();
                        j12 = jB;
                    }
                    d(f10);
                    iG = f10.g();
                }
            }
            return j12 != -9223372036854775807L ? AbstractC4242e.C0712e.f(j12, j11 + ((long) iG)) : AbstractC4242e.C0712e.f56080d;
        }

        private static void d(F f10) {
            int iK;
            int iJ = f10.j();
            if (f10.a() < 10) {
                f10.a0(iJ);
                return;
            }
            f10.b0(9);
            int iL = f10.L() & 7;
            if (f10.a() < iL) {
                f10.a0(iJ);
                return;
            }
            f10.b0(iL);
            if (f10.a() < 4) {
                f10.a0(iJ);
                return;
            }
            if (z.k(f10.f(), f10.g()) == 443) {
                f10.b0(4);
                int iT = f10.T();
                if (f10.a() < iT) {
                    f10.a0(iJ);
                    return;
                }
                f10.b0(iT);
            }
            while (f10.a() >= 4 && (iK = z.k(f10.f(), f10.g())) != 442 && iK != 441 && (iK >>> 8) == 1) {
                f10.b0(4);
                if (f10.a() < 2) {
                    f10.a0(iJ);
                    return;
                }
                f10.a0(Math.min(f10.j(), f10.g() + f10.T()));
            }
        }

        @Override // p380v2.AbstractC4242e.f
        public AbstractC4242e.C0712e a(InterfaceC4254q interfaceC4254q, long j10) {
            long position = interfaceC4254q.getPosition();
            int iMin = (int) Math.min(20000L, interfaceC4254q.getLength() - position);
            this.f27187b.W(iMin);
            interfaceC4254q.o(this.f27187b.f(), 0, iMin);
            return c(this.f27187b, j10, position);
        }

        @Override // p380v2.AbstractC4242e.f
        public void b() {
            this.f27187b.X(S.f12881f);
        }
    }

    public z(K k10, long j10, long j11) {
        super(new AbstractC4242e.b(), new b(k10, null), j10, 0L, j10 + 1, 0L, j11, 188L, 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }
}

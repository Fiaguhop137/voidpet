package p040c3;

import U1.F;
import U1.K;
import U1.S;
import p380v2.AbstractC4242e;
import p380v2.InterfaceC4254q;

/* JADX INFO: loaded from: classes.dex */
final class H extends AbstractC4242e {

    private static final class a implements AbstractC4242e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final K f26804a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final F f26805b = new F();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f26806c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f26807d;

        public a(int i10, K k10, int i11) {
            this.f26806c = i10;
            this.f26804a = k10;
            this.f26807d = i11;
        }

        private AbstractC4242e.C0712e c(F f10, long j10, long j11) {
            int iA;
            int iA2;
            int iJ = f10.j();
            long j12 = -1;
            long j13 = -1;
            long j14 = -9223372036854775807L;
            while (f10.a() >= 188 && (iA2 = (iA = M.a(f10.f(), f10.g(), iJ)) + 188) <= iJ) {
                long jC = M.c(f10, iA, this.f26806c);
                if (jC != -9223372036854775807L) {
                    long jB = this.f26804a.b(jC);
                    if (jB > j10) {
                        return j14 == -9223372036854775807L ? AbstractC4242e.C0712e.d(jB, j11) : AbstractC4242e.C0712e.e(j11 + j13);
                    }
                    if (100000 + jB > j10) {
                        return AbstractC4242e.C0712e.e(j11 + ((long) iA));
                    }
                    j13 = iA;
                    j14 = jB;
                }
                f10.a0(iA2);
                j12 = iA2;
            }
            return j14 != -9223372036854775807L ? AbstractC4242e.C0712e.f(j14, j11 + j12) : AbstractC4242e.C0712e.f56080d;
        }

        @Override // p380v2.AbstractC4242e.f
        public AbstractC4242e.C0712e a(InterfaceC4254q interfaceC4254q, long j10) {
            long position = interfaceC4254q.getPosition();
            int iMin = (int) Math.min(this.f26807d, interfaceC4254q.getLength() - position);
            this.f26805b.W(iMin);
            interfaceC4254q.o(this.f26805b.f(), 0, iMin);
            return c(this.f26805b, j10, position);
        }

        @Override // p380v2.AbstractC4242e.f
        public void b() {
            this.f26805b.X(S.f12881f);
        }
    }

    public H(K k10, long j10, long j11, int i10, int i11) {
        super(new AbstractC4242e.b(), new a(i10, k10, i11), j10, 0L, j10 + 1, 0L, j11, 188L, 940);
    }
}

package A2;

import java.util.Objects;
import p380v2.AbstractC4242e;
import p380v2.InterfaceC4254q;
import p380v2.v;
import p380v2.y;

/* JADX INFO: loaded from: classes.dex */
final class b extends AbstractC4242e {

    /* JADX INFO: renamed from: A2.b$b, reason: collision with other inner class name */
    private static final class C0001b implements AbstractC4242e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final y f134a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f135b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final v.a f136c;

        private C0001b(y yVar, int i10) {
            this.f134a = yVar;
            this.f135b = i10;
            this.f136c = new v.a();
        }

        /* synthetic */ C0001b(y yVar, int i10, a aVar) {
            this(yVar, i10);
        }

        private long c(InterfaceC4254q interfaceC4254q) {
            while (interfaceC4254q.h() < interfaceC4254q.getLength() - 6 && !v.h(interfaceC4254q, this.f134a, this.f135b, this.f136c)) {
                interfaceC4254q.i(1);
            }
            if (interfaceC4254q.h() < interfaceC4254q.getLength() - 6) {
                return this.f136c.f56146a;
            }
            interfaceC4254q.i((int) (interfaceC4254q.getLength() - interfaceC4254q.h()));
            return this.f134a.f56159j;
        }

        @Override // p380v2.AbstractC4242e.f
        public AbstractC4242e.C0712e a(InterfaceC4254q interfaceC4254q, long j10) {
            long position = interfaceC4254q.getPosition();
            long jC = c(interfaceC4254q);
            long jH = interfaceC4254q.h();
            interfaceC4254q.i(Math.max(6, this.f134a.f56152c));
            long jC2 = c(interfaceC4254q);
            long jH2 = interfaceC4254q.h();
            if (jC > j10 || jC2 <= j10) {
                return jC2 <= j10 ? AbstractC4242e.C0712e.f(jC2, jH2) : AbstractC4242e.C0712e.d(jC, position);
            }
            return AbstractC4242e.C0712e.e(jH);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(y yVar, int i10, long j10, long j11) {
        super(new A2.a(yVar), new C0001b(yVar, i10, null), yVar.f(), 0L, yVar.f56159j, j10, j11, yVar.d(), Math.max(6, yVar.f56152c));
        Objects.requireNonNull(yVar);
    }
}

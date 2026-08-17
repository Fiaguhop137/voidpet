package p236n2;

import R1.r;
import U1.AbstractC1459a;
import U1.InterfaceC1470l;
import U1.S;
import android.os.Handler;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface L {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f49509a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final D.b f49510b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final CopyOnWriteArrayList f49511c;

        /* JADX INFO: renamed from: n2.L$a$a, reason: collision with other inner class name */
        private static final class C0588a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Handler f49512a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public L f49513b;

            public C0588a(Handler handler, L l10) {
                this.f49512a = handler;
                this.f49513b = l10;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        private a(CopyOnWriteArrayList copyOnWriteArrayList, int i10, D.b bVar) {
            this.f49511c = copyOnWriteArrayList;
            this.f49509a = i10;
            this.f49510b = bVar;
        }

        public a A(int i10, D.b bVar) {
            return new a(this.f49511c, i10, bVar);
        }

        public void h(Handler handler, L l10) {
            AbstractC1459a.e(handler);
            AbstractC1459a.e(l10);
            this.f49511c.add(new C0588a(handler, l10));
        }

        public void i(InterfaceC1470l interfaceC1470l) {
            for (C0588a c0588a : this.f49511c) {
                S.W0(c0588a.f49512a, new K(interfaceC1470l, c0588a.f49513b));
            }
        }

        public void j(int i10, r rVar, int i11, Object obj, long j10) {
            k(new B(1, i10, rVar, i11, obj, S.o1(j10), -9223372036854775807L));
        }

        public void k(B b10) {
            i(new E(this, b10));
        }

        public void l(C4027y c4027y, int i10) {
            m(c4027y, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void m(C4027y c4027y, int i10, int i11, r rVar, int i12, Object obj, long j10, long j11) {
            n(c4027y, new B(i10, i11, rVar, i12, obj, S.o1(j10), S.o1(j11)));
        }

        public void n(C4027y c4027y, B b10) {
            i(new I(this, c4027y, b10));
        }

        public void o(C4027y c4027y, int i10) {
            p(c4027y, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void p(C4027y c4027y, int i10, int i11, r rVar, int i12, Object obj, long j10, long j11) {
            q(c4027y, new B(i10, i11, rVar, i12, obj, S.o1(j10), S.o1(j11)));
        }

        public void q(C4027y c4027y, B b10) {
            i(new G(this, c4027y, b10));
        }

        public void r(C4027y c4027y, int i10, int i11, r rVar, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
            t(c4027y, new B(i10, i11, rVar, i12, obj, S.o1(j10), S.o1(j11)), iOException, z10);
        }

        public void s(C4027y c4027y, int i10, IOException iOException, boolean z10) {
            r(c4027y, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z10);
        }

        public void t(C4027y c4027y, B b10, IOException iOException, boolean z10) {
            i(new H(this, c4027y, b10, iOException, z10));
        }

        public void u(C4027y c4027y, int i10, int i11) {
            v(c4027y, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i11);
        }

        public void v(C4027y c4027y, int i10, int i11, r rVar, int i12, Object obj, long j10, long j11, int i13) {
            w(c4027y, new B(i10, i11, rVar, i12, obj, S.o1(j10), S.o1(j11)), i13);
        }

        public void w(C4027y c4027y, B b10, int i10) {
            i(new F(this, c4027y, b10, i10));
        }

        public void x(L l10) {
            for (C0588a c0588a : this.f49511c) {
                if (c0588a.f49513b == l10) {
                    this.f49511c.remove(c0588a);
                }
            }
        }

        public void y(int i10, long j10, long j11) {
            z(new B(1, i10, null, 3, null, S.o1(j10), S.o1(j11)));
        }

        public void z(B b10) {
            i(new J(this, (D.b) AbstractC1459a.e(this.f49510b), b10));
        }
    }

    void L(int i10, D.b bVar, C4027y c4027y, B b10);

    void N(int i10, D.b bVar, B b10);

    void R(int i10, D.b bVar, C4027y c4027y, B b10, IOException iOException, boolean z10);

    void f0(int i10, D.b bVar, B b10);

    void h0(int i10, D.b bVar, C4027y c4027y, B b10, int i11);

    void j0(int i10, D.b bVar, C4027y c4027y, B b10);
}

package p344t2;

import R1.M;
import R1.r;
import U1.AbstractC1459a;
import U1.S;
import Z1.C1694j;
import Z1.C1697k;
import android.os.Handler;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public interface I {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f54201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final I f54202b;

        public a(Handler handler, I i10) {
            this.f54201a = i10 != null ? (Handler) AbstractC1459a.e(handler) : null;
            this.f54202b = i10;
        }

        public static /* synthetic */ void d(a aVar, C1694j c1694j) {
            aVar.getClass();
            c1694j.c();
            ((I) S.i(aVar.f54202b)).w(c1694j);
        }

        public void k(String str, long j10, long j11) {
            Handler handler = this.f54201a;
            if (handler != null) {
                handler.post(new y(this, str, j10, j11));
            }
        }

        public void l(String str) {
            Handler handler = this.f54201a;
            if (handler != null) {
                handler.post(new C(this, str));
            }
        }

        public void m(C1694j c1694j) {
            c1694j.c();
            Handler handler = this.f54201a;
            if (handler != null) {
                handler.post(new H(this, c1694j));
            }
        }

        public void n(int i10, long j10) {
            Handler handler = this.f54201a;
            if (handler != null) {
                handler.post(new D(this, i10, j10));
            }
        }

        public void o(C1694j c1694j) {
            Handler handler = this.f54201a;
            if (handler != null) {
                handler.post(new F(this, c1694j));
            }
        }

        public void p(r rVar, C1697k c1697k) {
            Handler handler = this.f54201a;
            if (handler != null) {
                handler.post(new G(this, rVar, c1697k));
            }
        }

        public void q(Object obj) {
            if (this.f54201a != null) {
                this.f54201a.post(new A(this, obj, SystemClock.elapsedRealtime()));
            }
        }

        public void r(long j10, int i10) {
            Handler handler = this.f54201a;
            if (handler != null) {
                handler.post(new E(this, j10, i10));
            }
        }

        public void s(Exception exc) {
            Handler handler = this.f54201a;
            if (handler != null) {
                handler.post(new B(this, exc));
            }
        }

        public void t(M m10) {
            Handler handler = this.f54201a;
            if (handler != null) {
                handler.post(new z(this, m10));
            }
        }
    }

    void A(long j10, int i10);

    void a(M m10);

    void g(String str);

    void h(String str, long j10, long j11);

    void i(r rVar, C1697k c1697k);

    void p(C1694j c1694j);

    void r(Exception exc);

    void v(int i10, long j10);

    void w(C1694j c1694j);

    void x(Object obj, long j10);
}

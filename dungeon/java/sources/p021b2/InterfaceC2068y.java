package p021b2;

import R1.r;
import U1.AbstractC1459a;
import U1.S;
import Z1.C1694j;
import Z1.C1697k;
import android.os.Handler;

/* JADX INFO: renamed from: b2.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2068y {

    /* JADX INFO: renamed from: b2.y$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f26196a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterfaceC2068y f26197b;

        public a(Handler handler, InterfaceC2068y interfaceC2068y) {
            this.f26196a = interfaceC2068y != null ? (Handler) AbstractC1459a.e(handler) : null;
            this.f26197b = interfaceC2068y;
        }

        public static /* synthetic */ void d(a aVar, C1694j c1694j) {
            aVar.getClass();
            c1694j.c();
            ((InterfaceC2068y) S.i(aVar.f26197b)).s(c1694j);
        }

        public void n(Exception exc) {
            Handler handler = this.f26196a;
            if (handler != null) {
                handler.post(new RunnableC2056l(this, exc));
            }
        }

        public void o(int i10) {
            Handler handler = this.f26196a;
            if (handler != null) {
                handler.post(new RunnableC2059o(this, i10));
            }
        }

        public void p(Exception exc) {
            Handler handler = this.f26196a;
            if (handler != null) {
                handler.post(new RunnableC2062s(this, exc));
            }
        }

        public void q(InterfaceC2069z.a aVar) {
            Handler handler = this.f26196a;
            if (handler != null) {
                handler.post(new RunnableC2058n(this, aVar));
            }
        }

        public void r(InterfaceC2069z.a aVar) {
            Handler handler = this.f26196a;
            if (handler != null) {
                handler.post(new RunnableC2067x(this, aVar));
            }
        }

        public void s(String str, long j10, long j11) {
            Handler handler = this.f26196a;
            if (handler != null) {
                handler.post(new RunnableC2060p(this, str, j10, j11));
            }
        }

        public void t(String str) {
            Handler handler = this.f26196a;
            if (handler != null) {
                handler.post(new RunnableC2061q(this, str));
            }
        }

        public void u(C1694j c1694j) {
            c1694j.c();
            Handler handler = this.f26196a;
            if (handler != null) {
                handler.post(new RunnableC2064u(this, c1694j));
            }
        }

        public void v(C1694j c1694j) {
            Handler handler = this.f26196a;
            if (handler != null) {
                handler.post(new r(this, c1694j));
            }
        }

        public void w(r rVar, C1697k c1697k) {
            Handler handler = this.f26196a;
            if (handler != null) {
                handler.post(new RunnableC2063t(this, rVar, c1697k));
            }
        }

        public void x(long j10) {
            Handler handler = this.f26196a;
            if (handler != null) {
                handler.post(new RunnableC2065v(this, j10));
            }
        }

        public void y(boolean z10) {
            Handler handler = this.f26196a;
            if (handler != null) {
                handler.post(new RunnableC2057m(this, z10));
            }
        }

        public void z(int i10, long j10, long j11) {
            Handler handler = this.f26196a;
            if (handler != null) {
                handler.post(new RunnableC2066w(this, i10, j10, j11));
            }
        }
    }

    void b(InterfaceC2069z.a aVar);

    void c(int i10);

    void d(boolean z10);

    void e(Exception exc);

    void f(InterfaceC2069z.a aVar);

    void j(r rVar, C1697k c1697k);

    void k(String str);

    void l(String str, long j10, long j11);

    void o(long j10);

    void s(C1694j c1694j);

    void t(C1694j c1694j);

    void y(Exception exc);

    void z(int i10, long j10, long j11);
}

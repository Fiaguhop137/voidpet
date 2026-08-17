package p075e2;

import U1.AbstractC1459a;
import U1.S;
import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;
import p236n2.D;

/* JADX INFO: loaded from: classes.dex */
public interface t {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f40349a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final D.b f40350b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final CopyOnWriteArrayList f40351c;

        /* JADX INFO: renamed from: e2.t$a$a, reason: collision with other inner class name */
        private static final class C0449a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Handler f40352a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public t f40353b;

            public C0449a(Handler handler, t tVar) {
                this.f40352a = handler;
                this.f40353b = tVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        private a(CopyOnWriteArrayList copyOnWriteArrayList, int i10, D.b bVar) {
            this.f40351c = copyOnWriteArrayList;
            this.f40349a = i10;
            this.f40350b = bVar;
        }

        public void g(Handler handler, t tVar) {
            AbstractC1459a.e(handler);
            AbstractC1459a.e(tVar);
            this.f40351c.add(new C0449a(handler, tVar));
        }

        public void h() {
            for (C0449a c0449a : this.f40351c) {
                S.W0(c0449a.f40352a, new s(this, c0449a.f40353b));
            }
        }

        public void i() {
            for (C0449a c0449a : this.f40351c) {
                S.W0(c0449a.f40352a, new q(this, c0449a.f40353b));
            }
        }

        public void j() {
            for (C0449a c0449a : this.f40351c) {
                S.W0(c0449a.f40352a, new r(this, c0449a.f40353b));
            }
        }

        public void k(int i10) {
            for (C0449a c0449a : this.f40351c) {
                S.W0(c0449a.f40352a, new RunnableC3265o(this, c0449a.f40353b, i10));
            }
        }

        public void l(Exception exc) {
            for (C0449a c0449a : this.f40351c) {
                S.W0(c0449a.f40352a, new RunnableC3264n(this, c0449a.f40353b, exc));
            }
        }

        public void m() {
            for (C0449a c0449a : this.f40351c) {
                S.W0(c0449a.f40352a, new RunnableC3266p(this, c0449a.f40353b));
            }
        }

        public void n(t tVar) {
            for (C0449a c0449a : this.f40351c) {
                if (c0449a.f40353b == tVar) {
                    this.f40351c.remove(c0449a);
                }
            }
        }

        public a o(int i10, D.b bVar) {
            return new a(this.f40351c, i10, bVar);
        }
    }

    void F(int i10, D.b bVar);

    void H(int i10, D.b bVar);

    void V(int i10, D.b bVar);

    void c0(int i10, D.b bVar);

    void l0(int i10, D.b bVar, int i11);

    void o0(int i10, D.b bVar, Exception exc);
}

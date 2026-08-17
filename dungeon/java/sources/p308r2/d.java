package p308r2;

import U1.AbstractC1459a;
import W1.x;
import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface d {

    public interface a {

        /* JADX INFO: renamed from: r2.d$a$a, reason: collision with other inner class name */
        public static final class C0623a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final CopyOnWriteArrayList f52032a = new CopyOnWriteArrayList();

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: r2.d$a$a$a, reason: collision with other inner class name */
            static final class C0624a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final Handler f52033a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final a f52034b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private boolean f52035c;

                public C0624a(Handler handler, a aVar) {
                    this.f52033a = handler;
                    this.f52034b = aVar;
                }

                public void d() {
                    this.f52035c = true;
                }
            }

            public void b(Handler handler, a aVar) {
                AbstractC1459a.e(handler);
                AbstractC1459a.e(aVar);
                d(aVar);
                this.f52032a.add(new C0624a(handler, aVar));
            }

            public void c(int i10, long j10, long j11) {
                int i11;
                long j12;
                long j13;
                for (C0624a c0624a : this.f52032a) {
                    if (c0624a.f52035c) {
                        i11 = i10;
                        j12 = j10;
                        j13 = j11;
                    } else {
                        i11 = i10;
                        j12 = j10;
                        j13 = j11;
                        c0624a.f52033a.post(new c(c0624a, i11, j12, j13));
                    }
                    i10 = i11;
                    j10 = j12;
                    j11 = j13;
                }
            }

            public void d(a aVar) {
                for (C0624a c0624a : this.f52032a) {
                    if (c0624a.f52034b == aVar) {
                        c0624a.d();
                        this.f52032a.remove(c0624a);
                    }
                }
            }
        }

        void J(int i10, long j10, long j11);
    }

    default long a() {
        return -9223372036854775807L;
    }

    x b();

    long c();

    void d(a aVar);

    void f(Handler handler, a aVar);
}

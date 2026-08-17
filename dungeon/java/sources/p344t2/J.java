package p344t2;

import R1.M;
import R1.r;
import U1.G;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface J {

    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f54203a = new C0674a();

        /* JADX INFO: renamed from: t2.J$a$a, reason: collision with other inner class name */
        class C0674a implements a {
            C0674a() {
            }
        }

        default void a(M m10) {
        }

        default void b() {
        }

        default void c() {
        }

        default void d() {
        }
    }

    public interface b {
        void a(long j10);

        void b();
    }

    public static final class c extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r f54204a;

        public c(Throwable th, r rVar) {
            super(th);
            this.f54204a = rVar;
        }
    }

    void a(Surface surface, G g10);

    boolean b();

    void c(long j10);

    void d();

    void e(a aVar, Executor executor);

    void f(List list);

    void g(long j10, long j11);

    boolean h(boolean z10);

    void i();

    boolean isInitialized();

    void j();

    Surface k();

    void l();

    void m();

    void n(int i10, r rVar, long j10, int i11, List list);

    void o(int i10);

    void p(float f10);

    void q();

    void r(boolean z10);

    void release();

    boolean s(long j10, b bVar);

    void t(boolean z10);

    void u(s sVar);

    boolean v(r rVar);
}

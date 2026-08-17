package p111g2;

import android.net.Uri;
import java.io.IOException;
import p236n2.L;
import p308r2.k;

/* JADX INFO: loaded from: classes.dex */
public interface m {

    public interface a {
        m a(p093f2.d dVar, k kVar, l lVar, p308r2.e eVar);
    }

    public interface b {
        boolean a(Uri uri, k.c cVar, boolean z10);

        void f();
    }

    public static final class c extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f42155a;

        public c(Uri uri) {
            this.f42155a = uri;
        }
    }

    public static final class d extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f42156a;

        public d(Uri uri) {
            this.f42156a = uri;
        }
    }

    public interface e {
        void m(f fVar);
    }

    void a(Uri uri);

    void b(Uri uri);

    void c(Uri uri, L.a aVar, e eVar);

    long d();

    i e();

    void f(Uri uri);

    void g(b bVar);

    boolean h(Uri uri);

    boolean k();

    boolean m(Uri uri, long j10);

    void o();

    void p(b bVar);

    f q(Uri uri, boolean z10);

    void stop();
}

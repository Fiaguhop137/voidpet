package p338se;

import p015ae.h0;
import p464ze.f;

/* JADX INFO: loaded from: classes3.dex */
public interface x {

    public interface a {
        void a();

        void b(f fVar, p464ze.b bVar, f fVar2);

        void c(f fVar, Fe.f fVar2);

        void d(f fVar, Object obj);

        a e(f fVar, p464ze.b bVar);

        b f(f fVar);
    }

    public interface b {
        void a();

        void b(Fe.f fVar);

        void c(p464ze.b bVar, f fVar);

        void d(Object obj);

        a e(p464ze.b bVar);
    }

    public interface c {
        void a();

        a b(p464ze.b bVar, h0 h0Var);
    }

    public interface d {
        e a(f fVar, String str);

        c b(f fVar, String str, Object obj);
    }

    public interface e extends c {
        a c(int i10, p464ze.b bVar, h0 h0Var);
    }

    void a(c cVar, byte[] bArr);

    void b(d dVar, byte[] bArr);

    p356te.a c();

    p464ze.b d();

    String e();
}

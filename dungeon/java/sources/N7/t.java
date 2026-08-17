package N7;

import android.content.Context;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class t implements s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile u f7976e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X7.a f7977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final X7.a f7978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final T7.e f7979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final U7.r f7980d;

    t(X7.a aVar, X7.a aVar2, T7.e eVar, U7.r rVar, U7.v vVar) {
        this.f7977a = aVar;
        this.f7978b = aVar2;
        this.f7979c = eVar;
        this.f7980d = rVar;
        vVar.c();
    }

    private i b(n nVar) {
        return i.a().i(this.f7977a.a()).k(this.f7978b.a()).j(nVar.g()).h(new h(nVar.b(), nVar.d())).g(nVar.c().a()).d();
    }

    public static t c() {
        u uVar = f7976e;
        if (uVar != null) {
            return uVar.b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set d(f fVar) {
        return fVar instanceof g ? Collections.unmodifiableSet(((g) fVar).a()) : Collections.singleton(L7.c.b("proto"));
    }

    public static void f(Context context) {
        if (f7976e == null) {
            synchronized (t.class) {
                try {
                    if (f7976e == null) {
                        f7976e = e.c().a(context).build();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // N7.s
    public void a(n nVar, L7.j jVar) {
        this.f7979c.a(nVar.f().f(nVar.c().c()), b(nVar), jVar);
    }

    public U7.r e() {
        return this.f7980d;
    }

    public L7.i g(f fVar) {
        return new p(d(fVar), o.a().b(fVar.getName()).c(fVar.getExtras()).a(), this);
    }
}

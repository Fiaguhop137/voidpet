package p251o;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class c extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile c f50296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Executor f50297d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Executor f50298e = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f50299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f50300b;

    private c() {
        d dVar = new d();
        this.f50300b = dVar;
        this.f50299a = dVar;
    }

    public static Executor f() {
        return f50298e;
    }

    public static c g() {
        if (f50296c != null) {
            return f50296c;
        }
        synchronized (c.class) {
            try {
                if (f50296c == null) {
                    f50296c = new c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f50296c;
    }

    @Override // p251o.e
    public void a(Runnable runnable) {
        this.f50299a.a(runnable);
    }

    @Override // p251o.e
    public boolean b() {
        return this.f50299a.b();
    }

    @Override // p251o.e
    public void c(Runnable runnable) {
        this.f50299a.c(runnable);
    }
}

package O5;

import V4.k;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f8387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f8389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Z4.a f8390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f8391e;

    private e(c cVar) {
        this.f8387a = (c) k.g(cVar);
        this.f8388b = 0;
    }

    e(f fVar) {
        this.f8387a = (c) k.g(fVar.e());
        this.f8388b = fVar.d();
        this.f8390d = fVar.f();
        this.f8391e = fVar.c();
        fVar.b();
        this.f8389c = fVar.g();
    }

    public static e b(c cVar) {
        return new e(cVar);
    }

    public static f f(c cVar) {
        return new f(cVar);
    }

    public synchronized void a() {
        Z4.a.g(this.f8390d);
        this.f8390d = null;
        Z4.a.h(this.f8391e);
        this.f8391e = null;
    }

    public p186k6.a c() {
        return null;
    }

    public c d() {
        return this.f8387a;
    }

    public String e() {
        return this.f8389c;
    }
}

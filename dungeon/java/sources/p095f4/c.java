package p095f4;

import U3.a;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f41735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f41736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Object f41737c;

    public c() {
        this.f41735a = new b();
        this.f41737c = null;
    }

    public c(Object obj) {
        this.f41735a = new b();
        this.f41737c = obj;
    }

    public Object a(b bVar) {
        return this.f41737c;
    }

    public final Object b(float f10, float f11, Object obj, Object obj2, float f12, float f13, float f14) {
        return a(this.f41735a.h(f10, f11, obj, obj2, f12, f13, f14));
    }

    public final void c(a aVar) {
        this.f41736b = aVar;
    }
}

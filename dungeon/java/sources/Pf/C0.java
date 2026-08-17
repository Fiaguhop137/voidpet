package Pf;

/* JADX INFO: loaded from: classes3.dex */
abstract class C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final E0 f9044a = new E0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final G0 f9045b = new G0();

    static E0 a(C1303f c1303f) {
        return c1303f.f() < 1 ? f9044a : new E0(c1303f);
    }

    static G0 b(C1303f c1303f) {
        return c1303f.f() < 1 ? f9045b : new G0(c1303f);
    }
}

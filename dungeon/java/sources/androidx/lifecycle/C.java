package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
class C implements InterfaceC1991n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f24245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1980c.a f24246b;

    C(Object obj) {
        this.f24245a = obj;
        this.f24246b = C1980c.f24330c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.InterfaceC1991n
    public void f(InterfaceC1994q interfaceC1994q, AbstractC1987j.a aVar) {
        this.f24246b.a(interfaceC1994q, aVar, this.f24245a);
    }
}

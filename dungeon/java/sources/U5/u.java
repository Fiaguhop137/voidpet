package U5;

/* JADX INFO: loaded from: classes2.dex */
public class u implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f13166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z f13167b;

    public u(x xVar, z zVar) {
        this.f13166a = xVar;
        this.f13167b = zVar;
    }

    @Override // U5.x
    public void b(Object obj) {
        this.f13166a.b(obj);
    }

    @Override // U5.x
    public boolean d(V4.l lVar) {
        return this.f13166a.d(lVar);
    }

    @Override // U5.x
    public int e(V4.l lVar) {
        return this.f13166a.e(lVar);
    }

    @Override // U5.x
    public Z4.a g(Object obj, Z4.a aVar) {
        this.f13167b.c(obj);
        return this.f13166a.g(obj, aVar);
    }

    @Override // U5.x
    public Z4.a get(Object obj) {
        Z4.a aVar = this.f13166a.get(obj);
        if (aVar == null) {
            this.f13167b.b(obj);
            return aVar;
        }
        this.f13167b.a(obj);
        return aVar;
    }
}

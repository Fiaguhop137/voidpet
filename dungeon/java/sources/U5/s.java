package U5;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s {

    class a implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f13165a;

        a(t tVar) {
            this.f13165a = tVar;
        }

        @Override // U5.z
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(P4.d dVar) {
            this.f13165a.k(dVar);
        }

        @Override // U5.z
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(P4.d dVar) {
            this.f13165a.b(dVar);
        }

        @Override // U5.z
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void c(P4.d dVar) {
            this.f13165a.e(dVar);
        }
    }

    public static u a(x xVar, t tVar) {
        tVar.d(xVar);
        return new u(xVar, new a(tVar));
    }
}

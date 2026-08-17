package U5;

/* JADX INFO: loaded from: classes2.dex */
public abstract class v {

    class a implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f13168a;

        a(t tVar) {
            this.f13168a = tVar;
        }

        @Override // U5.z
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(P4.d dVar) {
            this.f13168a.l(dVar);
        }

        @Override // U5.z
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(P4.d dVar) {
            this.f13168a.a(dVar);
        }

        @Override // U5.z
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void c(P4.d dVar) {
            this.f13168a.g(dVar);
        }
    }

    public static u a(x xVar, t tVar) {
        tVar.h(xVar);
        return new u(xVar, new a(tVar));
    }
}

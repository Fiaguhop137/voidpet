package U5;

/* JADX INFO: loaded from: classes2.dex */
public interface n extends x, Y4.c {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f13153a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Z4.a f13154b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final b f13157e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f13159g;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f13155c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f13156d = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f13158f = 0;

        private a(Object obj, Z4.a aVar, b bVar, int i10) {
            this.f13153a = V4.k.g(obj);
            this.f13154b = (Z4.a) V4.k.g(Z4.a.e(aVar));
            this.f13157e = bVar;
            this.f13159g = i10;
        }

        public static a a(Object obj, Z4.a aVar, int i10, b bVar) {
            return new a(obj, aVar, bVar, i10);
        }

        public static a b(Object obj, Z4.a aVar, b bVar) {
            return a(obj, aVar, -1, bVar);
        }
    }

    public interface b {
        void a(Object obj, boolean z10);
    }

    Z4.a c(Object obj, Z4.a aVar, b bVar);

    Z4.a f(Object obj);
}

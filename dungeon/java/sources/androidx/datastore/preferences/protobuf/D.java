package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f23357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f23358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f23359c;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m0.b f23360a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f23361b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final m0.b f23362c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f23363d;

        public a(m0.b bVar, Object obj, m0.b bVar2, Object obj2) {
            this.f23360a = bVar;
            this.f23361b = obj;
            this.f23362c = bVar2;
            this.f23363d = obj2;
        }
    }

    private D(m0.b bVar, Object obj, m0.b bVar2, Object obj2) {
        this.f23357a = new a(bVar, obj, bVar2, obj2);
        this.f23358b = obj;
        this.f23359c = obj2;
    }

    static int b(a aVar, Object obj, Object obj2) {
        return C1961q.b(aVar.f23360a, 1, obj) + C1961q.b(aVar.f23362c, 2, obj2);
    }

    public static D d(m0.b bVar, Object obj, m0.b bVar2, Object obj2) {
        return new D(bVar, obj, bVar2, obj2);
    }

    static void e(AbstractC1953i abstractC1953i, a aVar, Object obj, Object obj2) {
        C1961q.u(abstractC1953i, aVar.f23360a, 1, obj);
        C1961q.u(abstractC1953i, aVar.f23362c, 2, obj2);
    }

    public int a(int i10, Object obj, Object obj2) {
        return AbstractC1953i.O(i10) + AbstractC1953i.y(b(this.f23357a, obj, obj2));
    }

    a c() {
        return this.f23357a;
    }
}

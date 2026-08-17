package Q7;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b f9518b = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f9519a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private e f9520a = null;

        a() {
        }

        public b a() {
            return new b(this.f9520a);
        }

        public a b(e eVar) {
            this.f9520a = eVar;
            return this;
        }
    }

    b(e eVar) {
        this.f9519a = eVar;
    }

    public static a b() {
        return new a();
    }

    public e a() {
        return this.f9519a;
    }
}

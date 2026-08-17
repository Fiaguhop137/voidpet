package p131h4;

/* JADX INFO: renamed from: h4.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3465v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f42579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f42580b;

    /* JADX INFO: renamed from: h4.v$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f42581a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f42582b = false;

        /* synthetic */ a(U u10) {
        }

        public C3465v a() {
            String str = this.f42581a;
            if (str == null) {
                throw new IllegalArgumentException("Product type must be set");
            }
            if (!this.f42582b || str.equals("subs")) {
                return new C3465v(this, null);
            }
            throw new IllegalArgumentException("includeSuspendedSubscriptions is only supported for subscription purchases");
        }

        public a b(String str) {
            this.f42581a = str;
            return this;
        }
    }

    /* synthetic */ C3465v(a aVar, U u10) {
        this.f42579a = aVar.f42581a;
        this.f42580b = aVar.f42582b;
    }

    public static a b() {
        return new a(null);
    }

    public boolean a() {
        return this.f42580b;
    }

    public final String c() {
        return this.f42579a;
    }
}

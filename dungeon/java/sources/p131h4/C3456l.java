package p131h4;

/* JADX INFO: renamed from: h4.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3456l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f42577a;

    /* JADX INFO: renamed from: h4.l$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f42578a;

        /* synthetic */ a(K k10) {
        }

        public C3456l a() {
            String str = this.f42578a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            C3456l c3456l = new C3456l(null);
            c3456l.f42577a = str;
            return c3456l;
        }

        public a b(String str) {
            this.f42578a = str;
            return this;
        }
    }

    /* synthetic */ C3456l(K k10) {
    }

    public static a b() {
        return new a(null);
    }

    public String a() {
        return this.f42577a;
    }
}

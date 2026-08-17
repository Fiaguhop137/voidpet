package p131h4;

/* JADX INFO: renamed from: h4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3445a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f42575a;

    /* JADX INFO: renamed from: h4.a$a, reason: collision with other inner class name */
    public static final class C0494a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f42576a;

        /* synthetic */ C0494a(x xVar) {
        }

        public C3445a a() {
            String str = this.f42576a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            C3445a c3445a = new C3445a(null);
            c3445a.f42575a = str;
            return c3445a;
        }

        public C0494a b(String str) {
            this.f42576a = str;
            return this;
        }
    }

    /* synthetic */ C3445a(x xVar) {
    }

    public static C0494a b() {
        return new C0494a(null);
    }

    public String a() {
        return this.f42575a;
    }
}

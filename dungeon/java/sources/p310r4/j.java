package p310r4;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f52264a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f52265b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f52266c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f52267d = new d();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f52268e = new e();

    class a extends j {
        a() {
        }

        @Override // p310r4.j
        public boolean a() {
            return true;
        }

        @Override // p310r4.j
        public boolean b() {
            return true;
        }

        @Override // p310r4.j
        public boolean c(p274p4.a aVar) {
            return aVar == p274p4.a.REMOTE;
        }

        @Override // p310r4.j
        public boolean d(boolean z10, p274p4.a aVar, p274p4.c cVar) {
            return (aVar == p274p4.a.RESOURCE_DISK_CACHE || aVar == p274p4.a.MEMORY_CACHE) ? false : true;
        }
    }

    class b extends j {
        b() {
        }

        @Override // p310r4.j
        public boolean a() {
            return false;
        }

        @Override // p310r4.j
        public boolean b() {
            return false;
        }

        @Override // p310r4.j
        public boolean c(p274p4.a aVar) {
            return false;
        }

        @Override // p310r4.j
        public boolean d(boolean z10, p274p4.a aVar, p274p4.c cVar) {
            return false;
        }
    }

    class c extends j {
        c() {
        }

        @Override // p310r4.j
        public boolean a() {
            return true;
        }

        @Override // p310r4.j
        public boolean b() {
            return false;
        }

        @Override // p310r4.j
        public boolean c(p274p4.a aVar) {
            return (aVar == p274p4.a.DATA_DISK_CACHE || aVar == p274p4.a.MEMORY_CACHE) ? false : true;
        }

        @Override // p310r4.j
        public boolean d(boolean z10, p274p4.a aVar, p274p4.c cVar) {
            return false;
        }
    }

    class d extends j {
        d() {
        }

        @Override // p310r4.j
        public boolean a() {
            return false;
        }

        @Override // p310r4.j
        public boolean b() {
            return true;
        }

        @Override // p310r4.j
        public boolean c(p274p4.a aVar) {
            return false;
        }

        @Override // p310r4.j
        public boolean d(boolean z10, p274p4.a aVar, p274p4.c cVar) {
            return (aVar == p274p4.a.RESOURCE_DISK_CACHE || aVar == p274p4.a.MEMORY_CACHE) ? false : true;
        }
    }

    class e extends j {
        e() {
        }

        @Override // p310r4.j
        public boolean a() {
            return true;
        }

        @Override // p310r4.j
        public boolean b() {
            return true;
        }

        @Override // p310r4.j
        public boolean c(p274p4.a aVar) {
            return aVar == p274p4.a.REMOTE;
        }

        @Override // p310r4.j
        public boolean d(boolean z10, p274p4.a aVar, p274p4.c cVar) {
            return ((z10 && aVar == p274p4.a.DATA_DISK_CACHE) || aVar == p274p4.a.LOCAL) && cVar == p274p4.c.TRANSFORMED;
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(p274p4.a aVar);

    public abstract boolean d(boolean z10, p274p4.a aVar, p274p4.c cVar);
}

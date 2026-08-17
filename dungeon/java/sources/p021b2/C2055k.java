package p021b2;

/* JADX INFO: renamed from: b2.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2055k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2055k f26158d = new b().d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f26159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f26160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f26161c;

    /* JADX INFO: renamed from: b2.k$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f26162a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f26163b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f26164c;

        public C2055k d() {
            if (this.f26162a || !(this.f26163b || this.f26164c)) {
                return new C2055k(this, null);
            }
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }

        public b e(boolean z10) {
            this.f26162a = z10;
            return this;
        }

        public b f(boolean z10) {
            this.f26163b = z10;
            return this;
        }

        public b g(boolean z10) {
            this.f26164c = z10;
            return this;
        }
    }

    private C2055k(b bVar) {
        this.f26159a = bVar.f26162a;
        this.f26160b = bVar.f26163b;
        this.f26161c = bVar.f26164c;
    }

    /* synthetic */ C2055k(b bVar, a aVar) {
        this(bVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2055k.class == obj.getClass()) {
            C2055k c2055k = (C2055k) obj;
            if (this.f26159a == c2055k.f26159a && this.f26160b == c2055k.f26160b && this.f26161c == c2055k.f26161c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f26159a ? 1 : 0) << 2) + ((this.f26160b ? 1 : 0) << 1) + (this.f26161c ? 1 : 0);
    }
}

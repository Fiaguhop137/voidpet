package S9;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f11568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d.a f11569b = d.a.DEFAULT;

    /* JADX INFO: renamed from: S9.a$a, reason: collision with other inner class name */
    private static final class C0171a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f11570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d.a f11571b;

        C0171a(int i10, d.a aVar) {
            this.f11570a = i10;
            this.f11571b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class annotationType() {
            return d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f11570a == dVar.tag() && this.f11571b.equals(dVar.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f11570a) + (this.f11571b.hashCode() ^ 2041407134);
        }

        @Override // S9.d
        public d.a intEncoding() {
            return this.f11571b;
        }

        @Override // S9.d
        public int tag() {
            return this.f11570a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f11570a + "intEncoding=" + this.f11571b + ')';
        }
    }

    public static a b() {
        return new a();
    }

    public d a() {
        return new C0171a(this.f11568a, this.f11569b);
    }

    public a c(int i10) {
        this.f11568a = i10;
        return this;
    }
}

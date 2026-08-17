package O7;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterable f8400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f8401b;

    static final class b extends f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Iterable f8402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f8403b;

        b() {
        }

        @Override // O7.f.a
        public f a() {
            String str = "";
            if (this.f8402a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new a(this.f8402a, this.f8403b, null);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // O7.f.a
        public f.a b(Iterable iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f8402a = iterable;
            return this;
        }

        @Override // O7.f.a
        public f.a c(byte[] bArr) {
            this.f8403b = bArr;
            return this;
        }
    }

    private a(Iterable iterable, byte[] bArr) {
        this.f8400a = iterable;
        this.f8401b = bArr;
    }

    /* synthetic */ a(Iterable iterable, byte[] bArr, C0143a c0143a) {
        this(iterable, bArr);
    }

    @Override // O7.f
    public Iterable b() {
        return this.f8400a;
    }

    @Override // O7.f
    public byte[] c() {
        return this.f8401b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f8400a.equals(fVar.b())) {
                if (Arrays.equals(this.f8401b, fVar instanceof a ? ((a) fVar).f8401b : fVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f8400a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f8401b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f8400a + ", extras=" + Arrays.toString(this.f8401b) + "}";
    }
}

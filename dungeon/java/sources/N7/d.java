package N7;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class d extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f7943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final L7.e f7944c;

    static final class b extends o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f7945a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f7946b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private L7.e f7947c;

        b() {
        }

        @Override // N7.o.a
        public o a() {
            String str = "";
            if (this.f7945a == null) {
                str = " backendName";
            }
            if (this.f7947c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new d(this.f7945a, this.f7946b, this.f7947c, null);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // N7.o.a
        public o.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f7945a = str;
            return this;
        }

        @Override // N7.o.a
        public o.a c(byte[] bArr) {
            this.f7946b = bArr;
            return this;
        }

        @Override // N7.o.a
        public o.a d(L7.e eVar) {
            if (eVar == null) {
                throw new NullPointerException("Null priority");
            }
            this.f7947c = eVar;
            return this;
        }
    }

    private d(String str, byte[] bArr, L7.e eVar) {
        this.f7942a = str;
        this.f7943b = bArr;
        this.f7944c = eVar;
    }

    /* synthetic */ d(String str, byte[] bArr, L7.e eVar, a aVar) {
        this(str, bArr, eVar);
    }

    @Override // N7.o
    public String b() {
        return this.f7942a;
    }

    @Override // N7.o
    public byte[] c() {
        return this.f7943b;
    }

    @Override // N7.o
    public L7.e d() {
        return this.f7944c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f7942a.equals(oVar.b())) {
                if (Arrays.equals(this.f7943b, oVar instanceof d ? ((d) oVar).f7943b : oVar.c()) && this.f7944c.equals(oVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f7942a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f7943b)) * 1000003) ^ this.f7944c.hashCode();
    }
}

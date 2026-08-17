package M7;

/* JADX INFO: loaded from: classes2.dex */
final class c extends M7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f6854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f6855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f6856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f6857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f6858e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f6859f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f6860g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f6861h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f6862i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f6863j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f6864k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f6865l;

    static final class b extends M7.a.AbstractC0124a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f6866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f6867b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f6868c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f6869d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f6870e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f6871f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f6872g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f6873h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f6874i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f6875j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f6876k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private String f6877l;

        b() {
        }

        @Override // M7.a.AbstractC0124a
        public M7.a a() {
            return new c(this.f6866a, this.f6867b, this.f6868c, this.f6869d, this.f6870e, this.f6871f, this.f6872g, this.f6873h, this.f6874i, this.f6875j, this.f6876k, this.f6877l, null);
        }

        @Override // M7.a.AbstractC0124a
        public M7.a.AbstractC0124a b(String str) {
            this.f6877l = str;
            return this;
        }

        @Override // M7.a.AbstractC0124a
        public M7.a.AbstractC0124a c(String str) {
            this.f6875j = str;
            return this;
        }

        @Override // M7.a.AbstractC0124a
        public M7.a.AbstractC0124a d(String str) {
            this.f6869d = str;
            return this;
        }

        @Override // M7.a.AbstractC0124a
        public M7.a.AbstractC0124a e(String str) {
            this.f6873h = str;
            return this;
        }

        @Override // M7.a.AbstractC0124a
        public M7.a.AbstractC0124a f(String str) {
            this.f6868c = str;
            return this;
        }

        @Override // M7.a.AbstractC0124a
        public M7.a.AbstractC0124a g(String str) {
            this.f6874i = str;
            return this;
        }

        @Override // M7.a.AbstractC0124a
        public M7.a.AbstractC0124a h(String str) {
            this.f6872g = str;
            return this;
        }

        @Override // M7.a.AbstractC0124a
        public M7.a.AbstractC0124a i(String str) {
            this.f6876k = str;
            return this;
        }

        @Override // M7.a.AbstractC0124a
        public M7.a.AbstractC0124a j(String str) {
            this.f6867b = str;
            return this;
        }

        @Override // M7.a.AbstractC0124a
        public M7.a.AbstractC0124a k(String str) {
            this.f6871f = str;
            return this;
        }

        @Override // M7.a.AbstractC0124a
        public M7.a.AbstractC0124a l(String str) {
            this.f6870e = str;
            return this;
        }

        @Override // M7.a.AbstractC0124a
        public M7.a.AbstractC0124a m(Integer num) {
            this.f6866a = num;
            return this;
        }
    }

    private c(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f6854a = num;
        this.f6855b = str;
        this.f6856c = str2;
        this.f6857d = str3;
        this.f6858e = str4;
        this.f6859f = str5;
        this.f6860g = str6;
        this.f6861h = str7;
        this.f6862i = str8;
        this.f6863j = str9;
        this.f6864k = str10;
        this.f6865l = str11;
    }

    /* synthetic */ c(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, a aVar) {
        this(num, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
    }

    @Override // M7.a
    public String b() {
        return this.f6865l;
    }

    @Override // M7.a
    public String c() {
        return this.f6863j;
    }

    @Override // M7.a
    public String d() {
        return this.f6857d;
    }

    @Override // M7.a
    public String e() {
        return this.f6861h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof M7.a) {
            M7.a aVar = (M7.a) obj;
            Integer num = this.f6854a;
            if (num != null ? num.equals(aVar.m()) : aVar.m() == null) {
                String str = this.f6855b;
                if (str != null ? str.equals(aVar.j()) : aVar.j() == null) {
                    String str2 = this.f6856c;
                    if (str2 != null ? str2.equals(aVar.f()) : aVar.f() == null) {
                        String str3 = this.f6857d;
                        if (str3 != null ? str3.equals(aVar.d()) : aVar.d() == null) {
                            String str4 = this.f6858e;
                            if (str4 != null ? str4.equals(aVar.l()) : aVar.l() == null) {
                                String str5 = this.f6859f;
                                if (str5 != null ? str5.equals(aVar.k()) : aVar.k() == null) {
                                    String str6 = this.f6860g;
                                    if (str6 != null ? str6.equals(aVar.h()) : aVar.h() == null) {
                                        String str7 = this.f6861h;
                                        if (str7 != null ? str7.equals(aVar.e()) : aVar.e() == null) {
                                            String str8 = this.f6862i;
                                            if (str8 != null ? str8.equals(aVar.g()) : aVar.g() == null) {
                                                String str9 = this.f6863j;
                                                if (str9 != null ? str9.equals(aVar.c()) : aVar.c() == null) {
                                                    String str10 = this.f6864k;
                                                    if (str10 != null ? str10.equals(aVar.i()) : aVar.i() == null) {
                                                        String str11 = this.f6865l;
                                                        if (str11 != null ? str11.equals(aVar.b()) : aVar.b() == null) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // M7.a
    public String f() {
        return this.f6856c;
    }

    @Override // M7.a
    public String g() {
        return this.f6862i;
    }

    @Override // M7.a
    public String h() {
        return this.f6860g;
    }

    public int hashCode() {
        Integer num = this.f6854a;
        int iHashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f6855b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f6856c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f6857d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f6858e;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f6859f;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f6860g;
        int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f6861h;
        int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f6862i;
        int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f6863j;
        int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f6864k;
        int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f6865l;
        return iHashCode11 ^ (str11 != null ? str11.hashCode() : 0);
    }

    @Override // M7.a
    public String i() {
        return this.f6864k;
    }

    @Override // M7.a
    public String j() {
        return this.f6855b;
    }

    @Override // M7.a
    public String k() {
        return this.f6859f;
    }

    @Override // M7.a
    public String l() {
        return this.f6858e;
    }

    @Override // M7.a
    public Integer m() {
        return this.f6854a;
    }

    public String toString() {
        return "AndroidClientInfo{sdkVersion=" + this.f6854a + ", model=" + this.f6855b + ", hardware=" + this.f6856c + ", device=" + this.f6857d + ", product=" + this.f6858e + ", osBuild=" + this.f6859f + ", manufacturer=" + this.f6860g + ", fingerprint=" + this.f6861h + ", locale=" + this.f6862i + ", country=" + this.f6863j + ", mccMnc=" + this.f6864k + ", applicationBuild=" + this.f6865l + "}";
    }
}

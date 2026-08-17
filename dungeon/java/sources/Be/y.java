package Be;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int f812a = c(1, 3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int f813b = c(1, 4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f814c = c(2, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f815d = c(3, 2);

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f816c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f817d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f818e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f819f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f820g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final b f821h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final b f822i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final b f823j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final b f824k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final b f825l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final b f826m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final b f827n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final b f828o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final b f829p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final b f830q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final b f831r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final b f832s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final b f833t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private static final /* synthetic */ b[] f834u;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f836b;

        static enum a extends b {
            a(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11, null);
            }

            @Override // Be.y.b
            public boolean h() {
                return false;
            }
        }

        /* JADX INFO: renamed from: Be.y$b$b, reason: collision with other inner class name */
        static enum C0020b extends b {
            C0020b(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11, null);
            }

            @Override // Be.y.b
            public boolean h() {
                return false;
            }
        }

        static enum c extends b {
            c(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11, null);
            }

            @Override // Be.y.b
            public boolean h() {
                return false;
            }
        }

        static enum d extends b {
            d(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11, null);
            }

            @Override // Be.y.b
            public boolean h() {
                return false;
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            f816c = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f817d = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f818e = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f819f = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f820g = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            f821h = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            f822i = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            f823j = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f824k = aVar;
            c cVar3 = c.MESSAGE;
            C0020b c0020b = new C0020b("GROUP", 9, cVar3, 3);
            f825l = c0020b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f826m = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f827n = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f828o = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f829p = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f830q = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            f831r = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            f832s = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            f833t = bVar14;
            f834u = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c0020b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        private b(String str, int i10, c cVar, int i11) {
            super(str, i10);
            this.f835a = cVar;
            this.f836b = i11;
        }

        /* synthetic */ b(String str, int i10, c cVar, int i11, a aVar) {
            this(str, i10, cVar, i11);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f834u.clone();
        }

        public c e() {
            return this.f835a;
        }

        public int g() {
            return this.f836b;
        }

        public boolean h() {
            return true;
        }
    }

    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(d.f710a),
        ENUM(null),
        MESSAGE(null);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f847a;

        c(Object obj) {
            this.f847a = obj;
        }
    }

    public static int a(int i10) {
        return i10 >>> 3;
    }

    static int b(int i10) {
        return i10 & 7;
    }

    static int c(int i10, int i11) {
        return (i10 << 3) | i11;
    }
}

package com.google.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public abstract class C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int f37688a = c(1, 3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int f37689b = c(1, 4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f37690c = c(2, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f37691d = c(3, 2);

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f37692a;

        static {
            int[] iArr = new int[b.values().length];
            f37692a = iArr;
            try {
                iArr[b.f37693c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37692a[b.f37694d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37692a[b.f37695e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37692a[b.f37696f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37692a[b.f37697g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37692a[b.f37698h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f37692a[b.f37699i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f37692a[b.f37700j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f37692a[b.f37704n.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f37692a[b.f37705o.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f37692a[b.f37707q.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f37692a[b.f37708r.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f37692a[b.f37709s.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f37692a[b.f37710t.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f37692a[b.f37701k.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f37692a[b.f37702l.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f37692a[b.f37703m.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f37692a[b.f37706p.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

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
        public static final b f37693c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f37694d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f37695e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f37696f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f37697g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final b f37698h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final b f37699i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final b f37700j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final b f37701k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final b f37702l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final b f37703m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final b f37704n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final b f37705o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final b f37706p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final b f37707q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final b f37708r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final b f37709s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final b f37710t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private static final /* synthetic */ b[] f37711u;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f37712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f37713b;

        final enum a extends b {
            a(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11, null);
            }

            @Override // com.google.protobuf.C0.b
            public boolean h() {
                return false;
            }
        }

        /* JADX INFO: renamed from: com.google.protobuf.C0$b$b, reason: collision with other inner class name */
        final enum C0412b extends b {
            C0412b(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11, null);
            }

            @Override // com.google.protobuf.C0.b
            public boolean h() {
                return false;
            }
        }

        final enum c extends b {
            c(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11, null);
            }

            @Override // com.google.protobuf.C0.b
            public boolean h() {
                return false;
            }
        }

        final enum d extends b {
            d(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11, null);
            }

            @Override // com.google.protobuf.C0.b
            public boolean h() {
                return false;
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            f37693c = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f37694d = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f37695e = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f37696f = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f37697g = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            f37698h = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            f37699i = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            f37700j = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f37701k = aVar;
            c cVar3 = c.MESSAGE;
            C0412b c0412b = new C0412b("GROUP", 9, cVar3, 3);
            f37702l = c0412b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f37703m = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f37704n = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f37705o = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f37706p = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f37707q = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            f37708r = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            f37709s = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            f37710t = bVar14;
            f37711u = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c0412b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        private b(String str, int i10, c cVar, int i11) {
            super(str, i10);
            this.f37712a = cVar;
            this.f37713b = i11;
        }

        /* synthetic */ b(String str, int i10, c cVar, int i11, a aVar) {
            this(str, i10, cVar, i11);
        }

        public static b valueOf(String str) {
            return (b) java.lang.Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f37711u.clone();
        }

        public c e() {
            return this.f37712a;
        }

        public int g() {
            return this.f37713b;
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
        BYTE_STRING(AbstractC3142h.f37908b),
        ENUM(null),
        MESSAGE(null);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f37724a;

        c(Object obj) {
            this.f37724a = obj;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static abstract class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f37725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f37726b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f37727c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ d[] f37728d;

        final enum a extends d {
            a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.google.protobuf.C0.d
            Object e(AbstractC3143i abstractC3143i) {
                return abstractC3143i.H();
            }
        }

        final enum b extends d {
            b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.google.protobuf.C0.d
            Object e(AbstractC3143i abstractC3143i) {
                return abstractC3143i.I();
            }
        }

        final enum c extends d {
            c(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.google.protobuf.C0.d
            Object e(AbstractC3143i abstractC3143i) {
                return abstractC3143i.r();
            }
        }

        static {
            a aVar = new a("LOOSE", 0);
            f37725a = aVar;
            b bVar = new b("STRICT", 1);
            f37726b = bVar;
            c cVar = new c("LAZY", 2);
            f37727c = cVar;
            f37728d = new d[]{aVar, bVar, cVar};
        }

        private d(String str, int i10) {
            super(str, i10);
        }

        /* synthetic */ d(String str, int i10, a aVar) {
            this(str, i10);
        }

        public static d valueOf(String str) {
            return (d) java.lang.Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f37728d.clone();
        }

        abstract Object e(AbstractC3143i abstractC3143i);
    }

    public static int a(int i10) {
        return i10 >>> 3;
    }

    public static int b(int i10) {
        return i10 & 7;
    }

    static int c(int i10, int i11) {
        return (i10 << 3) | i11;
    }

    static Object d(AbstractC3143i abstractC3143i, b bVar, d dVar) {
        switch (a.f37692a[bVar.ordinal()]) {
            case 1:
                return Double.valueOf(abstractC3143i.s());
            case 2:
                return Float.valueOf(abstractC3143i.w());
            case 3:
                return Long.valueOf(abstractC3143i.z());
            case 4:
                return Long.valueOf(abstractC3143i.L());
            case 5:
                return Integer.valueOf(abstractC3143i.y());
            case 6:
                return Long.valueOf(abstractC3143i.v());
            case 7:
                return Integer.valueOf(abstractC3143i.u());
            case 8:
                return Boolean.valueOf(abstractC3143i.q());
            case 9:
                return abstractC3143i.r();
            case 10:
                return Integer.valueOf(abstractC3143i.K());
            case 11:
                return Integer.valueOf(abstractC3143i.D());
            case 12:
                return Long.valueOf(abstractC3143i.E());
            case 13:
                return Integer.valueOf(abstractC3143i.F());
            case 14:
                return Long.valueOf(abstractC3143i.G());
            case 15:
                return dVar.e(abstractC3143i);
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}

package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int f23524a = c(1, 3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int f23525b = c(1, 4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f23526c = c(2, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f23527d = c(3, 2);

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
        public static final b f23528c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f23529d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f23530e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f23531f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f23532g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final b f23533h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final b f23534i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final b f23535j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final b f23536k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final b f23537l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final b f23538m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final b f23539n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final b f23540o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final b f23541p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final b f23542q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final b f23543r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final b f23544s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final b f23545t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private static final /* synthetic */ b[] f23546u;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f23547a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f23548b;

        final enum a extends b {
            a(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11, null);
            }
        }

        /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.m0$b$b, reason: collision with other inner class name */
        final enum C0287b extends b {
            C0287b(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11, null);
            }
        }

        final enum c extends b {
            c(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11, null);
            }
        }

        final enum d extends b {
            d(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11, null);
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            f23528c = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f23529d = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f23530e = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f23531f = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f23532g = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            f23533h = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            f23534i = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            f23535j = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f23536k = aVar;
            c cVar3 = c.MESSAGE;
            C0287b c0287b = new C0287b("GROUP", 9, cVar3, 3);
            f23537l = c0287b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f23538m = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f23539n = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f23540o = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f23541p = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f23542q = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            f23543r = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            f23544s = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            f23545t = bVar14;
            f23546u = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c0287b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        private b(String str, int i10, c cVar, int i11) {
            super(str, i10);
            this.f23547a = cVar;
            this.f23548b = i11;
        }

        /* synthetic */ b(String str, int i10, c cVar, int i11, a aVar) {
            this(str, i10, cVar, i11);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f23546u.clone();
        }

        public c e() {
            return this.f23547a;
        }

        public int g() {
            return this.f23548b;
        }
    }

    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(AbstractC1950f.f23435b),
        ENUM(null),
        MESSAGE(null);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f23559a;

        c(Object obj) {
            this.f23559a = obj;
        }
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
}

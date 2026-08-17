package androidx.datastore.preferences.protobuf;

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
/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1966w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC1966w f23658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final EnumC1966w f23659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final EnumC1966w f23660f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final EnumC1966w f23661g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumC1966w f23662h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final EnumC1966w f23663i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final EnumC1966w f23664j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final EnumC1966w f23665k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final EnumC1966w f23666l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final EnumC1966w f23667m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ EnumC1966w[] f23668n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f23669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f23670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f23671c;

    static {
        EnumC1966w enumC1966w = new EnumC1966w("VOID", 0, Void.class, Void.class, null);
        f23658d = enumC1966w;
        Class cls = Integer.TYPE;
        EnumC1966w enumC1966w2 = new EnumC1966w("INT", 1, cls, Integer.class, 0);
        f23659e = enumC1966w2;
        EnumC1966w enumC1966w3 = new EnumC1966w("LONG", 2, Long.TYPE, Long.class, 0L);
        f23660f = enumC1966w3;
        EnumC1966w enumC1966w4 = new EnumC1966w("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f23661g = enumC1966w4;
        EnumC1966w enumC1966w5 = new EnumC1966w("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f23662h = enumC1966w5;
        EnumC1966w enumC1966w6 = new EnumC1966w("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f23663i = enumC1966w6;
        EnumC1966w enumC1966w7 = new EnumC1966w("STRING", 6, String.class, String.class, "");
        f23664j = enumC1966w7;
        EnumC1966w enumC1966w8 = new EnumC1966w("BYTE_STRING", 7, AbstractC1950f.class, AbstractC1950f.class, AbstractC1950f.f23435b);
        f23665k = enumC1966w8;
        EnumC1966w enumC1966w9 = new EnumC1966w("ENUM", 8, cls, Integer.class, null);
        f23666l = enumC1966w9;
        EnumC1966w enumC1966w10 = new EnumC1966w("MESSAGE", 9, Object.class, Object.class, null);
        f23667m = enumC1966w10;
        f23668n = new EnumC1966w[]{enumC1966w, enumC1966w2, enumC1966w3, enumC1966w4, enumC1966w5, enumC1966w6, enumC1966w7, enumC1966w8, enumC1966w9, enumC1966w10};
    }

    private EnumC1966w(String str, int i10, Class cls, Class cls2, Object obj) {
        super(str, i10);
        this.f23669a = cls;
        this.f23670b = cls2;
        this.f23671c = obj;
    }

    public static EnumC1966w valueOf(String str) {
        return (EnumC1966w) Enum.valueOf(EnumC1966w.class, str);
    }

    public static EnumC1966w[] values() {
        return (EnumC1966w[]) f23668n.clone();
    }

    public Class e() {
        return this.f23670b;
    }
}

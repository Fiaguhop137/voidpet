package com.google.protobuf;

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
/* JADX INFO: loaded from: classes2.dex */
public final class D {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final D f37729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final D f37730e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final D f37731f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final D f37732g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final D f37733h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final D f37734i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final D f37735j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final D f37736k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final D f37737l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final D f37738m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ D[] f37739n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f37740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f37741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f37742c;

    static {
        D d10 = new D("VOID", 0, Void.class, Void.class, null);
        f37729d = d10;
        Class cls = Integer.TYPE;
        D d11 = new D("INT", 1, cls, Integer.class, 0);
        f37730e = d11;
        D d12 = new D("LONG", 2, Long.TYPE, Long.class, 0L);
        f37731f = d12;
        D d13 = new D("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f37732g = d13;
        D d14 = new D("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f37733h = d14;
        D d15 = new D("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f37734i = d15;
        D d16 = new D("STRING", 6, String.class, String.class, "");
        f37735j = d16;
        D d17 = new D("BYTE_STRING", 7, AbstractC3142h.class, AbstractC3142h.class, AbstractC3142h.f37908b);
        f37736k = d17;
        D d18 = new D("ENUM", 8, cls, Integer.class, null);
        f37737l = d18;
        D d19 = new D("MESSAGE", 9, Object.class, Object.class, null);
        f37738m = d19;
        f37739n = new D[]{d10, d11, d12, d13, d14, d15, d16, d17, d18, d19};
    }

    private D(String str, int i10, Class cls, Class cls2, Object obj) {
        super(str, i10);
        this.f37740a = cls;
        this.f37741b = cls2;
        this.f37742c = obj;
    }

    public static D valueOf(String str) {
        return (D) java.lang.Enum.valueOf(D.class, str);
    }

    public static D[] values() {
        return (D[]) f37739n.clone();
    }

    public Class e() {
        return this.f37741b;
    }
}

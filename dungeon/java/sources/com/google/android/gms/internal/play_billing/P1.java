package com.google.android.gms.internal.play_billing;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class P1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final P1 f34489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final P1 f34490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final P1 f34491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final P1 f34492e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final P1 f34493f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final P1 f34494g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final P1 f34495h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final P1 f34496i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final P1 f34497j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final P1 f34498k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ P1[] f34499l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f34500a;

    static {
        P1 p10 = new P1("VOID", 0, Void.class, Void.class, null);
        f34489b = p10;
        Class cls = Integer.TYPE;
        P1 p11 = new P1("INT", 1, cls, Integer.class, 0);
        f34490c = p11;
        P1 p12 = new P1("LONG", 2, Long.TYPE, Long.class, 0L);
        f34491d = p12;
        P1 p13 = new P1("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f34492e = p13;
        P1 p14 = new P1("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f34493f = p14;
        P1 p15 = new P1("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f34494g = p15;
        P1 p16 = new P1("STRING", 6, String.class, String.class, "");
        f34495h = p16;
        P1 p17 = new P1("BYTE_STRING", 7, AbstractC2843l1.class, AbstractC2843l1.class, AbstractC2843l1.f34755b);
        f34496i = p17;
        P1 p18 = new P1("ENUM", 8, cls, Integer.class, null);
        f34497j = p18;
        P1 p19 = new P1("MESSAGE", 9, Object.class, Object.class, null);
        f34498k = p19;
        f34499l = new P1[]{p10, p11, p12, p13, p14, p15, p16, p17, p18, p19};
    }

    private P1(String str, int i10, Class cls, Class cls2, Object obj) {
        super(str, i10);
        this.f34500a = cls2;
    }

    public static P1[] values() {
        return (P1[]) f34499l.clone();
    }

    public final Class e() {
        return this.f34500a;
    }
}

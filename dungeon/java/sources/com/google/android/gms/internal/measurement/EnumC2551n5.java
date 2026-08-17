package com.google.android.gms.internal.measurement;

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
/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.n5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC2551n5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC2551n5 f33025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC2551n5 f33026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC2551n5 f33027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final EnumC2551n5 f33028e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final EnumC2551n5 f33029f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final EnumC2551n5 f33030g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumC2551n5 f33031h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final EnumC2551n5 f33032i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final EnumC2551n5 f33033j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final EnumC2551n5 f33034k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ EnumC2551n5[] f33035l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f33036a;

    static {
        EnumC2551n5 enumC2551n5 = new EnumC2551n5("VOID", 0, Void.class, Void.class, null);
        f33025b = enumC2551n5;
        Class cls = Integer.TYPE;
        EnumC2551n5 enumC2551n6 = new EnumC2551n5("INT", 1, cls, Integer.class, 0);
        f33026c = enumC2551n6;
        EnumC2551n5 enumC2551n7 = new EnumC2551n5("LONG", 2, Long.TYPE, Long.class, 0L);
        f33027d = enumC2551n7;
        EnumC2551n5 enumC2551n8 = new EnumC2551n5("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f33028e = enumC2551n8;
        EnumC2551n5 enumC2551n9 = new EnumC2551n5("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f33029f = enumC2551n9;
        EnumC2551n5 enumC2551n10 = new EnumC2551n5("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f33030g = enumC2551n10;
        EnumC2551n5 enumC2551n11 = new EnumC2551n5("STRING", 6, String.class, String.class, "");
        f33031h = enumC2551n11;
        EnumC2551n5 enumC2551n12 = new EnumC2551n5("BYTE_STRING", 7, I4.class, I4.class, I4.f32539b);
        f33032i = enumC2551n12;
        EnumC2551n5 enumC2551n13 = new EnumC2551n5("ENUM", 8, cls, Integer.class, null);
        f33033j = enumC2551n13;
        EnumC2551n5 enumC2551n14 = new EnumC2551n5("MESSAGE", 9, Object.class, Object.class, null);
        f33034k = enumC2551n14;
        f33035l = new EnumC2551n5[]{enumC2551n5, enumC2551n6, enumC2551n7, enumC2551n8, enumC2551n9, enumC2551n10, enumC2551n11, enumC2551n12, enumC2551n13, enumC2551n14};
    }

    private EnumC2551n5(String str, int i10, Class cls, Class cls2, Object obj) {
        super(str, i10);
        this.f33036a = cls2;
    }

    public static EnumC2551n5[] values() {
        return (EnumC2551n5[]) f33035l.clone();
    }

    public final Class e() {
        return this.f33036a;
    }
}

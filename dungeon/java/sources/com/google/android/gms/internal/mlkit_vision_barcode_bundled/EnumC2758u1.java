package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

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
/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.u1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC2758u1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC2758u1 f34315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC2758u1 f34316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC2758u1 f34317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final EnumC2758u1 f34318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final EnumC2758u1 f34319f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final EnumC2758u1 f34320g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumC2758u1 f34321h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final EnumC2758u1 f34322i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final EnumC2758u1 f34323j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final EnumC2758u1 f34324k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ EnumC2758u1[] f34325l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f34326a;

    static {
        EnumC2758u1 enumC2758u1 = new EnumC2758u1("VOID", 0, Void.class, Void.class, null);
        f34315b = enumC2758u1;
        Class cls = Integer.TYPE;
        EnumC2758u1 enumC2758u2 = new EnumC2758u1("INT", 1, cls, Integer.class, 0);
        f34316c = enumC2758u2;
        EnumC2758u1 enumC2758u3 = new EnumC2758u1("LONG", 2, Long.TYPE, Long.class, 0L);
        f34317d = enumC2758u3;
        EnumC2758u1 enumC2758u4 = new EnumC2758u1("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f34318e = enumC2758u4;
        EnumC2758u1 enumC2758u5 = new EnumC2758u1("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f34319f = enumC2758u5;
        EnumC2758u1 enumC2758u6 = new EnumC2758u1("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f34320g = enumC2758u6;
        EnumC2758u1 enumC2758u7 = new EnumC2758u1("STRING", 6, String.class, String.class, "");
        f34321h = enumC2758u7;
        EnumC2758u1 enumC2758u8 = new EnumC2758u1("BYTE_STRING", 7, I0.class, I0.class, I0.f33335b);
        f34322i = enumC2758u8;
        EnumC2758u1 enumC2758u9 = new EnumC2758u1("ENUM", 8, cls, Integer.class, null);
        f34323j = enumC2758u9;
        EnumC2758u1 enumC2758u10 = new EnumC2758u1("MESSAGE", 9, Object.class, Object.class, null);
        f34324k = enumC2758u10;
        f34325l = new EnumC2758u1[]{enumC2758u1, enumC2758u2, enumC2758u3, enumC2758u4, enumC2758u5, enumC2758u6, enumC2758u7, enumC2758u8, enumC2758u9, enumC2758u10};
    }

    private EnumC2758u1(String str, int i10, Class cls, Class cls2, Object obj) {
        super(str, i10);
        this.f34326a = cls2;
    }

    public static EnumC2758u1[] values() {
        return (EnumC2758u1[]) f34325l.clone();
    }

    public final Class e() {
        return this.f34326a;
    }
}

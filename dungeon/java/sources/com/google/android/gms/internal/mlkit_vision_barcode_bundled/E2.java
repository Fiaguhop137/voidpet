package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class E2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final E2 f33300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final E2 f33301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final E2 f33302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final E2 f33303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final E2 f33304f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final E2 f33305g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final E2 f33306h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final E2 f33307i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final E2 f33308j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final E2 f33309k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final E2 f33310l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final E2 f33311m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final E2 f33312n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final E2 f33313o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final E2 f33314p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final E2 f33315q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final E2 f33316r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final E2 f33317s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final /* synthetic */ E2[] f33318t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F2 f33319a;

    static {
        E2 e10 = new E2("DOUBLE", 0, F2.DOUBLE, 1);
        f33300b = e10;
        E2 e11 = new E2("FLOAT", 1, F2.FLOAT, 5);
        f33301c = e11;
        F2 f10 = F2.LONG;
        E2 e12 = new E2("INT64", 2, f10, 0);
        f33302d = e12;
        E2 e13 = new E2("UINT64", 3, f10, 0);
        f33303e = e13;
        F2 f11 = F2.INT;
        E2 e14 = new E2("INT32", 4, f11, 0);
        f33304f = e14;
        E2 e15 = new E2("FIXED64", 5, f10, 1);
        f33305g = e15;
        E2 e16 = new E2("FIXED32", 6, f11, 5);
        f33306h = e16;
        E2 e17 = new E2("BOOL", 7, F2.BOOLEAN, 0);
        f33307i = e17;
        E2 e18 = new E2("STRING", 8, F2.STRING, 2);
        f33308j = e18;
        F2 f12 = F2.MESSAGE;
        E2 e19 = new E2("GROUP", 9, f12, 3);
        f33309k = e19;
        E2 e20 = new E2("MESSAGE", 10, f12, 2);
        f33310l = e20;
        E2 e21 = new E2("BYTES", 11, F2.BYTE_STRING, 2);
        f33311m = e21;
        E2 e22 = new E2("UINT32", 12, f11, 0);
        f33312n = e22;
        E2 e23 = new E2("ENUM", 13, F2.ENUM, 0);
        f33313o = e23;
        E2 e24 = new E2("SFIXED32", 14, f11, 5);
        f33314p = e24;
        E2 e25 = new E2("SFIXED64", 15, f10, 1);
        f33315q = e25;
        E2 e26 = new E2("SINT32", 16, f11, 0);
        f33316r = e26;
        E2 e27 = new E2("SINT64", 17, f10, 0);
        f33317s = e27;
        f33318t = new E2[]{e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20, e21, e22, e23, e24, e25, e26, e27};
    }

    private E2(String str, int i10, F2 f10, int i11) {
        super(str, i10);
        this.f33319a = f10;
    }

    public static E2[] values() {
        return (E2[]) f33318t.clone();
    }

    public final F2 e() {
        return this.f33319a;
    }
}

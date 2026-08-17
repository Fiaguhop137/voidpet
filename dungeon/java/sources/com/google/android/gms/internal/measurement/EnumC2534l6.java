package com.google.android.gms.internal.measurement;

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
/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC2534l6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC2534l6 f32973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC2534l6 f32974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final EnumC2534l6 f32975e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final EnumC2534l6 f32976f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final EnumC2534l6 f32977g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumC2534l6 f32978h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final EnumC2534l6 f32979i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final EnumC2534l6 f32980j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final EnumC2534l6 f32981k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final EnumC2534l6 f32982l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final EnumC2534l6 f32983m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final EnumC2534l6 f32984n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final EnumC2534l6 f32985o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final EnumC2534l6 f32986p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final EnumC2534l6 f32987q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC2534l6 f32988r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final EnumC2534l6 f32989s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final EnumC2534l6 f32990t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final /* synthetic */ EnumC2534l6[] f32991u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC2543m6 f32992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f32993b;

    static {
        EnumC2534l6 enumC2534l6 = new EnumC2534l6("DOUBLE", 0, EnumC2543m6.DOUBLE, 1);
        f32973c = enumC2534l6;
        EnumC2534l6 enumC2534l7 = new EnumC2534l6("FLOAT", 1, EnumC2543m6.FLOAT, 5);
        f32974d = enumC2534l7;
        EnumC2543m6 enumC2543m6 = EnumC2543m6.LONG;
        EnumC2534l6 enumC2534l8 = new EnumC2534l6("INT64", 2, enumC2543m6, 0);
        f32975e = enumC2534l8;
        EnumC2534l6 enumC2534l9 = new EnumC2534l6("UINT64", 3, enumC2543m6, 0);
        f32976f = enumC2534l9;
        EnumC2543m6 enumC2543m7 = EnumC2543m6.INT;
        EnumC2534l6 enumC2534l10 = new EnumC2534l6("INT32", 4, enumC2543m7, 0);
        f32977g = enumC2534l10;
        EnumC2534l6 enumC2534l11 = new EnumC2534l6("FIXED64", 5, enumC2543m6, 1);
        f32978h = enumC2534l11;
        EnumC2534l6 enumC2534l12 = new EnumC2534l6("FIXED32", 6, enumC2543m7, 5);
        f32979i = enumC2534l12;
        EnumC2534l6 enumC2534l13 = new EnumC2534l6("BOOL", 7, EnumC2543m6.BOOLEAN, 0);
        f32980j = enumC2534l13;
        EnumC2534l6 enumC2534l14 = new EnumC2534l6("STRING", 8, EnumC2543m6.STRING, 2);
        f32981k = enumC2534l14;
        EnumC2543m6 enumC2543m8 = EnumC2543m6.MESSAGE;
        EnumC2534l6 enumC2534l15 = new EnumC2534l6("GROUP", 9, enumC2543m8, 3);
        f32982l = enumC2534l15;
        EnumC2534l6 enumC2534l16 = new EnumC2534l6("MESSAGE", 10, enumC2543m8, 2);
        f32983m = enumC2534l16;
        EnumC2534l6 enumC2534l17 = new EnumC2534l6("BYTES", 11, EnumC2543m6.BYTE_STRING, 2);
        f32984n = enumC2534l17;
        EnumC2534l6 enumC2534l18 = new EnumC2534l6("UINT32", 12, enumC2543m7, 0);
        f32985o = enumC2534l18;
        EnumC2534l6 enumC2534l19 = new EnumC2534l6("ENUM", 13, EnumC2543m6.ENUM, 0);
        f32986p = enumC2534l19;
        EnumC2534l6 enumC2534l20 = new EnumC2534l6("SFIXED32", 14, enumC2543m7, 5);
        f32987q = enumC2534l20;
        EnumC2534l6 enumC2534l21 = new EnumC2534l6("SFIXED64", 15, enumC2543m6, 1);
        f32988r = enumC2534l21;
        EnumC2534l6 enumC2534l22 = new EnumC2534l6("SINT32", 16, enumC2543m7, 0);
        f32989s = enumC2534l22;
        EnumC2534l6 enumC2534l23 = new EnumC2534l6("SINT64", 17, enumC2543m6, 0);
        f32990t = enumC2534l23;
        f32991u = new EnumC2534l6[]{enumC2534l6, enumC2534l7, enumC2534l8, enumC2534l9, enumC2534l10, enumC2534l11, enumC2534l12, enumC2534l13, enumC2534l14, enumC2534l15, enumC2534l16, enumC2534l17, enumC2534l18, enumC2534l19, enumC2534l20, enumC2534l21, enumC2534l22, enumC2534l23};
    }

    private EnumC2534l6(String str, int i10, EnumC2543m6 enumC2543m6, int i11) {
        super(str, i10);
        this.f32992a = enumC2543m6;
        this.f32993b = i11;
    }

    public static EnumC2534l6[] values() {
        return (EnumC2534l6[]) f32991u.clone();
    }

    public final EnumC2543m6 e() {
        return this.f32992a;
    }

    public final int g() {
        return this.f32993b;
    }
}

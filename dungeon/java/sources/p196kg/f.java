package p196kg;

import Vf.b;

/* JADX INFO: loaded from: classes3.dex */
public class f implements b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int[] f48202h;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final f f48207m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final f f48208n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f48217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f48218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f48219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f48220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f48221e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f48222f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final d f48223g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int[] f48203i = {10, 9, 6, 0};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int[] f48204j = {7, 2, 1, 0};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int[] f48205k = {8, 0};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int[] f48206l = {7, 2, 1, 0};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final f f48209o = new f("mceliece460896", 13, 4608, 96, f48203i, false, 192);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final f f48210p = new f("mceliece460896f", 13, 4608, 96, f48203i, true, 192);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final f f48211q = new f("mceliece6688128", 13, 6688, 128, f48204j, false, 256);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final f f48212r = new f("mceliece6688128f", 13, 6688, 128, f48204j, true, 256);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final f f48213s = new f("mceliece6960119", 13, 6960, 119, f48205k, false, 256);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final f f48214t = new f("mceliece6960119f", 13, 6960, 119, f48205k, true, 256);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final f f48215u = new f("mceliece8192128", 13, 8192, 128, f48206l, false, 256);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final f f48216v = new f("mceliece8192128f", 13, 8192, 128, f48206l, true, 256);

    static {
        int[] iArr = {3, 1, 0};
        f48202h = iArr;
        f48207m = new f("mceliece348864", 12, 3488, 64, iArr, false, 128);
        f48208n = new f("mceliece348864f", 12, 3488, 64, f48202h, true, 128);
    }

    private f(String str, int i10, int i11, int i12, int[] iArr, boolean z10, int i13) {
        this.f48217a = str;
        this.f48218b = i10;
        this.f48219c = i11;
        this.f48220d = i12;
        this.f48221e = z10;
        this.f48222f = i13;
        this.f48223g = new d(i10, i11, i12, iArr, z10, i13);
    }

    d a() {
        return this.f48223g;
    }

    public String b() {
        return this.f48217a;
    }

    public int c() {
        return this.f48220d;
    }
}

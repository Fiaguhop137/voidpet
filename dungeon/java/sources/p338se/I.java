package p338se;

import Re.N0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class I {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f53541k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final I f53542l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final I f53543m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final I f53544n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final I f53545o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final I f53546p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final I f53547q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final I f53548r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final I f53549s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final I f53550t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f53551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f53552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f53553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f53554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f53555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final I f53556f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f53557g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final I f53558h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final I f53559i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f53560j;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f53561a;

        static {
            int[] iArr = new int[N0.values().length];
            try {
                iArr[N0.IN_VARIANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[N0.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f53561a = iArr;
        }
    }

    static {
        I i10 = new I(false, false, false, false, false, null, false, null, null, false, 1023, null);
        f53542l = i10;
        I i11 = new I(false, false, false, false, false, null, false, null, null, true, 511, null);
        f53543m = i11;
        f53544n = new I(false, true, false, false, false, null, false, null, null, false, 1021, null);
        f53545o = new I(false, false, false, false, false, i10, false, null, null, false, 988, null);
        f53546p = new I(false, false, false, false, false, i11, false, null, null, true, 476, null);
        f53547q = new I(false, true, false, false, false, i10, false, null, null, false, 988, null);
        f53548r = new I(false, false, false, true, false, i10, false, null, null, false, 983, null);
        f53549s = new I(false, false, false, true, false, i10, false, null, null, false, 919, null);
        f53550t = new I(false, false, true, false, false, i10, false, null, null, false, 984, null);
    }

    public I(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, I i10, boolean z15, I i11, I i12, boolean z16) {
        this.f53551a = z10;
        this.f53552b = z11;
        this.f53553c = z12;
        this.f53554d = z13;
        this.f53555e = z14;
        this.f53556f = i10;
        this.f53557g = z15;
        this.f53558h = i11;
        this.f53559i = i12;
        this.f53560j = z16;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ I(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, I i10, boolean z15, I i11, I i12, boolean z16, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        z10 = (i13 & 1) != 0 ? true : z10;
        z11 = (i13 & 2) != 0 ? true : z11;
        z12 = (i13 & 4) != 0 ? false : z12;
        z13 = (i13 & 8) != 0 ? false : z13;
        z14 = (i13 & 16) != 0 ? false : z14;
        i10 = (i13 & 32) != 0 ? null : i10;
        this(z10, z11, z12, z13, z14, i10, (i13 & 64) != 0 ? true : z15, (i13 & 128) != 0 ? i10 : i11, (i13 & 256) != 0 ? i10 : i12, (i13 & 512) != 0 ? false : z16);
    }

    public final boolean a() {
        return this.f53557g;
    }

    public final boolean b() {
        return this.f53560j;
    }

    public final boolean c() {
        return this.f53552b;
    }

    public final boolean d() {
        return this.f53551a;
    }

    public final boolean e() {
        return this.f53553c;
    }

    public final I f(N0 effectiveVariance, boolean z10) {
        Intrinsics.checkNotNullParameter(effectiveVariance, "effectiveVariance");
        if (!z10 || !this.f53553c) {
            int i10 = b.f53561a[effectiveVariance.ordinal()];
            if (i10 == 1) {
                I i11 = this.f53558h;
                if (i11 != null) {
                    return i11;
                }
            } else if (i10 != 2) {
                I i12 = this.f53556f;
                if (i12 != null) {
                    return i12;
                }
            } else {
                I i13 = this.f53559i;
                if (i13 != null) {
                    return i13;
                }
            }
        }
        return this;
    }

    public final I g() {
        return new I(this.f53551a, true, this.f53553c, this.f53554d, this.f53555e, this.f53556f, this.f53557g, this.f53558h, this.f53559i, false, 512, null);
    }
}

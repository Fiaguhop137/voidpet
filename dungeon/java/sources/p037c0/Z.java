package p037c0;

import Ad.E;
import Ad.z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p055d0.AbstractC3219c;
import p055d0.AbstractC3220d;
import p055d0.k;

/* JADX INFO: loaded from: classes.dex */
public final class Z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f26696b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f26697c = AbstractC2073b0.c(4278190080L);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f26698d = AbstractC2073b0.c(4282664004L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f26699e = AbstractC2073b0.c(4287137928L);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f26700f = AbstractC2073b0.c(4291611852L);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f26701g = AbstractC2073b0.c(4294967295L);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f26702h = AbstractC2073b0.c(4294901760L);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f26703i = AbstractC2073b0.c(4278255360L);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f26704j = AbstractC2073b0.c(4278190335L);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f26705k = AbstractC2073b0.c(4294967040L);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f26706l = AbstractC2073b0.c(4278255615L);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f26707m = AbstractC2073b0.c(4294902015L);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f26708n = AbstractC2073b0.b(0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f26709o = AbstractC2073b0.a(0.0f, 0.0f, 0.0f, 0.0f, k.f39559a.r());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f26710a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return Z.f26697c;
        }

        public final long b() {
            return Z.f26704j;
        }

        public final long c() {
            return Z.f26702h;
        }

        public final long d() {
            return Z.f26708n;
        }

        public final long e() {
            return Z.f26709o;
        }

        public final long f() {
            return Z.f26701g;
        }
    }

    private /* synthetic */ Z(long j10) {
        this.f26710a = j10;
    }

    public static final /* synthetic */ Z g(long j10) {
        return new Z(j10);
    }

    public static long h(long j10) {
        return j10;
    }

    public static final long i(long j10, AbstractC3219c abstractC3219c) {
        return AbstractC3220d.i(p(j10), abstractC3219c, 0, 2, null).a(j10);
    }

    public static final long j(long j10, float f10, float f11, float f12, float f13) {
        return AbstractC2073b0.a(f11, f12, f13, f10, p(j10));
    }

    public static /* synthetic */ long k(long j10, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = n(j10);
        }
        float f14 = f10;
        if ((i10 & 2) != 0) {
            f11 = r(j10);
        }
        float f15 = f11;
        if ((i10 & 4) != 0) {
            f12 = q(j10);
        }
        float f16 = f12;
        if ((i10 & 8) != 0) {
            f13 = o(j10);
        }
        return j(j10, f14, f15, f16, f13);
    }

    public static boolean l(long j10, Object obj) {
        return (obj instanceof Z) && j10 == ((Z) obj).u();
    }

    public static final boolean m(long j10, long j11) {
        return z.i(j10, j11);
    }

    public static final float n(long j10) {
        float fC;
        float f10;
        if (z.g(63 & j10) == 0) {
            fC = (float) E.c(z.g(z.g(j10 >>> 56) & 255));
            f10 = 255.0f;
        } else {
            fC = (float) E.c(z.g(z.g(j10 >>> 6) & 1023));
            f10 = 1023.0f;
        }
        return fC / f10;
    }

    public static final float o(long j10) {
        int i10;
        int i11;
        int i12;
        if (z.g(63 & j10) == 0) {
            return ((float) E.c(z.g(z.g(j10 >>> 32) & 255))) / 255.0f;
        }
        short sG = (short) z.g(z.g(j10 >>> 16) & 65535);
        int i13 = Short.MIN_VALUE & sG;
        int i14 = ((65535 & sG) >>> 10) & 31;
        int i15 = sG & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - e0.f26716a;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    public static final AbstractC3219c p(long j10) {
        k kVar = k.f39559a;
        return kVar.m()[(int) z.g(j10 & 63)];
    }

    public static final float q(long j10) {
        int i10;
        int i11;
        int i12;
        if (z.g(63 & j10) == 0) {
            return ((float) E.c(z.g(z.g(j10 >>> 40) & 255))) / 255.0f;
        }
        short sG = (short) z.g(z.g(j10 >>> 32) & 65535);
        int i13 = Short.MIN_VALUE & sG;
        int i14 = ((65535 & sG) >>> 10) & 31;
        int i15 = sG & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - e0.f26716a;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    public static final float r(long j10) {
        int i10;
        int i11;
        int i12;
        if (z.g(63 & j10) == 0) {
            return ((float) E.c(z.g(z.g(j10 >>> 48) & 255))) / 255.0f;
        }
        short sG = (short) z.g(z.g(j10 >>> 48) & 65535);
        int i13 = Short.MIN_VALUE & sG;
        int i14 = ((65535 & sG) >>> 10) & 31;
        int i15 = sG & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - e0.f26716a;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    public static int s(long j10) {
        return z.o(j10);
    }

    public static String t(long j10) {
        return "Color(" + r(j10) + ", " + q(j10) + ", " + o(j10) + ", " + n(j10) + ", " + p(j10).f() + ')';
    }

    public boolean equals(Object obj) {
        return l(this.f26710a, obj);
    }

    public int hashCode() {
        return s(this.f26710a);
    }

    public String toString() {
        return t(this.f26710a);
    }

    public final /* synthetic */ long u() {
        return this.f26710a;
    }
}

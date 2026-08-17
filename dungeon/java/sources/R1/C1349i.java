package R1;

import U1.S;
import java.util.Arrays;

/* JADX INFO: renamed from: R1.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1349i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C1349i f10161h = new b().d(1).c(2).e(3).a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C1349i f10162i = new b().d(1).c(1).e(2).a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f10163j = S.z0(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f10164k = S.z0(1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f10165l = S.z0(2);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f10166m = S.z0(3);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f10167n = S.z0(4);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f10168o = S.z0(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f10172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10173e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f10174f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f10175g;

    /* JADX INFO: renamed from: R1.i$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f10176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f10177b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f10178c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f10179d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f10180e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f10181f;

        public b() {
            this.f10176a = -1;
            this.f10177b = -1;
            this.f10178c = -1;
            this.f10180e = -1;
            this.f10181f = -1;
        }

        private b(C1349i c1349i) {
            this.f10176a = c1349i.f10169a;
            this.f10177b = c1349i.f10170b;
            this.f10178c = c1349i.f10171c;
            this.f10179d = c1349i.f10172d;
            this.f10180e = c1349i.f10173e;
            this.f10181f = c1349i.f10174f;
        }

        /* synthetic */ b(C1349i c1349i, a aVar) {
            this(c1349i);
        }

        public C1349i a() {
            return new C1349i(this.f10176a, this.f10177b, this.f10178c, this.f10179d, this.f10180e, this.f10181f, null);
        }

        public b b(int i10) {
            this.f10181f = i10;
            return this;
        }

        public b c(int i10) {
            this.f10177b = i10;
            return this;
        }

        public b d(int i10) {
            this.f10176a = i10;
            return this;
        }

        public b e(int i10) {
            this.f10178c = i10;
            return this;
        }

        public b f(byte[] bArr) {
            this.f10179d = bArr;
            return this;
        }

        public b g(int i10) {
            this.f10180e = i10;
            return this;
        }
    }

    private C1349i(int i10, int i11, int i12, byte[] bArr, int i13, int i14) {
        this.f10169a = i10;
        this.f10170b = i11;
        this.f10171c = i12;
        this.f10172d = bArr;
        this.f10173e = i13;
        this.f10174f = i14;
    }

    /* synthetic */ C1349i(int i10, int i11, int i12, byte[] bArr, int i13, int i14, a aVar) {
        this(i10, i11, i12, bArr, i13, i14);
    }

    private static String b(int i10) {
        if (i10 == -1) {
            return "NA";
        }
        return i10 + "bit Chroma";
    }

    private static String c(int i10) {
        if (i10 == -1) {
            return "Unset color range";
        }
        if (i10 == 1) {
            return "Full range";
        }
        if (i10 == 2) {
            return "Limited range";
        }
        return "Undefined color range " + i10;
    }

    private static String d(int i10) {
        if (i10 == -1) {
            return "Unset color space";
        }
        if (i10 == 6) {
            return "BT2020";
        }
        if (i10 == 1) {
            return "BT709";
        }
        if (i10 == 2) {
            return "BT601";
        }
        return "Undefined color space " + i10;
    }

    private static String e(int i10) {
        if (i10 == -1) {
            return "Unset color transfer";
        }
        if (i10 == 10) {
            return "Gamma 2.2";
        }
        if (i10 == 1) {
            return "Linear";
        }
        if (i10 == 2) {
            return "sRGB";
        }
        if (i10 == 3) {
            return "SDR SMPTE 170M";
        }
        if (i10 == 6) {
            return "ST2084 PQ";
        }
        if (i10 == 7) {
            return "HLG";
        }
        return "Undefined color transfer " + i10;
    }

    public static boolean h(C1349i c1349i) {
        if (c1349i == null) {
            return true;
        }
        int i10 = c1349i.f10169a;
        if (i10 != -1 && i10 != 1 && i10 != 2) {
            return false;
        }
        int i11 = c1349i.f10170b;
        if (i11 != -1 && i11 != 2) {
            return false;
        }
        int i12 = c1349i.f10171c;
        if ((i12 != -1 && i12 != 3) || c1349i.f10172d != null) {
            return false;
        }
        int i13 = c1349i.f10174f;
        if (i13 != -1 && i13 != 8) {
            return false;
        }
        int i14 = c1349i.f10173e;
        return i14 == -1 || i14 == 8;
    }

    public static int j(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int k(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 4) {
            return 10;
        }
        if (i10 == 13) {
            return 2;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 != 18) {
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 7;
    }

    private static String l(int i10) {
        if (i10 == -1) {
            return "NA";
        }
        return i10 + "bit Luma";
    }

    public b a() {
        return new b(this, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1349i.class == obj.getClass()) {
            C1349i c1349i = (C1349i) obj;
            if (this.f10169a == c1349i.f10169a && this.f10170b == c1349i.f10170b && this.f10171c == c1349i.f10171c && Arrays.equals(this.f10172d, c1349i.f10172d) && this.f10173e == c1349i.f10173e && this.f10174f == c1349i.f10174f) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        return (this.f10173e == -1 || this.f10174f == -1) ? false : true;
    }

    public boolean g() {
        return (this.f10169a == -1 || this.f10170b == -1 || this.f10171c == -1) ? false : true;
    }

    public int hashCode() {
        if (this.f10175g == 0) {
            this.f10175g = ((((((((((527 + this.f10169a) * 31) + this.f10170b) * 31) + this.f10171c) * 31) + Arrays.hashCode(this.f10172d)) * 31) + this.f10173e) * 31) + this.f10174f;
        }
        return this.f10175g;
    }

    public boolean i() {
        return f() || g();
    }

    public String m() {
        String str;
        String strG = g() ? S.G("%s/%s/%s", d(this.f10169a), c(this.f10170b), e(this.f10171c)) : "NA/NA/NA";
        if (f()) {
            str = this.f10173e + "/" + this.f10174f;
        } else {
            str = "NA/NA";
        }
        return strG + "/" + str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ColorInfo(");
        sb2.append(d(this.f10169a));
        sb2.append(", ");
        sb2.append(c(this.f10170b));
        sb2.append(", ");
        sb2.append(e(this.f10171c));
        sb2.append(", ");
        sb2.append(this.f10172d != null);
        sb2.append(", ");
        sb2.append(l(this.f10173e));
        sb2.append(", ");
        sb2.append(b(this.f10174f));
        sb2.append(")");
        return sb2.toString();
    }
}

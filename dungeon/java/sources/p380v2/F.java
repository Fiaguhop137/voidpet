package p380v2;

/* JADX INFO: loaded from: classes.dex */
public abstract class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f55955a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f55956b = {44100, 48000, 32000};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f55957c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f55958d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f55959e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f55960f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f55961g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f55962a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f55963b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f55964c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f55965d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f55966e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f55967f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f55968g;

        public a() {
        }

        public a(a aVar) {
            this.f55962a = aVar.f55962a;
            this.f55963b = aVar.f55963b;
            this.f55964c = aVar.f55964c;
            this.f55965d = aVar.f55965d;
            this.f55966e = aVar.f55966e;
            this.f55967f = aVar.f55967f;
            this.f55968g = aVar.f55968g;
        }

        public boolean a(int i10) {
            int i11;
            int i12;
            int i13;
            int i14;
            if (!F.l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
                return false;
            }
            this.f55962a = i11;
            this.f55963b = F.f55955a[3 - i12];
            int i15 = F.f55956b[i14];
            this.f55965d = i15;
            if (i11 == 2) {
                this.f55965d = i15 / 2;
            } else if (i11 == 0) {
                this.f55965d = i15 / 4;
            }
            int i16 = (i10 >>> 9) & 1;
            this.f55968g = F.k(i11, i12);
            if (i12 == 3) {
                int i17 = i11 == 3 ? F.f55957c[i13 - 1] : F.f55958d[i13 - 1];
                this.f55967f = i17;
                this.f55964c = (((i17 * 12) / this.f55965d) + i16) * 4;
            } else {
                if (i11 == 3) {
                    int i18 = i12 == 2 ? F.f55959e[i13 - 1] : F.f55960f[i13 - 1];
                    this.f55967f = i18;
                    this.f55964c = ((i18 * 144) / this.f55965d) + i16;
                } else {
                    int i19 = F.f55961g[i13 - 1];
                    this.f55967f = i19;
                    this.f55964c = (((i12 == 1 ? 72 : 144) * i19) / this.f55965d) + i16;
                }
            }
            this.f55966e = ((i10 >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }
    }

    public static int j(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if (!l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i16 = f55956b[i14];
        if (i11 == 2) {
            i16 /= 2;
        } else if (i11 == 0) {
            i16 /= 4;
        }
        int i17 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? f55957c[i13 - 1] : f55958d[i13 - 1]) * 12) / i16) + i17) * 4;
        }
        if (i11 == 3) {
            i15 = i12 == 2 ? f55959e[i13 - 1] : f55960f[i13 - 1];
        } else {
            i15 = f55961g[i13 - 1];
        }
        if (i11 == 3) {
            return ((i15 * 144) / i16) + i17;
        }
        return (((i12 == 1 ? 72 : 144) * i15) / i16) + i17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(int i10, int i11) {
        if (i11 == 1) {
            return i10 == 3 ? 1152 : 576;
        }
        if (i11 == 2) {
            return 1152;
        }
        if (i11 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean l(int i10) {
        return (i10 & (-2097152)) == -2097152;
    }

    public static int m(int i10) {
        int i11;
        int i12;
        if (!l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0) {
            return -1;
        }
        int i13 = (i10 >>> 12) & 15;
        int i14 = (i10 >>> 10) & 3;
        if (i13 == 0 || i13 == 15 || i14 == 3) {
            return -1;
        }
        return k(i11, i12);
    }
}

package p380v2;

import R1.z;
import U1.AbstractC1477t;
import U1.E;

/* JADX INFO: renamed from: v2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4238a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f56018a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f56019b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: renamed from: v2.a$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f56020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f56021b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f56022c;

        private b(int i10, int i11, String str) {
            this.f56020a = i10;
            this.f56021b = i11;
            this.f56022c = str;
        }

        /* synthetic */ b(int i10, int i11, String str, C0709a c0709a) {
            this(i10, i11, str);
        }
    }

    public static byte[] a(int i10, int i11) {
        int i12 = 0;
        int i13 = -1;
        int i14 = 0;
        while (true) {
            int[] iArr = f56018a;
            if (i14 >= iArr.length) {
                break;
            }
            if (i10 == iArr[i14]) {
                i13 = i14;
            }
            i14++;
        }
        int i15 = -1;
        while (true) {
            int[] iArr2 = f56019b;
            if (i12 >= iArr2.length) {
                break;
            }
            if (i11 == iArr2[i12]) {
                i15 = i12;
            }
            i12++;
        }
        if (i10 != -1 && i15 != -1) {
            return b(2, i13, i15);
        }
        throw new IllegalArgumentException("Invalid sample rate or number of channels: " + i10 + ", " + i11);
    }

    public static byte[] b(int i10, int i11, int i12) {
        return new byte[]{(byte) (((i10 << 3) & 248) | ((i11 >> 1) & 7)), (byte) (((i11 << 7) & 128) | ((i12 << 3) & 120))};
    }

    private static int c(E e10) {
        int iH = e10.h(5);
        return iH == 31 ? e10.h(6) + 32 : iH;
    }

    private static int d(E e10) throws z {
        int iH = e10.h(4);
        if (iH == 15) {
            if (e10.b() >= 24) {
                return e10.h(24);
            }
            throw z.a("AAC header insufficient data", null);
        }
        if (iH < 13) {
            return f56018a[iH];
        }
        throw z.a("AAC header wrong Sampling Frequency Index", null);
    }

    public static b e(E e10, boolean z10) throws z {
        int iC = c(e10);
        int iD = d(e10);
        int iH = e10.h(4);
        String str = "mp4a.40." + iC;
        if (iC == 5 || iC == 29) {
            iD = d(e10);
            iC = c(e10);
            if (iC == 22) {
                iH = e10.h(4);
            }
        }
        if (z10) {
            if (iC != 1 && iC != 2 && iC != 3 && iC != 4 && iC != 6 && iC != 7 && iC != 17) {
                switch (iC) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw z.d("Unsupported audio object type: " + iC);
                }
            }
            g(e10, iC, iH);
            switch (iC) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iH2 = e10.h(2);
                    if (iH2 == 2 || iH2 == 3) {
                        throw z.d("Unsupported epConfig: " + iH2);
                    }
                    break;
            }
        }
        int i10 = f56019b[iH];
        if (i10 != -1) {
            return new b(iD, i10, str, null);
        }
        throw z.a(null, null);
    }

    public static b f(byte[] bArr) {
        return e(new E(bArr), false);
    }

    private static void g(E e10, int i10, int i11) {
        if (e10.g()) {
            AbstractC1477t.h("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (e10.g()) {
            e10.r(14);
        }
        boolean zG = e10.g();
        if (i11 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i10 == 6 || i10 == 20) {
            e10.r(3);
        }
        if (zG) {
            if (i10 == 22) {
                e10.r(16);
            }
            if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                e10.r(3);
            }
            e10.r(1);
        }
    }
}

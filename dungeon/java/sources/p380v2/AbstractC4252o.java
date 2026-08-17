package p380v2;

import R1.n;
import R1.r;
import R1.z;
import U1.E;
import U1.S;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: v2.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4252o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f56129a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f56130b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f56131c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f56132d = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f56133e = {5, 8, 10, 12};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f56134f = {6, 9, 12, 15};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f56135g = {2, 4, 6, 8};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f56136h = {9, 11, 13, 16};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f56137i = {5, 8, 10, 12};

    /* JADX INFO: renamed from: v2.o$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f56138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f56139b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f56140c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f56141d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f56142e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f56143f;

        private b(String str, int i10, int i11, int i12, long j10, int i13) {
            this.f56138a = str;
            this.f56140c = i10;
            this.f56139b = i11;
            this.f56141d = i12;
            this.f56142e = j10;
            this.f56143f = i13;
        }

        /* synthetic */ b(String str, int i10, int i11, int i12, long j10, int i13, a aVar) {
            this(str, i10, i11, i12, j10, i13);
        }
    }

    private static void a(byte[] bArr, int i10) throws z {
        int i11 = i10 - 2;
        if (((bArr[i10 - 1] & 255) | ((bArr[i11] << 8) & 65535)) != S.u(bArr, 0, i11, 65535)) {
            throw z.a("CRC check failed", null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0060  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    public static int b(byte[] bArr) {
        int i10;
        byte b10;
        int i11;
        int i12;
        byte b11;
        boolean z10 = false;
        byte b12 = bArr[0];
        if (b12 != -2) {
            if (b12 == -1) {
                i12 = ((bArr[7] & 3) << 12) | ((bArr[6] & 255) << 4);
                b11 = bArr[9];
            } else if (b12 != 31) {
                i10 = ((bArr[5] & 3) << 12) | ((bArr[6] & 255) << 4);
                b10 = bArr[7];
            } else {
                i12 = ((bArr[6] & 3) << 12) | ((bArr[7] & 255) << 4);
                b11 = bArr[8];
            }
            i11 = (((b11 & 60) >> 2) | i12) + 1;
            z10 = true;
            if (z10) {
                return (i11 * 16) / 14;
            }
            return i11;
        }
        i10 = ((bArr[4] & 3) << 12) | ((bArr[7] & 255) << 4);
        b10 = bArr[6];
        i11 = (((b10 & 240) >> 4) | i10) + 1;
        if (z10) {
            return (i11 * 16) / 14;
        }
        return i11;
    }

    public static int c(int i10) {
        if (i10 == 2147385345 || i10 == -25230976 || i10 == 536864768 || i10 == -14745368) {
            return 1;
        }
        if (i10 == 1683496997 || i10 == 622876772) {
            return 2;
        }
        if (i10 == 1078008818 || i10 == -233094848) {
            return 3;
        }
        return (i10 == 1908687592 || i10 == -398277519) ? 4 : 0;
    }

    private static E d(byte[] bArr) {
        byte b10 = bArr[0];
        if (b10 == 127 || b10 == 100 || b10 == 64 || b10 == 113) {
            return new E(bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        if (e(bArrCopyOf)) {
            for (int i10 = 0; i10 < bArrCopyOf.length - 1; i10 += 2) {
                byte b11 = bArrCopyOf[i10];
                int i11 = i10 + 1;
                bArrCopyOf[i10] = bArrCopyOf[i11];
                bArrCopyOf[i11] = b11;
            }
        }
        E e10 = new E(bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            E e11 = new E(bArrCopyOf);
            while (e11.b() >= 16) {
                e11.r(2);
                e10.f(e11.h(14), 14);
            }
        }
        e10.n(bArrCopyOf);
        return e10;
    }

    private static boolean e(byte[] bArr) {
        byte b10 = bArr[0];
        return b10 == -2 || b10 == -1 || b10 == 37 || b10 == -14 || b10 == -24;
    }

    public static int f(ByteBuffer byteBuffer) {
        int i10;
        byte b10;
        int i11;
        byte b11;
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int iPosition = byteBuffer.position();
        byte b12 = byteBuffer.get(iPosition);
        if (b12 != -2) {
            if (b12 == -1) {
                i10 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                b11 = byteBuffer.get(iPosition + 7);
            } else if (b12 != 31) {
                i10 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                b10 = byteBuffer.get(iPosition + 5);
            } else {
                i10 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                b11 = byteBuffer.get(iPosition + 6);
            }
            i11 = b11 & 60;
            return (((i11 >> 2) | i10) + 1) * 32;
        }
        i10 = (byteBuffer.get(iPosition + 5) & 1) << 6;
        b10 = byteBuffer.get(iPosition + 4);
        i11 = b10 & 252;
        return (((i11 >> 2) | i10) + 1) * 32;
    }

    public static int g(byte[] bArr) {
        int i10;
        byte b10;
        int i11;
        byte b11;
        byte b12 = bArr[0];
        if (b12 != -2) {
            if (b12 == -1) {
                i10 = (bArr[4] & 7) << 4;
                b11 = bArr[7];
            } else if (b12 != 31) {
                i10 = (bArr[4] & 1) << 6;
                b10 = bArr[5];
            } else {
                i10 = (bArr[5] & 7) << 4;
                b11 = bArr[6];
            }
            i11 = b11 & 60;
            return (((i11 >> 2) | i10) + 1) * 32;
        }
        i10 = (bArr[5] & 1) << 6;
        b10 = bArr[4];
        i11 = b10 & 252;
        return (((i11 >> 2) | i10) + 1) * 32;
    }

    public static r h(byte[] bArr, String str, String str2, int i10, String str3, n nVar) {
        E eD = d(bArr);
        eD.r(60);
        int i11 = f56129a[eD.h(6)];
        int i12 = f56130b[eD.h(4)];
        int iH = eD.h(5);
        int[] iArr = f56131c;
        int i13 = iH >= iArr.length ? -1 : (iArr[iH] * 1000) / 2;
        eD.r(10);
        return new r.b().j0(str).W(str3).y0("audio/vnd.dts").S(i13).T(i11 + (eD.h(2) > 0 ? 1 : 0)).z0(i12).c0(nVar).n0(str2).w0(i10).P();
    }

    public static b i(byte[] bArr) throws z {
        int i10;
        int i11;
        int iH;
        int i12;
        long jA1;
        int i13;
        E eD = d(bArr);
        eD.r(40);
        int iH2 = eD.h(2);
        if (eD.g()) {
            i10 = 20;
            i11 = 12;
        } else {
            i10 = 16;
            i11 = 8;
        }
        eD.r(i11);
        int iH3 = eD.h(i10) + 1;
        boolean zG = eD.g();
        int iH4 = -1;
        int i14 = 0;
        if (zG) {
            iH = eD.h(2);
            int iH5 = (eD.h(3) + 1) * 512;
            if (eD.g()) {
                eD.r(36);
            }
            int iH6 = eD.h(3) + 1;
            int iH7 = eD.h(3) + 1;
            if (iH6 != 1 || iH7 != 1) {
                throw z.d("Multiple audio presentations or assets not supported");
            }
            int i15 = iH2 + 1;
            int iH8 = eD.h(i15);
            for (int i16 = 0; i16 < i15; i16++) {
                if (((iH8 >> i16) & 1) == 1) {
                    eD.r(8);
                }
            }
            if (eD.g()) {
                eD.r(2);
                int iH9 = (eD.h(2) + 1) << 2;
                int iH10 = eD.h(2) + 1;
                while (i14 < iH10) {
                    eD.r(iH9);
                    i14++;
                }
            }
            i14 = iH5;
        } else {
            iH = -1;
        }
        eD.r(i10);
        eD.r(12);
        if (zG) {
            if (eD.g()) {
                eD.r(4);
            }
            if (eD.g()) {
                eD.r(24);
            }
            if (eD.g()) {
                eD.s(eD.h(10) + 1);
            }
            eD.r(5);
            i12 = f56132d[eD.h(4)];
            iH4 = eD.h(8) + 1;
        } else {
            i12 = -2147483647;
        }
        int i17 = i12;
        if (zG) {
            if (iH == 0) {
                i13 = 32000;
            } else if (iH == 1) {
                i13 = 44100;
            } else {
                if (iH != 2) {
                    throw z.a("Unsupported reference clock code in DTS HD header: " + iH, null);
                }
                i13 = 48000;
            }
            jA1 = S.a1(i14, 1000000L, i13);
        } else {
            jA1 = -9223372036854775807L;
        }
        return new b("audio/vnd.dts.hd;profile=lbr", iH4, i17, iH3, jA1, 0, null);
    }

    public static int j(byte[] bArr) {
        E eD = d(bArr);
        eD.r(42);
        return eD.h(eD.g() ? 12 : 8) + 1;
    }

    public static b k(byte[] bArr, AtomicInteger atomicInteger) throws z {
        int iH;
        long jA1;
        AtomicInteger atomicInteger2;
        int i10;
        int i11;
        E eD = d(bArr);
        int i12 = eD.h(32) == 1078008818 ? 1 : 0;
        int iM = m(eD, f56133e, true) + 1;
        if (i12 == 0) {
            iH = -2147483647;
            jA1 = -9223372036854775807L;
        } else {
            if (!eD.g()) {
                throw z.d("Only supports full channel mask-based audio presentation");
            }
            a(bArr, iM);
            int iH2 = eD.h(2);
            if (iH2 == 0) {
                i10 = 512;
            } else if (iH2 == 1) {
                i10 = 480;
            } else {
                if (iH2 != 2) {
                    throw z.a("Unsupported base duration index in DTS UHD header: " + iH2, null);
                }
                i10 = 384;
            }
            int iH3 = i10 * (eD.h(3) + 1);
            int iH4 = eD.h(2);
            if (iH4 == 0) {
                i11 = 32000;
            } else if (iH4 == 1) {
                i11 = 44100;
            } else {
                if (iH4 != 2) {
                    throw z.a("Unsupported clock rate index in DTS UHD header: " + iH4, null);
                }
                i11 = 48000;
            }
            if (eD.g()) {
                eD.r(36);
            }
            iH = (1 << eD.h(2)) * i11;
            jA1 = S.a1(iH3, 1000000L, i11);
        }
        int i13 = iH;
        long j10 = jA1;
        int iM2 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            iM2 += m(eD, f56134f, true);
        }
        if (i12 != 0) {
            atomicInteger2 = atomicInteger;
            atomicInteger2.set(m(eD, f56135g, true));
        } else {
            atomicInteger2 = atomicInteger;
        }
        return new b("audio/vnd.dts.uhd;profile=p2", 2, i13, iM + iM2 + (atomicInteger2.get() != 0 ? m(eD, f56136h, true) : 0), j10, 0, null);
    }

    public static int l(byte[] bArr) {
        E eD = d(bArr);
        eD.r(32);
        return m(eD, f56137i, true) + 1;
    }

    private static int m(E e10, int[] iArr, boolean z10) {
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < 3 && e10.g(); i12++) {
            i11++;
        }
        if (z10) {
            int i13 = 0;
            while (i10 < i11) {
                i13 += 1 << iArr[i10];
                i10++;
            }
            i10 = i13;
        }
        return i10 + e10.h(iArr[i11]);
    }
}

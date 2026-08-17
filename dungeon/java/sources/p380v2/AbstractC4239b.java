package p380v2;

import R1.n;
import R1.r;
import U1.E;
import U1.F;
import U1.S;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: v2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4239b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f56023a = {1, 2, 3, 6};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f56024b = {48000, 44100, 32000};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f56025c = {24000, 22050, 16000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f56026d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f56027e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f56028f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX INFO: renamed from: v2.b$b, reason: collision with other inner class name */
    public static final class C0710b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f56029a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f56030b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f56031c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f56032d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f56033e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f56034f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f56035g;

        private C0710b(String str, int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f56029a = str;
            this.f56030b = i10;
            this.f56032d = i11;
            this.f56031c = i12;
            this.f56033e = i13;
            this.f56034f = i14;
            this.f56035g = i15;
        }

        /* synthetic */ C0710b(String str, int i10, int i11, int i12, int i13, int i14, int i15, a aVar) {
            this(str, i10, i11, i12, i13, i14, i15);
        }
    }

    private static int a(int i10, int i11, int i12) {
        return (i10 * i11) / (i12 * 32);
    }

    public static int b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit() - 10;
        for (int i10 = iPosition; i10 <= iLimit; i10++) {
            if ((S.P(byteBuffer, i10 + 4) & (-2)) == -126718022) {
                return i10 - iPosition;
            }
        }
        return -1;
    }

    private static int c(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 < 0) {
            return -1;
        }
        int[] iArr = f56024b;
        if (i10 >= iArr.length || i11 < 0) {
            return -1;
        }
        int[] iArr2 = f56028f;
        if (i12 >= iArr2.length) {
            return -1;
        }
        int i13 = iArr[i10];
        if (i13 == 44100) {
            return (iArr2[i12] + (i11 % 2)) * 2;
        }
        int i14 = f56027e[i12];
        return i13 == 32000 ? i14 * 6 : i14 * 4;
    }

    public static r d(F f10, String str, String str2, n nVar) {
        E e10 = new E();
        e10.m(f10);
        int i10 = f56024b[e10.h(2)];
        e10.r(8);
        int i11 = f56026d[e10.h(3)];
        if (e10.h(1) != 0) {
            i11++;
        }
        int i12 = f56027e[e10.h(5)] * 1000;
        e10.c();
        f10.a0(e10.d());
        return new r.b().j0(str).y0("audio/ac3").T(i11).z0(i10).c0(nVar).n0(str2).S(i12).t0(i12).P();
    }

    public static int e(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f56023a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static C0710b f(E e10) {
        int iC;
        int i10;
        int i11;
        int i12;
        String str;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int iE = e10.e();
        e10.r(40);
        boolean z10 = e10.h(5) > 10;
        e10.p(iE);
        int i19 = -1;
        if (z10) {
            e10.r(16);
            int iH = e10.h(2);
            if (iH == 0) {
                i19 = 0;
            } else if (iH == 1) {
                i19 = 1;
            } else if (iH == 2) {
                i19 = 2;
            }
            e10.r(3);
            iC = (e10.h(11) + 1) * 2;
            int iH2 = e10.h(2);
            if (iH2 == 3) {
                i10 = f56025c[e10.h(2)];
                i14 = 3;
                i15 = 6;
            } else {
                int iH3 = e10.h(2);
                int i20 = f56023a[iH3];
                i14 = iH3;
                i10 = f56024b[iH2];
                i15 = i20;
            }
            i12 = i15 * 256;
            int iA = a(iC, i10, i15);
            int iH4 = e10.h(3);
            boolean zG = e10.g();
            i11 = f56026d[iH4] + (zG ? 1 : 0);
            e10.r(10);
            if (e10.g()) {
                e10.r(8);
            }
            if (iH4 == 0) {
                e10.r(5);
                if (e10.g()) {
                    e10.r(8);
                }
            }
            if (i19 == 1 && e10.g()) {
                e10.r(16);
            }
            if (e10.g()) {
                if (iH4 > 2) {
                    e10.r(2);
                }
                if ((iH4 & 1) == 0 || iH4 <= 2) {
                    i17 = 6;
                } else {
                    i17 = 6;
                    e10.r(6);
                }
                if ((iH4 & 4) != 0) {
                    e10.r(i17);
                }
                if (zG && e10.g()) {
                    e10.r(5);
                }
                if (i19 == 0) {
                    if (e10.g()) {
                        i18 = 6;
                        e10.r(6);
                    } else {
                        i18 = 6;
                    }
                    if (iH4 == 0 && e10.g()) {
                        e10.r(i18);
                    }
                    if (e10.g()) {
                        e10.r(i18);
                    }
                    int iH5 = e10.h(2);
                    if (iH5 == 1) {
                        e10.r(5);
                    } else if (iH5 == 2) {
                        e10.r(12);
                    } else if (iH5 == 3) {
                        int iH6 = e10.h(5);
                        if (e10.g()) {
                            e10.r(5);
                            if (e10.g()) {
                                e10.r(4);
                            }
                            if (e10.g()) {
                                e10.r(4);
                            }
                            if (e10.g()) {
                                e10.r(4);
                            }
                            if (e10.g()) {
                                e10.r(4);
                            }
                            if (e10.g()) {
                                e10.r(4);
                            }
                            if (e10.g()) {
                                e10.r(4);
                            }
                            if (e10.g()) {
                                e10.r(4);
                            }
                            if (e10.g()) {
                                if (e10.g()) {
                                    e10.r(4);
                                }
                                if (e10.g()) {
                                    e10.r(4);
                                }
                            }
                        }
                        if (e10.g()) {
                            e10.r(5);
                            if (e10.g()) {
                                e10.r(7);
                                if (e10.g()) {
                                    e10.r(8);
                                }
                            }
                        }
                        e10.r((iH6 + 2) * 8);
                        e10.c();
                    }
                    if (iH4 < 2) {
                        if (e10.g()) {
                            e10.r(14);
                        }
                        if (iH4 == 0 && e10.g()) {
                            e10.r(14);
                        }
                    }
                    if (e10.g()) {
                        if (i14 == 0) {
                            e10.r(5);
                        } else {
                            for (int i21 = 0; i21 < i15; i21++) {
                                if (e10.g()) {
                                    e10.r(5);
                                }
                            }
                        }
                    }
                }
            }
            if (e10.g()) {
                e10.r(5);
                if (iH4 == 2) {
                    e10.r(4);
                }
                if (iH4 >= 6) {
                    e10.r(2);
                }
                if (e10.g()) {
                    e10.r(8);
                }
                if (iH4 == 0 && e10.g()) {
                    e10.r(8);
                }
                if (iH2 < 3) {
                    e10.q();
                }
            }
            if (i19 == 0 && i14 != 3) {
                e10.q();
            }
            if (i19 == 2 && (i14 == 3 || e10.g())) {
                i16 = 6;
                e10.r(6);
            } else {
                i16 = 6;
            }
            str = (e10.g() && e10.h(i16) == 1 && e10.h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i13 = iA;
        } else {
            e10.r(32);
            int iH7 = e10.h(2);
            String str2 = iH7 == 3 ? null : "audio/ac3";
            int iH8 = e10.h(6);
            int i22 = f56027e[iH8 / 2] * 1000;
            iC = c(iH7, iH8);
            e10.r(8);
            int iH9 = e10.h(3);
            if ((iH9 & 1) != 0 && iH9 != 1) {
                e10.r(2);
            }
            if ((iH9 & 4) != 0) {
                e10.r(2);
            }
            if (iH9 == 2) {
                e10.r(2);
            }
            int[] iArr = f56024b;
            i10 = iH7 < iArr.length ? iArr[iH7] : -1;
            i11 = f56026d[iH9] + (e10.g() ? 1 : 0);
            i12 = 1536;
            str = str2;
            i13 = i22;
        }
        return new C0710b(str, i19, i11, i10, iC, i12, i13, null);
    }

    public static int g(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b10 = bArr[4];
        return c((b10 & 192) >> 6, b10 & 63);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    public static r h(F f10, String str, String str2, n nVar) {
        String str3;
        E e10 = new E();
        e10.m(f10);
        int iH = e10.h(13) * 1000;
        e10.r(3);
        int i10 = f56024b[e10.h(2)];
        e10.r(10);
        int i11 = f56026d[e10.h(3)];
        if (e10.h(1) != 0) {
            i11++;
        }
        e10.r(3);
        int iH2 = e10.h(4);
        e10.r(1);
        if (iH2 > 0) {
            e10.r(6);
            if (e10.h(1) != 0) {
                i11 += 2;
            }
            e10.r(1);
        }
        if (e10.b() > 7) {
            e10.r(7);
            if (e10.h(1) != 0) {
                str3 = "audio/eac3-joc";
            } else {
                str3 = "audio/eac3";
            }
        } else {
            str3 = "audio/eac3";
        }
        e10.c();
        f10.a0(e10.d());
        return new r.b().j0(str).y0(str3).T(i11).z0(i10).c0(nVar).n0(str2).t0(iH).P();
    }

    public static int i(ByteBuffer byteBuffer, int i10) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i10) + ((byteBuffer.get((byteBuffer.position() + i10) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    public static int j(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b10 = bArr[7];
            if ((b10 & 254) == 186) {
                return 40 << ((bArr[(b10 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }
}

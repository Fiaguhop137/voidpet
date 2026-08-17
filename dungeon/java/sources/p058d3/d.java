package p058d3;

import R1.z;
import U1.AbstractC1459a;
import U1.AbstractC1477t;
import U1.F;
import U1.S;
import android.util.Pair;
import java.util.Arrays;
import p380v2.InterfaceC4254q;

/* JADX INFO: loaded from: classes.dex */
abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f39770a = {0, 0, 0, 0, 16, 0, -128, 0, 0, -86, 0, 56, -101, 113};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f39771b = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f39772a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f39773b;

        private a(int i10, long j10) {
            this.f39772a = i10;
            this.f39773b = j10;
        }

        public static a a(InterfaceC4254q interfaceC4254q, F f10) {
            interfaceC4254q.o(f10.f(), 0, 8);
            f10.a0(0);
            return new a(f10.u(), f10.B());
        }
    }

    public static boolean a(InterfaceC4254q interfaceC4254q) {
        F f10 = new F(8);
        int i10 = a.a(interfaceC4254q, f10).f39772a;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        interfaceC4254q.o(f10.f(), 0, 4);
        f10.a0(0);
        int iU = f10.u();
        if (iU == 1463899717) {
            return true;
        }
        AbstractC1477t.c("WavHeaderReader", "Unsupported form type: " + iU);
        return false;
    }

    public static c b(InterfaceC4254q interfaceC4254q) throws z {
        byte[] bArr;
        F f10 = new F(16);
        a aVarD = d(1718449184, interfaceC4254q, f10);
        AbstractC1459a.g(aVarD.f39773b >= 16);
        interfaceC4254q.o(f10.f(), 0, 16);
        f10.a0(0);
        int iD = f10.D();
        int iD2 = f10.D();
        int iC = f10.C();
        int iC2 = f10.C();
        int iD3 = f10.D();
        int iD4 = f10.D();
        int i10 = ((int) aVarD.f39773b) - 16;
        if (i10 > 0) {
            bArr = new byte[i10];
            interfaceC4254q.o(bArr, 0, i10);
            if (iD == 65534 && i10 == 24) {
                F f11 = new F(bArr);
                f11.D();
                int iD5 = f11.D();
                if (iD5 != 0 && iD5 != iD4) {
                    throw z.d("validBits ( " + iD5 + ")  != bitsPerSample( " + iD4 + ") are not supported");
                }
                int iC3 = f11.C();
                if ((iC3 >> 18) != 0) {
                    throw z.d("invalid channel mask " + iC3);
                }
                if (iC3 != 0 && Integer.bitCount(iC3) != iD2) {
                    throw z.d("invalid number of channels (" + Integer.bitCount(iC3) + ") in channel mask " + iC3);
                }
                iD = f11.D();
                byte[] bArr2 = new byte[14];
                f11.q(bArr2, 0, 14);
                if (!Arrays.equals(bArr2, f39770a) && !Arrays.equals(bArr2, f39771b)) {
                    throw z.d("invalid wav format extension guid");
                }
            }
        } else {
            bArr = S.f12881f;
        }
        byte[] bArr3 = bArr;
        int i11 = iD;
        interfaceC4254q.l((int) (interfaceC4254q.h() - interfaceC4254q.getPosition()));
        return new c(i11, iD2, iC, iC2, iD3, iD4, bArr3);
    }

    public static long c(InterfaceC4254q interfaceC4254q) {
        F f10 = new F(8);
        a aVarA = a.a(interfaceC4254q, f10);
        if (aVarA.f39772a != 1685272116) {
            interfaceC4254q.d();
            return -1L;
        }
        interfaceC4254q.i(8);
        f10.a0(0);
        interfaceC4254q.o(f10.f(), 0, 8);
        long jZ = f10.z();
        interfaceC4254q.l(((int) aVarA.f39773b) + 8);
        return jZ;
    }

    private static a d(int i10, InterfaceC4254q interfaceC4254q, F f10) throws z {
        a aVarA = a.a(interfaceC4254q, f10);
        while (aVarA.f39772a != i10) {
            AbstractC1477t.h("WavHeaderReader", "Ignoring unknown WAV chunk: " + aVarA.f39772a);
            long j10 = aVarA.f39773b;
            long j11 = 8 + j10;
            if (j10 % 2 != 0) {
                j11 = 9 + j10;
            }
            if (j11 > 2147483647L) {
                throw z.d("Chunk is too large (~2GB+) to skip; id: " + aVarA.f39772a);
            }
            interfaceC4254q.l((int) j11);
            aVarA = a.a(interfaceC4254q, f10);
        }
        return aVarA;
    }

    public static Pair e(InterfaceC4254q interfaceC4254q) throws z {
        interfaceC4254q.d();
        a aVarD = d(1684108385, interfaceC4254q, new F(8));
        interfaceC4254q.l(8);
        return Pair.create(Long.valueOf(interfaceC4254q.getPosition()), Long.valueOf(aVarD.f39773b));
    }
}

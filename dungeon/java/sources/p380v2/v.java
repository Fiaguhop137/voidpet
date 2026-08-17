package p380v2;

import R1.z;
import U1.F;
import U1.S;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f56146a;
    }

    private static boolean a(F f10, y yVar, int i10) {
        int iJ = j(f10, i10);
        return iJ != -1 && iJ <= yVar.f56151b;
    }

    private static boolean b(F f10, int i10) {
        return f10.L() == S.x(f10.f(), i10, f10.g() - 1, 0);
    }

    private static boolean c(F f10, y yVar, boolean z10, a aVar) {
        try {
            long jU = f10.U();
            if (!z10) {
                jU *= (long) yVar.f56151b;
            }
            aVar.f56146a = jU;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean d(F f10, y yVar, int i10, a aVar) {
        int iG = f10.g();
        long jN = f10.N();
        long j10 = jN >>> 16;
        if (j10 != i10) {
            return false;
        }
        return g((int) ((jN >> 4) & 15), yVar) && f((int) ((jN >> 1) & 7), yVar) && !(((jN & 1) > 1L ? 1 : ((jN & 1) == 1L ? 0 : -1)) == 0) && c(f10, yVar, ((j10 & 1) > 1L ? 1 : ((j10 & 1) == 1L ? 0 : -1)) == 0, aVar) && a(f10, yVar, (int) ((jN >> 12) & 15)) && e(f10, yVar, (int) ((jN >> 8) & 15)) && b(f10, iG);
    }

    private static boolean e(F f10, y yVar, int i10) {
        int i11 = yVar.f56154e;
        if (i10 == 0) {
            return true;
        }
        if (i10 <= 11) {
            return i10 == yVar.f56155f;
        }
        if (i10 == 12) {
            return f10.L() * 1000 == i11;
        }
        if (i10 <= 14) {
            int iT = f10.T();
            if (i10 == 14) {
                iT *= 10;
            }
            if (iT == i11) {
                return true;
            }
        }
        return false;
    }

    private static boolean f(int i10, y yVar) {
        return i10 == 0 || i10 == yVar.f56158i;
    }

    private static boolean g(int i10, y yVar) {
        if (i10 <= 7) {
            return i10 == yVar.f56156g - 1;
        }
        return i10 <= 10 && yVar.f56156g == 2;
    }

    public static boolean h(InterfaceC4254q interfaceC4254q, y yVar, int i10, a aVar) {
        long jH = interfaceC4254q.h();
        byte[] bArr = new byte[2];
        interfaceC4254q.o(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
            interfaceC4254q.d();
            interfaceC4254q.i((int) (jH - interfaceC4254q.getPosition()));
            return false;
        }
        F f10 = new F(16);
        System.arraycopy(bArr, 0, f10.f(), 0, 2);
        f10.Z(AbstractC4255s.d(interfaceC4254q, f10.f(), 2, 14));
        interfaceC4254q.d();
        interfaceC4254q.i((int) (jH - interfaceC4254q.getPosition()));
        return d(f10, yVar, i10, aVar);
    }

    public static long i(InterfaceC4254q interfaceC4254q, y yVar) throws z {
        interfaceC4254q.d();
        interfaceC4254q.i(1);
        byte[] bArr = new byte[1];
        interfaceC4254q.o(bArr, 0, 1);
        boolean z10 = (bArr[0] & 1) == 1;
        interfaceC4254q.i(2);
        int i10 = z10 ? 7 : 6;
        F f10 = new F(i10);
        f10.Z(AbstractC4255s.d(interfaceC4254q, f10.f(), 0, i10));
        interfaceC4254q.d();
        a aVar = new a();
        if (c(f10, yVar, z10, aVar)) {
            return aVar.f56146a;
        }
        throw z.a(null, null);
    }

    public static int j(F f10, int i10) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return f10.L() + 1;
            case 7:
                return f10.T() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }
}

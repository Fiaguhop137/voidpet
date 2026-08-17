package p380v2;

import R1.z;
import java.io.EOFException;

/* JADX INFO: renamed from: v2.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4255s {
    public static void a(boolean z10, String str) throws z {
        if (!z10) {
            throw z.a(str, null);
        }
    }

    public static int b(int i10) {
        if (i10 == 20) {
            return 63750;
        }
        if (i10 == 30) {
            return 2250000;
        }
        switch (i10) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i10) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }

    public static boolean c(InterfaceC4254q interfaceC4254q, byte[] bArr, int i10, int i11, boolean z10) throws EOFException {
        try {
            return interfaceC4254q.c(bArr, i10, i11, z10);
        } catch (EOFException e10) {
            if (z10) {
                return false;
            }
            throw e10;
        }
    }

    public static int d(InterfaceC4254q interfaceC4254q, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        while (i12 < i11) {
            int iK = interfaceC4254q.k(bArr, i10 + i12, i11 - i12);
            if (iK == -1) {
                break;
            }
            i12 += iK;
        }
        return i12;
    }

    public static boolean e(InterfaceC4254q interfaceC4254q, byte[] bArr, int i10, int i11) {
        try {
            interfaceC4254q.readFully(bArr, i10, i11);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean f(InterfaceC4254q interfaceC4254q, int i10) {
        try {
            interfaceC4254q.l(i10);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}

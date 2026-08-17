package P2;

import U1.F;
import p380v2.InterfaceC4254q;
import p380v2.N;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f8759a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    private static boolean a(int i10, boolean z10) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        if (i10 == 1751476579 && z10) {
            return true;
        }
        for (int i11 : f8759a) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static N b(InterfaceC4254q interfaceC4254q) {
        return c(interfaceC4254q, true, false);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007b  */
    /* JADX WARN: Code duplicated, block: B:78:0x012f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0132  */
    /* JADX WARN: Code duplicated, block: B:82:0x0136 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x0138  */
    /* JADX WARN: Code duplicated, block: B:85:0x013b  */
    /* JADX WARN: Code duplicated, block: B:87:0x013e A[RETURN] */
    private static N c(InterfaceC4254q interfaceC4254q, boolean z10, boolean z11) {
        N n10;
        int i10;
        int i11;
        int i12;
        int[] iArr;
        long length = interfaceC4254q.getLength();
        long j10 = -1;
        long j11 = 4096;
        if (length != -1 && length <= 4096) {
            j11 = length;
        }
        int i13 = (int) j11;
        F f10 = new F(64);
        int i14 = 0;
        int i15 = 0;
        boolean z12 = false;
        while (true) {
            if (i15 < i13) {
                f10.W(8);
                boolean z13 = true;
                if (interfaceC4254q.c(f10.f(), i14, 8, true)) {
                    long jN = f10.N();
                    int iU = f10.u();
                    if (jN == 1) {
                        j10 = j10;
                        interfaceC4254q.o(f10.f(), 8, 8);
                        i11 = 16;
                        f10.Z(16);
                        jN = f10.E();
                        i15 = i15;
                    } else {
                        j10 = j10;
                        if (jN == 0) {
                            long length2 = interfaceC4254q.getLength();
                            if (length2 != j10) {
                                jN = (length2 - interfaceC4254q.h()) + ((long) 8);
                            }
                        }
                        i11 = 8;
                    }
                    long j12 = jN;
                    long j13 = i11;
                    if (j12 < j13) {
                        return new a(iU, j12, i11);
                    }
                    int i16 = i15 + i11;
                    n10 = null;
                    if (iU == 1836019574) {
                        i13 += (int) j12;
                        if (length != -1 && i13 > length) {
                            i13 = (int) length;
                        }
                        i15 = i16;
                        i14 = 0;
                    } else if (iU == 1836019558 || iU == 1836475768) {
                        i10 = 1;
                    } else {
                        if (iU == 1835295092) {
                            z12 = true;
                        }
                        long j14 = length;
                        if ((((long) i16) + j12) - j13 >= i13) {
                            i10 = 0;
                        } else {
                            int i17 = (int) (j12 - j13);
                            i15 = i16 + i17;
                            if (iU != 1718909296) {
                                i12 = 0;
                                if (i17 != 0) {
                                    interfaceC4254q.i(i17);
                                }
                            } else {
                                if (i17 < 8) {
                                    return new a(iU, i17, 8);
                                }
                                f10.W(i17);
                                i12 = 0;
                                interfaceC4254q.o(f10.f(), 0, i17);
                                int iU2 = f10.u();
                                if (a(iU2, z11)) {
                                    z12 = true;
                                }
                                f10.b0(4);
                                int iA = f10.a() / 4;
                                if (!z12 && iA > 0) {
                                    iArr = new int[iA];
                                    int i18 = 0;
                                    while (true) {
                                        if (i18 >= iA) {
                                            z13 = z12;
                                            break;
                                        }
                                        int iU3 = f10.u();
                                        iArr[i18] = iU3;
                                        if (a(iU3, z11)) {
                                            break;
                                        }
                                        i18++;
                                    }
                                } else {
                                    z13 = z12;
                                    iArr = null;
                                }
                                if (!z13) {
                                    return new x(iU2, iArr);
                                }
                                z12 = z13;
                            }
                            i14 = i12;
                            length = j14;
                        }
                    }
                }
                if (!z12) {
                    return o.f8746a;
                }
                if (z10 != i10) {
                    return i10 != 0 ? i.f8705b : i.f8706c;
                }
                return n10;
            }
            n10 = null;
            i10 = i14;
            if (!z12) {
                return o.f8746a;
            }
            if (z10 != i10) {
                if (i10 != 0) {
                }
            }
            return n10;
        }
    }

    public static N d(InterfaceC4254q interfaceC4254q, boolean z10) {
        return c(interfaceC4254q, false, z10);
    }
}

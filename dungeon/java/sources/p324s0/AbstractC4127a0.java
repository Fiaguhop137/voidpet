package p324s0;

/* JADX INFO: renamed from: s0.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4127a0 {
    private static final void b(C4159y c4159y, InterfaceC4152q interfaceC4152q) {
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < c4159y.c()) {
            int i13 = i10 + 2;
            int iB = c4159y.b(i10) - c4159y.b(i13);
            int iB2 = c4159y.b(i10 + 1) - c4159y.b(i13);
            int iB3 = c4159y.b(i13);
            i10 += 3;
            while (i11 < iB) {
                interfaceC4152q.b(i12, i11);
                i11++;
            }
            while (i12 < iB2) {
                interfaceC4152q.c(i12);
                i12++;
            }
            while (true) {
                int i14 = iB3 - 1;
                if (iB3 > 0) {
                    interfaceC4152q.d(i11, i12);
                    i11++;
                    i12++;
                    iB3 = i14;
                }
            }
        }
    }

    private static final boolean c(int i10, int i11, int i12, int i13, InterfaceC4152q interfaceC4152q, int[] iArr, int[] iArr2, int i14, int[] iArr3) {
        int iB;
        int i15;
        int i16;
        int i17 = (i11 - i10) - (i13 - i12);
        boolean z10 = (i17 & 1) == 0;
        int i18 = -i14;
        for (int i19 = i18; i19 <= i14; i19 += 2) {
            if (i19 == i18 || (i19 != i14 && AbstractC4136f.b(iArr2, i19 + 1) < AbstractC4136f.b(iArr2, i19 - 1))) {
                iB = AbstractC4136f.b(iArr2, i19 + 1);
                i15 = iB;
            } else {
                iB = AbstractC4136f.b(iArr2, i19 - 1);
                i15 = iB - 1;
            }
            int i20 = i13 - ((i11 - i15) - i19);
            int i21 = ((i14 != 0 ? 1 : 0) & (i15 == iB ? 1 : 0)) + i20;
            while (true) {
                if (i15 <= i10 || i20 <= i12) {
                    break;
                }
                if (!interfaceC4152q.a(i15 - 1, i20 - 1)) {
                    break;
                }
                i15--;
                i20--;
            }
            AbstractC4136f.d(iArr2, i19, i15);
            if (z10 && (i16 = i17 - i19) >= i18 && i16 <= i14) {
                if (AbstractC4136f.b(iArr, i16) >= i15) {
                    f(i15, i20, iB, i21, true, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    private static final C4159y d(int i10, int i11, InterfaceC4152q interfaceC4152q) {
        char c10 = 1;
        int i12 = ((i10 + i11) + 1) / 2;
        C4159y c4159y = new C4159y(i12 * 3);
        C4159y c4159y2 = new C4159y(i12 * 4);
        c4159y2.h(0, i10, 0, i11);
        int i13 = (i12 * 2) + 1;
        int[] iArrA = AbstractC4136f.a(new int[i13]);
        int[] iArrA2 = AbstractC4136f.a(new int[i13]);
        int[] iArrB = A0.b(new int[5]);
        while (c4159y2.d()) {
            int iF = c4159y2.f();
            int iF2 = c4159y2.f();
            int iF3 = c4159y2.f();
            int iF4 = c4159y2.f();
            iArrB = iArrB;
            if (h(iF4, iF3, iF2, iF, interfaceC4152q, iArrA, iArrA2, iArrB)) {
                char c11 = c10;
                if (Math.min(iArrB[2] - iArrB[0], iArrB[3] - iArrB[c10]) > 0) {
                    A0.a(iArrB, c4159y);
                }
                c4159y2.h(iF4, iArrB[0], iF2, iArrB[c11]);
                c4159y2.h(iArrB[2], iF3, iArrB[3], iF);
                c10 = c11;
            }
        }
        c4159y.k();
        c4159y.g(i10, i11, 0);
        return c4159y;
    }

    public static final void e(int i10, int i11, InterfaceC4152q interfaceC4152q) {
        b(d(i10, i11, interfaceC4152q), interfaceC4152q);
    }

    public static final void f(int i10, int i11, int i12, int i13, boolean z10, int[] iArr) {
        if (iArr.length < 5) {
            return;
        }
        iArr[0] = i10;
        iArr[1] = i11;
        iArr[2] = i12;
        iArr[3] = i13;
        iArr[4] = z10 ? 1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean g(int i10, int i11, int i12, int i13, InterfaceC4152q interfaceC4152q, int[] iArr, int[] iArr2, int i14, int[] iArr3) {
        int iB;
        int i15;
        boolean z10;
        int i16 = (i11 - i10) - (i13 - i12);
        boolean z11 = true;
        boolean z12 = (Math.abs(i16) & 1) == 1;
        int i17 = -i14;
        int i18 = i17;
        while (i18 <= i14) {
            if (i18 == i17 || (i18 != i14 && AbstractC4136f.b(iArr, i18 + 1) > AbstractC4136f.b(iArr, i18 - 1))) {
                iB = AbstractC4136f.b(iArr, i18 + 1);
                i15 = iB;
            } else {
                iB = AbstractC4136f.b(iArr, i18 - 1);
                i15 = iB + 1;
            }
            int i19 = (i12 + (i15 - i10)) - i18;
            int i20 = i19 - ((i14 != 0 ? z11 : 0) & (i15 == iB ? z11 : 0));
            while (true) {
                if (i15 < i11 && i19 < i13) {
                    if (!interfaceC4152q.a(i15, i19)) {
                        break;
                    }
                    i15++;
                    i19++;
                } else {
                    break;
                }
            }
            AbstractC4136f.d(iArr, i18, i15);
            if (z12) {
                int i21 = i16 - i18;
                z10 = z11;
                if (i21 >= i17 + 1 && i21 <= i14 - 1) {
                    if (AbstractC4136f.b(iArr2, i21) <= i15) {
                        f(iB, i20, i15, i19, false, iArr3);
                        return z10;
                    }
                }
                i18 += 2;
                z11 = z10;
            } else {
                z10 = z11;
            }
            i18 += 2;
            z11 = z10;
        }
        return false;
    }

    private static final boolean h(int i10, int i11, int i12, int i13, InterfaceC4152q interfaceC4152q, int[] iArr, int[] iArr2, int[] iArr3) {
        int i14 = i11 - i10;
        int i15 = i13 - i12;
        if (i14 >= 1 && i15 >= 1) {
            int i16 = ((i14 + i15) + 1) / 2;
            int[] iArr4 = iArr;
            AbstractC4136f.d(iArr4, 1, i10);
            int[] iArr5 = iArr2;
            AbstractC4136f.d(iArr5, 1, i11);
            int i17 = 0;
            while (i17 < i16) {
                if (g(i10, i11, i12, i13, interfaceC4152q, iArr4, iArr5, i17, iArr3) || c(i10, i11, i12, i13, interfaceC4152q, iArr, iArr2, i17, iArr3)) {
                    return true;
                }
                i17++;
                iArr4 = iArr;
                iArr5 = iArr2;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(int[] iArr, int i10, int i11) {
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
    }
}

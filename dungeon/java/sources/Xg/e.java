package Xg;

/* JADX INFO: loaded from: classes3.dex */
abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f16541a = {1, 2, 3, 4, 0, 5, 17, 6, 16, 7, 8, 9, 10, 11, 12, 13, 14, 15};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f16542b = {3, 2, 1, 0, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 2};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f16543c = {0, 0, 0, 0, -1, 1, -2, 2, -3, 3, -1, 1, -2, 2, -3, 3};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f16544d = {131072, 131076, 131075, 196610, 131072, 131076, 131075, 262145, 131072, 131076, 131075, 196610, 131072, 131076, 131075, 262149};

    private static void a(k kVar) {
        a aVar = kVar.f16589c;
        byte[] bArr = kVar.f16590d;
        int i10 = kVar.f16593g;
        if (i10 <= 0) {
            a.k(aVar);
            kVar.f16587a = 1;
            return;
        }
        int iMin = Math.min(kVar.f16577Q - kVar.f16604r, i10);
        a.c(aVar, bArr, kVar.f16604r, iMin);
        kVar.f16593g -= iMin;
        int i11 = kVar.f16604r + iMin;
        kVar.f16604r = i11;
        int i12 = kVar.f16577Q;
        if (i11 != i12) {
            a.k(aVar);
            kVar.f16587a = 1;
        } else {
            kVar.f16588b = 5;
            kVar.f16585Y = i12;
            kVar.f16584X = 0;
            kVar.f16587a = 12;
        }
    }

    private static void b(k kVar, int i10) {
        int i11;
        a aVar = kVar.f16589c;
        int[] iArr = kVar.f16602p;
        int i12 = i10 * 2;
        a.d(aVar);
        int i13 = i10 * 1080;
        int iR = r(kVar.f16591e, i13, aVar);
        kVar.f16600n[i10] = m(kVar.f16592f, i13, aVar);
        if (iR == 1) {
            i11 = iArr[i12 + 1] + 1;
        } else {
            i11 = iR == 0 ? iArr[i12] : iR - 2;
        }
        int i14 = kVar.f16601o[i10];
        if (i11 >= i14) {
            i11 -= i14;
        }
        int i15 = i12 + 1;
        iArr[i12] = iArr[i15];
        iArr[i15] = i11;
    }

    private static void c(k kVar) {
        b(kVar, 1);
        kVar.f16566F = kVar.f16598l.f16550c[kVar.f16602p[3]];
    }

    private static int d(int i10, byte[] bArr, a aVar) {
        a.j(aVar);
        int iH = h(aVar) + 1;
        if (iH == 1) {
            m.a(bArr, 0, i10);
            return iH;
        }
        int i11 = a.i(aVar, 1) == 1 ? a.i(aVar, 4) + 1 : 0;
        int[] iArr = new int[1080];
        n(iH + i11, iArr, 0, aVar);
        int i12 = 0;
        while (i12 < i10) {
            a.j(aVar);
            a.d(aVar);
            int iR = r(iArr, 0, aVar);
            if (iR == 0) {
                bArr[i12] = 0;
            } else if (iR <= i11) {
                for (int i13 = (1 << iR) + a.i(aVar, iR); i13 != 0; i13--) {
                    if (i12 >= i10) {
                        throw new c("Corrupted context map");
                    }
                    bArr[i12] = 0;
                    i12++;
                }
            } else {
                bArr[i12] = (byte) (iR - i11);
            }
            i12++;
        }
        if (a.i(aVar, 1) == 1) {
            j(bArr, i10);
        }
        return iH;
    }

    private static void e(k kVar) {
        b(kVar, 2);
        kVar.f16563C = kVar.f16602p[5] << 2;
    }

    private static void f(k kVar) {
        b(kVar, 0);
        int i10 = kVar.f16602p[1];
        int i11 = i10 << 6;
        kVar.f16562B = i11;
        int i12 = kVar.f16561A[i11] & 255;
        kVar.f16608v = i12;
        kVar.f16609w = kVar.f16597k.f16550c[i12];
        byte b10 = kVar.f16612z[i10];
        int[] iArr = d.f16540b;
        kVar.f16564D = iArr[b10];
        kVar.f16565E = iArr[b10 + 1];
    }

    private static void g(a aVar, k kVar) {
        boolean z10 = a.i(aVar, 1) == 1;
        kVar.f16594h = z10;
        kVar.f16593g = 0;
        kVar.f16595i = false;
        kVar.f16596j = false;
        if (!z10 || a.i(aVar, 1) == 0) {
            int i10 = a.i(aVar, 2) + 4;
            if (i10 == 7) {
                kVar.f16596j = true;
                if (a.i(aVar, 1) != 0) {
                    throw new c("Corrupted reserved bit");
                }
                int i11 = a.i(aVar, 2);
                if (i11 == 0) {
                    return;
                }
                for (int i12 = 0; i12 < i11; i12++) {
                    int i13 = a.i(aVar, 8);
                    if (i13 == 0 && i12 + 1 == i11 && i11 > 1) {
                        throw new c("Exuberant nibble");
                    }
                    kVar.f16593g = (i13 << (i12 * 8)) | kVar.f16593g;
                }
            } else {
                for (int i14 = 0; i14 < i10; i14++) {
                    int i15 = a.i(aVar, 4);
                    if (i15 == 0 && i14 + 1 == i10 && i10 > 4) {
                        throw new c("Exuberant nibble");
                    }
                    kVar.f16593g = (i15 << (i14 * 4)) | kVar.f16593g;
                }
            }
            kVar.f16593g++;
            if (kVar.f16594h) {
                return;
            }
            kVar.f16595i = a.i(aVar, 1) == 1;
        }
    }

    private static int h(a aVar) {
        if (a.i(aVar, 1) == 0) {
            return 0;
        }
        int i10 = a.i(aVar, 3);
        if (i10 == 0) {
            return 1;
        }
        return a.i(aVar, i10) + (1 << i10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x0298  */
    /* JADX WARN: Code duplicated, block: B:104:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:107:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:115:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:120:0x0313  */
    /* JADX WARN: Code duplicated, block: B:156:0x031c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x0316 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x0333 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x0333 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x02e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x0304 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:? A[LOOP:2: B:113:0x02e3->B:172:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:? A[LOOP:4: B:50:0x0139->B:176:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x01e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:50:0x0139 A[LOOP:4: B:50:0x0139->B:176:?, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:52:0x013f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0148  */
    /* JADX WARN: Code duplicated, block: B:59:0x0181  */
    /* JADX WARN: Code duplicated, block: B:62:0x0198  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ef A[LOOP:5: B:60:0x0190->B:68:0x01ef, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:75:0x0208  */
    /* JADX WARN: Code duplicated, block: B:76:0x020c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0210  */
    /* JADX WARN: Code duplicated, block: B:80:0x0219  */
    /* JADX WARN: Code duplicated, block: B:83:0x0235  */
    /* JADX WARN: Code duplicated, block: B:84:0x0237  */
    /* JADX WARN: Code duplicated, block: B:87:0x024a  */
    /* JADX WARN: Code duplicated, block: B:90:0x0277  */
    /* JADX WARN: Code duplicated, block: B:92:0x027d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0284  */
    /* JADX WARN: Code duplicated, block: B:98:0x028e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0294  */
    /* JADX WARN: Multi-variable type inference failed */
    static void i(k kVar) {
        int i10;
        int i11;
        int i12;
        char c10;
        int iR;
        int i13;
        int i14;
        int iT;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int iR2;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28 = kVar.f16587a;
        if (i28 == 0) {
            throw new IllegalStateException("Can't decompress until initialized");
        }
        if (i28 == 11) {
            throw new IllegalStateException("Can't decompress after close");
        }
        a aVar = kVar.f16589c;
        int i29 = 1;
        int i30 = kVar.f16577Q - 1;
        byte[] bArr = kVar.f16590d;
        while (true) {
            int i31 = kVar.f16587a;
            if (i31 == 10) {
                boolean z10 = i29;
                if (i31 == 10) {
                    if (kVar.f16593g < 0) {
                        throw new c("Invalid metablock length");
                    }
                    a.g(aVar);
                    a.a(kVar.f16589c, z10);
                    return;
                }
                return;
            }
            if (i31 != 12) {
                char c11 = 2;
                int i32 = 0;
                switch (i31) {
                    case 1:
                        i10 = i29;
                        if (kVar.f16593g < 0) {
                            throw new c("Invalid metablock length");
                        }
                        q(kVar);
                        i30 = kVar.f16577Q - 1;
                        bArr = kVar.f16590d;
                        break;
                        break;
                    case 2:
                        p(kVar);
                        kVar.f16587a = 3;
                        if (kVar.f16593g <= 0) {
                            kVar.f16587a = i29;
                            i10 = i29;
                        } else {
                            a.j(aVar);
                            if (kVar.f16600n[i29] == 0) {
                                c(kVar);
                            }
                            int[] iArr = kVar.f16600n;
                            iArr[i29] = iArr[i29] - i29;
                            a.d(aVar);
                            int iR3 = r(kVar.f16598l.f16549b, kVar.f16566F, aVar);
                            i22 = iR3 >>> 6;
                            kVar.f16567G = 0;
                            if (i22 >= 2) {
                                i22 -= 2;
                                kVar.f16567G = -1;
                            }
                            int i33 = j.f16559g[i22] + ((iR3 >>> 3) & 7);
                            int i34 = j.f16560h[i22] + (iR3 & 7);
                            kVar.f16611y = j.f16555c[i33] + a.i(aVar, j.f16556d[i33]);
                            kVar.f16573M = j.f16557e[i34] + a.i(aVar, j.f16558f[i34]);
                            kVar.f16610x = 0;
                            kVar.f16587a = 6;
                            if (kVar.f16607u) {
                                while (kVar.f16610x < kVar.f16611y) {
                                    a.j(aVar);
                                    if (kVar.f16600n[0] == 0) {
                                        f(kVar);
                                    }
                                    int[] iArr2 = kVar.f16600n;
                                    iArr2[0] = iArr2[0] - i29;
                                    a.d(aVar);
                                    bArr[kVar.f16604r] = (byte) r(kVar.f16597k.f16549b, kVar.f16609w, aVar);
                                    kVar.f16610x += i29;
                                    i21 = kVar.f16604r;
                                    kVar.f16604r = i21 + 1;
                                    if (i21 == i30) {
                                        kVar.f16588b = 6;
                                        kVar.f16585Y = kVar.f16577Q;
                                        kVar.f16584X = 0;
                                        kVar.f16587a = 12;
                                        i10 = i29;
                                        c10 = 2;
                                    }
                                }
                                i10 = i29;
                                c10 = 2;
                            } else {
                                int i35 = kVar.f16604r;
                                i11 = bArr[(i35 - 1) & i30] & 255;
                                i12 = bArr[(i35 - 2) & i30] & 255;
                                while (true) {
                                    c10 = c11;
                                    if (kVar.f16610x < kVar.f16611y) {
                                        a.j(aVar);
                                        if (kVar.f16600n[0] == 0) {
                                            f(kVar);
                                        }
                                        byte[] bArr2 = kVar.f16561A;
                                        int i36 = kVar.f16562B;
                                        int[] iArr3 = d.f16539a;
                                        i10 = i29;
                                        int i37 = bArr2[i36 + (iArr3[kVar.f16564D + i11] | iArr3[kVar.f16565E + i12])] & 255;
                                        int[] iArr4 = kVar.f16600n;
                                        iArr4[0] = iArr4[0] - 1;
                                        a.d(aVar);
                                        h hVar = kVar.f16597k;
                                        iR = r(hVar.f16549b, hVar.f16550c[i37], aVar);
                                        i13 = kVar.f16604r;
                                        bArr[i13] = (byte) iR;
                                        kVar.f16610x++;
                                        kVar.f16604r = i13 + 1;
                                        if (i13 == i30) {
                                            kVar.f16588b = 6;
                                            kVar.f16585Y = kVar.f16577Q;
                                            kVar.f16584X = 0;
                                            kVar.f16587a = 12;
                                        } else {
                                            i12 = i11;
                                            c11 = c10;
                                            i11 = iR;
                                            i29 = i10;
                                        }
                                    } else {
                                        i10 = i29;
                                    }
                                }
                            }
                            if (kVar.f16587a != 6) {
                                continue;
                            } else {
                                i14 = kVar.f16593g - kVar.f16611y;
                                kVar.f16593g = i14;
                                if (i14 <= 0) {
                                    kVar.f16587a = 3;
                                } else {
                                    if (kVar.f16567G < 0) {
                                        a.j(aVar);
                                        if (kVar.f16600n[c10] == 0) {
                                            e(kVar);
                                        }
                                        int[] iArr5 = kVar.f16600n;
                                        iArr5[c10] = iArr5[c10] - 1;
                                        a.d(aVar);
                                        h hVar2 = kVar.f16599m;
                                        int[] iArr6 = hVar2.f16549b;
                                        int[] iArr7 = hVar2.f16550c;
                                        byte[] bArr3 = kVar.f16568H;
                                        int i38 = kVar.f16563C;
                                        i18 = kVar.f16573M;
                                        if (i18 > 4) {
                                            i19 = 3;
                                        } else {
                                            i19 = i18 - 2;
                                        }
                                        iR2 = r(iArr6, iArr7[bArr3[i38 + i19] & 255], aVar);
                                        kVar.f16567G = iR2;
                                        i20 = kVar.f16569I;
                                        if (iR2 >= i20) {
                                            int i39 = iR2 - i20;
                                            int i40 = kVar.f16570J & i39;
                                            int i41 = i39 >>> kVar.f16571K;
                                            kVar.f16567G = i41;
                                            int i42 = (i41 >>> 1) + 1;
                                            kVar.f16567G = i20 + i40 + ((((((i41 & 1) + 2) << i42) - 4) + a.i(aVar, i42)) << kVar.f16571K);
                                        }
                                    }
                                    iT = t(kVar.f16567G, kVar.f16603q, kVar.f16606t);
                                    kVar.f16572L = iT;
                                    if (iT < 0) {
                                        throw new c("Negative distance");
                                    }
                                    i15 = kVar.f16605s;
                                    i16 = kVar.f16575O;
                                    if (i15 != i16 || (i17 = kVar.f16604r) >= i16) {
                                        kVar.f16605s = i16;
                                    } else {
                                        kVar.f16605s = i17;
                                    }
                                    kVar.f16574N = kVar.f16604r;
                                    if (iT > kVar.f16605s) {
                                        kVar.f16587a = 9;
                                    } else {
                                        if (kVar.f16567G > 0) {
                                            int[] iArr8 = kVar.f16603q;
                                            int i43 = kVar.f16606t;
                                            iArr8[i43 & 3] = iT;
                                            kVar.f16606t = i43 + 1;
                                        }
                                        if (kVar.f16573M > kVar.f16593g) {
                                            throw new c("Invalid backward reference");
                                        }
                                        kVar.f16610x = 0;
                                        kVar.f16587a = 7;
                                        int i44 = kVar.f16604r;
                                        i23 = (i44 - kVar.f16572L) & i30;
                                        i24 = kVar.f16573M - kVar.f16610x;
                                        if (i23 + i24 < i30 || i44 + i24 >= i30) {
                                            while (true) {
                                                i25 = kVar.f16610x;
                                                if (i25 < kVar.f16573M) {
                                                    i26 = kVar.f16604r;
                                                    bArr[i26] = bArr[(i26 - kVar.f16572L) & i30];
                                                    kVar.f16593g--;
                                                    kVar.f16610x = i25 + 1;
                                                    kVar.f16604r = i26 + 1;
                                                    if (i26 == i30) {
                                                        i27 = 7;
                                                        kVar.f16588b = 7;
                                                        kVar.f16585Y = kVar.f16577Q;
                                                        kVar.f16584X = 0;
                                                        kVar.f16587a = 12;
                                                    }
                                                }
                                            }
                                            if (kVar.f16587a == i27) {
                                                kVar.f16587a = 3;
                                            }
                                        } else {
                                            while (i32 < i24) {
                                                bArr[i44] = bArr[i23];
                                                i32++;
                                                i44++;
                                                i23++;
                                            }
                                            kVar.f16610x += i24;
                                            kVar.f16593g -= i24;
                                            kVar.f16604r += i24;
                                        }
                                        i27 = 7;
                                        if (kVar.f16587a == i27) {
                                            kVar.f16587a = 3;
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    case 3:
                        if (kVar.f16593g <= 0) {
                            kVar.f16587a = i29;
                            i10 = i29;
                        } else {
                            a.j(aVar);
                            if (kVar.f16600n[i29] == 0) {
                                c(kVar);
                            }
                            int[] iArr9 = kVar.f16600n;
                            iArr9[i29] = iArr9[i29] - i29;
                            a.d(aVar);
                            int iR4 = r(kVar.f16598l.f16549b, kVar.f16566F, aVar);
                            i22 = iR4 >>> 6;
                            kVar.f16567G = 0;
                            if (i22 >= 2) {
                                i22 -= 2;
                                kVar.f16567G = -1;
                            }
                            int i310 = j.f16559g[i22] + ((iR4 >>> 3) & 7);
                            int i311 = j.f16560h[i22] + (iR4 & 7);
                            kVar.f16611y = j.f16555c[i310] + a.i(aVar, j.f16556d[i310]);
                            kVar.f16573M = j.f16557e[i311] + a.i(aVar, j.f16558f[i311]);
                            kVar.f16610x = 0;
                            kVar.f16587a = 6;
                            if (kVar.f16607u) {
                                while (kVar.f16610x < kVar.f16611y) {
                                    a.j(aVar);
                                    if (kVar.f16600n[0] == 0) {
                                        f(kVar);
                                    }
                                    int[] iArr10 = kVar.f16600n;
                                    iArr10[0] = iArr10[0] - i29;
                                    a.d(aVar);
                                    bArr[kVar.f16604r] = (byte) r(kVar.f16597k.f16549b, kVar.f16609w, aVar);
                                    kVar.f16610x += i29;
                                    i21 = kVar.f16604r;
                                    kVar.f16604r = i21 + 1;
                                    if (i21 == i30) {
                                        kVar.f16588b = 6;
                                        kVar.f16585Y = kVar.f16577Q;
                                        kVar.f16584X = 0;
                                        kVar.f16587a = 12;
                                        i10 = i29;
                                        c10 = 2;
                                    }
                                }
                                i10 = i29;
                                c10 = 2;
                            } else {
                                int i312 = kVar.f16604r;
                                i11 = bArr[(i312 - 1) & i30] & 255;
                                i12 = bArr[(i312 - 2) & i30] & 255;
                                while (true) {
                                    c10 = c11;
                                    if (kVar.f16610x < kVar.f16611y) {
                                        a.j(aVar);
                                        if (kVar.f16600n[0] == 0) {
                                            f(kVar);
                                        }
                                        byte[] bArr4 = kVar.f16561A;
                                        int i313 = kVar.f16562B;
                                        int[] iArr11 = d.f16539a;
                                        i10 = i29;
                                        int i314 = bArr4[i313 + (iArr11[kVar.f16564D + i11] | iArr11[kVar.f16565E + i12])] & 255;
                                        int[] iArr12 = kVar.f16600n;
                                        iArr12[0] = iArr12[0] - 1;
                                        a.d(aVar);
                                        h hVar3 = kVar.f16597k;
                                        iR = r(hVar3.f16549b, hVar3.f16550c[i314], aVar);
                                        i13 = kVar.f16604r;
                                        bArr[i13] = (byte) iR;
                                        kVar.f16610x++;
                                        kVar.f16604r = i13 + 1;
                                        if (i13 == i30) {
                                            kVar.f16588b = 6;
                                            kVar.f16585Y = kVar.f16577Q;
                                            kVar.f16584X = 0;
                                            kVar.f16587a = 12;
                                        } else {
                                            i12 = i11;
                                            c11 = c10;
                                            i11 = iR;
                                            i29 = i10;
                                        }
                                    } else {
                                        i10 = i29;
                                    }
                                }
                            }
                            if (kVar.f16587a != 6) {
                                continue;
                            } else {
                                i14 = kVar.f16593g - kVar.f16611y;
                                kVar.f16593g = i14;
                                if (i14 <= 0) {
                                    kVar.f16587a = 3;
                                } else {
                                    if (kVar.f16567G < 0) {
                                        a.j(aVar);
                                        if (kVar.f16600n[c10] == 0) {
                                            e(kVar);
                                        }
                                        int[] iArr13 = kVar.f16600n;
                                        iArr13[c10] = iArr13[c10] - 1;
                                        a.d(aVar);
                                        h hVar4 = kVar.f16599m;
                                        int[] iArr14 = hVar4.f16549b;
                                        int[] iArr15 = hVar4.f16550c;
                                        byte[] bArr5 = kVar.f16568H;
                                        int i315 = kVar.f16563C;
                                        i18 = kVar.f16573M;
                                        if (i18 > 4) {
                                            i19 = 3;
                                        } else {
                                            i19 = i18 - 2;
                                        }
                                        iR2 = r(iArr14, iArr15[bArr5[i315 + i19] & 255], aVar);
                                        kVar.f16567G = iR2;
                                        i20 = kVar.f16569I;
                                        if (iR2 >= i20) {
                                            int i316 = iR2 - i20;
                                            int i45 = kVar.f16570J & i316;
                                            int i46 = i316 >>> kVar.f16571K;
                                            kVar.f16567G = i46;
                                            int i47 = (i46 >>> 1) + 1;
                                            kVar.f16567G = i20 + i45 + ((((((i46 & 1) + 2) << i47) - 4) + a.i(aVar, i47)) << kVar.f16571K);
                                        }
                                    }
                                    iT = t(kVar.f16567G, kVar.f16603q, kVar.f16606t);
                                    kVar.f16572L = iT;
                                    if (iT < 0) {
                                        throw new c("Negative distance");
                                    }
                                    i15 = kVar.f16605s;
                                    i16 = kVar.f16575O;
                                    if (i15 != i16) {
                                        kVar.f16605s = i16;
                                    } else {
                                        kVar.f16605s = i16;
                                    }
                                    kVar.f16574N = kVar.f16604r;
                                    if (iT > kVar.f16605s) {
                                        kVar.f16587a = 9;
                                    } else {
                                        if (kVar.f16567G > 0) {
                                            int[] iArr16 = kVar.f16603q;
                                            int i48 = kVar.f16606t;
                                            iArr16[i48 & 3] = iT;
                                            kVar.f16606t = i48 + 1;
                                        }
                                        if (kVar.f16573M > kVar.f16593g) {
                                            throw new c("Invalid backward reference");
                                        }
                                        kVar.f16610x = 0;
                                        kVar.f16587a = 7;
                                        int i49 = kVar.f16604r;
                                        i23 = (i49 - kVar.f16572L) & i30;
                                        i24 = kVar.f16573M - kVar.f16610x;
                                        if (i23 + i24 < i30) {
                                            while (true) {
                                                i25 = kVar.f16610x;
                                                if (i25 < kVar.f16573M) {
                                                    i26 = kVar.f16604r;
                                                    bArr[i26] = bArr[(i26 - kVar.f16572L) & i30];
                                                    kVar.f16593g--;
                                                    kVar.f16610x = i25 + 1;
                                                    kVar.f16604r = i26 + 1;
                                                    if (i26 == i30) {
                                                        i27 = 7;
                                                        kVar.f16588b = 7;
                                                        kVar.f16585Y = kVar.f16577Q;
                                                        kVar.f16584X = 0;
                                                        kVar.f16587a = 12;
                                                    }
                                                } else {
                                                    i27 = 7;
                                                }
                                            }
                                        } else {
                                            while (true) {
                                                i25 = kVar.f16610x;
                                                if (i25 < kVar.f16573M) {
                                                    i26 = kVar.f16604r;
                                                    bArr[i26] = bArr[(i26 - kVar.f16572L) & i30];
                                                    kVar.f16593g--;
                                                    kVar.f16610x = i25 + 1;
                                                    kVar.f16604r = i26 + 1;
                                                    if (i26 == i30) {
                                                        i27 = 7;
                                                        kVar.f16588b = 7;
                                                        kVar.f16585Y = kVar.f16577Q;
                                                        kVar.f16584X = 0;
                                                        kVar.f16587a = 12;
                                                    }
                                                } else {
                                                    i27 = 7;
                                                }
                                            }
                                        }
                                        if (kVar.f16587a == i27) {
                                            kVar.f16587a = 3;
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    case 4:
                        while (kVar.f16593g > 0) {
                            a.j(aVar);
                            a.i(aVar, 8);
                            kVar.f16593g -= i29;
                        }
                        kVar.f16587a = i29;
                        i10 = i29;
                        break;
                    case 5:
                        a(kVar);
                        i10 = i29;
                        break;
                    case 6:
                        if (kVar.f16607u) {
                            while (kVar.f16610x < kVar.f16611y) {
                                a.j(aVar);
                                if (kVar.f16600n[0] == 0) {
                                    f(kVar);
                                }
                                int[] iArr17 = kVar.f16600n;
                                iArr17[0] = iArr17[0] - i29;
                                a.d(aVar);
                                bArr[kVar.f16604r] = (byte) r(kVar.f16597k.f16549b, kVar.f16609w, aVar);
                                kVar.f16610x += i29;
                                i21 = kVar.f16604r;
                                kVar.f16604r = i21 + 1;
                                if (i21 == i30) {
                                    kVar.f16588b = 6;
                                    kVar.f16585Y = kVar.f16577Q;
                                    kVar.f16584X = 0;
                                    kVar.f16587a = 12;
                                    i10 = i29;
                                    c10 = 2;
                                }
                            }
                            i10 = i29;
                            c10 = 2;
                        } else {
                            int i317 = kVar.f16604r;
                            i11 = bArr[(i317 - 1) & i30] & 255;
                            i12 = bArr[(i317 - 2) & i30] & 255;
                            while (true) {
                                c10 = c11;
                                if (kVar.f16610x < kVar.f16611y) {
                                    a.j(aVar);
                                    if (kVar.f16600n[0] == 0) {
                                        f(kVar);
                                    }
                                    byte[] bArr6 = kVar.f16561A;
                                    int i318 = kVar.f16562B;
                                    int[] iArr18 = d.f16539a;
                                    i10 = i29;
                                    int i319 = bArr6[i318 + (iArr18[kVar.f16564D + i11] | iArr18[kVar.f16565E + i12])] & 255;
                                    int[] iArr19 = kVar.f16600n;
                                    iArr19[0] = iArr19[0] - 1;
                                    a.d(aVar);
                                    h hVar5 = kVar.f16597k;
                                    iR = r(hVar5.f16549b, hVar5.f16550c[i319], aVar);
                                    i13 = kVar.f16604r;
                                    bArr[i13] = (byte) iR;
                                    kVar.f16610x++;
                                    kVar.f16604r = i13 + 1;
                                    if (i13 == i30) {
                                        kVar.f16588b = 6;
                                        kVar.f16585Y = kVar.f16577Q;
                                        kVar.f16584X = 0;
                                        kVar.f16587a = 12;
                                    } else {
                                        i12 = i11;
                                        c11 = c10;
                                        i11 = iR;
                                        i29 = i10;
                                    }
                                } else {
                                    i10 = i29;
                                }
                            }
                        }
                        if (kVar.f16587a != 6) {
                            continue;
                        } else {
                            i14 = kVar.f16593g - kVar.f16611y;
                            kVar.f16593g = i14;
                            if (i14 <= 0) {
                                kVar.f16587a = 3;
                            } else {
                                if (kVar.f16567G < 0) {
                                    a.j(aVar);
                                    if (kVar.f16600n[c10] == 0) {
                                        e(kVar);
                                    }
                                    int[] iArr110 = kVar.f16600n;
                                    iArr110[c10] = iArr110[c10] - 1;
                                    a.d(aVar);
                                    h hVar6 = kVar.f16599m;
                                    int[] iArr111 = hVar6.f16549b;
                                    int[] iArr112 = hVar6.f16550c;
                                    byte[] bArr7 = kVar.f16568H;
                                    int i3110 = kVar.f16563C;
                                    i18 = kVar.f16573M;
                                    if (i18 > 4) {
                                        i19 = 3;
                                    } else {
                                        i19 = i18 - 2;
                                    }
                                    iR2 = r(iArr111, iArr112[bArr7[i3110 + i19] & 255], aVar);
                                    kVar.f16567G = iR2;
                                    i20 = kVar.f16569I;
                                    if (iR2 >= i20) {
                                        int i3111 = iR2 - i20;
                                        int i410 = kVar.f16570J & i3111;
                                        int i411 = i3111 >>> kVar.f16571K;
                                        kVar.f16567G = i411;
                                        int i412 = (i411 >>> 1) + 1;
                                        kVar.f16567G = i20 + i410 + ((((((i411 & 1) + 2) << i412) - 4) + a.i(aVar, i412)) << kVar.f16571K);
                                    }
                                }
                                iT = t(kVar.f16567G, kVar.f16603q, kVar.f16606t);
                                kVar.f16572L = iT;
                                if (iT < 0) {
                                    throw new c("Negative distance");
                                }
                                i15 = kVar.f16605s;
                                i16 = kVar.f16575O;
                                if (i15 != i16) {
                                    kVar.f16605s = i16;
                                } else {
                                    kVar.f16605s = i16;
                                }
                                kVar.f16574N = kVar.f16604r;
                                if (iT > kVar.f16605s) {
                                    kVar.f16587a = 9;
                                } else {
                                    if (kVar.f16567G > 0) {
                                        int[] iArr113 = kVar.f16603q;
                                        int i413 = kVar.f16606t;
                                        iArr113[i413 & 3] = iT;
                                        kVar.f16606t = i413 + 1;
                                    }
                                    if (kVar.f16573M > kVar.f16593g) {
                                        throw new c("Invalid backward reference");
                                    }
                                    kVar.f16610x = 0;
                                    kVar.f16587a = 7;
                                    int i414 = kVar.f16604r;
                                    i23 = (i414 - kVar.f16572L) & i30;
                                    i24 = kVar.f16573M - kVar.f16610x;
                                    if (i23 + i24 < i30) {
                                        while (true) {
                                            i25 = kVar.f16610x;
                                            if (i25 < kVar.f16573M) {
                                                i26 = kVar.f16604r;
                                                bArr[i26] = bArr[(i26 - kVar.f16572L) & i30];
                                                kVar.f16593g--;
                                                kVar.f16610x = i25 + 1;
                                                kVar.f16604r = i26 + 1;
                                                if (i26 == i30) {
                                                    i27 = 7;
                                                    kVar.f16588b = 7;
                                                    kVar.f16585Y = kVar.f16577Q;
                                                    kVar.f16584X = 0;
                                                    kVar.f16587a = 12;
                                                }
                                            } else {
                                                i27 = 7;
                                            }
                                        }
                                    } else {
                                        while (true) {
                                            i25 = kVar.f16610x;
                                            if (i25 < kVar.f16573M) {
                                                i26 = kVar.f16604r;
                                                bArr[i26] = bArr[(i26 - kVar.f16572L) & i30];
                                                kVar.f16593g--;
                                                kVar.f16610x = i25 + 1;
                                                kVar.f16604r = i26 + 1;
                                                if (i26 == i30) {
                                                    i27 = 7;
                                                    kVar.f16588b = 7;
                                                    kVar.f16585Y = kVar.f16577Q;
                                                    kVar.f16584X = 0;
                                                    kVar.f16587a = 12;
                                                }
                                            } else {
                                                i27 = 7;
                                            }
                                        }
                                    }
                                    if (kVar.f16587a == i27) {
                                        kVar.f16587a = 3;
                                    }
                                }
                            }
                        }
                        break;
                    case 7:
                        i10 = i29;
                        int i415 = kVar.f16604r;
                        i23 = (i415 - kVar.f16572L) & i30;
                        i24 = kVar.f16573M - kVar.f16610x;
                        if (i23 + i24 < i30) {
                            while (true) {
                                i25 = kVar.f16610x;
                                if (i25 < kVar.f16573M) {
                                    i26 = kVar.f16604r;
                                    bArr[i26] = bArr[(i26 - kVar.f16572L) & i30];
                                    kVar.f16593g--;
                                    kVar.f16610x = i25 + 1;
                                    kVar.f16604r = i26 + 1;
                                    if (i26 == i30) {
                                        i27 = 7;
                                        kVar.f16588b = 7;
                                        kVar.f16585Y = kVar.f16577Q;
                                        kVar.f16584X = 0;
                                        kVar.f16587a = 12;
                                    }
                                } else {
                                    i27 = 7;
                                }
                            }
                        } else {
                            while (true) {
                                i25 = kVar.f16610x;
                                if (i25 < kVar.f16573M) {
                                    i26 = kVar.f16604r;
                                    bArr[i26] = bArr[(i26 - kVar.f16572L) & i30];
                                    kVar.f16593g--;
                                    kVar.f16610x = i25 + 1;
                                    kVar.f16604r = i26 + 1;
                                    if (i26 == i30) {
                                        i27 = 7;
                                        kVar.f16588b = 7;
                                        kVar.f16585Y = kVar.f16577Q;
                                        kVar.f16584X = 0;
                                        kVar.f16587a = 12;
                                    }
                                } else {
                                    i27 = 7;
                                }
                            }
                        }
                        if (kVar.f16587a == i27) {
                            kVar.f16587a = 3;
                        }
                        break;
                    case 8:
                        int i50 = kVar.f16577Q;
                        System.arraycopy(bArr, i50, bArr, 0, kVar.f16574N - i50);
                        kVar.f16587a = 3;
                        i10 = i29;
                        break;
                    case 9:
                        int i51 = kVar.f16573M;
                        if (i51 < 4 || i51 > 24) {
                            throw new c("Invalid backward reference");
                        }
                        int i52 = f.f16545a[i51];
                        int i53 = (kVar.f16572L - kVar.f16605s) - i29;
                        int i54 = f.f16546b[i51];
                        int i55 = ((i29 << i54) - i29) & i53;
                        int i56 = i53 >>> i54;
                        int i57 = i52 + (i55 * i51);
                        l[] lVarArr = l.f16613d;
                        if (i56 >= lVarArr.length) {
                            throw new c("Invalid backward reference");
                        }
                        int iB = l.b(bArr, kVar.f16574N, f.a(), i57, kVar.f16573M, lVarArr[i56]);
                        int i58 = kVar.f16574N + iB;
                        kVar.f16574N = i58;
                        kVar.f16604r += iB;
                        kVar.f16593g -= iB;
                        int i59 = kVar.f16577Q;
                        if (i58 >= i59) {
                            kVar.f16588b = 8;
                            kVar.f16585Y = i59;
                            kVar.f16584X = 0;
                            kVar.f16587a = 12;
                        } else {
                            kVar.f16587a = 3;
                        }
                        i10 = i29;
                        break;
                        break;
                    default:
                        throw new c("Unexpected state " + kVar.f16587a);
                }
            } else {
                i10 = i29;
                if (!u(kVar)) {
                    return;
                }
                int i60 = kVar.f16604r;
                int i61 = kVar.f16575O;
                if (i60 >= i61) {
                    kVar.f16605s = i61;
                }
                kVar.f16604r = i60 & i30;
                kVar.f16587a = kVar.f16588b;
            }
            i29 = i10;
        }
    }

    private static void j(byte[] bArr, int i10) {
        int[] iArr = new int[256];
        for (int i11 = 0; i11 < 256; i11++) {
            iArr[i11] = i11;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = bArr[i12] & 255;
            bArr[i12] = (byte) iArr[i13];
            if (i13 != 0) {
                l(iArr, i13);
            }
        }
    }

    private static void k(k kVar) {
        int i10;
        int i11 = kVar.f16576P;
        long j10 = i11;
        long j11 = kVar.f16578R;
        if (j10 > j11) {
            while (true) {
                int i12 = i11 >> 1;
                if (i12 <= ((int) j11) + kVar.f16579S.length) {
                    break;
                } else {
                    i11 = i12;
                }
            }
            if (!kVar.f16594h && i11 < 16384 && kVar.f16576P >= 16384) {
                i11 = 16384;
            }
        }
        int i13 = kVar.f16577Q;
        if (i11 <= i13) {
            return;
        }
        byte[] bArr = new byte[i11 + 37];
        byte[] bArr2 = kVar.f16590d;
        if (bArr2 != null) {
            System.arraycopy(bArr2, 0, bArr, 0, i13);
        } else {
            byte[] bArr3 = kVar.f16579S;
            if (bArr3.length != 0) {
                int length = bArr3.length;
                int i14 = kVar.f16575O;
                if (length > i14) {
                    i10 = length - i14;
                } else {
                    i14 = length;
                    i10 = 0;
                }
                System.arraycopy(bArr3, i10, bArr, 0, i14);
                kVar.f16604r = i14;
                kVar.f16580T = i14;
            }
        }
        kVar.f16590d = bArr;
        kVar.f16577Q = i11;
    }

    private static void l(int[] iArr, int i10) {
        int i11 = iArr[i10];
        while (i10 > 0) {
            iArr[i10] = iArr[i10 - 1];
            i10--;
        }
        iArr[0] = i11;
    }

    private static int m(int[] iArr, int i10, a aVar) {
        a.d(aVar);
        int iR = r(iArr, i10, aVar);
        return j.f16553a[iR] + a.i(aVar, j.f16554b[iR]);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c7  */
    static void n(int i10, int[] iArr, int i11, a aVar) {
        int i12;
        int i13;
        int i14;
        a.j(aVar);
        int[] iArr2 = new int[i10];
        int i15 = a.i(aVar, 2);
        boolean z10 = false;
        boolean z11 = true;
        if (i15 == 1) {
            int i16 = i10 - 1;
            int[] iArr3 = new int[4];
            int i17 = a.i(aVar, 2) + 1;
            int i18 = 0;
            while (i16 != 0) {
                i16 >>= 1;
                i18++;
            }
            for (int i19 = 0; i19 < i17; i19++) {
                int i20 = a.i(aVar, i18) % i10;
                iArr3[i19] = i20;
                iArr2[i20] = 2;
            }
            iArr2[iArr3[0]] = 1;
            if (i17 != 1) {
                if (i17 == 2) {
                    int i21 = iArr3[0];
                    int i22 = iArr3[1];
                    z10 = i21 != i22;
                    iArr2[i22] = 1;
                } else if (i17 != 3) {
                    int i23 = iArr3[0];
                    int i24 = iArr3[1];
                    boolean z12 = (i23 == i24 || i23 == (i13 = iArr3[2]) || i23 == (i14 = iArr3[3]) || i24 == i13 || i24 == i14 || i13 == i14) ? false : true;
                    if (a.i(aVar, 1) == 1) {
                        iArr2[iArr3[2]] = 3;
                        iArr2[iArr3[3]] = 3;
                    } else {
                        iArr2[iArr3[0]] = 2;
                    }
                    z11 = z12;
                } else {
                    int i25 = iArr3[0];
                    int i26 = iArr3[1];
                    if (i25 != i26 && i25 != (i12 = iArr3[2]) && i26 != i12) {
                        z10 = true;
                    }
                }
            }
            if (z11) {
                throw new c("Can't readHuffmanCode");
            }
            g.a(iArr, i11, 8, iArr2, i10);
        }
        int[] iArr4 = new int[18];
        int i27 = 0;
        int i28 = 32;
        while (i15 < 18 && i28 > 0) {
            int i29 = f16541a[i15];
            a.d(aVar);
            long j10 = aVar.f16531f;
            int i30 = aVar.f16532g;
            int i31 = f16544d[((int) (j10 >>> i30)) & 15];
            aVar.f16532g = i30 + (i31 >> 16);
            int i32 = i31 & 65535;
            iArr4[i29] = i32;
            if (i32 != 0) {
                i28 -= 32 >> i32;
                i27++;
            }
            i15++;
        }
        z10 = i27 == 1 || i28 == 0;
        o(iArr4, i10, iArr2, aVar);
        z11 = z10;
        if (z11) {
            throw new c("Can't readHuffmanCode");
        }
        g.a(iArr, i11, 8, iArr2, i10);
    }

    private static void o(int[] iArr, int i10, int[] iArr2, a aVar) {
        int[] iArr3 = new int[32];
        g.a(iArr3, 0, 5, iArr, 18);
        int i11 = 8;
        int i12 = 32768;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < i10 && i12 > 0) {
            a.j(aVar);
            a.d(aVar);
            long j10 = aVar.f16531f;
            int i16 = aVar.f16532g;
            int i17 = iArr3[((int) (j10 >>> i16)) & 31];
            aVar.f16532g = i16 + (i17 >> 16);
            int i18 = i17 & 65535;
            if (i18 < 16) {
                i13++;
                iArr2[i13] = i18;
                if (i18 != 0) {
                    i12 -= 32768 >> i18;
                    i11 = i18;
                }
                i15 = 0;
            } else {
                int i19 = i18 - 14;
                int i20 = i18 == 16 ? i11 : 0;
                if (i14 != i20) {
                    i15 = 0;
                    i14 = i20;
                }
                int i21 = (i15 > 0 ? (i15 - 2) << i19 : i15) + a.i(aVar, i19) + 3;
                int i22 = i21 - i15;
                if (i13 + i22 > i10) {
                    throw new c("symbol + repeatDelta > numSymbols");
                }
                int i23 = 0;
                while (i23 < i22) {
                    iArr2[i13] = i14;
                    i23++;
                    i13++;
                }
                if (i14 != 0) {
                    i12 -= i22 << (15 - i14);
                }
                i15 = i21;
            }
        }
        if (i12 != 0) {
            throw new c("Unused space");
        }
        m.b(iArr2, i13, i10 - i13);
    }

    private static void p(k kVar) {
        int i10;
        int[] iArr;
        a aVar = kVar.f16589c;
        for (int i11 = 0; i11 < 3; i11++) {
            kVar.f16601o[i11] = h(aVar) + 1;
            kVar.f16600n[i11] = 268435456;
            int i12 = kVar.f16601o[i11];
            if (i12 > 1) {
                int i13 = i11 * 1080;
                n(i12 + 2, kVar.f16591e, i13, aVar);
                n(26, kVar.f16592f, i13, aVar);
                kVar.f16600n[i11] = m(kVar.f16592f, i13, aVar);
            }
        }
        a.j(aVar);
        kVar.f16571K = a.i(aVar, 2);
        int i14 = a.i(aVar, 4);
        int i15 = kVar.f16571K;
        int i16 = (i14 << i15) + 16;
        kVar.f16569I = i16;
        kVar.f16570J = (1 << i15) - 1;
        int i17 = i16 + (48 << i15);
        kVar.f16612z = new byte[kVar.f16601o[0]];
        int i18 = 0;
        while (true) {
            i10 = kVar.f16601o[0];
            if (i18 >= i10) {
                break;
            }
            int iMin = Math.min(i18 + 96, i10);
            while (i18 < iMin) {
                kVar.f16612z[i18] = (byte) (a.i(aVar, 2) << 1);
                i18++;
            }
            a.j(aVar);
        }
        byte[] bArr = new byte[i10 << 6];
        kVar.f16561A = bArr;
        int iD = d(i10 << 6, bArr, aVar);
        kVar.f16607u = true;
        int i19 = 0;
        while (true) {
            iArr = kVar.f16601o;
            if (i19 >= (iArr[0] << 6)) {
                break;
            }
            if (kVar.f16561A[i19] != (i19 >> 6)) {
                kVar.f16607u = false;
                break;
            }
            i19++;
        }
        int i20 = iArr[2];
        byte[] bArr2 = new byte[i20 << 2];
        kVar.f16568H = bArr2;
        int iD2 = d(i20 << 2, bArr2, aVar);
        h.b(kVar.f16597k, 256, iD);
        h.b(kVar.f16598l, 704, kVar.f16601o[1]);
        h.b(kVar.f16599m, i17, iD2);
        h.a(kVar.f16597k, aVar);
        h.a(kVar.f16598l, aVar);
        h.a(kVar.f16599m, aVar);
        kVar.f16562B = 0;
        kVar.f16563C = 0;
        int[] iArr2 = d.f16540b;
        byte b10 = kVar.f16612z[0];
        kVar.f16564D = iArr2[b10];
        kVar.f16565E = iArr2[b10 + 1];
        kVar.f16608v = 0;
        kVar.f16609w = kVar.f16597k.f16550c[0];
        kVar.f16566F = kVar.f16598l.f16550c[0];
        int[] iArr3 = kVar.f16602p;
        iArr3[4] = 1;
        iArr3[2] = 1;
        iArr3[0] = 1;
        iArr3[5] = 0;
        iArr3[3] = 0;
        iArr3[1] = 0;
    }

    private static void q(k kVar) {
        a aVar = kVar.f16589c;
        if (kVar.f16594h) {
            kVar.f16588b = 10;
            kVar.f16585Y = kVar.f16604r;
            kVar.f16584X = 0;
            kVar.f16587a = 12;
            return;
        }
        h hVar = kVar.f16597k;
        hVar.f16549b = null;
        hVar.f16550c = null;
        h hVar2 = kVar.f16598l;
        hVar2.f16549b = null;
        hVar2.f16550c = null;
        h hVar3 = kVar.f16599m;
        hVar3.f16549b = null;
        hVar3.f16550c = null;
        a.j(aVar);
        g(aVar, kVar);
        if (kVar.f16593g != 0 || kVar.f16596j) {
            if (kVar.f16595i || kVar.f16596j) {
                a.g(aVar);
                kVar.f16587a = kVar.f16596j ? 4 : 5;
            } else {
                kVar.f16587a = 2;
            }
            if (kVar.f16596j) {
                return;
            }
            kVar.f16578R += (long) kVar.f16593g;
            if (kVar.f16577Q < kVar.f16576P) {
                k(kVar);
            }
        }
    }

    private static int r(int[] iArr, int i10, a aVar) {
        long j10 = aVar.f16531f;
        int i11 = aVar.f16532g;
        int i12 = (int) (j10 >>> i11);
        int i13 = i10 + (i12 & 255);
        int i14 = iArr[i13];
        int i15 = i14 >> 16;
        int i16 = i14 & 65535;
        if (i15 <= 8) {
            aVar.f16532g = i11 + i15;
            return i16;
        }
        int i17 = iArr[i13 + i16 + ((i12 & ((1 << i15) - 1)) >>> 8)];
        aVar.f16532g = i11 + (i17 >> 16) + 8;
        return i17 & 65535;
    }

    static void s(k kVar, byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        kVar.f16579S = bArr;
    }

    private static int t(int i10, int[] iArr, int i11) {
        return i10 < 16 ? iArr[(i11 + f16542b[i10]) & 3] + f16543c[i10] : i10 - 15;
    }

    private static boolean u(k kVar) {
        int i10 = kVar.f16580T;
        if (i10 != 0) {
            kVar.f16584X += i10;
            kVar.f16580T = 0;
        }
        int iMin = Math.min(kVar.f16582V - kVar.f16583W, kVar.f16585Y - kVar.f16584X);
        if (iMin != 0) {
            System.arraycopy(kVar.f16590d, kVar.f16584X, kVar.f16586Z, kVar.f16581U + kVar.f16583W, iMin);
            kVar.f16583W += iMin;
            kVar.f16584X += iMin;
        }
        return kVar.f16583W < kVar.f16582V;
    }
}

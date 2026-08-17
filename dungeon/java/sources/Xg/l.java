package Xg;

/* JADX INFO: loaded from: classes3.dex */
final class l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final l[] f16613d = {new l("", 0, ""), new l("", 0, " "), new l(" ", 0, " "), new l("", 12, ""), new l("", 10, " "), new l("", 0, " the "), new l(" ", 0, ""), new l("s ", 0, " "), new l("", 0, " of "), new l("", 10, ""), new l("", 0, " and "), new l("", 13, ""), new l("", 1, ""), new l(", ", 0, " "), new l("", 0, ", "), new l(" ", 10, " "), new l("", 0, " in "), new l("", 0, " to "), new l("e ", 0, " "), new l("", 0, "\""), new l("", 0, "."), new l("", 0, "\">"), new l("", 0, "\n"), new l("", 3, ""), new l("", 0, "]"), new l("", 0, " for "), new l("", 14, ""), new l("", 2, ""), new l("", 0, " a "), new l("", 0, " that "), new l(" ", 10, ""), new l("", 0, ". "), new l(".", 0, ""), new l(" ", 0, ", "), new l("", 15, ""), new l("", 0, " with "), new l("", 0, "'"), new l("", 0, " from "), new l("", 0, " by "), new l("", 16, ""), new l("", 17, ""), new l(" the ", 0, ""), new l("", 4, ""), new l("", 0, ". The "), new l("", 11, ""), new l("", 0, " on "), new l("", 0, " as "), new l("", 0, " is "), new l("", 7, ""), new l("", 1, "ing "), new l("", 0, "\n\t"), new l("", 0, ":"), new l(" ", 0, ". "), new l("", 0, "ed "), new l("", 20, ""), new l("", 18, ""), new l("", 6, ""), new l("", 0, "("), new l("", 10, ", "), new l("", 8, ""), new l("", 0, " at "), new l("", 0, "ly "), new l(" the ", 0, " of "), new l("", 5, ""), new l("", 9, ""), new l(" ", 10, ", "), new l("", 10, "\""), new l(".", 0, "("), new l("", 11, " "), new l("", 10, "\">"), new l("", 0, "=\""), new l(" ", 0, "."), new l(".com/", 0, ""), new l(" the ", 0, " of the "), new l("", 10, "'"), new l("", 0, ". This "), new l("", 0, ","), new l(".", 0, " "), new l("", 10, "("), new l("", 10, "."), new l("", 0, " not "), new l(" ", 0, "=\""), new l("", 0, "er "), new l(" ", 11, " "), new l("", 0, "al "), new l(" ", 11, ""), new l("", 0, "='"), new l("", 11, "\""), new l("", 10, ". "), new l(" ", 0, "("), new l("", 0, "ful "), new l(" ", 10, ". "), new l("", 0, "ive "), new l("", 0, "less "), new l("", 11, "'"), new l("", 0, "est "), new l(" ", 10, "."), new l("", 11, "\">"), new l(" ", 0, "='"), new l("", 10, ","), new l("", 0, "ize "), new l("", 11, "."), new l("Â ", 0, ""), new l(" ", 0, ","), new l("", 10, "=\""), new l("", 11, "=\""), new l("", 0, "ous "), new l("", 11, ", "), new l("", 10, "='"), new l(" ", 10, ","), new l(" ", 11, "=\""), new l(" ", 11, ", "), new l("", 11, ","), new l("", 11, "("), new l("", 11, ". "), new l(" ", 11, "."), new l("", 11, "='"), new l(" ", 11, ". "), new l(" ", 10, "=\""), new l(" ", 11, "='"), new l(" ", 10, "='")};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f16614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f16615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f16616c;

    l(String str, int i10, String str2) {
        this.f16614a = a(str);
        this.f16615b = i10;
        this.f16616c = a(str2);
    }

    static byte[] a(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = (byte) str.charAt(i10);
        }
        return bArr;
    }

    static int b(byte[] bArr, int i10, byte[] bArr2, int i11, int i12, l lVar) {
        int i13 = i10;
        for (byte b10 : lVar.f16614a) {
            bArr[i13] = b10;
            i13++;
        }
        int i14 = lVar.f16615b;
        int iA = n.a(i14);
        if (iA > i12) {
            iA = i12;
        }
        int i15 = i11 + iA;
        int iB = (i12 - iA) - n.b(i14);
        int i16 = iB;
        while (i16 > 0) {
            bArr[i13] = bArr2[i15];
            i16--;
            i13++;
            i15++;
        }
        if (i14 == 11 || i14 == 10) {
            int i17 = i13 - iB;
            if (i14 == 10) {
                iB = 1;
            }
            while (iB > 0) {
                byte b11 = bArr[i17];
                int i18 = b11 & 255;
                if (i18 < 192) {
                    if (i18 >= 97 && i18 <= 122) {
                        bArr[i17] = (byte) (b11 ^ 32);
                    }
                    i17++;
                    iB--;
                } else if (i18 < 224) {
                    int i19 = i17 + 1;
                    bArr[i19] = (byte) (bArr[i19] ^ 32);
                    i17 += 2;
                    iB -= 2;
                } else {
                    int i20 = i17 + 2;
                    bArr[i20] = (byte) (bArr[i20] ^ 5);
                    i17 += 3;
                    iB -= 3;
                }
            }
        }
        for (byte b12 : lVar.f16616c) {
            bArr[i13] = b12;
            i13++;
        }
        return i13 - i10;
    }
}

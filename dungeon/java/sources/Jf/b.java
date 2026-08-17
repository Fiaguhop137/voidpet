package Jf;

import If.C1106h;
import If.C1109k;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f5808a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(byte[] bArr, int i10) {
        byte b10;
        int i11;
        int length = bArr.length;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < length) {
            byte b11 = bArr[i12];
            if (b11 >= 0) {
                int i15 = i14 + 1;
                if (i14 == i10) {
                    break;
                }
                if ((b11 != 10 && b11 != 13 && ((b11 >= 0 && b11 < 32) || (127 <= b11 && b11 < 160))) || b11 == 65533) {
                    return -1;
                }
                i13 += b11 < 65536 ? 1 : 2;
                i12++;
                while (true) {
                    i14 = i15;
                    if (i12 >= length || (b10 = bArr[i12]) < 0) {
                        break;
                    }
                    i12++;
                    i15 = i14 + 1;
                    if (i14 == i10) {
                        return i13;
                    }
                    if ((b10 != 10 && b10 != 13 && ((b10 >= 0 && b10 < 32) || (127 <= b10 && b10 < 160))) || b10 == 65533) {
                        return -1;
                    }
                    i13 += b10 < 65536 ? 1 : 2;
                }
            } else if ((b11 >> 5) == -2) {
                int i16 = i12 + 1;
                if (length <= i16) {
                    if (i14 == i10) {
                        break;
                    }
                    return -1;
                }
                byte b12 = bArr[i16];
                if ((b12 & 192) != 128) {
                    if (i14 == i10) {
                        break;
                    }
                    return -1;
                }
                int i17 = (b11 << 6) ^ (b12 ^ 3968);
                if (i17 < 128) {
                    if (i14 == i10) {
                        break;
                    }
                    return -1;
                }
                int i18 = i14 + 1;
                if (i14 == i10) {
                    break;
                }
                if ((i17 != 10 && i17 != 13 && ((i17 >= 0 && i17 < 32) || (127 <= i17 && i17 < 160))) || i17 == 65533) {
                    return -1;
                }
                i13 += i17 < 65536 ? 1 : 2;
                Unit unit = Unit.f48228a;
                i12 += 2;
                i14 = i18;
            } else if ((b11 >> 4) == -2) {
                int i19 = i12 + 2;
                if (length <= i19) {
                    if (i14 == i10) {
                        break;
                    }
                    return -1;
                }
                byte b13 = bArr[i12 + 1];
                if ((b13 & 192) != 128) {
                    if (i14 == i10) {
                        break;
                    }
                    return -1;
                }
                byte b14 = bArr[i19];
                if ((b14 & 192) != 128) {
                    if (i14 == i10) {
                        break;
                    }
                    return -1;
                }
                int i20 = (b11 << 12) ^ ((b14 ^ (-123008)) ^ (b13 << 6));
                if (i20 < 2048) {
                    if (i14 == i10) {
                        break;
                    }
                    return -1;
                }
                if (55296 <= i20 && i20 < 57344) {
                    if (i14 == i10) {
                        break;
                    }
                    return -1;
                }
                i11 = i14 + 1;
                if (i14 == i10) {
                    break;
                }
                if ((i20 != 10 && i20 != 13 && ((i20 >= 0 && i20 < 32) || (127 <= i20 && i20 < 160))) || i20 == 65533) {
                    return -1;
                }
                i13 += i20 < 65536 ? 1 : 2;
                Unit unit2 = Unit.f48228a;
                i12 += 3;
                i14 = i11;
            } else {
                if ((b11 >> 3) != -2) {
                    if (i14 == i10) {
                        break;
                    }
                    return -1;
                }
                int i21 = i12 + 3;
                if (length <= i21) {
                    if (i14 == i10) {
                        break;
                    }
                    return -1;
                }
                byte b15 = bArr[i12 + 1];
                if ((b15 & 192) != 128) {
                    if (i14 == i10) {
                        break;
                    }
                    return -1;
                }
                byte b16 = bArr[i12 + 2];
                if ((b16 & 192) != 128) {
                    if (i14 == i10) {
                        break;
                    }
                    return -1;
                }
                byte b17 = bArr[i21];
                if ((b17 & 192) != 128) {
                    if (i14 == i10) {
                        break;
                    }
                    return -1;
                }
                int i22 = (b11 << 18) ^ (((b17 ^ 3678080) ^ (b16 << 6)) ^ (b15 << 12));
                if (i22 > 1114111) {
                    if (i14 == i10) {
                        break;
                    }
                    return -1;
                }
                if (55296 <= i22 && i22 < 57344) {
                    if (i14 == i10) {
                        break;
                    }
                    return -1;
                }
                if (i22 < 65536) {
                    if (i14 == i10) {
                        break;
                    }
                    return -1;
                }
                i11 = i14 + 1;
                if (i14 == i10) {
                    break;
                }
                if ((i22 != 10 && i22 != 13 && ((i22 >= 0 && i22 < 32) || (127 <= i22 && i22 < 160))) || i22 == 65533) {
                    return -1;
                }
                i13 += i22 < 65536 ? 1 : 2;
                Unit unit3 = Unit.f48228a;
                i12 += 4;
                i14 = i11;
            }
        }
        return i13;
    }

    public static final void d(C1109k c1109k, C1106h buffer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(c1109k, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        buffer.write(c1109k.s(), i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        if ('A' <= c10 && c10 < 'G') {
            return c10 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c10);
    }

    public static final char[] f() {
        return f5808a;
    }
}

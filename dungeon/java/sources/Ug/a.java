package Ug;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: Ug.a$a, reason: collision with other inner class name */
    public static class C0190a implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object[] f13696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f13697b = 0;

        public C0190a(Object[] objArr) {
            this.f13696a = objArr;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f13697b < this.f13696a.length;
        }

        @Override // java.util.Iterator
        public Object next() {
            int i10 = this.f13697b;
            Object[] objArr = this.f13696a;
            if (i10 != objArr.length) {
                this.f13697b = i10 + 1;
                return objArr[i10];
            }
            throw new NoSuchElementException("Out of elements: " + this.f13697b);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Cannot remove element from an Array.");
        }
    }

    public static boolean a(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, int i13) {
        int i14 = i11 - i10;
        if (i14 != i13 - i12) {
            return false;
        }
        for (int i15 = 0; i15 < i14; i15++) {
            if (bArr[i10 + i15] != bArr2[i12 + i15]) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    public static boolean c(char[] cArr, char[] cArr2) {
        return Arrays.equals(cArr, cArr2);
    }

    public static boolean d(short[] sArr, short[] sArr2) {
        return Arrays.equals(sArr, sArr2);
    }

    public static byte[] e(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public static short[] f(short[] sArr) {
        if (sArr == null) {
            return null;
        }
        return (short[]) sArr.clone();
    }

    public static byte[] g(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return e(bArr2);
        }
        if (bArr2 == null) {
            return e(bArr);
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static byte[] h(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null) {
            return g(bArr2, bArr3);
        }
        if (bArr2 == null) {
            return g(bArr, bArr3);
        }
        if (bArr3 == null) {
            return g(bArr, bArr2);
        }
        byte[] bArr4 = new byte[bArr.length + bArr2.length + bArr3.length];
        System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        int length = bArr.length;
        System.arraycopy(bArr2, 0, bArr4, length, bArr2.length);
        System.arraycopy(bArr3, 0, bArr4, length + bArr2.length, bArr3.length);
        return bArr4;
    }

    public static byte[] i(byte[][] bArr) {
        int length = 0;
        for (int i10 = 0; i10 != bArr.length; i10++) {
            length += bArr[i10].length;
        }
        byte[] bArr2 = new byte[length];
        int length2 = 0;
        for (int i11 = 0; i11 != bArr.length; i11++) {
            byte[] bArr3 = bArr[i11];
            System.arraycopy(bArr3, 0, bArr2, length2, bArr3.length);
            length2 += bArr[i11].length;
        }
        return bArr2;
    }

    public static byte[] j(byte[] bArr, int i10) {
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i10));
        return bArr2;
    }

    public static byte[] k(byte[] bArr, int i10, int i11) {
        int iM = m(i10, i11);
        byte[] bArr2 = new byte[iM];
        System.arraycopy(bArr, i10, bArr2, 0, Math.min(bArr.length - i10, iM));
        return bArr2;
    }

    public static void l(byte[] bArr, byte b10) {
        Arrays.fill(bArr, b10);
    }

    private static int m(int i10, int i11) {
        int i12 = i11 - i10;
        if (i12 >= 0) {
            return i12;
        }
        throw new IllegalArgumentException(i10 + " > " + i11);
    }

    public static int n(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i10 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i10;
            }
            i10 = (i10 * 257) ^ bArr[length];
        }
    }

    public static int o(byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            return 0;
        }
        int i12 = i11 + 1;
        while (true) {
            i11--;
            if (i11 < 0) {
                return i12;
            }
            i12 = (i12 * 257) ^ bArr[i10 + i11];
        }
    }

    public static int p(char[] cArr) {
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i10 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i10;
            }
            i10 = (i10 * 257) ^ cArr[length];
        }
    }

    public static int q(int[] iArr) {
        if (iArr == null) {
            return 0;
        }
        int length = iArr.length;
        int i10 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i10;
            }
            i10 = (i10 * 257) ^ iArr[length];
        }
    }

    public static int r(short[] sArr) {
        if (sArr == null) {
            return 0;
        }
        int length = sArr.length;
        int i10 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i10;
            }
            i10 = (i10 * 257) ^ (sArr[length] & 255);
        }
    }

    public static byte[] s(byte[] bArr, byte b10) {
        if (bArr == null) {
            return new byte[]{b10};
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length + 1];
        System.arraycopy(bArr, 0, bArr2, 1, length);
        bArr2[0] = b10;
        return bArr2;
    }
}

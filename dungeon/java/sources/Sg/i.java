package Sg;

/* JADX INFO: loaded from: classes3.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f11823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[] f11825c;

    public i(b bVar, int i10) {
        this.f11823a = bVar;
        this.f11824b = i10;
        int[] iArr = new int[i10 + 1];
        this.f11825c = iArr;
        iArr[i10] = 1;
    }

    public i(b bVar, byte[] bArr) {
        this.f11823a = bVar;
        int i10 = 8;
        int i11 = 1;
        while (bVar.d() > i10) {
            i11++;
            i10 += 8;
        }
        if (bArr.length % i11 != 0) {
            throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
        }
        this.f11825c = new int[bArr.length / i11];
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr = this.f11825c;
            if (i12 >= iArr.length) {
                if (iArr.length != 1 && iArr[iArr.length - 1] == 0) {
                    throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
                }
                d();
                return;
            }
            int i14 = 0;
            while (i14 < i10) {
                int[] iArr2 = this.f11825c;
                iArr2[i12] = ((bArr[i13] & 255) << i14) ^ iArr2[i12];
                i14 += 8;
                i13++;
            }
            if (!this.f11823a.g(this.f11825c[i12])) {
                throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
            }
            i12++;
        }
    }

    public i(b bVar, int[] iArr) {
        this.f11823a = bVar;
        this.f11825c = q(iArr);
        d();
    }

    public i(i iVar) {
        this.f11823a = iVar.f11823a;
        this.f11824b = iVar.f11824b;
        this.f11825c = d.a(iVar.f11825c);
    }

    private int[] a(int[] iArr, int[] iArr2) {
        int[] iArr3;
        if (iArr.length < iArr2.length) {
            iArr3 = new int[iArr2.length];
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
        } else {
            iArr3 = new int[iArr.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            iArr = iArr2;
        }
        for (int length = iArr.length - 1; length >= 0; length--) {
            iArr3[length] = this.f11823a.a(iArr3[length], iArr[length]);
        }
        return iArr3;
    }

    private static int c(int[] iArr) {
        int length = iArr.length - 1;
        while (length >= 0 && iArr[length] == 0) {
            length--;
        }
        return length;
    }

    private void d() {
        int length = this.f11825c.length;
        do {
            this.f11824b = length - 1;
            length = this.f11824b;
            if (length < 0) {
                return;
            }
        } while (this.f11825c[length] == 0);
    }

    private static int i(int[] iArr) {
        int iC = c(iArr);
        if (iC == -1) {
            return 0;
        }
        return iArr[iC];
    }

    private static boolean j(int[] iArr, int[] iArr2) {
        int iC = c(iArr);
        if (iC != c(iArr2)) {
            return false;
        }
        for (int i10 = 0; i10 <= iC; i10++) {
            if (iArr[i10] != iArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    private int[] l(int[] iArr, int[] iArr2) {
        int iC = c(iArr2);
        if (iC == -1) {
            throw new ArithmeticException("Division by zero");
        }
        int length = iArr.length;
        int[] iArrA = new int[length];
        int iF = this.f11823a.f(i(iArr2));
        System.arraycopy(iArr, 0, iArrA, 0, length);
        while (iC <= c(iArrA)) {
            iArrA = a(o(p(iArr2, c(iArrA) - iC), this.f11823a.h(i(iArrA), iF)), iArrA);
        }
        return iArrA;
    }

    private int[] o(int[] iArr, int i10) {
        int iC = c(iArr);
        if (iC == -1 || i10 == 0) {
            return new int[1];
        }
        if (i10 == 1) {
            return d.a(iArr);
        }
        int[] iArr2 = new int[iC + 1];
        while (iC >= 0) {
            iArr2[iC] = this.f11823a.h(iArr[iC], i10);
            iC--;
        }
        return iArr2;
    }

    private static int[] p(int[] iArr, int i10) {
        int iC = c(iArr);
        if (iC == -1) {
            return new int[1];
        }
        int[] iArr2 = new int[iC + i10 + 1];
        System.arraycopy(iArr, 0, iArr2, i10, iC + 1);
        return iArr2;
    }

    private static int[] q(int[] iArr) {
        int iC = c(iArr);
        if (iC == -1) {
            return new int[1];
        }
        int i10 = iC + 1;
        if (iArr.length == i10) {
            return d.a(iArr);
        }
        int[] iArr2 = new int[i10];
        System.arraycopy(iArr, 0, iArr2, 0, i10);
        return iArr2;
    }

    public void b(i iVar) {
        this.f11825c = a(this.f11825c, iVar.f11825c);
        d();
    }

    public int e(int i10) {
        int[] iArr = this.f11825c;
        int i11 = this.f11824b;
        int iH = iArr[i11];
        for (int i12 = i11 - 1; i12 >= 0; i12--) {
            iH = this.f11823a.h(iH, i10) ^ this.f11825c[i12];
        }
        return iH;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof i)) {
            i iVar = (i) obj;
            if (this.f11823a.equals(iVar.f11823a) && this.f11824b == iVar.f11824b && j(this.f11825c, iVar.f11825c)) {
                return true;
            }
        }
        return false;
    }

    public int f(int i10) {
        if (i10 < 0 || i10 > this.f11824b) {
            return 0;
        }
        return this.f11825c[i10];
    }

    public int g() {
        int[] iArr = this.f11825c;
        int length = iArr.length - 1;
        if (iArr[length] == 0) {
            return -1;
        }
        return length;
    }

    public byte[] h() {
        int i10 = 8;
        int i11 = 1;
        while (this.f11823a.d() > i10) {
            i11++;
            i10 += 8;
        }
        byte[] bArr = new byte[this.f11825c.length * i11];
        int i12 = 0;
        for (int i13 = 0; i13 < this.f11825c.length; i13++) {
            int i14 = 0;
            while (i14 < i10) {
                bArr[i12] = (byte) (this.f11825c[i13] >>> i14);
                i14 += 8;
                i12++;
            }
        }
        return bArr;
    }

    public int hashCode() {
        int iHashCode = this.f11823a.hashCode();
        int i10 = 0;
        while (true) {
            int[] iArr = this.f11825c;
            if (i10 >= iArr.length) {
                return iHashCode;
            }
            iHashCode = (iHashCode * 31) + iArr[i10];
            i10++;
        }
    }

    public i k(i iVar) {
        return new i(this.f11823a, l(this.f11825c, iVar.f11825c));
    }

    public void m(int i10) {
        if (!this.f11823a.g(i10)) {
            throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
        }
        this.f11825c = o(this.f11825c, i10);
        d();
    }

    public i n(int i10) {
        if (!this.f11823a.g(i10)) {
            throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
        }
        return new i(this.f11823a, o(this.f11825c, i10));
    }

    public String toString() {
        String str = " Polynomial over " + this.f11823a.toString() + ": \n";
        for (int i10 = 0; i10 < this.f11825c.length; i10++) {
            str = str + this.f11823a.b(this.f11825c[i10]) + "Y^" + i10 + "+";
        }
        return str + ";";
    }
}

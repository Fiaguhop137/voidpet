package Sg;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f11811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11812b;

    public b(byte[] bArr) {
        this.f11811a = 0;
        if (bArr.length != 4) {
            throw new IllegalArgumentException("byte array is not an encoded finite field");
        }
        int iD = f.d(bArr);
        this.f11812b = iD;
        if (!j.c(iD)) {
            throw new IllegalArgumentException("byte array is not an encoded finite field");
        }
        this.f11811a = j.a(this.f11812b);
    }

    private static String i(int i10) {
        if (i10 == 0) {
            return "0";
        }
        String str = ((byte) (i10 & 1)) == 1 ? "1" : "";
        int i11 = i10 >>> 1;
        int i12 = 1;
        while (i11 != 0) {
            if (((byte) (i11 & 1)) == 1) {
                str = str + "+x^" + i12;
            }
            i11 >>>= 1;
            i12++;
        }
        return str;
    }

    public int a(int i10, int i11) {
        return i10 ^ i11;
    }

    public String b(int i10) {
        StringBuilder sb2;
        String str;
        String string = "";
        for (int i11 = 0; i11 < this.f11811a; i11++) {
            if ((((byte) i10) & 1) == 0) {
                sb2 = new StringBuilder();
                str = "0";
            } else {
                sb2 = new StringBuilder();
                str = "1";
            }
            sb2.append(str);
            sb2.append(string);
            string = sb2.toString();
            i10 >>>= 1;
        }
        return string;
    }

    public int c(int i10, int i11) {
        if (i11 == 0) {
            return 1;
        }
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 1) {
            return 1;
        }
        if (i11 < 0) {
            i10 = f(i10);
            i11 = -i11;
        }
        int iH = 1;
        while (i11 != 0) {
            if ((i11 & 1) == 1) {
                iH = h(iH, i10);
            }
            i10 = h(i10, i10);
            i11 >>>= 1;
        }
        return iH;
    }

    public int d() {
        return this.f11811a;
    }

    public byte[] e() {
        return f.c(this.f11812b);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof b)) {
            b bVar = (b) obj;
            if (this.f11811a == bVar.f11811a && this.f11812b == bVar.f11812b) {
                return true;
            }
        }
        return false;
    }

    public int f(int i10) {
        return c(i10, (1 << this.f11811a) - 2);
    }

    public boolean g(int i10) {
        int i11 = this.f11811a;
        if (i11 == 31) {
            return i10 >= 0;
        }
        return i10 >= 0 && i10 < (1 << i11);
    }

    public int h(int i10, int i11) {
        return j.d(i10, i11, this.f11812b);
    }

    public int hashCode() {
        return this.f11812b;
    }

    public String toString() {
        return "Finite Field GF(2^" + this.f11811a + ") = GF(2)[X]/<" + i(this.f11812b) + "> ";
    }
}

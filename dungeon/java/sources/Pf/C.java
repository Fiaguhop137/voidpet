package Pf;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class C extends AbstractC1333y implements Iterable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final L f9041c = new a(C.class, 17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final InterfaceC1301e[] f9042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected InterfaceC1301e[] f9043b;

    static class a extends L {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // Pf.L
        AbstractC1333y c(B b10) {
            return b10.F();
        }
    }

    protected C() {
        InterfaceC1301e[] interfaceC1301eArr = C1303f.f9121d;
        this.f9042a = interfaceC1301eArr;
        this.f9043b = interfaceC1301eArr;
    }

    protected C(C1303f c1303f, boolean z10) {
        InterfaceC1301e[] interfaceC1301eArrG;
        if (c1303f == null) {
            throw new NullPointerException("'elementVector' cannot be null");
        }
        if (!z10 || c1303f.f() < 2) {
            interfaceC1301eArrG = c1303f.g();
        } else {
            interfaceC1301eArrG = c1303f.c();
            A(interfaceC1301eArrG);
        }
        this.f9042a = interfaceC1301eArrG;
        if (!z10 && interfaceC1301eArrG.length >= 2) {
            interfaceC1301eArrG = null;
        }
        this.f9043b = interfaceC1301eArrG;
    }

    C(boolean z10, InterfaceC1301e[] interfaceC1301eArr) {
        this.f9042a = interfaceC1301eArr;
        if (!z10 && interfaceC1301eArr.length >= 2) {
            interfaceC1301eArr = null;
        }
        this.f9043b = interfaceC1301eArr;
    }

    C(InterfaceC1301e[] interfaceC1301eArr, InterfaceC1301e[] interfaceC1301eArr2) {
        this.f9042a = interfaceC1301eArr;
        this.f9043b = interfaceC1301eArr2;
    }

    private static void A(InterfaceC1301e[] interfaceC1301eArr) {
        int i10;
        int length = interfaceC1301eArr.length;
        if (length < 2) {
            return;
        }
        InterfaceC1301e interfaceC1301e = interfaceC1301eArr[0];
        InterfaceC1301e interfaceC1301e2 = interfaceC1301eArr[1];
        byte[] bArrW = w(interfaceC1301e);
        byte[] bArrW2 = w(interfaceC1301e2);
        if (y(bArrW2, bArrW)) {
            interfaceC1301e2 = interfaceC1301e;
            interfaceC1301e = interfaceC1301e2;
            bArrW2 = bArrW;
            bArrW = bArrW2;
        }
        for (int i11 = 2; i11 < length; i11++) {
            InterfaceC1301e interfaceC1301e3 = interfaceC1301eArr[i11];
            byte[] bArrW3 = w(interfaceC1301e3);
            if (y(bArrW2, bArrW3)) {
                interfaceC1301eArr[i11 - 2] = interfaceC1301e;
                interfaceC1301e = interfaceC1301e2;
                bArrW = bArrW2;
                interfaceC1301e2 = interfaceC1301e3;
                bArrW2 = bArrW3;
            } else if (y(bArrW, bArrW3)) {
                interfaceC1301eArr[i11 - 2] = interfaceC1301e;
                interfaceC1301e = interfaceC1301e3;
                bArrW = bArrW3;
            } else {
                int i12 = i11 - 1;
                while (true) {
                    i10 = i12 - 1;
                    if (i10 <= 0) {
                        break;
                    }
                    InterfaceC1301e interfaceC1301e4 = interfaceC1301eArr[i12 - 2];
                    if (y(w(interfaceC1301e4), bArrW3)) {
                        break;
                    }
                    interfaceC1301eArr[i10] = interfaceC1301e4;
                    i12 = i10;
                }
                interfaceC1301eArr[i10] = interfaceC1301e3;
            }
        }
        interfaceC1301eArr[length - 2] = interfaceC1301e;
        interfaceC1301eArr[length - 1] = interfaceC1301e2;
    }

    private static byte[] w(InterfaceC1301e interfaceC1301e) {
        try {
            return interfaceC1301e.g().i("DER");
        } catch (IOException unused) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }

    public static C x(G g10, boolean z10) {
        return (C) f9041c.e(g10, z10);
    }

    private static boolean y(byte[] bArr, byte[] bArr2) {
        int i10 = bArr[0] & 223;
        int i11 = bArr2[0] & 223;
        if (i10 != i11) {
            return i10 < i11;
        }
        int iMin = Math.min(bArr.length, bArr2.length) - 1;
        for (int i12 = 1; i12 < iMin; i12++) {
            byte b10 = bArr[i12];
            byte b11 = bArr2[i12];
            if (b10 != b11) {
                return (b10 & 255) < (b11 & 255);
            }
        }
        return (bArr[iMin] & 255) <= (bArr2[iMin] & 255);
    }

    public InterfaceC1301e[] B() {
        return C1303f.b(this.f9042a);
    }

    @Override // Pf.AbstractC1333y, Pf.r
    public int hashCode() {
        int length = this.f9042a.length;
        int iHashCode = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return iHashCode;
            }
            iHashCode += this.f9042a[length].g().hashCode();
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new Ug.a.C0190a(B());
    }

    @Override // Pf.AbstractC1333y
    boolean j(AbstractC1333y abstractC1333y) {
        if (!(abstractC1333y instanceof C)) {
            return false;
        }
        C c10 = (C) abstractC1333y;
        int size = size();
        if (c10.size() != size) {
            return false;
        }
        s0 s0Var = (s0) t();
        s0 s0Var2 = (s0) c10.t();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC1333y abstractC1333yG = s0Var.f9042a[i10].g();
            AbstractC1333y abstractC1333yG2 = s0Var2.f9042a[i10].g();
            if (abstractC1333yG != abstractC1333yG2 && !abstractC1333yG.j(abstractC1333yG2)) {
                return false;
            }
        }
        return true;
    }

    @Override // Pf.AbstractC1333y
    boolean l() {
        return true;
    }

    public int size() {
        return this.f9042a.length;
    }

    @Override // Pf.AbstractC1333y
    AbstractC1333y t() {
        if (this.f9043b == null) {
            InterfaceC1301e[] interfaceC1301eArr = (InterfaceC1301e[]) this.f9042a.clone();
            this.f9043b = interfaceC1301eArr;
            A(interfaceC1301eArr);
        }
        return new s0(true, this.f9043b);
    }

    public String toString() {
        int size = size();
        if (size == 0) {
            return "[]";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        int i10 = 0;
        while (true) {
            stringBuffer.append(this.f9042a[i10]);
            i10++;
            if (i10 >= size) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }

    @Override // Pf.AbstractC1333y
    AbstractC1333y v() {
        return new G0(this.f9042a, this.f9043b);
    }
}

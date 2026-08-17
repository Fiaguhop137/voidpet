package Pf;

/* JADX INFO: loaded from: classes3.dex */
public abstract class K extends AbstractC1333y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final L f9067b = new a(K.class, 28);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final char[] f9068c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final byte[] f9069a;

    static class a extends L {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // Pf.L
        AbstractC1333y d(C1320n0 c1320n0) {
            return K.w(c1320n0.A());
        }
    }

    K(byte[] bArr, boolean z10) {
        this.f9069a = z10 ? Ug.a.e(bArr) : bArr;
    }

    static K w(byte[] bArr) {
        return new w0(bArr, false);
    }

    private static void x(StringBuffer stringBuffer, int i10) {
        char[] cArr = f9068c;
        stringBuffer.append(cArr[(i10 >>> 4) & 15]);
        stringBuffer.append(cArr[i10 & 15]);
    }

    private static void y(StringBuffer stringBuffer, int i10) {
        int i11;
        if (i10 < 128) {
            x(stringBuffer, i10);
            return;
        }
        byte[] bArr = new byte[5];
        int i12 = 5;
        while (true) {
            i11 = i12 - 1;
            bArr[i11] = (byte) i10;
            i10 >>>= 8;
            if (i10 == 0) {
                break;
            } else {
                i12 = i11;
            }
        }
        int i13 = i12 - 2;
        bArr[i13] = (byte) ((5 - i11) | 128);
        while (true) {
            int i14 = i13 + 1;
            x(stringBuffer, bArr[i13]);
            if (i14 >= 5) {
                return;
            } else {
                i13 = i14;
            }
        }
    }

    public final String A() {
        int length = this.f9069a.length;
        StringBuffer stringBuffer = new StringBuffer(((C1331w.f(length) + length) * 2) + 3);
        stringBuffer.append("#1C");
        y(stringBuffer, length);
        for (int i10 = 0; i10 < length; i10++) {
            x(stringBuffer, this.f9069a[i10]);
        }
        return stringBuffer.toString();
    }

    @Override // Pf.AbstractC1333y, Pf.r
    public final int hashCode() {
        return Ug.a.n(this.f9069a);
    }

    @Override // Pf.AbstractC1333y
    final boolean j(AbstractC1333y abstractC1333y) {
        if (abstractC1333y instanceof K) {
            return Ug.a.b(this.f9069a, ((K) abstractC1333y).f9069a);
        }
        return false;
    }

    @Override // Pf.AbstractC1333y
    final void k(C1331w c1331w, boolean z10) {
        c1331w.o(z10, 28, this.f9069a);
    }

    @Override // Pf.AbstractC1333y
    final boolean l() {
        return false;
    }

    @Override // Pf.AbstractC1333y
    final int p(boolean z10) {
        return C1331w.g(z10, this.f9069a.length);
    }

    public String toString() {
        return A();
    }
}

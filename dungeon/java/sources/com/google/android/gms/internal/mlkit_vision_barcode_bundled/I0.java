package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class I0 implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final I0 f33335b = new H0(AbstractC2743r1.f34293b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f33336a = 0;

    static {
        int i10 = AbstractC2767w0.f34333a;
    }

    I0() {
    }

    static void A(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
    }

    private static I0 e(Iterator it, int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i10)));
        }
        if (i10 == 1) {
            return (I0) it.next();
        }
        int i11 = i10 >>> 1;
        I0 i0E = e(it, i11);
        I0 i0E2 = e(it, i10 - i11);
        if (Integer.MAX_VALUE - i0E.g() >= i0E2.g()) {
            return C2670c2.G(i0E, i0E2);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + i0E.g() + "+" + i0E2.g());
    }

    static int s(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
        }
        throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
    }

    public static I0 w(byte[] bArr, int i10, int i11) {
        s(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new H0(bArr2);
    }

    public static I0 x(InputStream inputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        int iMin = 256;
        while (true) {
            byte[] bArr = new byte[iMin];
            int i10 = 0;
            while (i10 < iMin) {
                int i11 = inputStream.read(bArr, i10, iMin - i10);
                if (i11 == -1) {
                    break;
                }
                i10 += i11;
            }
            I0 i0W = i10 == 0 ? null : w(bArr, 0, i10);
            if (i0W == null) {
                break;
            }
            arrayList.add(i0W);
            iMin = Math.min(iMin + iMin, 8192);
        }
        int size = arrayList.size();
        return size == 0 ? f33335b : e(arrayList.iterator(), size);
    }

    public final void B(byte[] bArr, int i10, int i11, int i12) {
        s(0, i12, g());
        s(i11, i11 + i12, bArr.length);
        if (i12 > 0) {
            h(bArr, 0, i11, i12);
        }
    }

    public final byte[] C() {
        int iG = g();
        if (iG == 0) {
            return AbstractC2743r1.f34293b;
        }
        byte[] bArr = new byte[iG];
        h(bArr, 0, 0, iG);
        return bArr;
    }

    public abstract byte a(int i10);

    abstract byte c(int i10);

    public abstract boolean equals(Object obj);

    public abstract int g();

    protected abstract void h(byte[] bArr, int i10, int i11, int i12);

    public final int hashCode() {
        int iK = this.f33336a;
        if (iK == 0) {
            int iG = g();
            iK = k(iG, 0, iG);
            if (iK == 0) {
                iK = 1;
            }
            this.f33336a = iK;
        }
        return iK;
    }

    protected abstract int i();

    protected abstract boolean j();

    protected abstract int k(int i10, int i11, int i12);

    protected abstract int l(int i10, int i11, int i12);

    public abstract I0 n(int i10, int i11);

    protected abstract String o(Charset charset);

    abstract void p(AbstractC2782z0 abstractC2782z0);

    public abstract boolean q();

    protected final int t() {
        return this.f33336a;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(g()), g() <= 50 ? AbstractC2730o2.a(this) : AbstractC2730o2.a(n(0, 47)).concat("..."));
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public E0 iterator() {
        return new A0(this);
    }

    public final String y() {
        return g() == 0 ? "" : o(AbstractC2743r1.f34292a);
    }
}

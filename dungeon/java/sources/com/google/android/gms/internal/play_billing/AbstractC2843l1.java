package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.l1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2843l1 implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC2843l1 f34755b = new C2833j1(M1.f34481b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f34756a = 0;

    static {
        int i10 = AbstractC2788a1.f34683a;
    }

    AbstractC2843l1() {
    }

    static int k(int i10, int i11, int i12) {
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

    public static AbstractC2843l1 l(byte[] bArr, int i10, int i11) {
        try {
            k(i10, i10 + i11, bArr.length);
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return new C2833j1(bArr2);
        } catch (O1 e10) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e10);
        }
    }

    static /* bridge */ /* synthetic */ boolean n(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        int i13 = i10 + i12;
        k(i10, i13, bArr.length);
        k(i11, i12 + i11, bArr2.length);
        while (i10 < i13) {
            if (bArr[i10] != bArr2[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    public abstract byte a(int i10);

    abstract byte c(int i10);

    protected abstract int e(int i10, int i11, int i12);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2843l1)) {
            return false;
        }
        AbstractC2843l1 abstractC2843l1 = (AbstractC2843l1) obj;
        int iG = g();
        if (iG != abstractC2843l1.g()) {
            return false;
        }
        if (iG == 0) {
            return true;
        }
        int i10 = this.f34756a;
        int i11 = abstractC2843l1.f34756a;
        if (i10 == 0 || i11 == 0 || i10 == i11) {
            return j(abstractC2843l1);
        }
        return false;
    }

    public abstract int g();

    public abstract AbstractC2843l1 h(int i10, int i11);

    public final int hashCode() {
        int iE = this.f34756a;
        if (iE == 0) {
            int iG = g();
            iE = e(iG, 0, iG);
            if (iE == 0) {
                iE = 1;
            }
            this.f34756a = iE;
        }
        return iE;
    }

    abstract void i(AbstractC2803d1 abstractC2803d1);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C2808e1(this);
    }

    protected abstract boolean j(AbstractC2843l1 abstractC2843l1);

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(g()), g() <= 50 ? AbstractC2864p2.a(this) : AbstractC2864p2.a(h(0, 47)).concat("..."));
    }
}

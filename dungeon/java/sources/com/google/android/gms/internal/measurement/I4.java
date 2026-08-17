package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class I4 implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final I4 f32539b = new H4(AbstractC2524k5.f32966b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32540a = 0;

    static {
        int i10 = AbstractC2630w4.f33166a;
    }

    I4() {
    }

    public static I4 j(byte[] bArr, int i10, int i11) {
        l(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new H4(bArr2);
    }

    static int l(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 21);
            sb2.append("Beginning index: ");
            sb2.append(i10);
            sb2.append(" < 0");
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i11 < i10) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(i10).length() + 44 + String.valueOf(i11).length());
            sb3.append("Beginning index larger than ending index: ");
            sb3.append(i10);
            sb3.append(", ");
            sb3.append(i11);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder(String.valueOf(i11).length() + 15 + String.valueOf(i12).length());
        sb4.append("End index: ");
        sb4.append(i11);
        sb4.append(" >= ");
        sb4.append(i12);
        throw new IndexOutOfBoundsException(sb4.toString());
    }

    public abstract byte a(int i10);

    abstract byte c(int i10);

    public abstract int e();

    public abstract boolean equals(Object obj);

    public abstract I4 g(int i10, int i11);

    abstract void h(AbstractC2654z4 abstractC2654z4);

    public final int hashCode() {
        int i10 = this.f32540a;
        if (i10 == 0) {
            int iE = e();
            i10 = i(iE, 0, iE);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f32540a = i10;
        }
        return i10;
    }

    protected abstract int i(int i10, int i11, int i12);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new B4(this);
    }

    protected final int k() {
        return this.f32540a;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(e()), e() <= 50 ? Y5.a(this) : Y5.a(g(0, 47)).concat("..."));
    }
}

package com.google.android.gms.internal.auth;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2402q0 implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC2402q0 f32443b = new C2393n0(G0.f32219d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Comparator f32444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C2399p0 f32445d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32446a = 0;

    static {
        int i10 = AbstractC2363d0.f32305a;
        f32445d = new C2399p0(null);
        f32444c = new C2375h0();
    }

    AbstractC2402q0() {
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

    public static AbstractC2402q0 n(byte[] bArr, int i10, int i11) {
        k(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new C2393n0(bArr2);
    }

    public abstract byte a(int i10);

    abstract byte c(int i10);

    public abstract int e();

    public abstract boolean equals(Object obj);

    protected abstract int g(int i10, int i11, int i12);

    public abstract AbstractC2402q0 h(int i10, int i11);

    public final int hashCode() {
        int iG = this.f32446a;
        if (iG == 0) {
            int iE = e();
            iG = g(iE, 0, iE);
            if (iG == 0) {
                iG = 1;
            }
            this.f32446a = iG;
        }
        return iG;
    }

    protected abstract String i(Charset charset);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C2372g0(this);
    }

    public abstract boolean j();

    protected final int l() {
        return this.f32446a;
    }

    public final String o(Charset charset) {
        return e() == 0 ? "" : i(charset);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(e()), e() <= 50 ? AbstractC2394n1.a(this) : AbstractC2394n1.a(h(0, 47)).concat("..."));
    }
}

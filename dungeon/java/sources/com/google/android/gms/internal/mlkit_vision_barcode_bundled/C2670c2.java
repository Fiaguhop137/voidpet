package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.c2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2670c2 extends I0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int[] f33468h = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f33469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final I0 f33470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final I0 f33471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f33472f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f33473g;

    private C2670c2(I0 i10, I0 i11) {
        this.f33470d = i10;
        this.f33471e = i11;
        int iG = i10.g();
        this.f33472f = iG;
        this.f33469c = iG + i11.g();
        this.f33473g = Math.max(i10.i(), i11.i()) + 1;
    }

    /* synthetic */ C2670c2(I0 i10, I0 i11, AbstractC2665b2 abstractC2665b2) {
        this(i10, i11);
    }

    static int D(int i10) {
        int[] iArr = f33468h;
        int length = iArr.length;
        if (i10 >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i10];
    }

    static I0 G(I0 i10, I0 i11) {
        if (i11.g() == 0) {
            return i10;
        }
        if (i10.g() == 0) {
            return i11;
        }
        int iG = i10.g() + i11.g();
        if (iG < 128) {
            return H(i10, i11);
        }
        if (i10 instanceof C2670c2) {
            C2670c2 c2670c2 = (C2670c2) i10;
            if (c2670c2.f33471e.g() + i11.g() < 128) {
                return new C2670c2(c2670c2.f33470d, H(c2670c2.f33471e, i11));
            }
            if (c2670c2.f33470d.i() > c2670c2.f33471e.i() && c2670c2.f33473g > i11.i()) {
                return new C2670c2(c2670c2.f33470d, new C2670c2(c2670c2.f33471e, i11));
            }
        }
        return iG >= D(Math.max(i10.i(), i11.i()) + 1) ? new C2670c2(i10, i11) : X1.a(new X1(null), i10, i11);
    }

    private static I0 H(I0 i10, I0 i11) {
        int iG = i10.g();
        int iG2 = i11.g();
        byte[] bArr = new byte[iG + iG2];
        i10.B(bArr, 0, 0, iG);
        i11.B(bArr, 0, iG, iG2);
        return new H0(bArr);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I0
    public final byte a(int i10) {
        I0.A(i10, this.f33469c);
        return c(i10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I0
    final byte c(int i10) {
        int i11 = this.f33472f;
        return i10 < i11 ? this.f33470d.c(i10) : this.f33471e.c(i10 - i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof I0)) {
            return false;
        }
        I0 i10 = (I0) obj;
        if (this.f33469c != i10.g()) {
            return false;
        }
        if (this.f33469c == 0) {
            return true;
        }
        int iT = t();
        int iT2 = i10.t();
        if (iT != 0 && iT2 != 0 && iT != iT2) {
            return false;
        }
        C2660a2 c2660a2 = new C2660a2(this, null);
        G0 g0A = c2660a2.a();
        C2660a2 c2660a3 = new C2660a2(i10, null);
        G0 g0A2 = c2660a3.a();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int iG = g0A.g() - i11;
            int iG2 = g0A2.g() - i12;
            int iMin = Math.min(iG, iG2);
            if (!(i11 == 0 ? g0A.D(g0A2, i12, iMin) : g0A2.D(g0A, i11, iMin))) {
                return false;
            }
            i13 += iMin;
            int i14 = this.f33469c;
            if (i13 >= i14) {
                if (i13 == i14) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iG) {
                g0A = c2660a2.a();
                i11 = 0;
            } else {
                i11 += iMin;
            }
            if (iMin == iG2) {
                g0A = g0A;
                g0A2 = c2660a3.a();
                i12 = 0;
            } else {
                g0A = g0A;
                i12 += iMin;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I0
    public final int g() {
        return this.f33469c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I0
    protected final void h(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        int i14 = this.f33472f;
        if (i13 <= i14) {
            this.f33470d.h(bArr, i10, i11, i12);
        } else {
            if (i10 >= i14) {
                this.f33471e.h(bArr, i10 - i14, i11, i12);
                return;
            }
            int i15 = i14 - i10;
            this.f33470d.h(bArr, i10, i11, i15);
            this.f33471e.h(bArr, 0, i11 + i15, i12 - i15);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I0
    protected final int i() {
        return this.f33473g;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I0, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new V1(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I0
    protected final boolean j() {
        return this.f33469c >= D(this.f33473g);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I0
    protected final int k(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f33472f;
        if (i13 <= i14) {
            return this.f33470d.k(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f33471e.k(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f33471e.k(this.f33470d.k(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I0
    protected final int l(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f33472f;
        if (i13 <= i14) {
            return this.f33470d.l(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f33471e.l(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f33471e.l(this.f33470d.l(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I0
    public final I0 n(int i10, int i11) {
        int iS = I0.s(i10, i11, this.f33469c);
        if (iS == 0) {
            return I0.f33335b;
        }
        if (iS == this.f33469c) {
            return this;
        }
        int i12 = this.f33472f;
        if (i11 <= i12) {
            return this.f33470d.n(i10, i11);
        }
        if (i10 >= i12) {
            return this.f33471e.n(i10 - i12, i11 - i12);
        }
        I0 i13 = this.f33470d;
        return new C2670c2(i13.n(i10, i13.g()), this.f33471e.n(0, i11 - this.f33472f));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I0
    protected final String o(Charset charset) {
        return new String(C(), charset);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I0
    final void p(AbstractC2782z0 abstractC2782z0) {
        this.f33470d.p(abstractC2782z0);
        this.f33471e.p(abstractC2782z0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I0
    public final boolean q() {
        I0 i10 = this.f33470d;
        I0 i11 = this.f33471e;
        return i11.l(i10.l(0, 0, this.f33472f), 0, i11.g()) == 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I0
    /* JADX INFO: renamed from: v */
    public final E0 iterator() {
        return new V1(this);
    }
}

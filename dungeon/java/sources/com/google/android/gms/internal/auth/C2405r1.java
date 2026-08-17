package com.google.android.gms.internal.auth;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2405r1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final C2405r1 f32448e = new C2405r1(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f32450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f32451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f32452d;

    private C2405r1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f32449a = i10;
        this.f32450b = iArr;
        this.f32451c = objArr;
        this.f32452d = z10;
    }

    public static C2405r1 a() {
        return f32448e;
    }

    static C2405r1 c(C2405r1 c2405r1, C2405r1 c2405r2) {
        int i10 = c2405r1.f32449a + c2405r2.f32449a;
        int[] iArrCopyOf = Arrays.copyOf(c2405r1.f32450b, i10);
        System.arraycopy(c2405r2.f32450b, 0, iArrCopyOf, c2405r1.f32449a, c2405r2.f32449a);
        Object[] objArrCopyOf = Arrays.copyOf(c2405r1.f32451c, i10);
        System.arraycopy(c2405r2.f32451c, 0, objArrCopyOf, c2405r1.f32449a, c2405r2.f32449a);
        return new C2405r1(i10, iArrCopyOf, objArrCopyOf, true);
    }

    static C2405r1 d() {
        return new C2405r1(0, new int[8], new Object[8], true);
    }

    private final void i(int i10) {
        int[] iArr = this.f32450b;
        if (i10 > iArr.length) {
            int i11 = this.f32449a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f32450b = Arrays.copyOf(iArr, i10);
            this.f32451c = Arrays.copyOf(this.f32451c, i10);
        }
    }

    final C2405r1 b(C2405r1 c2405r1) {
        if (c2405r1.equals(f32448e)) {
            return this;
        }
        e();
        int i10 = this.f32449a + c2405r1.f32449a;
        i(i10);
        System.arraycopy(c2405r1.f32450b, 0, this.f32450b, this.f32449a, c2405r1.f32449a);
        System.arraycopy(c2405r1.f32451c, 0, this.f32451c, this.f32449a, c2405r1.f32449a);
        this.f32449a = i10;
        return this;
    }

    final void e() {
        if (!this.f32452d) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2405r1)) {
            return false;
        }
        C2405r1 c2405r1 = (C2405r1) obj;
        int i10 = this.f32449a;
        if (i10 == c2405r1.f32449a) {
            int[] iArr = this.f32450b;
            int[] iArr2 = c2405r1.f32450b;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.f32451c;
            Object[] objArr2 = c2405r1.f32451c;
            int i12 = this.f32449a;
            for (int i13 = 0; i13 < i12; i13++) {
                if (objArr[i13].equals(objArr2[i13])) {
                }
            }
            return true;
        }
        return false;
    }

    public final void f() {
        if (this.f32452d) {
            this.f32452d = false;
        }
    }

    final void g(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f32449a; i11++) {
            AbstractC2358b1.b(sb2, i10, String.valueOf(this.f32450b[i11] >>> 3), this.f32451c[i11]);
        }
    }

    final void h(int i10, Object obj) {
        e();
        i(this.f32449a + 1);
        int[] iArr = this.f32450b;
        int i11 = this.f32449a;
        iArr[i11] = i10;
        this.f32451c[i11] = obj;
        this.f32449a = i11 + 1;
    }

    public final int hashCode() {
        int i10 = this.f32449a;
        int i11 = i10 + 527;
        int[] iArr = this.f32450b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 * 31) + i12;
        Object[] objArr = this.f32451c;
        int i15 = this.f32449a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return (i14 * 31) + iHashCode;
    }
}

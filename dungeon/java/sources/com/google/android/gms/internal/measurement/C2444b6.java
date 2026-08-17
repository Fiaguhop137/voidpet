package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2444b6 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C2444b6 f32870f = new C2444b6(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f32872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f32873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f32874d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f32875e;

    private C2444b6(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f32871a = i10;
        this.f32872b = iArr;
        this.f32873c = objArr;
        this.f32875e = z10;
    }

    public static C2444b6 a() {
        return f32870f;
    }

    static C2444b6 b() {
        return new C2444b6(0, new int[8], new Object[8], true);
    }

    static C2444b6 c(C2444b6 c2444b6, C2444b6 c2444b7) {
        int i10 = c2444b6.f32871a + c2444b7.f32871a;
        int[] iArrCopyOf = Arrays.copyOf(c2444b6.f32872b, i10);
        System.arraycopy(c2444b7.f32872b, 0, iArrCopyOf, c2444b6.f32871a, c2444b7.f32871a);
        Object[] objArrCopyOf = Arrays.copyOf(c2444b6.f32873c, i10);
        System.arraycopy(c2444b7.f32873c, 0, objArrCopyOf, c2444b6.f32871a, c2444b7.f32871a);
        return new C2444b6(i10, iArrCopyOf, objArrCopyOf, true);
    }

    private final void l(int i10) {
        int[] iArr = this.f32872b;
        if (i10 > iArr.length) {
            int i11 = this.f32871a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f32872b = Arrays.copyOf(iArr, i10);
            this.f32873c = Arrays.copyOf(this.f32873c, i10);
        }
    }

    public final void d() {
        if (this.f32875e) {
            this.f32875e = false;
        }
    }

    final void e() {
        if (!this.f32875e) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2444b6)) {
            return false;
        }
        C2444b6 c2444b6 = (C2444b6) obj;
        int i10 = this.f32871a;
        if (i10 == c2444b6.f32871a) {
            int[] iArr = this.f32872b;
            int[] iArr2 = c2444b6.f32872b;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.f32873c;
            Object[] objArr2 = c2444b6.f32873c;
            int i12 = this.f32871a;
            for (int i13 = 0; i13 < i12; i13++) {
                if (objArr[i13].equals(objArr2[i13])) {
                }
            }
            return true;
        }
        return false;
    }

    public final void f(InterfaceC2552n6 interfaceC2552n6) {
        if (this.f32871a != 0) {
            for (int i10 = 0; i10 < this.f32871a; i10++) {
                int i11 = this.f32872b[i10];
                Object obj = this.f32873c[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    interfaceC2552n6.F(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    interfaceC2552n6.P(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    interfaceC2552n6.O(i13, (I4) obj);
                } else if (i12 == 3) {
                    interfaceC2552n6.H(i13);
                    ((C2444b6) obj).f(interfaceC2552n6);
                    interfaceC2552n6.I(i13);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(new C2533l5("Protocol message tag had invalid wire type."));
                    }
                    interfaceC2552n6.b(i13, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int g() {
        int i10 = this.f32874d;
        if (i10 != -1) {
            return i10;
        }
        int iE = 0;
        for (int i11 = 0; i11 < this.f32871a; i11++) {
            int i12 = this.f32872b[i11] >>> 3;
            I4 i13 = (I4) this.f32873c[i11];
            int iE2 = N4.E(8);
            int iE3 = N4.E(16) + N4.E(i12);
            int iE4 = N4.E(24);
            int iE5 = i13.e();
            iE += iE2 + iE2 + iE3 + iE4 + N4.E(iE5) + iE5;
        }
        this.f32874d = iE;
        return iE;
    }

    public final int h() {
        int iE;
        int iA;
        int iE2;
        int i10 = this.f32874d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f32871a; i12++) {
            int i13 = this.f32872b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.f32873c[i12]).getClass();
                    iE2 = N4.E(i14 << 3) + 8;
                } else if (i15 == 2) {
                    int i16 = i14 << 3;
                    I4 i17 = (I4) this.f32873c[i12];
                    int iE3 = N4.E(i16);
                    int iE4 = i17.e();
                    iE2 = iE3 + N4.E(iE4) + iE4;
                } else if (i15 == 3) {
                    int iE5 = N4.E(i14 << 3);
                    iE = iE5 + iE5;
                    iA = ((C2444b6) this.f32873c[i12]).h();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(new C2533l5("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.f32873c[i12]).getClass();
                    iE2 = N4.E(i14 << 3) + 4;
                }
                i11 += iE2;
            } else {
                int i18 = i14 << 3;
                long jLongValue = ((Long) this.f32873c[i12]).longValue();
                iE = N4.E(i18);
                iA = N4.a(jLongValue);
            }
            iE2 = iE + iA;
            i11 += iE2;
        }
        this.f32874d = i11;
        return i11;
    }

    public final int hashCode() {
        int i10 = this.f32871a;
        int i11 = i10 + 527;
        int[] iArr = this.f32872b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i11 * 31) + i12) * 31;
        Object[] objArr = this.f32873c;
        int i15 = this.f32871a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    final void i(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f32871a; i11++) {
            G5.b(sb2, i10, String.valueOf(this.f32872b[i11] >>> 3), this.f32873c[i11]);
        }
    }

    final void j(int i10, Object obj) {
        e();
        l(this.f32871a + 1);
        int[] iArr = this.f32872b;
        int i11 = this.f32871a;
        iArr[i11] = i10;
        this.f32873c[i11] = obj;
        this.f32871a = i11 + 1;
    }

    final C2444b6 k(C2444b6 c2444b6) {
        if (c2444b6.equals(f32870f)) {
            return this;
        }
        e();
        int i10 = this.f32871a + c2444b6.f32871a;
        l(i10);
        System.arraycopy(c2444b6.f32872b, 0, this.f32872b, this.f32871a, c2444b6.f32871a);
        System.arraycopy(c2444b6.f32873c, 0, this.f32873c, this.f32871a, c2444b6.f32871a);
        this.f32871a = i10;
        return this;
    }
}

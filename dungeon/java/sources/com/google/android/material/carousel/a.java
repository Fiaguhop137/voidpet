package com.google.android.material.carousel;

/* JADX INFO: loaded from: classes2.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f36371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f36372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f36373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f36374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float f36375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    float f36376f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f36377g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final float f36378h;

    a(int i10, float f10, float f11, float f12, int i11, float f13, int i12, float f14, int i13, float f15) {
        this.f36371a = i10;
        this.f36372b = p092f1.a.a(f10, f11, f12);
        this.f36373c = i11;
        this.f36375e = f13;
        this.f36374d = i12;
        this.f36376f = f14;
        this.f36377g = i13;
        d(f15, f11, f12, f14);
        this.f36378h = b(f14);
    }

    private float a(float f10, int i10, float f11, int i11, int i12) {
        if (i10 <= 0) {
            f11 = 0.0f;
        }
        float f12 = i11 / 2.0f;
        return (f10 - ((i10 + f12) * f11)) / (i12 + f12);
    }

    private float b(float f10) {
        if (g()) {
            return Math.abs(f10 - this.f36376f) * this.f36371a;
        }
        return Float.MAX_VALUE;
    }

    static a c(float f10, float f11, float f12, float f13, int[] iArr, float f14, int[] iArr2, float f15, int[] iArr3) {
        a aVar = null;
        int i10 = 1;
        for (int i11 : iArr3) {
            int length = iArr2.length;
            int i12 = 0;
            while (i12 < length) {
                int i13 = iArr2[i12];
                int length2 = iArr.length;
                int i14 = 0;
                while (i14 < length2) {
                    int i15 = length;
                    int i16 = i12;
                    int i17 = i10;
                    int i18 = length2;
                    int i19 = i14;
                    a aVar2 = new a(i17, f11, f12, f13, iArr[i14], f14, i13, f15, i11, f10);
                    if (aVar == null || aVar2.f36378h < aVar.f36378h) {
                        if (aVar2.f36378h == 0.0f) {
                            return aVar2;
                        }
                        aVar = aVar2;
                    }
                    int i20 = i17 + 1;
                    i14 = i19 + 1;
                    i12 = i16;
                    i10 = i20;
                    length = i15;
                    length2 = i18;
                }
                i12++;
                i10 = i10;
                length = length;
            }
        }
        return aVar;
    }

    private void d(float f10, float f11, float f12, float f13) {
        float f14 = f10 - f();
        int i10 = this.f36373c;
        if (i10 > 0 && f14 > 0.0f) {
            float f15 = this.f36372b;
            this.f36372b = f15 + Math.min(f14 / i10, f12 - f15);
        } else if (i10 > 0 && f14 < 0.0f) {
            float f16 = this.f36372b;
            this.f36372b = f16 + Math.max(f14 / i10, f11 - f16);
        }
        int i11 = this.f36373c;
        float f17 = i11 > 0 ? this.f36372b : 0.0f;
        this.f36372b = f17;
        float fA = a(f10, i11, f17, this.f36374d, this.f36377g);
        this.f36376f = fA;
        float f18 = (this.f36372b + fA) / 2.0f;
        this.f36375e = f18;
        int i12 = this.f36374d;
        if (i12 <= 0 || fA == f13) {
            return;
        }
        float f19 = (f13 - fA) * this.f36377g;
        float fMin = Math.min(Math.abs(f19), f18 * 0.1f * i12);
        if (f19 > 0.0f) {
            this.f36375e -= fMin / this.f36374d;
            this.f36376f += fMin / this.f36377g;
        } else {
            this.f36375e += fMin / this.f36374d;
            this.f36376f -= fMin / this.f36377g;
        }
    }

    private float f() {
        return (this.f36376f * this.f36377g) + (this.f36375e * this.f36374d) + (this.f36372b * this.f36373c);
    }

    private boolean g() {
        int i10 = this.f36377g;
        if (i10 <= 0 || this.f36373c <= 0 || this.f36374d <= 0) {
            return i10 <= 0 || this.f36373c <= 0 || this.f36376f > this.f36372b;
        }
        float f10 = this.f36376f;
        float f11 = this.f36375e;
        return f10 > f11 && f11 > this.f36372b;
    }

    int e() {
        return this.f36373c + this.f36374d + this.f36377g;
    }

    public String toString() {
        return "Arrangement [priority=" + this.f36371a + ", smallCount=" + this.f36373c + ", smallSize=" + this.f36372b + ", mediumCount=" + this.f36374d + ", mediumSize=" + this.f36375e + ", largeCount=" + this.f36377g + ", largeSize=" + this.f36376f + ", cost=" + this.f36378h + "]";
    }
}

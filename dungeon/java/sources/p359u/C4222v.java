package p359u;

import p037c0.N;

/* JADX INFO: renamed from: u.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4222v implements InterfaceC4223w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f54943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f54944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f54945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f54946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f54947e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f54948f;

    public C4222v(float f10, float f11, float f12, float f13) {
        this.f54943a = f10;
        this.f54944b = f11;
        this.f54945c = f12;
        this.f54946d = f13;
        if (!((Float.isNaN(f10) || Float.isNaN(f11) || Float.isNaN(f12) || Float.isNaN(f13)) ? false : true)) {
            I.a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f10 + ", " + f11 + ", " + f12 + ", " + f13 + '.');
        }
        long jB = N.b(0.0f, f11, f13, 1.0f, new float[5], 0);
        this.f54947e = Float.intBitsToFloat((int) (jB >> 32));
        this.f54948f = Float.intBitsToFloat((int) (jB & 4294967295L));
    }

    private final void b(float f10) {
        throw new IllegalArgumentException("The cubic curve with parameters (" + this.f54943a + ", " + this.f54944b + ", " + this.f54945c + ", " + this.f54946d + ") has no solution at " + f10);
    }

    @Override // p359u.InterfaceC4223w
    public float a(float f10) {
        if (f10 > 0.0f && f10 < 1.0f) {
            float fMax = Math.max(f10, 1.1920929E-7f);
            float fE = N.e(0.0f - fMax, this.f54943a - fMax, this.f54945c - fMax, 1.0f - fMax);
            if (Float.isNaN(fE)) {
                b(f10);
            }
            f10 = N.c(this.f54944b, this.f54946d, fE);
            float f11 = this.f54947e;
            float f12 = this.f54948f;
            if (f10 < f11) {
                f10 = f11;
            }
            if (f10 > f12) {
                return f12;
            }
        }
        return f10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4222v)) {
            return false;
        }
        C4222v c4222v = (C4222v) obj;
        return this.f54943a == c4222v.f54943a && this.f54944b == c4222v.f54944b && this.f54945c == c4222v.f54945c && this.f54946d == c4222v.f54946d;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f54943a) * 31) + Float.hashCode(this.f54944b)) * 31) + Float.hashCode(this.f54945c)) * 31) + Float.hashCode(this.f54946d);
    }

    public String toString() {
        return "CubicBezierEasing(a=" + this.f54943a + ", b=" + this.f54944b + ", c=" + this.f54945c + ", d=" + this.f54946d + ')';
    }
}

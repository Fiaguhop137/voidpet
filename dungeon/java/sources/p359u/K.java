package p359u;

/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f54797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f54798b = Math.sqrt(50.0d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f54799c = 1.0f;

    public K(float f10) {
        this.f54797a = f10;
    }

    public final float a() {
        return this.f54799c;
    }

    public final float b() {
        double d10 = this.f54798b;
        return (float) (d10 * d10);
    }

    public final void c(float f10) {
        if (f10 < 0.0f) {
            I.a("Damping ratio must be non-negative");
        }
        this.f54799c = f10;
    }

    public final void d(float f10) {
        this.f54797a = f10;
    }

    public final void e(float f10) {
        if (b() <= 0.0f) {
            I.a("Spring stiffness constant must be positive.");
        }
        this.f54798b = Math.sqrt(f10);
    }

    public final long f(float f10, float f11, long j10) {
        double dExp;
        double dExp2;
        float f12 = f10 - this.f54797a;
        double d10 = j10 / 1000.0d;
        float f13 = this.f54799c;
        double d11 = ((double) f13) * ((double) f13);
        double d12 = this.f54798b;
        double d13 = ((double) (-f13)) * d12;
        if (f13 > 1.0f) {
            double dSqrt = d12 * Math.sqrt(d11 - ((double) 1));
            double d14 = d13 + dSqrt;
            double d15 = d13 - dSqrt;
            double d16 = f12;
            double d17 = ((d15 * d16) - ((double) f11)) / (d15 - d14);
            double d18 = d16 - d17;
            double d19 = d15 * d10;
            double d20 = d10 * d14;
            dExp2 = (Math.exp(d19) * d18) + (Math.exp(d20) * d17);
            dExp = (d18 * d15 * Math.exp(d19)) + (d17 * d14 * Math.exp(d20));
        } else if (f13 == 1.0f) {
            double d21 = f12;
            double d22 = ((double) f11) + (d12 * d21);
            double d23 = (-d12) * d10;
            double d24 = d21 + (d10 * d22);
            dExp2 = d24 * Math.exp(d23);
            dExp = (d24 * Math.exp(d23) * (-this.f54798b)) + (d22 * Math.exp(d23));
        } else {
            double d25 = 1;
            double dSqrt2 = d12 * Math.sqrt(d25 - d11);
            double d26 = f12;
            double d27 = (d25 / dSqrt2) * (((-d13) * d26) + ((double) f11));
            double d28 = dSqrt2 * d10;
            double d29 = d10 * d13;
            double dExp3 = Math.exp(d29) * ((Math.cos(d28) * d26) + (Math.sin(d28) * d27));
            dExp = (d13 * dExp3) + (Math.exp(d29) * (((-dSqrt2) * d26 * Math.sin(d28)) + (dSqrt2 * d27 * Math.cos(d28))));
            dExp2 = dExp3;
        }
        return D.a((((long) Float.floatToRawIntBits((float) dExp)) & 4294967295L) | (Float.floatToRawIntBits((float) (dExp2 + ((double) this.f54797a))) << 32));
    }
}

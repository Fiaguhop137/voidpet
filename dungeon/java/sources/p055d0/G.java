package p055d0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f39533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f39534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f39535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f39536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final double f39537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final double f39538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final double f39539g;

    public G(double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.f39533a = d10;
        this.f39534b = d11;
        this.f39535c = d12;
        this.f39536d = d13;
        this.f39537e = d14;
        this.f39538f = d15;
        this.f39539g = d16;
        if (Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(d14) || Double.isNaN(d15) || Double.isNaN(d16) || Double.isNaN(d10)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (H.b(d10)) {
            return;
        }
        if (d14 < 0.0d || d14 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d14);
        }
        if (d14 == 0.0d && (d11 == 0.0d || d10 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d14 >= 1.0d && d13 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d11 == 0.0d || d10 == 0.0d) && d13 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d13 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d11 < 0.0d || d10 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    public /* synthetic */ G(double d10, double d11, double d12, double d13, double d14, double d15, double d16, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(d10, d11, d12, d13, d14, (i10 & 32) != 0 ? 0.0d : d15, (i10 & 64) != 0 ? 0.0d : d16);
    }

    public final double a() {
        return this.f39534b;
    }

    public final double b() {
        return this.f39535c;
    }

    public final double c() {
        return this.f39536d;
    }

    public final double d() {
        return this.f39537e;
    }

    public final double e() {
        return this.f39538f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g10 = (G) obj;
        return Double.compare(this.f39533a, g10.f39533a) == 0 && Double.compare(this.f39534b, g10.f39534b) == 0 && Double.compare(this.f39535c, g10.f39535c) == 0 && Double.compare(this.f39536d, g10.f39536d) == 0 && Double.compare(this.f39537e, g10.f39537e) == 0 && Double.compare(this.f39538f, g10.f39538f) == 0 && Double.compare(this.f39539g, g10.f39539g) == 0;
    }

    public final double f() {
        return this.f39539g;
    }

    public final double g() {
        return this.f39533a;
    }

    public final boolean h() {
        return this.f39533a == -3.0d;
    }

    public int hashCode() {
        return (((((((((((Double.hashCode(this.f39533a) * 31) + Double.hashCode(this.f39534b)) * 31) + Double.hashCode(this.f39535c)) * 31) + Double.hashCode(this.f39536d)) * 31) + Double.hashCode(this.f39537e)) * 31) + Double.hashCode(this.f39538f)) * 31) + Double.hashCode(this.f39539g);
    }

    public final boolean i() {
        return this.f39533a == -2.0d;
    }

    public String toString() {
        return "TransferParameters(gamma=" + this.f39533a + ", a=" + this.f39534b + ", b=" + this.f39535c + ", c=" + this.f39536d + ", d=" + this.f39537e + ", e=" + this.f39538f + ", f=" + this.f39539g + ')';
    }
}

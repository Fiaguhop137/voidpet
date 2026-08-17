package p344t2;

import U1.AbstractC1459a;
import android.util.Range;

/* JADX INFO: loaded from: classes.dex */
class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f54392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f54393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f54394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Range f54395d;

    public u(float f10) {
        AbstractC1459a.a(f10 > 0.0f);
        Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / ((double) f10)));
        this.f54395d = range;
        this.f54394c = ((Double) range.getUpper()).doubleValue();
        this.f54392a = -9223372036854775807L;
        this.f54393b = -9223372036854775807L;
    }

    private double a(long j10, long j11) {
        long j12 = this.f54392a;
        if (j12 != -9223372036854775807L) {
            long j13 = this.f54393b;
            if (j13 != -9223372036854775807L && j10 != j12) {
                return (j11 - j13) / (j10 - j12);
            }
        }
        return ((Double) this.f54395d.getUpper()).doubleValue();
    }

    private void f(double d10) {
        this.f54394c = (this.f54394c * 0.800000011920929d) + (d10 * 0.20000000298023224d);
    }

    public void b(long j10, long j11) {
        AbstractC1459a.a(j10 != -9223372036854775807L);
        AbstractC1459a.a(j11 != -9223372036854775807L);
        f(((Double) this.f54395d.clamp(Double.valueOf(a(j10, j11)))).doubleValue());
        this.f54392a = j10;
        this.f54393b = j11;
    }

    public long c(long j10) {
        long j11 = this.f54392a;
        if (j11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (long) (this.f54393b + ((j10 - j11) * this.f54394c));
    }

    public void d() {
        this.f54394c = ((Double) this.f54395d.getUpper()).doubleValue();
        this.f54392a = -9223372036854775807L;
        this.f54393b = -9223372036854775807L;
    }

    public void e(float f10) {
        AbstractC1459a.a(f10 > 0.0f);
        this.f54395d = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / ((double) f10)));
        d();
    }
}

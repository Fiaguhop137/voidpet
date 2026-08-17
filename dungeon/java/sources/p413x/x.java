package p413x;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p019b0.e;
import p216m0.z;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f57286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f57287b;

    private x(r rVar, long j10) {
        this.f57286a = rVar;
        this.f57287b = j10;
    }

    public /* synthetic */ x(r rVar, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(rVar, j10);
    }

    private final long b(float f10) {
        if (this.f57286a == null) {
            long j10 = this.f57287b;
            return e.p(this.f57287b, e.r(e.h(j10, e.k(j10)), f10));
        }
        float fD = d(this.f57287b) - (Math.signum(d(this.f57287b)) * f10);
        float fC = c(this.f57287b);
        if (this.f57286a == r.Horizontal) {
            return e.e((((long) Float.floatToRawIntBits(fD)) << 32) | (((long) Float.floatToRawIntBits(fC)) & 4294967295L));
        }
        return e.e((((long) Float.floatToRawIntBits(fC)) << 32) | (((long) Float.floatToRawIntBits(fD)) & 4294967295L));
    }

    public final long a(z zVar, float f10) {
        long jQ = e.q(this.f57287b, e.p(zVar.h(), zVar.k()));
        this.f57287b = jQ;
        return (this.f57286a == null ? e.k(jQ) : Math.abs(d(jQ))) >= f10 ? b(f10) : e.f25805b.b();
    }

    public final float c(long j10) {
        return Float.intBitsToFloat((int) (this.f57286a == r.Horizontal ? j10 & 4294967295L : j10 >> 32));
    }

    public final float d(long j10) {
        return Float.intBitsToFloat((int) (this.f57286a == r.Horizontal ? j10 >> 32 : j10 & 4294967295L));
    }

    public final void e() {
        this.f57287b = e.f25805b.c();
    }
}

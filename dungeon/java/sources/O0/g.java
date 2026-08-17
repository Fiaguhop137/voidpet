package O0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
final class g implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f8264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f8265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final P0.a f8266c;

    public g(float f10, float f11, P0.a aVar) {
        this.f8264a = f10;
        this.f8265b = f11;
        this.f8266c = aVar;
    }

    @Override // O0.l
    public long P(float f10) {
        return w.c(this.f8266c.a(f10));
    }

    @Override // O0.l
    public float S(long j10) {
        if (x.g(v.g(j10), x.f8301b.b())) {
            return h.o(this.f8266c.b(v.h(j10)));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    @Override // O0.l
    public float b1() {
        return this.f8265b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Float.compare(this.f8264a, gVar.f8264a) == 0 && Float.compare(this.f8265b, gVar.f8265b) == 0 && Intrinsics.b(this.f8266c, gVar.f8266c);
    }

    @Override // O0.d
    public float getDensity() {
        return this.f8264a;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f8264a) * 31) + Float.hashCode(this.f8265b)) * 31) + this.f8266c.hashCode();
    }

    public String toString() {
        return "DensityWithConverter(density=" + this.f8264a + ", fontScale=" + this.f8265b + ", converter=" + this.f8266c + ')';
    }
}

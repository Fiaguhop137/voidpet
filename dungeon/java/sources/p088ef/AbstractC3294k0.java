package p088ef;

import kotlin.collections.C3951m;
import p195kf.AbstractC3934l;

/* JADX INFO: renamed from: ef.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3294k0 extends K {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f40842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f40843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C3951m f40844e;

    public static /* synthetic */ void s0(AbstractC3294k0 abstractC3294k0, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        abstractC3294k0.r0(z10);
    }

    private final long t0(boolean z10) {
        return z10 ? 4294967296L : 1L;
    }

    public static /* synthetic */ void z0(AbstractC3294k0 abstractC3294k0, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        abstractC3294k0.y0(z10);
    }

    public final boolean B0() {
        return this.f40842c >= t0(true);
    }

    public final boolean G0() {
        C3951m c3951m = this.f40844e;
        if (c3951m != null) {
            return c3951m.isEmpty();
        }
        return true;
    }

    public abstract long J0();

    public final boolean N0() {
        AbstractC3276b0 abstractC3276b0;
        C3951m c3951m = this.f40844e;
        if (c3951m == null || (abstractC3276b0 = (AbstractC3276b0) c3951m.v()) == null) {
            return false;
        }
        abstractC3276b0.run();
        return true;
    }

    public boolean R0() {
        return false;
    }

    @Override // p088ef.K
    public final K m0(int i10, String str) {
        AbstractC3934l.a(i10);
        return AbstractC3934l.b(this, str);
    }

    public final void r0(boolean z10) {
        long jT0 = this.f40842c - t0(z10);
        this.f40842c = jT0;
        if (jT0 <= 0 && this.f40843d) {
            shutdown();
        }
    }

    public abstract void shutdown();

    public final void u0(AbstractC3276b0 abstractC3276b0) {
        C3951m c3951m = this.f40844e;
        if (c3951m == null) {
            c3951m = new C3951m();
            this.f40844e = c3951m;
        }
        c3951m.addLast(abstractC3276b0);
    }

    protected long v0() {
        C3951m c3951m = this.f40844e;
        return (c3951m == null || c3951m.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final void y0(boolean z10) {
        this.f40842c += t0(z10);
        if (z10) {
            return;
        }
        this.f40843d = true;
    }
}

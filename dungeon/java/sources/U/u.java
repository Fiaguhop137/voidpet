package U;

import I.AbstractC1040h0;
import I.C1;
import I.C1021b;

/* JADX INFO: loaded from: classes.dex */
public final class u extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1 f12619b;

    public u(C1 c10) {
        this.f12619b = c10;
    }

    @Override // U.a
    public int d(C1021b c1021b) {
        C1 c10 = this.f12619b;
        return c10.D(c10.z().c(c1021b));
    }

    @Override // U.a
    public AbstractC1040h0 g(C1021b c1021b) {
        return this.f12619b.z().G(this.f12619b.z().c(c1021b));
    }
}

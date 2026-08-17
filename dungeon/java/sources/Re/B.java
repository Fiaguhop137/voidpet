package Re;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class B extends A {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC1388d0 f11028b;

    public B(AbstractC1388d0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f11028b = delegate;
    }

    @Override // Re.M0
    /* JADX INFO: renamed from: U0 */
    public AbstractC1388d0 R0(boolean z10) {
        return z10 == O0() ? this : W0().R0(z10).T0(M0());
    }

    @Override // Re.M0
    /* JADX INFO: renamed from: V0 */
    public AbstractC1388d0 T0(r0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return newAttributes != M0() ? new C1392f0(this, newAttributes) : this;
    }

    @Override // Re.A
    protected AbstractC1388d0 W0() {
        return this.f11028b;
    }
}

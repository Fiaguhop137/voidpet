package Re;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class I extends M0 implements Ve.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC1388d0 f11047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC1388d0 f11048c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(AbstractC1388d0 lowerBound, AbstractC1388d0 upperBound) {
        super(null);
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
        this.f11047b = lowerBound;
        this.f11048c = upperBound;
    }

    @Override // Re.S
    public List L0() {
        return U0().L0();
    }

    @Override // Re.S
    public r0 M0() {
        return U0().M0();
    }

    @Override // Re.S
    public v0 N0() {
        return U0().N0();
    }

    @Override // Re.S
    public boolean O0() {
        return U0().O0();
    }

    public abstract AbstractC1388d0 U0();

    public final AbstractC1388d0 V0() {
        return this.f11047b;
    }

    public final AbstractC1388d0 W0() {
        return this.f11048c;
    }

    public abstract String X0(Ce.n nVar, Ce.w wVar);

    @Override // Re.S
    public Ke.k o() {
        return U0().o();
    }

    public String toString() {
        return Ce.n.f1888k.S(this);
    }
}

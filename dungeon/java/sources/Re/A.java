package Re;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class A extends AbstractC1388d0 {
    @Override // Re.S
    public List L0() {
        return W0().L0();
    }

    @Override // Re.S
    public r0 M0() {
        return W0().M0();
    }

    @Override // Re.S
    public v0 N0() {
        return W0().N0();
    }

    @Override // Re.S
    public boolean O0() {
        return W0().O0();
    }

    protected abstract AbstractC1388d0 W0();

    @Override // Re.M0
    public AbstractC1388d0 X0(Se.g kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        S sA = kotlinTypeRefiner.a(W0());
        Intrinsics.d(sA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return Y0((AbstractC1388d0) sA);
    }

    public abstract A Y0(AbstractC1388d0 abstractC1388d0);

    @Override // Re.S
    public Ke.k o() {
        return W0().o();
    }
}

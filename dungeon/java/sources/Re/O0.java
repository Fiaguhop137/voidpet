package Re;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class O0 extends S {
    public O0() {
        super(null);
    }

    @Override // Re.S
    public List L0() {
        return R0().L0();
    }

    @Override // Re.S
    public r0 M0() {
        return R0().M0();
    }

    @Override // Re.S
    public v0 N0() {
        return R0().N0();
    }

    @Override // Re.S
    public boolean O0() {
        return R0().O0();
    }

    @Override // Re.S
    public final M0 Q0() {
        S sR0 = R0();
        while (sR0 instanceof O0) {
            sR0 = ((O0) sR0).R0();
        }
        Intrinsics.d(sR0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (M0) sR0;
    }

    protected abstract S R0();

    public abstract boolean S0();

    @Override // Re.S
    public Ke.k o() {
        return R0().o();
    }

    public String toString() {
        return S0() ? R0().toString() : "<Not computed yet>";
    }
}

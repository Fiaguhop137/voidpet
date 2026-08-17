package Re;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public abstract class S implements p033be.a, Ve.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f11082a;

    private S() {
    }

    public /* synthetic */ S(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final int K0() {
        return W.a(this) ? super.hashCode() : (((N0().hashCode() * 31) + L0().hashCode()) * 31) + (O0() ? 1 : 0);
    }

    public abstract List L0();

    public abstract r0 M0();

    public abstract v0 N0();

    public abstract boolean O0();

    public abstract S P0(Se.g gVar);

    public abstract M0 Q0();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s10 = (S) obj;
        return O0() == s10.O0() && Se.t.f11639a.a(Q0(), s10.Q0());
    }

    @Override // p033be.a
    public p033be.h getAnnotations() {
        return AbstractC1414t.a(M0());
    }

    public final int hashCode() {
        int i10 = this.f11082a;
        if (i10 != 0) {
            return i10;
        }
        int iK0 = K0();
        this.f11082a = iK0;
        return iK0;
    }

    public abstract Ke.k o();
}

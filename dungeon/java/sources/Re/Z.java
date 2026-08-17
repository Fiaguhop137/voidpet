package Re;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
final class Z extends B {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(AbstractC1388d0 delegate) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
    }

    @Override // Re.A, Re.S
    public boolean O0() {
        return false;
    }

    @Override // Re.A
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public Z Y0(AbstractC1388d0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new Z(delegate);
    }
}

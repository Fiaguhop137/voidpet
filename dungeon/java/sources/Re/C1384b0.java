package Re;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Re.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C1384b0 extends B {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1384b0(AbstractC1388d0 delegate) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
    }

    @Override // Re.A, Re.S
    public boolean O0() {
        return true;
    }

    @Override // Re.A
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public C1384b0 Y0(AbstractC1388d0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new C1384b0(delegate);
    }
}

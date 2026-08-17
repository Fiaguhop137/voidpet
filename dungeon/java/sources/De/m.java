package De;

import kotlin.jvm.internal.Intrinsics;
import p015ae.InterfaceC1788b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m extends n {
    @Override // De.n
    public void b(InterfaceC1788b first, InterfaceC1788b second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        e(first, second);
    }

    @Override // De.n
    public void c(InterfaceC1788b fromSuper, InterfaceC1788b fromCurrent) {
        Intrinsics.checkNotNullParameter(fromSuper, "fromSuper");
        Intrinsics.checkNotNullParameter(fromCurrent, "fromCurrent");
        e(fromSuper, fromCurrent);
    }

    protected abstract void e(InterfaceC1788b interfaceC1788b, InterfaceC1788b interfaceC1788b2);
}

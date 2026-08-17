package I;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
final class W implements InterfaceC1076t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f4572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private X f4573b;

    public W(Function1 function1) {
        this.f4572a = function1;
    }

    @Override // I.InterfaceC1076t1
    public void g() {
        this.f4573b = (X) this.f4572a.invoke(AbstractC1022b0.f4602a);
    }

    @Override // I.InterfaceC1076t1
    public void j() {
    }

    @Override // I.InterfaceC1076t1
    public void l() {
        X x10 = this.f4573b;
        if (x10 != null) {
            x10.dispose();
        }
        this.f4573b = null;
    }
}

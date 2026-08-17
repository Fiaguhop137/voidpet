package De;

import Re.v0;
import p015ae.InterfaceC1787a;

/* JADX INFO: loaded from: classes3.dex */
class e implements Se.e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f2407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1787a f2408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC1787a f2409c;

    public e(boolean z10, InterfaceC1787a interfaceC1787a, InterfaceC1787a interfaceC1787a2) {
        this.f2407a = z10;
        this.f2408b = interfaceC1787a;
        this.f2409c = interfaceC1787a2;
    }

    @Override // Se.e.a
    public boolean a(v0 v0Var, v0 v0Var2) {
        return g.h(this.f2407a, this.f2408b, this.f2409c, v0Var, v0Var2);
    }
}

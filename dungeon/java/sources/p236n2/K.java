package p236n2;

import U1.InterfaceC1470l;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class K implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1470l f49507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L f49508b;

    public /* synthetic */ K(InterfaceC1470l interfaceC1470l, L l10) {
        this.f49507a = interfaceC1470l;
        this.f49508b = l10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f49507a.accept(this.f49508b);
    }
}

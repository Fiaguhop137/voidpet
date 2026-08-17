package p106ff;

import p088ef.InterfaceC3286g0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements InterfaceC3286g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f41896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f41897b;

    public /* synthetic */ d(e eVar, Runnable runnable) {
        this.f41896a = eVar;
        this.f41897b = runnable;
    }

    @Override // p088ef.InterfaceC3286g0
    public final void dispose() {
        e.B0(this.f41896a, this.f41897b);
    }
}

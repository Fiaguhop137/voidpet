package p236n2;

import U1.InterfaceC1470l;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class J implements InterfaceC1470l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ L.a f49504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D.b f49505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B f49506c;

    public /* synthetic */ J(L.a aVar, D.b bVar, B b10) {
        this.f49504a = aVar;
        this.f49505b = bVar;
        this.f49506c = b10;
    }

    @Override // U1.InterfaceC1470l
    public final void accept(Object obj) {
        L l10 = (L) obj;
        l10.f0(this.f49504a.f49509a, this.f49505b, this.f49506c);
    }
}

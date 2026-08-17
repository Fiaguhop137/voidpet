package p236n2;

import U1.InterfaceC1470l;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class I implements InterfaceC1470l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ L.a f49501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4027y f49502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B f49503c;

    public /* synthetic */ I(L.a aVar, C4027y c4027y, B b10) {
        this.f49501a = aVar;
        this.f49502b = c4027y;
        this.f49503c = b10;
    }

    @Override // U1.InterfaceC1470l
    public final void accept(Object obj) {
        L.a aVar = this.f49501a;
        ((L) obj).j0(aVar.f49509a, aVar.f49510b, this.f49502b, this.f49503c);
    }
}

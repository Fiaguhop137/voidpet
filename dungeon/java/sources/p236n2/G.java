package p236n2;

import U1.InterfaceC1470l;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class G implements InterfaceC1470l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ L.a f49493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4027y f49494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B f49495c;

    public /* synthetic */ G(L.a aVar, C4027y c4027y, B b10) {
        this.f49493a = aVar;
        this.f49494b = c4027y;
        this.f49495c = b10;
    }

    @Override // U1.InterfaceC1470l
    public final void accept(Object obj) {
        L.a aVar = this.f49493a;
        ((L) obj).L(aVar.f49509a, aVar.f49510b, this.f49494b, this.f49495c);
    }
}

package p236n2;

import U1.InterfaceC1470l;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class H implements InterfaceC1470l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ L.a f49496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4027y f49497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B f49498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ IOException f49499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f49500e;

    public /* synthetic */ H(L.a aVar, C4027y c4027y, B b10, IOException iOException, boolean z10) {
        this.f49496a = aVar;
        this.f49497b = c4027y;
        this.f49498c = b10;
        this.f49499d = iOException;
        this.f49500e = z10;
    }

    @Override // U1.InterfaceC1470l
    public final void accept(Object obj) {
        L.a aVar = this.f49496a;
        ((L) obj).R(aVar.f49509a, aVar.f49510b, this.f49497b, this.f49498c, this.f49499d, this.f49500e);
    }
}

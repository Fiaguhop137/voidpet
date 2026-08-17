package Q;

import I.C1079u1;
import I.InterfaceC1076t1;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class k implements InterfaceC1076t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f9210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final K.c f9211b = new K.c(new C1079u1[16], 0);

    public k(Set set) {
        this.f9210a = set;
    }

    public final K.c a() {
        return this.f9211b;
    }

    @Override // I.InterfaceC1076t1
    public void g() {
        K.c cVar = this.f9211b;
        Object[] objArr = cVar.f5867a;
        int iL = cVar.l();
        for (int i10 = 0; i10 < iL; i10++) {
            InterfaceC1076t1 interfaceC1076t1B = ((C1079u1) objArr[i10]).b();
            this.f9210a.remove(interfaceC1076t1B);
            interfaceC1076t1B.g();
        }
    }

    @Override // I.InterfaceC1076t1
    public void j() {
    }

    @Override // I.InterfaceC1076t1
    public void l() {
    }
}

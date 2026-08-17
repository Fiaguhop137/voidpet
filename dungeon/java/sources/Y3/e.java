package Y3;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class e implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f16908a;

    public e(List list) {
        this.f16908a = list;
    }

    @Override // Y3.o
    public boolean j() {
        return this.f16908a.size() == 1 && ((p095f4.a) this.f16908a.get(0)).i();
    }

    @Override // Y3.o
    public U3.a k() {
        return ((p095f4.a) this.f16908a.get(0)).i() ? new U3.k(this.f16908a) : new U3.j(this.f16908a);
    }

    @Override // Y3.o
    public List l() {
        return this.f16908a;
    }
}

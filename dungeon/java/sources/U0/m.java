package U0;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends e {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public ArrayList f12844w0 = new ArrayList();

    public abstract void K0();

    public void L0(e eVar) {
        this.f12844w0.remove(eVar);
        eVar.w0(null);
    }

    public void M0() {
        this.f12844w0.clear();
    }

    @Override // U0.e
    public void Y() {
        this.f12844w0.clear();
        super.Y();
    }

    @Override // U0.e
    public void a0(T0.c cVar) {
        super.a0(cVar);
        int size = this.f12844w0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((e) this.f12844w0.get(i10)).a0(cVar);
        }
    }

    public void c(e eVar) {
        this.f12844w0.add(eVar);
        if (eVar.G() != null) {
            ((m) eVar.G()).L0(eVar);
        }
        eVar.w0(this);
    }
}

package p236n2;

import R1.F;
import R1.u;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends AbstractC4025w {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final u f49814f;

    public k0(F f10, u uVar) {
        super(f10);
        this.f49814f = uVar;
    }

    @Override // p236n2.AbstractC4025w, R1.F
    public F.c o(int i10, F.c cVar, long j10) {
        super.o(i10, cVar, j10);
        u uVar = this.f49814f;
        cVar.f9947c = uVar;
        u.h hVar = uVar.f10345b;
        cVar.f9946b = hVar != null ? hVar.f10447h : null;
        return cVar;
    }
}

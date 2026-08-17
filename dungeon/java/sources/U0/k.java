package U0;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static boolean[] f12830a = new boolean[3];

    static void a(f fVar, T0.d dVar, e eVar) {
        eVar.f12719j = -1;
        eVar.f12721k = -1;
        e.b bVar = fVar.f12687M[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.f12687M[0] == e.b.MATCH_PARENT) {
            int i10 = eVar.f12676B.f12660e;
            int iP = fVar.P() - eVar.f12678D.f12660e;
            d dVar2 = eVar.f12676B;
            dVar2.f12662g = dVar.q(dVar2);
            d dVar3 = eVar.f12678D;
            dVar3.f12662g = dVar.q(dVar3);
            dVar.f(eVar.f12676B.f12662g, i10);
            dVar.f(eVar.f12678D.f12662g, iP);
            eVar.f12719j = 2;
            eVar.k0(i10, iP);
        }
        if (fVar.f12687M[1] == bVar2 || eVar.f12687M[1] != e.b.MATCH_PARENT) {
            return;
        }
        int i11 = eVar.f12677C.f12660e;
        int iV = fVar.v() - eVar.f12679E.f12660e;
        d dVar4 = eVar.f12677C;
        dVar4.f12662g = dVar.q(dVar4);
        d dVar5 = eVar.f12679E;
        dVar5.f12662g = dVar.q(dVar5);
        dVar.f(eVar.f12677C.f12662g, i11);
        dVar.f(eVar.f12679E.f12662g, iV);
        if (eVar.f12699Y > 0 || eVar.O() == 8) {
            d dVar6 = eVar.f12680F;
            dVar6.f12662g = dVar.q(dVar6);
            dVar.f(eVar.f12680F.f12662g, eVar.f12699Y + i11);
        }
        eVar.f12721k = 2;
        eVar.z0(i11, iV);
    }

    public static final boolean b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}

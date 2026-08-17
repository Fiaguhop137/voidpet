package p416x2;

import C9.AbstractC0876t;
import C9.V;
import U1.F;

/* JADX INFO: loaded from: classes.dex */
final class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0876t f57353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f57354b;

    private f(int i10, AbstractC0876t abstractC0876t) {
        this.f57354b = i10;
        this.f57353a = abstractC0876t;
    }

    private static a a(int i10, int i11, F f10) {
        switch (i10) {
            case 1718776947:
                return g.d(i11, f10);
            case 1751742049:
                return c.b(f10);
            case 1752331379:
                return d.c(f10);
            case 1852994675:
                return h.a(f10);
            default:
                return null;
        }
    }

    public static f c(int i10, F f10) {
        AbstractC0876t.a aVar = new AbstractC0876t.a();
        int iJ = f10.j();
        int iB = -2;
        while (f10.a() > 8) {
            int iY = f10.y();
            int iG = f10.g() + f10.y();
            f10.Z(iG);
            a aVarC = iY == 1414744396 ? c(f10.y(), f10) : a(iY, iB, f10);
            if (aVarC != null) {
                if (aVarC.getType() == 1752331379) {
                    iB = ((d) aVarC).b();
                }
                aVar.a(aVarC);
            }
            f10.a0(iG);
            f10.Z(iJ);
        }
        return new f(i10, aVar.k());
    }

    public a b(Class cls) {
        V it = this.f57353a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.getClass() == cls) {
                return aVar;
            }
        }
        return null;
    }

    @Override // p416x2.a
    public int getType() {
        return this.f57354b;
    }
}

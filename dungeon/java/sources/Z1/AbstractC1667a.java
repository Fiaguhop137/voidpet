package Z1;

import U1.AbstractC1459a;
import android.util.Pair;

/* JADX INFO: renamed from: Z1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1667a extends R1.F {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f18224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p236n2.e0 f18225f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f18226g;

    public AbstractC1667a(boolean z10, p236n2.e0 e0Var) {
        this.f18226g = z10;
        this.f18225f = e0Var;
        this.f18224e = e0Var.getLength();
    }

    private int B(int i10, boolean z10) {
        if (z10) {
            return this.f18225f.c(i10);
        }
        if (i10 < this.f18224e - 1) {
            return i10 + 1;
        }
        return -1;
    }

    private int C(int i10, boolean z10) {
        if (z10) {
            return this.f18225f.b(i10);
        }
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    public static Object v(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object w(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object y(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    protected abstract int A(int i10);

    protected abstract R1.F D(int i10);

    @Override // R1.F
    public int a(boolean z10) {
        if (this.f18224e == 0) {
            return -1;
        }
        if (this.f18226g) {
            z10 = false;
        }
        int iF = z10 ? this.f18225f.f() : 0;
        while (D(iF).q()) {
            iF = B(iF, z10);
            if (iF == -1) {
                return -1;
            }
        }
        return A(iF) + D(iF).a(z10);
    }

    @Override // R1.F
    public final int b(Object obj) {
        int iB;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object objW = w(obj);
        Object objV = v(obj);
        int iS = s(objW);
        if (iS == -1 || (iB = D(iS).b(objV)) == -1) {
            return -1;
        }
        return z(iS) + iB;
    }

    @Override // R1.F
    public int c(boolean z10) {
        int i10 = this.f18224e;
        if (i10 == 0) {
            return -1;
        }
        if (this.f18226g) {
            z10 = false;
        }
        int iD = z10 ? this.f18225f.d() : i10 - 1;
        while (D(iD).q()) {
            iD = C(iD, z10);
            if (iD == -1) {
                return -1;
            }
        }
        return A(iD) + D(iD).c(z10);
    }

    @Override // R1.F
    public int e(int i10, int i11, boolean z10) {
        if (this.f18226g) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int iU = u(i10);
        int iA = A(iU);
        int iE = D(iU).e(i10 - iA, i11 != 2 ? i11 : 0, z10);
        if (iE != -1) {
            return iA + iE;
        }
        int iB = B(iU, z10);
        while (iB != -1 && D(iB).q()) {
            iB = B(iB, z10);
        }
        if (iB != -1) {
            return A(iB) + D(iB).a(z10);
        }
        if (i11 == 2) {
            return a(z10);
        }
        return -1;
    }

    @Override // R1.F
    public final R1.F.b g(int i10, R1.F.b bVar, boolean z10) {
        int iT = t(i10);
        int iA = A(iT);
        D(iT).g(i10 - z(iT), bVar, z10);
        bVar.f9924c += iA;
        if (z10) {
            bVar.f9923b = y(x(iT), AbstractC1459a.e(bVar.f9923b));
        }
        return bVar;
    }

    @Override // R1.F
    public final R1.F.b h(Object obj, R1.F.b bVar) {
        Object objW = w(obj);
        Object objV = v(obj);
        int iS = s(objW);
        int iA = A(iS);
        D(iS).h(objV, bVar);
        bVar.f9924c += iA;
        bVar.f9923b = obj;
        return bVar;
    }

    @Override // R1.F
    public int l(int i10, int i11, boolean z10) {
        if (this.f18226g) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int iU = u(i10);
        int iA = A(iU);
        int iL = D(iU).l(i10 - iA, i11 != 2 ? i11 : 0, z10);
        if (iL != -1) {
            return iA + iL;
        }
        int iC = C(iU, z10);
        while (iC != -1 && D(iC).q()) {
            iC = C(iC, z10);
        }
        if (iC != -1) {
            return A(iC) + D(iC).c(z10);
        }
        if (i11 == 2) {
            return c(z10);
        }
        return -1;
    }

    @Override // R1.F
    public final Object m(int i10) {
        int iT = t(i10);
        return y(x(iT), D(iT).m(i10 - z(iT)));
    }

    @Override // R1.F
    public final R1.F.c o(int i10, R1.F.c cVar, long j10) {
        int iU = u(i10);
        int iA = A(iU);
        int iZ = z(iU);
        D(iU).o(i10 - iA, cVar, j10);
        Object objX = x(iU);
        if (!R1.F.c.f9935q.equals(cVar.f9945a)) {
            objX = y(objX, cVar.f9945a);
        }
        cVar.f9945a = objX;
        cVar.f9958n += iZ;
        cVar.f9959o += iZ;
        return cVar;
    }

    protected abstract int s(Object obj);

    protected abstract int t(int i10);

    protected abstract int u(int i10);

    protected abstract Object x(int i10);

    protected abstract int z(int i10);
}

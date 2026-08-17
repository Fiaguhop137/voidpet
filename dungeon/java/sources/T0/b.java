package T0;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b implements d.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f11849e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    i f11845a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f11846b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f11847c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ArrayList f11848d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f11850f = false;

    public interface a {
        void a(i iVar, float f10);

        i b(int i10);

        void c();

        void clear();

        float d(i iVar, boolean z10);

        void e(i iVar, float f10, boolean z10);

        int f();

        float g(int i10);

        boolean h(i iVar);

        float i(i iVar);

        float j(b bVar, boolean z10);

        void k(float f10);
    }

    public b() {
    }

    public b(c cVar) {
        this.f11849e = new T0.a(this, cVar);
    }

    private boolean v(i iVar, d dVar) {
        return iVar.f11901m <= 1;
    }

    private i x(boolean[] zArr, i iVar) {
        i.a aVar;
        int iF = this.f11849e.f();
        i iVar2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < iF; i10++) {
            float fG = this.f11849e.g(i10);
            if (fG < 0.0f) {
                i iVarB = this.f11849e.b(i10);
                if ((zArr == null || !zArr[iVarB.f11891c]) && iVarB != iVar && (((aVar = iVarB.f11898j) == i.a.SLACK || aVar == i.a.ERROR) && fG < f10)) {
                    f10 = fG;
                    iVar2 = iVarB;
                }
            }
        }
        return iVar2;
    }

    String A() {
        boolean z10;
        String str = (this.f11845a == null ? "0" : "" + this.f11845a) + " = ";
        if (this.f11846b != 0.0f) {
            str = str + this.f11846b;
            z10 = true;
        } else {
            z10 = false;
        }
        int iF = this.f11849e.f();
        for (int i10 = 0; i10 < iF; i10++) {
            i iVarB = this.f11849e.b(i10);
            if (iVarB != null) {
                float fG = this.f11849e.g(i10);
                if (fG != 0.0f) {
                    String string = iVarB.toString();
                    if (z10) {
                        if (fG > 0.0f) {
                            str = str + " + ";
                        } else {
                            str = str + " - ";
                            fG *= -1.0f;
                        }
                    } else if (fG < 0.0f) {
                        str = str + "- ";
                        fG *= -1.0f;
                    }
                    str = fG == 1.0f ? str + string : str + fG + " " + string;
                    z10 = true;
                }
            }
        }
        if (z10) {
            return str;
        }
        return str + "0.0";
    }

    public void B(d dVar, i iVar, boolean z10) {
        if (iVar.f11895g) {
            this.f11846b += iVar.f11894f * this.f11849e.i(iVar);
            this.f11849e.d(iVar, z10);
            if (z10) {
                iVar.c(this);
            }
        }
    }

    public void C(b bVar, boolean z10) {
        this.f11846b += bVar.f11846b * this.f11849e.j(bVar, z10);
        if (z10) {
            bVar.f11845a.c(this);
        }
    }

    public void D(d dVar) {
        if (dVar.f11864f.length == 0) {
            return;
        }
        boolean z10 = false;
        while (!z10) {
            int iF = this.f11849e.f();
            for (int i10 = 0; i10 < iF; i10++) {
                i iVarB = this.f11849e.b(i10);
                if (iVarB.f11892d != -1 || iVarB.f11895g) {
                    this.f11848d.add(iVarB);
                }
            }
            if (this.f11848d.size() > 0) {
                for (i iVar : this.f11848d) {
                    if (iVar.f11895g) {
                        B(dVar, iVar, true);
                    } else {
                        C(dVar.f11864f[iVar.f11892d], true);
                    }
                }
                this.f11848d.clear();
            } else {
                z10 = true;
            }
        }
    }

    @Override // T0.d.a
    public void a(d.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f11845a = null;
            this.f11849e.clear();
            for (int i10 = 0; i10 < bVar.f11849e.f(); i10++) {
                this.f11849e.e(bVar.f11849e.b(i10), bVar.f11849e.g(i10), true);
            }
        }
    }

    @Override // T0.d.a
    public void b(i iVar) {
        int i10 = iVar.f11893e;
        float f10 = 1.0f;
        if (i10 != 1) {
            if (i10 == 2) {
                f10 = 1000.0f;
            } else if (i10 == 3) {
                f10 = 1000000.0f;
            } else if (i10 == 4) {
                f10 = 1.0E9f;
            } else if (i10 == 5) {
                f10 = 1.0E12f;
            }
        }
        this.f11849e.a(iVar, f10);
    }

    @Override // T0.d.a
    public i c(d dVar, boolean[] zArr) {
        return x(zArr, null);
    }

    @Override // T0.d.a
    public void clear() {
        this.f11849e.clear();
        this.f11845a = null;
        this.f11846b = 0.0f;
    }

    public b d(d dVar, int i10) {
        this.f11849e.a(dVar.o(i10, "ep"), 1.0f);
        this.f11849e.a(dVar.o(i10, "em"), -1.0f);
        return this;
    }

    b e(i iVar, int i10) {
        this.f11849e.a(iVar, i10);
        return this;
    }

    boolean f(d dVar) {
        boolean z10;
        i iVarG = g(dVar);
        if (iVarG == null) {
            z10 = true;
        } else {
            y(iVarG);
            z10 = false;
        }
        if (this.f11849e.f() == 0) {
            this.f11850f = true;
        }
        return z10;
    }

    i g(d dVar) {
        int iF = this.f11849e.f();
        i iVar = null;
        float f10 = 0.0f;
        float f11 = 0.0f;
        boolean z10 = false;
        boolean z11 = false;
        i iVar2 = null;
        for (int i10 = 0; i10 < iF; i10++) {
            float fG = this.f11849e.g(i10);
            i iVarB = this.f11849e.b(i10);
            if (iVarB.f11898j == i.a.UNRESTRICTED) {
                if (iVar == null || f10 > fG) {
                    boolean zV = v(iVarB, dVar);
                    z10 = zV;
                    f10 = fG;
                    iVar = iVarB;
                } else if (!z10 && v(iVarB, dVar)) {
                    f10 = fG;
                    iVar = iVarB;
                    z10 = true;
                }
            } else if (iVar == null && fG < 0.0f) {
                if (iVar2 == null || f11 > fG) {
                    boolean zV2 = v(iVarB, dVar);
                    z11 = zV2;
                    f11 = fG;
                    iVar2 = iVarB;
                } else if (!z11 && v(iVarB, dVar)) {
                    f11 = fG;
                    iVar2 = iVarB;
                    z11 = true;
                }
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    @Override // T0.d.a
    public i getKey() {
        return this.f11845a;
    }

    b h(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11) {
        if (iVar2 == iVar3) {
            this.f11849e.a(iVar, 1.0f);
            this.f11849e.a(iVar4, 1.0f);
            this.f11849e.a(iVar2, -2.0f);
            return this;
        }
        if (f10 == 0.5f) {
            this.f11849e.a(iVar, 1.0f);
            this.f11849e.a(iVar2, -1.0f);
            this.f11849e.a(iVar3, -1.0f);
            this.f11849e.a(iVar4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                this.f11846b = (-i10) + i11;
                return this;
            }
        } else {
            if (f10 <= 0.0f) {
                this.f11849e.a(iVar, -1.0f);
                this.f11849e.a(iVar2, 1.0f);
                this.f11846b = i10;
                return this;
            }
            if (f10 >= 1.0f) {
                this.f11849e.a(iVar4, -1.0f);
                this.f11849e.a(iVar3, 1.0f);
                this.f11846b = -i11;
                return this;
            }
            float f11 = 1.0f - f10;
            this.f11849e.a(iVar, f11 * 1.0f);
            this.f11849e.a(iVar2, f11 * (-1.0f));
            this.f11849e.a(iVar3, (-1.0f) * f10);
            this.f11849e.a(iVar4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                this.f11846b = ((-i10) * f11) + (i11 * f10);
                return this;
            }
        }
        return this;
    }

    b i(i iVar, int i10) {
        this.f11845a = iVar;
        float f10 = i10;
        iVar.f11894f = f10;
        this.f11846b = f10;
        this.f11850f = true;
        return this;
    }

    b j(i iVar, i iVar2, float f10) {
        this.f11849e.a(iVar, -1.0f);
        this.f11849e.a(iVar2, f10);
        return this;
    }

    public b k(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f11849e.a(iVar, -1.0f);
        this.f11849e.a(iVar2, 1.0f);
        this.f11849e.a(iVar3, f10);
        this.f11849e.a(iVar4, -f10);
        return this;
    }

    public b l(float f10, float f11, float f12, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f11846b = 0.0f;
        if (f11 == 0.0f || f10 == f12) {
            this.f11849e.a(iVar, 1.0f);
            this.f11849e.a(iVar2, -1.0f);
            this.f11849e.a(iVar4, 1.0f);
            this.f11849e.a(iVar3, -1.0f);
            return this;
        }
        if (f10 == 0.0f) {
            this.f11849e.a(iVar, 1.0f);
            this.f11849e.a(iVar2, -1.0f);
            return this;
        }
        if (f12 == 0.0f) {
            this.f11849e.a(iVar3, 1.0f);
            this.f11849e.a(iVar4, -1.0f);
            return this;
        }
        float f13 = (f10 / f11) / (f12 / f11);
        this.f11849e.a(iVar, 1.0f);
        this.f11849e.a(iVar2, -1.0f);
        this.f11849e.a(iVar4, f13);
        this.f11849e.a(iVar3, -f13);
        return this;
    }

    public b m(i iVar, int i10) {
        if (i10 < 0) {
            this.f11846b = i10 * (-1);
            this.f11849e.a(iVar, 1.0f);
            return this;
        }
        this.f11846b = i10;
        this.f11849e.a(iVar, -1.0f);
        return this;
    }

    public b n(i iVar, i iVar2, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f11846b = i10;
        }
        if (z10) {
            this.f11849e.a(iVar, 1.0f);
            this.f11849e.a(iVar2, -1.0f);
            return this;
        }
        this.f11849e.a(iVar, -1.0f);
        this.f11849e.a(iVar2, 1.0f);
        return this;
    }

    public b o(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f11846b = i10;
        }
        if (z10) {
            this.f11849e.a(iVar, 1.0f);
            this.f11849e.a(iVar2, -1.0f);
            this.f11849e.a(iVar3, -1.0f);
            return this;
        }
        this.f11849e.a(iVar, -1.0f);
        this.f11849e.a(iVar2, 1.0f);
        this.f11849e.a(iVar3, 1.0f);
        return this;
    }

    public b p(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f11846b = i10;
        }
        if (z10) {
            this.f11849e.a(iVar, 1.0f);
            this.f11849e.a(iVar2, -1.0f);
            this.f11849e.a(iVar3, 1.0f);
            return this;
        }
        this.f11849e.a(iVar, -1.0f);
        this.f11849e.a(iVar2, 1.0f);
        this.f11849e.a(iVar3, -1.0f);
        return this;
    }

    public b q(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f11849e.a(iVar3, 0.5f);
        this.f11849e.a(iVar4, 0.5f);
        this.f11849e.a(iVar, -0.5f);
        this.f11849e.a(iVar2, -0.5f);
        this.f11846b = -f10;
        return this;
    }

    void r() {
        float f10 = this.f11846b;
        if (f10 < 0.0f) {
            this.f11846b = f10 * (-1.0f);
            this.f11849e.c();
        }
    }

    boolean s() {
        i iVar = this.f11845a;
        if (iVar != null) {
            return iVar.f11898j == i.a.UNRESTRICTED || this.f11846b >= 0.0f;
        }
        return false;
    }

    boolean t(i iVar) {
        return this.f11849e.h(iVar);
    }

    public String toString() {
        return A();
    }

    public boolean u() {
        return this.f11845a == null && this.f11846b == 0.0f && this.f11849e.f() == 0;
    }

    public i w(i iVar) {
        return x(null, iVar);
    }

    void y(i iVar) {
        i iVar2 = this.f11845a;
        if (iVar2 != null) {
            this.f11849e.a(iVar2, -1.0f);
            this.f11845a = null;
        }
        float fD = this.f11849e.d(iVar, true) * (-1.0f);
        this.f11845a = iVar;
        if (fD == 1.0f) {
            return;
        }
        this.f11846b /= fD;
        this.f11849e.k(fD);
    }

    public void z() {
        this.f11845a = null;
        this.f11849e.clear();
        this.f11846b = 0.0f;
        this.f11850f = false;
    }
}

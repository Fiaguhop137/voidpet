package U0;

/* JADX INFO: loaded from: classes.dex */
public class h extends e {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    protected float f12823w0 = -1.0f;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    protected int f12824x0 = -1;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    protected int f12825y0 = -1;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private d f12826z0 = this.f12677C;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private int f12821A0 = 0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    private int f12822B0 = 0;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12827a;

        static {
            int[] iArr = new int[d.b.values().length];
            f12827a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12827a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12827a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12827a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12827a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12827a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12827a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12827a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12827a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public h() {
        this.f12685K.clear();
        this.f12685K.add(this.f12826z0);
        int length = this.f12684J.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f12684J[i10] = this.f12826z0;
        }
    }

    @Override // U0.e
    public void J0(T0.d dVar) {
        if (G() == null) {
            return;
        }
        int iX = dVar.x(this.f12826z0);
        if (this.f12821A0 == 1) {
            F0(iX);
            G0(0);
            h0(G().v());
            E0(0);
            return;
        }
        F0(0);
        G0(iX);
        E0(G().P());
        h0(0);
    }

    public int K0() {
        return this.f12821A0;
    }

    public int L0() {
        return this.f12824x0;
    }

    public int M0() {
        return this.f12825y0;
    }

    public float N0() {
        return this.f12823w0;
    }

    public void O0(int i10) {
        if (i10 > -1) {
            this.f12823w0 = -1.0f;
            this.f12824x0 = i10;
            this.f12825y0 = -1;
        }
    }

    public void P0(int i10) {
        if (i10 > -1) {
            this.f12823w0 = -1.0f;
            this.f12824x0 = -1;
            this.f12825y0 = i10;
        }
    }

    public void Q0(float f10) {
        if (f10 > -1.0f) {
            this.f12823w0 = f10;
            this.f12824x0 = -1;
            this.f12825y0 = -1;
        }
    }

    public void R0(int i10) {
        if (this.f12821A0 == i10) {
            return;
        }
        this.f12821A0 = i10;
        this.f12685K.clear();
        if (this.f12821A0 == 1) {
            this.f12826z0 = this.f12676B;
        } else {
            this.f12826z0 = this.f12677C;
        }
        this.f12685K.add(this.f12826z0);
        int length = this.f12684J.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.f12684J[i11] = this.f12826z0;
        }
    }

    @Override // U0.e
    public void f(T0.d dVar) {
        f fVar = (f) G();
        if (fVar == null) {
            return;
        }
        d dVarM = fVar.m(d.b.LEFT);
        d dVarM2 = fVar.m(d.b.RIGHT);
        e eVar = this.f12688N;
        boolean z10 = eVar != null && eVar.f12687M[0] == e.b.WRAP_CONTENT;
        if (this.f12821A0 == 0) {
            dVarM = fVar.m(d.b.TOP);
            dVarM2 = fVar.m(d.b.BOTTOM);
            e eVar2 = this.f12688N;
            z10 = eVar2 != null && eVar2.f12687M[1] == e.b.WRAP_CONTENT;
        }
        if (this.f12824x0 != -1) {
            T0.i iVarQ = dVar.q(this.f12826z0);
            dVar.e(iVarQ, dVar.q(dVarM), this.f12824x0, 8);
            if (z10) {
                dVar.h(dVar.q(dVarM2), iVarQ, 0, 5);
                return;
            }
            return;
        }
        if (this.f12825y0 == -1) {
            if (this.f12823w0 != -1.0f) {
                dVar.d(T0.d.s(dVar, dVar.q(this.f12826z0), dVar.q(dVarM2), this.f12823w0));
                return;
            }
            return;
        }
        T0.i iVarQ2 = dVar.q(this.f12826z0);
        T0.i iVarQ3 = dVar.q(dVarM2);
        dVar.e(iVarQ2, iVarQ3, -this.f12825y0, 8);
        if (z10) {
            dVar.h(iVarQ2, dVar.q(dVarM), 0, 5);
            dVar.h(iVarQ3, iVarQ2, 0, 5);
        }
    }

    @Override // U0.e
    public boolean g() {
        return true;
    }

    @Override // U0.e
    public d m(d.b bVar) {
        switch (a.f12827a[bVar.ordinal()]) {
            case 1:
            case 2:
                if (this.f12821A0 == 1) {
                    return this.f12826z0;
                }
                break;
            case 3:
            case 4:
                if (this.f12821A0 == 0) {
                    return this.f12826z0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(bVar.name());
    }
}

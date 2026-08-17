package V0;

/* JADX INFO: loaded from: classes.dex */
public abstract class m implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    U0.e f13887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    k f13888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected U0.e.b f13889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    g f13890e = new g(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13891f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f13892g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f f13893h = new f(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f13894i = new f(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected b f13895j = b.NONE;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f13896a;

        static {
            int[] iArr = new int[U0.d.b.values().length];
            f13896a = iArr;
            try {
                iArr[U0.d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13896a[U0.d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13896a[U0.d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13896a[U0.d.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13896a[U0.d.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public m(U0.e eVar) {
        this.f13887b = eVar;
    }

    private void l(int i10, int i11) {
        int i12 = this.f13886a;
        if (i12 == 0) {
            this.f13890e.d(g(i11, i10));
            return;
        }
        if (i12 == 1) {
            this.f13890e.d(Math.min(g(this.f13890e.f13872m, i10), i11));
            return;
        }
        if (i12 == 2) {
            U0.e eVarG = this.f13887b.G();
            if (eVarG != null) {
                g gVar = (i10 == 0 ? eVarG.f12709e : eVarG.f12711f).f13890e;
                if (gVar.f13860j) {
                    U0.e eVar = this.f13887b;
                    this.f13890e.d(g((int) ((gVar.f13857g * (i10 == 0 ? eVar.f12733q : eVar.f12739t)) + 0.5f), i10));
                    return;
                }
                return;
            }
            return;
        }
        if (i12 != 3) {
            return;
        }
        U0.e eVar2 = this.f13887b;
        m mVar = eVar2.f12709e;
        U0.e.b bVar = mVar.f13889d;
        U0.e.b bVar2 = U0.e.b.MATCH_CONSTRAINT;
        if (bVar == bVar2 && mVar.f13886a == 3) {
            l lVar = eVar2.f12711f;
            if (lVar.f13889d == bVar2 && lVar.f13886a == 3) {
                return;
            }
        }
        if (i10 == 0) {
            mVar = eVar2.f12711f;
        }
        if (mVar.f13890e.f13860j) {
            float fT = eVar2.t();
            this.f13890e.d(i10 == 1 ? (int) ((mVar.f13890e.f13857g / fT) + 0.5f) : (int) ((fT * mVar.f13890e.f13857g) + 0.5f));
        }
    }

    @Override // V0.d
    public abstract void a(d dVar);

    protected final void b(f fVar, f fVar2, int i10) {
        fVar.f13862l.add(fVar2);
        fVar.f13856f = i10;
        fVar2.f13861k.add(fVar);
    }

    protected final void c(f fVar, f fVar2, int i10, g gVar) {
        fVar.f13862l.add(fVar2);
        fVar.f13862l.add(this.f13890e);
        fVar.f13858h = i10;
        fVar.f13859i = gVar;
        fVar2.f13861k.add(fVar);
        gVar.f13861k.add(fVar);
    }

    abstract void d();

    abstract void e();

    abstract void f();

    protected final int g(int i10, int i11) {
        if (i11 == 0) {
            U0.e eVar = this.f13887b;
            int i12 = eVar.f12731p;
            int iMax = Math.max(eVar.f12729o, i10);
            if (i12 > 0) {
                iMax = Math.min(i12, i10);
            }
            if (iMax != i10) {
                return iMax;
            }
        } else {
            U0.e eVar2 = this.f13887b;
            int i13 = eVar2.f12737s;
            int iMax2 = Math.max(eVar2.f12735r, i10);
            if (i13 > 0) {
                iMax2 = Math.min(i13, i10);
            }
            if (iMax2 != i10) {
                return iMax2;
            }
        }
        return i10;
    }

    protected final f h(U0.d dVar) {
        U0.d dVar2 = dVar.f12659d;
        if (dVar2 == null) {
            return null;
        }
        U0.e eVar = dVar2.f12657b;
        int i10 = a.f13896a[dVar2.f12658c.ordinal()];
        if (i10 == 1) {
            return eVar.f12709e.f13893h;
        }
        if (i10 == 2) {
            return eVar.f12709e.f13894i;
        }
        if (i10 == 3) {
            return eVar.f12711f.f13893h;
        }
        if (i10 == 4) {
            return eVar.f12711f.f13883k;
        }
        if (i10 != 5) {
            return null;
        }
        return eVar.f12711f.f13894i;
    }

    protected final f i(U0.d dVar, int i10) {
        U0.d dVar2 = dVar.f12659d;
        if (dVar2 == null) {
            return null;
        }
        U0.e eVar = dVar2.f12657b;
        m mVar = i10 == 0 ? eVar.f12709e : eVar.f12711f;
        int i11 = a.f13896a[dVar2.f12658c.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        return null;
                    }
                }
            }
            return mVar.f13894i;
        }
        return mVar.f13893h;
    }

    public long j() {
        g gVar = this.f13890e;
        if (gVar.f13860j) {
            return gVar.f13857g;
        }
        return 0L;
    }

    public boolean k() {
        return this.f13892g;
    }

    abstract boolean m();

    protected void n(d dVar, U0.d dVar2, U0.d dVar3, int i10) {
        f fVarH = h(dVar2);
        f fVarH2 = h(dVar3);
        if (fVarH.f13860j && fVarH2.f13860j) {
            int iC = fVarH.f13857g + dVar2.c();
            int iC2 = fVarH2.f13857g - dVar3.c();
            int i11 = iC2 - iC;
            if (!this.f13890e.f13860j && this.f13889d == U0.e.b.MATCH_CONSTRAINT) {
                l(i10, i11);
            }
            g gVar = this.f13890e;
            if (gVar.f13860j) {
                if (gVar.f13857g == i11) {
                    this.f13893h.d(iC);
                    this.f13894i.d(iC2);
                    return;
                }
                U0.e eVar = this.f13887b;
                float fW = i10 == 0 ? eVar.w() : eVar.K();
                if (fVarH == fVarH2) {
                    iC = fVarH.f13857g;
                    iC2 = fVarH2.f13857g;
                    fW = 0.5f;
                }
                this.f13893h.d((int) (iC + 0.5f + (((iC2 - iC) - this.f13890e.f13857g) * fW)));
                this.f13894i.d(this.f13893h.f13857g + this.f13890e.f13857g);
            }
        }
    }

    protected void o(d dVar) {
    }

    protected void p(d dVar) {
    }
}

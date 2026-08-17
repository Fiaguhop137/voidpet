package U0;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected e f12634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected e f12635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected e f12636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected e f12637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected e f12638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected e f12639f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected e f12640g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected ArrayList f12641h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f12642i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f12643j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected float f12644k = 0.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f12645l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f12646m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f12647n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f12648o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f12649p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f12650q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected boolean f12651r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected boolean f12652s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected boolean f12653t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected boolean f12654u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f12655v;

    public c(e eVar, int i10, boolean z10) {
        this.f12634a = eVar;
        this.f12649p = i10;
        this.f12650q = z10;
    }

    private void b() {
        int i10 = this.f12649p * 2;
        e eVar = this.f12634a;
        this.f12648o = true;
        e eVar2 = eVar;
        boolean z10 = false;
        while (!z10) {
            this.f12642i++;
            e[] eVarArr = eVar.f12738s0;
            int i11 = this.f12649p;
            e eVar3 = null;
            eVarArr[i11] = null;
            eVar.f12736r0[i11] = null;
            if (eVar.O() != 8) {
                this.f12645l++;
                e.b bVarS = eVar.s(this.f12649p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarS != bVar) {
                    this.f12646m += eVar.A(this.f12649p);
                }
                int iC = this.f12646m + eVar.f12684J[i10].c();
                this.f12646m = iC;
                int i12 = i10 + 1;
                this.f12646m = iC + eVar.f12684J[i12].c();
                int iC2 = this.f12647n + eVar.f12684J[i10].c();
                this.f12647n = iC2;
                this.f12647n = iC2 + eVar.f12684J[i12].c();
                if (this.f12635b == null) {
                    this.f12635b = eVar;
                }
                this.f12637d = eVar;
                e.b[] bVarArr = eVar.f12687M;
                int i13 = this.f12649p;
                if (bVarArr[i13] == bVar) {
                    int i14 = eVar.f12727n[i13];
                    if (i14 == 0 || i14 == 3 || i14 == 2) {
                        this.f12643j++;
                        float f10 = eVar.f12734q0[i13];
                        if (f10 > 0.0f) {
                            this.f12644k += f10;
                        }
                        if (c(eVar, i13)) {
                            if (f10 < 0.0f) {
                                this.f12651r = true;
                            } else {
                                this.f12652s = true;
                            }
                            if (this.f12641h == null) {
                                this.f12641h = new ArrayList();
                            }
                            this.f12641h.add(eVar);
                        }
                        if (this.f12639f == null) {
                            this.f12639f = eVar;
                        }
                        e eVar4 = this.f12640g;
                        if (eVar4 != null) {
                            eVar4.f12736r0[this.f12649p] = eVar;
                        }
                        this.f12640g = eVar;
                    }
                    if (this.f12649p == 0) {
                        if (eVar.f12723l != 0 || eVar.f12729o != 0 || eVar.f12731p != 0) {
                            this.f12648o = false;
                        }
                    } else if (eVar.f12725m != 0 || eVar.f12735r != 0 || eVar.f12737s != 0) {
                        this.f12648o = false;
                    }
                    if (eVar.f12691Q != 0.0f) {
                        this.f12648o = false;
                        this.f12654u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.f12738s0[this.f12649p] = eVar;
            }
            d dVar = eVar.f12684J[i10 + 1].f12659d;
            if (dVar != null) {
                e eVar5 = dVar.f12657b;
                d dVar2 = eVar5.f12684J[i10].f12659d;
                if (dVar2 != null && dVar2.f12657b == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z10 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f12635b;
        if (eVar6 != null) {
            this.f12646m -= eVar6.f12684J[i10].c();
        }
        e eVar7 = this.f12637d;
        if (eVar7 != null) {
            this.f12646m -= eVar7.f12684J[i10 + 1].c();
        }
        this.f12636c = eVar;
        if (this.f12649p == 0 && this.f12650q) {
            this.f12638e = eVar;
        } else {
            this.f12638e = this.f12634a;
        }
        this.f12653t = this.f12652s && this.f12651r;
    }

    private static boolean c(e eVar, int i10) {
        if (eVar.O() == 8 || eVar.f12687M[i10] != e.b.MATCH_CONSTRAINT) {
            return false;
        }
        int i11 = eVar.f12727n[i10];
        return i11 == 0 || i11 == 3;
    }

    public void a() {
        if (!this.f12655v) {
            b();
        }
        this.f12655v = true;
    }
}

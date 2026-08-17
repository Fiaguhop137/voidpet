package U0;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class g extends l {

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private e[] f12801i1;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    private int f12778L0 = -1;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    private int f12779M0 = -1;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    private int f12780N0 = -1;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    private int f12781O0 = -1;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    private int f12782P0 = -1;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    private int f12783Q0 = -1;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    private float f12784R0 = 0.5f;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    private float f12785S0 = 0.5f;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    private float f12786T0 = 0.5f;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    private float f12787U0 = 0.5f;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    private float f12788V0 = 0.5f;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    private float f12789W0 = 0.5f;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    private int f12790X0 = 0;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    private int f12791Y0 = 0;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    private int f12792Z0 = 2;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private int f12793a1 = 2;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private int f12794b1 = 0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private int f12795c1 = -1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private int f12796d1 = 0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private ArrayList f12797e1 = new ArrayList();

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private e[] f12798f1 = null;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private e[] f12799g1 = null;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private int[] f12800h1 = null;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    private int f12802j1 = 0;

    private class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f12803a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private d f12806d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private d f12807e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private d f12808f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private d f12809g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f12810h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f12811i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f12812j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f12813k;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f12819q;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private e f12804b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f12805c = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f12814l = 0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f12815m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f12816n = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f12817o = 0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f12818p = 0;

        public a(int i10, d dVar, d dVar2, d dVar3, d dVar4, int i11) {
            this.f12810h = 0;
            this.f12811i = 0;
            this.f12812j = 0;
            this.f12813k = 0;
            this.f12819q = 0;
            this.f12803a = i10;
            this.f12806d = dVar;
            this.f12807e = dVar2;
            this.f12808f = dVar3;
            this.f12809g = dVar4;
            this.f12810h = g.this.P0();
            this.f12811i = g.this.R0();
            this.f12812j = g.this.Q0();
            this.f12813k = g.this.O0();
            this.f12819q = i11;
        }

        private void h() {
            this.f12814l = 0;
            this.f12815m = 0;
            this.f12804b = null;
            this.f12805c = 0;
            int i10 = this.f12817o;
            for (int i11 = 0; i11 < i10 && this.f12816n + i11 < g.this.f12802j1; i11++) {
                e eVar = g.this.f12801i1[this.f12816n + i11];
                if (this.f12803a == 0) {
                    int iP = eVar.P();
                    int i12 = g.this.f12790X0;
                    if (eVar.O() == 8) {
                        i12 = 0;
                    }
                    this.f12814l += iP + i12;
                    int iA1 = g.this.A1(eVar, this.f12819q);
                    if (this.f12804b == null || this.f12805c < iA1) {
                        this.f12804b = eVar;
                        this.f12805c = iA1;
                        this.f12815m = iA1;
                    }
                } else {
                    int iB1 = g.this.B1(eVar, this.f12819q);
                    int iA2 = g.this.A1(eVar, this.f12819q);
                    int i13 = g.this.f12791Y0;
                    if (eVar.O() == 8) {
                        i13 = 0;
                    }
                    this.f12815m += iA2 + i13;
                    if (this.f12804b == null || this.f12805c < iB1) {
                        this.f12804b = eVar;
                        this.f12805c = iB1;
                        this.f12814l = iB1;
                    }
                }
            }
        }

        public void b(e eVar) {
            if (this.f12803a == 0) {
                int iB1 = g.this.B1(eVar, this.f12819q);
                if (eVar.y() == e.b.MATCH_CONSTRAINT) {
                    this.f12818p++;
                    iB1 = 0;
                }
                this.f12814l += iB1 + (eVar.O() != 8 ? g.this.f12790X0 : 0);
                int iA1 = g.this.A1(eVar, this.f12819q);
                if (this.f12804b == null || this.f12805c < iA1) {
                    this.f12804b = eVar;
                    this.f12805c = iA1;
                    this.f12815m = iA1;
                }
            } else {
                int iB2 = g.this.B1(eVar, this.f12819q);
                int iA2 = g.this.A1(eVar, this.f12819q);
                if (eVar.M() == e.b.MATCH_CONSTRAINT) {
                    this.f12818p++;
                    iA2 = 0;
                }
                this.f12815m += iA2 + (eVar.O() != 8 ? g.this.f12791Y0 : 0);
                if (this.f12804b == null || this.f12805c < iB2) {
                    this.f12804b = eVar;
                    this.f12805c = iB2;
                    this.f12814l = iB2;
                }
            }
            this.f12817o++;
        }

        public void c() {
            this.f12805c = 0;
            this.f12804b = null;
            this.f12814l = 0;
            this.f12815m = 0;
            this.f12816n = 0;
            this.f12817o = 0;
            this.f12818p = 0;
        }

        public void d(boolean z10, int i10, boolean z11) {
            e eVar;
            int i11;
            char c10;
            int i12 = this.f12817o;
            for (int i13 = 0; i13 < i12 && this.f12816n + i13 < g.this.f12802j1; i13++) {
                e eVar2 = g.this.f12801i1[this.f12816n + i13];
                if (eVar2 != null) {
                    eVar2.Z();
                }
            }
            if (i12 == 0 || this.f12804b == null) {
                return;
            }
            boolean z12 = z11 && i10 == 0;
            int i14 = -1;
            int i15 = -1;
            for (int i16 = 0; i16 < i12; i16++) {
                int i17 = z10 ? (i12 - 1) - i16 : i16;
                if (this.f12816n + i17 >= g.this.f12802j1) {
                    break;
                }
                if (g.this.f12801i1[this.f12816n + i17].O() == 0) {
                    if (i14 == -1) {
                        i14 = i16;
                    }
                    i15 = i16;
                }
            }
            e eVar3 = null;
            if (this.f12803a != 0) {
                e eVar4 = this.f12804b;
                eVar4.j0(g.this.f12778L0);
                int i18 = this.f12810h;
                if (i10 > 0) {
                    i18 += g.this.f12790X0;
                }
                if (z10) {
                    eVar4.f12678D.a(this.f12808f, i18);
                    if (z11) {
                        eVar4.f12676B.a(this.f12806d, this.f12812j);
                    }
                    if (i10 > 0) {
                        this.f12808f.f12657b.f12676B.a(eVar4.f12678D, 0);
                    }
                } else {
                    eVar4.f12676B.a(this.f12806d, i18);
                    if (z11) {
                        eVar4.f12678D.a(this.f12808f, this.f12812j);
                    }
                    if (i10 > 0) {
                        this.f12806d.f12657b.f12678D.a(eVar4.f12676B, 0);
                    }
                }
                int i19 = 0;
                while (i19 < i12 && this.f12816n + i19 < g.this.f12802j1) {
                    e eVar5 = g.this.f12801i1[this.f12816n + i19];
                    if (i19 == 0) {
                        eVar5.j(eVar5.f12677C, this.f12807e, this.f12811i);
                        int i20 = g.this.f12779M0;
                        float f10 = g.this.f12785S0;
                        if (this.f12816n == 0 && g.this.f12781O0 != -1) {
                            i20 = g.this.f12781O0;
                            f10 = g.this.f12787U0;
                        } else if (z11 && g.this.f12783Q0 != -1) {
                            i20 = g.this.f12783Q0;
                            f10 = g.this.f12789W0;
                        }
                        eVar5.y0(i20);
                        eVar5.x0(f10);
                    }
                    if (i19 == i12 - 1) {
                        eVar5.j(eVar5.f12679E, this.f12809g, this.f12813k);
                    }
                    if (eVar3 != null) {
                        eVar5.f12677C.a(eVar3.f12679E, g.this.f12791Y0);
                        if (i19 == i14) {
                            eVar5.f12677C.n(this.f12811i);
                        }
                        eVar3.f12679E.a(eVar5.f12677C, 0);
                        if (i19 == i15 + 1) {
                            eVar3.f12679E.n(this.f12813k);
                        }
                    }
                    if (eVar5 != eVar4) {
                        if (z10) {
                            int i21 = g.this.f12792Z0;
                            if (i21 == 0) {
                                eVar5.f12678D.a(eVar4.f12678D, 0);
                            } else if (i21 == 1) {
                                eVar5.f12676B.a(eVar4.f12676B, 0);
                            } else if (i21 == 2) {
                                eVar5.f12676B.a(eVar4.f12676B, 0);
                                eVar5.f12678D.a(eVar4.f12678D, 0);
                            }
                        } else {
                            int i22 = g.this.f12792Z0;
                            if (i22 == 0) {
                                eVar5.f12676B.a(eVar4.f12676B, 0);
                            } else if (i22 == 1) {
                                eVar5.f12678D.a(eVar4.f12678D, 0);
                            } else if (i22 == 2) {
                                if (z12) {
                                    eVar5.f12676B.a(this.f12806d, this.f12810h);
                                    eVar5.f12678D.a(this.f12808f, this.f12812j);
                                } else {
                                    eVar5.f12676B.a(eVar4.f12676B, 0);
                                    eVar5.f12678D.a(eVar4.f12678D, 0);
                                }
                            }
                        }
                    }
                    i19++;
                    eVar3 = eVar5;
                }
                return;
            }
            e eVar6 = this.f12804b;
            eVar6.y0(g.this.f12779M0);
            int i23 = this.f12811i;
            if (i10 > 0) {
                i23 += g.this.f12791Y0;
            }
            eVar6.f12677C.a(this.f12807e, i23);
            if (z11) {
                eVar6.f12679E.a(this.f12809g, this.f12813k);
            }
            if (i10 > 0) {
                this.f12807e.f12657b.f12679E.a(eVar6.f12677C, 0);
            }
            if (g.this.f12793a1 != 3 || eVar6.S()) {
                eVar = eVar6;
                break;
            }
            int i24 = 0;
            while (true) {
                if (i24 < i12) {
                    int i25 = z10 ? (i12 - 1) - i24 : i24;
                    if (this.f12816n + i25 < g.this.f12802j1) {
                        eVar = g.this.f12801i1[this.f12816n + i25];
                        if (eVar.S()) {
                            break;
                        } else {
                            i24++;
                        }
                    }
                }
                eVar = eVar6;
                break;
            }
            int i26 = 0;
            while (i26 < i12) {
                int i27 = z10 ? (i12 - 1) - i26 : i26;
                if (this.f12816n + i27 >= g.this.f12802j1) {
                    return;
                }
                e eVar7 = g.this.f12801i1[this.f12816n + i27];
                if (i26 == 0) {
                    i11 = 1;
                    eVar7.j(eVar7.f12676B, this.f12806d, this.f12810h);
                } else {
                    i11 = 1;
                }
                if (i27 == 0) {
                    int i28 = g.this.f12778L0;
                    float f11 = g.this.f12784R0;
                    if (this.f12816n == 0 && g.this.f12780N0 != -1) {
                        i28 = g.this.f12780N0;
                        f11 = g.this.f12786T0;
                    } else if (z11 && g.this.f12782P0 != -1) {
                        i28 = g.this.f12782P0;
                        f11 = g.this.f12788V0;
                    }
                    eVar7.j0(i28);
                    eVar7.i0(f11);
                }
                if (i26 == i12 - 1) {
                    eVar7.j(eVar7.f12678D, this.f12808f, this.f12812j);
                }
                if (eVar3 != null) {
                    eVar7.f12676B.a(eVar3.f12678D, g.this.f12790X0);
                    if (i26 == i14) {
                        eVar7.f12676B.n(this.f12810h);
                    }
                    eVar3.f12678D.a(eVar7.f12676B, 0);
                    if (i26 == i15 + 1) {
                        eVar3.f12678D.n(this.f12812j);
                    }
                }
                if (eVar7 != eVar6) {
                    c10 = 3;
                    if (g.this.f12793a1 == 3 && eVar.S() && eVar7 != eVar && eVar7.S()) {
                        eVar7.f12680F.a(eVar.f12680F, 0);
                    } else {
                        int i29 = g.this.f12793a1;
                        if (i29 == 0) {
                            eVar7.f12677C.a(eVar6.f12677C, 0);
                        } else if (i29 == i11) {
                            eVar7.f12679E.a(eVar6.f12679E, 0);
                        } else if (z12) {
                            eVar7.f12677C.a(this.f12807e, this.f12811i);
                            eVar7.f12679E.a(this.f12809g, this.f12813k);
                        } else {
                            eVar7.f12677C.a(eVar6.f12677C, 0);
                            eVar7.f12679E.a(eVar6.f12679E, 0);
                        }
                    }
                } else {
                    c10 = 3;
                }
                i26++;
                eVar3 = eVar7;
            }
        }

        public int e() {
            return this.f12803a == 1 ? this.f12815m - g.this.f12791Y0 : this.f12815m;
        }

        public int f() {
            return this.f12803a == 0 ? this.f12814l - g.this.f12790X0 : this.f12814l;
        }

        public void g(int i10) {
            int i11 = this.f12818p;
            if (i11 == 0) {
                return;
            }
            int i12 = this.f12817o;
            int i13 = i10 / i11;
            for (int i14 = 0; i14 < i12 && this.f12816n + i14 < g.this.f12802j1; i14++) {
                e eVar = g.this.f12801i1[this.f12816n + i14];
                if (this.f12803a == 0) {
                    if (eVar != null && eVar.y() == e.b.MATCH_CONSTRAINT && eVar.f12723l == 0) {
                        g.this.T0(eVar, e.b.FIXED, i13, eVar.M(), eVar.v());
                    }
                } else if (eVar != null && eVar.M() == e.b.MATCH_CONSTRAINT && eVar.f12725m == 0) {
                    int i15 = i13;
                    g.this.T0(eVar, eVar.y(), eVar.P(), e.b.FIXED, i15);
                    i13 = i15;
                }
            }
            h();
        }

        public void i(int i10) {
            this.f12816n = i10;
        }

        public void j(int i10, d dVar, d dVar2, d dVar3, d dVar4, int i11, int i12, int i13, int i14, int i15) {
            this.f12803a = i10;
            this.f12806d = dVar;
            this.f12807e = dVar2;
            this.f12808f = dVar3;
            this.f12809g = dVar4;
            this.f12810h = i11;
            this.f12811i = i12;
            this.f12812j = i13;
            this.f12813k = i14;
            this.f12819q = i15;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int A1(e eVar, int i10) {
        e eVar2;
        if (eVar == null) {
            return 0;
        }
        if (eVar.M() == e.b.MATCH_CONSTRAINT) {
            int i11 = eVar.f12725m;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (eVar.f12739t * i10);
                if (i12 != eVar.v()) {
                    T0(eVar, eVar.y(), eVar.P(), e.b.FIXED, i12);
                }
                return i12;
            }
            eVar2 = eVar;
            if (i11 == 1) {
                return eVar2.v();
            }
            if (i11 == 3) {
                return (int) ((eVar2.P() * eVar2.f12691Q) + 0.5f);
            }
        } else {
            eVar2 = eVar;
        }
        return eVar2.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int B1(e eVar, int i10) {
        e eVar2;
        if (eVar == null) {
            return 0;
        }
        if (eVar.y() == e.b.MATCH_CONSTRAINT) {
            int i11 = eVar.f12723l;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (eVar.f12733q * i10);
                if (i12 != eVar.P()) {
                    T0(eVar, e.b.FIXED, i12, eVar.M(), eVar.v());
                }
                return i12;
            }
            eVar2 = eVar;
            if (i11 == 1) {
                return eVar2.P();
            }
            if (i11 == 3) {
                return (int) ((eVar2.v() * eVar2.f12691Q) + 0.5f);
            }
        } else {
            eVar2 = eVar;
        }
        return eVar2.P();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:106:0x010f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:109:0x0117 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x011d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0059 A[ADDED_TO_REGION, EDGE_INSN: B:119:0x0059->B:42:0x0059 BREAK  A[LOOP:1: B:44:0x005c->B:124:0x005c], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0059 A[ADDED_TO_REGION, EDGE_INSN: B:122:0x0059->B:42:0x0059 BREAK  A[LOOP:1: B:44:0x005c->B:124:0x005c], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x00d3 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0060  */
    /* JADX WARN: Code duplicated, block: B:47:0x006a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0078  */
    /* JADX WARN: Code duplicated, block: B:54:0x0080  */
    /* JADX WARN: Code duplicated, block: B:57:0x0088  */
    /* JADX WARN: Code duplicated, block: B:61:0x0090  */
    /* JADX WARN: Code duplicated, block: B:64:0x0097  */
    /* JADX WARN: Code duplicated, block: B:66:0x009a  */
    /* JADX WARN: Code duplicated, block: B:68:0x009f  */
    /* JADX WARN: Code duplicated, block: B:72:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:82:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:89:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:91:0x00e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:97:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:99:0x00fa A[DONT_INVERT] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x010d -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x010f -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0115 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x0117 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:45:0x005e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private void C1(U0.e[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U0.g.C1(U0.e[], int, int, int, int[]):void");
    }

    private void D1(e[] eVarArr, int i10, int i11, int i12, int[] iArr) {
        int i13;
        g gVar;
        int i14;
        d dVar;
        int i15;
        g gVar2 = this;
        if (i10 == 0) {
            return;
        }
        gVar2.f12797e1.clear();
        int i16 = i12;
        a aVar = gVar2.new a(i11, gVar2.f12676B, gVar2.f12677C, gVar2.f12678D, gVar2.f12679E, i16);
        gVar2.f12797e1.add(aVar);
        if (i11 == 0) {
            i13 = 0;
            int i17 = 0;
            int i18 = 0;
            while (i18 < i10) {
                e eVar = eVarArr[i18];
                int iB1 = gVar2.B1(eVar, i16);
                if (eVar.y() == e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i19 = i13;
                boolean z10 = (i17 == i16 || (gVar2.f12790X0 + i17) + iB1 > i16) && aVar.f12804b != null;
                if (!z10 && i18 > 0 && (i15 = gVar2.f12795c1) > 0 && i18 % i15 == 0) {
                    z10 = true;
                }
                if (z10) {
                    aVar = gVar2.new a(i11, gVar2.f12676B, gVar2.f12677C, gVar2.f12678D, gVar2.f12679E, i16);
                    aVar.i(i18);
                    gVar2.f12797e1.add(aVar);
                } else {
                    if (i18 > 0) {
                        i17 += gVar2.f12790X0 + iB1;
                    }
                    aVar.b(eVar);
                    i18++;
                    i13 = i19;
                }
                i17 = iB1;
                aVar.b(eVar);
                i18++;
                i13 = i19;
            }
        } else {
            i13 = 0;
            int i20 = 0;
            int i21 = 0;
            while (i21 < i10) {
                e eVar2 = eVarArr[i21];
                int iA1 = gVar2.A1(eVar2, i16);
                if (eVar2.M() == e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i22 = i13;
                boolean z11 = (i20 == i16 || (gVar2.f12791Y0 + i20) + iA1 > i16) && aVar.f12804b != null;
                if (!z11 && i21 > 0 && (i14 = gVar2.f12795c1) > 0 && i21 % i14 == 0) {
                    z11 = true;
                }
                if (z11) {
                    aVar = gVar2.new a(i11, gVar2.f12676B, gVar2.f12677C, gVar2.f12678D, gVar2.f12679E, i16);
                    gVar = gVar2;
                    aVar.i(i21);
                    gVar.f12797e1.add(aVar);
                } else {
                    gVar = gVar2;
                    if (i21 > 0) {
                        i20 += gVar.f12791Y0 + iA1;
                    }
                    aVar.b(eVar2);
                    i21++;
                    i16 = i12;
                    i13 = i22;
                    gVar2 = gVar;
                }
                i20 = iA1;
                aVar.b(eVar2);
                i21++;
                i16 = i12;
                i13 = i22;
                gVar2 = gVar;
            }
        }
        g gVar3 = gVar2;
        int size = gVar3.f12797e1.size();
        d dVar2 = gVar3.f12676B;
        d dVar3 = gVar3.f12677C;
        d dVar4 = gVar3.f12678D;
        d dVar5 = gVar3.f12679E;
        int iP0 = gVar3.P0();
        int iR0 = gVar3.R0();
        int iQ0 = gVar3.Q0();
        int iO0 = gVar3.O0();
        e.b bVarY = gVar3.y();
        e.b bVar = e.b.WRAP_CONTENT;
        boolean z12 = bVarY == bVar || gVar3.M() == bVar;
        if (i13 > 0 && z12) {
            for (int i23 = 0; i23 < size; i23++) {
                a aVar2 = (a) gVar3.f12797e1.get(i23);
                if (i11 == 0) {
                    aVar2.g(i12 - aVar2.f());
                } else {
                    aVar2.g(i12 - aVar2.e());
                }
            }
        }
        d dVar6 = dVar2;
        int iO1 = iO0;
        int i24 = 0;
        int iQ1 = iQ0;
        int i25 = iR0;
        int i26 = iP0;
        d dVar7 = dVar5;
        d dVar8 = dVar4;
        d dVar9 = dVar3;
        int i27 = 0;
        for (int i28 = 0; i28 < size; i28++) {
            a aVar3 = (a) gVar3.f12797e1.get(i28);
            if (i11 == 0) {
                if (i28 < size - 1) {
                    dVar7 = ((a) gVar3.f12797e1.get(i28 + 1)).f12804b.f12677C;
                    iO1 = 0;
                } else {
                    dVar7 = gVar3.f12679E;
                    iO1 = gVar3.O0();
                }
                d dVar10 = aVar3.f12804b.f12679E;
                int i29 = i27;
                aVar3.j(i11, dVar6, dVar9, dVar8, dVar7, i26, i25, iQ1, iO1, i12);
                int iMax = Math.max(i24, aVar3.f());
                int iE = aVar3.e() + i29;
                if (i28 > 0) {
                    iE += gVar3.f12791Y0;
                }
                i27 = iE;
                i24 = iMax;
                dVar9 = dVar10;
                i25 = 0;
            } else {
                int i30 = i24;
                int i31 = i27;
                if (i28 < size - 1) {
                    dVar = ((a) gVar3.f12797e1.get(i28 + 1)).f12804b.f12676B;
                    iQ1 = 0;
                } else {
                    dVar = gVar3.f12678D;
                    iQ1 = gVar3.Q0();
                }
                dVar8 = dVar;
                d dVar11 = aVar3.f12804b.f12678D;
                aVar3.j(i11, dVar6, dVar9, dVar8, dVar7, i26, i25, iQ1, iO1, i12);
                int iF = aVar3.f() + i30;
                int iMax2 = Math.max(i31, aVar3.e());
                if (i28 > 0) {
                    iF += gVar3.f12790X0;
                }
                int i32 = iF;
                i27 = iMax2;
                i24 = i32;
                i26 = 0;
                dVar6 = dVar11;
            }
        }
        iArr[0] = i24;
        iArr[1] = i27;
    }

    private void E1(e[] eVarArr, int i10, int i11, int i12, int[] iArr) {
        a aVar;
        if (i10 == 0) {
            return;
        }
        if (this.f12797e1.size() == 0) {
            aVar = new a(i11, this.f12676B, this.f12677C, this.f12678D, this.f12679E, i12);
            this.f12797e1.add(aVar);
        } else {
            a aVar2 = (a) this.f12797e1.get(0);
            aVar2.c();
            aVar2.j(i11, this.f12676B, this.f12677C, this.f12678D, this.f12679E, P0(), R0(), Q0(), O0(), i12);
            aVar = aVar2;
        }
        for (int i13 = 0; i13 < i10; i13++) {
            aVar.b(eVarArr[i13]);
        }
        iArr[0] = aVar.f();
        iArr[1] = aVar.e();
    }

    private void z1(boolean z10) {
        e eVar;
        if (this.f12800h1 == null || this.f12799g1 == null || this.f12798f1 == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f12802j1; i10++) {
            this.f12801i1[i10].Z();
        }
        int[] iArr = this.f12800h1;
        int i11 = iArr[0];
        int i12 = iArr[1];
        e eVar2 = null;
        for (int i13 = 0; i13 < i11; i13++) {
            e eVar3 = this.f12799g1[z10 ? (i11 - i13) - 1 : i13];
            if (eVar3 != null && eVar3.O() != 8) {
                if (i13 == 0) {
                    eVar3.j(eVar3.f12676B, this.f12676B, P0());
                    eVar3.j0(this.f12778L0);
                    eVar3.i0(this.f12784R0);
                }
                if (i13 == i11 - 1) {
                    eVar3.j(eVar3.f12678D, this.f12678D, Q0());
                }
                if (i13 > 0) {
                    eVar3.j(eVar3.f12676B, eVar2.f12678D, this.f12790X0);
                    eVar2.j(eVar2.f12678D, eVar3.f12676B, 0);
                }
                eVar2 = eVar3;
            }
        }
        for (int i14 = 0; i14 < i12; i14++) {
            e eVar4 = this.f12798f1[i14];
            if (eVar4 != null && eVar4.O() != 8) {
                if (i14 == 0) {
                    eVar4.j(eVar4.f12677C, this.f12677C, R0());
                    eVar4.y0(this.f12779M0);
                    eVar4.x0(this.f12785S0);
                }
                if (i14 == i12 - 1) {
                    eVar4.j(eVar4.f12679E, this.f12679E, O0());
                }
                if (i14 > 0) {
                    eVar4.j(eVar4.f12677C, eVar2.f12679E, this.f12791Y0);
                    eVar2.j(eVar2.f12679E, eVar4.f12677C, 0);
                }
                eVar2 = eVar4;
            }
        }
        for (int i15 = 0; i15 < i11; i15++) {
            for (int i16 = 0; i16 < i12; i16++) {
                int i17 = (i16 * i11) + i15;
                if (this.f12796d1 == 1) {
                    i17 = (i15 * i12) + i16;
                }
                e[] eVarArr = this.f12801i1;
                if (i17 < eVarArr.length && (eVar = eVarArr[i17]) != null && eVar.O() != 8) {
                    e eVar5 = this.f12799g1[i15];
                    e eVar6 = this.f12798f1[i16];
                    if (eVar != eVar5) {
                        eVar.j(eVar.f12676B, eVar5.f12676B, 0);
                        eVar.j(eVar.f12678D, eVar5.f12678D, 0);
                    }
                    if (eVar != eVar6) {
                        eVar.j(eVar.f12677C, eVar6.f12677C, 0);
                        eVar.j(eVar.f12679E, eVar6.f12679E, 0);
                    }
                }
            }
        }
    }

    public void F1(float f10) {
        this.f12786T0 = f10;
    }

    public void G1(int i10) {
        this.f12780N0 = i10;
    }

    public void H1(float f10) {
        this.f12787U0 = f10;
    }

    public void I1(int i10) {
        this.f12781O0 = i10;
    }

    public void J1(int i10) {
        this.f12792Z0 = i10;
    }

    public void K1(float f10) {
        this.f12784R0 = f10;
    }

    public void L1(int i10) {
        this.f12790X0 = i10;
    }

    public void M1(int i10) {
        this.f12778L0 = i10;
    }

    public void N1(float f10) {
        this.f12788V0 = f10;
    }

    public void O1(int i10) {
        this.f12782P0 = i10;
    }

    public void P1(float f10) {
        this.f12789W0 = f10;
    }

    public void Q1(int i10) {
        this.f12783Q0 = i10;
    }

    public void R1(int i10) {
        this.f12795c1 = i10;
    }

    @Override // U0.l
    public void S0(int i10, int i11, int i12, int i13) {
        int i14;
        e[] eVarArr;
        if (this.f12829x0 > 0 && !U0()) {
            X0(0, 0);
            W0(false);
            return;
        }
        int iP0 = P0();
        int iQ0 = Q0();
        int iR0 = R0();
        int iO0 = O0();
        int[] iArr = new int[2];
        int i15 = (i11 - iP0) - iQ0;
        int i16 = this.f12796d1;
        if (i16 == 1) {
            i15 = (i13 - iR0) - iO0;
        }
        int i17 = i15;
        if (i16 == 0) {
            if (this.f12778L0 == -1) {
                this.f12778L0 = 0;
            }
            if (this.f12779M0 == -1) {
                this.f12779M0 = 0;
            }
        } else {
            if (this.f12778L0 == -1) {
                this.f12778L0 = 0;
            }
            if (this.f12779M0 == -1) {
                this.f12779M0 = 0;
            }
        }
        e[] eVarArr2 = this.f12828w0;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            i14 = this.f12829x0;
            if (i18 >= i14) {
                break;
            }
            if (this.f12828w0[i18].O() == 8) {
                i19++;
            }
            i18++;
        }
        if (i19 > 0) {
            e[] eVarArr3 = new e[i14 - i19];
            int i20 = 0;
            i14 = 0;
            while (i20 < this.f12829x0) {
                e eVar = this.f12828w0[i20];
                e[] eVarArr4 = eVarArr3;
                if (eVar.O() != 8) {
                    eVarArr4[i14] = eVar;
                    i14++;
                }
                i20++;
                eVarArr3 = eVarArr4;
            }
            eVarArr = eVarArr3;
        } else {
            eVarArr = eVarArr2;
        }
        int i21 = i14;
        this.f12801i1 = eVarArr;
        this.f12802j1 = i21;
        int i22 = this.f12794b1;
        if (i22 == 0) {
            E1(eVarArr, i21, this.f12796d1, i17, iArr);
        } else if (i22 == 1) {
            D1(eVarArr, i21, this.f12796d1, i17, iArr);
        } else if (i22 == 2) {
            C1(eVarArr, i21, this.f12796d1, i17, iArr);
        }
        int iMin = iArr[0] + iP0 + iQ0;
        int iMin2 = iArr[1] + iR0 + iO0;
        if (i10 == 1073741824) {
            iMin = i11;
        } else if (i10 == Integer.MIN_VALUE) {
            iMin = Math.min(iMin, i11);
        } else if (i10 != 0) {
            iMin = 0;
        }
        if (i12 == 1073741824) {
            iMin2 = i13;
        } else if (i12 == Integer.MIN_VALUE) {
            iMin2 = Math.min(iMin2, i13);
        } else if (i12 != 0) {
            iMin2 = 0;
        }
        X0(iMin, iMin2);
        E0(iMin);
        h0(iMin2);
        W0(this.f12829x0 > 0);
    }

    public void S1(int i10) {
        this.f12796d1 = i10;
    }

    public void T1(int i10) {
        this.f12793a1 = i10;
    }

    public void U1(float f10) {
        this.f12785S0 = f10;
    }

    public void V1(int i10) {
        this.f12791Y0 = i10;
    }

    public void W1(int i10) {
        this.f12779M0 = i10;
    }

    public void X1(int i10) {
        this.f12794b1 = i10;
    }

    @Override // U0.e
    public void f(T0.d dVar) {
        super.f(dVar);
        boolean zA1 = G() != null ? ((f) G()).a1() : false;
        int i10 = this.f12794b1;
        if (i10 != 0) {
            if (i10 == 1) {
                int size = this.f12797e1.size();
                int i11 = 0;
                while (i11 < size) {
                    ((a) this.f12797e1.get(i11)).d(zA1, i11, i11 == size + (-1));
                    i11++;
                }
            } else if (i10 == 2) {
                z1(zA1);
            }
        } else if (this.f12797e1.size() > 0) {
            ((a) this.f12797e1.get(0)).d(zA1, 0, true);
        }
        W0(false);
    }
}

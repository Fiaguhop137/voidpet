package U3;

import R3.T;
import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Matrix f13086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Matrix f13087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Matrix f13088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float[] f13089e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private a f13096l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private a f13097m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private a f13098n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private a f13099o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private a f13100p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private d f13101q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private d f13102r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private d f13103s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private d f13104t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private d f13105u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private a f13106v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private a f13107w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final boolean f13108x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Matrix f13085a = new Matrix();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f13090f = Float.NaN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f13091g = Float.NaN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f13092h = Float.NaN;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f13093i = 1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f13094j = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f13095k = true;

    public s(Y3.n nVar) {
        this.f13096l = nVar.c() == null ? null : nVar.c().k();
        this.f13097m = nVar.f() == null ? null : nVar.f().k();
        this.f13098n = nVar.k() == null ? null : nVar.k().k();
        this.f13099o = nVar.g() == null ? null : nVar.g().k();
        this.f13101q = nVar.l() == null ? null : nVar.l().k();
        this.f13108x = nVar.o();
        this.f13103s = nVar.h() == null ? null : nVar.h().k();
        this.f13104t = nVar.i() == null ? null : nVar.i().k();
        this.f13105u = nVar.j() == null ? null : nVar.j().k();
        if (this.f13101q != null) {
            this.f13086b = new Matrix();
            this.f13087c = new Matrix();
            this.f13088d = new Matrix();
            this.f13089e = new float[9];
        } else {
            this.f13086b = null;
            this.f13087c = null;
            this.f13088d = null;
            this.f13089e = null;
        }
        this.f13102r = nVar.m() == null ? null : nVar.m().k();
        if (nVar.e() != null) {
            this.f13100p = nVar.e().k();
        }
        if (nVar.n() != null) {
            this.f13106v = nVar.n().k();
        } else {
            this.f13106v = null;
        }
        if (nVar.d() != null) {
            this.f13107w = nVar.d().k();
        } else {
            this.f13107w = null;
        }
    }

    private void g() {
        for (int i10 = 0; i10 < 9; i10++) {
            this.f13089e[i10] = 0.0f;
        }
    }

    public void d(p005a4.b bVar) {
        bVar.j(this.f13100p);
        bVar.j(this.f13106v);
        bVar.j(this.f13107w);
        bVar.j(this.f13096l);
        bVar.j(this.f13097m);
        bVar.j(this.f13098n);
        bVar.j(this.f13099o);
        bVar.j(this.f13101q);
        bVar.j(this.f13102r);
        bVar.j(this.f13103s);
        bVar.j(this.f13104t);
        bVar.j(this.f13105u);
    }

    public void e(a.b bVar) {
        a aVar = this.f13100p;
        if (aVar != null) {
            aVar.a(bVar);
        }
        a aVar2 = this.f13106v;
        if (aVar2 != null) {
            aVar2.a(bVar);
        }
        a aVar3 = this.f13107w;
        if (aVar3 != null) {
            aVar3.a(bVar);
        }
        a aVar4 = this.f13096l;
        if (aVar4 != null) {
            aVar4.a(bVar);
        }
        a aVar5 = this.f13097m;
        if (aVar5 != null) {
            aVar5.a(bVar);
        }
        a aVar6 = this.f13098n;
        if (aVar6 != null) {
            aVar6.a(bVar);
        }
        a aVar7 = this.f13099o;
        if (aVar7 != null) {
            aVar7.a(bVar);
        }
        d dVar = this.f13101q;
        if (dVar != null) {
            dVar.a(bVar);
        }
        d dVar2 = this.f13102r;
        if (dVar2 != null) {
            dVar2.a(bVar);
        }
        d dVar3 = this.f13103s;
        if (dVar3 != null) {
            dVar3.a(bVar);
            this.f13103s.a(new p(this));
        }
        d dVar4 = this.f13104t;
        if (dVar4 != null) {
            dVar4.a(bVar);
            this.f13104t.a(new q(this));
        }
        d dVar5 = this.f13105u;
        if (dVar5 != null) {
            dVar5.a(bVar);
            this.f13105u.a(new r(this));
        }
    }

    public boolean f(Object obj, p095f4.c cVar) {
        Float fValueOf = Float.valueOf(100.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        if (obj == T.f10699f) {
            a aVar = this.f13096l;
            if (aVar == null) {
                this.f13096l = new t(cVar, new PointF());
                return true;
            }
            aVar.o(cVar);
            return true;
        }
        if (obj == T.f10700g) {
            a aVar2 = this.f13097m;
            if (aVar2 == null) {
                this.f13097m = new t(cVar, new PointF());
                return true;
            }
            aVar2.o(cVar);
            return true;
        }
        if (obj == T.f10701h) {
            a aVar3 = this.f13097m;
            if (aVar3 instanceof n) {
                ((n) aVar3).t(cVar);
                return true;
            }
        }
        if (obj == T.f10702i) {
            a aVar4 = this.f13097m;
            if (aVar4 instanceof n) {
                ((n) aVar4).u(cVar);
                return true;
            }
        }
        if (obj == T.f10708o) {
            a aVar5 = this.f13098n;
            if (aVar5 == null) {
                this.f13098n = new t(cVar, new p095f4.d());
                return true;
            }
            aVar5.o(cVar);
            return true;
        }
        if (obj == T.f10709p) {
            a aVar6 = this.f13099o;
            if (aVar6 == null) {
                this.f13099o = new t(cVar, fValueOf2);
                return true;
            }
            aVar6.o(cVar);
            return true;
        }
        if (obj == T.f10696c) {
            a aVar7 = this.f13100p;
            if (aVar7 == null) {
                this.f13100p = new t(cVar, 100);
                return true;
            }
            aVar7.o(cVar);
            return true;
        }
        if (obj == T.f10680F) {
            a aVar8 = this.f13106v;
            if (aVar8 == null) {
                this.f13106v = new t(cVar, fValueOf);
                return true;
            }
            aVar8.o(cVar);
            return true;
        }
        if (obj == T.f10681G) {
            a aVar9 = this.f13107w;
            if (aVar9 == null) {
                this.f13107w = new t(cVar, fValueOf);
                return true;
            }
            aVar9.o(cVar);
            return true;
        }
        if (obj == T.f10713t) {
            if (this.f13101q == null) {
                this.f13101q = new d(Collections.singletonList(new p095f4.a(fValueOf2)));
            }
            this.f13101q.o(cVar);
            return true;
        }
        if (obj == T.f10714u) {
            if (this.f13102r == null) {
                this.f13102r = new d(Collections.singletonList(new p095f4.a(fValueOf2)));
            }
            this.f13102r.o(cVar);
            return true;
        }
        if (obj == T.f10710q) {
            if (this.f13103s == null) {
                this.f13103s = new d(Collections.singletonList(new p095f4.a(fValueOf2)));
            }
            this.f13103s.o(cVar);
            return true;
        }
        if (obj == T.f10711r) {
            if (this.f13104t == null) {
                this.f13104t = new d(Collections.singletonList(new p095f4.a(fValueOf2)));
            }
            this.f13104t.o(cVar);
            return true;
        }
        if (obj != T.f10712s) {
            return false;
        }
        if (this.f13105u == null) {
            this.f13105u = new d(Collections.singletonList(new p095f4.a(fValueOf2)));
        }
        this.f13105u.o(cVar);
        return true;
    }

    public a h() {
        return this.f13107w;
    }

    public Matrix i() {
        d dVar;
        d dVar2;
        PointF pointF;
        p095f4.d dVar3;
        PointF pointF2;
        this.f13085a.reset();
        d dVar4 = this.f13103s;
        if ((dVar4 != null && dVar4.r() != 0.0f) || (((dVar = this.f13104t) != null && dVar.r() != 0.0f) || ((dVar2 = this.f13105u) != null && dVar2.r() != 0.0f))) {
            d dVar5 = this.f13103s;
            float fR = dVar5 != null ? dVar5.r() : 0.0f;
            d dVar6 = this.f13104t;
            float fR2 = dVar6 != null ? dVar6.r() : 0.0f;
            d dVar7 = this.f13105u;
            float fR3 = dVar7 != null ? dVar7.r() : 0.0f;
            if (this.f13095k || fR != this.f13090f || fR2 != this.f13091g || fR3 != this.f13092h) {
                this.f13090f = fR;
                this.f13091g = fR2;
                this.f13092h = fR3;
                if (fR != 0.0f) {
                    this.f13093i = (float) Math.cos(Math.toRadians(fR));
                } else {
                    this.f13093i = 1.0f;
                }
                if (fR2 != 0.0f) {
                    this.f13094j = (float) Math.cos(Math.toRadians(fR2));
                } else {
                    this.f13094j = 1.0f;
                }
                this.f13095k = false;
            }
            a aVar = this.f13096l;
            PointF pointF3 = aVar == null ? null : (PointF) aVar.h();
            a aVar2 = this.f13097m;
            PointF pointF4 = aVar2 == null ? null : (PointF) aVar2.h();
            a aVar3 = this.f13098n;
            p095f4.d dVar8 = aVar3 != null ? (p095f4.d) aVar3.h() : null;
            p077e4.q.b(this.f13085a, pointF3, pointF4, dVar8 != null ? dVar8.b() : 1.0f, dVar8 != null ? dVar8.c() : 1.0f, fR, fR2, fR3, this.f13093i, this.f13094j);
            return this.f13085a;
        }
        a aVar4 = this.f13097m;
        if (aVar4 != null && (pointF2 = (PointF) aVar4.h()) != null) {
            float f10 = pointF2.x;
            if (f10 != 0.0f || pointF2.y != 0.0f) {
                this.f13085a.preTranslate(f10, pointF2.y);
            }
        }
        if (!this.f13108x) {
            a aVar5 = this.f13099o;
            if (aVar5 != null) {
                float fFloatValue = aVar5 instanceof t ? ((Float) aVar5.h()).floatValue() : ((d) aVar5).r();
                if (fFloatValue != 0.0f) {
                    this.f13085a.preRotate(fFloatValue);
                }
            }
        } else if (aVar4 != null) {
            float f11 = aVar4.f();
            PointF pointF5 = (PointF) aVar4.h();
            float f12 = pointF5.x;
            float f13 = pointF5.y;
            aVar4.n(1.0E-4f + f11);
            PointF pointF6 = (PointF) aVar4.h();
            aVar4.n(f11);
            this.f13085a.preRotate((float) Math.toDegrees(Math.atan2(pointF6.y - f13, pointF6.x - f12)));
        }
        d dVar9 = this.f13101q;
        if (dVar9 != null) {
            d dVar10 = this.f13102r;
            float fCos = dVar10 == null ? 0.0f : (float) Math.cos(Math.toRadians((-dVar10.r()) + 90.0f));
            d dVar11 = this.f13102r;
            float fSin = dVar11 == null ? 1.0f : (float) Math.sin(Math.toRadians((-dVar11.r()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(dVar9.r()));
            g();
            float[] fArr = this.f13089e;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f14 = -fSin;
            fArr[3] = f14;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            this.f13086b.setValues(fArr);
            g();
            float[] fArr2 = this.f13089e;
            fArr2[0] = 1.0f;
            fArr2[3] = fTan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f13087c.setValues(fArr2);
            g();
            float[] fArr3 = this.f13089e;
            fArr3[0] = fCos;
            fArr3[1] = f14;
            fArr3[3] = fSin;
            fArr3[4] = fCos;
            fArr3[8] = 1.0f;
            this.f13088d.setValues(fArr3);
            this.f13087c.preConcat(this.f13086b);
            this.f13088d.preConcat(this.f13087c);
            this.f13085a.preConcat(this.f13088d);
        }
        a aVar6 = this.f13098n;
        if (aVar6 != null && (dVar3 = (p095f4.d) aVar6.h()) != null && (dVar3.b() != 1.0f || dVar3.c() != 1.0f)) {
            this.f13085a.preScale(dVar3.b(), dVar3.c());
        }
        a aVar7 = this.f13096l;
        if (aVar7 != null && (pointF = (PointF) aVar7.h()) != null) {
            float f15 = pointF.x;
            if (f15 != 0.0f || pointF.y != 0.0f) {
                this.f13085a.preTranslate(-f15, -pointF.y);
            }
        }
        return this.f13085a;
    }

    public Matrix j(float f10) {
        a aVar = this.f13097m;
        PointF pointF = aVar == null ? null : (PointF) aVar.h();
        a aVar2 = this.f13098n;
        p095f4.d dVar = aVar2 == null ? null : (p095f4.d) aVar2.h();
        a aVar3 = this.f13096l;
        PointF pointF2 = aVar3 != null ? (PointF) aVar3.h() : null;
        this.f13085a.reset();
        if (pointF != null) {
            this.f13085a.preTranslate(pointF.x * f10, pointF.y * f10);
        }
        d dVar2 = this.f13103s;
        float fR = dVar2 != null ? dVar2.r() * f10 : 0.0f;
        d dVar3 = this.f13104t;
        float fR2 = dVar3 != null ? dVar3.r() * f10 : 0.0f;
        d dVar4 = this.f13105u;
        float fR3 = dVar4 != null ? dVar4.r() * f10 : 0.0f;
        if (fR == 0.0f && fR2 == 0.0f && fR3 == 0.0f) {
            a aVar4 = this.f13099o;
            if (aVar4 != null) {
                this.f13085a.preRotate(((Float) aVar4.h()).floatValue() * f10, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
            }
        } else {
            float fCos = fR != 0.0f ? (float) Math.cos(Math.toRadians(fR)) : 1.0f;
            float fCos2 = fR2 != 0.0f ? (float) Math.cos(Math.toRadians(fR2)) : 1.0f;
            if (fR3 != 0.0f) {
                this.f13085a.preRotate(fR3, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
            }
            p077e4.q.a(this.f13085a, fR, fR2, 0.0f, fCos, fCos2);
        }
        if (dVar != null) {
            double d10 = f10;
            this.f13085a.preScale((float) Math.pow(dVar.b(), d10), (float) Math.pow(dVar.c(), d10));
        }
        return this.f13085a;
    }

    public a k() {
        return this.f13100p;
    }

    public a l() {
        return this.f13106v;
    }

    public void m(float f10) {
        a aVar = this.f13100p;
        if (aVar != null) {
            aVar.n(f10);
        }
        a aVar2 = this.f13106v;
        if (aVar2 != null) {
            aVar2.n(f10);
        }
        a aVar3 = this.f13107w;
        if (aVar3 != null) {
            aVar3.n(f10);
        }
        a aVar4 = this.f13096l;
        if (aVar4 != null) {
            aVar4.n(f10);
        }
        a aVar5 = this.f13097m;
        if (aVar5 != null) {
            aVar5.n(f10);
        }
        a aVar6 = this.f13098n;
        if (aVar6 != null) {
            aVar6.n(f10);
        }
        a aVar7 = this.f13099o;
        if (aVar7 != null) {
            aVar7.n(f10);
        }
        d dVar = this.f13101q;
        if (dVar != null) {
            dVar.n(f10);
        }
        d dVar2 = this.f13102r;
        if (dVar2 != null) {
            dVar2.n(f10);
        }
        d dVar3 = this.f13103s;
        if (dVar3 != null) {
            dVar3.n(f10);
        }
        d dVar4 = this.f13104t;
        if (dVar4 != null) {
            dVar4.n(f10);
        }
        d dVar5 = this.f13105u;
        if (dVar5 != null) {
            dVar5.n(f10);
        }
    }
}

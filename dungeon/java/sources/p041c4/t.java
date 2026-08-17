package p041c4;

import R3.AbstractC1358e;
import R3.C1364k;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.lang.ref.WeakReference;
import p059d4.c;
import p077e4.l;
import p077e4.r;
import p235n1.a;
import p323s.g0;

/* JADX INFO: loaded from: classes.dex */
abstract class t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static g0 f27242b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Interpolator f27241a = new LinearInterpolator();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static c.a f27243c = c.a.a("t", "s", "e", "o", "i", "h", "to", "ti");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static c.a f27244d = c.a.a("x", "y");

    private static WeakReference a(int i10) {
        WeakReference weakReference;
        synchronized (t.class) {
            weakReference = (WeakReference) g().f(i10);
        }
        return weakReference;
    }

    private static Interpolator b(PointF pointF, PointF pointF2) {
        Interpolator interpolatorA;
        pointF.x = l.b(pointF.x, -1.0f, 1.0f);
        pointF.y = l.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = l.b(pointF2.x, -1.0f, 1.0f);
        float fB = l.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fB;
        int i10 = r.i(pointF.x, pointF.y, pointF2.x, fB);
        WeakReference weakReferenceA = AbstractC1358e.e() ? null : a(i10);
        Interpolator interpolator = weakReferenceA != null ? (Interpolator) weakReferenceA.get() : null;
        if (weakReferenceA != null && interpolator != null) {
            return interpolator;
        }
        try {
            interpolatorA = a.a(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e10) {
            interpolatorA = "The Path cannot loop back on itself.".equals(e10.getMessage()) ? a.a(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
        if (!AbstractC1358e.e()) {
            try {
                h(i10, new WeakReference(interpolatorA));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolatorA;
    }

    static p095f4.a c(c cVar, C1364k c1364k, float f10, N n10, boolean z10, boolean z11) {
        if (z10 && z11) {
            return e(c1364k, cVar, f10, n10);
        }
        return z10 ? d(c1364k, cVar, f10, n10) : f(cVar, f10, n10);
    }

    private static p095f4.a d(C1364k c1364k, c cVar, float f10, N n10) {
        Interpolator interpolatorB;
        Object obj;
        cVar.I();
        PointF pointFE = null;
        Object objA = null;
        Object objA2 = null;
        PointF pointFE2 = null;
        PointF pointFE3 = null;
        float fNextDouble = 0.0f;
        boolean z10 = false;
        PointF pointFE4 = null;
        while (cVar.hasNext()) {
            switch (cVar.f(f27243c)) {
                case 0:
                    fNextDouble = (float) cVar.nextDouble();
                    break;
                case 1:
                    objA2 = n10.a(cVar, f10);
                    break;
                case 2:
                    objA = n10.a(cVar, f10);
                    break;
                case 3:
                    pointFE = s.e(cVar, 1.0f);
                    break;
                case 4:
                    pointFE4 = s.e(cVar, 1.0f);
                    break;
                case 5:
                    z10 = cVar.nextInt() == 1;
                    break;
                case 6:
                    pointFE2 = s.e(cVar, f10);
                    break;
                case 7:
                    pointFE3 = s.e(cVar, f10);
                    break;
                default:
                    cVar.k0();
                    break;
            }
        }
        cVar.T();
        if (z10) {
            interpolatorB = f27241a;
            obj = objA2;
        } else {
            interpolatorB = (pointFE == null || pointFE4 == null) ? f27241a : b(pointFE, pointFE4);
            obj = objA;
        }
        p095f4.a aVar = new p095f4.a(c1364k, objA2, obj, interpolatorB, fNextDouble, null);
        aVar.f41726o = pointFE2;
        aVar.f41727p = pointFE3;
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:93:0x01e2  */
    private static p095f4.a e(C1364k c1364k, c cVar, float f10, N n10) {
        Interpolator interpolatorB;
        Interpolator interpolatorB2;
        Interpolator interpolatorB3;
        Object obj;
        Interpolator interpolator;
        PointF pointF;
        p095f4.a aVar;
        PointF pointF2;
        boolean z10;
        float f11;
        cVar.I();
        boolean z11 = false;
        PointF pointFE = null;
        PointF pointFE2 = null;
        PointF pointF3 = null;
        Object objA = null;
        PointF pointF4 = null;
        PointF pointF5 = null;
        PointF pointF6 = null;
        PointF pointFE3 = null;
        PointF pointFE4 = null;
        float fNextDouble = 0.0f;
        Object objA2 = null;
        while (cVar.hasNext()) {
            switch (cVar.f(f27243c)) {
                case 0:
                    fNextDouble = (float) cVar.nextDouble();
                    break;
                case 1:
                    objA = n10.a(cVar, f10);
                    break;
                case 2:
                    objA2 = n10.a(cVar, f10);
                    break;
                case 3:
                    boolean z12 = z11;
                    if (cVar.d() == c.b.BEGIN_OBJECT) {
                        cVar.I();
                        float fNextDouble2 = 0.0f;
                        float fNextDouble3 = 0.0f;
                        float fNextDouble4 = 0.0f;
                        float fNextDouble5 = 0.0f;
                        while (cVar.hasNext()) {
                            int iF = cVar.f(f27244d);
                            if (iF == 0) {
                                pointF2 = pointF5;
                                c.b bVarD = cVar.d();
                                c.b bVar = c.b.NUMBER;
                                if (bVarD == bVar) {
                                    fNextDouble4 = (float) cVar.nextDouble();
                                    fNextDouble2 = fNextDouble4;
                                } else {
                                    cVar.N();
                                    fNextDouble2 = (float) cVar.nextDouble();
                                    fNextDouble4 = cVar.d() == bVar ? (float) cVar.nextDouble() : fNextDouble2;
                                    cVar.J();
                                }
                            } else if (iF != 1) {
                                cVar.k0();
                            } else {
                                c.b bVarD2 = cVar.d();
                                c.b bVar2 = c.b.NUMBER;
                                if (bVarD2 == bVar2) {
                                    pointF2 = pointF5;
                                    fNextDouble5 = (float) cVar.nextDouble();
                                    fNextDouble3 = fNextDouble5;
                                } else {
                                    pointF2 = pointF5;
                                    cVar.N();
                                    fNextDouble3 = (float) cVar.nextDouble();
                                    fNextDouble5 = cVar.d() == bVar2 ? (float) cVar.nextDouble() : fNextDouble3;
                                    cVar.J();
                                }
                            }
                            pointF5 = pointF2;
                        }
                        pointF3 = new PointF(fNextDouble2, fNextDouble3);
                        pointF4 = new PointF(fNextDouble4, fNextDouble5);
                        cVar.T();
                    } else {
                        pointFE = s.e(cVar, f10);
                    }
                    z11 = z12;
                    break;
                case 4:
                    if (cVar.d() != c.b.BEGIN_OBJECT) {
                        pointFE2 = s.e(cVar, f10);
                    } else {
                        cVar.I();
                        float f12 = 0.0f;
                        float f13 = 0.0f;
                        float fNextDouble6 = 0.0f;
                        float fNextDouble7 = 0.0f;
                        while (cVar.hasNext()) {
                            int iF2 = cVar.f(f27244d);
                            if (iF2 != 0) {
                                z10 = z11;
                                if (iF2 != 1) {
                                    cVar.k0();
                                } else {
                                    c.b bVarD3 = cVar.d();
                                    c.b bVar3 = c.b.NUMBER;
                                    if (bVarD3 == bVar3) {
                                        fNextDouble7 = (float) cVar.nextDouble();
                                        f13 = fNextDouble7;
                                    } else {
                                        cVar.N();
                                        PointF pointF7 = pointFE3;
                                        float fNextDouble8 = (float) cVar.nextDouble();
                                        fNextDouble7 = cVar.d() == bVar3 ? (float) cVar.nextDouble() : fNextDouble8;
                                        cVar.J();
                                        pointFE3 = pointF7;
                                        f13 = fNextDouble8;
                                    }
                                }
                            } else {
                                z10 = z11;
                                PointF pointF8 = pointFE3;
                                c.b bVarD4 = cVar.d();
                                c.b bVar4 = c.b.NUMBER;
                                if (bVarD4 == bVar4) {
                                    pointFE3 = pointF8;
                                    fNextDouble6 = (float) cVar.nextDouble();
                                    f12 = fNextDouble6;
                                } else {
                                    pointFE3 = pointF8;
                                    cVar.N();
                                    float fNextDouble9 = (float) cVar.nextDouble();
                                    if (cVar.d() == bVar4) {
                                        f11 = fNextDouble9;
                                        fNextDouble6 = (float) cVar.nextDouble();
                                    } else {
                                        f11 = fNextDouble9;
                                        fNextDouble6 = f11;
                                    }
                                    cVar.J();
                                    f12 = f11;
                                }
                            }
                            z11 = z10;
                        }
                        PointF pointF9 = new PointF(f12, f13);
                        PointF pointF10 = new PointF(fNextDouble6, fNextDouble7);
                        cVar.T();
                        pointF6 = pointF10;
                        pointF5 = pointF9;
                    }
                    break;
                case 5:
                    z11 = cVar.nextInt() == 1;
                    break;
                case 6:
                    pointFE3 = s.e(cVar, f10);
                    break;
                case 7:
                    pointFE4 = s.e(cVar, f10);
                    break;
                default:
                    cVar.k0();
                    break;
            }
        }
        boolean z13 = z11;
        PointF pointF11 = pointF5;
        cVar.T();
        if (z13) {
            interpolator = f27241a;
            obj = objA;
        } else {
            if (pointFE == null || pointFE2 == null) {
                if (pointF3 == null || pointF4 == null || pointF11 == null || pointF6 == null) {
                    interpolatorB = f27241a;
                } else {
                    interpolatorB2 = b(pointF3, pointF11);
                    interpolatorB3 = b(pointF4, pointF6);
                    obj = objA2;
                    interpolator = null;
                }
                if (interpolatorB2 != null || interpolatorB3 == null) {
                    pointF = pointFE4;
                    aVar = new p095f4.a(c1364k, objA, obj, interpolator, fNextDouble, null);
                } else {
                    pointF = pointFE4;
                    aVar = new p095f4.a(c1364k, objA, obj, interpolatorB2, interpolatorB3, fNextDouble, null);
                }
                aVar.f41726o = pointFE3;
                aVar.f41727p = pointF;
                return aVar;
            }
            interpolatorB = b(pointFE, pointFE2);
            interpolator = interpolatorB;
            obj = objA2;
        }
        interpolatorB2 = null;
        interpolatorB3 = null;
        if (interpolatorB2 != null) {
            pointF = pointFE4;
            aVar = new p095f4.a(c1364k, objA, obj, interpolator, fNextDouble, null);
        } else {
            pointF = pointFE4;
            aVar = new p095f4.a(c1364k, objA, obj, interpolator, fNextDouble, null);
        }
        aVar.f41726o = pointFE3;
        aVar.f41727p = pointF;
        return aVar;
    }

    private static p095f4.a f(c cVar, float f10, N n10) {
        return new p095f4.a(n10.a(cVar, f10));
    }

    private static g0 g() {
        if (f27242b == null) {
            f27242b = new g0();
        }
        return f27242b;
    }

    private static void h(int i10, WeakReference weakReference) {
        synchronized (t.class) {
            f27242b.l(i10, weakReference);
        }
    }
}

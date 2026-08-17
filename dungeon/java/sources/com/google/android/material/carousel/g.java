package com.google.android.material.carousel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f36405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f36406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f36407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float[] f36408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float[] f36409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f36410f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f36411g;

    private g(f fVar, List list, List list2) {
        this.f36405a = fVar;
        this.f36406b = Collections.unmodifiableList(list);
        this.f36407c = Collections.unmodifiableList(list2);
        float f10 = ((f) list.get(list.size() - 1)).c().f36397a - fVar.c().f36397a;
        this.f36410f = f10;
        float f11 = fVar.j().f36397a - ((f) list2.get(list2.size() - 1)).j().f36397a;
        this.f36411g = f11;
        this.f36408d = m(f10, list, true);
        this.f36409e = m(f11, list2, false);
    }

    private f a(List list, float f10, float[] fArr) {
        float[] fArrO = o(list, f10, fArr);
        return fArrO[0] >= 0.5f ? (f) list.get((int) fArrO[2]) : (f) list.get((int) fArrO[1]);
    }

    private static int b(f fVar, float f10) {
        for (int i10 = fVar.i(); i10 < fVar.g().size(); i10++) {
            if (f10 == ((f.c) fVar.g().get(i10)).f36399c) {
                return i10;
            }
        }
        return fVar.g().size() - 1;
    }

    private static int c(f fVar) {
        for (int i10 = 0; i10 < fVar.g().size(); i10++) {
            if (!((f.c) fVar.g().get(i10)).f36401e) {
                return i10;
            }
        }
        return -1;
    }

    private static int d(f fVar, float f10) {
        for (int iB = fVar.b() - 1; iB >= 0; iB--) {
            if (f10 == ((f.c) fVar.g().get(iB)).f36399c) {
                return iB;
            }
        }
        return 0;
    }

    private static int e(f fVar) {
        for (int size = fVar.g().size() - 1; size >= 0; size--) {
            if (!((f.c) fVar.g().get(size)).f36401e) {
                return size;
            }
        }
        return -1;
    }

    static g f(b bVar, f fVar, float f10, float f11, float f12) {
        return new g(fVar, p(bVar, fVar, f10, f11), n(bVar, fVar, f10, f12));
    }

    private static float[] m(float f10, List list, boolean z10) {
        int size = list.size();
        float[] fArr = new float[size];
        int i10 = 1;
        while (i10 < size) {
            int i11 = i10 - 1;
            f fVar = (f) list.get(i11);
            f fVar2 = (f) list.get(i10);
            fArr[i10] = i10 == size + (-1) ? 1.0f : fArr[i11] + ((z10 ? fVar2.c().f36397a - fVar.c().f36397a : fVar.j().f36397a - fVar2.j().f36397a) / f10);
            i10++;
        }
        return fArr;
    }

    private static List n(b bVar, f fVar, float f10, float f11) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(fVar);
        int iE = e(fVar);
        float fA = bVar.f() ? bVar.a() : bVar.b();
        if (!r(bVar, fVar) && iE != -1) {
            int i10 = iE - fVar.i();
            float f12 = fVar.c().f36398b - (fVar.c().f36400d / 2.0f);
            if (i10 <= 0 && fVar.h().f36402f > 0.0f) {
                arrayList.add(v(fVar, f12 - fVar.h().f36402f, fA));
                return arrayList;
            }
            int i11 = 0;
            float f13 = 0.0f;
            while (i11 < i10) {
                f fVar2 = (f) arrayList.get(arrayList.size() - 1);
                int i12 = iE - i11;
                float f14 = f13 + ((f.c) fVar.g().get(i12)).f36402f;
                int i13 = i12 + 1;
                f fVarT = t(fVar2, iE, i13 < fVar.g().size() ? d(fVar2, ((f.c) fVar.g().get(i13)).f36399c) + 1 : 0, f12 - f14, fVar.b() + i11 + 1, fVar.i() + i11 + 1, fA);
                if (i11 == i10 - 1 && f11 > 0.0f) {
                    fVarT = u(fVarT, f11, fA, false, f10);
                }
                arrayList.add(fVarT);
                i11++;
                f13 = f14;
            }
        } else if (f11 > 0.0f) {
            arrayList.add(u(fVar, f11, fA, false, f10));
        }
        return arrayList;
    }

    private static float[] o(List list, float f10, float[] fArr) {
        int size = list.size();
        float f11 = fArr[0];
        int i10 = 1;
        while (i10 < size) {
            float f12 = fArr[i10];
            if (f10 <= f12) {
                return new float[]{Z8.a.b(0.0f, 1.0f, f11, f12, f10), i10 - 1, i10};
            }
            i10++;
            f11 = f12;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    private static List p(b bVar, f fVar, float f10, float f11) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(fVar);
        int iC = c(fVar);
        float fA = bVar.f() ? bVar.a() : bVar.b();
        if (!q(fVar) && iC != -1) {
            int iB = fVar.b() - iC;
            float f12 = fVar.c().f36398b - (fVar.c().f36400d / 2.0f);
            if (iB <= 0 && fVar.a().f36402f > 0.0f) {
                arrayList.add(v(fVar, f12 + fVar.a().f36402f, fA));
                return arrayList;
            }
            int i10 = 0;
            float f13 = 0.0f;
            while (i10 < iB) {
                f fVar2 = (f) arrayList.get(arrayList.size() - 1);
                int i11 = iC + i10;
                int size = fVar.g().size() - 1;
                float f14 = f13 + ((f.c) fVar.g().get(i11)).f36402f;
                int i12 = i11 - 1;
                if (i12 >= 0) {
                    size = b(fVar2, ((f.c) fVar.g().get(i12)).f36399c) - 1;
                }
                f fVarT = t(fVar2, iC, size, f12 + f14, (fVar.b() - i10) - 1, (fVar.i() - i10) - 1, fA);
                if (i10 == iB - 1 && f11 > 0.0f) {
                    fVarT = u(fVarT, f11, fA, true, f10);
                }
                arrayList.add(fVarT);
                i10++;
                f13 = f14;
            }
        } else if (f11 > 0.0f) {
            arrayList.add(u(fVar, f11, fA, true, f10));
        }
        return arrayList;
    }

    private static boolean q(f fVar) {
        return fVar.a().f36398b - (fVar.a().f36400d / 2.0f) >= 0.0f && fVar.a() == fVar.d();
    }

    private static boolean r(b bVar, f fVar) {
        int iB = bVar.b();
        if (bVar.f()) {
            iB = bVar.a();
        }
        return fVar.h().f36398b + (fVar.h().f36400d / 2.0f) <= ((float) iB) && fVar.h() == fVar.k();
    }

    private static f s(List list, float f10, float[] fArr) {
        float[] fArrO = o(list, f10, fArr);
        return f.m((f) list.get((int) fArrO[1]), (f) list.get((int) fArrO[2]), fArrO[0]);
    }

    private static f t(f fVar, int i10, int i11, float f10, int i12, int i13, float f11) {
        ArrayList arrayList = new ArrayList(fVar.g());
        arrayList.add(i11, (f.c) arrayList.remove(i10));
        f.b bVar = new f.b(fVar.f(), f11);
        int i14 = 0;
        while (i14 < arrayList.size()) {
            f.c cVar = (f.c) arrayList.get(i14);
            float f12 = cVar.f36400d;
            bVar.e(f10 + (f12 / 2.0f), cVar.f36399c, f12, i14 >= i12 && i14 <= i13, cVar.f36401e, cVar.f36402f);
            f10 += cVar.f36400d;
            i14++;
        }
        return bVar.i();
    }

    private static f u(f fVar, float f10, float f11, boolean z10, float f12) {
        ArrayList arrayList = new ArrayList(fVar.g());
        f.b bVar = new f.b(fVar.f(), f11);
        float fL = f10 / fVar.l();
        float f13 = z10 ? f10 : 0.0f;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            f.c cVar = (f.c) arrayList.get(i10);
            if (cVar.f36401e) {
                bVar.e(cVar.f36398b, cVar.f36399c, cVar.f36400d, false, true, cVar.f36402f);
            } else {
                boolean z11 = i10 >= fVar.b() && i10 <= fVar.i();
                float f14 = cVar.f36400d - fL;
                float fB = d.b(f14, fVar.f(), f12);
                float f15 = (f14 / 2.0f) + f13;
                float f16 = f15 - cVar.f36398b;
                bVar.f(f15, fB, f14, z11, false, cVar.f36402f, z10 ? f16 : 0.0f, z10 ? 0.0f : f16);
                f13 += f14;
            }
            i10++;
        }
        return bVar.i();
    }

    private static f v(f fVar, float f10, float f11) {
        return t(fVar, 0, 0, f10, fVar.b(), fVar.i(), f11);
    }

    f g() {
        return this.f36405a;
    }

    f h() {
        List list = this.f36407c;
        return (f) list.get(list.size() - 1);
    }

    Map i(int i10, int i11, int i12, boolean z10) {
        float f10 = this.f36405a.f();
        HashMap map = new HashMap();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i13 >= i10) {
                break;
            }
            int i15 = z10 ? (i10 - i13) - 1 : i13;
            if (i15 * f10 * (z10 ? -1 : 1) > i12 - this.f36411g || i13 >= i10 - this.f36407c.size()) {
                Integer numValueOf = Integer.valueOf(i15);
                List list = this.f36407c;
                map.put(numValueOf, (f) list.get(p092f1.a.b(i14, 0, list.size() - 1)));
                i14++;
            }
            i13++;
        }
        int i16 = 0;
        for (int i17 = i10 - 1; i17 >= 0; i17--) {
            int i18 = z10 ? (i10 - i17) - 1 : i17;
            if (i18 * f10 * (z10 ? -1 : 1) < i11 + this.f36410f || i17 < this.f36406b.size()) {
                Integer numValueOf2 = Integer.valueOf(i18);
                List list2 = this.f36406b;
                map.put(numValueOf2, (f) list2.get(p092f1.a.b(i16, 0, list2.size() - 1)));
                i16++;
            }
        }
        return map;
    }

    public f j(float f10, float f11, float f12) {
        return k(f10, f11, f12, false);
    }

    f k(float f10, float f11, float f12, boolean z10) {
        float fB;
        List list;
        float[] fArr;
        float f13 = this.f36410f + f11;
        float f14 = f12 - this.f36411g;
        float f15 = l().a().f36403g;
        float f16 = h().h().f36404h;
        if (this.f36410f == f15) {
            f13 += f15;
        }
        if (this.f36411g == f16) {
            f14 -= f16;
        }
        if (f10 < f13) {
            fB = Z8.a.b(1.0f, 0.0f, f11, f13, f10);
            list = this.f36406b;
            fArr = this.f36408d;
        } else {
            if (f10 <= f14) {
                return this.f36405a;
            }
            fB = Z8.a.b(0.0f, 1.0f, f14, f12, f10);
            list = this.f36407c;
            fArr = this.f36409e;
        }
        return z10 ? a(list, fB, fArr) : s(list, fB, fArr);
    }

    f l() {
        List list = this.f36406b;
        return (f) list.get(list.size() - 1);
    }
}

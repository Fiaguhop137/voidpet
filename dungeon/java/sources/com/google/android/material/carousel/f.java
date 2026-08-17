package com.google.android.material.carousel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f36384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f36385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f36386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f36387d;

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f36388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f36389b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private c f36391d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private c f36392e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f36390c = new ArrayList();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f36393f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f36394g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f36395h = 0.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f36396i = -1;

        b(float f10, float f11) {
            this.f36388a = f10;
            this.f36389b = f11;
        }

        private static float j(float f10, float f11, int i10, int i11) {
            return (f10 - (i10 * f11)) + (i11 * f11);
        }

        b a(float f10, float f11, float f12) {
            return d(f10, f11, f12, false, true);
        }

        b b(float f10, float f11, float f12) {
            return c(f10, f11, f12, false);
        }

        b c(float f10, float f11, float f12, boolean z10) {
            return d(f10, f11, f12, z10, false);
        }

        b d(float f10, float f11, float f12, boolean z10, boolean z11) {
            float fAbs;
            float f13 = f12 / 2.0f;
            float f14 = f10 - f13;
            float f15 = f13 + f10;
            float f16 = this.f36389b;
            if (f15 > f16) {
                fAbs = Math.abs(f15 - Math.max(f15 - f12, f16));
            } else {
                fAbs = 0.0f;
                if (f14 < 0.0f) {
                    fAbs = Math.abs(f14 - Math.min(f14 + f12, 0.0f));
                }
            }
            return e(f10, f11, f12, z10, z11, fAbs);
        }

        b e(float f10, float f11, float f12, boolean z10, boolean z11, float f13) {
            return f(f10, f11, f12, z10, z11, f13, 0.0f, 0.0f);
        }

        b f(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14, float f15) {
            if (f12 <= 0.0f) {
                return this;
            }
            if (z11) {
                if (z10) {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
                int i10 = this.f36396i;
                if (i10 != -1 && i10 != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.f36396i = this.f36390c.size();
            }
            c cVar = new c(Float.MIN_VALUE, f10, f11, f12, z11, f13, f14, f15);
            if (z10) {
                if (this.f36391d == null) {
                    this.f36391d = cVar;
                    this.f36393f = this.f36390c.size();
                }
                if (this.f36394g != -1 && this.f36390c.size() - this.f36394g > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f12 != this.f36391d.f36400d) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.f36392e = cVar;
                this.f36394g = this.f36390c.size();
            } else {
                if (this.f36391d == null && cVar.f36400d < this.f36395h) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.f36392e != null && cVar.f36400d > this.f36395h) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.f36395h = cVar.f36400d;
            this.f36390c.add(cVar);
            return this;
        }

        b g(float f10, float f11, float f12, int i10) {
            return h(f10, f11, f12, i10, false);
        }

        b h(float f10, float f11, float f12, int i10, boolean z10) {
            if (i10 > 0 && f12 > 0.0f) {
                for (int i11 = 0; i11 < i10; i11++) {
                    c((i11 * f12) + f10, f11, f12, z10);
                }
            }
            return this;
        }

        f i() {
            if (this.f36391d == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < this.f36390c.size(); i10++) {
                c cVar = (c) this.f36390c.get(i10);
                arrayList.add(new c(j(this.f36391d.f36398b, this.f36388a, this.f36393f, i10), cVar.f36398b, cVar.f36399c, cVar.f36400d, cVar.f36401e, cVar.f36402f, cVar.f36403g, cVar.f36404h));
            }
            return new f(this.f36388a, arrayList, this.f36393f, this.f36394g, null);
        }
    }

    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final float f36397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float f36398b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final float f36399c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final float f36400d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f36401e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final float f36402f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final float f36403g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final float f36404h;

        c(float f10, float f11, float f12, float f13) {
            this(f10, f11, f12, f13, false, 0.0f, 0.0f, 0.0f);
        }

        c(float f10, float f11, float f12, float f13, boolean z10, float f14, float f15, float f16) {
            this.f36397a = f10;
            this.f36398b = f11;
            this.f36399c = f12;
            this.f36400d = f13;
            this.f36401e = z10;
            this.f36402f = f14;
            this.f36403g = f15;
            this.f36404h = f16;
        }

        static c a(c cVar, c cVar2, float f10) {
            return new c(Z8.a.a(cVar.f36397a, cVar2.f36397a, f10), Z8.a.a(cVar.f36398b, cVar2.f36398b, f10), Z8.a.a(cVar.f36399c, cVar2.f36399c, f10), Z8.a.a(cVar.f36400d, cVar2.f36400d, f10));
        }
    }

    private f(float f10, List list, int i10, int i11) {
        this.f36384a = f10;
        this.f36385b = Collections.unmodifiableList(list);
        this.f36386c = i10;
        this.f36387d = i11;
    }

    /* synthetic */ f(float f10, List list, int i10, int i11, a aVar) {
        this(f10, list, i10, i11);
    }

    static f m(f fVar, f fVar2, float f10) {
        if (fVar.f() != fVar2.f()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List listG = fVar.g();
        List listG2 = fVar2.g();
        if (listG.size() != listG2.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < fVar.g().size(); i10++) {
            arrayList.add(c.a((c) listG.get(i10), (c) listG2.get(i10), f10));
        }
        return new f(fVar.f(), arrayList, Z8.a.c(fVar.b(), fVar2.b(), f10), Z8.a.c(fVar.i(), fVar2.i(), f10));
    }

    static f n(f fVar, float f10) {
        b bVar = new b(fVar.f(), f10);
        float f11 = (f10 - fVar.j().f36398b) - (fVar.j().f36400d / 2.0f);
        int size = fVar.g().size() - 1;
        while (size >= 0) {
            c cVar = (c) fVar.g().get(size);
            bVar.d((cVar.f36400d / 2.0f) + f11, cVar.f36399c, cVar.f36400d, size >= fVar.b() && size <= fVar.i(), cVar.f36401e);
            f11 += cVar.f36400d;
            size--;
        }
        return bVar.i();
    }

    c a() {
        return (c) this.f36385b.get(this.f36386c);
    }

    int b() {
        return this.f36386c;
    }

    c c() {
        return (c) this.f36385b.get(0);
    }

    c d() {
        for (int i10 = 0; i10 < this.f36385b.size(); i10++) {
            c cVar = (c) this.f36385b.get(i10);
            if (!cVar.f36401e) {
                return cVar;
            }
        }
        return null;
    }

    List e() {
        return this.f36385b.subList(this.f36386c, this.f36387d + 1);
    }

    float f() {
        return this.f36384a;
    }

    List g() {
        return this.f36385b;
    }

    c h() {
        return (c) this.f36385b.get(this.f36387d);
    }

    int i() {
        return this.f36387d;
    }

    c j() {
        List list = this.f36385b;
        return (c) list.get(list.size() - 1);
    }

    c k() {
        for (int size = this.f36385b.size() - 1; size >= 0; size--) {
            c cVar = (c) this.f36385b.get(size);
            if (!cVar.f36401e) {
                return cVar;
            }
        }
        return null;
    }

    int l() {
        Iterator it = this.f36385b.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (((c) it.next()).f36401e) {
                i10++;
            }
        }
        return this.f36385b.size() - i10;
    }
}

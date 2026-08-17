package H4;

import C4.i;
import L4.k;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.Map;
import p310r4.j;
import p436y4.C4359c;
import p436y4.l;
import p436y4.p;
import p436y4.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f4158a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f4162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f4163f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Drawable f4164g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f4165h;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f4170m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Drawable f4172o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f4173p;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f4177t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Resources.Theme f4178u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f4179v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f4180w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f4181x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f4183z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f4159b = 1.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private j f4160c = j.f52268e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.bumptech.glide.h f4161d = com.bumptech.glide.h.NORMAL;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f4166i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f4167j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f4168k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private p274p4.f f4169l = K4.b.c();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f4171n = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private p274p4.h f4174q = new p274p4.h();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Map f4175r = new L4.b();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Class f4176s = Object.class;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f4182y = true;

    private boolean N(int i10) {
        return O(this.f4158a, i10);
    }

    private static boolean O(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    private a W(l lVar, p274p4.l lVar2) {
        return X(lVar, lVar2, true);
    }

    private a X(l lVar, p274p4.l lVar2, boolean z10) {
        a aVarK0 = z10 ? k0(lVar, lVar2) : T(lVar, lVar2);
        aVarK0.f4182y = true;
        return aVarK0;
    }

    private a Y() {
        return this;
    }

    public final p274p4.f A() {
        return this.f4169l;
    }

    public final float B() {
        return this.f4159b;
    }

    public final Resources.Theme C() {
        return this.f4178u;
    }

    public final Map D() {
        return this.f4175r;
    }

    public final boolean E() {
        return this.f4183z;
    }

    public final boolean F() {
        return this.f4180w;
    }

    protected final boolean H() {
        return this.f4179v;
    }

    public final boolean I(a aVar) {
        return Float.compare(aVar.f4159b, this.f4159b) == 0 && this.f4163f == aVar.f4163f && L4.l.e(this.f4162e, aVar.f4162e) && this.f4165h == aVar.f4165h && L4.l.e(this.f4164g, aVar.f4164g) && this.f4173p == aVar.f4173p && L4.l.e(this.f4172o, aVar.f4172o) && this.f4166i == aVar.f4166i && this.f4167j == aVar.f4167j && this.f4168k == aVar.f4168k && this.f4170m == aVar.f4170m && this.f4171n == aVar.f4171n && this.f4180w == aVar.f4180w && this.f4181x == aVar.f4181x && this.f4160c.equals(aVar.f4160c) && this.f4161d == aVar.f4161d && this.f4174q.equals(aVar.f4174q) && this.f4175r.equals(aVar.f4175r) && this.f4176s.equals(aVar.f4176s) && L4.l.e(this.f4169l, aVar.f4169l) && L4.l.e(this.f4178u, aVar.f4178u);
    }

    public final boolean J() {
        return this.f4166i;
    }

    public final boolean K() {
        return N(8);
    }

    boolean M() {
        return this.f4182y;
    }

    public final boolean P() {
        return this.f4170m;
    }

    public final boolean Q() {
        return L4.l.u(this.f4168k, this.f4167j);
    }

    public a R() {
        this.f4177t = true;
        return Y();
    }

    public a S(boolean z10) {
        if (this.f4179v) {
            return clone().S(z10);
        }
        this.f4181x = z10;
        this.f4158a |= 524288;
        return Z();
    }

    final a T(l lVar, p274p4.l lVar2) {
        if (this.f4179v) {
            return clone().T(lVar, lVar2);
        }
        h(lVar);
        return j0(lVar2, false);
    }

    public a U(int i10, int i11) {
        if (this.f4179v) {
            return clone().U(i10, i11);
        }
        this.f4168k = i10;
        this.f4167j = i11;
        this.f4158a |= 512;
        return Z();
    }

    public a V(com.bumptech.glide.h hVar) {
        if (this.f4179v) {
            return clone().V(hVar);
        }
        this.f4161d = (com.bumptech.glide.h) k.d(hVar);
        this.f4158a |= 8;
        return Z();
    }

    protected final a Z() {
        if (this.f4177t) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return Y();
    }

    public a a0(p274p4.g gVar, Object obj) {
        if (this.f4179v) {
            return clone().a0(gVar, obj);
        }
        k.d(gVar);
        k.d(obj);
        this.f4174q.e(gVar, obj);
        return Z();
    }

    public a b(a aVar) {
        if (this.f4179v) {
            return clone().b(aVar);
        }
        if (O(aVar.f4158a, 2)) {
            this.f4159b = aVar.f4159b;
        }
        if (O(aVar.f4158a, 262144)) {
            this.f4180w = aVar.f4180w;
        }
        if (O(aVar.f4158a, 1048576)) {
            this.f4183z = aVar.f4183z;
        }
        if (O(aVar.f4158a, 4)) {
            this.f4160c = aVar.f4160c;
        }
        if (O(aVar.f4158a, 8)) {
            this.f4161d = aVar.f4161d;
        }
        if (O(aVar.f4158a, 16)) {
            this.f4162e = aVar.f4162e;
            this.f4163f = 0;
            this.f4158a &= -33;
        }
        if (O(aVar.f4158a, 32)) {
            this.f4163f = aVar.f4163f;
            this.f4162e = null;
            this.f4158a &= -17;
        }
        if (O(aVar.f4158a, 64)) {
            this.f4164g = aVar.f4164g;
            this.f4165h = 0;
            this.f4158a &= -129;
        }
        if (O(aVar.f4158a, 128)) {
            this.f4165h = aVar.f4165h;
            this.f4164g = null;
            this.f4158a &= -65;
        }
        if (O(aVar.f4158a, 256)) {
            this.f4166i = aVar.f4166i;
        }
        if (O(aVar.f4158a, 512)) {
            this.f4168k = aVar.f4168k;
            this.f4167j = aVar.f4167j;
        }
        if (O(aVar.f4158a, 1024)) {
            this.f4169l = aVar.f4169l;
        }
        if (O(aVar.f4158a, 4096)) {
            this.f4176s = aVar.f4176s;
        }
        if (O(aVar.f4158a, 8192)) {
            this.f4172o = aVar.f4172o;
            this.f4173p = 0;
            this.f4158a &= -16385;
        }
        if (O(aVar.f4158a, 16384)) {
            this.f4173p = aVar.f4173p;
            this.f4172o = null;
            this.f4158a &= -8193;
        }
        if (O(aVar.f4158a, 32768)) {
            this.f4178u = aVar.f4178u;
        }
        if (O(aVar.f4158a, 65536)) {
            this.f4171n = aVar.f4171n;
        }
        if (O(aVar.f4158a, 131072)) {
            this.f4170m = aVar.f4170m;
        }
        if (O(aVar.f4158a, 2048)) {
            this.f4175r.putAll(aVar.f4175r);
            this.f4182y = aVar.f4182y;
        }
        if (O(aVar.f4158a, 524288)) {
            this.f4181x = aVar.f4181x;
        }
        if (!this.f4171n) {
            this.f4175r.clear();
            int i10 = this.f4158a;
            this.f4170m = false;
            this.f4158a = i10 & (-133121);
            this.f4182y = true;
        }
        this.f4158a |= aVar.f4158a;
        this.f4174q.d(aVar.f4174q);
        return Z();
    }

    public a b0(p274p4.f fVar) {
        if (this.f4179v) {
            return clone().b0(fVar);
        }
        this.f4169l = (p274p4.f) k.d(fVar);
        this.f4158a |= 1024;
        return Z();
    }

    public a c() {
        if (this.f4177t && !this.f4179v) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.f4179v = true;
        return R();
    }

    public a d() {
        return W(l.f57901d, new p436y4.j());
    }

    public a d0(float f10) {
        if (this.f4179v) {
            return clone().d0(f10);
        }
        if (f10 < 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f4159b = f10;
        this.f4158a |= 2;
        return Z();
    }

    @Override // 
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public a clone() {
        try {
            a aVar = (a) super.clone();
            p274p4.h hVar = new p274p4.h();
            aVar.f4174q = hVar;
            hVar.d(this.f4174q);
            L4.b bVar = new L4.b();
            aVar.f4175r = bVar;
            bVar.putAll(this.f4175r);
            aVar.f4177t = false;
            aVar.f4179v = false;
            return aVar;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return I((a) obj);
        }
        return false;
    }

    public a f(Class cls) {
        if (this.f4179v) {
            return clone().f(cls);
        }
        this.f4176s = (Class) k.d(cls);
        this.f4158a |= 4096;
        return Z();
    }

    public a f0(boolean z10) {
        if (this.f4179v) {
            return clone().f0(true);
        }
        this.f4166i = !z10;
        this.f4158a |= 256;
        return Z();
    }

    public a g(j jVar) {
        if (this.f4179v) {
            return clone().g(jVar);
        }
        this.f4160c = (j) k.d(jVar);
        this.f4158a |= 4;
        return Z();
    }

    a g0(Class cls, p274p4.l lVar, boolean z10) {
        if (this.f4179v) {
            return clone().g0(cls, lVar, z10);
        }
        k.d(cls);
        k.d(lVar);
        this.f4175r.put(cls, lVar);
        int i10 = this.f4158a;
        this.f4171n = true;
        this.f4158a = 67584 | i10;
        this.f4182y = false;
        if (z10) {
            this.f4158a = i10 | 198656;
            this.f4170m = true;
        }
        return Z();
    }

    public a h(l lVar) {
        return a0(l.f57905h, k.d(lVar));
    }

    public int hashCode() {
        return L4.l.p(this.f4178u, L4.l.p(this.f4169l, L4.l.p(this.f4176s, L4.l.p(this.f4175r, L4.l.p(this.f4174q, L4.l.p(this.f4161d, L4.l.p(this.f4160c, L4.l.q(this.f4181x, L4.l.q(this.f4180w, L4.l.q(this.f4171n, L4.l.q(this.f4170m, L4.l.o(this.f4168k, L4.l.o(this.f4167j, L4.l.q(this.f4166i, L4.l.p(this.f4172o, L4.l.o(this.f4173p, L4.l.p(this.f4164g, L4.l.o(this.f4165h, L4.l.p(this.f4162e, L4.l.o(this.f4163f, L4.l.m(this.f4159b)))))))))))))))))))));
    }

    public a i0(p274p4.l lVar) {
        return j0(lVar, true);
    }

    public a j(int i10) {
        return a0(C4359c.f57884b, Integer.valueOf(i10));
    }

    a j0(p274p4.l lVar, boolean z10) {
        if (this.f4179v) {
            return clone().j0(lVar, z10);
        }
        r rVar = new r(lVar, z10);
        g0(Bitmap.class, lVar, z10);
        g0(Drawable.class, rVar, z10);
        g0(BitmapDrawable.class, rVar.c(), z10);
        g0(C4.c.class, new C4.f(lVar), z10);
        return Z();
    }

    final a k0(l lVar, p274p4.l lVar2) {
        if (this.f4179v) {
            return clone().k0(lVar, lVar2);
        }
        h(lVar);
        return i0(lVar2);
    }

    public a l(p274p4.b bVar) {
        k.d(bVar);
        return a0(p.f57910f, bVar).a0(i.f1422a, bVar);
    }

    public a l0(boolean z10) {
        if (this.f4179v) {
            return clone().l0(z10);
        }
        this.f4183z = z10;
        this.f4158a |= 1048576;
        return Z();
    }

    public final j m() {
        return this.f4160c;
    }

    public final int n() {
        return this.f4163f;
    }

    public final Drawable o() {
        return this.f4162e;
    }

    public final Drawable p() {
        return this.f4172o;
    }

    public final int q() {
        return this.f4173p;
    }

    public final boolean r() {
        return this.f4181x;
    }

    public final p274p4.h s() {
        return this.f4174q;
    }

    public final int u() {
        return this.f4167j;
    }

    public final int v() {
        return this.f4168k;
    }

    public final Drawable w() {
        return this.f4164g;
    }

    public final int x() {
        return this.f4165h;
    }

    public final com.bumptech.glide.h y() {
        return this.f4161d;
    }

    public final Class z() {
        return this.f4176s;
    }
}

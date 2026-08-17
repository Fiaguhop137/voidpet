package C0;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: C0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0835l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0841o f1167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f1169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f1170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f1171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f1172f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f1173g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f1174h;

    private C0835l(C0841o c0841o, long j10, int i10, int i11) {
        this.f1167a = c0841o;
        this.f1168b = i10;
        boolean z10 = true;
        if (!(O0.b.n(j10) == 0 && O0.b.m(j10) == 0)) {
            H0.a.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        List listH = c0841o.h();
        int size = listH.size();
        int i12 = 0;
        float f10 = 0.0f;
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                z10 = false;
                break;
            }
            C0853v c0853v = (C0853v) listH.get(i13);
            InterfaceC0850t interfaceC0850tC = AbstractC0856y.c(c0853v.b(), O0.c.b(0, O0.b.l(j10), 0, O0.b.g(j10) ? kotlin.ranges.e.e(O0.b.k(j10) - AbstractC0856y.d(f10), 0) : O0.b.k(j10), 5, null), this.f1168b - i12, i11);
            float height = f10 + interfaceC0850tC.getHeight();
            int iC = i12 + interfaceC0850tC.c();
            arrayList.add(new C0852u(interfaceC0850tC, c0853v.c(), c0853v.a(), i12, iC, f10, height));
            if (interfaceC0850tC.l() || (iC == this.f1168b && i13 != CollectionsKt.n(this.f1167a.h()))) {
                i12 = iC;
                f10 = height;
                break;
            } else {
                i13++;
                i12 = iC;
                f10 = height;
            }
        }
        this.f1171e = f10;
        this.f1172f = i12;
        this.f1169c = z10;
        this.f1174h = arrayList;
        this.f1170d = O0.b.l(j10);
        List arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i14 = 0; i14 < size2; i14++) {
            C0852u c0852u = (C0852u) arrayList.get(i14);
            List listX = c0852u.e().x();
            ArrayList arrayList3 = new ArrayList(listX.size());
            int size3 = listX.size();
            for (int i15 = 0; i15 < size3; i15++) {
                p019b0.g gVar = (p019b0.g) listX.get(i15);
                arrayList3.add(gVar != null ? c0852u.i(gVar) : null);
            }
            CollectionsKt.B(arrayList2, arrayList3);
        }
        if (arrayList2.size() < this.f1167a.i().size()) {
            int size4 = this.f1167a.i().size() - arrayList2.size();
            ArrayList arrayList4 = new ArrayList(size4);
            for (int i16 = 0; i16 < size4; i16++) {
                arrayList4.add(null);
            }
            arrayList2 = CollectionsKt.C0(arrayList2, arrayList4);
        }
        this.f1173g = arrayList2;
    }

    public /* synthetic */ C0835l(C0841o c0841o, long j10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(c0841o, j10, i10, i11);
    }

    public static /* synthetic */ void E(C0835l c0835l, p037c0.S s10, p037c0.P p10, float f10, p037c0.w0 w0Var, M0.j jVar, p073e0.g gVar, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            f10 = Float.NaN;
        }
        c0835l.D(s10, p10, f10, (i11 & 8) != 0 ? null : w0Var, (i11 & 16) != 0 ? null : jVar, (i11 & 32) != 0 ? null : gVar, (i11 & 64) != 0 ? p073e0.f.f40217x1.a() : i10);
    }

    private final void F(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < d().g().length()) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        H0.a.a("offset(" + i10 + ") is out of bounds [0, " + d().length() + ')');
    }

    private final void G(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= d().g().length()) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        H0.a.a("offset(" + i10 + ") is out of bounds [0, " + d().length() + ']');
    }

    private final void H(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f1172f) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        H0.a.a("lineIndex(" + i10 + ") is out of bounds [0, " + this.f1172f + ')');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(long j10, float[] fArr, kotlin.jvm.internal.C c10, kotlin.jvm.internal.B b10, C0852u c0852u) {
        long jB = O0.b(c0852u.m(c0852u.f() > N0.j(j10) ? c0852u.f() : N0.j(j10)), c0852u.m(c0852u.b() < N0.i(j10) ? c0852u.b() : N0.i(j10)));
        c0852u.e().s(jB, fArr, c10.f48336a);
        int iH = c10.f48336a + (N0.h(jB) * 4);
        for (int i10 = c10.f48336a; i10 < iH; i10 += 4) {
            int i11 = i10 + 1;
            float f10 = fArr[i11];
            float f11 = b10.f48335a;
            fArr[i11] = f10 + f11;
            int i12 = i10 + 3;
            fArr[i12] = fArr[i12] + f11;
        }
        c10.f48336a = iH;
        b10.f48335a += c0852u.e().getHeight();
        return Unit.f48228a;
    }

    private final C0819d d() {
        return this.f1167a.g();
    }

    public final boolean A(int i10) {
        H(i10);
        return ((C0852u) this.f1174h.get(r.d(this.f1174h, i10))).e().i(i10);
    }

    public final void B(p037c0.S s10, long j10, p037c0.w0 w0Var, M0.j jVar, p073e0.g gVar, int i10) {
        s10.j();
        List list = this.f1174h;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            C0852u c0852u = (C0852u) list.get(i11);
            c0852u.e().y(s10, j10, w0Var, jVar, gVar, i10);
            s10.e(0.0f, c0852u.e().getHeight());
        }
        s10.f();
    }

    public final void D(p037c0.S s10, p037c0.P p10, float f10, p037c0.w0 w0Var, M0.j jVar, p073e0.g gVar, int i10) {
        J0.b.a(this, s10, p10, f10, w0Var, jVar, gVar, i10);
    }

    public final float[] b(long j10, float[] fArr, int i10) {
        F(N0.j(j10));
        G(N0.i(j10));
        kotlin.jvm.internal.C c10 = new kotlin.jvm.internal.C();
        c10.f48336a = i10;
        r.f(this.f1174h, j10, new C0833k(j10, fArr, c10, new kotlin.jvm.internal.B()));
        return fArr;
    }

    public final M0.h e(int i10) {
        G(i10);
        C0852u c0852u = (C0852u) this.f1174h.get(i10 == d().length() ? CollectionsKt.n(this.f1174h) : r.b(this.f1174h, i10));
        return c0852u.e().v(c0852u.m(i10));
    }

    public final p019b0.g f(int i10) {
        F(i10);
        C0852u c0852u = (C0852u) this.f1174h.get(r.b(this.f1174h, i10));
        return c0852u.i(c0852u.e().w(c0852u.m(i10)));
    }

    public final p019b0.g g(int i10) {
        G(i10);
        C0852u c0852u = (C0852u) this.f1174h.get(i10 == d().length() ? CollectionsKt.n(this.f1174h) : r.b(this.f1174h, i10));
        return c0852u.i(c0852u.e().g(c0852u.m(i10)));
    }

    public final boolean h() {
        return this.f1169c;
    }

    public final float i() {
        if (this.f1174h.isEmpty()) {
            return 0.0f;
        }
        return ((C0852u) this.f1174h.get(0)).e().h();
    }

    public final float j() {
        return this.f1171e;
    }

    public final float k(int i10, boolean z10) {
        G(i10);
        C0852u c0852u = (C0852u) this.f1174h.get(i10 == d().length() ? CollectionsKt.n(this.f1174h) : r.b(this.f1174h, i10));
        return c0852u.e().p(c0852u.m(i10), z10);
    }

    public final C0841o l() {
        return this.f1167a;
    }

    public final float m() {
        if (this.f1174h.isEmpty()) {
            return 0.0f;
        }
        C0852u c0852u = (C0852u) CollectionsKt.u0(this.f1174h);
        return c0852u.l(c0852u.e().t());
    }

    public final float n(int i10) {
        H(i10);
        C0852u c0852u = (C0852u) this.f1174h.get(r.d(this.f1174h, i10));
        return c0852u.l(c0852u.e().e(c0852u.n(i10)));
    }

    public final int o() {
        return this.f1172f;
    }

    public final int p(int i10, boolean z10) {
        H(i10);
        C0852u c0852u = (C0852u) this.f1174h.get(r.d(this.f1174h, i10));
        return c0852u.j(c0852u.e().j(c0852u.n(i10), z10));
    }

    public final int q(int i10) {
        int iB;
        if (i10 >= d().length()) {
            iB = CollectionsKt.n(this.f1174h);
        } else {
            iB = i10 < 0 ? 0 : r.b(this.f1174h, i10);
        }
        C0852u c0852u = (C0852u) this.f1174h.get(iB);
        return c0852u.k(c0852u.e().u(c0852u.m(i10)));
    }

    public final int r(float f10) {
        C0852u c0852u = (C0852u) this.f1174h.get(r.e(this.f1174h, f10));
        return c0852u.d() == 0 ? c0852u.g() : c0852u.k(c0852u.e().n(c0852u.o(f10)));
    }

    public final float s(int i10) {
        H(i10);
        C0852u c0852u = (C0852u) this.f1174h.get(r.d(this.f1174h, i10));
        return c0852u.e().q(c0852u.n(i10));
    }

    public final float t(int i10) {
        H(i10);
        C0852u c0852u = (C0852u) this.f1174h.get(r.d(this.f1174h, i10));
        return c0852u.e().k(c0852u.n(i10));
    }

    public final int u(int i10) {
        H(i10);
        C0852u c0852u = (C0852u) this.f1174h.get(r.d(this.f1174h, i10));
        return c0852u.j(c0852u.e().b(c0852u.n(i10)));
    }

    public final float v(int i10) {
        H(i10);
        C0852u c0852u = (C0852u) this.f1174h.get(r.d(this.f1174h, i10));
        return c0852u.l(c0852u.e().a(c0852u.n(i10)));
    }

    public final M0.h w(int i10) {
        G(i10);
        C0852u c0852u = (C0852u) this.f1174h.get(i10 == d().length() ? CollectionsKt.n(this.f1174h) : r.b(this.f1174h, i10));
        return c0852u.e().f(c0852u.m(i10));
    }

    public final List x() {
        return this.f1174h;
    }

    public final List y() {
        return this.f1173g;
    }

    public final float z() {
        return this.f1170d;
    }
}

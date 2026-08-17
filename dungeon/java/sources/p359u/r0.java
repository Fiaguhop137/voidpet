package p359u;

import O0.h;
import O0.j;
import O0.n;
import O0.r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C3971h;
import p019b0.e;
import p019b0.g;
import p019b0.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final X f54910a = K(new Z(), new q0());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final X f54911b = K(new a0(), new b0());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final X f54912c = K(new c0(), new d0());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final X f54913d = K(new e0(), new f0());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final X f54914e = K(new g0(), new h0());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final X f54915f = K(new i0(), new j0());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final X f54916g = K(new k0(), new l0());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final X f54917h = K(new m0(), new n0());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final X f54918i = K(new o0(), new p0());

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4215n A(r rVar) {
        return new C4215n((int) (rVar.j() >> 32), (int) (rVar.j() & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r B(C4215n c4215n) {
        int iRound = Math.round(c4215n.f());
        if (iRound < 0) {
            iRound = 0;
        }
        int iRound2 = Math.round(c4215n.g());
        return r.b(r.c((((long) (iRound2 >= 0 ? iRound2 : 0)) & 4294967295L) | (((long) iRound) << 32)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4214m C(int i10) {
        return new C4214m(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int D(C4214m c4214m) {
        return (int) c4214m.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4215n E(e eVar) {
        return new C4215n(Float.intBitsToFloat((int) (eVar.t() >> 32)), Float.intBitsToFloat((int) (eVar.t() & 4294967295L)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e F(C4215n c4215n) {
        float f10 = c4215n.f();
        float fG = c4215n.g();
        return e.d(e.e((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(fG)) & 4294967295L)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4217p G(g gVar) {
        return new C4217p(gVar.e(), gVar.h(), gVar.f(), gVar.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g H(C4217p c4217p) {
        return new g(c4217p.f(), c4217p.g(), c4217p.h(), c4217p.i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4215n I(k kVar) {
        return new C4215n(Float.intBitsToFloat((int) (kVar.m() >> 32)), Float.intBitsToFloat((int) (kVar.m() & 4294967295L)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k J(C4215n c4215n) {
        float f10 = c4215n.f();
        float fG = c4215n.g();
        return k.c(k.d((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(fG)) & 4294967295L)));
    }

    public static final X K(Function1 function1, Function1 function2) {
        return new Y(function1, function2);
    }

    public static final X L(h.a aVar) {
        return f54912c;
    }

    public static final X M(C3971h c3971h) {
        return f54910a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4215n s(j jVar) {
        return new C4215n(j.d(jVar.h()), j.e(jVar.h()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j t(C4215n c4215n) {
        float fO = h.o(c4215n.f());
        float fO2 = h.o(c4215n.g());
        return j.a(j.b((((long) Float.floatToRawIntBits(fO)) << 32) | (((long) Float.floatToRawIntBits(fO2)) & 4294967295L)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4214m u(h hVar) {
        return new C4214m(hVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h v(C4214m c4214m) {
        return h.g(h.o(c4214m.f()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4214m w(float f10) {
        return new C4214m(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float x(C4214m c4214m) {
        return c4214m.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4215n y(n nVar) {
        return new C4215n(n.g(nVar.m()), n.h(nVar.m()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n z(C4215n c4215n) {
        return n.c(n.d((((long) Math.round(c4215n.f())) << 32) | (((long) Math.round(c4215n.g())) & 4294967295L)));
    }
}

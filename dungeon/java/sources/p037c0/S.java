package p037c0;

import p019b0.g;

/* JADX INFO: loaded from: classes.dex */
public interface S {
    static /* synthetic */ void h(S s10, g gVar, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E");
        }
        if ((i11 & 2) != 0) {
            i10 = Y.f26693a.b();
        }
        s10.k(gVar, i10);
    }

    static /* synthetic */ void m(S s10, o0 o0Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i11 & 2) != 0) {
            i10 = Y.f26693a.b();
        }
        s10.b(o0Var, i10);
    }

    static /* synthetic */ void o(S s10, float f10, float f11, float f12, float f13, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if ((i11 & 16) != 0) {
            i10 = Y.f26693a.b();
        }
        s10.a(f10, f11, f12, f13, i10);
    }

    void a(float f10, float f11, float f12, float f13, int i10);

    void b(o0 o0Var, int i10);

    void c(long j10, float f10, m0 m0Var);

    void d(float f10, float f11, float f12, float f13, float f14, float f15, m0 m0Var);

    void e(float f10, float f11);

    void f();

    void g();

    void i(float f10, float f11, float f12, float f13, m0 m0Var);

    void j();

    default void k(g gVar, int i10) {
        a(gVar.e(), gVar.h(), gVar.f(), gVar.c(), i10);
    }

    void l();

    void n(o0 o0Var, m0 m0Var);
}

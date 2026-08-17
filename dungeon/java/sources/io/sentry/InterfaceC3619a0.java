package io.sentry;

/* JADX INFO: renamed from: io.sentry.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC3619a0 {
    default boolean A() {
        return false;
    }

    void B(I1 i10, G1 g10);

    io.sentry.protocol.x C(A3 a10, H h10);

    Y D();

    io.sentry.protocol.x E(C3774r1 c3774r1);

    default io.sentry.protocol.x F(C3771q2 c3771q2) {
        return x(c3771q2, new H());
    }

    io.sentry.protocol.x G(V2 v10, H h10);

    InterfaceC3723j0 H(h4 h4Var, j4 j4Var);

    Boolean I();

    io.sentry.protocol.x J(io.sentry.protocol.E e10, e4 e4Var, H h10, C3811v1 c3811v1);

    InterfaceC3619a0 K(String str);

    void a(C3697e c3697e);

    S clone();

    void e(C3697e c3697e, H h10);

    void f(Throwable th, InterfaceC3713h0 interfaceC3713h0, String str);

    C3833z3 g();

    InterfaceC3723j0 i();

    boolean isEnabled();

    void j(boolean z10);

    void k();

    void l(long j10);

    void n();

    boolean q();

    io.sentry.transport.z w();

    io.sentry.protocol.x x(C3771q2 c3771q2, H h10);

    default io.sentry.protocol.x y(io.sentry.protocol.E e10, e4 e4Var, H h10) {
        return J(e10, e4Var, h10, null);
    }

    default void z(G1 g10) {
        B(null, g10);
    }
}

package io.sentry;

import io.sentry.protocol.C3759c;
import io.sentry.protocol.C3763g;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
public interface Y {
    String A();

    void B();

    io.sentry.featureflags.b C();

    void D(InterfaceC3688c0 interfaceC3688c0);

    void E(String str);

    O3 F();

    EnumC3721i3 G();

    io.sentry.protocol.x H();

    C3821x1 I();

    void J(String str);

    InterfaceC3688c0 K();

    List L();

    void M(V2 v10);

    void N();

    C3821x1 O(E1.a aVar);

    void P(E1.c cVar);

    void Q(io.sentry.protocol.x xVar);

    List R();

    void S(C3821x1 c3821x1);

    void a(C3697e c3697e);

    io.sentry.protocol.o b();

    void c(String str, String str2);

    void clear();

    /* JADX INFO: renamed from: clone */
    Y m252clone();

    void d(String str, String str2);

    void e(C3697e c3697e, H h10);

    void f(Throwable th, InterfaceC3713h0 interfaceC3713h0, String str);

    C3833z3 g();

    Map getExtras();

    void h(io.sentry.protocol.I i10);

    InterfaceC3723j0 i();

    String j();

    O3 k();

    C3763g l();

    void m(io.sentry.protocol.x xVar);

    E1.d n();

    void o(C3833z3 c3833z3);

    InterfaceC3713h0 p();

    Queue q();

    O3 r(E1.b bVar);

    Map s();

    void t();

    List u();

    C3759c v();

    void w(String str, Object obj);

    void x(InterfaceC3723j0 interfaceC3723j0);

    List y();

    io.sentry.protocol.I z();
}

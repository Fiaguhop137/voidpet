package p015ae;

import Re.E0;
import Re.G0;
import Re.S;
import java.util.Collection;
import java.util.List;
import p033be.h;
import p464ze.f;

/* JADX INFO: renamed from: ae.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC1811z extends InterfaceC1788b {

    /* JADX INFO: renamed from: ae.z$a */
    public interface a {
        a a();

        a b(c0 c0Var);

        InterfaceC1811z build();

        a c(f fVar);

        a d(List list);

        a e(AbstractC1806u abstractC1806u);

        a f(h hVar);

        a g();

        a h(c0 c0Var);

        a i(InterfaceC1787a.InterfaceC0248a interfaceC0248a, Object obj);

        a j(E e10);

        a k();

        a l(InterfaceC1788b interfaceC1788b);

        a m();

        a n(InterfaceC1788b.a aVar);

        a o(boolean z10);

        a p(E0 e10);

        a q(InterfaceC1799m interfaceC1799m);

        a r(List list);

        a s(S s10);

        a t();
    }

    boolean C0();

    boolean F0();

    boolean G();

    @Override // p015ae.InterfaceC1788b, p015ae.InterfaceC1787a, p015ae.InterfaceC1799m
    InterfaceC1811z a();

    @Override // p015ae.InterfaceC1800n, p015ae.InterfaceC1799m
    InterfaceC1799m b();

    InterfaceC1811z c(G0 g10);

    @Override // p015ae.InterfaceC1788b, p015ae.InterfaceC1787a
    Collection e();

    boolean isInfix();

    boolean isInline();

    boolean isOperator();

    boolean isSuspend();

    InterfaceC1811z t0();

    a v();
}

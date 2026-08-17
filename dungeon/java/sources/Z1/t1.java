package Z1;

import U1.InterfaceC1466h;

/* JADX INFO: loaded from: classes.dex */
public interface t1 extends r1.b {

    public interface a {
        void a();

        void b();
    }

    default long B(long j10, long j11) {
        if (getState() == 1) {
            return (f() || b()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    void C(R1.r[] rVarArr, p236n2.c0 c0Var, long j10, long j11, n2.D.b bVar);

    void D(R1.F f10);

    void F(int i10, p003a2.D1 d10, InterfaceC1466h interfaceC1466h);

    u1 G();

    default void I(float f10, float f11) {
    }

    p236n2.c0 M();

    long N();

    void O(long j10);

    V0 P();

    boolean b();

    void disable();

    int e();

    boolean f();

    void g(long j10, long j11);

    String getName();

    int getState();

    boolean i();

    default void l() {
    }

    void m();

    void o(v1 v1Var, R1.r[] rVarArr, p236n2.c0 c0Var, long j10, boolean z10, boolean z11, long j11, long j12, n2.D.b bVar);

    void release();

    void reset();

    void start();

    void stop();

    void v();

    boolean y();
}

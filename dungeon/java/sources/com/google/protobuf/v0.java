package com.google.protobuf;

/* JADX INFO: loaded from: classes2.dex */
abstract class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile int f38039a = 100;

    v0() {
    }

    private final void l(Object obj, m0 m0Var, int i10) {
        while (m0Var.z() != Integer.MAX_VALUE && m(obj, m0Var, i10)) {
        }
    }

    abstract void a(Object obj, int i10, int i11);

    abstract void b(Object obj, int i10, long j10);

    abstract void c(Object obj, int i10, Object obj2);

    abstract void d(Object obj, int i10, AbstractC3142h abstractC3142h);

    abstract void e(Object obj, int i10, long j10);

    abstract Object f(Object obj);

    abstract Object g(Object obj);

    abstract int h(Object obj);

    abstract int i(Object obj);

    abstract void j(Object obj);

    abstract Object k(Object obj, Object obj2);

    final boolean m(Object obj, m0 m0Var, int i10) throws B {
        int tag = m0Var.getTag();
        int iA = C0.a(tag);
        int iB = C0.b(tag);
        if (iB == 0) {
            e(obj, iA, m0Var.G());
            return true;
        }
        if (iB == 1) {
            b(obj, iA, m0Var.a());
            return true;
        }
        if (iB == 2) {
            d(obj, iA, m0Var.n());
            return true;
        }
        if (iB != 3) {
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw B.e();
            }
            a(obj, iA, m0Var.t());
            return true;
        }
        Object objN = n();
        int iC = C0.c(iA, 4);
        int i11 = i10 + 1;
        if (i11 >= f38039a) {
            throw B.i();
        }
        l(objN, m0Var, i11);
        if (iC != m0Var.getTag()) {
            throw B.b();
        }
        c(obj, iA, r(objN));
        return true;
    }

    abstract Object n();

    abstract void o(Object obj, Object obj2);

    abstract void p(Object obj, Object obj2);

    abstract boolean q(m0 m0Var);

    abstract Object r(Object obj);

    abstract void s(Object obj, D0 d10);

    abstract void t(Object obj, D0 d10);
}

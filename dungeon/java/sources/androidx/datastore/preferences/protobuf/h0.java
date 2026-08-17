package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
abstract class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile int f23475a = 100;

    h0() {
    }

    private final void l(Object obj, Z z10, int i10) {
        while (z10.z() != Integer.MAX_VALUE && m(obj, z10, i10)) {
        }
    }

    abstract void a(Object obj, int i10, int i11);

    abstract void b(Object obj, int i10, long j10);

    abstract void c(Object obj, int i10, Object obj2);

    abstract void d(Object obj, int i10, AbstractC1950f abstractC1950f);

    abstract void e(Object obj, int i10, long j10);

    abstract Object f(Object obj);

    abstract Object g(Object obj);

    abstract int h(Object obj);

    abstract int i(Object obj);

    abstract void j(Object obj);

    abstract Object k(Object obj, Object obj2);

    final boolean m(Object obj, Z z10, int i10) throws C1965v {
        int tag = z10.getTag();
        int iA = m0.a(tag);
        int iB = m0.b(tag);
        if (iB == 0) {
            e(obj, iA, z10.G());
            return true;
        }
        if (iB == 1) {
            b(obj, iA, z10.a());
            return true;
        }
        if (iB == 2) {
            d(obj, iA, z10.n());
            return true;
        }
        if (iB != 3) {
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw C1965v.e();
            }
            a(obj, iA, z10.t());
            return true;
        }
        Object objN = n();
        int iC = m0.c(iA, 4);
        int i11 = i10 + 1;
        if (i11 >= f23475a) {
            throw C1965v.i();
        }
        l(objN, z10, i11);
        if (iC != z10.getTag()) {
            throw C1965v.b();
        }
        c(obj, iA, r(objN));
        return true;
    }

    abstract Object n();

    abstract void o(Object obj, Object obj2);

    abstract void p(Object obj, Object obj2);

    abstract boolean q(Z z10);

    abstract Object r(Object obj);

    abstract void s(Object obj, n0 n0Var);

    abstract void t(Object obj, n0 n0Var);
}

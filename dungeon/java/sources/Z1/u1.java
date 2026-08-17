package Z1;

/* JADX INFO: loaded from: classes.dex */
public interface u1 {

    public interface a {
        void a(t1 t1Var);
    }

    static int A(int i10, int i11, int i12, int i13, int i14, int i15) {
        return i10 | i11 | i12 | i13 | i14 | i15;
    }

    static int E(int i10) {
        return i10 & 64;
    }

    static int Q(int i10) {
        return i10 & 7;
    }

    static int j(int i10) {
        return i10 & 384;
    }

    static boolean k(int i10, boolean z10) {
        int iQ = Q(i10);
        if (iQ != 4) {
            return z10 && iQ == 3;
        }
        return true;
    }

    static int n(int i10, int i11, int i12, int i13, int i14) {
        return A(i10, i11, i12, i13, i14, 0);
    }

    static int p(int i10, int i11, int i12, int i13) {
        return A(i10, i11, i12, 0, 128, i13);
    }

    static int q(int i10) {
        return i10 & 32;
    }

    static int r(int i10) {
        return i10 & 24;
    }

    static int s(int i10) {
        return p(i10, 0, 0, 0);
    }

    static int w(int i10) {
        return i10 & 3584;
    }

    int K();

    void L(a aVar);

    int a(R1.r rVar);

    int e();

    String getName();

    void h();
}

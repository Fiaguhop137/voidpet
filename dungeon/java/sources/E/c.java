package E;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final long a(long j10, boolean z10, int i10, float f10) {
        return O0.b.f8260b.b(0, c(j10, z10, i10, f10), 0, O0.b.k(j10));
    }

    public static final int b(boolean z10, int i10, int i11) {
        if (z10 || !d(i10)) {
            return kotlin.ranges.e.e(i11, 1);
        }
        return 1;
    }

    public static final int c(long j10, boolean z10, int i10, float f10) {
        int iL = ((z10 || d(i10)) && O0.b.h(j10)) ? O0.b.l(j10) : Integer.MAX_VALUE;
        return O0.b.n(j10) == iL ? iL : kotlin.ranges.e.m(D.k.a(f10), O0.b.n(j10), iL);
    }

    public static final boolean d(int i10) {
        M0.s.a aVar = M0.s.f6773a;
        return M0.s.g(i10, aVar.b()) || M0.s.g(i10, aVar.d()) || M0.s.g(i10, aVar.c());
    }
}

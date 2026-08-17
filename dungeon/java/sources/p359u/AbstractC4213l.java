package p359u;

/* JADX INFO: renamed from: u.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4213l {
    public static final C4212k a(C4212k c4212k, Object obj, AbstractC4218q abstractC4218q, long j10, long j11, boolean z10) {
        return new C4212k(c4212k.c(), obj, abstractC4218q, j10, j11, z10);
    }

    public static /* synthetic */ C4212k b(C4212k c4212k, Object obj, AbstractC4218q abstractC4218q, long j10, long j11, boolean z10, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = c4212k.getValue();
        }
        if ((i10 & 2) != 0) {
            abstractC4218q = r.e(c4212k.e());
        }
        if ((i10 & 4) != 0) {
            j10 = c4212k.b();
        }
        if ((i10 & 8) != 0) {
            j11 = c4212k.a();
        }
        if ((i10 & 16) != 0) {
            z10 = c4212k.g();
        }
        boolean z11 = z10;
        long j12 = j11;
        return a(c4212k, obj, abstractC4218q, j10, j12, z11);
    }

    public static final AbstractC4218q c(X x10, Object obj) {
        AbstractC4218q abstractC4218q = (AbstractC4218q) x10.a().invoke(obj);
        abstractC4218q.d();
        return abstractC4218q;
    }
}

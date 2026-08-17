package F0;

/* JADX INFO: renamed from: F0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0970d {
    public static final r a(r.a aVar) {
        return aVar.d();
    }

    public static final int b(boolean z10, boolean z11) {
        if (z11 && z10) {
            return 3;
        }
        if (z10) {
            return 1;
        }
        return z11 ? 2 : 0;
    }

    public static final int c(r rVar, int i10) {
        return b(rVar.compareTo(a(r.f2873b)) >= 0, p.f(i10, p.f2863b.a()));
    }
}

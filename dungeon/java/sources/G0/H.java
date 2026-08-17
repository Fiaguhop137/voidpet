package G0;

import C0.C0819d;
import C0.N0;

/* JADX INFO: loaded from: classes.dex */
public abstract class H {
    public static final C0819d a(G g10) {
        return g10.e().m(g10.g());
    }

    public static final C0819d b(G g10, int i10) {
        return g10.e().subSequence(N0.i(g10.g()), Math.min(N0.i(g10.g()) + i10, g10.h().length()));
    }

    public static final C0819d c(G g10, int i10) {
        return g10.e().subSequence(Math.max(0, N0.j(g10.g()) - i10), N0.j(g10.g()));
    }
}

package F0;

import I.d2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p323s.C4125z;

/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final J0.s f2828a = new J0.s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4125z f2829b = new C4125z(16);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(G g10, E e10, H h10) {
        synchronized (g10.f2828a) {
            try {
                if (h10.m()) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return Unit.f48228a;
    }

    public final d2 b(E e10, Function1 function1) {
        synchronized (this.f2828a) {
            H h10 = (H) this.f2829b.c(e10);
            if (h10 != null) {
                if (h10.m()) {
                    return h10;
                }
            }
            try {
                H h11 = (H) function1.invoke(new F(this, e10));
                synchronized (this.f2828a) {
                    try {
                        if (this.f2829b.c(e10) == null && h11.m()) {
                            this.f2829b.d(e10, h11);
                        }
                        Unit unit = Unit.f48228a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return h11;
            } catch (Exception e11) {
                throw new IllegalStateException("Could not load font", e11);
            }
        }
    }
}

package p290q2;

import R1.F;
import R1.G;
import R1.r;
import U1.AbstractC1477t;
import java.util.List;
import p236n2.D;
import p254o2.e;
import p254o2.n;
import p308r2.d;

/* JADX INFO: loaded from: classes.dex */
public interface y extends C {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final G f51400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f51401b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f51402c;

        public a(G g10, int... iArr) {
            this(g10, iArr, 0);
        }

        public a(G g10, int[] iArr, int i10) {
            if (iArr.length == 0) {
                AbstractC1477t.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f51400a = g10;
            this.f51401b = iArr;
            this.f51402c = i10;
        }
    }

    public interface b {
        y[] a(a[] aVarArr, d dVar, D.b bVar, F f10);
    }

    boolean a(int i10, long j10);

    int b();

    void disable();

    default boolean e(long j10, e eVar, List list) {
        return false;
    }

    void enable();

    boolean f(int i10, long j10);

    void g(float f10);

    Object h();

    default void i() {
    }

    void l(long j10, long j11, long j12, List list, n[] nVarArr);

    void m(boolean z10);

    int n(long j10, List list);

    int o();

    r p();

    int q();

    default void s() {
    }
}

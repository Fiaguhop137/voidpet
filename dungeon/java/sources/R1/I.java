package R1;

import C9.AbstractC0876t;
import U1.AbstractC1459a;
import U1.S;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final I f10076b = new I(AbstractC0876t.w());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f10077c = S.z0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC0876t f10078a;

    public static final class a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f10079f = S.z0(0);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f10080g = S.z0(1);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f10081h = S.z0(3);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f10082i = S.z0(4);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10083a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final G f10084b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f10085c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int[] f10086d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean[] f10087e;

        public a(G g10, boolean z10, int[] iArr, boolean[] zArr) {
            int i10 = g10.f9963a;
            this.f10083a = i10;
            boolean z11 = false;
            AbstractC1459a.a(i10 == iArr.length && i10 == zArr.length);
            this.f10084b = g10;
            if (z10 && i10 > 1) {
                z11 = true;
            }
            this.f10085c = z11;
            this.f10086d = (int[]) iArr.clone();
            this.f10087e = (boolean[]) zArr.clone();
        }

        public r a(int i10) {
            return this.f10084b.a(i10);
        }

        public int b() {
            return this.f10084b.f9965c;
        }

        public boolean c() {
            return F9.a.a(this.f10087e, true);
        }

        public boolean d(int i10) {
            return this.f10087e[i10];
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f10085c == aVar.f10085c && this.f10084b.equals(aVar.f10084b) && Arrays.equals(this.f10086d, aVar.f10086d) && Arrays.equals(this.f10087e, aVar.f10087e)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f10084b.hashCode() * 31) + (this.f10085c ? 1 : 0)) * 31) + Arrays.hashCode(this.f10086d)) * 31) + Arrays.hashCode(this.f10087e);
        }
    }

    public I(List list) {
        this.f10078a = AbstractC0876t.p(list);
    }

    public AbstractC0876t a() {
        return this.f10078a;
    }

    public boolean b(int i10) {
        for (int i11 = 0; i11 < this.f10078a.size(); i11++) {
            a aVar = (a) this.f10078a.get(i11);
            if (aVar.c() && aVar.b() == i10) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || I.class != obj.getClass()) {
            return false;
        }
        return this.f10078a.equals(((I) obj).f10078a);
    }

    public int hashCode() {
        return this.f10078a.hashCode();
    }
}

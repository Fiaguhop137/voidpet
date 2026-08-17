package p236n2;

import R1.F;
import R1.u;
import S2.s;
import W1.x;
import android.os.Handler;
import p003a2.D1;
import p075e2.t;
import p075e2.w;
import p308r2.k;

/* JADX INFO: loaded from: classes.dex */
public interface D {

    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f49481a = M.f49514b;

        default a a(s.a aVar) {
            return this;
        }

        default a b(boolean z10) {
            return this;
        }

        default a c(int i10) {
            return this;
        }

        a d(w wVar);

        a e(k kVar);

        D f(u uVar);
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f49482a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f49483b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f49484c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f49485d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f49486e;

        public b(Object obj) {
            this(obj, -1L);
        }

        public b(Object obj, int i10, int i11, long j10) {
            this(obj, i10, i11, j10, -1);
        }

        private b(Object obj, int i10, int i11, long j10, int i12) {
            this.f49482a = obj;
            this.f49483b = i10;
            this.f49484c = i11;
            this.f49485d = j10;
            this.f49486e = i12;
        }

        public b(Object obj, long j10) {
            this(obj, -1, -1, j10, -1);
        }

        public b(Object obj, long j10, int i10) {
            this(obj, -1, -1, j10, i10);
        }

        public b a(Object obj) {
            return this.f49482a.equals(obj) ? this : new b(obj, this.f49483b, this.f49484c, this.f49485d, this.f49486e);
        }

        public boolean b() {
            return this.f49483b != -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f49482a.equals(bVar.f49482a) && this.f49483b == bVar.f49483b && this.f49484c == bVar.f49484c && this.f49485d == bVar.f49485d && this.f49486e == bVar.f49486e;
        }

        public int hashCode() {
            return ((((((((527 + this.f49482a.hashCode()) * 31) + this.f49483b) * 31) + this.f49484c) * 31) + ((int) this.f49485d)) * 31) + this.f49486e;
        }
    }

    public interface c {
        void a(D d10, F f10);
    }

    void a(Handler handler, L l10);

    void b(c cVar, x xVar, D1 d10);

    u c();

    void d(t tVar);

    void e(Handler handler, t tVar);

    default void f(u uVar) {
    }

    void g(C c10);

    void h(c cVar);

    C o(b bVar, p308r2.b bVar2, long j10);

    void p(c cVar);

    void q(L l10);

    void r(c cVar);

    void s();

    default boolean t() {
        return true;
    }

    default F u() {
        return null;
    }
}

package Z1;

import R1.C1342b;
import U1.AbstractC1459a;
import U1.InterfaceC1466h;
import android.content.Context;
import android.os.Looper;
import p380v2.C4250m;

/* JADX INFO: loaded from: classes.dex */
public interface Q extends R1.C {

    public interface a {
        default void C(boolean z10) {
        }

        void E(boolean z10);
    }

    public static final class b {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        long f18112A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        long f18113B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        boolean f18114C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        boolean f18115D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        q1 f18116E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        boolean f18117F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        boolean f18118G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        String f18119H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        boolean f18120I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        H1 f18121J;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Context f18122a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        InterfaceC1466h f18123b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f18124c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        B9.t f18125d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        B9.t f18126e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        B9.t f18127f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        B9.t f18128g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        B9.t f18129h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        B9.f f18130i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Looper f18131j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f18132k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        C1342b f18133l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f18134m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f18135n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f18136o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        boolean f18137p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f18138q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f18139r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f18140s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f18141t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        z1 f18142u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        y1 f18143v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        long f18144w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        long f18145x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        long f18146y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        S0 f18147z;

        public b(Context context) {
            this(context, new S(context), new T(context));
        }

        private b(Context context, B9.t tVar, B9.t tVar2) {
            this(context, tVar, tVar2, new U(context), new V(), new W(context), new X());
        }

        private b(Context context, B9.t tVar, B9.t tVar2, B9.t tVar3, B9.t tVar4, B9.t tVar5, B9.f fVar) {
            this.f18122a = (Context) AbstractC1459a.e(context);
            this.f18125d = tVar;
            this.f18126e = tVar2;
            this.f18127f = tVar3;
            this.f18128g = tVar4;
            this.f18129h = tVar5;
            this.f18130i = fVar;
            this.f18131j = U1.S.Y();
            this.f18133l = C1342b.f10132h;
            this.f18135n = 0;
            this.f18139r = 1;
            this.f18140s = 0;
            this.f18141t = true;
            this.f18142u = z1.f18610g;
            this.f18144w = 5000L;
            this.f18145x = 15000L;
            this.f18146y = 3000L;
            this.f18143v = y1.f18586i;
            this.f18147z = new C1700l.b().a();
            this.f18123b = InterfaceC1466h.f12906a;
            this.f18112A = 500L;
            this.f18113B = 2000L;
            this.f18115D = true;
            this.f18119H = "";
            this.f18132k = -1000;
            this.f18121J = new C1711p();
        }

        public static /* synthetic */ x1 a(Context context) {
            return new C1709o(context);
        }

        public static /* synthetic */ n2.D.a b(Context context) {
            return new p236n2.r(context, new C4250m());
        }

        public static /* synthetic */ p290q2.E d(Context context) {
            return new p290q2.n(context);
        }

        public Q e() {
            AbstractC1459a.g(!this.f18117F);
            this.f18117F = true;
            return new C1729y0(this, null);
        }

        public b f(C1342b c1342b, boolean z10) {
            AbstractC1459a.g(!this.f18117F);
            this.f18133l = (C1342b) AbstractC1459a.e(c1342b);
            this.f18134m = z10;
            return this;
        }

        public b g(Looper looper) {
            AbstractC1459a.g(!this.f18117F);
            AbstractC1459a.e(looper);
            this.f18131j = looper;
            return this;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f18148b = new c(-9223372036854775807L);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f18149a;

        public c(long j10) {
            this.f18149a = j10;
        }
    }

    void a(p236n2.D d10);

    int b();

    void release();
}

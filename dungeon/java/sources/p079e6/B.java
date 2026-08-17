package p079e6;

import Y4.d;
import Y4.e;
import p151i6.b;

/* JADX INFO: loaded from: classes2.dex */
public class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E f40444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final F f40445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final E f40446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f40447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final E f40448e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final F f40449f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final E f40450g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final F f40451h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f40452i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f40453j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f40454k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f40455l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f40456m;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private E f40457a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private F f40458b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private E f40459c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private d f40460d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private E f40461e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private F f40462f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private E f40463g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private F f40464h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f40465i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f40466j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f40467k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f40468l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f40469m;

        private a() {
        }

        /* synthetic */ a(C c10) {
            this();
        }

        public B m() {
            return new B(this, null);
        }
    }

    private B(a aVar) {
        if (b.d()) {
            b.a("PoolConfig()");
        }
        this.f40444a = aVar.f40457a == null ? n.a() : aVar.f40457a;
        this.f40445b = aVar.f40458b == null ? z.h() : aVar.f40458b;
        this.f40446c = aVar.f40459c == null ? p.b() : aVar.f40459c;
        this.f40447d = aVar.f40460d == null ? e.b() : aVar.f40460d;
        this.f40448e = aVar.f40461e == null ? q.a() : aVar.f40461e;
        this.f40449f = aVar.f40462f == null ? z.h() : aVar.f40462f;
        this.f40450g = aVar.f40463g == null ? o.a() : aVar.f40463g;
        this.f40451h = aVar.f40464h == null ? z.h() : aVar.f40464h;
        this.f40452i = aVar.f40465i == null ? "legacy" : aVar.f40465i;
        this.f40453j = aVar.f40466j;
        this.f40454k = aVar.f40467k > 0 ? aVar.f40467k : 4194304;
        this.f40455l = aVar.f40468l;
        if (b.d()) {
            b.b();
        }
        this.f40456m = aVar.f40469m;
    }

    /* synthetic */ B(a aVar, C c10) {
        this(aVar);
    }

    public static a n() {
        return new a(null);
    }

    public int a() {
        return this.f40454k;
    }

    public int b() {
        return this.f40453j;
    }

    public E c() {
        return this.f40444a;
    }

    public F d() {
        return this.f40445b;
    }

    public String e() {
        return this.f40452i;
    }

    public E f() {
        return this.f40446c;
    }

    public E g() {
        return this.f40448e;
    }

    public F h() {
        return this.f40449f;
    }

    public d i() {
        return this.f40447d;
    }

    public E j() {
        return this.f40450g;
    }

    public F k() {
        return this.f40451h;
    }

    public boolean l() {
        return this.f40456m;
    }

    public boolean m() {
        return this.f40455l;
    }
}

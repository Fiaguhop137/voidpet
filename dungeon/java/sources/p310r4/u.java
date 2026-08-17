package p310r4;

import L4.k;
import M4.c;
import p199l1.e;

/* JADX INFO: loaded from: classes.dex */
final class u implements v, M4.a.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final e f52359e = M4.a.d(20, new a());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f52360a = c.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private v f52361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f52362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f52363d;

    class a implements M4.a.d {
        a() {
        }

        @Override // M4.a.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public u create() {
            return new u();
        }
    }

    u() {
    }

    private void c(v vVar) {
        this.f52363d = false;
        this.f52362c = true;
        this.f52361b = vVar;
    }

    static u d(v vVar) {
        u uVar = (u) k.d((u) f52359e.acquire());
        uVar.c(vVar);
        return uVar;
    }

    private void e() {
        this.f52361b = null;
        f52359e.a(this);
    }

    @Override // p310r4.v
    public int a() {
        return this.f52361b.a();
    }

    @Override // p310r4.v
    public Class b() {
        return this.f52361b.b();
    }

    synchronized void f() {
        this.f52360a.c();
        if (!this.f52362c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f52362c = false;
        if (this.f52363d) {
            recycle();
        }
    }

    @Override // p310r4.v
    public Object get() {
        return this.f52361b.get();
    }

    @Override // M4.a.f
    public c h() {
        return this.f52360a;
    }

    @Override // p310r4.v
    public synchronized void recycle() {
        this.f52360a.c();
        this.f52363d = true;
        if (!this.f52362c) {
            this.f52361b.recycle();
            e();
        }
    }
}

package p310r4;

import L4.k;
import p274p4.f;

/* JADX INFO: loaded from: classes.dex */
class p implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f52337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f52338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v f52339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f52340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f f52341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f52342f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f52343g;

    interface a {
        void c(f fVar, p pVar);
    }

    p(v vVar, boolean z10, boolean z11, f fVar, a aVar) {
        this.f52339c = (v) k.d(vVar);
        this.f52337a = z10;
        this.f52338b = z11;
        this.f52341e = fVar;
        this.f52340d = (a) k.d(aVar);
    }

    @Override // p310r4.v
    public int a() {
        return this.f52339c.a();
    }

    @Override // p310r4.v
    public Class b() {
        return this.f52339c.b();
    }

    synchronized void c() {
        if (this.f52343g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f52342f++;
    }

    v d() {
        return this.f52339c;
    }

    boolean e() {
        return this.f52337a;
    }

    void f() {
        boolean z10;
        synchronized (this) {
            int i10 = this.f52342f;
            if (i10 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z10 = true;
            int i11 = i10 - 1;
            this.f52342f = i11;
            if (i11 != 0) {
                z10 = false;
            }
        }
        if (z10) {
            this.f52340d.c(this.f52341e, this);
        }
    }

    @Override // p310r4.v
    public Object get() {
        return this.f52339c.get();
    }

    @Override // p310r4.v
    public synchronized void recycle() {
        if (this.f52342f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f52343g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f52343g = true;
        if (this.f52338b) {
            this.f52339c.recycle();
        }
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f52337a + ", listener=" + this.f52340d + ", key=" + this.f52341e + ", acquired=" + this.f52342f + ", isRecycled=" + this.f52343g + ", resource=" + this.f52339c + '}';
    }
}

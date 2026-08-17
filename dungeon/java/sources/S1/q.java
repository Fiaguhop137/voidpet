package S1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public abstract class q implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected o.a f11455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected o.a f11456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private o.a f11457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private o.a f11458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ByteBuffer f11459f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ByteBuffer f11460g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f11461h;

    public q() {
        ByteBuffer byteBuffer = o.f11448a;
        this.f11459f = byteBuffer;
        this.f11460g = byteBuffer;
        o.a aVar = o.a.f11449e;
        this.f11457d = aVar;
        this.f11458e = aVar;
        this.f11455b = aVar;
        this.f11456c = aVar;
    }

    @Override // S1.o
    public boolean a() {
        return this.f11458e != o.a.f11449e;
    }

    @Override // S1.o
    public boolean b() {
        return this.f11461h && this.f11460g == o.f11448a;
    }

    @Override // S1.o
    public ByteBuffer c() {
        ByteBuffer byteBuffer = this.f11460g;
        this.f11460g = o.f11448a;
        return byteBuffer;
    }

    @Override // S1.o
    public final o.a e(o.a aVar) {
        this.f11457d = aVar;
        this.f11458e = h(aVar);
        return a() ? this.f11458e : o.a.f11449e;
    }

    @Override // S1.o
    public final void f() {
        this.f11461h = true;
        j();
    }

    @Override // S1.o
    public final void flush() {
        this.f11460g = o.f11448a;
        this.f11461h = false;
        this.f11455b = this.f11457d;
        this.f11456c = this.f11458e;
        i();
    }

    protected final boolean g() {
        return this.f11460g.hasRemaining();
    }

    protected abstract o.a h(o.a aVar);

    protected void i() {
    }

    protected void j() {
    }

    protected void k() {
    }

    protected final ByteBuffer l(int i10) {
        if (this.f11459f.capacity() < i10) {
            this.f11459f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f11459f.clear();
        }
        ByteBuffer byteBuffer = this.f11459f;
        this.f11460g = byteBuffer;
        return byteBuffer;
    }

    @Override // S1.o
    public final void reset() {
        ByteBuffer byteBuffer = o.f11448a;
        this.f11460g = byteBuffer;
        this.f11461h = false;
        this.f11459f = byteBuffer;
        o.a aVar = o.a.f11449e;
        this.f11457d = aVar;
        this.f11458e = aVar;
        this.f11455b = aVar;
        this.f11456c = aVar;
        k();
    }
}

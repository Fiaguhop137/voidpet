package S1;

import U1.AbstractC1459a;
import U1.S;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class s implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f11485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f11487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f11488e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private o.a f11489f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private o.a f11490g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private o.a f11491h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private o.a f11492i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f11493j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private r f11494k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ByteBuffer f11495l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ShortBuffer f11496m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ByteBuffer f11497n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f11498o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f11499p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f11500q;

    public s() {
        this(false);
    }

    s(boolean z10) {
        this.f11487d = 1.0f;
        this.f11488e = 1.0f;
        o.a aVar = o.a.f11449e;
        this.f11489f = aVar;
        this.f11490g = aVar;
        this.f11491h = aVar;
        this.f11492i = aVar;
        ByteBuffer byteBuffer = o.f11448a;
        this.f11495l = byteBuffer;
        this.f11496m = byteBuffer.asShortBuffer();
        this.f11497n = byteBuffer;
        this.f11486c = -1;
        this.f11485b = z10;
    }

    private boolean g() {
        return Math.abs(this.f11487d - 1.0f) < 1.0E-4f && Math.abs(this.f11488e - 1.0f) < 1.0E-4f && this.f11490g.f11450a == this.f11489f.f11450a;
    }

    @Override // S1.o
    public boolean a() {
        if (this.f11490g.f11450a != -1) {
            return this.f11485b || !g();
        }
        return false;
    }

    @Override // S1.o
    public boolean b() {
        if (!this.f11500q) {
            return false;
        }
        r rVar = this.f11494k;
        return rVar == null || rVar.k() == 0;
    }

    @Override // S1.o
    public ByteBuffer c() {
        int iK;
        r rVar = this.f11494k;
        if (rVar != null && (iK = rVar.k()) > 0) {
            if (this.f11495l.capacity() < iK) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iK).order(ByteOrder.nativeOrder());
                this.f11495l = byteBufferOrder;
                this.f11496m = byteBufferOrder.asShortBuffer();
            } else {
                this.f11495l.clear();
                this.f11496m.clear();
            }
            rVar.j(this.f11496m);
            this.f11499p += (long) iK;
            this.f11495l.limit(iK);
            this.f11497n = this.f11495l;
        }
        ByteBuffer byteBuffer = this.f11497n;
        this.f11497n = o.f11448a;
        return byteBuffer;
    }

    @Override // S1.o
    public void d(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            r rVar = (r) AbstractC1459a.e(this.f11494k);
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f11498o += (long) iRemaining;
            rVar.t(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // S1.o
    public o.a e(o.a aVar) throws o.b {
        if (aVar.f11452c != 2) {
            throw new o.b(aVar);
        }
        int i10 = this.f11486c;
        if (i10 == -1) {
            i10 = aVar.f11450a;
        }
        this.f11489f = aVar;
        o.a aVar2 = new o.a(i10, aVar.f11451b, 2);
        this.f11490g = aVar2;
        this.f11493j = true;
        return aVar2;
    }

    @Override // S1.o
    public void f() {
        r rVar = this.f11494k;
        if (rVar != null) {
            rVar.s();
        }
        this.f11500q = true;
    }

    @Override // S1.o
    public void flush() {
        if (a()) {
            o.a aVar = this.f11489f;
            this.f11491h = aVar;
            o.a aVar2 = this.f11490g;
            this.f11492i = aVar2;
            if (this.f11493j) {
                this.f11494k = new r(aVar.f11450a, aVar.f11451b, this.f11487d, this.f11488e, aVar2.f11450a);
            } else {
                r rVar = this.f11494k;
                if (rVar != null) {
                    rVar.i();
                }
            }
        }
        this.f11497n = o.f11448a;
        this.f11498o = 0L;
        this.f11499p = 0L;
        this.f11500q = false;
    }

    public long h(long j10) {
        if (this.f11499p < 1024) {
            return (long) (((double) this.f11487d) * j10);
        }
        long jL = this.f11498o - ((long) ((r) AbstractC1459a.e(this.f11494k)).l());
        int i10 = this.f11492i.f11450a;
        int i11 = this.f11491h.f11450a;
        return i10 == i11 ? S.a1(j10, jL, this.f11499p) : S.a1(j10, jL * ((long) i10), this.f11499p * ((long) i11));
    }

    public void i(float f10) {
        AbstractC1459a.a(f10 > 0.0f);
        if (this.f11488e != f10) {
            this.f11488e = f10;
            this.f11493j = true;
        }
    }

    public void j(float f10) {
        AbstractC1459a.a(f10 > 0.0f);
        if (this.f11487d != f10) {
            this.f11487d = f10;
            this.f11493j = true;
        }
    }

    @Override // S1.o
    public void reset() {
        this.f11487d = 1.0f;
        this.f11488e = 1.0f;
        o.a aVar = o.a.f11449e;
        this.f11489f = aVar;
        this.f11490g = aVar;
        this.f11491h = aVar;
        this.f11492i = aVar;
        ByteBuffer byteBuffer = o.f11448a;
        this.f11495l = byteBuffer;
        this.f11496m = byteBuffer.asShortBuffer();
        this.f11497n = byteBuffer;
        this.f11486c = -1;
        this.f11493j = false;
        this.f11494k = null;
        this.f11498o = 0L;
        this.f11499p = 0L;
        this.f11500q = false;
    }
}

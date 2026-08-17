package Y1;

import R1.r;
import R1.v;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class f extends Y1.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f16809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f16810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ByteBuffer f16811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f16813f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f16814g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f16815h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f16816i;

    public static final class a extends IllegalStateException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f16817a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f16818b;

        public a(int i10, int i11) {
            super("Buffer too small (" + i10 + " < " + i11 + ")");
            this.f16817a = i10;
            this.f16818b = i11;
        }
    }

    static {
        v.a("media3.decoder");
    }

    public f(int i10) {
        this(i10, 0);
    }

    public f(int i10, int i11) {
        this.f16810c = new c();
        this.f16815h = i10;
        this.f16816i = i11;
    }

    public static f D() {
        return new f(0);
    }

    private ByteBuffer z(int i10) {
        int i11 = this.f16815h;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f16811d;
        throw new a(byteBuffer == null ? 0 : byteBuffer.capacity(), i10);
    }

    public void A(int i10) {
        int i11 = i10 + this.f16816i;
        ByteBuffer byteBuffer = this.f16811d;
        if (byteBuffer == null) {
            this.f16811d = z(i11);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i12 = i11 + iPosition;
        if (iCapacity >= i12) {
            this.f16811d = byteBuffer;
            return;
        }
        ByteBuffer byteBufferZ = z(i12);
        byteBufferZ.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferZ.put(byteBuffer);
        }
        this.f16811d = byteBufferZ;
    }

    public final void B() {
        ByteBuffer byteBuffer = this.f16811d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f16814g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean C() {
        return r(1073741824);
    }

    public void E(int i10) {
        ByteBuffer byteBuffer = this.f16814g;
        if (byteBuffer == null || byteBuffer.capacity() < i10) {
            this.f16814g = ByteBuffer.allocate(i10);
        } else {
            this.f16814g.clear();
        }
    }

    @Override // Y1.a
    public void p() {
        super.p();
        ByteBuffer byteBuffer = this.f16811d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f16814g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f16812e = false;
    }
}

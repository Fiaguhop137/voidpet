package p040c3;

import U1.AbstractC1459a;
import U1.E;
import U1.F;
import U1.K;
import android.util.SparseArray;
import p380v2.I;
import p380v2.InterfaceC4253p;
import p380v2.InterfaceC4254q;
import p380v2.J;
import p380v2.r;
import p380v2.u;

/* JADX INFO: loaded from: classes.dex */
public final class C implements InterfaceC4253p {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final u f26773l = new B();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K f26774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray f26775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final F f26776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final A f26777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f26778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f26779f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f26780g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f26781h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private z f26782i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private r f26783j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f26784k;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC2111m f26785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final K f26786b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final E f26787c = new E(new byte[64]);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f26788d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f26789e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f26790f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f26791g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f26792h;

        public a(InterfaceC2111m interfaceC2111m, K k10) {
            this.f26785a = interfaceC2111m;
            this.f26786b = k10;
        }

        private void b() {
            this.f26787c.r(8);
            this.f26788d = this.f26787c.g();
            this.f26789e = this.f26787c.g();
            this.f26787c.r(6);
            this.f26791g = this.f26787c.h(8);
        }

        private void c() {
            this.f26792h = 0L;
            if (this.f26788d) {
                this.f26787c.r(4);
                long jH = ((long) this.f26787c.h(3)) << 30;
                this.f26787c.r(1);
                long jH2 = jH | ((long) (this.f26787c.h(15) << 15));
                this.f26787c.r(1);
                long jH3 = jH2 | ((long) this.f26787c.h(15));
                this.f26787c.r(1);
                if (!this.f26790f && this.f26789e) {
                    this.f26787c.r(4);
                    long jH4 = ((long) this.f26787c.h(3)) << 30;
                    this.f26787c.r(1);
                    long jH5 = jH4 | ((long) (this.f26787c.h(15) << 15));
                    this.f26787c.r(1);
                    long jH6 = jH5 | ((long) this.f26787c.h(15));
                    this.f26787c.r(1);
                    this.f26786b.b(jH6);
                    this.f26790f = true;
                }
                this.f26792h = this.f26786b.b(jH3);
            }
        }

        public void a(F f10) {
            f10.q(this.f26787c.f12848a, 0, 3);
            this.f26787c.p(0);
            b();
            f10.q(this.f26787c.f12848a, 0, this.f26791g);
            this.f26787c.p(0);
            c();
            this.f26785a.f(this.f26792h, 4);
            this.f26785a.c(f10);
            this.f26785a.d(false);
        }

        public void d() {
            this.f26790f = false;
            this.f26785a.a();
        }
    }

    public C() {
        this(new K(0L));
    }

    public C(K k10) {
        this.f26774a = k10;
        this.f26776c = new F(4096);
        this.f26775b = new SparseArray();
        this.f26777d = new A();
    }

    public static /* synthetic */ InterfaceC4253p[] c() {
        return new InterfaceC4253p[]{new C()};
    }

    private void d(long j10) {
        if (this.f26784k) {
            return;
        }
        this.f26784k = true;
        if (this.f26777d.c() == -9223372036854775807L) {
            this.f26783j.p(new J.b(this.f26777d.c()));
            return;
        }
        z zVar = new z(this.f26777d.d(), this.f26777d.c(), j10);
        this.f26782i = zVar;
        this.f26783j.p(zVar.b());
    }

    @Override // p380v2.InterfaceC4253p
    public void a(long j10, long j11) {
        boolean z10 = this.f26774a.f() == -9223372036854775807L;
        if (!z10) {
            long jD = this.f26774a.d();
            z10 = (jD == -9223372036854775807L || jD == 0 || jD == j11) ? false : true;
        }
        if (z10) {
            this.f26774a.i(j11);
        }
        z zVar = this.f26782i;
        if (zVar != null) {
            zVar.h(j11);
        }
        for (int i10 = 0; i10 < this.f26775b.size(); i10++) {
            ((a) this.f26775b.valueAt(i10)).d();
        }
    }

    @Override // p380v2.InterfaceC4253p
    public void b(r rVar) {
        this.f26783j = rVar;
    }

    @Override // p380v2.InterfaceC4253p
    public boolean f(InterfaceC4254q interfaceC4254q) {
        byte[] bArr = new byte[14];
        interfaceC4254q.o(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        interfaceC4254q.i(bArr[13] & 7);
        interfaceC4254q.o(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // p380v2.InterfaceC4253p
    public int j(InterfaceC4254q interfaceC4254q, I i10) {
        InterfaceC2111m c2112n;
        AbstractC1459a.i(this.f26783j);
        long length = interfaceC4254q.getLength();
        if (length != -1 && !this.f26777d.e()) {
            return this.f26777d.g(interfaceC4254q, i10);
        }
        d(length);
        z zVar = this.f26782i;
        if (zVar != null && zVar.d()) {
            return this.f26782i.c(interfaceC4254q, i10);
        }
        interfaceC4254q.d();
        long jH = length != -1 ? length - interfaceC4254q.h() : -1L;
        if ((jH != -1 && jH < 4) || !interfaceC4254q.c(this.f26776c.f(), 0, 4, true)) {
            return -1;
        }
        this.f26776c.a0(0);
        int iU = this.f26776c.u();
        if (iU == 441) {
            return -1;
        }
        if (iU == 442) {
            interfaceC4254q.o(this.f26776c.f(), 0, 10);
            this.f26776c.a0(9);
            interfaceC4254q.l((this.f26776c.L() & 7) + 14);
            return 0;
        }
        if (iU == 443) {
            interfaceC4254q.o(this.f26776c.f(), 0, 2);
            this.f26776c.a0(0);
            interfaceC4254q.l(this.f26776c.T() + 6);
            return 0;
        }
        if (((iU & (-256)) >> 8) != 1) {
            interfaceC4254q.l(1);
            return 0;
        }
        int i11 = iU & 255;
        a aVar = (a) this.f26775b.get(i11);
        if (!this.f26778e) {
            if (aVar == null) {
                if (i11 == 189) {
                    c2112n = new C2101c("video/mp2p");
                    this.f26779f = true;
                    this.f26781h = interfaceC4254q.getPosition();
                } else if ((iU & 224) == 192) {
                    c2112n = new t("video/mp2p");
                    this.f26779f = true;
                    this.f26781h = interfaceC4254q.getPosition();
                } else if ((iU & 240) == 224) {
                    c2112n = new C2112n("video/mp2p");
                    this.f26780g = true;
                    this.f26781h = interfaceC4254q.getPosition();
                } else {
                    c2112n = null;
                }
                if (c2112n != null) {
                    c2112n.e(this.f26783j, new L.d(i11, 256));
                    aVar = new a(c2112n, this.f26774a);
                    this.f26775b.put(i11, aVar);
                }
            }
            if (interfaceC4254q.getPosition() > ((this.f26779f && this.f26780g) ? this.f26781h + 8192 : 1048576L)) {
                this.f26778e = true;
                this.f26783j.t();
            }
        }
        interfaceC4254q.o(this.f26776c.f(), 0, 2);
        this.f26776c.a0(0);
        int iT = this.f26776c.T() + 6;
        if (aVar == null) {
            interfaceC4254q.l(iT);
        } else {
            this.f26776c.W(iT);
            interfaceC4254q.readFully(this.f26776c.f(), 0, iT);
            this.f26776c.a0(6);
            aVar.a(this.f26776c);
            F f10 = this.f26776c;
            f10.Z(f10.b());
        }
        return 0;
    }

    @Override // p380v2.InterfaceC4253p
    public void release() {
    }
}

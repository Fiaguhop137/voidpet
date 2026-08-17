package p040c3;

import R1.z;
import U1.AbstractC1459a;
import U1.E;
import U1.F;
import java.io.EOFException;
import p380v2.C4246i;
import p380v2.I;
import p380v2.InterfaceC4253p;
import p380v2.InterfaceC4254q;
import p380v2.J;
import p380v2.r;
import p380v2.u;

/* JADX INFO: renamed from: c3.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2106h implements InterfaceC4253p {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final u f26901m = new C2105g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2107i f26903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final F f26904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final F f26905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final E f26906e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private r f26907f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f26908g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f26909h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f26910i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f26911j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f26912k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f26913l;

    public C2106h() {
        this(0);
    }

    public C2106h(int i10) {
        this.f26902a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f26903b = new C2107i(true, "audio/mp4a-latm");
        this.f26904c = new F(2048);
        this.f26910i = -1;
        this.f26909h = -1L;
        F f10 = new F(10);
        this.f26905d = f10;
        this.f26906e = new E(f10.f());
    }

    public static /* synthetic */ InterfaceC4253p[] c() {
        return new InterfaceC4253p[]{new C2106h()};
    }

    private void d(InterfaceC4254q interfaceC4254q) throws z {
        if (this.f26911j) {
            return;
        }
        this.f26910i = -1;
        interfaceC4254q.d();
        long j10 = 0;
        if (interfaceC4254q.getPosition() == 0) {
            l(interfaceC4254q);
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            try {
                if (interfaceC4254q.c(this.f26905d.f(), 0, 2, true)) {
                    this.f26905d.a0(0);
                    if (!C2107i.m(this.f26905d.T())) {
                        break;
                    }
                    if (interfaceC4254q.c(this.f26905d.f(), 0, 4, true)) {
                        this.f26906e.p(14);
                        int iH = this.f26906e.h(13);
                        if (iH <= 6) {
                            this.f26911j = true;
                            throw z.a("Malformed ADTS stream", null);
                        }
                        j10 += (long) iH;
                        i11++;
                        if (i11 != 1000 && interfaceC4254q.n(iH - 6, true)) {
                        }
                    }
                }
            } catch (EOFException unused) {
            }
            i10 = i11;
            break;
        }
        interfaceC4254q.d();
        if (i10 > 0) {
            this.f26910i = (int) (j10 / ((long) i10));
        } else {
            this.f26910i = -1;
        }
        this.f26911j = true;
    }

    private static int e(int i10, long j10) {
        return (int) ((((long) i10) * 8000000) / j10);
    }

    private J h(long j10, boolean z10) {
        return new C4246i(j10, this.f26909h, e(this.f26910i, this.f26903b.k()), this.f26910i, z10);
    }

    private void i(long j10, boolean z10) {
        if (this.f26913l) {
            return;
        }
        boolean z11 = (this.f26902a & 1) != 0 && this.f26910i > 0;
        if (z11 && this.f26903b.k() == -9223372036854775807L && !z10) {
            return;
        }
        if (!z11 || this.f26903b.k() == -9223372036854775807L) {
            this.f26907f.p(new J.b(-9223372036854775807L));
        } else {
            this.f26907f.p(h(j10, (this.f26902a & 2) != 0));
        }
        this.f26913l = true;
    }

    private int l(InterfaceC4254q interfaceC4254q) {
        int i10 = 0;
        while (true) {
            interfaceC4254q.o(this.f26905d.f(), 0, 10);
            this.f26905d.a0(0);
            if (this.f26905d.O() != 4801587) {
                break;
            }
            this.f26905d.b0(3);
            int iK = this.f26905d.K();
            i10 += iK + 10;
            interfaceC4254q.i(iK);
        }
        interfaceC4254q.d();
        interfaceC4254q.i(i10);
        if (this.f26909h == -1) {
            this.f26909h = i10;
        }
        return i10;
    }

    @Override // p380v2.InterfaceC4253p
    public void a(long j10, long j11) {
        this.f26912k = false;
        this.f26903b.a();
        this.f26908g = j11;
    }

    @Override // p380v2.InterfaceC4253p
    public void b(r rVar) {
        this.f26907f = rVar;
        this.f26903b.e(rVar, new L.d(0, 1));
        rVar.t();
    }

    @Override // p380v2.InterfaceC4253p
    public boolean f(InterfaceC4254q interfaceC4254q) {
        int iL = l(interfaceC4254q);
        int i10 = iL;
        int i11 = 0;
        int i12 = 0;
        do {
            interfaceC4254q.o(this.f26905d.f(), 0, 2);
            this.f26905d.a0(0);
            if (C2107i.m(this.f26905d.T())) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                interfaceC4254q.o(this.f26905d.f(), 0, 4);
                this.f26906e.p(14);
                int iH = this.f26906e.h(13);
                if (iH <= 6) {
                    i10++;
                    interfaceC4254q.d();
                    interfaceC4254q.i(i10);
                } else {
                    interfaceC4254q.i(iH - 6);
                    i12 += iH;
                }
            } else {
                i10++;
                interfaceC4254q.d();
                interfaceC4254q.i(i10);
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - iL < 8192);
        return false;
    }

    @Override // p380v2.InterfaceC4253p
    public int j(InterfaceC4254q interfaceC4254q, I i10) throws z {
        AbstractC1459a.i(this.f26907f);
        long length = interfaceC4254q.getLength();
        int i11 = this.f26902a;
        if ((i11 & 2) != 0 || ((i11 & 1) != 0 && length != -1)) {
            d(interfaceC4254q);
        }
        int i12 = interfaceC4254q.read(this.f26904c.f(), 0, 2048);
        boolean z10 = i12 == -1;
        i(length, z10);
        if (z10) {
            return -1;
        }
        this.f26904c.a0(0);
        this.f26904c.Z(i12);
        if (!this.f26912k) {
            this.f26903b.f(this.f26908g, 4);
            this.f26912k = true;
        }
        this.f26903b.c(this.f26904c);
        return 0;
    }

    @Override // p380v2.InterfaceC4253p
    public void release() {
    }
}

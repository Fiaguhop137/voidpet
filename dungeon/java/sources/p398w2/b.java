package p398w2;

import R1.z;
import U1.AbstractC1459a;
import U1.S;
import java.io.EOFException;
import java.util.Arrays;
import p380v2.C4246i;
import p380v2.C4251n;
import p380v2.E;
import p380v2.I;
import p380v2.InterfaceC4253p;
import p380v2.InterfaceC4254q;
import p380v2.J;
import p380v2.O;
import p380v2.r;
import p380v2.u;

/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC4253p {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final u f56567s = new a();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int[] f56568t = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int[] f56569u = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final byte[] f56570v = S.u0("#!AMR\n");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final byte[] f56571w = S.u0("#!AMR-WB\n");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f56572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f56573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final O f56574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f56575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f56576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f56577f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f56578g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f56579h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f56580i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f56581j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f56582k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private r f56583l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private O f56584m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private O f56585n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private J f56586o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f56587p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f56588q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f56589r;

    public b() {
        this(0);
    }

    public b(int i10) {
        this.f56573b = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f56572a = new byte[1];
        this.f56580i = -1;
        C4251n c4251n = new C4251n();
        this.f56574c = c4251n;
        this.f56585n = c4251n;
    }

    public static /* synthetic */ InterfaceC4253p[] c() {
        return new InterfaceC4253p[]{new b()};
    }

    private void d() {
        AbstractC1459a.i(this.f56584m);
        S.i(this.f56583l);
    }

    private static int e(int i10, long j10) {
        return (int) ((((long) i10) * 8000000) / j10);
    }

    private J h(long j10, boolean z10) {
        return new C4246i(j10, this.f56579h, e(this.f56580i, 20000L), this.f56580i, z10);
    }

    private int i(int i10) throws z {
        if (n(i10)) {
            return this.f56575d ? f56569u[i10] : f56568t[i10];
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Illegal AMR ");
        sb2.append(this.f56575d ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i10);
        throw z.a(sb2.toString(), null);
    }

    private boolean l(int i10) {
        if (this.f56575d) {
            return false;
        }
        return i10 < 12 || i10 > 14;
    }

    private boolean m(long j10, long j11) {
        return Math.abs(j11 - j10) < 20000;
    }

    private boolean n(int i10) {
        if (i10 < 0 || i10 > 15) {
            return false;
        }
        return o(i10) || l(i10);
    }

    private boolean o(int i10) {
        if (this.f56575d) {
            return i10 < 10 || i10 > 13;
        }
        return false;
    }

    private void p() {
        if (this.f56589r) {
            return;
        }
        this.f56589r = true;
        boolean z10 = this.f56575d;
        String str = z10 ? "audio/amr-wb" : "audio/amr";
        this.f56584m.b(new R1.r.b().W(str).y0(z10 ? "audio/amr-wb" : "audio/3gpp").o0(z10 ? f56569u[8] : f56568t[7]).T(1).z0(z10 ? 16000 : 8000).P());
    }

    private void q(long j10, int i10) {
        int i11;
        if (this.f56586o != null) {
            return;
        }
        int i12 = this.f56573b;
        if ((i12 & 4) != 0) {
            this.f56586o = new E(new long[]{this.f56579h}, new long[]{0}, -9223372036854775807L);
        } else if ((i12 & 1) == 0 || !((i11 = this.f56580i) == -1 || i11 == this.f56577f)) {
            this.f56586o = new J.b(-9223372036854775807L);
        } else if (this.f56581j >= 20 || i10 == -1) {
            J jH = h(j10, (i12 & 2) != 0);
            this.f56586o = jH;
            this.f56584m.d(jH.m());
        }
        J j11 = this.f56586o;
        if (j11 != null) {
            this.f56583l.p(j11);
        }
    }

    private static boolean r(InterfaceC4254q interfaceC4254q, byte[] bArr) {
        interfaceC4254q.d();
        byte[] bArr2 = new byte[bArr.length];
        interfaceC4254q.o(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    private int s(InterfaceC4254q interfaceC4254q) throws z {
        interfaceC4254q.d();
        interfaceC4254q.o(this.f56572a, 0, 1);
        byte b10 = this.f56572a[0];
        if ((b10 & 131) <= 0) {
            return i((b10 >> 3) & 15);
        }
        throw z.a("Invalid padding bits for frame header " + ((int) b10), null);
    }

    private boolean t(InterfaceC4254q interfaceC4254q) {
        byte[] bArr = f56570v;
        if (r(interfaceC4254q, bArr)) {
            this.f56575d = false;
            interfaceC4254q.l(bArr.length);
            return true;
        }
        byte[] bArr2 = f56571w;
        if (!r(interfaceC4254q, bArr2)) {
            return false;
        }
        this.f56575d = true;
        interfaceC4254q.l(bArr2.length);
        return true;
    }

    private int u(InterfaceC4254q interfaceC4254q) throws z {
        if (this.f56578g == 0) {
            try {
                int iS = s(interfaceC4254q);
                this.f56577f = iS;
                this.f56578g = iS;
                if (this.f56580i == -1) {
                    this.f56579h = interfaceC4254q.getPosition();
                    this.f56580i = this.f56577f;
                }
                if (this.f56580i == this.f56577f) {
                    this.f56581j++;
                }
                J j10 = this.f56586o;
                if (j10 instanceof E) {
                    E e10 = (E) j10;
                    long j11 = this.f56582k + this.f56576e + 20000;
                    long position = interfaceC4254q.getPosition() + ((long) this.f56577f);
                    if (!e10.b(j11, 100000L)) {
                        e10.a(j11, position);
                    }
                    if (this.f56587p && m(j11, this.f56588q)) {
                        this.f56587p = false;
                        this.f56585n = this.f56584m;
                    }
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iA = this.f56585n.a(interfaceC4254q, this.f56578g, true);
        if (iA == -1) {
            return -1;
        }
        int i10 = this.f56578g - iA;
        this.f56578g = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f56585n.c(this.f56582k + this.f56576e, 1, this.f56577f, 0, null);
        this.f56576e += 20000;
        return 0;
    }

    @Override // p380v2.InterfaceC4253p
    public void a(long j10, long j11) {
        this.f56576e = 0L;
        this.f56577f = 0;
        this.f56578g = 0;
        this.f56588q = j11;
        J j12 = this.f56586o;
        if (!(j12 instanceof E)) {
            if (j10 == 0 || !(j12 instanceof C4246i)) {
                this.f56582k = 0L;
                return;
            } else {
                this.f56582k = ((C4246i) j12).b(j10);
                return;
            }
        }
        long jC = ((E) j12).c(j10);
        this.f56582k = jC;
        if (m(jC, this.f56588q)) {
            return;
        }
        this.f56587p = true;
        this.f56585n = this.f56574c;
    }

    @Override // p380v2.InterfaceC4253p
    public void b(r rVar) {
        this.f56583l = rVar;
        O oF = rVar.f(0, 1);
        this.f56584m = oF;
        this.f56585n = oF;
        rVar.t();
    }

    @Override // p380v2.InterfaceC4253p
    public boolean f(InterfaceC4254q interfaceC4254q) {
        return t(interfaceC4254q);
    }

    @Override // p380v2.InterfaceC4253p
    public int j(InterfaceC4254q interfaceC4254q, I i10) throws z {
        d();
        if (interfaceC4254q.getPosition() == 0 && !t(interfaceC4254q)) {
            throw z.a("Could not find AMR header.", null);
        }
        p();
        int iU = u(interfaceC4254q);
        q(interfaceC4254q.getLength(), iU);
        if (iU == -1) {
            J j10 = this.f56586o;
            if (j10 instanceof E) {
                long j11 = this.f56582k + this.f56576e;
                ((E) j10).f(j11);
                this.f56583l.p(this.f56586o);
                this.f56584m.d(j11);
            }
        }
        return iU;
    }

    @Override // p380v2.InterfaceC4253p
    public void release() {
    }
}

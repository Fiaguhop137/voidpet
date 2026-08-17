package Q2;

import R1.z;
import U1.AbstractC1459a;
import U1.F;
import p380v2.AbstractC4255s;
import p380v2.InterfaceC4254q;

/* JADX INFO: loaded from: classes.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f9297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f9298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f9299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f9300f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9301g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9302h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f9303i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f9304j = new int[255];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final F f9305k = new F(255);

    f() {
    }

    public boolean a(InterfaceC4254q interfaceC4254q, boolean z10) throws z {
        b();
        this.f9305k.W(27);
        if (!AbstractC4255s.c(interfaceC4254q, this.f9305k.f(), 0, 27, z10) || this.f9305k.N() != 1332176723) {
            return false;
        }
        int iL = this.f9305k.L();
        this.f9295a = iL;
        if (iL != 0) {
            if (z10) {
                return false;
            }
            throw z.d("unsupported bit stream revision");
        }
        this.f9296b = this.f9305k.L();
        this.f9297c = this.f9305k.z();
        this.f9298d = this.f9305k.B();
        this.f9299e = this.f9305k.B();
        this.f9300f = this.f9305k.B();
        int iL2 = this.f9305k.L();
        this.f9301g = iL2;
        this.f9302h = iL2 + 27;
        this.f9305k.W(iL2);
        if (!AbstractC4255s.c(interfaceC4254q, this.f9305k.f(), 0, this.f9301g, z10)) {
            return false;
        }
        for (int i10 = 0; i10 < this.f9301g; i10++) {
            this.f9304j[i10] = this.f9305k.L();
            this.f9303i += this.f9304j[i10];
        }
        return true;
    }

    public void b() {
        this.f9295a = 0;
        this.f9296b = 0;
        this.f9297c = 0L;
        this.f9298d = 0L;
        this.f9299e = 0L;
        this.f9300f = 0L;
        this.f9301g = 0;
        this.f9302h = 0;
        this.f9303i = 0;
    }

    public boolean c(InterfaceC4254q interfaceC4254q) {
        return d(interfaceC4254q, -1L);
    }

    public boolean d(InterfaceC4254q interfaceC4254q, long j10) {
        AbstractC1459a.a(interfaceC4254q.getPosition() == interfaceC4254q.h());
        this.f9305k.W(4);
        while (true) {
            if ((j10 != -1 && interfaceC4254q.getPosition() + 4 >= j10) || !AbstractC4255s.c(interfaceC4254q, this.f9305k.f(), 0, 4, true)) {
                break;
            }
            this.f9305k.a0(0);
            if (this.f9305k.N() == 1332176723) {
                interfaceC4254q.d();
                return true;
            }
            interfaceC4254q.l(1);
        }
        do {
            if (j10 != -1 && interfaceC4254q.getPosition() >= j10) {
                break;
            }
        } while (interfaceC4254q.a(1) != -1);
        return false;
    }
}

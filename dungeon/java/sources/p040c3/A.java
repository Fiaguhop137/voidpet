package p040c3;

import U1.F;
import U1.K;
import U1.S;
import p380v2.I;
import p380v2.InterfaceC4254q;

/* JADX INFO: loaded from: classes.dex */
final class A {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f26767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f26768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f26769e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K f26765a = new K(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f26770f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f26771g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f26772h = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final F f26766b = new F();

    A() {
    }

    private static boolean a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    private int b(InterfaceC4254q interfaceC4254q) {
        this.f26766b.X(S.f12881f);
        this.f26767c = true;
        interfaceC4254q.d();
        return 0;
    }

    private int f(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    private int h(InterfaceC4254q interfaceC4254q, I i10) {
        int iMin = (int) Math.min(20000L, interfaceC4254q.getLength());
        long j10 = 0;
        if (interfaceC4254q.getPosition() != j10) {
            i10.f55969a = j10;
            return 1;
        }
        this.f26766b.W(iMin);
        interfaceC4254q.d();
        interfaceC4254q.o(this.f26766b.f(), 0, iMin);
        this.f26770f = i(this.f26766b);
        this.f26768d = true;
        return 0;
    }

    private long i(F f10) {
        int iJ = f10.j();
        for (int iG = f10.g(); iG < iJ - 3; iG++) {
            if (f(f10.f(), iG) == 442) {
                f10.a0(iG + 4);
                long jL = l(f10);
                if (jL != -9223372036854775807L) {
                    return jL;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int j(InterfaceC4254q interfaceC4254q, I i10) {
        long length = interfaceC4254q.getLength();
        int iMin = (int) Math.min(20000L, length);
        long j10 = length - ((long) iMin);
        if (interfaceC4254q.getPosition() != j10) {
            i10.f55969a = j10;
            return 1;
        }
        this.f26766b.W(iMin);
        interfaceC4254q.d();
        interfaceC4254q.o(this.f26766b.f(), 0, iMin);
        this.f26771g = k(this.f26766b);
        this.f26769e = true;
        return 0;
    }

    private long k(F f10) {
        int iG = f10.g();
        for (int iJ = f10.j() - 4; iJ >= iG; iJ--) {
            if (f(f10.f(), iJ) == 442) {
                f10.a0(iJ + 4);
                long jL = l(f10);
                if (jL != -9223372036854775807L) {
                    return jL;
                }
            }
        }
        return -9223372036854775807L;
    }

    public static long l(F f10) {
        int iG = f10.g();
        if (f10.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        f10.q(bArr, 0, 9);
        f10.a0(iG);
        if (a(bArr)) {
            return m(bArr);
        }
        return -9223372036854775807L;
    }

    private static long m(byte[] bArr) {
        byte b10 = bArr[0];
        long j10 = (((((long) b10) & 56) >> 3) << 30) | ((((long) b10) & 3) << 28) | ((((long) bArr[1]) & 255) << 20);
        byte b11 = bArr[2];
        return j10 | (((((long) b11) & 248) >> 3) << 15) | ((((long) b11) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    public long c() {
        return this.f26772h;
    }

    public K d() {
        return this.f26765a;
    }

    public boolean e() {
        return this.f26767c;
    }

    public int g(InterfaceC4254q interfaceC4254q, I i10) {
        if (!this.f26769e) {
            return j(interfaceC4254q, i10);
        }
        if (this.f26771g == -9223372036854775807L) {
            return b(interfaceC4254q);
        }
        if (!this.f26768d) {
            return h(interfaceC4254q, i10);
        }
        long j10 = this.f26770f;
        if (j10 == -9223372036854775807L) {
            return b(interfaceC4254q);
        }
        this.f26772h = this.f26765a.c(this.f26771g) - this.f26765a.b(j10);
        return b(interfaceC4254q);
    }
}

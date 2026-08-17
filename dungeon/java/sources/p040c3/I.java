package p040c3;

import U1.F;
import U1.K;
import U1.S;
import p380v2.InterfaceC4254q;

/* JADX INFO: loaded from: classes.dex */
final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26808a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f26811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f26812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f26813f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final K f26809b = new K(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f26814g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f26815h = -9223372036854775807L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f26816i = -9223372036854775807L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final F f26810c = new F();

    I(int i10) {
        this.f26808a = i10;
    }

    private int a(InterfaceC4254q interfaceC4254q) {
        this.f26810c.X(S.f12881f);
        this.f26811d = true;
        interfaceC4254q.d();
        return 0;
    }

    private int f(InterfaceC4254q interfaceC4254q, p380v2.I i10, int i11) {
        int iMin = (int) Math.min(this.f26808a, interfaceC4254q.getLength());
        long j10 = 0;
        if (interfaceC4254q.getPosition() != j10) {
            i10.f55969a = j10;
            return 1;
        }
        this.f26810c.W(iMin);
        interfaceC4254q.d();
        interfaceC4254q.o(this.f26810c.f(), 0, iMin);
        this.f26814g = g(this.f26810c, i11);
        this.f26812e = true;
        return 0;
    }

    private long g(F f10, int i10) {
        int iJ = f10.j();
        for (int iG = f10.g(); iG < iJ; iG++) {
            if (f10.f()[iG] == 71) {
                long jC = M.c(f10, iG, i10);
                if (jC != -9223372036854775807L) {
                    return jC;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int h(InterfaceC4254q interfaceC4254q, p380v2.I i10, int i11) {
        long length = interfaceC4254q.getLength();
        int iMin = (int) Math.min(this.f26808a, length);
        long j10 = length - ((long) iMin);
        if (interfaceC4254q.getPosition() != j10) {
            i10.f55969a = j10;
            return 1;
        }
        this.f26810c.W(iMin);
        interfaceC4254q.d();
        interfaceC4254q.o(this.f26810c.f(), 0, iMin);
        this.f26815h = i(this.f26810c, i11);
        this.f26813f = true;
        return 0;
    }

    private long i(F f10, int i10) {
        int iG = f10.g();
        int iJ = f10.j();
        for (int i11 = iJ - 188; i11 >= iG; i11--) {
            if (M.b(f10.f(), iG, iJ, i11)) {
                long jC = M.c(f10, i11, i10);
                if (jC != -9223372036854775807L) {
                    return jC;
                }
            }
        }
        return -9223372036854775807L;
    }

    public long b() {
        return this.f26816i;
    }

    public K c() {
        return this.f26809b;
    }

    public boolean d() {
        return this.f26811d;
    }

    public int e(InterfaceC4254q interfaceC4254q, p380v2.I i10, int i11) {
        if (i11 <= 0) {
            return a(interfaceC4254q);
        }
        if (!this.f26813f) {
            return h(interfaceC4254q, i10, i11);
        }
        if (this.f26815h == -9223372036854775807L) {
            return a(interfaceC4254q);
        }
        if (!this.f26812e) {
            return f(interfaceC4254q, i10, i11);
        }
        long j10 = this.f26814g;
        if (j10 == -9223372036854775807L) {
            return a(interfaceC4254q);
        }
        this.f26816i = this.f26809b.c(this.f26815h) - this.f26809b.b(j10);
        return a(interfaceC4254q);
    }
}

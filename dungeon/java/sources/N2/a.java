package N2;

import R1.z;
import U1.AbstractC1459a;
import java.util.ArrayDeque;
import p380v2.InterfaceC4254q;

/* JADX INFO: loaded from: classes.dex */
final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f7169a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque f7170b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f7171c = new g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private N2.b f7172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f7173e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f7174f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f7175g;

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f7176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f7177b;

        private b(int i10, long j10) {
            this.f7176a = i10;
            this.f7177b = j10;
        }

        /* synthetic */ b(int i10, long j10, C0129a c0129a) {
            this(i10, j10);
        }
    }

    private long c(InterfaceC4254q interfaceC4254q) {
        interfaceC4254q.d();
        while (true) {
            interfaceC4254q.o(this.f7169a, 0, 4);
            int iC = g.c(this.f7169a[0]);
            if (iC != -1 && iC <= 4) {
                int iA = (int) g.a(this.f7169a, iC, false);
                if (this.f7172d.e(iA)) {
                    interfaceC4254q.l(iC);
                    return iA;
                }
            }
            interfaceC4254q.l(1);
        }
    }

    private double d(InterfaceC4254q interfaceC4254q, int i10) {
        long jE = e(interfaceC4254q, i10);
        return i10 == 4 ? Float.intBitsToFloat((int) jE) : Double.longBitsToDouble(jE);
    }

    private long e(InterfaceC4254q interfaceC4254q, int i10) {
        interfaceC4254q.readFully(this.f7169a, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | ((long) (this.f7169a[i11] & 255));
        }
        return j10;
    }

    private static String f(InterfaceC4254q interfaceC4254q, int i10) {
        if (i10 == 0) {
            return "";
        }
        byte[] bArr = new byte[i10];
        interfaceC4254q.readFully(bArr, 0, i10);
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        return new String(bArr, 0, i10);
    }

    @Override // N2.c
    public boolean a(InterfaceC4254q interfaceC4254q) throws z {
        AbstractC1459a.i(this.f7172d);
        while (true) {
            b bVar = (b) this.f7170b.peek();
            if (bVar != null && interfaceC4254q.getPosition() >= bVar.f7177b) {
                this.f7172d.a(((b) this.f7170b.pop()).f7176a);
                return true;
            }
            if (this.f7173e == 0) {
                long jD = this.f7171c.d(interfaceC4254q, true, false, 4);
                if (jD == -2) {
                    jD = c(interfaceC4254q);
                }
                if (jD == -1) {
                    return false;
                }
                this.f7174f = (int) jD;
                this.f7173e = 1;
            }
            if (this.f7173e == 1) {
                this.f7175g = this.f7171c.d(interfaceC4254q, false, true, 8);
                this.f7173e = 2;
            }
            int iD = this.f7172d.d(this.f7174f);
            if (iD != 0) {
                if (iD == 1) {
                    long position = interfaceC4254q.getPosition();
                    this.f7170b.push(new b(this.f7174f, this.f7175g + position, null));
                    this.f7172d.h(this.f7174f, position, this.f7175g);
                    this.f7173e = 0;
                    return true;
                }
                if (iD == 2) {
                    long j10 = this.f7175g;
                    if (j10 <= 8) {
                        this.f7172d.c(this.f7174f, e(interfaceC4254q, (int) j10));
                        this.f7173e = 0;
                        return true;
                    }
                    throw z.a("Invalid integer size: " + this.f7175g, null);
                }
                if (iD == 3) {
                    long j11 = this.f7175g;
                    if (j11 <= 2147483647L) {
                        this.f7172d.f(this.f7174f, f(interfaceC4254q, (int) j11));
                        this.f7173e = 0;
                        return true;
                    }
                    throw z.a("String element size: " + this.f7175g, null);
                }
                if (iD == 4) {
                    this.f7172d.g(this.f7174f, (int) this.f7175g, interfaceC4254q);
                    this.f7173e = 0;
                    return true;
                }
                if (iD != 5) {
                    throw z.a("Invalid element type " + iD, null);
                }
                long j12 = this.f7175g;
                if (j12 == 4 || j12 == 8) {
                    this.f7172d.b(this.f7174f, d(interfaceC4254q, (int) j12));
                    this.f7173e = 0;
                    return true;
                }
                throw z.a("Invalid float size: " + this.f7175g, null);
            }
            interfaceC4254q.l((int) this.f7175g);
            this.f7173e = 0;
        }
    }

    @Override // N2.c
    public void b(N2.b bVar) {
        this.f7172d = bVar;
    }

    @Override // N2.c
    public void reset() {
        this.f7173e = 0;
        this.f7170b.clear();
        this.f7171c.e();
    }
}

package p040c3;

import U1.AbstractC1459a;
import U1.AbstractC1477t;
import U1.E;
import U1.F;
import U1.K;
import p380v2.r;

/* JADX INFO: loaded from: classes.dex */
public final class y implements L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2111m f27174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final E f27175b = new E(new byte[10]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f27176c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f27177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private K f27178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f27179f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f27180g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f27181h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f27182i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f27183j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f27184k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f27185l;

    public y(InterfaceC2111m interfaceC2111m) {
        this.f27174a = interfaceC2111m;
    }

    private boolean e(F f10, byte[] bArr, int i10) {
        int iMin = Math.min(f10.a(), i10 - this.f27177d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            f10.b0(iMin);
        } else {
            f10.q(bArr, this.f27177d, iMin);
        }
        int i11 = this.f27177d + iMin;
        this.f27177d = i11;
        return i11 == i10;
    }

    private boolean f() {
        this.f27175b.p(0);
        int iH = this.f27175b.h(24);
        if (iH != 1) {
            AbstractC1477t.h("PesReader", "Unexpected start code prefix: " + iH);
            this.f27183j = -1;
            return false;
        }
        this.f27175b.r(8);
        int iH2 = this.f27175b.h(16);
        this.f27175b.r(5);
        this.f27184k = this.f27175b.g();
        this.f27175b.r(2);
        this.f27179f = this.f27175b.g();
        this.f27180g = this.f27175b.g();
        this.f27175b.r(6);
        int iH3 = this.f27175b.h(8);
        this.f27182i = iH3;
        if (iH2 == 0) {
            this.f27183j = -1;
        } else {
            int i10 = (iH2 - 3) - iH3;
            this.f27183j = i10;
            if (i10 < 0) {
                AbstractC1477t.h("PesReader", "Found negative packet payload size: " + this.f27183j);
                this.f27183j = -1;
            }
        }
        return true;
    }

    private void g() {
        this.f27175b.p(0);
        this.f27185l = -9223372036854775807L;
        if (this.f27179f) {
            this.f27175b.r(4);
            long jH = ((long) this.f27175b.h(3)) << 30;
            this.f27175b.r(1);
            long jH2 = jH | ((long) (this.f27175b.h(15) << 15));
            this.f27175b.r(1);
            long jH3 = jH2 | ((long) this.f27175b.h(15));
            this.f27175b.r(1);
            if (!this.f27181h && this.f27180g) {
                this.f27175b.r(4);
                long jH4 = ((long) this.f27175b.h(3)) << 30;
                this.f27175b.r(1);
                long jH5 = jH4 | ((long) (this.f27175b.h(15) << 15));
                this.f27175b.r(1);
                long jH6 = jH5 | ((long) this.f27175b.h(15));
                this.f27175b.r(1);
                this.f27178e.b(jH6);
                this.f27181h = true;
            }
            this.f27185l = this.f27178e.b(jH3);
        }
    }

    private void h(int i10) {
        this.f27176c = i10;
        this.f27177d = 0;
    }

    @Override // p040c3.L
    public void a() {
        this.f27176c = 0;
        this.f27177d = 0;
        this.f27181h = false;
        this.f27174a.a();
    }

    @Override // p040c3.L
    public void b(K k10, r rVar, L.d dVar) {
        this.f27178e = k10;
        this.f27174a.e(rVar, dVar);
    }

    @Override // p040c3.L
    public void c(F f10, int i10) {
        AbstractC1459a.i(this.f27178e);
        if ((i10 & 1) != 0) {
            int i11 = this.f27176c;
            if (i11 != 0 && i11 != 1) {
                if (i11 == 2) {
                    AbstractC1477t.h("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f27183j != -1) {
                        AbstractC1477t.h("PesReader", "Unexpected start indicator: expected " + this.f27183j + " more bytes");
                    }
                    this.f27174a.d(f10.j() == 0);
                }
            }
            h(1);
        }
        while (f10.a() > 0) {
            int i12 = this.f27176c;
            if (i12 == 0) {
                f10.b0(f10.a());
            } else if (i12 != 1) {
                if (i12 == 2) {
                    if (e(f10, this.f27175b.f12848a, Math.min(10, this.f27182i)) && e(f10, null, this.f27182i)) {
                        g();
                        i10 |= this.f27184k ? 4 : 0;
                        this.f27174a.f(this.f27185l, i10);
                        h(3);
                    }
                } else {
                    if (i12 != 3) {
                        throw new IllegalStateException();
                    }
                    int iA = f10.a();
                    int i13 = this.f27183j;
                    int i14 = i13 == -1 ? 0 : iA - i13;
                    if (i14 > 0) {
                        iA -= i14;
                        f10.Z(f10.g() + iA);
                    }
                    this.f27174a.c(f10);
                    int i15 = this.f27183j;
                    if (i15 != -1) {
                        int i16 = i15 - iA;
                        this.f27183j = i16;
                        if (i16 == 0) {
                            this.f27174a.d(false);
                            h(1);
                        }
                    }
                }
            } else if (e(f10, this.f27175b.f12848a, 9)) {
                h(f() ? 2 : 0);
            }
        }
    }

    public boolean d(boolean z10) {
        return this.f27176c == 3 && this.f27183j == -1 && !(z10 && (this.f27174a instanceof C2112n)) && (!z10 || f());
    }
}

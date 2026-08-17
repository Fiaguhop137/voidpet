package B2;

import R1.r;
import U1.F;
import V1.h;
import p380v2.C4241d;
import p380v2.O;

/* JADX INFO: loaded from: classes.dex */
final class f extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final F f553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final F f554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f557f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f558g;

    public f(O o10) {
        super(o10);
        this.f553b = new F(h.f13920a);
        this.f554c = new F(4);
    }

    @Override // B2.e
    protected boolean b(F f10) throws e.a {
        int iL = f10.L();
        int i10 = (iL >> 4) & 15;
        int i11 = iL & 15;
        if (i11 == 7) {
            this.f558g = i10;
            return i10 != 5;
        }
        throw new e.a("Video format not supported: " + i11);
    }

    @Override // B2.e
    protected boolean c(F f10, long j10) {
        int iL = f10.L();
        long jV = j10 + (((long) f10.v()) * 1000);
        if (iL == 0 && !this.f556e) {
            F f11 = new F(new byte[f10.a()]);
            f10.q(f11.f(), 0, f10.a());
            C4241d c4241dB = C4241d.b(f11);
            this.f555d = c4241dB.f56050b;
            this.f552a.b(new r.b().W("video/x-flv").y0("video/avc").U(c4241dB.f56060l).F0(c4241dB.f56051c).h0(c4241dB.f56052d).u0(c4241dB.f56059k).k0(c4241dB.f56049a).P());
            this.f556e = true;
            return false;
        }
        if (iL != 1 || !this.f556e) {
            return false;
        }
        int i10 = this.f558g == 1 ? 1 : 0;
        if (!this.f557f && i10 == 0) {
            return false;
        }
        byte[] bArrF = this.f554c.f();
        bArrF[0] = 0;
        bArrF[1] = 0;
        bArrF[2] = 0;
        int i11 = 4 - this.f555d;
        int i12 = 0;
        while (f10.a() > 0) {
            f10.q(this.f554c.f(), i11, this.f555d);
            this.f554c.a0(0);
            int iP = this.f554c.P();
            this.f553b.a0(0);
            this.f552a.f(this.f553b, 4);
            this.f552a.f(f10, iP);
            i12 = i12 + 4 + iP;
        }
        this.f552a.c(jV, i10, i12, 0, null);
        this.f557f = true;
        return true;
    }
}

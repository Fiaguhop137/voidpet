package p040c3;

import U1.AbstractC1459a;
import U1.AbstractC1477t;
import U1.F;
import p380v2.O;

/* JADX INFO: loaded from: classes.dex */
public final class r implements InterfaceC2111m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27093a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private O f27095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f27096d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f27098f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f27099g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final F f27094b = new F(10);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f27097e = -9223372036854775807L;

    public r(String str) {
        this.f27093a = str;
    }

    @Override // p040c3.InterfaceC2111m
    public void a() {
        this.f27096d = false;
        this.f27097e = -9223372036854775807L;
    }

    @Override // p040c3.InterfaceC2111m
    public void c(F f10) {
        AbstractC1459a.i(this.f27095c);
        if (this.f27096d) {
            int iA = f10.a();
            int i10 = this.f27099g;
            if (i10 < 10) {
                int iMin = Math.min(iA, 10 - i10);
                System.arraycopy(f10.f(), f10.g(), this.f27094b.f(), this.f27099g, iMin);
                if (this.f27099g + iMin == 10) {
                    this.f27094b.a0(0);
                    if (73 != this.f27094b.L() || 68 != this.f27094b.L() || 51 != this.f27094b.L()) {
                        AbstractC1477t.h("Id3Reader", "Discarding invalid ID3 tag");
                        this.f27096d = false;
                        return;
                    } else {
                        this.f27094b.b0(3);
                        this.f27098f = this.f27094b.K() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iA, this.f27098f - this.f27099g);
            this.f27095c.f(f10, iMin2);
            this.f27099g += iMin2;
        }
    }

    @Override // p040c3.InterfaceC2111m
    public void d(boolean z10) {
        int i10;
        AbstractC1459a.i(this.f27095c);
        if (this.f27096d && (i10 = this.f27098f) != 0 && this.f27099g == i10) {
            AbstractC1459a.g(this.f27097e != -9223372036854775807L);
            this.f27095c.c(this.f27097e, 1, this.f27098f, 0, null);
            this.f27096d = false;
        }
    }

    @Override // p040c3.InterfaceC2111m
    public void e(p380v2.r rVar, L.d dVar) {
        dVar.a();
        O oF = rVar.f(dVar.c(), 5);
        this.f27095c = oF;
        oF.b(new R1.r.b().j0(dVar.b()).W(this.f27093a).y0("application/id3").P());
    }

    @Override // p040c3.InterfaceC2111m
    public void f(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f27096d = true;
        this.f27097e = j10;
        this.f27098f = 0;
        this.f27099g = 0;
    }
}

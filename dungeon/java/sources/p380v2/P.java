package p380v2;

import U1.AbstractC1459a;

/* JADX INFO: loaded from: classes.dex */
public final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f55990a = new byte[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f55991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f55992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f55993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f55994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f55995f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f55996g;

    public void a(O o10, O.a aVar) {
        if (this.f55992c > 0) {
            o10.c(this.f55993d, this.f55994e, this.f55995f, this.f55996g, aVar);
            this.f55992c = 0;
        }
    }

    public void b() {
        this.f55991b = false;
        this.f55992c = 0;
    }

    public void c(O o10, long j10, int i10, int i11, int i12, O.a aVar) {
        AbstractC1459a.h(this.f55996g <= i11 + i12, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f55991b) {
            int i13 = this.f55992c;
            int i14 = i13 + 1;
            this.f55992c = i14;
            if (i13 == 0) {
                this.f55993d = j10;
                this.f55994e = i10;
                this.f55995f = 0;
            }
            this.f55995f += i11;
            this.f55996g = i12;
            if (i14 >= 16) {
                a(o10, aVar);
            }
        }
    }

    public void d(InterfaceC4254q interfaceC4254q) {
        if (this.f55991b) {
            return;
        }
        interfaceC4254q.o(this.f55990a, 0, 10);
        interfaceC4254q.d();
        if (AbstractC4239b.j(this.f55990a) == 0) {
            return;
        }
        this.f55991b = true;
    }
}

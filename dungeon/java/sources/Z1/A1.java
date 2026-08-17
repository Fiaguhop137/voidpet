package Z1;

import U1.InterfaceC1466h;

/* JADX INFO: loaded from: classes.dex */
public final class A1 implements V0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1466h f17953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f17954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f17955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f17956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private R1.B f17957e = R1.B.f9878d;

    public A1(InterfaceC1466h interfaceC1466h) {
        this.f17953a = interfaceC1466h;
    }

    @Override // Z1.V0
    public long H() {
        long j10 = this.f17955c;
        if (!this.f17954b) {
            return j10;
        }
        long jC = this.f17953a.c() - this.f17956d;
        R1.B b10 = this.f17957e;
        return j10 + (b10.f9881a == 1.0f ? U1.S.M0(jC) : b10.a(jC));
    }

    public void a(long j10) {
        this.f17955c = j10;
        if (this.f17954b) {
            this.f17956d = this.f17953a.c();
        }
    }

    public void b() {
        if (this.f17954b) {
            return;
        }
        this.f17956d = this.f17953a.c();
        this.f17954b = true;
    }

    @Override // Z1.V0
    public R1.B c() {
        return this.f17957e;
    }

    @Override // Z1.V0
    public void d(R1.B b10) {
        if (this.f17954b) {
            a(H());
        }
        this.f17957e = b10;
    }

    public void e() {
        if (this.f17954b) {
            a(H());
            this.f17954b = false;
        }
    }
}

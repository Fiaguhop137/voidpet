package p359u;

/* JADX INFO: loaded from: classes.dex */
public final class y0 implements u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f54961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f54962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4223w f54963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w0 f54964d;

    public y0(int i10, int i11, InterfaceC4223w interfaceC4223w) {
        this.f54961a = i10;
        this.f54962b = i11;
        this.f54963c = interfaceC4223w;
        this.f54964d = new w0(new B(d(), c(), interfaceC4223w));
    }

    @Override // p359u.u0
    public int c() {
        return this.f54962b;
    }

    @Override // p359u.u0
    public int d() {
        return this.f54961a;
    }

    @Override // p359u.s0
    public AbstractC4218q f(long j10, AbstractC4218q abstractC4218q, AbstractC4218q abstractC4218q2, AbstractC4218q abstractC4218q3) {
        return this.f54964d.f(j10, abstractC4218q, abstractC4218q2, abstractC4218q3);
    }

    @Override // p359u.s0
    public AbstractC4218q g(long j10, AbstractC4218q abstractC4218q, AbstractC4218q abstractC4218q2, AbstractC4218q abstractC4218q3) {
        return this.f54964d.g(j10, abstractC4218q, abstractC4218q2, abstractC4218q3);
    }
}

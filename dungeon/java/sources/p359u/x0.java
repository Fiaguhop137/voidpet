package p359u;

/* JADX INFO: loaded from: classes.dex */
public final class x0 implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ w0 f54954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f54955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f54956c;

    public x0(float f10, float f11, AbstractC4218q abstractC4218q) {
        this(f10, f11, t0.b(abstractC4218q, f10, f11));
    }

    private x0(float f10, float f11, InterfaceC4219s interfaceC4219s) {
        this.f54954a = new w0(interfaceC4219s);
        this.f54955b = f10;
        this.f54956c = f11;
    }

    @Override // p359u.v0, p359u.s0
    public boolean a() {
        return this.f54954a.a();
    }

    @Override // p359u.s0
    public long b(AbstractC4218q abstractC4218q, AbstractC4218q abstractC4218q2, AbstractC4218q abstractC4218q3) {
        return this.f54954a.b(abstractC4218q, abstractC4218q2, abstractC4218q3);
    }

    @Override // p359u.s0
    public AbstractC4218q e(AbstractC4218q abstractC4218q, AbstractC4218q abstractC4218q2, AbstractC4218q abstractC4218q3) {
        return this.f54954a.e(abstractC4218q, abstractC4218q2, abstractC4218q3);
    }

    @Override // p359u.s0
    public AbstractC4218q f(long j10, AbstractC4218q abstractC4218q, AbstractC4218q abstractC4218q2, AbstractC4218q abstractC4218q3) {
        return this.f54954a.f(j10, abstractC4218q, abstractC4218q2, abstractC4218q3);
    }

    @Override // p359u.s0
    public AbstractC4218q g(long j10, AbstractC4218q abstractC4218q, AbstractC4218q abstractC4218q2, AbstractC4218q abstractC4218q3) {
        return this.f54954a.g(j10, abstractC4218q, abstractC4218q2, abstractC4218q3);
    }
}

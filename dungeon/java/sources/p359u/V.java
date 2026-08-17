package p359u;

/* JADX INFO: loaded from: classes.dex */
public final class V implements InterfaceC4205d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s0 f54826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final X f54827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f54828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f54829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AbstractC4218q f54830e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AbstractC4218q f54831f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AbstractC4218q f54832g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f54833h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AbstractC4218q f54834i;

    public V(InterfaceC4210i interfaceC4210i, X x10, Object obj, Object obj2, AbstractC4218q abstractC4218q) {
        this(interfaceC4210i.a(x10), x10, obj, obj2, abstractC4218q);
    }

    public V(s0 s0Var, X x10, Object obj, Object obj2, AbstractC4218q abstractC4218q) {
        AbstractC4218q abstractC4218qE;
        this.f54826a = s0Var;
        this.f54827b = x10;
        this.f54828c = obj2;
        this.f54829d = obj;
        this.f54830e = (AbstractC4218q) e().a().invoke(obj);
        this.f54831f = (AbstractC4218q) e().a().invoke(obj2);
        this.f54832g = (abstractC4218q == null || (abstractC4218qE = r.e(abstractC4218q)) == null) ? r.g((AbstractC4218q) e().a().invoke(obj)) : abstractC4218qE;
        this.f54833h = -1L;
    }

    private final AbstractC4218q h() {
        AbstractC4218q abstractC4218q = this.f54834i;
        if (abstractC4218q != null) {
            return abstractC4218q;
        }
        AbstractC4218q abstractC4218qE = this.f54826a.e(this.f54830e, this.f54831f, this.f54832g);
        this.f54834i = abstractC4218qE;
        return abstractC4218qE;
    }

    @Override // p359u.InterfaceC4205d
    public boolean a() {
        return this.f54826a.a();
    }

    @Override // p359u.InterfaceC4205d
    public AbstractC4218q b(long j10) {
        return !c(j10) ? this.f54826a.f(j10, this.f54830e, this.f54831f, this.f54832g) : h();
    }

    @Override // p359u.InterfaceC4205d
    public long d() {
        if (this.f54833h < 0) {
            this.f54833h = this.f54826a.b(this.f54830e, this.f54831f, this.f54832g);
        }
        return this.f54833h;
    }

    @Override // p359u.InterfaceC4205d
    public X e() {
        return this.f54827b;
    }

    @Override // p359u.InterfaceC4205d
    public Object f(long j10) {
        if (c(j10)) {
            return g();
        }
        AbstractC4218q abstractC4218qG = this.f54826a.g(j10, this.f54830e, this.f54831f, this.f54832g);
        int iB = abstractC4218qG.b();
        for (int i10 = 0; i10 < iB; i10++) {
            if (Float.isNaN(abstractC4218qG.a(i10))) {
                I.b("AnimationVector cannot contain a NaN. " + abstractC4218qG + ". Animation: " + this + ", playTimeNanos: " + j10);
            }
        }
        return e().b().invoke(abstractC4218qG);
    }

    @Override // p359u.InterfaceC4205d
    public Object g() {
        return this.f54828c;
    }

    public final Object i() {
        return this.f54829d;
    }

    public String toString() {
        return "TargetBasedAnimation: " + i() + " -> " + g() + ",initial velocity: " + this.f54832g + ", duration: " + AbstractC4207f.b(this) + " ms,animationSpec: " + this.f54826a;
    }
}

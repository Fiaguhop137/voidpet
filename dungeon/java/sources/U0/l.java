package U0;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends j {

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private int f12842y0 = 0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private int f12843z0 = 0;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private int f12831A0 = 0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    private int f12832B0 = 0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    private int f12833C0 = 0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    private int f12834D0 = 0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    private int f12835E0 = 0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    private int f12836F0 = 0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    private boolean f12837G0 = false;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    private int f12838H0 = 0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    private int f12839I0 = 0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    protected V0.b.a f12840J0 = new V0.b.a();

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    V0.b.InterfaceC0191b f12841K0 = null;

    public void K0(boolean z10) {
        int i10 = this.f12833C0;
        if (i10 > 0 || this.f12834D0 > 0) {
            if (z10) {
                this.f12835E0 = this.f12834D0;
                this.f12836F0 = i10;
            } else {
                this.f12835E0 = i10;
                this.f12836F0 = this.f12834D0;
            }
        }
    }

    public void L0() {
        for (int i10 = 0; i10 < this.f12829x0; i10++) {
            e eVar = this.f12828w0[i10];
            if (eVar != null) {
                eVar.q0(true);
            }
        }
    }

    public int M0() {
        return this.f12839I0;
    }

    public int N0() {
        return this.f12838H0;
    }

    public int O0() {
        return this.f12843z0;
    }

    public int P0() {
        return this.f12835E0;
    }

    public int Q0() {
        return this.f12836F0;
    }

    public int R0() {
        return this.f12842y0;
    }

    public abstract void S0(int i10, int i11, int i12, int i13);

    protected void T0(e eVar, e.b bVar, int i10, e.b bVar2, int i11) {
        while (this.f12841K0 == null && G() != null) {
            this.f12841K0 = ((f) G()).U0();
        }
        V0.b.a aVar = this.f12840J0;
        aVar.f13830a = bVar;
        aVar.f13831b = bVar2;
        aVar.f13832c = i10;
        aVar.f13833d = i11;
        this.f12841K0.b(eVar, aVar);
        eVar.E0(this.f12840J0.f13834e);
        eVar.h0(this.f12840J0.f13835f);
        eVar.g0(this.f12840J0.f13837h);
        eVar.b0(this.f12840J0.f13836g);
    }

    protected boolean U0() {
        e eVar = this.f12688N;
        V0.b.InterfaceC0191b interfaceC0191bU0 = eVar != null ? ((f) eVar).U0() : null;
        if (interfaceC0191bU0 == null) {
            return false;
        }
        for (int i10 = 0; i10 < this.f12829x0; i10++) {
            e eVar2 = this.f12828w0[i10];
            if (eVar2 != null && !(eVar2 instanceof h)) {
                e.b bVarS = eVar2.s(0);
                e.b bVarS2 = eVar2.s(1);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarS != bVar || eVar2.f12723l == 1 || bVarS2 != bVar || eVar2.f12725m == 1) {
                    if (bVarS == bVar) {
                        bVarS = e.b.WRAP_CONTENT;
                    }
                    if (bVarS2 == bVar) {
                        bVarS2 = e.b.WRAP_CONTENT;
                    }
                    V0.b.a aVar = this.f12840J0;
                    aVar.f13830a = bVarS;
                    aVar.f13831b = bVarS2;
                    aVar.f13832c = eVar2.P();
                    this.f12840J0.f13833d = eVar2.v();
                    interfaceC0191bU0.b(eVar2, this.f12840J0);
                    eVar2.E0(this.f12840J0.f13834e);
                    eVar2.h0(this.f12840J0.f13835f);
                    eVar2.b0(this.f12840J0.f13836g);
                }
            }
        }
        return true;
    }

    public boolean V0() {
        return this.f12837G0;
    }

    protected void W0(boolean z10) {
        this.f12837G0 = z10;
    }

    public void X0(int i10, int i11) {
        this.f12838H0 = i10;
        this.f12839I0 = i11;
    }

    public void Y0(int i10) {
        this.f12831A0 = i10;
        this.f12842y0 = i10;
        this.f12832B0 = i10;
        this.f12843z0 = i10;
        this.f12833C0 = i10;
        this.f12834D0 = i10;
    }

    public void Z0(int i10) {
        this.f12843z0 = i10;
    }

    @Override // U0.j, U0.i
    public void a(f fVar) {
        L0();
    }

    public void a1(int i10) {
        this.f12834D0 = i10;
    }

    public void b1(int i10) {
        this.f12831A0 = i10;
        this.f12835E0 = i10;
    }

    public void c1(int i10) {
        this.f12832B0 = i10;
        this.f12836F0 = i10;
    }

    public void d1(int i10) {
        this.f12833C0 = i10;
        this.f12835E0 = i10;
        this.f12836F0 = i10;
    }

    public void e1(int i10) {
        this.f12842y0 = i10;
    }
}

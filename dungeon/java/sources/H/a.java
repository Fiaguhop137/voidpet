package H;

import I.A0;
import I.InterfaceC1076t1;
import I.X1;
import I.d2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p037c0.E;
import p037c0.S;
import p037c0.Z;
import p088ef.O;

/* JADX INFO: loaded from: classes.dex */
public final class a extends m implements InterfaceC1076t1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f4009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f4010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d2 f4011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d2 f4012e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final i f4013f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final A0 f4014g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final A0 f4015h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f4016i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f4017j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Function0 f4018k;

    /* JADX INFO: renamed from: H.a$a, reason: collision with other inner class name */
    static final class C0091a extends kotlin.jvm.internal.o implements Function0 {
        C0091a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m8invoke();
            return Unit.f48228a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m8invoke() {
            a aVar = a.this;
            aVar.o(!aVar.k());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private a(boolean z10, float f10, d2 color, d2 rippleAlpha, i rippleContainer) {
        super(z10, rippleAlpha);
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(rippleAlpha, "rippleAlpha");
        Intrinsics.checkNotNullParameter(rippleContainer, "rippleContainer");
        this.f4009b = z10;
        this.f4010c = f10;
        this.f4011d = color;
        this.f4012e = rippleAlpha;
        this.f4013f = rippleContainer;
        this.f4014g = X1.d(null, null, 2, null);
        this.f4015h = X1.d(Boolean.TRUE, null, 2, null);
        this.f4016i = p019b0.k.f25826b.b();
        this.f4017j = -1;
        this.f4018k = new C0091a();
    }

    public /* synthetic */ a(boolean z10, float f10, d2 d2Var, d2 d2Var2, i iVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, f10, d2Var, d2Var2, iVar);
    }

    private final void i() {
        this.f4013f.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean k() {
        return ((Boolean) this.f4015h.getValue()).booleanValue();
    }

    private final l m() {
        return (l) this.f4014g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(boolean z10) {
        this.f4015h.setValue(Boolean.valueOf(z10));
    }

    private final void p(l lVar) {
        this.f4014g.setValue(lVar);
    }

    @Override // p395w.q
    public void a(p073e0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        this.f4016i = cVar.D();
        this.f4017j = Float.isNaN(this.f4010c) ? Od.a.c(h.a(cVar, this.f4009b, cVar.D())) : cVar.q0(this.f4010c);
        long jU = ((Z) this.f4011d.getValue()).u();
        float fD = ((f) this.f4012e.getValue()).d();
        cVar.r1();
        c(cVar, this.f4010c, jU);
        S sH = cVar.f1().H();
        k();
        l lVarM = m();
        if (lVarM != null) {
            lVarM.f(cVar.D(), this.f4017j, jU, fD);
            lVarM.draw(E.c(sH));
        }
    }

    @Override // H.m
    public void b(p431y.n interaction, O scope) {
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        Intrinsics.checkNotNullParameter(scope, "scope");
        l lVarB = this.f4013f.b(this);
        lVarB.b(interaction, this.f4009b, this.f4016i, this.f4017j, ((Z) this.f4011d.getValue()).u(), ((f) this.f4012e.getValue()).d(), this.f4018k);
        p(lVarB);
    }

    @Override // H.m
    public void d(p431y.n interaction) {
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        l lVarM = m();
        if (lVarM != null) {
            lVarM.e();
        }
    }

    @Override // I.InterfaceC1076t1
    public void g() {
    }

    @Override // I.InterfaceC1076t1
    public void j() {
        i();
    }

    @Override // I.InterfaceC1076t1
    public void l() {
        i();
    }

    public final void n() {
        p(null);
    }
}

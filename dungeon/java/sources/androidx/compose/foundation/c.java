package androidx.compose.foundation;

import O0.t;
import V.k;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p037c0.P;
import p037c0.Z;
import p037c0.k0;
import p037c0.l0;
import p037c0.t0;
import p037c0.x0;
import p324s0.AbstractC4145j0;
import p324s0.AbstractC4154t;
import p324s0.InterfaceC4143i0;
import p324s0.InterfaceC4153s;
import p324s0.y0;
import p450z0.B;

/* JADX INFO: loaded from: classes.dex */
final class c extends k.c implements InterfaceC4153s, InterfaceC4143i0, y0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f21147o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private P f21148p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f21149q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private x0 f21150r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f21151s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f21152t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f21153u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private t f21154v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private k0 f21155w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private x0 f21156x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private k0 f21157y;

    private c(long j10, P p10, float f10, x0 x0Var) {
        this.f21147o = j10;
        this.f21148p = p10;
        this.f21149q = f10;
        this.f21150r = x0Var;
        this.f21153u = p019b0.k.f25826b.a();
    }

    public /* synthetic */ c(long j10, P p10, float f10, x0 x0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, p10, f10, x0Var);
    }

    private final void X1(p073e0.c cVar) {
        p073e0.c cVar2;
        k0 k0VarZ1 = Z1(cVar);
        if (Z.m(this.f21147o, Z.f26696b.e())) {
            cVar2 = cVar;
        } else {
            cVar2 = cVar;
            l0.d(cVar2, k0VarZ1, this.f21147o, 0.0f, null, null, 0, 60, null);
        }
        P p10 = this.f21148p;
        if (p10 != null) {
            l0.b(cVar2, k0VarZ1, p10, this.f21149q, null, null, 0, 56, null);
        }
    }

    private final void Y1(p073e0.c cVar) {
        if (!Z.m(this.f21147o, Z.f26696b.e())) {
            p073e0.f.c1(cVar, this.f21147o, 0L, 0L, 0.0f, null, null, 0, 126, null);
        }
        P p10 = this.f21148p;
        if (p10 != null) {
            p073e0.f.d1(cVar, p10, 0L, 0L, this.f21149q, null, null, 0, 118, null);
        }
    }

    private final k0 Z1(p073e0.c cVar) {
        k0 k0Var;
        if (p019b0.k.f(cVar.D(), this.f21153u) && cVar.getLayoutDirection() == this.f21154v && Intrinsics.b(this.f21156x, this.f21150r)) {
            k0Var = this.f21155w;
            Intrinsics.c(k0Var);
        } else {
            AbstractC4145j0.a(this, new b(this, cVar));
            k0Var = this.f21157y;
            this.f21157y = null;
        }
        this.f21155w = k0Var;
        this.f21153u = cVar.D();
        this.f21154v = cVar.getLayoutDirection();
        this.f21156x = this.f21150r;
        Intrinsics.c(k0Var);
        return k0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a2(c cVar, p073e0.c cVar2) {
        cVar.f21157y = cVar.f21150r.a(cVar2.D(), cVar2.getLayoutDirection(), cVar2);
        return Unit.f48228a;
    }

    @Override // V.k.c
    public boolean B1() {
        return this.f21151s;
    }

    @Override // p324s0.y0
    public boolean K() {
        return this.f21152t;
    }

    public final void V(x0 x0Var) {
        this.f21150r = x0Var;
    }

    public final void b2(P p10) {
        this.f21148p = p10;
    }

    public final void c2(long j10) {
        this.f21147o = j10;
    }

    public final void d(float f10) {
        this.f21149q = f10;
    }

    @Override // p324s0.y0
    public void m0(B b10) {
    }

    @Override // p324s0.InterfaceC4143i0
    public void n0() {
        this.f21153u = p019b0.k.f25826b.a();
        this.f21154v = null;
        this.f21155w = null;
        this.f21156x = null;
        AbstractC4154t.a(this);
    }

    @Override // p324s0.InterfaceC4153s
    public void z(p073e0.c cVar) {
        if (this.f21150r == t0.a()) {
            Y1(cVar);
        } else {
            X1(cVar);
        }
        cVar.r1();
    }
}

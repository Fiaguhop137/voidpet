package androidx.compose.foundation.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p288q0.w;
import p288q0.y;
import p324s0.D;
import p324s0.G;

/* JADX INFO: loaded from: classes.dex */
final class g extends V.k.c implements D {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Function1 f21236o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f21237p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f21238q;

    public g(Function1 function1, boolean z10) {
        this.f21236o = function1;
        this.f21237p = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X1(g gVar, androidx.compose.ui.layout.p pVar, androidx.compose.ui.layout.p.a aVar) {
        long jM = ((O0.n) gVar.f21236o.invoke(aVar)).m();
        if (gVar.f21237p) {
            androidx.compose.ui.layout.p.a.Y(aVar, pVar, O0.n.g(jM), O0.n.h(jM), 0.0f, null, 12, null);
        } else {
            androidx.compose.ui.layout.p.a.a0(aVar, pVar, O0.n.g(jM), O0.n.h(jM), 0.0f, null, 12, null);
        }
        return Unit.f48228a;
    }

    @Override // V.k.c
    public boolean B1() {
        return this.f21238q;
    }

    public final void Y1(Function1 function1, boolean z10) {
        if (this.f21236o != function1 || this.f21237p != z10) {
            G.c(this);
        }
        this.f21236o = function1;
        this.f21237p = z10;
    }

    @Override // p324s0.D
    public y a(androidx.compose.ui.layout.k kVar, w wVar, long j10) {
        androidx.compose.ui.layout.p pVarD0 = wVar.d0(j10);
        return androidx.compose.ui.layout.k.s0(kVar, pVarD0.H0(), pVarD0.A0(), null, new f(this, pVarD0), 4, null);
    }
}

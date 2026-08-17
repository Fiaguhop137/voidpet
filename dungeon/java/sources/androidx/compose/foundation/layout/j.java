package androidx.compose.foundation.layout;

import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p288q0.w;
import p288q0.y;
import p324s0.D;

/* JADX INFO: loaded from: classes.dex */
final class j extends V.k.c implements D {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f21241o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f21242p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f21243q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f21244r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f21245s;

    private j(float f10, float f11, float f12, float f13, boolean z10) {
        this.f21241o = f10;
        this.f21242p = f11;
        this.f21243q = f12;
        this.f21244r = f13;
        this.f21245s = z10;
    }

    public /* synthetic */ j(float f10, float f11, float f12, float f13, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X1(j jVar, androidx.compose.ui.layout.p pVar, androidx.compose.ui.layout.p.a aVar) {
        if (jVar.f21245s) {
            androidx.compose.ui.layout.p.a.T(aVar, pVar, aVar.q0(jVar.f21241o), aVar.q0(jVar.f21242p), 0.0f, 4, null);
        } else {
            androidx.compose.ui.layout.p.a.K(aVar, pVar, aVar.q0(jVar.f21241o), aVar.q0(jVar.f21242p), 0.0f, 4, null);
        }
        return Unit.f48228a;
    }

    public final void Y1(float f10) {
        this.f21244r = f10;
    }

    public final void Z1(float f10) {
        this.f21243q = f10;
    }

    @Override // p324s0.D
    public y a(androidx.compose.ui.layout.k kVar, w wVar, long j10) {
        int iQ0 = kVar.q0(this.f21241o) + kVar.q0(this.f21243q);
        int iQ1 = kVar.q0(this.f21242p) + kVar.q0(this.f21244r);
        androidx.compose.ui.layout.p pVarD0 = wVar.d0(O0.c.i(j10, -iQ0, -iQ1));
        return androidx.compose.ui.layout.k.s0(kVar, O0.c.g(j10, pVarD0.H0() + iQ0), O0.c.f(j10, pVarD0.A0() + iQ1), null, new i(this, pVarD0), 4, null);
    }

    public final void a2(boolean z10) {
        this.f21245s = z10;
    }

    public final void b2(float f10) {
        this.f21241o = f10;
    }

    public final void c2(float f10) {
        this.f21242p = f10;
    }
}

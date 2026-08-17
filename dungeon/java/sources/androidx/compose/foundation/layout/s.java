package androidx.compose.foundation.layout;

import A.EnumC0786v;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import p288q0.w;
import p288q0.y;
import p324s0.D;

/* JADX INFO: loaded from: classes.dex */
final class s extends V.k.c implements D {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private EnumC0786v f21278o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f21279p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Function2 f21280q;

    public s(EnumC0786v enumC0786v, boolean z10, Function2 function2) {
        this.f21278o = enumC0786v;
        this.f21279p = z10;
        this.f21280q = function2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X1(s sVar, int i10, androidx.compose.ui.layout.p pVar, int i11, androidx.compose.ui.layout.k kVar, androidx.compose.ui.layout.p.a aVar) {
        androidx.compose.ui.layout.p.a.O(aVar, pVar, ((O0.n) sVar.f21280q.invoke(O0.r.b(O0.r.c((((long) (i10 - pVar.H0())) << 32) | (((long) (i11 - pVar.A0())) & 4294967295L))), kVar.getLayoutDirection())).m(), 0.0f, 2, null);
        return Unit.f48228a;
    }

    public final void Y1(Function2 function2) {
        this.f21280q = function2;
    }

    public final void Z1(EnumC0786v enumC0786v) {
        this.f21278o = enumC0786v;
    }

    @Override // p324s0.D
    public y a(androidx.compose.ui.layout.k kVar, w wVar, long j10) {
        EnumC0786v enumC0786v = this.f21278o;
        EnumC0786v enumC0786v2 = EnumC0786v.Vertical;
        int iN = enumC0786v != enumC0786v2 ? 0 : O0.b.n(j10);
        EnumC0786v enumC0786v3 = this.f21278o;
        EnumC0786v enumC0786v4 = EnumC0786v.Horizontal;
        androidx.compose.ui.layout.p pVarD0 = wVar.d0(O0.c.a(iN, (this.f21278o == enumC0786v2 || !this.f21279p) ? O0.b.l(j10) : Integer.MAX_VALUE, enumC0786v3 == enumC0786v4 ? O0.b.m(j10) : 0, (this.f21278o == enumC0786v4 || !this.f21279p) ? O0.b.k(j10) : Integer.MAX_VALUE));
        int iM = kotlin.ranges.e.m(pVarD0.H0(), O0.b.n(j10), O0.b.l(j10));
        int iM2 = kotlin.ranges.e.m(pVarD0.A0(), O0.b.m(j10), O0.b.k(j10));
        return androidx.compose.ui.layout.k.s0(kVar, iM, iM2, null, new r(this, iM, pVarD0, iM2, kVar), 4, null);
    }

    public final void a2(boolean z10) {
        this.f21279p = z10;
    }
}

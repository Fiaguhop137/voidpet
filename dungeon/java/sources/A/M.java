package A;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class M implements p288q0.x, H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0767b.d f21a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V.d.c f22b;

    public M(C0767b.d dVar, V.d.c cVar) {
        this.f21a = dVar;
        this.f22b = cVar;
    }

    private final int h(androidx.compose.ui.layout.p pVar, J j10, int i10, int i11) {
        AbstractC0785u abstractC0785uA = j10 != null ? j10.a() : null;
        return abstractC0785uA != null ? abstractC0785uA.a(i10 - pVar.A0(), O0.t.Ltr, pVar, i11) : this.f22b.a(0, i10 - pVar.A0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(androidx.compose.ui.layout.p[] pVarArr, M m10, int i10, int i11, int[] iArr, androidx.compose.ui.layout.p.a aVar) {
        int length = pVarArr.length;
        int i12 = 0;
        int i13 = 0;
        while (i12 < length) {
            androidx.compose.ui.layout.p pVar = pVarArr[i12];
            Intrinsics.c(pVar);
            androidx.compose.ui.layout.p.a.K(aVar, pVar, iArr[i13], m10.h(pVar, G.c(pVar), i10, i11), 0.0f, 4, null);
            i12++;
            i13++;
        }
        return Unit.f48228a;
    }

    @Override // A.H
    public long a(int i10, int i11, int i12, int i13, boolean z10) {
        return K.a(z10, i10, i11, i12, i13);
    }

    @Override // A.H
    public void b(int i10, int[] iArr, int[] iArr2, androidx.compose.ui.layout.k kVar) {
        this.f21a.c(kVar, i10, iArr, kVar.getLayoutDirection(), iArr2);
    }

    @Override // A.H
    public p288q0.y d(androidx.compose.ui.layout.p[] pVarArr, androidx.compose.ui.layout.k kVar, int i10, int[] iArr, int i11, int i12, int[] iArr2, int i13, int i14, int i15) {
        return androidx.compose.ui.layout.k.s0(kVar, i11, i12, null, new L(pVarArr, this, i12, i10, iArr), 4, null);
    }

    @Override // A.H
    public int e(androidx.compose.ui.layout.p pVar) {
        return pVar.H0();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m10 = (M) obj;
        return Intrinsics.b(this.f21a, m10.f21a) && Intrinsics.b(this.f22b, m10.f22b);
    }

    @Override // A.H
    public int f(androidx.compose.ui.layout.p pVar) {
        return pVar.A0();
    }

    public int hashCode() {
        return (this.f21a.hashCode() * 31) + this.f22b.hashCode();
    }

    @Override // p288q0.x
    public int maxIntrinsicHeight(p288q0.j jVar, List list, int i10) {
        return y.f105a.a(list, i10, jVar.q0(this.f21a.a()));
    }

    @Override // p288q0.x
    public int maxIntrinsicWidth(p288q0.j jVar, List list, int i10) {
        return y.f105a.b(list, i10, jVar.q0(this.f21a.a()));
    }

    @Override // p288q0.x
    /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
    public p288q0.y mo0measure3p2s80s(androidx.compose.ui.layout.k kVar, List list, long j10) {
        return I.a(this, O0.b.n(j10), O0.b.m(j10), O0.b.l(j10), O0.b.k(j10), kVar.q0(this.f21a.a()), kVar, list, new androidx.compose.ui.layout.p[list.size()], 0, list.size(), (3072 & 1024) != 0 ? null : null, (3072 & 2048) != 0 ? 0 : 0);
    }

    @Override // p288q0.x
    public int minIntrinsicHeight(p288q0.j jVar, List list, int i10) {
        return y.f105a.c(list, i10, jVar.q0(this.f21a.a()));
    }

    @Override // p288q0.x
    public int minIntrinsicWidth(p288q0.j jVar, List list, int i10) {
        return y.f105a.d(list, i10, jVar.q0(this.f21a.a()));
    }

    public String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.f21a + ", verticalAlignment=" + this.f22b + ')';
    }
}

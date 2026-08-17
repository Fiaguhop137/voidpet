package A;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class r implements p288q0.x, H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0767b.k f88a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V.d.b f89b;

    public r(C0767b.k kVar, V.d.b bVar) {
        this.f88a = kVar;
        this.f89b = bVar;
    }

    private final int h(androidx.compose.ui.layout.p pVar, J j10, int i10, int i11, O0.t tVar) {
        AbstractC0785u abstractC0785uA = j10 != null ? j10.a() : null;
        return abstractC0785uA != null ? abstractC0785uA.a(i10 - pVar.H0(), tVar, pVar, i11) : this.f89b.a(0, i10 - pVar.H0(), tVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(androidx.compose.ui.layout.p[] pVarArr, r rVar, int i10, int i11, androidx.compose.ui.layout.k kVar, int[] iArr, androidx.compose.ui.layout.p.a aVar) {
        int length = pVarArr.length;
        int i12 = 0;
        int i13 = 0;
        while (i12 < length) {
            androidx.compose.ui.layout.p pVar = pVarArr[i12];
            Intrinsics.c(pVar);
            androidx.compose.ui.layout.p.a.K(aVar, pVar, rVar.h(pVar, G.c(pVar), i10, i11, kVar.getLayoutDirection()), iArr[i13], 0.0f, 4, null);
            i12++;
            i13++;
        }
        return Unit.f48228a;
    }

    @Override // A.H
    public long a(int i10, int i11, int i12, int i13, boolean z10) {
        return AbstractC0781p.b(z10, i10, i11, i12, i13);
    }

    @Override // A.H
    public void b(int i10, int[] iArr, int[] iArr2, androidx.compose.ui.layout.k kVar) {
        this.f88a.b(kVar, i10, iArr, iArr2);
    }

    @Override // A.H
    public p288q0.y d(androidx.compose.ui.layout.p[] pVarArr, androidx.compose.ui.layout.k kVar, int i10, int[] iArr, int i11, int i12, int[] iArr2, int i13, int i14, int i15) {
        return androidx.compose.ui.layout.k.s0(kVar, i12, i11, null, new C0782q(pVarArr, this, i12, i10, kVar, iArr), 4, null);
    }

    @Override // A.H
    public int e(androidx.compose.ui.layout.p pVar) {
        return pVar.A0();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.b(this.f88a, rVar.f88a) && Intrinsics.b(this.f89b, rVar.f89b);
    }

    @Override // A.H
    public int f(androidx.compose.ui.layout.p pVar) {
        return pVar.H0();
    }

    public int hashCode() {
        return (this.f88a.hashCode() * 31) + this.f89b.hashCode();
    }

    @Override // p288q0.x
    public int maxIntrinsicHeight(p288q0.j jVar, List list, int i10) {
        return y.f105a.e(list, i10, jVar.q0(this.f88a.a()));
    }

    @Override // p288q0.x
    public int maxIntrinsicWidth(p288q0.j jVar, List list, int i10) {
        return y.f105a.f(list, i10, jVar.q0(this.f88a.a()));
    }

    @Override // p288q0.x
    /* JADX INFO: renamed from: measure-3p2s80s */
    public p288q0.y mo0measure3p2s80s(androidx.compose.ui.layout.k kVar, List list, long j10) {
        return I.a(this, O0.b.m(j10), O0.b.n(j10), O0.b.k(j10), O0.b.l(j10), kVar.q0(this.f88a.a()), kVar, list, new androidx.compose.ui.layout.p[list.size()], 0, list.size(), (3072 & 1024) != 0 ? null : null, (3072 & 2048) != 0 ? 0 : 0);
    }

    @Override // p288q0.x
    public int minIntrinsicHeight(p288q0.j jVar, List list, int i10) {
        return y.f105a.g(list, i10, jVar.q0(this.f88a.a()));
    }

    @Override // p288q0.x
    public int minIntrinsicWidth(p288q0.j jVar, List list, int i10) {
        return y.f105a.h(list, i10, jVar.q0(this.f88a.a()));
    }

    public String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.f88a + ", horizontalAlignment=" + this.f89b + ')';
    }
}

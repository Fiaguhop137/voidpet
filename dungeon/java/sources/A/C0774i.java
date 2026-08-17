package A;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: A.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0774i implements p288q0.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V.d f65a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f66b;

    public C0774i(V.d dVar, boolean z10) {
        this.f65a = dVar;
        this.f66b = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(androidx.compose.ui.layout.p.a aVar) {
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(androidx.compose.ui.layout.p pVar, p288q0.w wVar, androidx.compose.ui.layout.k kVar, int i10, int i11, C0774i c0774i, androidx.compose.ui.layout.p.a aVar) {
        AbstractC0770e.g(aVar, pVar, wVar, kVar.getLayoutDirection(), i10, i11, c0774i.f65a);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(androidx.compose.ui.layout.p[] pVarArr, List list, androidx.compose.ui.layout.k kVar, kotlin.jvm.internal.C c10, kotlin.jvm.internal.C c11, C0774i c0774i, androidx.compose.ui.layout.p.a aVar) {
        int length = pVarArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            androidx.compose.ui.layout.p pVar = pVarArr[i10];
            Intrinsics.d(pVar, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
            AbstractC0770e.g(aVar, pVar, (p288q0.w) list.get(i11), kVar.getLayoutDirection(), c10.f48336a, c11.f48336a, c0774i.f65a);
            i10++;
            i11++;
        }
        return Unit.f48228a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0774i)) {
            return false;
        }
        C0774i c0774i = (C0774i) obj;
        return Intrinsics.b(this.f65a, c0774i.f65a) && this.f66b == c0774i.f66b;
    }

    public int hashCode() {
        return (this.f65a.hashCode() * 31) + Boolean.hashCode(this.f66b);
    }

    @Override // p288q0.x
    /* JADX INFO: renamed from: measure-3p2s80s */
    public p288q0.y mo0measure3p2s80s(androidx.compose.ui.layout.k kVar, List list, long j10) {
        int iM;
        int i10;
        androidx.compose.ui.layout.p pVarD0;
        if (list.isEmpty()) {
            return androidx.compose.ui.layout.k.s0(kVar, O0.b.n(j10), O0.b.m(j10), null, new C0771f(), 4, null);
        }
        long jB = this.f66b ? j10 : O0.b.b((-8589934589L) & j10);
        if (list.size() == 1) {
            p288q0.w wVar = (p288q0.w) list.get(0);
            if (AbstractC0770e.e(wVar)) {
                int iN = O0.b.n(j10);
                iM = O0.b.m(j10);
                i10 = iN;
                pVarD0 = wVar.d0(O0.b.f8260b.c(O0.b.n(j10), O0.b.m(j10)));
            } else {
                androidx.compose.ui.layout.p pVarD1 = wVar.d0(jB);
                int iMax = Math.max(O0.b.n(j10), pVarD1.H0());
                iM = Math.max(O0.b.m(j10), pVarD1.A0());
                i10 = iMax;
                pVarD0 = pVarD1;
            }
            int i11 = iM;
            return androidx.compose.ui.layout.k.s0(kVar, i10, i11, null, new C0772g(pVarD0, wVar, kVar, i10, i11, this), 4, null);
        }
        androidx.compose.ui.layout.p[] pVarArr = new androidx.compose.ui.layout.p[list.size()];
        kotlin.jvm.internal.C c10 = new kotlin.jvm.internal.C();
        c10.f48336a = O0.b.n(j10);
        kotlin.jvm.internal.C c11 = new kotlin.jvm.internal.C();
        c11.f48336a = O0.b.m(j10);
        int size = list.size();
        boolean z10 = false;
        for (int i12 = 0; i12 < size; i12++) {
            p288q0.w wVar2 = (p288q0.w) list.get(i12);
            if (AbstractC0770e.e(wVar2)) {
                z10 = true;
            } else {
                androidx.compose.ui.layout.p pVarD2 = wVar2.d0(jB);
                pVarArr[i12] = pVarD2;
                c10.f48336a = Math.max(c10.f48336a, pVarD2.H0());
                c11.f48336a = Math.max(c11.f48336a, pVarD2.A0());
            }
        }
        if (z10) {
            int i13 = c10.f48336a;
            int i14 = i13 != Integer.MAX_VALUE ? i13 : 0;
            int i15 = c11.f48336a;
            long jA = O0.c.a(i14, i13, i15 != Integer.MAX_VALUE ? i15 : 0, i15);
            int size2 = list.size();
            for (int i16 = 0; i16 < size2; i16++) {
                p288q0.w wVar3 = (p288q0.w) list.get(i16);
                if (AbstractC0770e.e(wVar3)) {
                    pVarArr[i16] = wVar3.d0(jA);
                }
            }
        }
        return androidx.compose.ui.layout.k.s0(kVar, c10.f48336a, c11.f48336a, null, new C0773h(pVarArr, list, kVar, c10, c11, this), 4, null);
    }

    public String toString() {
        return "BoxMeasurePolicy(alignment=" + this.f65a + ", propagateMinConstraints=" + this.f66b + ')';
    }
}

package Za;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f18851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f18852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f18853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f18854d;

    public c(d loadings, n nVar, a aVar, b bVar, List operationHistory) {
        Intrinsics.checkNotNullParameter(loadings, "loadings");
        Intrinsics.checkNotNullParameter(operationHistory, "operationHistory");
        this.f18851a = loadings;
        this.f18852b = nVar;
        this.f18853c = aVar;
        this.f18854d = operationHistory;
    }

    public /* synthetic */ c(d dVar, n nVar, a aVar, b bVar, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new d(false, false, false, null, 15, null) : dVar, (i10 & 2) != 0 ? null : nVar, (i10 & 4) != 0 ? null : aVar, (i10 & 8) != 0 ? null : bVar, (i10 & 16) != 0 ? CollectionsKt.l() : list);
    }

    public static /* synthetic */ c b(c cVar, d dVar, n nVar, a aVar, b bVar, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dVar = cVar.f18851a;
        }
        if ((i10 & 2) != 0) {
            nVar = cVar.f18852b;
        }
        if ((i10 & 4) != 0) {
            aVar = cVar.f18853c;
        }
        if ((i10 & 8) != 0) {
            cVar.getClass();
            bVar = null;
        }
        if ((i10 & 16) != 0) {
            list = cVar.f18854d;
        }
        List list2 = list;
        a aVar2 = aVar;
        return cVar.a(dVar, nVar, aVar2, bVar, list2);
    }

    public final c a(d loadings, n nVar, a aVar, b bVar, List operationHistory) {
        Intrinsics.checkNotNullParameter(loadings, "loadings");
        Intrinsics.checkNotNullParameter(operationHistory, "operationHistory");
        return new c(loadings, nVar, aVar, bVar, operationHistory);
    }

    public final d c() {
        return this.f18851a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.b(this.f18851a, cVar.f18851a) && Intrinsics.b(this.f18852b, cVar.f18852b) && Intrinsics.b(this.f18853c, cVar.f18853c) && Intrinsics.b(null, null) && Intrinsics.b(this.f18854d, cVar.f18854d);
    }

    public int hashCode() {
        int iHashCode = this.f18851a.hashCode() * 31;
        n nVar = this.f18852b;
        int iHashCode2 = (iHashCode + (nVar == null ? 0 : nVar.hashCode())) * 31;
        a aVar = this.f18853c;
        return ((iHashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 961) + this.f18854d.hashCode();
    }

    public String toString() {
        return "IapStatus(loadings=" + this.f18851a + ", lastPurchaseResult=" + this.f18852b + ", lastError=" + this.f18853c + ", currentOperation=" + ((Object) null) + ", operationHistory=" + this.f18854d + ")";
    }
}

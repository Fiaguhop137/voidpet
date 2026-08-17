package p247nd;

import kotlin.jvm.internal.Intrinsics;
import p283pd.n;

/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f50134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t.b f50135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t.a f50136c;

    public s(n nVar, t.b bVar, t.a aVar) {
        this.f50134a = nVar;
        this.f50135b = bVar;
        this.f50136c = aVar;
    }

    public final t.a a() {
        return this.f50136c;
    }

    public final t.b b() {
        return this.f50135b;
    }

    public final n c() {
        return this.f50134a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.b(this.f50134a, sVar.f50134a) && Intrinsics.b(this.f50135b, sVar.f50135b) && Intrinsics.b(this.f50136c, sVar.f50136c);
    }

    public int hashCode() {
        n nVar = this.f50134a;
        int iHashCode = (nVar == null ? 0 : nVar.hashCode()) * 31;
        t.b bVar = this.f50135b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        t.a aVar = this.f50136c;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "UpdateResponse(responseHeaderData=" + this.f50134a + ", manifestUpdateResponsePart=" + this.f50135b + ", directiveUpdateResponsePart=" + this.f50136c + ")";
    }
}

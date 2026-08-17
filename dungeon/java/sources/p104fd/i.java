package p104fd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f41868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f41869b;

    public i(j validationResult, g gVar) {
        Intrinsics.checkNotNullParameter(validationResult, "validationResult");
        this.f41868a = validationResult;
        this.f41869b = gVar;
    }

    public final g a() {
        return this.f41869b;
    }

    public final j b() {
        return this.f41868a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f41868a == iVar.f41868a && Intrinsics.b(this.f41869b, iVar.f41869b);
    }

    public int hashCode() {
        int iHashCode = this.f41868a.hashCode() * 31;
        g gVar = this.f41869b;
        return iHashCode + (gVar == null ? 0 : gVar.hashCode());
    }

    public String toString() {
        return "SignatureValidationResult(validationResult=" + this.f41868a + ", expoProjectInformation=" + this.f41869b + ")";
    }
}

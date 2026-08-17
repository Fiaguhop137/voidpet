package p104fd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f41862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f41863b;

    public g(String projectId, String scopeKey) {
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        Intrinsics.checkNotNullParameter(scopeKey, "scopeKey");
        this.f41862a = projectId;
        this.f41863b = scopeKey;
    }

    public final String a() {
        return this.f41862a;
    }

    public final String b() {
        return this.f41863b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.b(this.f41862a, gVar.f41862a) && Intrinsics.b(this.f41863b, gVar.f41863b);
    }

    public int hashCode() {
        return (this.f41862a.hashCode() * 31) + this.f41863b.hashCode();
    }

    public String toString() {
        return "ExpoProjectInformation(projectId=" + this.f41862a + ", scopeKey=" + this.f41863b + ")";
    }
}

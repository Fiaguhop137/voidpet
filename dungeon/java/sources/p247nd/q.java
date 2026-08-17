package p247nd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f50129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f50130b;

    public q(String easProjectId, String scopeKey) {
        Intrinsics.checkNotNullParameter(easProjectId, "easProjectId");
        Intrinsics.checkNotNullParameter(scopeKey, "scopeKey");
        this.f50129a = easProjectId;
        this.f50130b = scopeKey;
    }

    public final String a() {
        return this.f50129a;
    }

    public final String b() {
        return this.f50130b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.b(this.f50129a, qVar.f50129a) && Intrinsics.b(this.f50130b, qVar.f50130b);
    }

    public int hashCode() {
        return (this.f50129a.hashCode() * 31) + this.f50130b.hashCode();
    }

    public String toString() {
        return "SigningInfo(easProjectId=" + this.f50129a + ", scopeKey=" + this.f50130b + ")";
    }
}

package p283pd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f50955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f50956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f50957c;

    public p(n responseHeaderData, o responsePartHeaderData, String body) {
        Intrinsics.checkNotNullParameter(responseHeaderData, "responseHeaderData");
        Intrinsics.checkNotNullParameter(responsePartHeaderData, "responsePartHeaderData");
        Intrinsics.checkNotNullParameter(body, "body");
        this.f50955a = responseHeaderData;
        this.f50956b = responsePartHeaderData;
        this.f50957c = body;
    }

    public final String a() {
        return this.f50957c;
    }

    public final n b() {
        return this.f50955a;
    }

    public final o c() {
        return this.f50956b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.b(this.f50955a, pVar.f50955a) && Intrinsics.b(this.f50956b, pVar.f50956b) && Intrinsics.b(this.f50957c, pVar.f50957c);
    }

    public int hashCode() {
        return (((this.f50955a.hashCode() * 31) + this.f50956b.hashCode()) * 31) + this.f50957c.hashCode();
    }

    public String toString() {
        return "ResponsePartInfo(responseHeaderData=" + this.f50955a + ", responsePartHeaderData=" + this.f50956b + ", body=" + this.f50957c + ")";
    }
}

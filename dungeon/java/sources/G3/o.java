package G3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f3920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f3921c;

    public o(String str, String str2, n nVar, p pVar) {
        this.f3919a = str;
        this.f3920b = str2;
        this.f3921c = nVar;
    }

    public final p a() {
        return null;
    }

    public final n b() {
        return this.f3921c;
    }

    public final String c() {
        return this.f3920b;
    }

    public final String d() {
        return this.f3919a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.b(this.f3919a, oVar.f3919a) && Intrinsics.b(this.f3920b, oVar.f3920b) && Intrinsics.b(this.f3921c, oVar.f3921c) && Intrinsics.b(null, null);
    }

    public int hashCode() {
        return ((((this.f3919a.hashCode() * 31) + this.f3920b.hashCode()) * 31) + this.f3921c.hashCode()) * 31;
    }

    public String toString() {
        return "NetworkRequest(url=" + this.f3919a + ", method=" + this.f3920b + ", headers=" + this.f3921c + ", body=" + ((Object) null) + ')';
    }
}

package p083ea;

/* JADX INFO: loaded from: classes2.dex */
final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f40714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f40715b;

    a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f40714a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f40715b = str2;
    }

    @Override // p083ea.f
    public String b() {
        return this.f40714a;
    }

    @Override // p083ea.f
    public String c() {
        return this.f40715b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f40714a.equals(fVar.b()) && this.f40715b.equals(fVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f40714a.hashCode() ^ 1000003) * 1000003) ^ this.f40715b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f40714a + ", version=" + this.f40715b + "}";
    }
}

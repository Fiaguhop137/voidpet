package O8;

/* JADX INFO: loaded from: classes2.dex */
final class E extends H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f8466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8467c;

    /* synthetic */ E(String str, boolean z10, int i10, D d10) {
        this.f8465a = str;
        this.f8466b = z10;
        this.f8467c = i10;
    }

    @Override // O8.H
    public final int a() {
        return this.f8467c;
    }

    @Override // O8.H
    public final String b() {
        return this.f8465a;
    }

    @Override // O8.H
    public final boolean c() {
        return this.f8466b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof H) {
            H h10 = (H) obj;
            if (this.f8465a.equals(h10.b()) && this.f8466b == h10.c() && this.f8467c == h10.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f8465a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f8466b ? 1237 : 1231)) * 1000003) ^ this.f8467c;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.f8465a + ", enableFirelog=" + this.f8466b + ", firelogEventType=" + this.f8467c + "}";
    }
}

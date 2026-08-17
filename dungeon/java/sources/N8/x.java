package N8;

/* JADX INFO: loaded from: classes2.dex */
final class x extends B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f8042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8043c;

    /* synthetic */ x(String str, boolean z10, int i10, w wVar) {
        this.f8041a = str;
        this.f8042b = z10;
        this.f8043c = i10;
    }

    @Override // N8.B
    public final int a() {
        return this.f8043c;
    }

    @Override // N8.B
    public final String b() {
        return this.f8041a;
    }

    @Override // N8.B
    public final boolean c() {
        return this.f8042b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof B) {
            B b10 = (B) obj;
            if (this.f8041a.equals(b10.b()) && this.f8042b == b10.c() && this.f8043c == b10.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f8041a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f8042b ? 1237 : 1231)) * 1000003) ^ this.f8043c;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.f8041a + ", enableFirelog=" + this.f8042b + ", firelogEventType=" + this.f8043c + "}";
    }
}

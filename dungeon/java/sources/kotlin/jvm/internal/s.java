package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements InterfaceC3968e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f48367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f48368b;

    public s(Class jClass, String moduleName) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        this.f48367a = jClass;
        this.f48368b = moduleName;
    }

    @Override // kotlin.jvm.internal.InterfaceC3968e
    public Class c() {
        return this.f48367a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof s) && Intrinsics.b(c(), ((s) obj).c());
    }

    public int hashCode() {
        return c().hashCode();
    }

    public String toString() {
        return c() + " (Kotlin reflection is not available)";
    }
}

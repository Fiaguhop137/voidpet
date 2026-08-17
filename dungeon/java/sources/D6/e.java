package D6;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f2221a = new e();

    private e() {
    }

    public static final boolean a() {
        if (!p384v6.a.f56281f) {
            return b.f();
        }
        p240n6.a.b(b.f(), "ReactNativeFeatureFlags.enableBridgelessArchitecture() should be set to TRUE when Strict Mode is enabled");
        return true;
    }

    public static final boolean b() {
        if (!p384v6.a.f56281f) {
            return b.j();
        }
        p240n6.a.b(b.j(), "ReactNativeFeatureFlags.enableFabricRenderer() should be set to TRUE when Strict Mode is enabled");
        return true;
    }

    public static final boolean c() {
        if (!p384v6.a.f56281f) {
            return b.t();
        }
        p240n6.a.b(!b.t(), "ReactNativeFeatureFlags.useFabricInterop() should be set to FALSE when Strict Mode is enabled");
        return false;
    }

    public static final boolean d() {
        if (!p384v6.a.f56281f) {
            return b.y();
        }
        p240n6.a.b(!b.y(), "ReactNativeFeatureFlags.useTurboModuleInterop() should be set to FALSE when Strict Mode is enabled");
        return false;
    }

    public static final boolean e() {
        if (!p384v6.a.f56281f) {
            return b.z();
        }
        p240n6.a.b(b.z(), "ReactNativeFeatureFlags.useTurboModules() should be set to TRUE when Strict Mode is enabled");
        return true;
    }
}

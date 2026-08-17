package Ta;

import com.facebook.react.views.view.WindowUtilKt;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f12380a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f12381b;

    static {
        boolean z10;
        if (!WindowUtilKt.isEdgeToEdgeFeatureFlagOn()) {
            try {
                Class.forName("com.zoontek.rnedgetoedge.EdgeToEdgePackage");
            } catch (ClassNotFoundException unused) {
                z10 = false;
            }
        }
        z10 = true;
        f12381b = z10;
    }

    private b() {
    }

    public final boolean a() {
        return f12381b;
    }
}

package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final P1.e f24315a = new P1.e();

    public final void a(String key, AutoCloseable closeable) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        P1.e eVar = this.f24315a;
        if (eVar != null) {
            eVar.d(key, closeable);
        }
    }

    public final void b() {
        P1.e eVar = this.f24315a;
        if (eVar != null) {
            eVar.e();
        }
        d();
    }

    public final AutoCloseable c(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        P1.e eVar = this.f24315a;
        if (eVar != null) {
            return eVar.g(key);
        }
        return null;
    }

    protected void d() {
    }
}

package Y0;

import android.content.res.Configuration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f16778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Configuration f16779b;

    public t(boolean z10) {
        this.f16778a = z10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(boolean z10, Configuration newConfig) {
        this(z10);
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.f16779b = newConfig;
    }

    public final boolean a() {
        return this.f16778a;
    }
}

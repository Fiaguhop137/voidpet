package p410we;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {
    public static final boolean a(a version) {
        Intrinsics.checkNotNullParameter(version, "version");
        return (version.a() == 1 && version.b() >= 4) || version.a() > 1;
    }

    public static final boolean b(a version) {
        Intrinsics.checkNotNullParameter(version, "version");
        return a(version);
    }
}

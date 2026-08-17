package p263ob;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f50512a = new b();

    private b() {
    }

    public final a a(String category) {
        Intrinsics.checkNotNullParameter(category, "category");
        return new g(category);
    }

    public final a b(File filesDirectory, String category) {
        Intrinsics.checkNotNullParameter(filesDirectory, "filesDirectory");
        Intrinsics.checkNotNullParameter(category, "category");
        return new m(category, filesDirectory);
    }
}

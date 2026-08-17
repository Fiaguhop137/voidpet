package kotlin.io;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public class n extends m {
    public static i p(File file, FileWalkDirection direction) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(direction, "direction");
        return new i(file, direction);
    }

    public static final i q(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return p(file, FileWalkDirection.BOTTOM_UP);
    }

    public static final i r(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return p(file, FileWalkDirection.TOP_DOWN);
    }
}

package p433y1;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import p361u1.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final File a(Context context, String name) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        return a.a(context, name + ".preferences_pb");
    }
}

package Bb;

import Ad.v;
import java.util.Map;
import kotlin.collections.N;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f646a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f647b = N.l(v.a("success", new g(new long[]{0, 40, 100, 40}, new int[]{0, 50, 0, 60}, new long[]{0, 40, 100, 40})), v.a("warning", new g(new long[]{0, 40, 120, 60}, new int[]{0, 40, 0, 60}, new long[]{0, 40, 120, 60})), v.a("error", new g(new long[]{0, 60, 100, 40, 80, 50}, new int[]{0, 50, 0, 40, 0, 50}, new long[]{0, 60, 100, 40, 80, 50})));

    private e() {
    }

    public final g a(String type) throws c {
        Intrinsics.checkNotNullParameter(type, "type");
        Object obj = f647b.get(type);
        if (obj != null) {
            return (g) obj;
        }
        throw new c("'type' must be one of ['success', 'warning', 'error']. Obtained '" + type + "'.");
    }
}

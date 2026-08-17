package Bb;

import Ad.v;
import java.util.Map;
import kotlin.collections.N;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f644a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f645b = N.l(v.a("light", new g(new long[]{0, 50}, new int[]{0, 30}, new long[]{0, 20})), v.a("soft", new g(new long[]{0, 50}, new int[]{0, 30}, new long[]{0, 20})), v.a("medium", new g(new long[]{0, 43}, new int[]{0, 50}, new long[]{0, 43})), v.a("rigid", new g(new long[]{0, 43}, new int[]{0, 50}, new long[]{0, 43})), v.a("heavy", new g(new long[]{0, 60}, new int[]{0, 70}, new long[]{0, 61})));

    private b() {
    }

    public final g a(String style) throws c {
        Intrinsics.checkNotNullParameter(style, "style");
        Object obj = f645b.get(style);
        if (obj != null) {
            return (g) obj;
        }
        throw new c("'style' must be one of ['light', 'medium', 'heavy', 'rigid', 'soft']. Obtained " + style + "'.");
    }
}

package kotlin.collections;

import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public class X {
    public static Set a(Set builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return ((Bd.h) builder).c();
    }

    public static Set b() {
        return new Bd.h();
    }

    public static Set c(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        Intrinsics.checkNotNullExpressionValue(setSingleton, "singleton(...)");
        return setSingleton;
    }
}

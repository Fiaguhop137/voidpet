package O1;

import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final Q a(S.c factory, kotlin.reflect.d modelClass, a extras) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        try {
            try {
                return factory.b(modelClass, extras);
            } catch (AbstractMethodError unused) {
                return factory.a(Ld.a.b(modelClass));
            }
        } catch (AbstractMethodError unused2) {
            return factory.c(Ld.a.b(modelClass), extras);
        }
    }
}

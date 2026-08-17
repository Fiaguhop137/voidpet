package Ad;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r {
    public static final Object a(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        return new q.b(exception);
    }

    public static final void b(Object obj) {
        if (obj instanceof q.b) {
            throw ((q.b) obj).f329a;
        }
    }
}

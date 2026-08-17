package Ed;

import Ad.q;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static final b a(Function2 function2, Object obj, b completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        return new e(Fd.b.c(Fd.b.a(function2, obj, completion)), Fd.b.e());
    }

    public static final void b(Function2 function2, Object obj, b completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        Fd.b.c(Fd.b.a(function2, obj, completion)).resumeWith(q.b(Unit.f48228a));
    }
}

package p067dc;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f39902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Function0 f39903b;

    public c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f39902a = name;
    }

    public final b a() {
        String str = this.f39902a;
        Function0 function0 = this.f39903b;
        if (function0 != null) {
            return new b(str, function0);
        }
        throw new IllegalArgumentException(("The constant '" + str + "' doesn't have getter.").toString());
    }

    public final void b(Function0 function0) {
        this.f39903b = function0;
    }
}

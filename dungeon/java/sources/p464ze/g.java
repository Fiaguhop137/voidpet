package p464ze;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f58576a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Regex f58577b = new Regex("[^\\p{L}\\p{Digit}]");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f58578c = "$context_receiver";

    private g() {
    }

    public static final f a(int i10) {
        f fVarP = f.p(f58578c + '_' + i10);
        Intrinsics.checkNotNullExpressionValue(fVarP, "identifier(...)");
        return fVarP;
    }

    public static final String b(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return f58577b.replace(name, "_");
    }
}

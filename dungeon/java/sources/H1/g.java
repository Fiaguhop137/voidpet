package H1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.fragment.app.i f4137a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(androidx.fragment.app.i fragment, String str) {
        super(str);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f4137a = fragment;
    }

    public final androidx.fragment.app.i a() {
        return this.f4137a;
    }
}

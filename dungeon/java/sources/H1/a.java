package H1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f4117b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(androidx.fragment.app.i fragment, String previousFragmentId) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + previousFragmentId);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(previousFragmentId, "previousFragmentId");
        this.f4117b = previousFragmentId;
    }
}

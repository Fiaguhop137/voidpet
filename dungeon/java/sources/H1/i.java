package H1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class i extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.fragment.app.i f4139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f4140c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(androidx.fragment.app.i fragment, androidx.fragment.app.i expectedParentFragment, int i10) {
        super(fragment, "Attempting to nest fragment " + fragment + " within the view of parent fragment " + expectedParentFragment + " via container with ID " + i10 + " without using parent's childFragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(expectedParentFragment, "expectedParentFragment");
        this.f4139b = expectedParentFragment;
        this.f4140c = i10;
    }
}

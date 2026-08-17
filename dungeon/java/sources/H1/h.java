package H1;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class h extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ViewGroup f4138b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(androidx.fragment.app.i fragment, ViewGroup container) {
        super(fragment, "Attempting to add fragment " + fragment + " to container " + container + " which is not a FragmentContainerView");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(container, "container");
        this.f4138b = container;
    }
}

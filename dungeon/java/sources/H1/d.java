package H1;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ViewGroup f4136b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(androidx.fragment.app.i fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f4136b = viewGroup;
    }
}

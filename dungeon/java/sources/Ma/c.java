package Ma;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {
    public static final ViewGroup a(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            return (ViewGroup) parent;
        }
        return null;
    }

    public static final View b(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup viewGroupA = a(view);
        if (viewGroupA != null) {
            viewGroupA.endViewTransition(view);
            viewGroupA.removeView(view);
        }
        view.setVisibility(0);
        view.setTranslationY(0.0f);
        return view;
    }
}

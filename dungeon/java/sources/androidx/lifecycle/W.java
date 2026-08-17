package androidx.lifecycle;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class W {
    public static final U a(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(O1.c.f8312a);
            U u10 = tag instanceof U ? (U) tag : null;
            if (u10 != null) {
                return u10;
            }
            Object objA = p271p1.b.a(view);
            view = objA instanceof View ? (View) objA : null;
        }
        return null;
    }

    public static final void b(View view, U u10) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(O1.c.f8312a, u10);
    }
}

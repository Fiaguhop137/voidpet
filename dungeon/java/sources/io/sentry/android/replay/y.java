package io.sentry.android.replay;

import android.view.View;
import android.view.Window;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y {
    public static final Window a(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        x xVar = x.f45669a;
        View rootView = view.getRootView();
        Intrinsics.checkNotNullExpressionValue(rootView, "getRootView(...)");
        return xVar.d(rootView);
    }
}

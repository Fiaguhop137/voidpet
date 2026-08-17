package p163j1;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowInsetsController;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f46779a = new w();

    private w() {
    }

    public static final void a(Resources.Theme theme, View decor, TypedValue tv) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(decor, "decor");
        Intrinsics.checkNotNullParameter(tv, "tv");
        int i10 = (!theme.resolveAttribute(16844000, tv, true) || tv.data == 0) ? 0 : 8;
        if (theme.resolveAttribute(16844140, tv, true) && tv.data != 0) {
            i10 |= 16;
        }
        WindowInsetsController windowInsetsController = decor.getWindowInsetsController();
        Intrinsics.c(windowInsetsController);
        windowInsetsController.setSystemBarsAppearance(i10, 24);
    }

    public static /* synthetic */ void b(Resources.Theme theme, View view, TypedValue typedValue, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            typedValue = new TypedValue();
        }
        a(theme, view, typedValue);
    }
}

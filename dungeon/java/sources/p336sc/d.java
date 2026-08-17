package p336sc;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p227mb.i;
import p354tc.l;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f53517a = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final String g(Context context) {
        String string = context.getString(e.f53518a);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String lowerCase = string.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    private final Integer h(Context context) {
        String string = context.getString(e.f53519b);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        Integer intOrNull = StringsKt.toIntOrNull(string);
        if (!StringsKt.j0(string) && intOrNull == null) {
            Log.e("ERR_NAVIGATION_BAR", "Invalid XML value \"" + string + "\" for string \"expo_navigation_bar_border_color\". Expected a valid color int like \"-12177173\". Ensure the value of \"borderColor\" in the \"expo-navigation-bar\" config plugin is a valid CSS color. Skipping initial border color.");
        }
        return intOrNull;
    }

    private final String i(Context context) {
        String string = context.getString(e.f53520c);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String lowerCase = string.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    private final String j(Context context) {
        String string = context.getString(e.f53521d);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String lowerCase = string.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    private final String k(Context context) {
        String string = context.getString(e.f53522e);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String lowerCase = string.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @Override // p227mb.i
    public void a(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Integer numH = h(activity);
        if (numH != null) {
            l.p(activity, numH.intValue());
        }
        String strK = k(activity);
        if (!StringsKt.j0(strK)) {
            l.B(activity, strK);
        }
        String strJ = j(activity);
        if (!StringsKt.j0(strJ)) {
            l.x(activity, strJ);
        }
        String strG = g(activity);
        if (!StringsKt.j0(strG)) {
            l.l(activity, strG);
        }
        String strI = i(activity);
        if (StringsKt.j0(strI)) {
            return;
        }
        l.u(activity, strI);
    }
}

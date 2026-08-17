package p187k7;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p002a1.k;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f48038a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f48039b = new HashMap();

    private c() {
    }

    private final int a(Context context, String str) {
        int identifier = context.getResources().getIdentifier(str, "drawable", context.getPackageName());
        f48039b.put(str, Integer.valueOf(identifier));
        return identifier;
    }

    public static final synchronized void b() {
        f48039b.clear();
    }

    public static final c c() {
        return f48038a;
    }

    public static final Drawable d(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        int iE = e(context, str);
        if (iE > 0) {
            return k.f(context.getResources(), iE, null);
        }
        return null;
    }

    public static final int e(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (str == null || str.length() == 0) {
            return 0;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String strI = StringsKt.I(lowerCase, "-", "_", false, 4, null);
        try {
            return Integer.parseInt(strI);
        } catch (NumberFormatException unused) {
            synchronized (f48038a) {
                try {
                    Integer num = (Integer) f48039b.get(strI);
                    return num != null ? num.intValue() : f48038a.a(context, strI);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static final Uri f(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        int iE = e(context, str);
        if (iE > 0) {
            Uri uriBuild = new Uri.Builder().scheme("res").path(String.valueOf(iE)).build();
            Intrinsics.c(uriBuild);
            return uriBuild;
        }
        Uri uri = Uri.EMPTY;
        Intrinsics.c(uri);
        return uri;
    }
}

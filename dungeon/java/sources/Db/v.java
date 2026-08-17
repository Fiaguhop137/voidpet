package Db;

import android.content.Context;
import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f2389a = new v();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f2390b = new LinkedHashMap();

    private v() {
    }

    private final int a(Context context, String str) {
        if (str.length() == 0) {
            return -1;
        }
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = str.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String strI = StringsKt.I(lowerCase, "-", "_", false, 4, null);
        synchronized (this) {
            Map map = f2390b;
            Integer num = (Integer) map.get(strI);
            if (num != null) {
                return num.intValue();
            }
            int identifier = context.getResources().getIdentifier(strI, "raw", context.getPackageName());
            map.put(strI, Integer.valueOf(identifier));
            return identifier;
        }
    }

    public final Uri b(Context context, String name) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        Uri uriF = p187k7.c.f(context, name);
        if (!Intrinsics.b(uriF, Uri.EMPTY)) {
            return uriF;
        }
        int iA = a(context, name);
        if (iA > 0) {
            return new Uri.Builder().scheme("res").path(String.valueOf(iA)).build();
        }
        return null;
    }
}

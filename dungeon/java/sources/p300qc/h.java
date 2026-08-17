package p300qc;

import Ad.q;
import Ad.r;
import android.text.TextUtils;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List f51768a = CollectionsKt.o("US", "LR", "MM");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List f51769b = CollectionsKt.o("AG", "BZ", "VG", "FM", "MH", "MS", "KN", "BS", "CY", "TC", "US", "LR", "PW", "KY");

    public static final String a(Locale locale) {
        Object objB;
        Intrinsics.checkNotNullParameter(locale, "locale");
        try {
            q.a aVar = q.f327b;
            String country = locale.getCountry();
            if (TextUtils.isEmpty(country)) {
                country = null;
            }
            objB = q.b(country);
        } catch (Throwable th) {
            q.a aVar2 = q.f327b;
            objB = q.b(r.a(th));
        }
        return (String) (q.f(objB) ? null : objB);
    }

    public static final String b(Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        String strC = c("ro.miui.region");
        return strC.length() == 0 ? a(locale) : strC;
    }

    public static final String c(String key) {
        Object objB;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            q.a aVar = q.f327b;
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Object objInvoke = cls.getMethod("get", String.class).invoke(cls, key);
            Intrinsics.d(objInvoke, "null cannot be cast to non-null type kotlin.String");
            objB = q.b((String) objInvoke);
        } catch (Throwable th) {
            q.a aVar2 = q.f327b;
            objB = q.b(r.a(th));
        }
        if (q.f(objB)) {
            objB = null;
        }
        String str = (String) objB;
        return str == null ? "" : str;
    }

    public static final String d(Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        String strB = b(locale);
        if (strB == null) {
            return null;
        }
        return f51769b.contains(strB) ? "fahrenheit" : "celsius";
    }

    public static final List e() {
        return f51768a;
    }
}

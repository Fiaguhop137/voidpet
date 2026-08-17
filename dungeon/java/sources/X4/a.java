package X4;

import Ad.v;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.N;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f15293a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f15294b = N.l(v.a("mkv", "video/x-matroska"), v.a("glb", "model/gltf-binary"));

    private a() {
    }

    private final String a(String str) {
        int iM0 = StringsKt.m0(str, '.', 0, false, 6, null);
        if (iM0 < 0 || iM0 == str.length() - 1) {
            return null;
        }
        String strSubstring = str.substring(iM0 + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String b(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        String strA = f15293a.a(path);
        if (strA == null) {
            return null;
        }
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = strA.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (lowerCase == null) {
            return null;
        }
        String strA2 = b.a(lowerCase);
        return strA2 == null ? (String) f15294b.get(lowerCase) : strA2;
    }

    public static final boolean c(String str) {
        if (str != null) {
            return StringsKt.O(str, "video/", false, 2, null);
        }
        return false;
    }
}

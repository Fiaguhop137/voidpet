package p407wb;

import android.net.Uri;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l {
    public static final boolean a(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        return Intrinsics.b(uri.getScheme(), "asset");
    }

    public static final boolean b(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        return Intrinsics.b(uri.getScheme(), "content");
    }

    public static final String c(String str) {
        if (str == null) {
            return null;
        }
        return StringsKt.O(str, "file:///", false, 2, null) ? str : Pattern.compile("^file:/*").matcher(str).replaceAll("file:///");
    }
}

package p425xb;

import java.util.regex.Pattern;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f57567a = m.class.getSimpleName();

    public static final String b(String str) {
        if (str == null) {
            return null;
        }
        return StringsKt.O(str, "file:///", false, 2, null) ? str : Pattern.compile("^file:/*").matcher(str).replaceAll("file:///");
    }
}

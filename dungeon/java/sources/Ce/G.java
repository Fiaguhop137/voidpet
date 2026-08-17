package Ce;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class G {
    public static final String a(p464ze.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return c(dVar.h());
    }

    public static final String b(p464ze.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        if (!e(fVar)) {
            String strG = fVar.g();
            Intrinsics.checkNotNullExpressionValue(strG, "asString(...)");
            return strG;
        }
        StringBuilder sb2 = new StringBuilder();
        String strG2 = fVar.g();
        Intrinsics.checkNotNullExpressionValue(strG2, "asString(...)");
        sb2.append('`' + strG2);
        sb2.append('`');
        return sb2.toString();
    }

    public static final String c(List pathSegments) {
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        StringBuilder sb2 = new StringBuilder();
        Iterator it = pathSegments.iterator();
        while (it.hasNext()) {
            p464ze.f fVar = (p464ze.f) it.next();
            if (sb2.length() > 0) {
                sb2.append(".");
            }
            sb2.append(b(fVar));
        }
        return sb2.toString();
    }

    public static final String d(String lowerRendered, String lowerPrefix, String upperRendered, String upperPrefix, String foldedPrefix) {
        Intrinsics.checkNotNullParameter(lowerRendered, "lowerRendered");
        Intrinsics.checkNotNullParameter(lowerPrefix, "lowerPrefix");
        Intrinsics.checkNotNullParameter(upperRendered, "upperRendered");
        Intrinsics.checkNotNullParameter(upperPrefix, "upperPrefix");
        Intrinsics.checkNotNullParameter(foldedPrefix, "foldedPrefix");
        if (StringsKt.O(lowerRendered, lowerPrefix, false, 2, null) && StringsKt.O(upperRendered, upperPrefix, false, 2, null)) {
            String strSubstring = lowerRendered.substring(lowerPrefix.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String strSubstring2 = upperRendered.substring(upperPrefix.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            String str = foldedPrefix + strSubstring;
            if (Intrinsics.b(strSubstring, strSubstring2)) {
                return str;
            }
            if (f(strSubstring, strSubstring2)) {
                return str + '!';
            }
        }
        return null;
    }

    private static final boolean e(p464ze.f fVar) {
        String strG = fVar.g();
        Intrinsics.checkNotNullExpressionValue(strG, "asString(...)");
        if (B.f1837a.contains(strG)) {
            return true;
        }
        for (int i10 = 0; i10 < strG.length(); i10++) {
            char cCharAt = strG.charAt(i10);
            if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '_') {
                return true;
            }
        }
        return strG.length() == 0 || !Character.isJavaIdentifierStart(strG.codePointAt(0));
    }

    public static final boolean f(String lower, String upper) {
        Intrinsics.checkNotNullParameter(lower, "lower");
        Intrinsics.checkNotNullParameter(upper, "upper");
        if (Intrinsics.b(lower, StringsKt.I(upper, "?", "", false, 4, null))) {
            return true;
        }
        if (StringsKt.y(upper, "?", false, 2, null)) {
            if (Intrinsics.b(lower + '?', upper)) {
                return true;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('(');
        sb2.append(lower);
        sb2.append(")?");
        return Intrinsics.b(sb2.toString(), upper);
    }
}

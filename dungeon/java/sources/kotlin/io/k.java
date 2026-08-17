package kotlin.io;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
class k {
    private static final int a(String str) {
        int iG0;
        char c10 = File.separatorChar;
        int iG1 = StringsKt.g0(str, c10, 0, false, 4, null);
        if (iG1 == 0) {
            if (str.length() <= 1 || str.charAt(1) != c10 || (iG0 = StringsKt.g0(str, c10, 2, false, 4, null)) < 0) {
                return 1;
            }
            int iG2 = StringsKt.g0(str, c10, iG0 + 1, false, 4, null);
            return iG2 >= 0 ? iG2 + 1 : str.length();
        }
        if (iG1 > 0 && str.charAt(iG1 - 1) == ':') {
            return iG1 + 1;
        }
        if (iG1 == -1 && StringsKt.X(str, ':', false, 2, null)) {
            return str.length();
        }
        return 0;
    }

    public static final g b(File file) {
        List listL;
        Intrinsics.checkNotNullParameter(file, "<this>");
        String path = file.getPath();
        Intrinsics.c(path);
        int iA = a(path);
        String strSubstring = path.substring(0, iA);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String strSubstring2 = path.substring(iA);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        if (strSubstring2.length() == 0) {
            listL = CollectionsKt.l();
        } else {
            List listJ0 = StringsKt.J0(strSubstring2, new char[]{File.separatorChar}, false, 0, 6, null);
            ArrayList arrayList = new ArrayList(CollectionsKt.w(listJ0, 10));
            Iterator it = listJ0.iterator();
            while (it.hasNext()) {
                arrayList.add(new File((String) it.next()));
            }
            listL = arrayList;
        }
        return new g(new File(strSubstring), listL);
    }
}

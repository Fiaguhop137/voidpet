package p425xb;

import Nb.b;
import Nb.c;
import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p227mb.d;

/* JADX INFO: loaded from: classes2.dex */
public class e implements b, d {
    private final EnumSet c(String str, Context context) {
        Object next;
        String str2;
        try {
            String canonicalPath = new File(str).getCanonicalPath();
            Iterator it = e(context).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                str2 = (String) next;
                Intrinsics.c(canonicalPath);
                if (StringsKt.O(canonicalPath, str2 + "/", false, 2, null)) {
                    break;
                }
            } while (!Intrinsics.b(str2, canonicalPath));
            if (((String) next) != null) {
                return EnumSet.of(c.READ, c.WRITE);
            }
            return null;
        } catch (IOException unused) {
            return EnumSet.noneOf(c.class);
        }
    }

    private final List e(Context context) {
        return CollectionsKt.o(context.getFilesDir().getCanonicalPath(), context.getCacheDir().getCanonicalPath());
    }

    @Override // Nb.b
    public EnumSet a(Context context, String path) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(path, "path");
        EnumSet enumSetC = c(path, context);
        return enumSetC == null ? b(path) : enumSetC;
    }

    protected EnumSet b(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        File file = new File(path);
        EnumSet enumSetNoneOf = EnumSet.noneOf(c.class);
        if (file.canRead()) {
            enumSetNoneOf.add(c.READ);
        }
        if (file.canWrite()) {
            enumSetNoneOf.add(c.WRITE);
        }
        Intrinsics.checkNotNullExpressionValue(enumSetNoneOf, "apply(...)");
        return enumSetNoneOf;
    }

    @Override // p227mb.d
    public List h() {
        return CollectionsKt.e(b.class);
    }
}

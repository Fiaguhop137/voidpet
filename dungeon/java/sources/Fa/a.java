package Fa;

import android.content.Context;
import android.graphics.Typeface;
import com.facebook.react.views.text.e;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    private static String a(Context context, String str, String str2) {
        try {
            for (String str3 : context.getAssets().list(str)) {
                if (str3.startsWith(str2) && (str3.endsWith(".ttf") || str3.endsWith(".otf"))) {
                    return str + str3;
                }
            }
            return null;
        } catch (IOException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static Typeface b(Context context, String str) {
        Typeface typefaceC = c(context, str);
        return typefaceC == null ? d(context, str) : typefaceC;
    }

    private static Typeface c(Context context, String str) {
        String strA = a(context, "fonts/", str);
        if (strA != null) {
            return Typeface.createFromAsset(context.getAssets(), strA);
        }
        return null;
    }

    private static Typeface d(Context context, String str) {
        return e.c().e(str, 0, context.getAssets());
    }
}

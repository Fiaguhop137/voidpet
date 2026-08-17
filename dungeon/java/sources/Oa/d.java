package Oa;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {
    public static final Drawable a(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (str == null) {
            return null;
        }
        int identifier = context.getResources().getIdentifier(str, "drawable", context.getPackageName());
        if (identifier > 0) {
            return p161j.a.b(context, identifier);
        }
        int identifier2 = context.getResources().getIdentifier(str, "drawable", "android");
        if (identifier2 > 0) {
            return p161j.a.b(context, identifier2);
        }
        Log.w("TabScreen", "TabScreen could not resolve drawable resource with the name " + str);
        return null;
    }
}

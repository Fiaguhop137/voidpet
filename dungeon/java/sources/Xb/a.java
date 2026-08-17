package Xb;

import android.app.Activity;
import android.content.res.TypedArray;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            activity.getWindow().setNavigationBarContrastEnforced(c(activity));
        }
    }

    private static final boolean c(Activity activity) {
        TypedArray typedArrayObtainStyledAttributes = activity.getTheme().obtainStyledAttributes(new int[]{16844293});
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            return typedArrayObtainStyledAttributes.getBoolean(0, true);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}

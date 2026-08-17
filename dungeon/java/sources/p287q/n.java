package p287q;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
abstract class n {

    private static class a {
        static boolean a(@NonNull PackageManager packageManager) {
            return packageManager.hasSystemFeature("android.hardware.fingerprint");
        }
    }

    static boolean a(Context context) {
        return (context == null || context.getPackageManager() == null || !a.a(context.getPackageManager())) ? false : true;
    }
}

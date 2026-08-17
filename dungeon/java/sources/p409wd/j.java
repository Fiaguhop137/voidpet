package p409wd;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import io.invertase.firebase.app.a;

/* JADX INFO: loaded from: classes3.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static j f56846a = new j();

    private Bundle b() {
        ApplicationInfo applicationInfo;
        try {
            Context contextA = a.a();
            PackageManager packageManager = contextA.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(contextA.getPackageName(), 128)) == null) {
                return null;
            }
            return applicationInfo.metaData;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static j c() {
        return f56846a;
    }

    public WritableMap a() {
        Bundle bundleB = b();
        WritableMap writableMapCreateMap = Arguments.createMap();
        if (bundleB != null) {
            for (String str : bundleB.keySet()) {
                if (str.startsWith("rnfirebase_")) {
                    Object obj = bundleB.get(str);
                    if (obj == null) {
                        writableMapCreateMap.putNull(str);
                    } else if (obj instanceof String) {
                        writableMapCreateMap.putString(str, (String) obj);
                    } else if (obj instanceof Boolean) {
                        writableMapCreateMap.putBoolean(str, ((Boolean) obj).booleanValue());
                    }
                }
            }
        }
        return writableMapCreateMap;
    }
}

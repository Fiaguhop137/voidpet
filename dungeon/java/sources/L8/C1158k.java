package L8;

import android.app.Activity;
import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: renamed from: L8.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1158k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final C1158k f6477c = new C1158k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f6478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f6479b;

    C1158k() {
    }

    final boolean a(Activity activity) {
        Bundle bundle;
        Bundle bundle2;
        if (this.f6479b) {
            return this.f6478a;
        }
        ActivityInfo activityInfo = null;
        try {
            ApplicationInfo applicationInfoC = p278p8.d.a(activity).c(activity.getPackageName(), 128);
            bundle = applicationInfoC == null ? null : applicationInfoC.metaData;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        boolean zEquals = false;
        if (bundle != null && bundle.getString("com.epicgames.unreal.GameActivity.EngineVersion", "").startsWith("5.")) {
            try {
                activityInfo = activity.getPackageManager().getActivityInfo(new ComponentName(activity, "com.epicgames.unreal.GameActivity"), 128);
            } catch (PackageManager.NameNotFoundException unused2) {
            }
            if (activityInfo != null && (bundle2 = activityInfo.metaData) != null) {
                zEquals = Objects.equals(bundle2.getString("android.app.lib_name", ""), "Unreal");
            }
        }
        this.f6478a = zEquals;
        this.f6479b = true;
        return zEquals;
    }
}

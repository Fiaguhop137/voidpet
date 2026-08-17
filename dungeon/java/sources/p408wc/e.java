package p408wc;

import android.content.Context;
import android.net.Uri;
import android.provider.Settings;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f56827a;

    public e(Context context) {
        this.f56827a = context;
    }

    private String a(String str) {
        return !str.contains(".") ? str : str.substring(0, str.lastIndexOf(46));
    }

    public Uri b(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        String packageName = this.f56827a.getPackageName();
        String strA = a(str);
        return this.f56827a.getResources().getIdentifier(strA, "raw", packageName) != 0 ? new Uri.Builder().scheme("android.resource").authority(packageName).appendPath("raw").appendPath(strA).build() : Settings.System.DEFAULT_NOTIFICATION_URI;
    }
}

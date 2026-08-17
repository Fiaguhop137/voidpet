package G3;

import android.content.Context;
import android.net.ConnectivityManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final d a(Context context) {
        Context applicationContext = context.getApplicationContext();
        ConnectivityManager connectivityManager = (ConnectivityManager) Z0.b.j(applicationContext, ConnectivityManager.class);
        if (connectivityManager == null || !H3.f.b(applicationContext, "android.permission.ACCESS_NETWORK_STATE")) {
            return d.f3867b;
        }
        try {
            return new e(connectivityManager);
        } catch (Exception unused) {
            return d.f3867b;
        }
    }
}

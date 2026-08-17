package E4;

import android.content.Context;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class e implements c {
    @Override // E4.c
    public b a(Context context, b.a aVar) {
        boolean z10 = Z0.b.a(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z10 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        return z10 ? new d(context, aVar) : new n();
    }
}

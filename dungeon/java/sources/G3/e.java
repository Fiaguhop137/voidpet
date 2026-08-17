package G3;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes.dex */
final class e implements d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ConnectivityManager f3869c;

    public e(ConnectivityManager connectivityManager) {
        this.f3869c = connectivityManager;
    }

    @Override // G3.d
    public boolean c() {
        NetworkCapabilities networkCapabilities = this.f3869c.getNetworkCapabilities(this.f3869c.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }
}

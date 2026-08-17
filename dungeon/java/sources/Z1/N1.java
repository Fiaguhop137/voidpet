package Z1;

import U1.AbstractC1477t;
import U1.InterfaceC1466h;
import U1.InterfaceC1474p;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
final class N1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f18011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1474p f18012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f18013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f18014d;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f18015a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WifiManager.WifiLock f18016b;

        public a(Context context) {
            this.f18015a = context;
        }

        public void a(boolean z10, boolean z11) {
            if (z10 && this.f18016b == null) {
                WifiManager wifiManager = (WifiManager) this.f18015a.getApplicationContext().getSystemService("wifi");
                if (wifiManager == null) {
                    AbstractC1477t.h("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                    return;
                } else {
                    WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                    this.f18016b = wifiLockCreateWifiLock;
                    wifiLockCreateWifiLock.setReferenceCounted(false);
                }
            }
            WifiManager.WifiLock wifiLock = this.f18016b;
            if (wifiLock == null) {
                return;
            }
            if (z10 && z11) {
                wifiLock.acquire();
            } else {
                wifiLock.release();
            }
        }
    }

    public N1(Context context, Looper looper, InterfaceC1466h interfaceC1466h) {
        this.f18011a = new a(context.getApplicationContext());
        this.f18012b = interfaceC1466h.e(looper, null);
    }

    public void c(boolean z10) {
        if (this.f18013c == z10) {
            return;
        }
        this.f18013c = z10;
        this.f18012b.h(new L1(this, z10, this.f18014d));
    }

    public void d(boolean z10) {
        if (this.f18014d == z10) {
            return;
        }
        this.f18014d = z10;
        if (this.f18013c) {
            this.f18012b.h(new M1(this, z10));
        }
    }
}

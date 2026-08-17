package Z1;

import U1.AbstractC1477t;
import U1.InterfaceC1466h;
import U1.InterfaceC1474p;
import android.content.Context;
import android.os.Looper;
import android.os.PowerManager;

/* JADX INFO: loaded from: classes.dex */
final class K1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f17990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1474p f17991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f17992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f17993d;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f17994a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private PowerManager.WakeLock f17995b;

        public a(Context context) {
            this.f17994a = context;
        }

        public void a(boolean z10, boolean z11) {
            if (z10 && this.f17995b == null) {
                PowerManager powerManager = (PowerManager) this.f17994a.getSystemService("power");
                if (powerManager == null) {
                    AbstractC1477t.h("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                    return;
                } else {
                    PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                    this.f17995b = wakeLockNewWakeLock;
                    wakeLockNewWakeLock.setReferenceCounted(false);
                }
            }
            PowerManager.WakeLock wakeLock = this.f17995b;
            if (wakeLock == null) {
                return;
            }
            if (z10 && z11) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }

    public K1(Context context, Looper looper, InterfaceC1466h interfaceC1466h) {
        this.f17990a = new a(context.getApplicationContext());
        this.f17991b = interfaceC1466h.e(looper, null);
    }

    public void c(boolean z10) {
        if (this.f17992c == z10) {
            return;
        }
        this.f17992c = z10;
        this.f17991b.h(new J1(this, z10, this.f17993d));
    }

    public void d(boolean z10) {
        if (this.f17993d == z10) {
            return;
        }
        this.f17993d = z10;
        if (this.f17992c) {
            this.f17991b.h(new I1(this, z10));
        }
    }
}

package p170j8;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class k0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f46995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC3839d f46996b;

    public k0(AbstractC3839d abstractC3839d, int i10) {
        Objects.requireNonNull(abstractC3839d);
        this.f46996b = abstractC3839d;
        this.f46995a = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC3839d abstractC3839d = this.f46996b;
        if (iBinder == null) {
            abstractC3839d.Y(16);
            return;
        }
        synchronized (abstractC3839d.a0()) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                abstractC3839d.b0((iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC3848m)) ? new Z(iBinder) : (InterfaceC3848m) iInterfaceQueryLocalInterface);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f46996b.U(0, null, this.f46995a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC3839d abstractC3839d = this.f46996b;
        synchronized (abstractC3839d.a0()) {
            abstractC3839d.b0(null);
        }
        AbstractC3839d abstractC3839d2 = this.f46996b;
        int i10 = this.f46995a;
        Handler handler = abstractC3839d2.f46919l;
        handler.sendMessage(handler.obtainMessage(6, i10, 1));
    }
}

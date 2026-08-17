package p459z9;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: renamed from: z9.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class ServiceConnectionC4390e implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C4391f f58512a;

    /* synthetic */ ServiceConnectionC4390e(C4391f c4391f, AbstractC4389d abstractC4389d) {
        this.f58512a = c4391f;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f58512a.f58515b.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f58512a.c().post(new C4387b(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f58512a.f58515b.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f58512a.c().post(new C4388c(this));
    }
}

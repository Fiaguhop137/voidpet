package p423x9;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes2.dex */
final class s implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ t f57432a;

    /* synthetic */ s(t tVar, r rVar) {
        this.f57432a = tVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f57432a.f57435b.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        t tVar = this.f57432a;
        tVar.c().post(new p(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f57432a.f57435b.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        t tVar = this.f57432a;
        tVar.c().post(new q(this));
    }
}

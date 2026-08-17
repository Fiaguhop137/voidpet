package p117g8;

import android.os.IBinder;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f42221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IBinder f42222b;

    public /* synthetic */ q(x xVar, IBinder iBinder) {
        this.f42221a = xVar;
        this.f42222b = iBinder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x xVar = this.f42221a;
        IBinder iBinder = this.f42222b;
        synchronized (xVar) {
            if (iBinder == null) {
                xVar.a(0, "Null service connection");
                return;
            }
            try {
                xVar.f42231c = new y(iBinder);
                xVar.f42229a = 2;
                xVar.c();
            } catch (RemoteException e10) {
                xVar.a(0, e10.getMessage());
            }
        }
    }
}

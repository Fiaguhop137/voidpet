package p117g8;

import J8.f;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import p170j8.r;
import p242n8.a;

/* JADX INFO: loaded from: classes2.dex */
final class x implements ServiceConnection {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    y f42231c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ D f42234f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f42229a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Messenger f42230b = new Messenger(new f(Looper.getMainLooper(), new u(this)));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Queue f42232d = new ArrayDeque();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final SparseArray f42233e = new SparseArray();

    /* synthetic */ x(D d10, w wVar) {
        this.f42234f = d10;
    }

    final synchronized void a(int i10, String str) {
        b(i10, str, null);
    }

    final synchronized void b(int i10, String str, Throwable th) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i11 = this.f42229a;
            if (i11 == 0) {
                throw new IllegalStateException();
            }
            if (i11 != 1 && i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                this.f42229a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f42229a = 4;
            a.b().c(this.f42234f.f42178a, this);
            B b10 = new B(i10, str, th);
            Iterator it = this.f42232d.iterator();
            while (it.hasNext()) {
                ((A) it.next()).c(b10);
            }
            this.f42232d.clear();
            for (int i12 = 0; i12 < this.f42233e.size(); i12++) {
                ((A) this.f42233e.valueAt(i12)).c(b10);
            }
            this.f42233e.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    final void c() {
        this.f42234f.f42179b.execute(new r(this));
    }

    final synchronized void d() {
        if (this.f42229a == 1) {
            a(1, "Timed out while binding");
        }
    }

    final synchronized void e(int i10) {
        A a10 = (A) this.f42233e.get(i10);
        if (a10 != null) {
            Log.w("MessengerIpcClient", "Timing out request: " + i10);
            this.f42233e.remove(i10);
            a10.c(new B(3, "Timed out waiting for response", null));
            f();
        }
    }

    final synchronized void f() {
        try {
            if (this.f42229a == 2 && this.f42232d.isEmpty() && this.f42233e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f42229a = 3;
                a.b().c(this.f42234f.f42178a, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    final synchronized boolean g(A a10) {
        try {
            int i10 = this.f42229a;
            if (i10 != 0) {
                if (i10 == 1) {
                    this.f42232d.add(a10);
                    return true;
                }
                if (i10 != 2) {
                    return false;
                }
                this.f42232d.add(a10);
                c();
                return true;
            }
            this.f42232d.add(a10);
            r.o(this.f42229a == 0);
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.f42229a = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            try {
                if (a.b().a(this.f42234f.f42178a, intent, this, 1)) {
                    this.f42234f.f42179b.schedule(new s(this), 30L, TimeUnit.SECONDS);
                } else {
                    a(0, "Unable to bind to service");
                }
            } catch (SecurityException e10) {
                b(0, "Unable to bind to service", e10);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f42234f.f42179b.execute(new q(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.f42234f.f42179b.execute(new t(this));
    }
}

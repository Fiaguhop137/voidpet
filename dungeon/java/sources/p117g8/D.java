package p117g8;

import J8.e;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p260o8.a;

/* JADX INFO: loaded from: classes2.dex */
public final class D {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static D f42177e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f42178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f42179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private x f42180c = new x(this, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f42181d = 1;

    D(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f42179b = scheduledExecutorService;
        this.f42178a = context.getApplicationContext();
    }

    public static synchronized D b(Context context) {
        try {
            if (f42177e == null) {
                e.a();
                f42177e = new D(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new a("MessengerIpcClient"))));
            }
        } catch (Throwable th) {
            throw th;
        }
        return f42177e;
    }

    private final synchronized int f() {
        int i10;
        i10 = this.f42181d;
        this.f42181d = i10 + 1;
        return i10;
    }

    private final synchronized Task g(A a10) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(a10.toString()));
            }
            if (!this.f42180c.g(a10)) {
                x xVar = new x(this, null);
                this.f42180c = xVar;
                xVar.g(a10);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a10.f42174b.getTask();
    }

    public final Task c(int i10, Bundle bundle) {
        return g(new z(f(), i10, bundle));
    }

    public final Task d(int i10, Bundle bundle) {
        return g(new C(f(), i10, bundle));
    }
}

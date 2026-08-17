package p117g8;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f42173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final TaskCompletionSource f42174b = new TaskCompletionSource();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f42175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Bundle f42176d;

    A(int i10, int i11, Bundle bundle) {
        this.f42173a = i10;
        this.f42175c = i11;
        this.f42176d = bundle;
    }

    abstract void a(Bundle bundle);

    abstract boolean b();

    final void c(B b10) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + b10.toString());
        }
        this.f42174b.setException(b10);
    }

    final void d(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(obj));
        }
        this.f42174b.setResult(obj);
    }

    public final String toString() {
        return "Request { what=" + this.f42175c + " id=" + this.f42173a + " oneWay=" + b() + "}";
    }
}

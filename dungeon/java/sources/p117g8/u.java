package p117g8;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class u implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f42226a;

    public /* synthetic */ u(x xVar) {
        this.f42226a = xVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.arg1;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Received response to request: " + i10);
        }
        x xVar = this.f42226a;
        synchronized (xVar) {
            try {
                A a10 = (A) xVar.f42233e.get(i10);
                if (a10 == null) {
                    Log.w("MessengerIpcClient", "Received response for unknown request: " + i10);
                    return true;
                }
                xVar.f42233e.remove(i10);
                xVar.f();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    a10.c(new B(4, "Not supported by GmsCore", null));
                    return true;
                }
                a10.a(data);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

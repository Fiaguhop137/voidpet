package p117g8;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f42223a;

    public /* synthetic */ r(x xVar) {
        this.f42223a = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        A a10;
        while (true) {
            x xVar = this.f42223a;
            synchronized (xVar) {
                try {
                    if (xVar.f42229a != 2) {
                        return;
                    }
                    if (xVar.f42232d.isEmpty()) {
                        xVar.f();
                        return;
                    } else {
                        a10 = (A) xVar.f42232d.poll();
                        xVar.f42233e.put(a10.f42173a, a10);
                        xVar.f42234f.f42179b.schedule(new v(xVar, a10), 30L, TimeUnit.SECONDS);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(a10)));
            }
            D d10 = xVar.f42234f;
            Messenger messenger = xVar.f42230b;
            int i10 = a10.f42175c;
            Context context = d10.f42178a;
            Message messageObtain = Message.obtain();
            messageObtain.what = i10;
            messageObtain.arg1 = a10.f42173a;
            messageObtain.replyTo = messenger;
            Bundle bundle = new Bundle();
            bundle.putBoolean("oneWay", a10.b());
            bundle.putString("pkg", context.getPackageName());
            bundle.putBundle("data", a10.f42176d);
            messageObtain.setData(bundle);
            try {
                xVar.f42231c.a(messageObtain);
            } catch (RemoteException e10) {
                xVar.a(2, e10.getMessage());
            }
        }
    }
}

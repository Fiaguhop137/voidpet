package U1;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public class H implements InterfaceC1466h {
    protected H() {
    }

    @Override // U1.InterfaceC1466h
    public long a() {
        return System.currentTimeMillis();
    }

    @Override // U1.InterfaceC1466h
    public long b() {
        return System.nanoTime();
    }

    @Override // U1.InterfaceC1466h
    public long c() {
        return SystemClock.elapsedRealtime();
    }

    @Override // U1.InterfaceC1466h
    public long d() {
        return SystemClock.uptimeMillis();
    }

    @Override // U1.InterfaceC1466h
    public InterfaceC1474p e(Looper looper, Handler.Callback callback) {
        return new I(new Handler(looper, callback));
    }

    @Override // U1.InterfaceC1466h
    public void f() {
    }
}

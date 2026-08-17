package p310r4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f52383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f52384b = new Handler(Looper.getMainLooper(), new a());

    private static final class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((v) message.obj).recycle();
            return true;
        }
    }

    y() {
    }

    synchronized void a(v vVar, boolean z10) {
        try {
            if (this.f52383a || z10) {
                this.f52384b.obtainMessage(1, vVar).sendToTarget();
            } else {
                this.f52383a = true;
                vVar.recycle();
                this.f52383a = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}

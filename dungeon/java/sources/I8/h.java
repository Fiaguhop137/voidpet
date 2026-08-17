package I8;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public class h extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Looper f5092a;

    public h(Looper looper) {
        super(looper);
        this.f5092a = Looper.getMainLooper();
    }

    public h(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f5092a = Looper.getMainLooper();
    }
}

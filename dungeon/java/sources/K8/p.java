package K8;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public class p extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Looper f6056a;

    public p(Looper looper) {
        super(looper);
        this.f6056a = Looper.getMainLooper();
    }

    public p(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f6056a = Looper.getMainLooper();
    }
}

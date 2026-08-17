package R8;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Looper f10898a;

    public a(Looper looper) {
        super(looper);
        this.f10898a = Looper.getMainLooper();
    }
}

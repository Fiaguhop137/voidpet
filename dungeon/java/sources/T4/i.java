package T4;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public class i extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static i f12267b;

    private i() {
        super(new Handler(Looper.getMainLooper()));
    }

    public static i h() {
        if (f12267b == null) {
            f12267b = new i();
        }
        return f12267b;
    }

    @Override // T4.e, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (a()) {
            runnable.run();
        } else {
            super.execute(runnable);
        }
    }
}

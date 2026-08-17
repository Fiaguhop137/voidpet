package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements p345t3.a {

    private static class a {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public static class b {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new p148i3.e(context));
    }

    @Override // p345t3.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public b create(Context context) {
        Choreographer.getInstance().postFrameCallback(new p148i3.c(this, context.getApplicationContext()));
        return new b();
    }

    @Override // p345t3.a
    public List dependencies() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(Context context) {
        (Build.VERSION.SDK_INT >= 28 ? a.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new p148i3.d(context), new Random().nextInt(Math.max(1000, 1)) + 5000);
    }
}

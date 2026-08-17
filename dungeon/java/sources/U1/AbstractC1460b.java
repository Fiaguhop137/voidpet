package U1;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: U1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1460b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Executor f12893a;

    public static synchronized Executor a() {
        try {
            if (f12893a == null) {
                f12893a = S.N0("ExoPlayer:BackgroundExecutor");
            }
        } catch (Throwable th) {
            throw th;
        }
        return f12893a;
    }
}

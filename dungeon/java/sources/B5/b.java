package B5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f585a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadFactory f586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ExecutorService f587c;

    static {
        a aVar = new a();
        f586b = aVar;
        f587c = Executors.newCachedThreadPool(aVar);
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread c(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setPriority(1);
        return thread;
    }

    public final void b(Runnable task) {
        Intrinsics.checkNotNullParameter(task, "task");
        f587c.execute(task);
    }
}

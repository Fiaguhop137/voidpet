package io.invertase.firebase.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p409wd.i;
import p409wd.m;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map f44178e = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f44179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f44180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f44181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final RejectedExecutionHandler f44182d = new m(this);

    a(String str) {
        this.f44179a = str;
        i iVarD = i.d();
        this.f44180b = iVarD.b("android_task_executor_maximum_pool_size", 1);
        this.f44181c = iVarD.b("android_task_executor_keep_alive_seconds", 3);
    }

    private ExecutorService e(boolean z10) {
        if (z10) {
            return Executors.newSingleThreadExecutor();
        }
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, this.f44180b, this.f44181c, TimeUnit.SECONDS, new SynchronousQueue());
        threadPoolExecutor.setRejectedExecutionHandler(this.f44182d);
        return threadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        if (threadPoolExecutor.isShutdown() || threadPoolExecutor.isTerminated() || threadPoolExecutor.isTerminating()) {
            return;
        }
        f().execute(runnable);
    }

    public ExecutorService b() {
        return c(this.f44180b <= 1, "");
    }

    public ExecutorService c(boolean z10, String str) {
        String strD = d(z10, str);
        Map map = f44178e;
        synchronized (map) {
            try {
                ExecutorService executorService = (ExecutorService) map.get(strD);
                if (executorService != null) {
                    return executorService;
                }
                ExecutorService executorServiceE = e(z10);
                map.put(strD, executorServiceE);
                return executorServiceE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String d(boolean z10, String str) {
        if (z10) {
            return this.f44179a + "TransactionalExecutor" + str;
        }
        return this.f44179a + "Executor" + str;
    }

    public ExecutorService f() {
        return c(true, "");
    }

    public ExecutorService g(String str) {
        if (this.f44180b == 0) {
            str = "";
        }
        return c(true, str);
    }

    public void i(String str) {
        Map map = f44178e;
        synchronized (map) {
            try {
                ExecutorService executorService = (ExecutorService) map.get(str);
                if (executorService != null) {
                    executorService.shutdownNow();
                    map.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j() {
        Map map = f44178e;
        synchronized (map) {
            try {
                for (String str : new ArrayList(map.keySet())) {
                    if (str.startsWith(this.f44179a)) {
                        i(str);
                    } else {
                        f44178e.remove(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

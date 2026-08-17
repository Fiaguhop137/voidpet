package p417x3;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final b f57362d = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f57363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f57364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f57365c;

    /* JADX INFO: renamed from: x3.b$b, reason: collision with other inner class name */
    private static class ExecutorC0741b implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ThreadLocal f57366a;

        private ExecutorC0741b() {
            this.f57366a = new ThreadLocal();
        }

        /* synthetic */ ExecutorC0741b(a aVar) {
            this();
        }

        private int a() {
            Integer num = (Integer) this.f57366a.get();
            if (num == null) {
                num = 0;
            }
            int iIntValue = num.intValue() - 1;
            if (iIntValue == 0) {
                this.f57366a.remove();
                return iIntValue;
            }
            this.f57366a.set(Integer.valueOf(iIntValue));
            return iIntValue;
        }

        private int b() {
            Integer num = (Integer) this.f57366a.get();
            if (num == null) {
                num = 0;
            }
            int iIntValue = num.intValue() + 1;
            this.f57366a.set(Integer.valueOf(iIntValue));
            return iIntValue;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            try {
                if (b() <= 15) {
                    runnable.run();
                } else {
                    b.a().execute(runnable);
                }
                a();
            } catch (Throwable th) {
                a();
                throw th;
            }
        }
    }

    private b() {
        this.f57363a = !c() ? Executors.newCachedThreadPool() : p417x3.a.b();
        this.f57364b = Executors.newSingleThreadScheduledExecutor();
        this.f57365c = new ExecutorC0741b(null);
    }

    public static ExecutorService a() {
        return f57362d.f57363a;
    }

    static Executor b() {
        return f57362d.f57365c;
    }

    private static boolean c() {
        String property = System.getProperty("java.runtime.name");
        if (property == null) {
            return false;
        }
        return property.toLowerCase(Locale.US).contains("android");
    }
}

package p352ta;

import N8.AbstractExecutorServiceC1224t;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p170j8.r;

/* JADX INFO: loaded from: classes2.dex */
public class i extends AbstractExecutorServiceC1224t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f54601b = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ThreadPoolExecutor f54602a;

    public i() {
        ThreadFactory threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new t(threadFactoryDefaultThreadFactory));
        this.f54602a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    static /* synthetic */ void d(Runnable runnable) {
        f54601b.set(new ArrayDeque());
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Deque deque, Runnable runnable) {
        r.l(deque);
        deque.add(runnable);
        if (deque.size() <= 1) {
            do {
                runnable.run();
                deque.removeFirst();
                runnable = (Runnable) deque.peekFirst();
            } while (runnable != null);
        }
    }

    @Override // N8.U
    protected final /* synthetic */ Object a() {
        return this.f54602a;
    }

    @Override // N8.AbstractExecutorServiceC1224t
    protected final ExecutorService b() {
        return this.f54602a;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Deque deque = (Deque) f54601b.get();
        if (deque == null || deque.size() > 1) {
            this.f54602a.execute(new s(runnable));
        } else {
            e(deque, runnable);
        }
    }
}

package N7;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
class m implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f7966a;

    static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Runnable f7967a;

        a(Runnable runnable) {
            this.f7967a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f7967a.run();
            } catch (Exception e10) {
                R7.a.d("Executor", "Background execution failure.", e10);
            }
        }
    }

    m(Executor executor) {
        this.f7966a = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f7966a.execute(new a(runnable));
    }
}

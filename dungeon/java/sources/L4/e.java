package L4;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Executor f6336a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Executor f6337b = new b();

    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            l.v(runnable);
        }
    }

    class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor a() {
        return f6337b;
    }

    public static Executor b() {
        return f6336a;
    }
}

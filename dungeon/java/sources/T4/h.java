package T4;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final AtomicInteger f12266a = new AtomicInteger(0);

    public void a() {
        if (this.f12266a.compareAndSet(0, 2)) {
            d();
        }
    }

    protected abstract void b(Object obj);

    protected abstract Object c();

    protected abstract void d();

    protected abstract void e(Exception exc);

    protected abstract void f(Object obj);

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f12266a.compareAndSet(0, 1)) {
            try {
                Object objC = c();
                this.f12266a.set(3);
                try {
                    f(objC);
                } finally {
                    b(objC);
                }
            } catch (Exception e10) {
                this.f12266a.set(4);
                e(e10);
            }
        }
    }
}

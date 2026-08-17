package p419x5;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class c extends p419x5.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p042c5.b f57407f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ScheduledExecutorService f57408g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f57409h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f57410i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f57411j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f57412k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b f57413l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Runnable f57414m;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (c.this) {
                try {
                    c.this.f57409h = false;
                    if (!c.this.t()) {
                        c.this.u();
                    } else if (c.this.f57413l != null) {
                        c.this.f57413l.i();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public interface b {
        void i();
    }

    private c(p419x5.a aVar, b bVar, p042c5.b bVar2, ScheduledExecutorService scheduledExecutorService) {
        super(aVar);
        this.f57409h = false;
        this.f57411j = 2000L;
        this.f57412k = 1000L;
        this.f57414m = new a();
        this.f57413l = bVar;
        this.f57407f = bVar2;
        this.f57408g = scheduledExecutorService;
    }

    public static p419x5.b r(p419x5.a aVar, p042c5.b bVar, ScheduledExecutorService scheduledExecutorService) {
        return s(aVar, (b) aVar, bVar, scheduledExecutorService);
    }

    public static p419x5.b s(p419x5.a aVar, b bVar, p042c5.b bVar2, ScheduledExecutorService scheduledExecutorService) {
        return new c(aVar, bVar, bVar2, scheduledExecutorService);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean t() {
        return this.f57407f.now() - this.f57410i > this.f57411j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void u() {
        if (!this.f57409h) {
            this.f57409h = true;
            this.f57408g.schedule(this.f57414m, this.f57412k, TimeUnit.MILLISECONDS);
        }
    }

    @Override // p419x5.b, p419x5.a
    public boolean h(Drawable drawable, Canvas canvas, int i10) {
        this.f57410i = this.f57407f.now();
        boolean zH = super.h(drawable, canvas, i10);
        u();
        return zH;
    }
}

package Z1;

import U1.AbstractC1459a;
import android.os.HandlerThread;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f18454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Looper f18455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HandlerThread f18456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f18457d;

    public q1() {
        this(null);
    }

    public q1(Looper looper) {
        this.f18454a = new Object();
        this.f18455b = looper;
        this.f18456c = null;
        this.f18457d = 0;
    }

    public Looper a() {
        Looper looper;
        synchronized (this.f18454a) {
            try {
                if (this.f18455b == null) {
                    AbstractC1459a.g(this.f18457d == 0 && this.f18456c == null);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.f18456c = handlerThread;
                    handlerThread.start();
                    this.f18455b = this.f18456c.getLooper();
                }
                this.f18457d++;
                looper = this.f18455b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }

    public void b() {
        HandlerThread handlerThread;
        synchronized (this.f18454a) {
            try {
                AbstractC1459a.g(this.f18457d > 0);
                int i10 = this.f18457d - 1;
                this.f18457d = i10;
                if (i10 == 0 && (handlerThread = this.f18456c) != null) {
                    handlerThread.quit();
                    this.f18456c = null;
                    this.f18455b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

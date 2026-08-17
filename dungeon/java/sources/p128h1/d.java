package p128h1;

import android.os.CancellationSignal;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f42501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f42502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f42503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f42504d;

    public interface a {
        void onCancel();
    }

    private void d() {
        while (this.f42504d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void a() {
        synchronized (this) {
            try {
                if (this.f42501a) {
                    return;
                }
                this.f42501a = true;
                this.f42504d = true;
                a aVar = this.f42502b;
                Object obj = this.f42503c;
                if (aVar != null) {
                    try {
                        aVar.onCancel();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.f42504d = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (obj != null) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.f42504d = false;
                    notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Object b() {
        Object obj;
        synchronized (this) {
            try {
                if (this.f42503c == null) {
                    CancellationSignal cancellationSignal = new CancellationSignal();
                    this.f42503c = cancellationSignal;
                    if (this.f42501a) {
                        cancellationSignal.cancel();
                    }
                }
                obj = this.f42503c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public void c(a aVar) {
        synchronized (this) {
            try {
                d();
                if (this.f42502b == aVar) {
                    return;
                }
                this.f42502b = aVar;
                if (this.f42501a && aVar != null) {
                    aVar.onCancel();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package U1;

/* JADX INFO: renamed from: U1.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1469k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1466h f12914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f12915b;

    public C1469k() {
        this(InterfaceC1466h.f12906a);
    }

    public C1469k(InterfaceC1466h interfaceC1466h) {
        this.f12914a = interfaceC1466h;
    }

    public synchronized void a() {
        while (!this.f12915b) {
            this.f12914a.f();
            wait();
        }
    }

    public synchronized void b() {
        boolean z10 = false;
        while (!this.f12915b) {
            try {
                this.f12914a.f();
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean c(long j10) {
        try {
            if (j10 <= 0) {
                return this.f12915b;
            }
            long jC = this.f12914a.c();
            long j11 = j10 + jC;
            if (j11 < jC) {
                b();
            } else {
                boolean z10 = false;
                while (!this.f12915b && jC < j11) {
                    try {
                        this.f12914a.f();
                        wait(j11 - jC);
                    } catch (InterruptedException unused) {
                        z10 = true;
                    }
                    jC = this.f12914a.c();
                }
                if (z10) {
                    Thread.currentThread().interrupt();
                }
            }
            return this.f12915b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean d() {
        boolean z10;
        z10 = this.f12915b;
        this.f12915b = false;
        return z10;
    }

    public synchronized boolean e() {
        return this.f12915b;
    }

    public synchronized boolean f() {
        if (this.f12915b) {
            return false;
        }
        this.f12915b = true;
        notifyAll();
        return true;
    }
}

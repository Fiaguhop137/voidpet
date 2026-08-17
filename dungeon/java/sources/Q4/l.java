package Q4;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class l implements P4.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Object f9455i = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static l f9456j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f9457k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private P4.d f9458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f9459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f9460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f9461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f9462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private IOException f9463f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private P4.c.a f9464g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private l f9465h;

    private l() {
    }

    public static l a() {
        synchronized (f9455i) {
            try {
                l lVar = f9456j;
                if (lVar == null) {
                    return new l();
                }
                f9456j = lVar.f9465h;
                lVar.f9465h = null;
                f9457k--;
                return lVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void c() {
        this.f9458a = null;
        this.f9459b = null;
        this.f9460c = 0L;
        this.f9461d = 0L;
        this.f9462e = 0L;
        this.f9463f = null;
        this.f9464g = null;
    }

    public void b() {
        synchronized (f9455i) {
            try {
                if (f9457k < 5) {
                    c();
                    f9457k++;
                    l lVar = f9456j;
                    if (lVar != null) {
                        this.f9465h = lVar;
                    }
                    f9456j = this;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public l d(P4.d dVar) {
        this.f9458a = dVar;
        return this;
    }

    public l e(long j10) {
        this.f9461d = j10;
        return this;
    }

    public l f(long j10) {
        this.f9462e = j10;
        return this;
    }

    public l g(P4.c.a aVar) {
        this.f9464g = aVar;
        return this;
    }

    public l h(IOException iOException) {
        this.f9463f = iOException;
        return this;
    }

    public l i(long j10) {
        this.f9460c = j10;
        return this;
    }

    public l j(String str) {
        this.f9459b = str;
        return this;
    }
}

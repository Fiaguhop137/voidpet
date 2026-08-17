package H4;

import L4.l;
import android.graphics.drawable.Drawable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p310r4.q;

/* JADX INFO: loaded from: classes.dex */
public class d implements b, e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final a f4184k = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f4185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f4186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f4187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f4188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object f4189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f4190f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f4191g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f4192h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f4193i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private q f4194j;

    static class a {
        a() {
        }

        void a(Object obj) {
            obj.notifyAll();
        }

        void b(Object obj, long j10) throws InterruptedException {
            obj.wait(j10);
        }
    }

    public d(int i10, int i11) {
        this(i10, i11, true, f4184k);
    }

    d(int i10, int i11, boolean z10, a aVar) {
        this.f4185a = i10;
        this.f4186b = i11;
        this.f4187c = z10;
        this.f4188d = aVar;
    }

    private synchronized Object n(Long l10) {
        try {
            if (this.f4187c && !isDone()) {
                l.a();
            }
            if (this.f4191g) {
                throw new CancellationException();
            }
            if (this.f4193i) {
                throw new ExecutionException(this.f4194j);
            }
            if (this.f4192h) {
                return this.f4189e;
            }
            if (l10 == null) {
                this.f4188d.b(this, 0L);
            } else if (l10.longValue() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jLongValue = l10.longValue() + jCurrentTimeMillis;
                while (!isDone() && jCurrentTimeMillis < jLongValue) {
                    this.f4188d.b(this, jLongValue - jCurrentTimeMillis);
                    jCurrentTimeMillis = System.currentTimeMillis();
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            if (this.f4193i) {
                throw new ExecutionException(this.f4194j);
            }
            if (this.f4191g) {
                throw new CancellationException();
            }
            if (!this.f4192h) {
                throw new TimeoutException();
            }
            return this.f4189e;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // E4.l
    public void a() {
    }

    @Override // I4.d
    public synchronized c b() {
        return this.f4190f;
    }

    @Override // E4.l
    public void c() {
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        synchronized (this) {
            try {
                if (isDone()) {
                    return false;
                }
                this.f4191g = true;
                this.f4188d.a(this);
                c cVar = null;
                if (z10) {
                    c cVar2 = this.f4190f;
                    this.f4190f = null;
                    cVar = cVar2;
                }
                if (cVar != null) {
                    cVar.clear();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // E4.l
    public void d() {
    }

    @Override // I4.d
    public void e(I4.c cVar) {
        cVar.c(this.f4185a, this.f4186b);
    }

    @Override // H4.e
    public synchronized boolean f(Object obj, Object obj2, I4.d dVar, p274p4.a aVar, boolean z10) {
        this.f4192h = true;
        this.f4189e = obj;
        this.f4188d.a(this);
        return false;
    }

    @Override // I4.d
    public synchronized void g(c cVar) {
        this.f4190f = cVar;
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        try {
            return n(null);
        } catch (TimeoutException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) {
        return n(Long.valueOf(timeUnit.toMillis(j10)));
    }

    @Override // H4.e
    public synchronized boolean h(q qVar, Object obj, I4.d dVar, boolean z10) {
        this.f4193i = true;
        this.f4194j = qVar;
        this.f4188d.a(this);
        return false;
    }

    @Override // I4.d
    public void i(Drawable drawable) {
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
        return this.f4191g;
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isDone() {
        return this.f4191g || this.f4192h || this.f4193i;
    }

    @Override // I4.d
    public void j(Drawable drawable) {
    }

    @Override // I4.d
    public void k(I4.c cVar) {
    }

    @Override // I4.d
    public synchronized void l(Drawable drawable) {
    }

    @Override // I4.d
    public synchronized void m(Object obj, J4.b bVar) {
    }

    public String toString() {
        c cVar;
        String str;
        String str2 = super.toString() + "[status=";
        synchronized (this) {
            try {
                cVar = null;
                if (this.f4191g) {
                    str = "CANCELLED";
                } else if (this.f4193i) {
                    str = "FAILURE";
                } else if (this.f4192h) {
                    str = "SUCCESS";
                } else {
                    str = "PENDING";
                    cVar = this.f4190f;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (cVar == null) {
            return str2 + str + "]";
        }
        return str2 + str + ", request=[" + cVar + "]]";
    }
}

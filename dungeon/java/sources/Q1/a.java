package Q1;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.SystemClock;
import android.text.format.DateUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Executor f9237i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile RunnableC0152a f9238j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile RunnableC0152a f9239k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f9240l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f9241m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Handler f9242n;

    /* JADX INFO: renamed from: Q1.a$a, reason: collision with other inner class name */
    final class RunnableC0152a extends c implements Runnable {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f9243f;

        RunnableC0152a() {
        }

        @Override // Q1.c
        protected Object b() {
            return a.this.E();
        }

        @Override // Q1.c
        protected void g(Object obj) {
            a.this.y(this, obj);
        }

        @Override // Q1.c
        protected void h(Object obj) {
            a.this.z(this, obj);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9243f = false;
            a.this.A();
        }
    }

    public a(Context context) {
        super(context);
        this.f9241m = -10000L;
    }

    void A() {
        if (this.f9239k != null || this.f9238j == null) {
            return;
        }
        if (this.f9238j.f9243f) {
            this.f9238j.f9243f = false;
            this.f9242n.removeCallbacks(this.f9238j);
        }
        if (this.f9240l > 0 && SystemClock.uptimeMillis() < this.f9241m + this.f9240l) {
            this.f9238j.f9243f = true;
            this.f9242n.postAtTime(this.f9238j, this.f9241m + this.f9240l);
        } else {
            if (this.f9237i == null) {
                this.f9237i = B();
            }
            this.f9238j.c(this.f9237i);
        }
    }

    protected Executor B() {
        return AsyncTask.THREAD_POOL_EXECUTOR;
    }

    public abstract Object C();

    public void D(Object obj) {
    }

    protected Object E() {
        return C();
    }

    @Override // Q1.b
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        super.g(str, fileDescriptor, printWriter, strArr);
        if (this.f9238j != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f9238j);
            printWriter.print(" waiting=");
            printWriter.println(this.f9238j.f9243f);
        }
        if (this.f9239k != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f9239k);
            printWriter.print(" waiting=");
            printWriter.println(this.f9239k.f9243f);
        }
        if (this.f9240l != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            printWriter.print(DateUtils.formatElapsedTime(timeUnit.toSeconds(this.f9240l)));
            printWriter.print(" mLastLoadCompleteTime=");
            if (this.f9241m == -10000) {
                str2 = "--";
            } else {
                str2 = "-" + DateUtils.formatElapsedTime(timeUnit.toSeconds(SystemClock.uptimeMillis() - this.f9241m));
            }
            printWriter.print(str2);
            printWriter.println();
        }
    }

    @Override // Q1.b
    protected boolean l() {
        if (this.f9238j == null) {
            return false;
        }
        if (!j()) {
            m();
        }
        if (this.f9239k != null) {
            if (this.f9238j.f9243f) {
                this.f9238j.f9243f = false;
                this.f9242n.removeCallbacks(this.f9238j);
            }
            this.f9238j = null;
            return false;
        }
        if (this.f9238j.f9243f) {
            this.f9238j.f9243f = false;
            this.f9242n.removeCallbacks(this.f9238j);
            this.f9238j = null;
            return false;
        }
        boolean zA = this.f9238j.a(false);
        if (zA) {
            this.f9239k = this.f9238j;
            x();
        }
        this.f9238j = null;
        return zA;
    }

    @Override // Q1.b
    protected void n() {
        super.n();
        b();
        this.f9238j = new RunnableC0152a();
        A();
    }

    public void x() {
    }

    void y(RunnableC0152a runnableC0152a, Object obj) {
        D(obj);
        if (this.f9239k == runnableC0152a) {
            t();
            this.f9241m = SystemClock.uptimeMillis();
            this.f9239k = null;
            e();
            A();
        }
    }

    void z(RunnableC0152a runnableC0152a, Object obj) {
        if (this.f9238j != runnableC0152a) {
            y(runnableC0152a, obj);
            return;
        }
        if (i()) {
            D(obj);
            return;
        }
        c();
        this.f9241m = SystemClock.uptimeMillis();
        this.f9238j = null;
        f(obj);
    }
}

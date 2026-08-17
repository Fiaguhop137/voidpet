package com.applovin.impl;

import android.os.Handler;
import android.os.Looper;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f27975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p1 f27976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f27977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f27978d = new ArrayList(5);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f27979e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f27980f;

    public d3(p pVar) {
        this.f27975a = pVar;
        this.f27976b = pVar.g();
        this.f27977c = new ScheduledThreadPoolExecutor(((Integer) pVar.l().a(m2.f28209u)).intValue(), new b3(this));
    }

    public final void a() {
        synchronized (this.f27979e) {
            try {
                this.f27980f = true;
                Iterator it = this.f27978d.iterator();
                while (it.hasNext()) {
                    a(((c3) it.next()).f27969d, 0L);
                }
                this.f27978d.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(r2 r2Var) {
        try {
            Handler handler = i3.f28069a;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f27977c.submit(new c3(this.f27975a, r2Var));
                return;
            }
            Thread threadCurrentThread = Thread.currentThread();
            p pVar = this.f27975a;
            ScheduledFuture scheduledFutureB = r2Var.b(threadCurrentThread, ((Long) pVar.l().a(m2.f28211v)).longValue());
            r2Var.run();
            if (scheduledFutureB != null) {
                scheduledFutureB.cancel(false);
            }
        } catch (Throwable th) {
            p1 p1Var = this.f27976b;
            if (p1.f28289b) {
                p1Var.a(r2Var.f28322b, "Task failed execution", th);
            }
            Map map = CollectionUtils.map("source", r2Var.f28322b);
            map.put("top_main_method", th.toString());
            map.put("details", StringUtils.emptyIfNull(r2Var.f28325e));
            r2Var.f28321a.e().b(b1.f27955m, map);
        }
    }

    public final void a(r2 r2Var, long j10) {
        if (r2Var == null) {
            throw new IllegalArgumentException("No task specified");
        }
        if (j10 < 0) {
            throw new IllegalArgumentException("Invalid delay (millis) specified: " + j10);
        }
        c3 c3Var = new c3(this.f27975a, r2Var);
        if (!c3Var.f27969d.f28326f) {
            synchronized (this.f27979e) {
                if (!this.f27980f) {
                    this.f27978d.add(c3Var);
                    p1 p1Var = this.f27976b;
                    if (p1.f28289b) {
                        p1Var.b(r2Var.f28322b, "Task execution delayed until after init");
                        return;
                    }
                    return;
                }
            }
        }
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f27977c;
        if (j10 > 0) {
            scheduledThreadPoolExecutor.schedule(c3Var, j10, TimeUnit.MILLISECONDS);
        } else {
            scheduledThreadPoolExecutor.submit(c3Var);
        }
    }

    public final void b() {
        synchronized (this.f27979e) {
            this.f27980f = false;
        }
    }
}

package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p135h8.k;

/* JADX INFO: loaded from: classes2.dex */
@KeepName
public abstract class BasePendingResult<R extends p135h8.k> extends p135h8.h {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final ThreadLocal f31727m = new j0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final a f31729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final WeakReference f31730c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private p135h8.k f31734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Status f31735h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile boolean f31736i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f31737j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f31738k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f31728a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CountDownLatch f31731d = new CountDownLatch(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayList f31732e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicReference f31733f = new AtomicReference();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f31739l = false;

    public static class a extends I8.h {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                Pair pair = (Pair) message.obj;
                android.support.v4.media.session.b.a(pair.first);
                p135h8.k kVar = (p135h8.k) pair.second;
                try {
                    throw null;
                } catch (RuntimeException e10) {
                    BasePendingResult.l(kVar);
                    throw e10;
                }
            }
            if (i10 == 2) {
                ((BasePendingResult) message.obj).f(Status.f31717i);
                return;
            }
            Log.wtf("BasePendingResult", "Don't know how to handle message: " + i10, new Exception());
        }
    }

    protected BasePendingResult(p135h8.f fVar) {
        this.f31729b = new a(fVar != null ? fVar.d() : Looper.getMainLooper());
        this.f31730c = new WeakReference(fVar);
    }

    private final p135h8.k i() {
        p135h8.k kVar;
        synchronized (this.f31728a) {
            p170j8.r.p(!this.f31736i, "Result has already been consumed.");
            p170j8.r.p(g(), "Result is not ready.");
            kVar = this.f31734g;
            this.f31734g = null;
            this.f31736i = true;
        }
        android.support.v4.media.session.b.a(this.f31733f.getAndSet(null));
        return (p135h8.k) p170j8.r.l(kVar);
    }

    private final void j(p135h8.k kVar) {
        this.f31734g = kVar;
        this.f31735h = kVar.t();
        this.f31731d.countDown();
        ArrayList arrayList = this.f31732e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((h8.h.a) arrayList.get(i10)).a(this.f31735h);
        }
        this.f31732e.clear();
    }

    public static void l(p135h8.k kVar) {
    }

    @Override // p135h8.h
    public final void c(h8.h.a aVar) {
        p170j8.r.b(aVar != null, "Callback cannot be null.");
        synchronized (this.f31728a) {
            try {
                if (g()) {
                    aVar.a(this.f31735h);
                } else {
                    this.f31732e.add(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p135h8.h
    public final p135h8.k d(long j10, TimeUnit timeUnit) {
        if (j10 > 0) {
            p170j8.r.k("await must not be called on the UI thread when time is greater than zero.");
        }
        p170j8.r.p(!this.f31736i, "Result has already been consumed.");
        p170j8.r.p(true, "Cannot await if then() has been called.");
        try {
            if (!this.f31731d.await(j10, timeUnit)) {
                f(Status.f31717i);
            }
        } catch (InterruptedException unused) {
            f(Status.f31715g);
        }
        p170j8.r.p(g(), "Result is not ready.");
        return i();
    }

    protected abstract p135h8.k e(Status status);

    public final void f(Status status) {
        synchronized (this.f31728a) {
            try {
                if (!g()) {
                    h(e(status));
                    this.f31738k = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean g() {
        return this.f31731d.getCount() == 0;
    }

    public final void h(p135h8.k kVar) {
        synchronized (this.f31728a) {
            try {
                if (this.f31738k || this.f31737j) {
                    l(kVar);
                    return;
                }
                g();
                p170j8.r.p(!g(), "Results have already been set");
                p170j8.r.p(!this.f31736i, "Result has already been consumed");
                j(kVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k() {
        boolean z10 = true;
        if (!this.f31739l && !((Boolean) f31727m.get()).booleanValue()) {
            z10 = false;
        }
        this.f31739l = z10;
    }
}

package com.android.volley;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public class c extends Thread {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f27853g = v.f27911b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BlockingQueue f27854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BlockingQueue f27855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f27856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q f27857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f27858e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w f27859f;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f27860a;

        a(n nVar) {
            this.f27860a = nVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                c.this.f27855b.put(this.f27860a);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public c(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, b bVar, q qVar) {
        this.f27854a = blockingQueue;
        this.f27855b = blockingQueue2;
        this.f27856c = bVar;
        this.f27857d = qVar;
        this.f27859f = new w(this, blockingQueue2, qVar);
    }

    private void b() throws InterruptedException {
        c((n) this.f27854a.take());
    }

    void c(n nVar) {
        nVar.addMarker("cache-queue-take");
        nVar.sendEvent(1);
        try {
            if (nVar.isCanceled()) {
                nVar.finish("cache-discard-canceled");
                return;
            }
            b.a aVarA = this.f27856c.a(nVar.getCacheKey());
            if (aVarA == null) {
                nVar.addMarker("cache-miss");
                if (!this.f27859f.c(nVar)) {
                    this.f27855b.put(nVar);
                }
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (aVarA.b(jCurrentTimeMillis)) {
                nVar.addMarker("cache-hit-expired");
                nVar.setCacheEntry(aVarA);
                if (!this.f27859f.c(nVar)) {
                    this.f27855b.put(nVar);
                }
                return;
            }
            nVar.addMarker("cache-hit");
            p networkResponse = nVar.parseNetworkResponse(new k(aVarA.f27845a, aVarA.f27851g));
            nVar.addMarker("cache-hit-parsed");
            if (!networkResponse.b()) {
                nVar.addMarker("cache-parsing-failed");
                this.f27856c.b(nVar.getCacheKey(), true);
                nVar.setCacheEntry(null);
                if (!this.f27859f.c(nVar)) {
                    this.f27855b.put(nVar);
                }
                return;
            }
            if (aVarA.c(jCurrentTimeMillis)) {
                nVar.addMarker("cache-hit-refresh-needed");
                nVar.setCacheEntry(aVarA);
                networkResponse.f27907d = true;
                if (this.f27859f.c(nVar)) {
                    this.f27857d.a(nVar, networkResponse);
                } else {
                    this.f27857d.b(nVar, networkResponse, new a(nVar));
                }
            } else {
                this.f27857d.a(nVar, networkResponse);
            }
        } finally {
            nVar.sendEvent(2);
        }
    }

    public void d() {
        this.f27858e = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        if (f27853g) {
            v.e("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f27856c.initialize();
        while (true) {
            try {
                b();
            } catch (InterruptedException unused) {
                if (this.f27858e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                v.c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}

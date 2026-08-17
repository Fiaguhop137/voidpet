package com.android.volley;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public class i extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BlockingQueue f27874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f27875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f27876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q f27877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f27878e = false;

    public i(BlockingQueue blockingQueue, h hVar, b bVar, q qVar) {
        this.f27874a = blockingQueue;
        this.f27875b = hVar;
        this.f27876c = bVar;
        this.f27877d = qVar;
    }

    private void a(n nVar) {
        TrafficStats.setThreadStatsTag(nVar.getTrafficStatsTag());
    }

    private void b(n nVar, u uVar) {
        this.f27877d.c(nVar, nVar.parseNetworkError(uVar));
    }

    private void c() throws InterruptedException {
        d((n) this.f27874a.take());
    }

    void d(n nVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        nVar.sendEvent(3);
        try {
            nVar.addMarker("network-queue-take");
            if (nVar.isCanceled()) {
                nVar.finish("network-discard-cancelled");
                nVar.notifyListenerResponseNotUsable();
                return;
            }
            a(nVar);
            k kVarA = this.f27875b.a(nVar);
            nVar.addMarker("network-http-complete");
            if (kVarA.f27883e && nVar.hasHadResponseDelivered()) {
                nVar.finish("not-modified");
                nVar.notifyListenerResponseNotUsable();
                return;
            }
            p networkResponse = nVar.parseNetworkResponse(kVarA);
            nVar.addMarker("network-parse-complete");
            if (nVar.shouldCache() && networkResponse.f27905b != null) {
                this.f27876c.c(nVar.getCacheKey(), networkResponse.f27905b);
                nVar.addMarker("network-cache-written");
            }
            nVar.markDelivered();
            this.f27877d.a(nVar, networkResponse);
            nVar.notifyListenerResponseReceived(networkResponse);
        } catch (u e10) {
            e10.a(SystemClock.elapsedRealtime() - jElapsedRealtime);
            b(nVar, e10);
            nVar.notifyListenerResponseNotUsable();
        } catch (Exception e11) {
            v.d(e11, "Unhandled exception %s", e11.toString());
            u uVar = new u(e11);
            uVar.a(SystemClock.elapsedRealtime() - jElapsedRealtime);
            this.f27877d.c(nVar, uVar);
            nVar.notifyListenerResponseNotUsable();
        } finally {
            nVar.sendEvent(4);
        }
    }

    public void e() {
        this.f27878e = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                c();
            } catch (InterruptedException unused) {
                if (this.f27878e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                v.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}

package com.facebook.react.modules.debug;

import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements NotThreadSafeBridgeIdleDebugListener, p008a7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f29904a = new ArrayList(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f29905b = new ArrayList(20);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f29906c = new ArrayList(20);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList f29907d = new ArrayList(20);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f29908e = true;

    private final boolean c(long j10, long j11) {
        long jE = e.e(this.f29904a, j10, j11);
        long jE2 = e.e(this.f29905b, j10, j11);
        if (jE == -1 && jE2 == -1) {
            return this.f29908e;
        }
        return jE > jE2;
    }

    @Override // p008a7.a
    public synchronized void a() {
        this.f29907d.add(Long.valueOf(System.nanoTime()));
    }

    @Override // p008a7.a
    public synchronized void b() {
        this.f29906c.add(Long.valueOf(System.nanoTime()));
    }

    public final synchronized boolean d(long j10, long j11) {
        boolean z10;
        try {
            boolean zF = e.f(this.f29907d, j10, j11);
            boolean zC = c(j10, j11);
            z10 = true;
            if (!zF && (!zC || e.f(this.f29906c, j10, j11))) {
                z10 = false;
            }
            e.d(this.f29904a, j11);
            e.d(this.f29905b, j11);
            e.d(this.f29906c, j11);
            e.d(this.f29907d, j11);
            this.f29908e = zC;
        } catch (Throwable th) {
            throw th;
        }
        return z10;
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public synchronized void onBridgeDestroyed() {
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public synchronized void onTransitionToBridgeBusy() {
        this.f29905b.add(Long.valueOf(System.nanoTime()));
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public synchronized void onTransitionToBridgeIdle() {
        this.f29904a.add(Long.valueOf(System.nanoTime()));
    }
}

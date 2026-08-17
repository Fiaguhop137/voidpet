package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: com.google.android.gms.common.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class ServiceConnectionC2307a implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f31708a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BlockingQueue f31709b = new LinkedBlockingQueue();

    public IBinder a() {
        p170j8.r.k("BlockingServiceConnection.getService() called on main thread");
        if (this.f31708a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f31708a = true;
        return (IBinder) this.f31709b.take();
    }

    public IBinder b(long j10, TimeUnit timeUnit) throws TimeoutException {
        p170j8.r.k("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f31708a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f31708a = true;
        IBinder iBinder = (IBinder) this.f31709b.poll(j10, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f31709b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}

package com.google.android.gms.measurement;

import T8.I;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.D5;

/* JADX INFO: loaded from: classes2.dex */
public final class AppMeasurementService extends Service implements I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private D5 f34841a;

    private final D5 a() {
        if (this.f34841a == null) {
            this.f34841a = new D5(this);
        }
        return this.f34841a;
    }

    @Override // T8.I
    public final boolean e(int i10) {
        return stopSelfResult(i10);
    }

    @Override // T8.I
    public final void f(Intent intent) {
        K1.a.b(intent);
    }

    @Override // T8.I
    public final void g(JobParameters jobParameters, boolean z10) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return a().d(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        a().a();
    }

    @Override // android.app.Service
    public void onDestroy() {
        a().b();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        a();
        D5.i(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        a().c(intent, i10, i11);
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        a();
        D5.j(intent);
        return true;
    }
}

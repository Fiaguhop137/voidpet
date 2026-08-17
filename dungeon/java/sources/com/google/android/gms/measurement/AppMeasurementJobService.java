package com.google.android.gms.measurement;

import T8.I;
import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.D5;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private D5 f34839a;

    private final D5 a() {
        if (this.f34839a == null) {
            this.f34839a = new D5(this);
        }
        return this.f34839a;
    }

    @Override // T8.I
    public final boolean e(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // T8.I
    public final void f(Intent intent) {
    }

    @Override // T8.I
    public final void g(JobParameters jobParameters, boolean z10) {
        jobFinished(jobParameters, false);
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

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        a().e(jobParameters);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        a();
        D5.j(intent);
        return true;
    }
}

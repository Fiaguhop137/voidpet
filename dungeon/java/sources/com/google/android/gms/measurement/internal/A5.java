package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class A5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ D5 f34860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C3032q2 f34861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ JobParameters f34862c;

    /* synthetic */ A5(D5 d10, C3032q2 c3032q2, JobParameters jobParameters) {
        this.f34860a = d10;
        this.f34861b = c3032q2;
        this.f34862c = jobParameters;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        this.f34860a.g(this.f34861b, this.f34862c);
    }
}

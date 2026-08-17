package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class B5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ D5 f34881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ JobParameters f34882b;

    /* synthetic */ B5(D5 d10, JobParameters jobParameters) {
        this.f34881a = d10;
        this.f34882b = jobParameters;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        this.f34881a.h(this.f34882b);
    }
}

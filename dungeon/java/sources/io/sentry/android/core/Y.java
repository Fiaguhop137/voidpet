package io.sentry.android.core;

import android.content.res.Configuration;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Y implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppComponentsBreadcrumbsIntegration f44818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f44819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Configuration f44820c;

    public /* synthetic */ Y(AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration, long j10, Configuration configuration) {
        this.f44818a = appComponentsBreadcrumbsIntegration;
        this.f44819b = j10;
        this.f44820c = configuration;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f44818a.d(this.f44819b, this.f44820c);
    }
}

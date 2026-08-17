package io.sentry.android.core;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SystemEventsBreadcrumbsIntegration f44914a;

    public /* synthetic */ h1(SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration) {
        this.f44914a = systemEventsBreadcrumbsIntegration;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f44914a.m();
    }
}

package io.sentry.android.core;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Z implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppComponentsBreadcrumbsIntegration f44822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f44823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f44824c;

    public /* synthetic */ Z(AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration, long j10, int i10) {
        this.f44822a = appComponentsBreadcrumbsIntegration;
        this.f44823b = j10;
        this.f44824c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f44822a.e(this.f44823b, this.f44824c);
    }
}

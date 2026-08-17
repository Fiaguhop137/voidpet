package io.sentry.android.core;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Q implements io.sentry.util.p.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SentryAndroidOptions f44727a;

    public /* synthetic */ Q(SentryAndroidOptions sentryAndroidOptions) {
        this.f44727a = sentryAndroidOptions;
    }

    @Override // io.sentry.util.p.a
    public final Object a() {
        return this.f44727a.getExecutorService();
    }
}

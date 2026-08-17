package io.sentry.android.core;

import io.sentry.InterfaceC3619a0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class V0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SendCachedEnvelopeIntegration f44810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SentryAndroidOptions f44811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3619a0 f44812c;

    public /* synthetic */ V0(SendCachedEnvelopeIntegration sendCachedEnvelopeIntegration, SentryAndroidOptions sentryAndroidOptions, InterfaceC3619a0 interfaceC3619a0) {
        this.f44810a = sendCachedEnvelopeIntegration;
        this.f44811b = sentryAndroidOptions;
        this.f44812c = interfaceC3619a0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SendCachedEnvelopeIntegration.a(this.f44810a, this.f44811b, this.f44812c);
    }
}

package io.sentry.android.core;

import io.sentry.protocol.C3761e;

/* JADX INFO: renamed from: io.sentry.android.core.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC3679y0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3681z0 f45210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3761e f45211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f45212c;

    public /* synthetic */ RunnableC3679y0(C3681z0 c3681z0, C3761e c3761e, boolean z10) {
        this.f45210a = c3681z0;
        this.f45211b = c3761e;
        this.f45212c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3681z0.b(this.f45210a, this.f45211b, this.f45212c);
    }
}

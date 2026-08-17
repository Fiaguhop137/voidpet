package io.sentry.util;

import io.sentry.ILogger;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements l.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ILogger f46568a;

    public /* synthetic */ k(ILogger iLogger) {
        this.f46568a = iLogger;
    }

    @Override // io.sentry.util.l.b
    public final void a(Object obj, Class cls) {
        t.a(cls, obj, this.f46568a);
    }
}

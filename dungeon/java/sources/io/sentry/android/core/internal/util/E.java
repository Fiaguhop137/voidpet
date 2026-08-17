package io.sentry.android.core.internal.util;

import io.sentry.EnumC3721i3;
import io.sentry.ILogger;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class E implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ILogger f45006a;

    public /* synthetic */ E(ILogger iLogger) {
        this.f45006a = iLogger;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        this.f45006a.b(EnumC3721i3.ERROR, "Error during frames measurements.", th);
    }
}

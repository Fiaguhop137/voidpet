package io.sentry.transport;

import io.sentry.ILogger;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: io.sentry.transport.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RejectedExecutionHandlerC3792a implements RejectedExecutionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.sentry.cache.g f46501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ILogger f46502b;

    public /* synthetic */ RejectedExecutionHandlerC3792a(io.sentry.cache.g gVar, ILogger iLogger) {
        this.f46501a = gVar;
        this.f46502b = iLogger;
    }

    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        e.d(this.f46501a, this.f46502b, runnable, threadPoolExecutor);
    }
}

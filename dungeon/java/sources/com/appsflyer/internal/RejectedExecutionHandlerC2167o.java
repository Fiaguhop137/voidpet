package com.appsflyer.internal;

import java.util.Queue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: com.appsflyer.internal.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RejectedExecutionHandlerC2167o implements RejectedExecutionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Queue f28516a;

    public /* synthetic */ RejectedExecutionHandlerC2167o(Queue queue) {
        this.f28516a = queue;
    }

    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        AFc1jSDK.getMonetizationNetwork(this.f28516a, runnable, threadPoolExecutor);
    }
}

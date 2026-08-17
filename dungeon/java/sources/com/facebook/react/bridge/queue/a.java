package com.facebook.react.bridge.queue;

import com.facebook.react.common.futures.SimpleSettableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SimpleSettableFuture f29497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Callable f29498b;

    public /* synthetic */ a(SimpleSettableFuture simpleSettableFuture, Callable callable) {
        this.f29497a = simpleSettableFuture;
        this.f29498b = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MessageQueueThreadImpl.callOnQueue$lambda$0(this.f29497a, this.f29498b);
    }
}

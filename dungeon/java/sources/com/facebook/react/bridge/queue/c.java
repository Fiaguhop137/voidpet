package com.facebook.react.bridge.queue;

import com.facebook.react.common.futures.SimpleSettableFuture;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SimpleSettableFuture f29500a;

    public /* synthetic */ c(SimpleSettableFuture simpleSettableFuture) {
        this.f29500a = simpleSettableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MessageQueueThreadImpl.Companion.startNewBackgroundThread$lambda$1(this.f29500a);
    }
}

package com.facebook.react.bridge.queue;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MessageQueueThreadImpl f29499a;

    public /* synthetic */ b(MessageQueueThreadImpl messageQueueThreadImpl) {
        this.f29499a = messageQueueThreadImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MessageQueueThreadImpl.resetPerfStats$lambda$1(this.f29499a);
    }
}

package com.swmansion.worklets;

/* JADX INFO: loaded from: classes2.dex */
@p276p6.a
public class WorkletsMessageQueueThread extends WorkletsMessageQueueThreadBase {
    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public boolean isIdle() {
        return this.f39360a.isIdle();
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public boolean runOnQueue(Runnable runnable) {
        return this.f39360a.runOnQueue(runnable);
    }
}

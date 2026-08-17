package com.swmansion.worklets;

import com.facebook.react.bridge.queue.QueueThreadExceptionHandler;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements QueueThreadExceptionHandler {
    @Override // com.facebook.react.bridge.queue.QueueThreadExceptionHandler
    public final void handleException(Exception exc) {
        WorkletsMessageQueueThreadBase.a(exc);
    }
}

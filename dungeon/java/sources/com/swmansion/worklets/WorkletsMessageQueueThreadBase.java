package com.swmansion.worklets;

import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.bridge.queue.MessageQueueThreadImpl;
import com.facebook.react.bridge.queue.MessageQueueThreadPerfStats;
import com.facebook.react.bridge.queue.MessageQueueThreadSpec;
import java.lang.reflect.Field;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
@p276p6.a
public abstract class WorkletsMessageQueueThreadBase implements MessageQueueThread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final MessageQueueThreadImpl f39360a = MessageQueueThreadImpl.create(MessageQueueThreadSpec.mainThreadSpec(), new c());

    public static /* synthetic */ void a(Exception exc) {
        throw new RuntimeException(exc);
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public void assertIsOnThread() {
        this.f39360a.assertIsOnThread();
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public void assertIsOnThread(String str) {
        this.f39360a.assertIsOnThread(str);
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public Future callOnQueue(Callable callable) {
        return this.f39360a.callOnQueue(callable);
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    /* JADX INFO: renamed from: getPerfStats */
    public MessageQueueThreadPerfStats getStats() {
        return this.f39360a.getStats();
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public boolean isOnThread() {
        return this.f39360a.isOnThread();
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public void quitSynchronous() {
        try {
            Field declaredField = this.f39360a.getClass().getDeclaredField("mIsFinished");
            declaredField.setAccessible(true);
            declaredField.set(this.f39360a, Boolean.TRUE);
            declaredField.setAccessible(false);
        } catch (IllegalAccessException | NoSuchFieldException e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public void resetPerfStats() {
        this.f39360a.resetPerfStats();
    }
}

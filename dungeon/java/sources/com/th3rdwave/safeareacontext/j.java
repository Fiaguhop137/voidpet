package com.th3rdwave.safeareacontext;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.A;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReentrantLock f39379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f39380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Condition f39381c;

    public /* synthetic */ j(ReentrantLock reentrantLock, A a10, Condition condition) {
        this.f39379a = reentrantLock;
        this.f39380b = a10;
        this.f39381c = condition;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k.C(this.f39379a, this.f39380b, this.f39381c);
    }
}

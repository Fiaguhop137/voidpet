package com.facebook.imagepipeline.producers;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class q0 implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f29238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f29239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Deque f29240c;

    public q0(Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f29238a = executor;
        this.f29240c = new ArrayDeque();
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public synchronized void a(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f29240c.remove(runnable);
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public synchronized void b(Runnable runnable) {
        try {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            if (this.f29239b) {
                this.f29240c.add(runnable);
            } else {
                this.f29238a.execute(runnable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}

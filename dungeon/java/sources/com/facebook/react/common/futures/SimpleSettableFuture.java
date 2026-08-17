package com.facebook.react.common.futures;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SimpleSettableFuture implements Future {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CountDownLatch f29517a = new CountDownLatch(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f29518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Exception f29519c;

    private final void a() {
        if (this.f29517a.getCount() == 0) {
            throw new RuntimeException("Result has already been set!");
        }
    }

    public final Object b() {
        try {
            return get();
        } catch (InterruptedException e10) {
            throw new RuntimeException(e10);
        } catch (ExecutionException e11) {
            throw new RuntimeException(e11);
        }
    }

    public final void c(Object obj) {
        a();
        this.f29518b = obj;
        this.f29517a.countDown();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        throw new UnsupportedOperationException();
    }

    public final void d(Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        a();
        this.f29519c = exception;
        this.f29517a.countDown();
    }

    @Override // java.util.concurrent.Future
    public Object get() throws ExecutionException, InterruptedException {
        this.f29517a.await();
        if (this.f29519c == null) {
            return this.f29518b;
        }
        throw new ExecutionException(this.f29519c);
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit unit) throws ExecutionException, TimeoutException {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (!this.f29517a.await(j10, unit)) {
            throw new TimeoutException("Timed out waiting for result");
        }
        if (this.f29519c == null) {
            return this.f29518b;
        }
        throw new ExecutionException(this.f29519c);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f29517a.getCount() == 0;
    }
}

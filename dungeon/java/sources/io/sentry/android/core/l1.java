package io.sentry.android.core;

import android.view.View;
import io.sentry.ILogger;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f45088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f45089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f45090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f45091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ILogger f45092e;

    public /* synthetic */ l1(AtomicReference atomicReference, View view, List list, CountDownLatch countDownLatch, ILogger iLogger) {
        this.f45088a = atomicReference;
        this.f45089b = view;
        this.f45090c = list;
        this.f45091d = countDownLatch;
        this.f45092e = iLogger;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewHierarchyEventProcessor.d(this.f45088a, this.f45089b, this.f45090c, this.f45091d, this.f45092e);
    }
}

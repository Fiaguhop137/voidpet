package io.sentry.android.replay.util;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f45586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Runnable f45587b;

    public m(String taskName, Runnable delegate) {
        Intrinsics.checkNotNullParameter(taskName, "taskName");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f45586a = taskName;
        this.f45587b = delegate;
    }

    public final String a() {
        return this.f45586a;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f45587b.run();
    }
}

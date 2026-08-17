package io.sentry.android.core;

import io.sentry.G1;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Y0 implements G1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f44821a;

    public /* synthetic */ Y0(AtomicBoolean atomicBoolean) {
        this.f44821a = atomicBoolean;
    }

    @Override // io.sentry.G1
    public final void a(io.sentry.Y y10) {
        Z0.b(this.f44821a, y10);
    }
}

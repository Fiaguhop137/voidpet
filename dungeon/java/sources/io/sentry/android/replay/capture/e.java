package io.sentry.android.replay.capture;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f45385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f45386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f45387c;

    public /* synthetic */ e(f fVar, Function2 function2, long j10) {
        this.f45385a = fVar;
        this.f45386b = function2;
        this.f45387c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f.Q(this.f45385a, this.f45386b, this.f45387c);
    }
}

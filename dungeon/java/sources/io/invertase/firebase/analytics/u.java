package io.invertase.firebase.analytics;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f44174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f44175b;

    public /* synthetic */ u(v vVar, long j10) {
        this.f44174a = vVar;
        this.f44175b = j10;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f44174a.s(this.f44175b);
    }
}

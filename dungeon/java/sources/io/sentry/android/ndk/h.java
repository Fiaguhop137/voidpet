package io.sentry.android.ndk;

import io.sentry.T3;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f45243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T3 f45244b;

    public /* synthetic */ h(i iVar, T3 t10) {
        this.f45243a = iVar;
        this.f45244b = t10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i iVar = this.f45243a;
        T3 t10 = this.f45244b;
        iVar.f45246b.h(t10.p().toString(), t10.m().toString());
    }
}

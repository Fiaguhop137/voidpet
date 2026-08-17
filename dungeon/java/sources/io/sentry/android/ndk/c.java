package io.sentry.android.ndk;

import io.sentry.C3697e;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f45231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3697e f45232b;

    public /* synthetic */ c(i iVar, C3697e c3697e) {
        this.f45231a = iVar;
        this.f45232b = c3697e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i.q(this.f45231a, this.f45232b);
    }
}

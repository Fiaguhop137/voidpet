package io.sentry.android.ndk;

import io.sentry.protocol.I;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f45229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f45230b;

    public /* synthetic */ b(i iVar, I i10) {
        this.f45229a = iVar;
        this.f45230b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i.n(this.f45229a, this.f45230b);
    }
}

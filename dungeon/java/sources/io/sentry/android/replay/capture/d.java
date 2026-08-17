package io.sentry.android.replay.capture;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ File f45383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f45384b;

    public /* synthetic */ d(File file, f fVar) {
        this.f45383a = file;
        this.f45384b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f.S(this.f45383a, this.f45384b);
    }
}

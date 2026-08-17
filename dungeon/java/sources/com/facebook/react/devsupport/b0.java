package com.facebook.react.devsupport;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LogBoxModule f29663a;

    public /* synthetic */ b0(LogBoxModule logBoxModule) {
        this.f29663a = logBoxModule;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LogBoxModule.hide$lambda$1(this.f29663a);
    }
}

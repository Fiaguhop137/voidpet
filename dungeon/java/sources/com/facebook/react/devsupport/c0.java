package com.facebook.react.devsupport;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LogBoxModule f29666a;

    public /* synthetic */ c0(LogBoxModule logBoxModule) {
        this.f29666a = logBoxModule;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LogBoxModule.invalidate$lambda$2(this.f29666a);
    }
}

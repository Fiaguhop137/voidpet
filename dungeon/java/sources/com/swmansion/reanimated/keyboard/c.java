package com.swmansion.reanimated.keyboard;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WindowsInsetsManager f38931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f38932b;

    public /* synthetic */ c(WindowsInsetsManager windowsInsetsManager, boolean z10) {
        this.f38931a = windowsInsetsManager;
        this.f38932b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f38931a.lambda$updateWindowDecor$0(this.f38932b);
    }
}

package com.swmansion.reanimated.keyboard;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WindowsInsetsManager f38933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38935c;

    public /* synthetic */ d(WindowsInsetsManager windowsInsetsManager, int i10, int i11) {
        this.f38933a = windowsInsetsManager;
        this.f38934b = i10;
        this.f38935c = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f38933a.lambda$updateInsets$1(this.f38934b, this.f38935c);
    }
}

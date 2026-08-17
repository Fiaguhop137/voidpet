package com.facebook.react.fabric.mounting;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SurfaceMountingManager f29795a;

    public /* synthetic */ a(SurfaceMountingManager surfaceMountingManager) {
        this.f29795a = surfaceMountingManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f29795a.lambda$stopSurface$0();
    }
}

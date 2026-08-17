package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes2.dex */
final class V implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ W8.l f31785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ X f31786b;

    V(X x10, W8.l lVar) {
        this.f31786b = x10;
        this.f31785a = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        X.e1(this.f31786b, this.f31785a);
    }
}

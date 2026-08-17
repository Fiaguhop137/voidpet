package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes2.dex */
final class D implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f31741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ G f31742b;

    D(G g10, int i10) {
        this.f31742b = g10;
        this.f31741a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f31742b.l(this.f31741a);
    }
}

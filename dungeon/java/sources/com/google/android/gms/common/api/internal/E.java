package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes2.dex */
final class E implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ F f31743a;

    E(F f10) {
        this.f31743a = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        G g10 = this.f31743a.f31744a;
        g10.f31746f.b(g10.f31746f.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}

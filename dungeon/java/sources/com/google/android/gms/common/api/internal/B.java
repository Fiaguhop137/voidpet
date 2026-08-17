package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes2.dex */
final class B implements ComponentCallbacks2C2310c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2314g f31726a;

    B(C2314g c2314g) {
        this.f31726a = c2314g;
    }

    @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C2310c.a
    public final void a(boolean z10) {
        C2314g c2314g = this.f31726a;
        c2314g.f31832n.sendMessage(c2314g.f31832n.obtainMessage(1, Boolean.valueOf(z10)));
    }
}

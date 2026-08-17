package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* JADX INFO: loaded from: classes2.dex */
final class g0 extends M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Dialog f31834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ h0 f31835b;

    g0(h0 h0Var, Dialog dialog) {
        this.f31835b = h0Var;
        this.f31834a = dialog;
    }

    @Override // com.google.android.gms.common.api.internal.M
    public final void a() {
        this.f31835b.f31837b.d();
        if (this.f31834a.isShowing()) {
            this.f31834a.dismiss();
        }
    }
}

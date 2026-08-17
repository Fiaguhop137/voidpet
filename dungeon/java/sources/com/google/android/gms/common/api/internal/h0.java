package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.C2333b;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: loaded from: classes2.dex */
final class h0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f0 f31836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ i0 f31837b;

    h0(i0 i0Var, f0 f0Var) {
        this.f31837b = i0Var;
        this.f31836a = f0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f31837b.f31839a) {
            C2333b c2333bB = this.f31836a.b();
            if (c2333bB.e4()) {
                i0 i0Var = this.f31837b;
                i0Var.mLifecycleFragment.startActivityForResult(GoogleApiActivity.a(i0Var.getActivity(), (PendingIntent) p170j8.r.l(c2333bB.d4()), this.f31836a.a(), false), 1);
                return;
            }
            i0 i0Var2 = this.f31837b;
            if (i0Var2.f31842d.b(i0Var2.getActivity(), c2333bB.b4(), null) != null) {
                i0 i0Var3 = this.f31837b;
                i0Var3.f31842d.y(i0Var3.getActivity(), i0Var3.mLifecycleFragment, c2333bB.b4(), 2, this.f31837b);
                return;
            }
            if (c2333bB.b4() != 18) {
                this.f31837b.a(c2333bB, this.f31836a.a());
                return;
            }
            i0 i0Var4 = this.f31837b;
            Dialog dialogT = i0Var4.f31842d.t(i0Var4.getActivity(), i0Var4);
            i0 i0Var5 = this.f31837b;
            i0Var5.f31842d.u(i0Var5.getActivity().getApplicationContext(), new g0(this, dialogT));
        }
    }
}

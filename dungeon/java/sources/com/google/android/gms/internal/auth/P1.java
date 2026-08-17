package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.C2335d;
import com.google.android.gms.common.api.internal.InterfaceC2313f;
import com.google.android.gms.common.api.internal.InterfaceC2321n;
import p170j8.AbstractC3843h;
import p170j8.C3840e;

/* JADX INFO: loaded from: classes2.dex */
final class P1 extends AbstractC3843h {
    P1(Context context, Looper looper, C3840e c3840e, InterfaceC2313f interfaceC2313f, InterfaceC2321n interfaceC2321n) {
        super(context, looper, 224, c3840e, interfaceC2313f, interfaceC2321n);
    }

    @Override // p170j8.AbstractC3839d
    protected final String E() {
        return "com.google.android.gms.auth.account.data.IGoogleAuthService";
    }

    @Override // p170j8.AbstractC3839d
    protected final String F() {
        return "com.google.android.gms.auth.account.authapi.START";
    }

    @Override // p170j8.AbstractC3839d
    protected final boolean I() {
        return true;
    }

    @Override // p170j8.AbstractC3839d
    public final boolean S() {
        return true;
    }

    @Override // p170j8.AbstractC3839d, h8.a.f
    public final void b(String str) {
        Log.w("GoogleAuthSvcClientImpl", "GoogleAuthServiceClientImpl disconnected with reason: ".concat(String.valueOf(str)));
        super.b(str);
    }

    @Override // p170j8.AbstractC3839d, h8.a.f
    public final int m() {
        return 17895000;
    }

    @Override // p170j8.AbstractC3839d
    protected final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IGoogleAuthService");
        return iInterfaceQueryLocalInterface instanceof S1 ? (S1) iInterfaceQueryLocalInterface : new S1(iBinder);
    }

    @Override // p170j8.AbstractC3839d
    public final C2335d[] v() {
        return new C2335d[]{p009a8.e.f19533l, p009a8.e.f19532k, p009a8.e.f19522a};
    }
}

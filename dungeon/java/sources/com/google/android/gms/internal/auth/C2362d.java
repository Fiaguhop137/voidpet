package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.InterfaceC2313f;
import com.google.android.gms.common.api.internal.InterfaceC2321n;
import p170j8.AbstractC3843h;
import p170j8.C3840e;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2362d extends AbstractC3843h {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final Bundle f32304I;

    public C2362d(Context context, Looper looper, C3840e c3840e, p027b8.c cVar, InterfaceC2313f interfaceC2313f, InterfaceC2321n interfaceC2321n) {
        super(context, looper, 16, c3840e, interfaceC2313f, interfaceC2321n);
        this.f32304I = new Bundle();
    }

    @Override // p170j8.AbstractC3839d
    protected final Bundle A() {
        return this.f32304I;
    }

    @Override // p170j8.AbstractC3839d
    protected final String E() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // p170j8.AbstractC3839d
    protected final String F() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // p170j8.AbstractC3839d
    public final boolean S() {
        return true;
    }

    @Override // p170j8.AbstractC3839d, h8.a.f
    public final boolean f() {
        C3840e c3840eJ0 = j0();
        return (TextUtils.isEmpty(c3840eJ0.b()) || c3840eJ0.e(p027b8.b.f26439a).isEmpty()) ? false : true;
    }

    @Override // p170j8.AbstractC3839d, h8.a.f
    public final int m() {
        return 12451000;
    }

    @Override // p170j8.AbstractC3839d
    protected final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return iInterfaceQueryLocalInterface instanceof C2365e ? (C2365e) iInterfaceQueryLocalInterface : new C2365e(iBinder);
    }
}

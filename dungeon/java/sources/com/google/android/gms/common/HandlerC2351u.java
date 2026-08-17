package com.google.android.gms.common;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.common.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class HandlerC2351u extends I8.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f31932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ C2341j f31933c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC2351u(C2341j c2341j, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f31933c = c2341j;
        this.f31932b = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i10);
            return;
        }
        C2341j c2341j = this.f31933c;
        int iG = c2341j.g(this.f31932b);
        if (c2341j.j(iG)) {
            this.f31933c.r(this.f31932b, iG);
        }
    }
}

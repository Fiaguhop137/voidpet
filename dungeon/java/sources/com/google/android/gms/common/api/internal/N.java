package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class N extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f31769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M f31770b;

    public N(M m10) {
        this.f31770b = m10;
    }

    public final void a(Context context) {
        this.f31769a = context;
    }

    public final synchronized void b() {
        try {
            Context context = this.f31769a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f31769a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f31770b.a();
            b();
        }
    }
}

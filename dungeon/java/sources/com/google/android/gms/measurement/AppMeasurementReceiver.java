package com.google.android.gms.measurement;

import T8.m;
import T8.n;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final class AppMeasurementReceiver extends K1.a implements m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private n f34840c;

    @Override // T8.m
    public void a(Context context, Intent intent) {
        K1.a.c(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.f34840c == null) {
            this.f34840c = new n(this);
        }
        this.f34840c.a(context, intent);
    }
}

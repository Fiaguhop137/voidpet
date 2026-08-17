package com.applovin.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class k2 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SessionTracker f28094a;

    public k2(SessionTracker sessionTracker) {
        this.f28094a = sessionTracker;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.intent.action.USER_PRESENT".equals(action)) {
            if (e2.a()) {
                SessionTracker.a(this.f28094a);
            }
        } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
            SessionTracker.b(this.f28094a);
        }
    }
}

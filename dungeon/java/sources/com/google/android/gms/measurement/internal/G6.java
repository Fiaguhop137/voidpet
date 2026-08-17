package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.C2517j7;

/* JADX INFO: loaded from: classes2.dex */
public final class G6 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X2 f35027a;

    public G6(X2 x10) {
        this.f35027a = x10;
    }

    final /* synthetic */ void a() {
        this.f35027a.N().o(((Long) AbstractC2934d2.f35389D.b(null)).longValue());
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004c  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        byte b10;
        if (intent == null) {
            this.f35027a.a().r().a("App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            this.f35027a.a().r().a("App receiver called with null action");
            return;
        }
        int iHashCode = action.hashCode();
        if (iHashCode != -1928239649) {
            if (iHashCode == 1279883384 && action.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                b10 = 1;
            } else {
                b10 = -1;
            }
        } else if (action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            b10 = 0;
        } else {
            b10 = -1;
        }
        if (b10 != 0) {
            if (b10 != 1) {
                this.f35027a.a().r().a("App receiver called with unknown action");
                return;
            }
            X2 x10 = this.f35027a;
            x10.a().w().a("[sgtm] App Receiver notified batches are available");
            x10.b().t(new D6(this));
            return;
        }
        X2 x11 = this.f35027a;
        C2517j7.a();
        if (x11.w().H(null, AbstractC2934d2.f35418R0)) {
            x11.a().w().a("App receiver notified triggers are available");
            x11.b().t(new E6(x11));
        }
    }
}

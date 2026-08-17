package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.P2;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("PlatformActivityProxy")
public class ProxyBillingActivityV2 extends p054d.j {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private ResultReceiver f27555A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private ResultReceiver f27556B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private ResultReceiver f27557C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private ResultReceiver f27558D;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private p108g.c f27559w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private p108g.c f27560x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private p108g.c f27561y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private p108g.c f27562z;

    final void c0(p108g.a aVar) {
        Intent intentF = aVar.f();
        int iC = com.google.android.gms.internal.play_billing.O.h(intentF, "ProxyBillingActivityV2").c();
        ResultReceiver resultReceiver = this.f27555A;
        if (resultReceiver != null) {
            resultReceiver.send(iC, intentF == null ? null : intentF.getExtras());
        }
        if (aVar.j() != -1 || iC != 0) {
            com.google.android.gms.internal.play_billing.O.m("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + aVar.j() + " and billing's responseCode: " + iC);
        }
        finish();
    }

    final void d0(p108g.a aVar) {
        Intent intentF = aVar.f();
        int iC = com.google.android.gms.internal.play_billing.O.h(intentF, "ProxyBillingActivityV2").c();
        ResultReceiver resultReceiver = this.f27556B;
        if (resultReceiver != null) {
            resultReceiver.send(iC, intentF == null ? null : intentF.getExtras());
        }
        if (aVar.j() != -1 || iC != 0) {
            com.google.android.gms.internal.play_billing.O.m("ProxyBillingActivityV2", String.format("External offer dialog finished with resultCode: %s and billing's responseCode: %s", Integer.valueOf(aVar.j()), Integer.valueOf(iC)));
        }
        finish();
    }

    final void e0(p108g.a aVar) {
        Intent intentF = aVar.f();
        Bundle extras = intentF == null ? null : intentF.getExtras();
        if (aVar.j() != -1) {
            if (extras == null) {
                extras = new Bundle();
            }
            com.google.android.gms.internal.play_billing.O.m("ProxyBillingActivityV2", String.format("External offer flow finished with resultCode: %s", Integer.valueOf(aVar.j())));
            extras.putInt("INTERNAL_LOG_ERROR_REASON", P2.ERROR_IN_ACTIVITY_RESULT.zza());
            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", String.format("External offer flow finished with error resultCode: %s", Integer.valueOf(aVar.j())));
        }
        int iC = com.google.android.gms.internal.play_billing.O.h(intentF, "ProxyBillingActivityV2").c();
        ResultReceiver resultReceiver = this.f27557C;
        if (resultReceiver != null) {
            resultReceiver.send(iC, extras);
        } else {
            com.google.android.gms.internal.play_billing.O.m("ProxyBillingActivityV2", "External offer flow result receiver is null");
        }
        if (iC != 0) {
            com.google.android.gms.internal.play_billing.O.m("ProxyBillingActivityV2", String.format("External offer flow finished with billing responseCode: %s", Integer.valueOf(iC)));
        }
        finish();
    }

    final void f0(p108g.a aVar) {
        Intent intentF = aVar.f();
        Bundle extras = intentF == null ? null : intentF.getExtras();
        if (aVar.j() != -1) {
            if (extras == null) {
                extras = new Bundle();
            }
            com.google.android.gms.internal.play_billing.O.m("ProxyBillingActivityV2", String.format("Launch external link flow finished with resultCode: %s", Integer.valueOf(aVar.j())));
            extras.putInt("INTERNAL_LOG_ERROR_REASON", P2.ERROR_IN_ACTIVITY_RESULT.zza());
            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", String.format("Launch external link flow finished with error resultCode: %s", Integer.valueOf(aVar.j())));
        }
        int iC = com.google.android.gms.internal.play_billing.O.h(intentF, "ProxyBillingActivityV2").c();
        ResultReceiver resultReceiver = this.f27558D;
        if (resultReceiver != null) {
            resultReceiver.send(iC, extras);
        } else {
            com.google.android.gms.internal.play_billing.O.m("ProxyBillingActivityV2", "Launch external link flow result receiver is null");
        }
        if (iC != 0) {
            com.google.android.gms.internal.play_billing.O.m("ProxyBillingActivityV2", String.format("Launch external link flow finished with billing responseCode: %s", Integer.valueOf(iC)));
        }
        finish();
    }

    @Override // p054d.j, Y0.h, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f27559w = a0(new p126h.d(), new g0(this));
        this.f27560x = a0(new p126h.d(), new h0(this));
        this.f27561y = a0(new p126h.d(), new i0(this));
        this.f27562z = a0(new p126h.d(), new j0(this));
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.f27555A = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
            }
            if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                this.f27556B = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
            }
            if (bundle.containsKey("external_offer_flow_result_receiver")) {
                this.f27557C = (ResultReceiver) bundle.getParcelable("external_offer_flow_result_receiver");
            }
            if (bundle.containsKey("launch_external_link_result_receiver")) {
                this.f27558D = (ResultReceiver) bundle.getParcelable("launch_external_link_result_receiver");
                return;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.O.l("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.f27555A = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            this.f27559w.a(new g.g.a(pendingIntent).a());
            return;
        }
        if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.f27556B = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            this.f27560x.a(new g.g.a(pendingIntent2).a());
        } else if (getIntent().hasExtra("external_offer_flow_pending_intent")) {
            PendingIntent pendingIntent3 = (PendingIntent) getIntent().getParcelableExtra("external_offer_flow_pending_intent");
            this.f27557C = (ResultReceiver) getIntent().getParcelableExtra("external_offer_flow_result_receiver");
            this.f27561y.a(new g.g.a(pendingIntent3).a());
        } else if (getIntent().hasExtra("launch_external_link_flow_pending_intent")) {
            PendingIntent pendingIntent4 = (PendingIntent) getIntent().getParcelableExtra("launch_external_link_flow_pending_intent");
            this.f27558D = (ResultReceiver) getIntent().getParcelableExtra("launch_external_link_result_receiver");
            this.f27562z.a(new g.g.a(pendingIntent4).a());
        }
    }

    @Override // p054d.j, Y0.h, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f27555A;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f27556B;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
        ResultReceiver resultReceiver3 = this.f27557C;
        if (resultReceiver3 != null) {
            bundle.putParcelable("external_offer_flow_result_receiver", resultReceiver3);
        }
        ResultReceiver resultReceiver4 = this.f27558D;
        if (resultReceiver4 != null) {
            bundle.putParcelable("launch_external_link_result_receiver", resultReceiver4);
        }
    }
}

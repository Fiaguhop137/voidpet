package com.google.android.gms.games.internal.v2.resolution;

import L8.Y;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import p170j8.r;

/* JADX INFO: loaded from: classes2.dex */
public final class GamesResolutionActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ResultReceiver f32135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f32136b;

    private final void a(int i10, Intent intent) {
        Bundle bundle;
        if (this.f32136b) {
            return;
        }
        this.f32136b = true;
        ResultReceiver resultReceiver = this.f32135a;
        if (resultReceiver != null) {
            if (intent == null) {
                bundle = new Bundle();
            } else {
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("resultData", intent);
                bundle = bundle2;
            }
            resultReceiver.send(i10, bundle);
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 0) {
            a(i11, intent);
            finish();
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 25);
        sb2.append("Unexpected request code: ");
        sb2.append(i10);
        Y.f("ResultActivity", sb2.toString());
        a(0, intent);
        finish();
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f32135a = (ResultReceiver) r.l((ResultReceiver) bundle.getParcelable("resultReceiver"));
            return;
        }
        this.f32135a = (ResultReceiver) r.l((ResultReceiver) getIntent().getParcelableExtra("resultReceiver"));
        try {
            try {
                startIntentSenderForResult(((PendingIntent) r.l((PendingIntent) getIntent().getParcelableExtra("pendingIntent"))).getIntentSender(), 0, null, 0, 0, 0);
            } catch (IntentSender.SendIntentException e10) {
                e = e10;
                Y.g("ResultActivity", "Failed to launch", e);
                a(0, null);
                finish();
            }
        } catch (IntentSender.SendIntentException e11) {
            e = e11;
        }
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        if (!isChangingConfigurations()) {
            a(0, null);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("resultReceiver", this.f32135a);
    }
}

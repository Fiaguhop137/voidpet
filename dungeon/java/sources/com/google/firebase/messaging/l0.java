package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
class l0 extends Binder {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f37636e;

    interface a {
        Task a(Intent intent);
    }

    l0(a aVar) {
        this.f37636e = aVar;
    }

    void b(o0.a aVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        this.f37636e.a(aVar.f37649a).addOnCompleteListener(new androidx.privacysandbox.ads.adservices.measurement.k(), new k0(aVar));
    }
}

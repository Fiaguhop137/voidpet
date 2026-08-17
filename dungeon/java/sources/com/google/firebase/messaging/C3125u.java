package com.google.firebase.messaging;

import com.google.android.gms.tasks.OnSuccessListener;

/* JADX INFO: renamed from: com.google.firebase.messaging.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3125u implements OnSuccessListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f37656a;

    public /* synthetic */ C3125u(FirebaseMessaging firebaseMessaging) {
        this.f37656a = firebaseMessaging;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        FirebaseMessaging.h(this.f37656a, (g0) obj);
    }
}

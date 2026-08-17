package com.google.firebase.messaging;

import com.google.android.gms.tasks.OnSuccessListener;
import p117g8.C3429a;

/* JADX INFO: renamed from: com.google.firebase.messaging.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3128x implements OnSuccessListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f37660a;

    public /* synthetic */ C3128x(FirebaseMessaging firebaseMessaging) {
        this.f37660a = firebaseMessaging;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        FirebaseMessaging.f(this.f37660a, (C3429a) obj);
    }
}

package com.google.firebase.messaging;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class A implements SuccessContinuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f37451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f37452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0.a f37453c;

    public /* synthetic */ A(FirebaseMessaging firebaseMessaging, String str, b0.a aVar) {
        this.f37451a = firebaseMessaging;
        this.f37452b = str;
        this.f37453c = aVar;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        return FirebaseMessaging.a(this.f37451a, this.f37452b, this.f37453c, (String) obj);
    }
}

package com.google.firebase.messaging;

import com.google.android.gms.tasks.Task;

/* JADX INFO: renamed from: com.google.firebase.messaging.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3129y implements W.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f37661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f37662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0.a f37663c;

    public /* synthetic */ C3129y(FirebaseMessaging firebaseMessaging, String str, b0.a aVar) {
        this.f37661a = firebaseMessaging;
        this.f37662b = str;
        this.f37663c = aVar;
    }

    @Override // com.google.firebase.messaging.W.a
    public final Task start() {
        FirebaseMessaging firebaseMessaging = this.f37661a;
        return firebaseMessaging.f37471c.g().onSuccessTask(firebaseMessaging.f37475g, new A(firebaseMessaging, this.f37662b, this.f37663c));
    }
}

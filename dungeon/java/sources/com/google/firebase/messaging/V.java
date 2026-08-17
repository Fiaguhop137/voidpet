package com.google.firebase.messaging;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class V implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W f37529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f37530b;

    public /* synthetic */ V(W w10, String str) {
        this.f37529a = w10;
        this.f37530b = str;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        return W.a(this.f37529a, this.f37530b, task);
    }
}

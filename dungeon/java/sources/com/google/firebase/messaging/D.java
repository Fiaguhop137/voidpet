package com.google.firebase.messaging;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class D implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ E f37456a;

    public /* synthetic */ D(E e10) {
        this.f37456a = e10;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        return E.a(this.f37456a, task);
    }
}

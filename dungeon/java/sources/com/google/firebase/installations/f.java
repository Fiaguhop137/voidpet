package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final TaskCompletionSource f37446a;

    public f(TaskCompletionSource taskCompletionSource) {
        this.f37446a = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.h
    public boolean a(Exception exc) {
        return false;
    }

    @Override // com.google.firebase.installations.h
    public boolean b(Y9.d dVar) {
        if (!dVar.l() && !dVar.k() && !dVar.i()) {
            return false;
        }
        this.f37446a.trySetResult(dVar.d());
        return true;
    }
}

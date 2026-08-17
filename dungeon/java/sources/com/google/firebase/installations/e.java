package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f37444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TaskCompletionSource f37445b;

    public e(i iVar, TaskCompletionSource taskCompletionSource) {
        this.f37444a = iVar;
        this.f37445b = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.h
    public boolean a(Exception exc) {
        this.f37445b.trySetException(exc);
        return true;
    }

    @Override // com.google.firebase.installations.h
    public boolean b(Y9.d dVar) {
        if (!dVar.k() || this.f37444a.f(dVar)) {
            return false;
        }
        this.f37445b.setResult(g.a().b(dVar.b()).d(dVar.c()).c(dVar.h()).a());
        return true;
    }
}

package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
final class c implements IntegrityManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f37252a;

    c(i iVar) {
        this.f37252a = iVar;
    }

    @Override // com.google.android.play.core.integrity.IntegrityManager
    public final Task requestIntegrityToken(IntegrityTokenRequest integrityTokenRequest) {
        return this.f37252a.b(integrityTokenRequest);
    }
}

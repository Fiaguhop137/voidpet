package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
final class h extends p459z9.x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p459z9.z f37261e = new p459z9.z("OnRequestIntegrityTokenCallback");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TaskCompletionSource f37262f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ i f37263g;

    h(i iVar, TaskCompletionSource taskCompletionSource) {
        this.f37263g = iVar;
        this.f37262f = taskCompletionSource;
    }

    @Override // p459z9.y
    public final void G(Bundle bundle) {
        this.f37263g.f37268e.v(this.f37262f);
        this.f37261e.c("onRequestIntegrityToken", new Object[0]);
        p135h8.b bVarA = this.f37263g.f37267d.a(bundle);
        if (bVarA != null) {
            this.f37262f.trySetException(bVarA);
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.f37262f.trySetException(new a(-100, null));
            return;
        }
        g gVar = new g(this, this.f37263g.f37265b, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.f37262f;
        b bVar = new b();
        bVar.b(string);
        bVar.a(gVar);
        taskCompletionSource.trySetResult(bVar.c());
    }
}

package com.google.android.gms.auth.api.signin.internal;

import Q1.b;
import android.os.Bundle;
import java.util.Objects;
import p081e8.g;
import p135h8.f;

/* JADX INFO: loaded from: classes2.dex */
final class a implements androidx.loader.app.a.InterfaceC0304a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ SignInHubActivity f31655a;

    /* synthetic */ a(SignInHubActivity signInHubActivity, byte[] bArr) {
        Objects.requireNonNull(signInHubActivity);
        this.f31655a = signInHubActivity;
    }

    @Override // androidx.loader.app.a.InterfaceC0304a
    public final /* bridge */ /* synthetic */ void a(b bVar, Object obj) {
        SignInHubActivity signInHubActivity = this.f31655a;
        signInHubActivity.setResult(signInHubActivity.o0(), signInHubActivity.p0());
        signInHubActivity.finish();
    }

    @Override // androidx.loader.app.a.InterfaceC0304a
    public final b b(int i10, Bundle bundle) {
        return new g(this.f31655a, f.c());
    }

    @Override // androidx.loader.app.a.InterfaceC0304a
    public final void c(b bVar) {
    }
}

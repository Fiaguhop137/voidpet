package com.google.android.play.core.integrity;

/* JADX INFO: loaded from: classes2.dex */
final class o extends IntegrityTokenResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f37279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y f37280b;

    o(String str, y yVar) {
        this.f37279a = str;
        this.f37280b = yVar;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final String token() {
        return this.f37279a;
    }
}

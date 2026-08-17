package com.google.android.play.core.integrity;

/* JADX INFO: loaded from: classes2.dex */
final class b extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f37250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private y f37251b;

    b() {
    }

    @Override // com.google.android.play.core.integrity.n
    final n a(y yVar) {
        this.f37251b = yVar;
        return this;
    }

    @Override // com.google.android.play.core.integrity.n
    final n b(String str) {
        this.f37250a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.n
    final o c() {
        y yVar;
        String str = this.f37250a;
        if (str != null && (yVar = this.f37251b) != null) {
            return new o(str, yVar);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f37250a == null) {
            sb2.append(" token");
        }
        if (this.f37251b == null) {
            sb2.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}

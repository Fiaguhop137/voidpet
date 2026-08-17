package com.google.android.gms.common;

/* JADX INFO: loaded from: classes2.dex */
final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f31696a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f31697b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Boolean f31698c = null;

    /* synthetic */ Q(byte[] bArr) {
    }

    final Q a(String str) {
        this.f31696a = str;
        return this;
    }

    final Q b(boolean z10) {
        this.f31697b = Boolean.valueOf(z10);
        return this;
    }

    final Q c(boolean z10) {
        this.f31698c = Boolean.valueOf(z10);
        return this;
    }

    final S d() {
        Boolean bool = this.f31697b;
        if (bool == null) {
            throw new IllegalStateException("allowTestKeys must be set");
        }
        if (this.f31698c != null) {
            return new S(this.f31696a, bool.booleanValue(), false, false, this.f31698c.booleanValue(), false, null);
        }
        throw new IllegalStateException("isGoogleOrPlatformOnly must be set");
    }
}

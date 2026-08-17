package com.google.android.gms.internal.auth;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class H0 extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Z0 f32223a;

    public H0(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f32223a = null;
    }

    public H0(String str) {
        super(str);
        this.f32223a = null;
    }

    static H0 a() {
        return new H0("Protocol message contained an invalid tag (zero).");
    }

    static H0 b() {
        return new H0("Protocol message had invalid UTF-8.");
    }

    static H0 c() {
        return new H0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static H0 d() {
        return new H0("Failed to parse the message.");
    }

    static H0 f() {
        return new H0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final H0 e(Z0 z10) {
        this.f32223a = z10;
        return this;
    }
}

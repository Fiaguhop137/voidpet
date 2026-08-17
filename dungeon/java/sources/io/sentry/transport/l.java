package io.sentry.transport;

import java.net.Authenticator;

/* JADX INFO: loaded from: classes3.dex */
final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l f46526a = new l();

    private l() {
    }

    public static l a() {
        return f46526a;
    }

    public void b(Authenticator authenticator) {
        Authenticator.setDefault(authenticator);
    }
}

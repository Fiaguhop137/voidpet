package io.sentry.transport;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

/* JADX INFO: loaded from: classes3.dex */
final class u extends Authenticator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f46536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f46537b;

    u(String str, String str2) {
        this.f46536a = (String) io.sentry.util.w.c(str, "user is required");
        this.f46537b = (String) io.sentry.util.w.c(str2, "password is required");
    }

    @Override // java.net.Authenticator
    protected PasswordAuthentication getPasswordAuthentication() {
        if (getRequestorType() == Authenticator.RequestorType.PROXY) {
            return new PasswordAuthentication(this.f46536a, this.f46537b.toCharArray());
        }
        return null;
    }
}

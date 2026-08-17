package io.sentry.android.core.internal.util;

import android.content.ContentProvider;
import io.sentry.N0;
import io.sentry.android.core.C3636g0;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3636g0 f45053a;

    public o() {
        this(new C3636g0(N0.e()));
    }

    public o(C3636g0 c3636g0) {
        this.f45053a = c3636g0;
    }

    public void a(ContentProvider contentProvider) {
        int iD = this.f45053a.d();
        if (iD < 26 || iD > 28) {
            return;
        }
        String callingPackage = contentProvider.getCallingPackage();
        String packageName = contentProvider.getContext().getPackageName();
        if (callingPackage == null || !callingPackage.equals(packageName)) {
            throw new SecurityException("Provider does not allow for granting of Uri permissions");
        }
    }
}

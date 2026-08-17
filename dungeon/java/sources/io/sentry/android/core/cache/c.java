package io.sentry.android.core.cache;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements io.sentry.util.runtime.a.InterfaceC0545a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ File f44859a;

    public /* synthetic */ c(File file) {
        this.f44859a = file;
    }

    @Override // io.sentry.util.runtime.a.InterfaceC0545a
    public final Object run() {
        return Boolean.valueOf(this.f44859a.exists());
    }
}

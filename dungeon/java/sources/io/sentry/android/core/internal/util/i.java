package io.sentry.android.core.internal.util;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements io.sentry.util.runtime.a.InterfaceC0545a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f45050a;

    public /* synthetic */ i(Runnable runnable) {
        this.f45050a = runnable;
    }

    @Override // io.sentry.util.runtime.a.InterfaceC0545a
    public final Object run() {
        return j.c(this.f45050a);
    }
}

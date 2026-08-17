package io.sentry.android.core.internal.util;

/* JADX INFO: renamed from: io.sentry.android.core.internal.util.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC3642b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3647g f45026a;

    public /* synthetic */ RunnableC3642b(C3647g c3647g) {
        this.f45026a = c3647g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3647g.e(this.f45026a);
    }
}

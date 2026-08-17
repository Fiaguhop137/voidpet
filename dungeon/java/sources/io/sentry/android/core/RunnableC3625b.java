package io.sentry.android.core;

/* JADX INFO: renamed from: io.sentry.android.core.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC3625b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3627c f44830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.sentry.transport.o f44831b;

    public /* synthetic */ RunnableC3625b(C3627c c3627c, io.sentry.transport.o oVar) {
        this.f44830a = c3627c;
        this.f44831b = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3627c.a(this.f44830a, this.f44831b);
    }
}

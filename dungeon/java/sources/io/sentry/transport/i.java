package io.sentry.transport;

import io.sentry.C3771q2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements io.sentry.util.l.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e.c f46521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f46522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3771q2 f46523c;

    public /* synthetic */ i(e.c cVar, boolean z10, C3771q2 c3771q2) {
        this.f46521a = cVar;
        this.f46522b = z10;
        this.f46523c = c3771q2;
    }

    @Override // io.sentry.util.l.b
    public final void a(Object obj, Class cls) {
        e.c.d(this.f46521a, this.f46522b, this.f46523c, obj, cls);
    }
}

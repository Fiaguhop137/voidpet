package io.sentry.transport;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements io.sentry.util.l.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e.c f46524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f46525b;

    public /* synthetic */ k(e.c cVar, boolean z10) {
        this.f46524a = cVar;
        this.f46525b = z10;
    }

    @Override // io.sentry.util.l.b
    public final void a(Object obj, Class cls) {
        e.c.f(this.f46524a, this.f46525b, obj, cls);
    }
}

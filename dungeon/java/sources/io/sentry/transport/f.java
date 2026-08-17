package io.sentry.transport;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements io.sentry.util.l.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e.c f46518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B f46519b;

    public /* synthetic */ f(e.c cVar, B b10) {
        this.f46518a = cVar;
        this.f46519b = b10;
    }

    @Override // io.sentry.util.l.a
    public final void accept(Object obj) {
        e.c.a(this.f46518a, this.f46519b, (io.sentry.hints.q) obj);
    }
}

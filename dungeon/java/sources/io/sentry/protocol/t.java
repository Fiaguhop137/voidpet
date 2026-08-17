package io.sentry.protocol;

import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t implements io.sentry.util.p.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f46297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UUID f46298b;

    public /* synthetic */ t(x xVar, UUID uuid) {
        this.f46297a = xVar;
        this.f46298b = uuid;
    }

    @Override // io.sentry.util.p.a
    public final Object a() {
        return x.a(this.f46297a, this.f46298b);
    }
}

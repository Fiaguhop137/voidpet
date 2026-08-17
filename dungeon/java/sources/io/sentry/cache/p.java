package io.sentry.cache;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f45721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f45722b;

    public /* synthetic */ p(t tVar, Map map) {
        this.f45721a = tVar;
        this.f45722b = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f45721a.F(this.f45722b, "extras.json");
    }
}

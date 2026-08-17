package io.sentry.cache;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f45715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f45716b;

    public /* synthetic */ m(t tVar, Map map) {
        this.f45715a = tVar;
        this.f45716b = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f45715a.F(this.f45716b, "tags.json");
    }
}

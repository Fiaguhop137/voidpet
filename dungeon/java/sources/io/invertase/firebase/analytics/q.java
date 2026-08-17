package io.invertase.firebase.analytics;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f44164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f44165b;

    public /* synthetic */ q(v vVar, String str) {
        this.f44164a = vVar;
        this.f44165b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f44164a.t(this.f44165b);
    }
}

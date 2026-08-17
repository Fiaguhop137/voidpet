package io.invertase.firebase.analytics;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f44162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Boolean f44163b;

    public /* synthetic */ p(v vVar, Boolean bool) {
        this.f44162a = vVar;
        this.f44163b = bool;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f44162a.p(this.f44163b);
    }
}

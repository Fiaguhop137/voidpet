package io.invertase.firebase.analytics;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f44160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f44161b;

    public /* synthetic */ o(v vVar, Bundle bundle) {
        this.f44160a = vVar;
        this.f44161b = bundle;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f44160a.q(this.f44161b);
    }
}

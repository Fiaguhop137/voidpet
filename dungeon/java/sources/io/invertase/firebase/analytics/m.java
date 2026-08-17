package io.invertase.firebase.analytics;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f44157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f44158b;

    public /* synthetic */ m(v vVar, Bundle bundle) {
        this.f44157a = vVar;
        this.f44158b = bundle;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f44157a.u(this.f44158b);
    }
}

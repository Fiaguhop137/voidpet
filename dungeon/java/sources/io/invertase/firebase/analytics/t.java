package io.invertase.firebase.analytics;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f44172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f44173b;

    public /* synthetic */ t(v vVar, Bundle bundle) {
        this.f44172a = vVar;
        this.f44173b = bundle;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f44172a.r(this.f44173b);
    }
}

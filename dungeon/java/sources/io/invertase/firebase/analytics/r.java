package io.invertase.firebase.analytics;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f44166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f44167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f44168c;

    public /* synthetic */ r(v vVar, String str, Bundle bundle) {
        this.f44166a = vVar;
        this.f44167b = str;
        this.f44168c = bundle;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f44166a.n(this.f44167b, this.f44168c);
    }
}

package io.sentry.react;

import com.facebook.react.bridge.Promise;
import io.sentry.InterfaceC3755p2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3755p2 f46349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Promise f46350b;

    public /* synthetic */ C(InterfaceC3755p2 interfaceC3755p2, Promise promise) {
        this.f46349a = interfaceC3755p2;
        this.f46350b = promise;
    }

    @Override // java.lang.Runnable
    public final void run() {
        E.a(this.f46349a, this.f46350b);
    }
}

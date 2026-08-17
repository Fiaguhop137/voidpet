package io.sentry.react;

import android.view.Choreographer;
import com.facebook.react.bridge.Promise;
import io.sentry.InterfaceC3755p2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class D implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3755p2 f46351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Promise f46352b;

    public /* synthetic */ D(InterfaceC3755p2 interfaceC3755p2, Promise promise) {
        this.f46351a = interfaceC3755p2;
        this.f46352b = promise;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        this.f46352b.resolve(Double.valueOf(this.f46351a.now().p() / 1.0E9d));
    }
}

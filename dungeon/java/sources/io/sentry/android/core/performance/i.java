package io.sentry.android.core.performance;

import android.view.Window;
import io.sentry.android.core.internal.gestures.j;

/* JADX INFO: loaded from: classes3.dex */
public class i extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Runnable f45148b;

    public i(Window.Callback callback, Runnable runnable) {
        super(callback);
        this.f45148b = runnable;
    }

    @Override // io.sentry.android.core.internal.gestures.j, android.view.Window.Callback
    public void onContentChanged() {
        super.onContentChanged();
        this.f45148b.run();
    }
}

package io.sentry.android.core.internal.util;

import android.view.Window;
import io.sentry.android.core.C3636g0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Window f45062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Window.Callback f45063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f45064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3636g0 f45065d;

    public /* synthetic */ s(Window window, Window.Callback callback, Runnable runnable, C3636g0 c3636g0) {
        this.f45062a = window;
        this.f45063b = callback;
        this.f45064c = runnable;
        this.f45065d = c3636g0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u.b(this.f45062a, this.f45063b, this.f45064c, this.f45065d);
    }
}

package androidx.appcompat.widget;

import android.window.OnBackInvokedCallback;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k0 implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f21035a;

    public /* synthetic */ k0(Runnable runnable) {
        this.f21035a = runnable;
    }

    public final void onBackInvoked() {
        this.f21035a.run();
    }
}

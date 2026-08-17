package com.facebook.react.modules.statusbar;

import android.app.Activity;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f29979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f29980b;

    public /* synthetic */ b(Activity activity, String str) {
        this.f29979a = activity;
        this.f29980b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        StatusBarModule.setStyle$lambda$2(this.f29979a, this.f29980b);
    }
}

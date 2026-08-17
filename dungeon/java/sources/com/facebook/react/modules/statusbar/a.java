package com.facebook.react.modules.statusbar;

import android.app.Activity;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f29977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f29978b;

    public /* synthetic */ a(Activity activity, boolean z10) {
        this.f29977a = activity;
        this.f29978b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        StatusBarModule.setHidden$lambda$1(this.f29977a, this.f29978b);
    }
}

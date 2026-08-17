package com.facebook.react.modules.dialog;

import android.os.Bundle;
import com.facebook.react.bridge.Callback;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogModule.c f29934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f29935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Callback f29936c;

    public /* synthetic */ b(DialogModule.c cVar, Bundle bundle, Callback callback) {
        this.f29934a = cVar;
        this.f29935b = bundle;
        this.f29936c = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f29934a.b(this.f29935b, this.f29936c);
    }
}

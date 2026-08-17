package com.facebook.react.defaults;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerProvider;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements UIManagerProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f29562a;

    public /* synthetic */ c(d dVar) {
        this.f29562a = dVar;
    }

    @Override // com.facebook.react.bridge.UIManagerProvider
    public final UIManager createUIManager(ReactApplicationContext reactApplicationContext) {
        return d.i(this.f29562a, reactApplicationContext);
    }
}

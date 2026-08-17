package com.facebook.react;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerProvider;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class N implements UIManagerProvider {
    @Override // com.facebook.react.bridge.UIManagerProvider
    public final UIManager createUIManager(ReactApplicationContext reactApplicationContext) {
        return O.a(reactApplicationContext);
    }
}

package com.facebook.react;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class T implements V.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P f29374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReactApplicationContext f29375b;

    public /* synthetic */ T(P p10, ReactApplicationContext reactApplicationContext) {
        this.f29374a = p10;
        this.f29375b = reactApplicationContext;
    }

    @Override // com.facebook.react.V.b
    public final NativeModule getModule(String str) {
        return V.d(this.f29374a, this.f29375b, str);
    }
}

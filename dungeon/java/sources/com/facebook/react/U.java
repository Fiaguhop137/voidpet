package com.facebook.react;

import com.facebook.react.bridge.NativeModule;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class U implements V.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f29376a;

    public /* synthetic */ U(Map map) {
        this.f29376a = map;
    }

    @Override // com.facebook.react.V.b
    public final NativeModule getModule(String str) {
        return V.e(this.f29376a, str);
    }
}

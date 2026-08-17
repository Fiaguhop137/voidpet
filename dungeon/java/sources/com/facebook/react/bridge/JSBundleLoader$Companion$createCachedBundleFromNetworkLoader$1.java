package com.facebook.react.bridge;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/facebook/react/bridge/JSBundleLoader$Companion$createCachedBundleFromNetworkLoader$1", "Lcom/facebook/react/bridge/JSBundleLoader;", "loadScript", "", "delegate", "Lcom/facebook/react/bridge/JSBundleLoaderDelegate;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JSBundleLoader$Companion$createCachedBundleFromNetworkLoader$1 extends JSBundleLoader {
    final /* synthetic */ String $cachedFileLocation;
    final /* synthetic */ String $sourceURL;

    JSBundleLoader$Companion$createCachedBundleFromNetworkLoader$1(String str, String str2) {
        this.$cachedFileLocation = str;
        this.$sourceURL = str2;
    }

    @Override // com.facebook.react.bridge.JSBundleLoader
    public String loadScript(JSBundleLoaderDelegate delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        try {
            delegate.loadScriptFromFile(this.$cachedFileLocation, this.$sourceURL, false);
            return this.$sourceURL;
        } catch (Exception e10) {
            r6.c.a aVar = p312r6.c.f52400b;
            String str = this.$sourceURL;
            String message = e10.getMessage();
            if (message == null) {
                message = "";
            }
            throw aVar.b(str, message, e10);
        }
    }
}

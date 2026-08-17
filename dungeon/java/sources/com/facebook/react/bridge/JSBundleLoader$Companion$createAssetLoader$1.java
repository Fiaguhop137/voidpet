package com.facebook.react.bridge;

import android.content.Context;
import android.content.res.AssetManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/facebook/react/bridge/JSBundleLoader$Companion$createAssetLoader$1", "Lcom/facebook/react/bridge/JSBundleLoader;", "loadScript", "", "delegate", "Lcom/facebook/react/bridge/JSBundleLoaderDelegate;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JSBundleLoader$Companion$createAssetLoader$1 extends JSBundleLoader {
    final /* synthetic */ String $assetUrl;
    final /* synthetic */ Context $context;
    final /* synthetic */ boolean $loadSynchronously;

    JSBundleLoader$Companion$createAssetLoader$1(Context context, String str, boolean z10) {
        this.$context = context;
        this.$assetUrl = str;
        this.$loadSynchronously = z10;
    }

    @Override // com.facebook.react.bridge.JSBundleLoader
    public String loadScript(JSBundleLoaderDelegate delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        AssetManager assets = this.$context.getAssets();
        Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
        delegate.loadScriptFromAssets(assets, this.$assetUrl, this.$loadSynchronously);
        return this.$assetUrl;
    }
}

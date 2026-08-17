package io.sentry.react.replay;

import android.view.View;
import androidx.annotation.NonNull;
import com.facebook.react.uimanager.C2262k0;
import com.facebook.react.uimanager.ViewGroupManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@G6.a(name = "RNSentryReplayUnmask")
public class RNSentryReplayUnmaskManager extends ViewGroupManager<b> {
    @Override // com.facebook.react.uimanager.ViewManager
    @NonNull
    public b createViewInstance(@NonNull C2262k0 c2262k0) {
        return new b(c2262k0);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "RNSentryReplayUnmask";
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC2273q
    public /* bridge */ /* synthetic */ void removeAllViews(@NotNull View view) {
        super.removeAllViews(view);
    }
}

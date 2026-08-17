package io.sentry.react.replay;

import android.view.View;
import androidx.annotation.NonNull;
import com.facebook.react.uimanager.C2262k0;
import com.facebook.react.uimanager.ViewGroupManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@G6.a(name = "RNSentryReplayMask")
public class RNSentryReplayMaskManager extends ViewGroupManager<a> {
    @Override // com.facebook.react.uimanager.ViewManager
    @NonNull
    public a createViewInstance(@NonNull C2262k0 c2262k0) {
        return new a(c2262k0);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "RNSentryReplayMask";
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC2273q
    public /* bridge */ /* synthetic */ void removeAllViews(@NotNull View view) {
        super.removeAllViews(view);
    }
}

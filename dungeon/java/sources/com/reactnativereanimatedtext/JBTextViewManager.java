package com.reactnativereanimatedtext;

import G6.a;
import androidx.annotation.NonNull;
import com.facebook.react.views.text.ReactTextViewManager;
import com.facebook.react.views.text.i;
import com.facebook.react.views.text.p;

/* JADX INFO: loaded from: classes2.dex */
@a(name = "JBAnimatedText")
public class JBTextViewManager extends ReactTextViewManager {
    public static final String REACT_CLASS = "JBAnimatedText";

    @Override // com.facebook.react.views.text.ReactTextViewManager
    public Ea.a createShadowNodeInstance(p pVar) {
        return new Ea.a(pVar);
    }

    @Override // com.facebook.react.views.text.ReactTextViewManager, com.facebook.react.uimanager.ViewManager
    public i createShadowNodeInstance() {
        return new Ea.a();
    }

    @Override // com.facebook.react.views.text.ReactTextViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "JBAnimatedText";
    }
}

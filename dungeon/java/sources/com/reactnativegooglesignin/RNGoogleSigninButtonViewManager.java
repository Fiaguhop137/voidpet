package com.reactnativegooglesignin;

import android.view.View;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.B0;
import com.facebook.react.uimanager.C2262k0;
import com.facebook.react.uimanager.C2270o0;
import com.facebook.react.uimanager.SimpleViewManager;
import com.google.android.gms.common.r;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class RNGoogleSigninButtonViewManager extends SimpleViewManager<r> {
    public static final String MODULE_NAME = "RNGoogleSigninButton";
    private static final View.OnClickListener mOnClickListener = new e();
    private final B0 mDelegate = new d(this);

    public static /* synthetic */ void a(View view) {
        ReactContext reactContext = (ReactContext) view.getContext();
        int id2 = view.getId();
        C2270o0.c(reactContext, id2).d(new n(C2270o0.e(reactContext), id2));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(@NonNull C2262k0 c2262k0, r rVar) {
        rVar.setOnClickListener(mOnClickListener);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    @NonNull
    public r createViewInstance(@NonNull C2262k0 c2262k0) {
        return new r(c2262k0);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* JADX INFO: renamed from: getDelegate */
    protected B0 getMDelegate() {
        return null;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        Map<String, Object> exportedCustomBubblingEventTypeConstants = super.getExportedCustomBubblingEventTypeConstants();
        if (exportedCustomBubblingEventTypeConstants == null) {
            exportedCustomBubblingEventTypeConstants = new HashMap<>();
        }
        exportedCustomBubblingEventTypeConstants.put("topPress", p312r6.d.c("phasedRegistrationNames", p312r6.d.c("bubbled", "onPress")));
        return exportedCustomBubblingEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "RNGoogleSigninButton";
    }

    @Y6.a(name = "color")
    public void setColor(r rVar, String str) {
        if (str == null) {
            rVar.setColorScheme(2);
        } else {
            rVar.setColorScheme(!"dark".equals(str) ? 1 : 0);
        }
    }

    @Y6.a(name = "disabled")
    public void setDisabled(r rVar, boolean z10) {
        rVar.setEnabled(!z10);
    }

    @Y6.a(name = "size")
    public void setSize(r rVar, int i10) {
        rVar.setSize(i10);
    }
}

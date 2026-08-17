package com.reactnativegooglesignin;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.B0;
import com.google.android.gms.common.r;

/* JADX INFO: loaded from: classes2.dex */
public class d implements B0 {
    d(RNGoogleSigninButtonViewManager rNGoogleSigninButtonViewManager) {
    }

    @Override // com.facebook.react.uimanager.B0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(r rVar, String str, ReadableArray readableArray) {
        throw new RuntimeException("receiveCommand must not be called");
    }

    @Override // com.facebook.react.uimanager.B0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(r rVar, String str, Object obj) {
        throw new RuntimeException("setProperty must not be called");
    }
}

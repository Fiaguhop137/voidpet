package com.swmansion.reanimated.keyboard;

import com.facebook.jni.HybridData;

/* JADX INFO: loaded from: classes2.dex */
@p276p6.a
public class KeyboardWorkletWrapper {

    @p276p6.a
    private final HybridData mHybridData;

    @p276p6.a
    private KeyboardWorkletWrapper(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public native void invoke(int i10, int i11);
}

package com.swmansion.reanimated.nativeProxy;

import com.facebook.jni.HybridData;
import com.swmansion.reanimated.NodesManager;

/* JADX INFO: loaded from: classes2.dex */
@p276p6.a
public class AnimationFrameCallback implements NodesManager.OnAnimationFrame {

    @p276p6.a
    private final HybridData mHybridData;

    @p276p6.a
    private AnimationFrameCallback(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // com.swmansion.reanimated.NodesManager.OnAnimationFrame
    public native void onAnimationFrame(double d10);
}

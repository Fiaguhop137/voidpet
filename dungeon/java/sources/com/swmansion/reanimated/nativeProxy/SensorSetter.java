package com.swmansion.reanimated.nativeProxy;

import com.facebook.jni.HybridData;

/* JADX INFO: loaded from: classes2.dex */
@p276p6.a
public class SensorSetter {

    @p276p6.a
    private final HybridData mHybridData;

    @p276p6.a
    private SensorSetter(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public native void sensorSetter(float[] fArr, int i10);
}

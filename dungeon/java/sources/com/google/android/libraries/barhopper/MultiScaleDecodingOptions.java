package com.google.android.libraries.barhopper;

import com.google.android.apps.common.proguard.UsedByNative;

/* JADX INFO: loaded from: classes2.dex */
@UsedByNative("jni_common.cc")
public final class MultiScaleDecodingOptions {

    @UsedByNative("jni_common.cc")
    private float[] extraScales = new float[0];

    @UsedByNative("jni_common.cc")
    private int minimumDetectedDimension = 10;

    @UsedByNative("jni_common.cc")
    private boolean skipProcessingIfBarcodeFound = true;

    public void a(float[] fArr) {
        this.extraScales = fArr;
    }

    public void b(int i10) {
        this.minimumDetectedDimension = i10;
    }

    public void c(boolean z10) {
        this.skipProcessingIfBarcodeFound = z10;
    }
}

package com.facebook.react;

import android.content.Context;
import com.facebook.react.soloader.OpenSourceMergedSoMapping;
import com.facebook.react.views.view.WindowUtilKt;
import com.facebook.soloader.SoLoader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class M {
    public static void a(Context context) {
        try {
            SoLoader.l(context, OpenSourceMergedSoMapping.f30131a);
            WindowUtilKt.setEdgeToEdgeFeatureFlagOn();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}

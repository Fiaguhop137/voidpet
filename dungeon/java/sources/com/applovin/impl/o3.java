package com.applovin.impl;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;
import p184k4.ViewOnApplyWindowInsetsListenerC3896c0;

/* JADX INFO: loaded from: classes.dex */
public abstract class o3 {
    public static WindowInsets a(View view, WindowInsets windowInsets) {
        Insets insets = windowInsets.getInsets(!w.b() ? 0 : WindowInsets.Type.systemBars() | WindowInsets.Type.displayCutout());
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return WindowInsets.CONSUMED;
    }

    public static void a(View view) {
        if (view == null || !w.b()) {
            return;
        }
        view.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC3896c0());
    }
}

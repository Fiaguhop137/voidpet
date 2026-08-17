package com.applovin.impl;

import android.content.Context;
import android.os.Build;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public abstract class t0 {
    public static boolean a() {
        return StringUtils.startsWithAtLeastOnePrefix(Build.DEVICE, CollectionUtils.explode("goldfish,vbox")) || StringUtils.startsWithAtLeastOnePrefix(Build.HARDWARE, CollectionUtils.explode("ranchu,generic,vbox")) || StringUtils.startsWithAtLeastOnePrefix(Build.MANUFACTURER, CollectionUtils.explode("Genymotion")) || StringUtils.startsWithAtLeastOnePrefix(Build.MODEL, CollectionUtils.explode("Android SDK built for x86"));
    }

    public static boolean a(Context context) {
        return "amazon".equalsIgnoreCase(Build.MANUFACTURER) || context.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv");
    }
}

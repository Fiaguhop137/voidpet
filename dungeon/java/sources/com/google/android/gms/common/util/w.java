package com.google.android.gms.common.util;

import android.os.StrictMode;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w {
    public static StrictMode.VmPolicy a() {
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (m.k()) {
            StrictMode.setVmPolicy(v.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
        }
        return vmPolicy;
    }
}

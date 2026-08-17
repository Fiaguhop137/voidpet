package com.google.android.gms.common.util;

import android.os.StrictMode;

/* JADX INFO: loaded from: classes2.dex */
abstract class v {
    static StrictMode.VmPolicy.Builder a(StrictMode.VmPolicy.Builder builder) {
        return builder.permitUnsafeIntentLaunch();
    }
}

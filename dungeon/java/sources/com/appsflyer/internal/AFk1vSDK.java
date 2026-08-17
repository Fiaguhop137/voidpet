package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class AFk1vSDK {
    public String getCurrencyIso4217Code;
    public final WeakReference<Context> getMonetizationNetwork;

    public AFk1vSDK(@NonNull Context context) {
        this.getMonetizationNetwork = new WeakReference<>(context);
    }
}

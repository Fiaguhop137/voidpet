package com.applovin.impl;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.appset.AppSet;
import p184k4.RunnableC3895c;

/* JADX INFO: loaded from: classes.dex */
public abstract class h0 {
    public static void a(Context context) {
        new Thread(new RunnableC3895c(context)).start();
    }

    public static void b(Context context) {
        if (TextUtils.isEmpty("com.google.android.gms.appset.AppSet")) {
            return;
        }
        try {
            AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(new g0());
        } catch (Throwable unused) {
        }
    }
}

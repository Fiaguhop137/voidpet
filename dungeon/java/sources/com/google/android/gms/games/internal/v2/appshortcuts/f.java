package com.google.android.gms.games.internal.v2.appshortcuts;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f {
    /* synthetic */ f(byte[] bArr) {
    }

    public static f b(Context context) {
        return Build.VERSION.SDK_INT < 25 ? new a() : new e(context);
    }

    public void a() {
    }
}

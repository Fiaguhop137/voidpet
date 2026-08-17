package com.google.android.gms.appset;

import G8.r;
import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AppSet {
    private AppSet() {
    }

    @NonNull
    public static AppSetIdClient getClient(@NonNull Context context) {
        return new r(context);
    }
}

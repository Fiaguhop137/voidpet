package com.google.android.gms.games.internal;

import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.common.util.j;

/* JADX INFO: loaded from: classes2.dex */
public abstract class GamesDowngradeableSafeParcel extends DowngradeableSafeParcel {
    protected static boolean d4(Integer num) {
        if (num == null) {
            return false;
        }
        return j.a(num.intValue());
    }
}

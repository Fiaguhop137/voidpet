package com.google.android.gms.common.util;

import p170j8.AbstractC3851p;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    public static boolean a(int[] iArr, int i10) {
        if (iArr != null) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean b(Object[] objArr, Object obj) {
        int length = objArr != null ? objArr.length : 0;
        for (int i10 = 0; i10 < length; i10++) {
            if (AbstractC3851p.a(objArr[i10], obj)) {
                if (i10 >= 0) {
                    return true;
                }
            }
        }
        return false;
    }
}

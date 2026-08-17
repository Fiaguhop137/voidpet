package com.google.android.gms.internal.auth;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class S implements Serializable {
    S() {
    }

    public static S c() {
        return P.f32268a;
    }

    public static S d(Object obj) {
        return new T(obj);
    }

    public abstract Object a();

    public abstract boolean b();
}

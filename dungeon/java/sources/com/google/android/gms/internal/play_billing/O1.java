package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class O1 extends IOException {
    public O1(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public O1(String str) {
        super(str);
    }
}

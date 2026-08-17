package com.applovin.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class j extends Handler {
    public j(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int size;
        k[] kVarArr;
        if (message.what != 1) {
            super.handleMessage(message);
            return;
        }
        while (true) {
            synchronized (n.f28221a) {
                try {
                    ArrayList arrayList = n.f28223c;
                    size = arrayList.size();
                    if (size <= 0) {
                        return;
                    }
                    kVarArr = new k[size];
                    arrayList.toArray(kVarArr);
                    arrayList.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (int i10 = 0; i10 < size; i10++) {
                k kVar = kVarArr[i10];
            }
        }
    }
}

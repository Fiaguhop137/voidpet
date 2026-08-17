package com.google.android.gms.common;

import android.content.Intent;

/* JADX INFO: renamed from: com.google.android.gms.common.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2350t extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Intent f31931a;

    public AbstractC2350t(String str, Intent intent) {
        super(str);
        this.f31931a = intent;
    }

    public Intent a() {
        return new Intent(this.f31931a);
    }
}

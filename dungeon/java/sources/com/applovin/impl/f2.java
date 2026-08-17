package com.applovin.impl;

/* JADX INFO: loaded from: classes.dex */
public enum f2 {
    NONE(-1),
    DEFAULT(0),
    V2(1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28018a;

    f2(int i10) {
        this.f28018a = i10;
    }

    public static f2 a(int i10) {
        if (i10 != 0 && i10 == 1) {
            return V2;
        }
        return DEFAULT;
    }
}

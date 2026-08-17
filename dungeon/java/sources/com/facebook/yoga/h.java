package com.facebook.yoga;

/* JADX INFO: loaded from: classes2.dex */
public enum h {
    INHERIT(0),
    LTR(1),
    RTL(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f31441a;

    h(int i10) {
        this.f31441a = i10;
    }

    public static h g(int i10) {
        if (i10 == 0) {
            return INHERIT;
        }
        if (i10 == 1) {
            return LTR;
        }
        if (i10 == 2) {
            return RTL;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i10);
    }

    public int h() {
        return this.f31441a;
    }
}

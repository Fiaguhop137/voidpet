package com.facebook.yoga;

/* JADX INFO: loaded from: classes2.dex */
public enum w {
    UNDEFINED(0),
    POINT(1),
    PERCENT(2),
    AUTO(3),
    MAX_CONTENT(4),
    FIT_CONTENT(5),
    STRETCH(6);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f31508a;

    w(int i10) {
        this.f31508a = i10;
    }

    public static w g(int i10) {
        switch (i10) {
            case 0:
                return UNDEFINED;
            case 1:
                return POINT;
            case 2:
                return PERCENT;
            case 3:
                return AUTO;
            case 4:
                return MAX_CONTENT;
            case 5:
                return FIT_CONTENT;
            case 6:
                return STRETCH;
            default:
                throw new IllegalArgumentException("Unknown enum value: " + i10);
        }
    }

    public int h() {
        return this.f31508a;
    }
}

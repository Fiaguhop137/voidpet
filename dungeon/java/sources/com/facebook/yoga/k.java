package com.facebook.yoga;

/* JADX INFO: loaded from: classes2.dex */
public enum k {
    NONE(0),
    STRETCH_FLEX_BASIS(1),
    ABSOLUTE_POSITION_WITHOUT_INSETS_EXCLUDES_PADDING(2),
    ABSOLUTE_PERCENT_AGAINST_INNER_SIZE(4),
    ALL(Integer.MAX_VALUE),
    CLASSIC(2147483646);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f31465a;

    k(int i10) {
        this.f31465a = i10;
    }

    public int g() {
        return this.f31465a;
    }
}

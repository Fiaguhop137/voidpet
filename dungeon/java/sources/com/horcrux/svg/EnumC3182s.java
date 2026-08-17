package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.horcrux.svg.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
enum EnumC3182s {
    UNKNOWN("unknown"),
    NORMAL("normal"),
    MULTIPLY("multiply"),
    SCREEN("screen"),
    DARKEN("darken"),
    LIGHTEN("lighten");


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Map f38494h = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38496a;

    static {
        for (EnumC3182s enumC3182s : values()) {
            f38494h.put(enumC3182s.f38496a, enumC3182s);
        }
    }

    EnumC3182s(String str) {
        this.f38496a = str;
    }

    static EnumC3182s g(String str) {
        Map map = f38494h;
        if (map.containsKey(str)) {
            return (EnumC3182s) map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f38496a;
    }
}

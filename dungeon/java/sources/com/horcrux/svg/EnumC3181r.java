package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.horcrux.svg.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
enum EnumC3181r {
    UNKNOWN("unknown"),
    DUPLICATE("duplicate"),
    WRAP("wrap"),
    NONE("none");


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Map f38485f = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38487a;

    static {
        for (EnumC3181r enumC3181r : values()) {
            f38485f.put(enumC3181r.f38487a, enumC3181r);
        }
    }

    EnumC3181r(String str) {
        this.f38487a = str;
    }

    static EnumC3181r g(String str) {
        Map map = f38485f;
        if (map.containsKey(str)) {
            return (EnumC3181r) map.get(str);
        }
        throw new IllegalArgumentException("Unknown 'edgeMode' Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f38487a;
    }
}

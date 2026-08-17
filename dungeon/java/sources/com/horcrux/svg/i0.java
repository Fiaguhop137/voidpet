package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
enum i0 {
    None("none"),
    Underline("underline"),
    Overline("overline"),
    LineThrough("line-through"),
    Blink("blink");


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Map f38418g = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38420a;

    static {
        for (i0 i0Var : values()) {
            f38418g.put(i0Var.f38420a, i0Var);
        }
    }

    i0(String str) {
        this.f38420a = str;
    }

    static i0 g(String str) {
        Map map = f38418g;
        if (map.containsKey(str)) {
            return (i0) map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f38420a;
    }
}

package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.horcrux.svg.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
enum EnumC3184u {
    OVER("over"),
    IN("in"),
    OUT("out"),
    ATOP("atop"),
    XOR("xor"),
    ARITHMETIC("arithmetic");


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Map f38510h = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38512a;

    static {
        for (EnumC3184u enumC3184u : values()) {
            f38510h.put(enumC3184u.f38512a, enumC3184u);
        }
    }

    EnumC3184u(String str) {
        this.f38512a = str;
    }

    static EnumC3184u g(String str) {
        Map map = f38510h;
        if (map.containsKey(str)) {
            return (EnumC3184u) map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f38512a;
    }
}

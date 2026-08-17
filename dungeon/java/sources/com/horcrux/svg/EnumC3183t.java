package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.horcrux.svg.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
enum EnumC3183t {
    MATRIX("matrix"),
    SATURATE("saturate"),
    HUE_ROTATE("hueRotate"),
    LUMINANCE_TO_ALPHA("luminanceToAlpha");


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Map f38501f = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38503a;

    static {
        for (EnumC3183t enumC3183t : values()) {
            f38501f.put(enumC3183t.f38503a, enumC3183t);
        }
    }

    EnumC3183t(String str) {
        this.f38503a = str;
    }

    static EnumC3183t g(String str) {
        Map map = f38501f;
        if (map.containsKey(str)) {
            return (EnumC3183t) map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f38503a;
    }
}

package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.horcrux.svg.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
enum EnumC3185v {
    OBJECT_BOUNDING_BOX("objectBoundingBox"),
    USER_SPACE_ON_USE("userSpaceOnUse");


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f38515d = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38517a;

    static {
        for (EnumC3185v enumC3185v : values()) {
            f38515d.put(enumC3185v.f38517a, enumC3185v);
        }
    }

    EnumC3185v(String str) {
        this.f38517a = str;
    }

    static EnumC3185v g(String str) {
        Map map = f38515d;
        if (map.containsKey(str)) {
            return (EnumC3185v) map.get(str);
        }
        throw new IllegalArgumentException("Unknown 'Unit' Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f38517a;
    }
}

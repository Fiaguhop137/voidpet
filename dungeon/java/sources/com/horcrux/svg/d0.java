package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
enum d0 {
    baseline("baseline"),
    textBottom("text-bottom"),
    alphabetic("alphabetic"),
    ideographic("ideographic"),
    middle("middle"),
    central("central"),
    mathematical("mathematical"),
    textTop("text-top"),
    bottom("bottom"),
    center("center"),
    top("top"),
    textBeforeEdge("text-before-edge"),
    textAfterEdge("text-after-edge"),
    beforeEdge("before-edge"),
    afterEdge("after-edge"),
    hanging("hanging");


    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Map f38373r = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38375a;

    static {
        for (d0 d0Var : values()) {
            f38373r.put(d0Var.f38375a, d0Var);
        }
    }

    d0(String str) {
        this.f38375a = str;
    }

    static d0 g(String str) {
        Map map = f38373r;
        if (map.containsKey(str)) {
            return (d0) map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f38375a;
    }
}

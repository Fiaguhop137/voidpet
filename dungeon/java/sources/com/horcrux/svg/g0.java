package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
enum g0 {
    Normal("normal"),
    Bold("bold"),
    w100("100"),
    w200("200"),
    w300("300"),
    w400("400"),
    w500("500"),
    w600("600"),
    w700("700"),
    w800("800"),
    w900("900"),
    Bolder("bolder"),
    Lighter("lighter");


    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Map f38402o = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38404a;

    static {
        for (g0 g0Var : values()) {
            f38402o.put(g0Var.f38404a, g0Var);
        }
    }

    g0(String str) {
        this.f38404a = str;
    }

    static g0 g(String str) {
        return (g0) f38402o.get(str);
    }

    static boolean h(String str) {
        return f38402o.containsKey(str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f38404a;
    }
}

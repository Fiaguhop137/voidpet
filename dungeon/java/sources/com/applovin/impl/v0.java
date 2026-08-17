package com.applovin.impl;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f28380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f28381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f28382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f28383e;

    public v0(String str, Map map, Map map2, HashMap map3, String str2) {
        this.f28379a = str;
        this.f28380b = map;
        this.f28381c = map2;
        this.f28382d = map3;
        this.f28383e = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        v0Var.getClass();
        String str = this.f28379a;
        String str2 = v0Var.f28379a;
        if (str != null ? !str.equals(str2) : str2 != null) {
            return false;
        }
        Map map = this.f28380b;
        Map map2 = v0Var.f28380b;
        if (map != null ? !map.equals(map2) : map2 != null) {
            return false;
        }
        Map map3 = this.f28381c;
        Map map4 = v0Var.f28381c;
        if (map3 != null ? !map3.equals(map4) : map4 != null) {
            return false;
        }
        HashMap map5 = this.f28382d;
        HashMap map6 = v0Var.f28382d;
        if (map5 != null ? map5.equals(map6) : map6 == null) {
            return this.f28383e.equals(v0Var.f28383e);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f28379a;
        int iHashCode = str == null ? 43 : str.hashCode();
        Map map = this.f28380b;
        int iHashCode2 = ((iHashCode + 59) * 59) + (map == null ? 43 : map.hashCode());
        Map map2 = this.f28381c;
        int iHashCode3 = (iHashCode2 * 59) + (map2 == null ? 43 : map2.hashCode());
        HashMap map3 = this.f28382d;
        return this.f28383e.hashCode() + (((iHashCode3 * 59) + (map3 != null ? map3.hashCode() : 43)) * 59);
    }

    public final String toString() {
        return "EventModel(eventName=" + this.f28379a + ", parameters=" + this.f28380b + ", options=" + this.f28381c + ", userData=" + this.f28382d + ", errorMessage=" + this.f28383e + ")";
    }
}

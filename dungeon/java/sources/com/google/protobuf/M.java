package com.google.protobuf;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class M extends LinkedHashMap {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final M f37834b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f37835a;

    static {
        M m10 = new M();
        f37834b = m10;
        m10.n();
    }

    private M() {
        this.f37835a = true;
    }

    private M(Map map) {
        super(map);
        this.f37835a = true;
    }

    static int b(Map map) {
        int iC = 0;
        for (Map.Entry entry : map.entrySet()) {
            iC += c(entry.getValue()) ^ c(entry.getKey());
        }
        return iC;
    }

    private static int c(Object obj) {
        if (obj instanceof byte[]) {
            return A.d((byte[]) obj);
        }
        if (obj instanceof A.c) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    private static void d(Map map) {
        for (Object obj : map.keySet()) {
            A.a(obj);
            A.a(map.get(obj));
        }
    }

    public static M e() {
        return f37834b;
    }

    private void f() {
        if (!m()) {
            throw new UnsupportedOperationException();
        }
    }

    private static boolean g(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    static boolean h(Map map, Map map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !g(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        f();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && h(this, (Map) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return b(this);
    }

    public boolean m() {
        return this.f37835a;
    }

    public void n() {
        this.f37835a = false;
    }

    public void p(M m10) {
        f();
        if (m10.isEmpty()) {
            return;
        }
        putAll(m10);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        f();
        A.a(obj);
        A.a(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        f();
        d(map);
        super.putAll(map);
    }

    public M q() {
        return isEmpty() ? new M() : new M(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        f();
        return super.remove(obj);
    }
}

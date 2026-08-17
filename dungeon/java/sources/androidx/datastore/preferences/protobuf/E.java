package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class E extends LinkedHashMap {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final E f23364b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f23365a;

    static {
        E e10 = new E();
        f23364b = e10;
        e10.n();
    }

    private E() {
        this.f23365a = true;
    }

    private E(Map map) {
        super(map);
        this.f23365a = true;
    }

    static int b(Map map) {
        int iC = 0;
        for (Map.Entry entry : map.entrySet()) {
            iC += c(entry.getValue()) ^ c(entry.getKey());
        }
        return iC;
    }

    private static int c(Object obj) {
        return obj instanceof byte[] ? AbstractC1964u.d((byte[]) obj) : obj.hashCode();
    }

    private static void d(Map map) {
        for (Object obj : map.keySet()) {
            AbstractC1964u.a(obj);
            AbstractC1964u.a(map.get(obj));
        }
    }

    public static E e() {
        return f23364b;
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
        return this.f23365a;
    }

    public void n() {
        this.f23365a = false;
    }

    public void p(E e10) {
        f();
        if (e10.isEmpty()) {
            return;
        }
        putAll(e10);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        f();
        AbstractC1964u.a(obj);
        AbstractC1964u.a(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        f();
        d(map);
        super.putAll(map);
    }

    public E q() {
        return isEmpty() ? new E() : new E(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        f();
        return super.remove(obj);
    }
}

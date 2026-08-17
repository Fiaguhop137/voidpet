package io.sentry.util;

import io.sentry.EnumC3721i3;
import io.sentry.ILogger;
import io.sentry.InterfaceC3724j1;
import io.sentry.InterfaceC3773r0;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements InterfaceC3724j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Deque f46583a;

    public u(Map map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f46583a = arrayDeque;
        arrayDeque.addLast(new AbstractMap.SimpleEntry(null, map));
    }

    private Object b() throws IOException {
        try {
            return c(null, null);
        } catch (Exception e10) {
            throw new IOException(e10);
        }
    }

    private Object c(ILogger iLogger, InterfaceC3773r0 interfaceC3773r0) {
        Map.Entry entry = (Map.Entry) this.f46583a.peekLast();
        if (entry == null) {
            return null;
        }
        Object value = entry.getValue();
        if (interfaceC3773r0 != null && iLogger != null) {
            return interfaceC3773r0.a(this, iLogger);
        }
        this.f46583a.removeLast();
        return value;
    }

    @Override // io.sentry.InterfaceC3724j1
    public Object A1(ILogger iLogger, InterfaceC3773r0 interfaceC3773r0) {
        return c(iLogger, interfaceC3773r0);
    }

    @Override // io.sentry.InterfaceC3724j1
    public TimeZone D0(ILogger iLogger) {
        String strD2 = D2();
        if (strD2 != null) {
            return TimeZone.getTimeZone(strD2);
        }
        return null;
    }

    @Override // io.sentry.InterfaceC3724j1
    public String D2() {
        return (String) b();
    }

    @Override // io.sentry.InterfaceC3724j1
    public void I() throws IOException {
        Map.Entry entry = (Map.Entry) this.f46583a.removeLast();
        if (entry == null) {
            throw new IOException("No more entries");
        }
        Object value = entry.getValue();
        if (!(value instanceof Map)) {
            throw new IOException("Current token is not an object");
        }
        this.f46583a.addLast(new AbstractMap.SimpleEntry(null, io.sentry.vendor.gson.stream.b.END_OBJECT));
        Iterator it = ((Map) value).entrySet().iterator();
        while (it.hasNext()) {
            this.f46583a.addLast((Map.Entry) it.next());
        }
    }

    @Override // io.sentry.InterfaceC3724j1
    public void J() {
        if (this.f46583a.size() > 1) {
            this.f46583a.removeLast();
        }
    }

    @Override // io.sentry.InterfaceC3724j1
    public Map J2(ILogger iLogger, InterfaceC3773r0 interfaceC3773r0) throws IOException {
        if (peek() == io.sentry.vendor.gson.stream.b.NULL) {
            a();
            return null;
        }
        try {
            I();
            HashMap map = new HashMap();
            if (hasNext()) {
                while (true) {
                    try {
                        map.put(X0(), interfaceC3773r0.a(this, iLogger));
                    } catch (Exception e10) {
                        iLogger.b(EnumC3721i3.WARNING, "Failed to deserialize object in map.", e10);
                    }
                    if (peek() != io.sentry.vendor.gson.stream.b.BEGIN_OBJECT && peek() != io.sentry.vendor.gson.stream.b.NAME) {
                        break;
                    }
                }
            }
            T();
            return map;
        } catch (Exception e11) {
            throw new IOException(e11);
        }
    }

    @Override // io.sentry.InterfaceC3724j1
    public List L3(ILogger iLogger, InterfaceC3773r0 interfaceC3773r0) throws IOException {
        if (peek() == io.sentry.vendor.gson.stream.b.NULL) {
            a();
            return null;
        }
        try {
            N();
            ArrayList arrayList = new ArrayList();
            if (hasNext()) {
                do {
                    try {
                        arrayList.add(interfaceC3773r0.a(this, iLogger));
                    } catch (Exception e10) {
                        iLogger.b(EnumC3721i3.WARNING, "Failed to deserialize object in list.", e10);
                    }
                } while (peek() == io.sentry.vendor.gson.stream.b.BEGIN_OBJECT);
            }
            J();
            return arrayList;
        } catch (Exception e11) {
            throw new IOException(e11);
        }
    }

    @Override // io.sentry.InterfaceC3724j1
    public void M2(ILogger iLogger, Map map, String str) {
        try {
            map.put(str, z3());
        } catch (Exception e10) {
            iLogger.a(EnumC3721i3.ERROR, e10, "Error deserializing unknown key: %s", str);
        }
    }

    @Override // io.sentry.InterfaceC3724j1
    public void N() throws IOException {
        Map.Entry entry = (Map.Entry) this.f46583a.removeLast();
        if (entry == null) {
            throw new IOException("No more entries");
        }
        Object value = entry.getValue();
        if (!(value instanceof List)) {
            throw new IOException("Current token is not an object");
        }
        this.f46583a.addLast(new AbstractMap.SimpleEntry(null, io.sentry.vendor.gson.stream.b.END_ARRAY));
        List list = (List) value;
        for (int size = list.size() - 1; size >= 0; size--) {
            this.f46583a.addLast(new AbstractMap.SimpleEntry(null, list.get(size)));
        }
    }

    @Override // io.sentry.InterfaceC3724j1
    public void Q(boolean z10) {
    }

    @Override // io.sentry.InterfaceC3724j1
    public Double S0() throws IOException {
        Object objB = b();
        if (objB instanceof Number) {
            return Double.valueOf(((Number) objB).doubleValue());
        }
        return null;
    }

    @Override // io.sentry.InterfaceC3724j1
    public void T() {
        if (this.f46583a.size() > 1) {
            this.f46583a.removeLast();
        }
    }

    @Override // io.sentry.InterfaceC3724j1
    public String X0() throws IOException {
        Map.Entry entry = (Map.Entry) this.f46583a.peekLast();
        if (entry != null && entry.getKey() != null) {
            return (String) entry.getKey();
        }
        throw new IOException("Expected a name but was " + peek());
    }

    public void a() throws IOException {
        if (b() == null) {
            return;
        }
        throw new IOException("Expected null but was " + peek());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f46583a.clear();
    }

    @Override // io.sentry.InterfaceC3724j1
    public Date e1(ILogger iLogger) {
        return InterfaceC3724j1.P1(D2(), iLogger);
    }

    @Override // io.sentry.InterfaceC3724j1
    public boolean hasNext() {
        return !this.f46583a.isEmpty();
    }

    @Override // io.sentry.InterfaceC3724j1
    public String j2() throws IOException {
        String str = (String) b();
        if (str != null) {
            return str;
        }
        throw new IOException("Expected string");
    }

    @Override // io.sentry.InterfaceC3724j1
    public void k0() {
    }

    @Override // io.sentry.InterfaceC3724j1
    public Boolean m1() {
        return (Boolean) b();
    }

    @Override // io.sentry.InterfaceC3724j1
    public double nextDouble() throws IOException {
        Object objB = b();
        if (objB instanceof Number) {
            return ((Number) objB).doubleValue();
        }
        throw new IOException("Expected double");
    }

    @Override // io.sentry.InterfaceC3724j1
    public float nextFloat() throws IOException {
        Object objB = b();
        if (objB instanceof Number) {
            return ((Number) objB).floatValue();
        }
        throw new IOException("Expected float");
    }

    @Override // io.sentry.InterfaceC3724j1
    public int nextInt() throws IOException {
        Object objB = b();
        if (objB instanceof Number) {
            return ((Number) objB).intValue();
        }
        throw new IOException("Expected int");
    }

    @Override // io.sentry.InterfaceC3724j1
    public long nextLong() throws IOException {
        Object objB = b();
        if (objB instanceof Number) {
            return ((Number) objB).longValue();
        }
        throw new IOException("Expected long");
    }

    @Override // io.sentry.InterfaceC3724j1
    public Float p3() throws IOException {
        Object objB = b();
        if (objB instanceof Number) {
            return Float.valueOf(((Number) objB).floatValue());
        }
        return null;
    }

    @Override // io.sentry.InterfaceC3724j1
    public io.sentry.vendor.gson.stream.b peek() {
        Map.Entry entry;
        if (!this.f46583a.isEmpty() && (entry = (Map.Entry) this.f46583a.peekLast()) != null) {
            if (entry.getKey() != null) {
                return io.sentry.vendor.gson.stream.b.NAME;
            }
            Object value = entry.getValue();
            if (value instanceof Map) {
                return io.sentry.vendor.gson.stream.b.BEGIN_OBJECT;
            }
            if (value instanceof List) {
                return io.sentry.vendor.gson.stream.b.BEGIN_ARRAY;
            }
            if (value instanceof String) {
                return io.sentry.vendor.gson.stream.b.STRING;
            }
            if (value instanceof Number) {
                return io.sentry.vendor.gson.stream.b.NUMBER;
            }
            if (value instanceof Boolean) {
                return io.sentry.vendor.gson.stream.b.BOOLEAN;
            }
            return value instanceof io.sentry.vendor.gson.stream.b ? (io.sentry.vendor.gson.stream.b) value : io.sentry.vendor.gson.stream.b.END_DOCUMENT;
        }
        return io.sentry.vendor.gson.stream.b.END_DOCUMENT;
    }

    @Override // io.sentry.InterfaceC3724j1
    public Integer t2() throws IOException {
        Object objB = b();
        if (objB instanceof Number) {
            return Integer.valueOf(((Number) objB).intValue());
        }
        return null;
    }

    @Override // io.sentry.InterfaceC3724j1
    public Long x2() throws IOException {
        Object objB = b();
        if (objB instanceof Number) {
            return Long.valueOf(((Number) objB).longValue());
        }
        return null;
    }

    @Override // io.sentry.InterfaceC3724j1
    public Object z3() {
        return b();
    }
}

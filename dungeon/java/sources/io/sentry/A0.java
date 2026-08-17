package io.sentry;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.InetAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: classes3.dex */
public final class A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f44189a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f44190b;

    A0(int i10) {
        this.f44190b = i10;
    }

    private List a(Collection collection, ILogger iLogger) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(d(it.next(), iLogger));
        }
        return arrayList;
    }

    private List b(Object[] objArr, ILogger iLogger) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            arrayList.add(d(obj, iLogger));
        }
        return arrayList;
    }

    private Map c(Map map, ILogger iLogger) {
        HashMap map2 = new HashMap();
        for (Object obj : map.keySet()) {
            Object obj2 = map.get(obj);
            if (obj2 != null) {
                map2.put(obj.toString(), d(obj2, iLogger));
            } else {
                map2.put(obj.toString(), null);
            }
        }
        return map2;
    }

    public Object d(Object obj, ILogger iLogger) {
        Object string;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Character) {
            return obj.toString();
        }
        if ((obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof String)) {
            return obj;
        }
        if (obj instanceof Locale) {
            return obj.toString();
        }
        if (obj instanceof AtomicIntegerArray) {
            return io.sentry.util.o.a((AtomicIntegerArray) obj);
        }
        if (obj instanceof AtomicBoolean) {
            return Boolean.valueOf(((AtomicBoolean) obj).get());
        }
        if (!(obj instanceof URI) && !(obj instanceof InetAddress) && !(obj instanceof UUID) && !(obj instanceof Currency)) {
            if (obj instanceof Calendar) {
                return io.sentry.util.o.d((Calendar) obj);
            }
            if (obj.getClass().isEnum()) {
                return obj.toString();
            }
            if (this.f44189a.contains(obj)) {
                iLogger.c(EnumC3721i3.INFO, "Cyclic reference detected. Calling toString() on object.", new Object[0]);
                return obj.toString();
            }
            this.f44189a.add(obj);
            try {
                if (this.f44189a.size() > this.f44190b) {
                    this.f44189a.remove(obj);
                    iLogger.c(EnumC3721i3.INFO, "Max depth exceeded. Calling toString() on object.", new Object[0]);
                    return obj.toString();
                }
                try {
                    if (obj.getClass().isArray()) {
                        string = b((Object[]) obj, iLogger);
                    } else if (obj instanceof Collection) {
                        string = a((Collection) obj, iLogger);
                    } else if (obj instanceof Map) {
                        string = c((Map) obj, iLogger);
                    } else {
                        Map mapE = e(obj, iLogger);
                        string = mapE.isEmpty() ? obj.toString() : mapE;
                    }
                    return string;
                } catch (Exception e10) {
                    iLogger.b(EnumC3721i3.INFO, "Not serializing object due to throwing sub-path.", e10);
                    return null;
                }
            } finally {
                this.f44189a.remove(obj);
            }
        }
        return obj.toString();
    }

    public Map e(Object obj, ILogger iLogger) {
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        HashMap map = new HashMap();
        for (Field field : declaredFields) {
            if (!Modifier.isTransient(field.getModifiers()) && !Modifier.isStatic(field.getModifiers())) {
                String name = field.getName();
                try {
                    field.setAccessible(true);
                    map.put(name, d(field.get(obj), iLogger));
                    field.setAccessible(false);
                } catch (Exception unused) {
                    iLogger.c(EnumC3721i3.INFO, "Cannot access field " + name + ".", new Object[0]);
                }
            }
        }
        return map;
    }
}

package io.sentry.util;

import io.sentry.AbstractC3732l;
import io.sentry.B0;
import io.sentry.EnumC3721i3;
import io.sentry.ILogger;
import io.sentry.InterfaceC3729k1;
import java.net.InetAddress;
import java.net.URI;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements InterfaceC3729k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map f46584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ArrayDeque f46585b;

    public v(Map map) {
        this.f46584a = map;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f46585b = arrayDeque;
        arrayDeque.addLast(map);
    }

    private Map s() {
        Object objPeekLast = this.f46585b.peekLast();
        if (objPeekLast == null) {
            throw new IllegalStateException("Stack is empty.");
        }
        if (objPeekLast instanceof Map) {
            return (Map) objPeekLast;
        }
        throw new IllegalStateException("Stack element is not a Map.");
    }

    private void t(Object obj) {
        Object objPeekLast = this.f46585b.peekLast();
        if (objPeekLast instanceof List) {
            ((List) objPeekLast).add(obj);
        } else {
            if (!(objPeekLast instanceof String)) {
                throw new IllegalStateException("Invalid stack state, expected array or string on top");
            }
            s().put((String) this.f46585b.removeLast(), obj);
        }
    }

    private void u(ILogger iLogger, Collection collection) {
        N();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            j(iLogger, it.next());
        }
        J();
    }

    private void v(ILogger iLogger, Date date) {
        try {
            e(AbstractC3732l.h(date));
        } catch (Exception e10) {
            iLogger.b(EnumC3721i3.ERROR, "Error when serializing Date", e10);
            l();
        }
    }

    private void w(ILogger iLogger, Map map) {
        I();
        for (Object obj : map.keySet()) {
            if (obj instanceof String) {
                d((String) obj);
                j(iLogger, map.get(obj));
            }
        }
        T();
    }

    private void x(ILogger iLogger, TimeZone timeZone) {
        try {
            e(timeZone.getID());
        } catch (Exception e10) {
            iLogger.b(EnumC3721i3.ERROR, "Error when serializing TimeZone", e10);
            l();
        }
    }

    @Override // io.sentry.InterfaceC3729k1
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public v j(ILogger iLogger, Object obj) {
        if (obj == null) {
            l();
            return this;
        }
        if (obj instanceof Character) {
            e(Character.toString(((Character) obj).charValue()));
            return this;
        }
        if (obj instanceof String) {
            e((String) obj);
            return this;
        }
        if (obj instanceof Boolean) {
            c(((Boolean) obj).booleanValue());
            return this;
        }
        if (obj instanceof Number) {
            i((Number) obj);
            return this;
        }
        if (obj instanceof Date) {
            v(iLogger, (Date) obj);
            return this;
        }
        if (obj instanceof TimeZone) {
            x(iLogger, (TimeZone) obj);
            return this;
        }
        if (obj instanceof B0) {
            ((B0) obj).serialize(this, iLogger);
            return this;
        }
        if (obj instanceof Collection) {
            u(iLogger, (Collection) obj);
            return this;
        }
        if (obj.getClass().isArray()) {
            u(iLogger, Arrays.asList((Object[]) obj));
            return this;
        }
        if (obj instanceof Map) {
            w(iLogger, (Map) obj);
            return this;
        }
        if (obj instanceof Locale) {
            e(obj.toString());
            return this;
        }
        if (obj instanceof AtomicIntegerArray) {
            u(iLogger, o.a((AtomicIntegerArray) obj));
            return this;
        }
        if (obj instanceof AtomicBoolean) {
            c(((AtomicBoolean) obj).get());
            return this;
        }
        if (obj instanceof URI) {
            e(obj.toString());
            return this;
        }
        if (obj instanceof InetAddress) {
            e(obj.toString());
            return this;
        }
        if (obj instanceof UUID) {
            e(obj.toString());
            return this;
        }
        if (obj instanceof Currency) {
            e(obj.toString());
            return this;
        }
        if (obj instanceof Calendar) {
            w(iLogger, o.d((Calendar) obj));
            return this;
        }
        if (obj.getClass().isEnum()) {
            e(obj.toString());
            return this;
        }
        iLogger.c(EnumC3721i3.WARNING, "Failed serializing unknown object.", obj);
        return this;
    }

    @Override // io.sentry.InterfaceC3729k1
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public v k(Boolean bool) {
        t(bool);
        return this;
    }

    @Override // io.sentry.InterfaceC3729k1
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public v i(Number number) {
        t(number);
        return this;
    }

    @Override // io.sentry.InterfaceC3729k1
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public v e(String str) {
        t(str);
        return this;
    }

    @Override // io.sentry.InterfaceC3729k1
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public v c(boolean z10) {
        t(Boolean.valueOf(z10));
        return this;
    }

    @Override // io.sentry.InterfaceC3729k1
    public void Q(boolean z10) {
    }

    @Override // io.sentry.InterfaceC3729k1
    public String f() {
        return null;
    }

    @Override // io.sentry.InterfaceC3729k1
    public InterfaceC3729k1 g(String str) {
        return this;
    }

    @Override // io.sentry.InterfaceC3729k1
    public void h(String str) {
    }

    @Override // io.sentry.InterfaceC3729k1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public v N() {
        this.f46585b.add(new ArrayList());
        return this;
    }

    @Override // io.sentry.InterfaceC3729k1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public v I() {
        this.f46585b.addLast(new HashMap());
        return this;
    }

    @Override // io.sentry.InterfaceC3729k1
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public v J() {
        T();
        return this;
    }

    @Override // io.sentry.InterfaceC3729k1
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public v T() {
        t(this.f46585b.removeLast());
        return this;
    }

    @Override // io.sentry.InterfaceC3729k1
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public v d(String str) {
        this.f46585b.add(str);
        return this;
    }

    @Override // io.sentry.InterfaceC3729k1
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public v l() {
        t(null);
        return this;
    }

    @Override // io.sentry.InterfaceC3729k1
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public v b(double d10) {
        t(Double.valueOf(d10));
        return this;
    }

    @Override // io.sentry.InterfaceC3729k1
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public v a(long j10) {
        t(Long.valueOf(j10));
        return this;
    }
}

package com.applovin.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class t implements Comparable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f28350c = Arrays.asList(Boolean.class, Float.class, Double.class, Integer.class, Long.class, String.class);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f28351d = new HashMap(512);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t f28352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t f28353f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final t f28354g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final t f28355h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final t f28356i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final t f28357j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final t f28358k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f28360b;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f28352e = a("http_connection_timeout", Integer.valueOf((int) timeUnit.toMillis(30L)));
        f28353f = a("get_retry_delay_v1", Integer.valueOf((int) timeUnit.toMillis(10L)));
        Boolean bool = Boolean.FALSE;
        f28354g = a("rroncbd", bool);
        f28355h = a("gzip_encoding_default", bool);
        f28356i = a("ree", Boolean.TRUE);
        f28357j = a("ree_t", 1);
        f28358k = a("response_buffer_size", 16000);
    }

    public t(String str, Object obj) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified");
        }
        if (obj == null) {
            throw new IllegalArgumentException("No default value specified");
        }
        this.f28359a = str;
        this.f28360b = obj;
    }

    public static t a(String str, Object obj) {
        return a(str, obj, new p184k4.x0());
    }

    public static t a(String str, Object obj, s sVar) {
        if (obj == null) {
            throw new IllegalArgumentException("No default value specified");
        }
        if (!f28350c.contains(obj.getClass())) {
            throw new IllegalArgumentException("Unsupported value type: " + obj.getClass());
        }
        t tVarA = sVar.a(str, obj);
        HashMap map = f28351d;
        if (map.containsKey(str)) {
            throw new IllegalArgumentException("Setting has already been used: ".concat(str));
        }
        map.put(str, tVarA);
        return tVarA;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        if (!(obj instanceof t)) {
            return 0;
        }
        return this.f28359a.compareTo(((t) obj).f28359a);
    }
}

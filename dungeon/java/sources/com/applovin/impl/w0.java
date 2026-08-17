package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.Axon;
import com.applovin.sdk.AxonEventService;
import com.applovin.sdk.AxonUserData;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import p184k4.A0;
import p184k4.B0;

/* JADX INFO: loaded from: classes.dex */
public final class w0 implements AxonEventService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f28389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f28390b = new AtomicBoolean();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f28391c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f28392d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f28393e;

    public w0(p pVar) {
        this.f28389a = pVar;
    }

    public static void a(String str) {
        p1.c("AppLovinEventService", str, null);
        if (i1.a(p.f28247J)) {
            throw new IllegalArgumentException(str);
        }
    }

    public final void a() {
        synchronized (this.f28392d) {
            this.f28391c.clear();
        }
    }

    public final void a(String str, Map map, Map map2) {
        String str2;
        Map map3;
        Map map4;
        AxonUserData axonUserData;
        HashMap mapA = (((Boolean) this.f28389a.l().a(m2.f28188i0)).booleanValue() && (axonUserData = this.f28389a.f28256F) != null) ? l3.a(axonUserData) : null;
        if (map.containsKey("items")) {
            Object obj = map.get("items");
            if (!(obj instanceof List)) {
                a(str, map, map2, mapA, "Invalid 'items' value: expected a list.");
                a("Invalid 'items' value: expected a list.");
                return;
            }
            str2 = str;
            map3 = map;
            map4 = map2;
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof Map)) {
                    a(str2, map3, map4, mapA, "Invalid element in 'items': expected a map.");
                    a("Invalid element in 'items': expected a map.");
                    return;
                }
            }
        } else {
            str2 = str;
            map3 = map;
            map4 = map2;
        }
        a(str2, map3, map4, mapA, "");
        this.f28389a.n().a(new g3(this.f28389a, false, "track_event:" + str2, new A0(this, str2, map3, map4, mapA)), 0L);
    }

    public final void a(String str, Map map, Map map2, HashMap map3, String str2) {
        v0 v0Var = new v0(str, map, map2, map3, str2);
        synchronized (this.f28392d) {
            try {
                int size = this.f28391c.size();
                p pVar = this.f28389a;
                if (size == ((Integer) pVar.l().a(m2.f28186g1)).intValue()) {
                    this.f28391c.pollLast();
                }
                this.f28391c.addFirst(v0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f28393e = true;
    }

    public final void a(String str, Map map, Map map2, Map map3) {
        String str2;
        Map map4 = CollectionUtils.map("AppLovin-Event", str);
        map4.put("AppLovin-SDK-Name", this.f28389a.f28259b);
        String str3 = (String) this.f28389a.l().a(m2.f28203r);
        String str4 = (String) this.f28389a.l().a(m2.f28205s);
        HashMap map5 = new HashMap();
        String string = UUID.randomUUID().toString();
        long jCurrentTimeMillis = System.currentTimeMillis();
        map5.put("id", string);
        map5.put("name", str);
        map5.put("data", map);
        synchronized (l0.class) {
            str2 = l0.f28099a.format(new Date(jCurrentTimeMillis));
        }
        map5.put("timestamp", str2);
        HashMap mapA = this.f28389a.c().a(true);
        Map map6 = (Map) mapA.get("app_info");
        map5.put("app_info", map6);
        map5.put("device_info", mapA.get("device_info"));
        CollectionUtils.putObjectToStringIfValid("dedupe_id", map2.get("dedupe_id"), map5);
        if (map3 != null) {
            map5.put("user_data", map3);
        }
        HashMap map7 = new HashMap();
        map7.put("Axon".equals(this.f28389a.f28259b) ? "connectEventKey" : "sdk_key", this.f28389a.f28258a);
        if (((Boolean) this.f28389a.l().a(m2.f28187h0)).booleanValue()) {
            CollectionUtils.putStringIfValid("art", this.f28389a.q().f28234b, map7);
        }
        CollectionUtils.putStringIfValid("eventId", this.f28389a.q().f28235c, map7);
        map7.put("version", Axon.VERSION);
        map7.put("platform", t0.a(this.f28389a.c().f28082c) ? "fireos" : "android");
        HashMap map8 = new HashMap();
        map8.put("firstVisitTs", map6.get("ia_v2"));
        map8.put("lastVisitTs", map6.get("last_launch_ms"));
        map8.put("visitCount", map6.get("app_launch_count"));
        map8.put("currentVisitStartTs", map6.get("alts_ms"));
        map7.put("visitInfo", map8);
        map5.put("axon", map7);
        boolean zBooleanValue = ((Boolean) this.f28389a.l().a(t.f28356i)).booleanValue();
        this.f28389a.h().c(new z1(str3, str4, (this.f28389a.c().f28087h || t0.a()) ? CollectionUtils.map("axon_test_code", "1") : null, map4, map5, f2.a(((Integer) this.f28389a.l().a(m2.f28129E)).intValue()), zBooleanValue));
    }

    public final void b(String str, Map map, Map map2) {
        AxonUserData axonUserData;
        HashMap mapA = (((Boolean) this.f28389a.l().a(m2.f28188i0)).booleanValue() && (axonUserData = this.f28389a.f28256F) != null) ? l3.a(axonUserData) : null;
        this.f28389a.n().a(new g3(this.f28389a, false, "track_event:" + str, new B0(this, str, map, map2, mapA)), 0L);
    }

    public final void b(String str, Map map, Map map2, Map map3) {
        String string = UUID.randomUUID().toString();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map<String, String> mapStringifyObjectMap = CollectionUtils.stringifyObjectMap(this.f28389a.c().a(false));
        mapStringifyObjectMap.put("event", str);
        mapStringifyObjectMap.put("eventid", string);
        mapStringifyObjectMap.put("ts", String.valueOf(jCurrentTimeMillis));
        CollectionUtils.putObjectToStringIfValid("dedupe_id", map2.get("dedupe_id"), mapStringifyObjectMap);
        Map map4 = CollectionUtils.map(map);
        if (map3 != null) {
            map4.put("user_data", map3);
        }
        x1 x1VarH = this.f28389a.h();
        p pVar = this.f28389a;
        String str2 = (String) pVar.l().a(m2.f28199p);
        p pVar2 = this.f28389a;
        String str3 = (String) pVar2.l().a(m2.f28201q);
        Map map5 = CollectionUtils.map("AppLovin-Event", str);
        p pVar3 = this.f28389a;
        boolean zBooleanValue = ((Boolean) pVar3.l().a(t.f28356i)).booleanValue();
        p pVar4 = this.f28389a;
        x1VarH.c(new z1(str2, str3, mapStringifyObjectMap, map5, map4, f2.a(((Integer) pVar4.l().a(m2.f28127D)).intValue()), zBooleanValue));
    }

    public final String toString() {
        return "EventService{}";
    }

    @Override // com.applovin.sdk.AxonEventService
    public final void trackEvent(String str) {
        trackEvent(str, new HashMap(), new HashMap());
    }

    @Override // com.applovin.sdk.AxonEventService
    public final void trackEvent(String str, Map map) {
        trackEvent(str, map, new HashMap());
    }

    @Override // com.applovin.sdk.AxonEventService
    public final void trackEvent(String str, Map map, Map map2) {
        if (TextUtils.isEmpty(str)) {
            a("Unable to track empty event");
            return;
        }
        List<String> listExplode = CollectionUtils.explode((String) this.f28389a.l().a(m2.f28158S0));
        List<String> listExplode2 = CollectionUtils.explode((String) this.f28389a.l().a(m2.f28160T0));
        if (listExplode.contains(str)) {
            b(str, map, map2);
        } else {
            if (listExplode2.contains(str)) {
                a(str, map, map2);
                return;
            }
            a("Unable to track unsupported event: " + str);
        }
    }
}

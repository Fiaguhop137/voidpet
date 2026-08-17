package com.facebook.hermes.intl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@p276p6.a
public class Collator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a.d f28711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a.c f28712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f28713c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f28715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a.b f28716f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private L5.b f28717g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private L5.b f28718h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f28714d = "default";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a f28719i = new h();

    @p276p6.a
    public Collator(List<String> list, Map<String, Object> map) throws L5.f {
        a(list, map);
        this.f28719i.b(this.f28717g).f(this.f28715e).e(this.f28716f).g(this.f28712b).d(this.f28713c);
    }

    private void a(List list, Map map) throws L5.f {
        g.a aVar = g.a.STRING;
        this.f28711a = (a.d) g.d(a.d.class, L5.d.h(g.c(map, "usage", aVar, L5.a.f6359e, "sort")));
        Object objQ = L5.d.q();
        L5.d.c(objQ, "localeMatcher", g.c(map, "localeMatcher", aVar, L5.a.f6355a, "best fit"));
        Object objC = g.c(map, "numeric", g.a.BOOLEAN, L5.d.d(), L5.d.d());
        if (!L5.d.n(objC)) {
            objC = L5.d.r(String.valueOf(L5.d.e(objC)));
        }
        L5.d.c(objQ, "kn", objC);
        L5.d.c(objQ, "kf", g.c(map, "caseFirst", aVar, L5.a.f6358d, L5.d.d()));
        HashMap mapA = f.a(list, objQ, Arrays.asList("co", "kf", "kn"));
        L5.b bVar = (L5.b) L5.d.g(mapA).get("locale");
        this.f28717g = bVar;
        this.f28718h = bVar.d();
        Object objA = L5.d.a(mapA, "co");
        if (L5.d.j(objA)) {
            objA = L5.d.r("default");
        }
        this.f28714d = L5.d.h(objA);
        Object objA2 = L5.d.a(mapA, "kn");
        if (L5.d.j(objA2)) {
            this.f28715e = false;
        } else {
            this.f28715e = Boolean.parseBoolean(L5.d.h(objA2));
        }
        Object objA3 = L5.d.a(mapA, "kf");
        if (L5.d.j(objA3)) {
            objA3 = L5.d.r("false");
        }
        this.f28716f = (a.b) g.d(a.b.class, L5.d.h(objA3));
        if (this.f28711a == a.d.SEARCH) {
            ArrayList arrayListB = this.f28717g.b("collation");
            ArrayList arrayList = new ArrayList();
            Iterator it = arrayListB.iterator();
            while (it.hasNext()) {
                arrayList.add(L5.j.e((String) it.next()));
            }
            arrayList.add(L5.j.e("search"));
            this.f28717g.f("co", arrayList);
        }
        Object objC2 = g.c(map, "sensitivity", g.a.STRING, L5.a.f6357c, L5.d.d());
        if (!L5.d.n(objC2)) {
            this.f28712b = (a.c) g.d(a.c.class, L5.d.h(objC2));
        } else if (this.f28711a == a.d.SORT) {
            this.f28712b = a.c.VARIANT;
        } else {
            this.f28712b = a.c.LOCALE;
        }
        this.f28713c = L5.d.e(g.c(map, "ignorePunctuation", g.a.BOOLEAN, L5.d.d(), Boolean.FALSE));
    }

    @p276p6.a
    public static List<String> supportedLocalesOf(List<String> list, Map<String, Object> map) throws L5.f {
        return L5.d.h(g.c(map, "localeMatcher", g.a.STRING, L5.a.f6355a, "best fit")).equals("best fit") ? Arrays.asList(e.d((String[]) list.toArray(new String[list.size()]))) : Arrays.asList(e.h((String[]) list.toArray(new String[list.size()])));
    }

    @p276p6.a
    public double compare(String str, String str2) {
        return this.f28719i.a(str, str2);
    }

    @p276p6.a
    public Map<String, Object> resolvedOptions() throws L5.f {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("locale", this.f28718h.g().replace("-kn-true", "-kn"));
        linkedHashMap.put("usage", this.f28711a.toString());
        a.c cVar = this.f28712b;
        if (cVar == a.c.LOCALE) {
            linkedHashMap.put("sensitivity", this.f28719i.c().toString());
        } else {
            linkedHashMap.put("sensitivity", cVar.toString());
        }
        linkedHashMap.put("ignorePunctuation", Boolean.valueOf(this.f28713c));
        linkedHashMap.put("collation", this.f28714d);
        linkedHashMap.put("numeric", Boolean.valueOf(this.f28715e));
        linkedHashMap.put("caseFirst", this.f28716f.toString());
        return linkedHashMap;
    }
}

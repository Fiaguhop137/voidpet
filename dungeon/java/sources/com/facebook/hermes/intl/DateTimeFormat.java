package com.facebook.hermes.intl;

import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
@p276p6.a
public class DateTimeFormat {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f28723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f28724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f28725f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f28726g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Object f28727h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private b.g f28728i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private b.e f28729j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private b.m f28730k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b.d f28731l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private b.n f28732m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private b.i f28733n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private b.c f28734o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private b.f f28735p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private b.h f28736q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private b.j f28737r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private b.l f28738s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private b.EnumC0364b f28739t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private b.k f28740u;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private L5.b f28721b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private L5.b f28722c = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Object f28741v = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    b f28720a = new i();

    @p276p6.a
    public DateTimeFormat(List<String> list, Map<String, Object> map) throws L5.f {
        c(list, map);
        this.f28720a.e(this.f28721b, this.f28723d ? "" : this.f28724e, this.f28725f ? "" : this.f28726g, this.f28729j, this.f28730k, this.f28731l, this.f28732m, this.f28733n, this.f28734o, this.f28735p, this.f28736q, this.f28737r, this.f28738s, this.f28728i, this.f28741v, this.f28739t, this.f28740u, this.f28727h);
    }

    private Object a() {
        return this.f28720a.h(this.f28721b);
    }

    private Object b(Object obj, String str, String str2) throws L5.f {
        if (!L5.d.l(obj)) {
            throw new L5.f("Invalid options object !");
        }
        boolean z10 = true;
        if (str.equals("date") || str.equals("any")) {
            String[] strArr = {"weekday", "year", "month", "day"};
            for (int i10 = 0; i10 < 4; i10++) {
                if (!L5.d.n(L5.d.a(obj, strArr[i10]))) {
                    z10 = false;
                }
            }
        }
        if (str.equals("time") || str.equals("any")) {
            String[] strArr2 = {"hour", "minute", "second"};
            for (int i11 = 0; i11 < 3; i11++) {
                if (!L5.d.n(L5.d.a(obj, strArr2[i11]))) {
                    z10 = false;
                }
            }
        }
        if (!L5.d.n(L5.d.a(obj, "dateStyle")) || !L5.d.n(L5.d.a(obj, "timeStyle"))) {
            z10 = false;
        }
        if (z10 && (str2.equals("date") || str2.equals("all"))) {
            String[] strArr3 = {"year", "month", "day"};
            for (int i12 = 0; i12 < 3; i12++) {
                L5.d.c(obj, strArr3[i12], "numeric");
            }
        }
        if (z10 && (str2.equals("time") || str2.equals("all"))) {
            String[] strArr4 = {"hour", "minute", "second"};
            for (int i13 = 0; i13 < 3; i13++) {
                L5.d.c(obj, strArr4[i13], "numeric");
            }
        }
        return obj;
    }

    private void c(List list, Map map) throws L5.f {
        List listAsList = Arrays.asList("ca", "nu", "hc");
        Object objB = b(map, "any", "date");
        Object objQ = L5.d.q();
        g.a aVar = g.a.STRING;
        L5.d.c(objQ, "localeMatcher", g.c(objB, "localeMatcher", aVar, L5.a.f6355a, "best fit"));
        Object objC = g.c(objB, "calendar", aVar, L5.d.d(), L5.d.d());
        if (!L5.d.n(objC) && !d(L5.d.h(objC))) {
            throw new L5.f("Invalid calendar option !");
        }
        L5.d.c(objQ, "ca", objC);
        Object objC2 = g.c(objB, "numberingSystem", aVar, L5.d.d(), L5.d.d());
        if (!L5.d.n(objC2) && !d(L5.d.h(objC2))) {
            throw new L5.f("Invalid numbering system !");
        }
        L5.d.c(objQ, "nu", objC2);
        Object objC3 = g.c(objB, "hour12", g.a.BOOLEAN, L5.d.d(), L5.d.d());
        Object objC4 = g.c(objB, "hourCycle", aVar, new String[]{"h11", "h12", "h23", "h24"}, L5.d.d());
        if (!L5.d.n(objC3)) {
            objC4 = L5.d.b();
        }
        L5.d.c(objQ, "hc", objC4);
        HashMap mapA = f.a(list, objQ, listAsList);
        L5.b bVar = (L5.b) L5.d.g(mapA).get("locale");
        this.f28721b = bVar;
        this.f28722c = bVar.d();
        Object objA = L5.d.a(mapA, "ca");
        if (L5.d.j(objA)) {
            this.f28723d = true;
            this.f28724e = this.f28720a.f(this.f28721b);
        } else {
            this.f28723d = false;
            this.f28724e = L5.d.h(objA);
        }
        Object objA2 = L5.d.a(mapA, "nu");
        if (L5.d.j(objA2)) {
            this.f28725f = true;
            this.f28726g = this.f28720a.b(this.f28721b);
        } else {
            this.f28725f = false;
            this.f28726g = L5.d.h(objA2);
        }
        Object objA3 = L5.d.a(mapA, "hc");
        Object objA4 = L5.d.a(objB, "timeZone");
        this.f28741v = L5.d.n(objA4) ? a() : e(objA4.toString());
        this.f28729j = (b.e) g.d(b.e.class, L5.d.h(g.c(objB, "formatMatcher", aVar, new String[]{"basic", "best fit"}, "best fit")));
        this.f28730k = (b.m) g.d(b.m.class, g.c(objB, "weekday", aVar, new String[]{"long", "short", "narrow"}, L5.d.d()));
        this.f28731l = (b.d) g.d(b.d.class, g.c(objB, "era", aVar, new String[]{"long", "short", "narrow"}, L5.d.d()));
        this.f28732m = (b.n) g.d(b.n.class, g.c(objB, "year", aVar, new String[]{"numeric", "2-digit"}, L5.d.d()));
        this.f28733n = (b.i) g.d(b.i.class, g.c(objB, "month", aVar, new String[]{"numeric", "2-digit", "long", "short", "narrow"}, L5.d.d()));
        this.f28734o = (b.c) g.d(b.c.class, g.c(objB, "day", aVar, new String[]{"numeric", "2-digit"}, L5.d.d()));
        Object objC5 = g.c(objB, "hour", aVar, new String[]{"numeric", "2-digit"}, L5.d.d());
        this.f28735p = (b.f) g.d(b.f.class, objC5);
        this.f28736q = (b.h) g.d(b.h.class, g.c(objB, "minute", aVar, new String[]{"numeric", "2-digit"}, L5.d.d()));
        this.f28737r = (b.j) g.d(b.j.class, g.c(objB, "second", aVar, new String[]{"numeric", "2-digit"}, L5.d.d()));
        this.f28738s = (b.l) g.d(b.l.class, g.c(objB, "timeZoneName", aVar, new String[]{"long", "longOffset", "longGeneric", "short", "shortOffset", "shortGeneric"}, L5.d.d()));
        this.f28739t = (b.EnumC0364b) g.d(b.EnumC0364b.class, g.c(objB, "dateStyle", aVar, new String[]{"full", "long", "medium", "short"}, L5.d.d()));
        Object objC6 = g.c(objB, "timeStyle", aVar, new String[]{"full", "long", "medium", "short"}, L5.d.d());
        this.f28740u = (b.k) g.d(b.k.class, objC6);
        if (L5.d.n(objC5) && L5.d.n(objC6)) {
            this.f28728i = b.g.UNDEFINED;
        } else {
            b.g gVarG = this.f28720a.g(this.f28721b);
            b.g gVar = L5.d.j(objA3) ? gVarG : (b.g) g.d(b.g.class, objA3);
            if (!L5.d.n(objC3)) {
                if (L5.d.e(objC3)) {
                    gVar = b.g.H11;
                    if (gVarG != gVar && gVarG != b.g.H23) {
                        gVar = b.g.H12;
                    }
                } else {
                    gVar = (gVarG == b.g.H11 || gVarG == b.g.H23) ? b.g.H23 : b.g.H24;
                }
            }
            this.f28728i = gVar;
        }
        this.f28727h = objC3;
    }

    private boolean d(String str) {
        return L5.c.e(str, 0, str.length() - 1);
    }

    @p276p6.a
    public static List<String> supportedLocalesOf(List<String> list, Map<String, Object> map) throws L5.f {
        String strH = L5.d.h(g.c(map, "localeMatcher", g.a.STRING, L5.a.f6355a, "best fit"));
        String[] strArr = new String[list.size()];
        return strH.equals("best fit") ? Arrays.asList(e.d((String[]) list.toArray(strArr))) : Arrays.asList(e.h((String[]) list.toArray(strArr)));
    }

    public String e(String str) throws L5.f {
        for (String str2 : TimeZone.getAvailableIDs()) {
            if (f(str2).equals(f(str))) {
                return str2;
            }
        }
        throw new L5.f("Invalid timezone name!");
    }

    public String f(String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < 'A' || cCharAt > 'Z') {
                sb2.append(cCharAt);
            } else {
                sb2.append((char) (cCharAt + ' '));
            }
        }
        return sb2.toString();
    }

    @p276p6.a
    public String format(double d10) throws L5.f {
        return this.f28720a.c(d10);
    }

    @p276p6.a
    public List<Map<String, String>> formatToParts(double d10) throws L5.f {
        ArrayList arrayList = new ArrayList();
        AttributedCharacterIterator attributedCharacterIteratorA = this.f28720a.a(d10);
        StringBuilder sb2 = new StringBuilder();
        for (char cFirst = attributedCharacterIteratorA.first(); cFirst != 65535; cFirst = attributedCharacterIteratorA.next()) {
            sb2.append(cFirst);
            if (attributedCharacterIteratorA.getIndex() + 1 == attributedCharacterIteratorA.getRunLimit()) {
                Iterator<AttributedCharacterIterator.Attribute> it = attributedCharacterIteratorA.getAttributes().keySet().iterator();
                String strD = it.hasNext() ? this.f28720a.d(it.next(), sb2.toString()) : "literal";
                String string = sb2.toString();
                sb2.setLength(0);
                HashMap map = new HashMap();
                map.put("type", strD);
                map.put("value", string);
                arrayList.add(map);
            }
        }
        return arrayList;
    }

    @p276p6.a
    public Map<String, Object> resolvedOptions() throws L5.f {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("locale", this.f28722c.g());
        linkedHashMap.put("numberingSystem", this.f28726g);
        linkedHashMap.put("calendar", this.f28724e);
        linkedHashMap.put("timeZone", this.f28741v);
        b.g gVar = this.f28728i;
        if (gVar != b.g.UNDEFINED) {
            linkedHashMap.put("hourCycle", gVar.toString());
            b.g gVar2 = this.f28728i;
            if (gVar2 == b.g.H11 || gVar2 == b.g.H12) {
                linkedHashMap.put("hour12", Boolean.TRUE);
            } else {
                linkedHashMap.put("hour12", Boolean.FALSE);
            }
        }
        b.m mVar = this.f28730k;
        if (mVar != b.m.UNDEFINED) {
            linkedHashMap.put("weekday", mVar.toString());
        }
        b.d dVar = this.f28731l;
        if (dVar != b.d.UNDEFINED) {
            linkedHashMap.put("era", dVar.toString());
        }
        b.n nVar = this.f28732m;
        if (nVar != b.n.UNDEFINED) {
            linkedHashMap.put("year", nVar.toString());
        }
        b.i iVar = this.f28733n;
        if (iVar != b.i.UNDEFINED) {
            linkedHashMap.put("month", iVar.toString());
        }
        b.c cVar = this.f28734o;
        if (cVar != b.c.UNDEFINED) {
            linkedHashMap.put("day", cVar.toString());
        }
        b.f fVar = this.f28735p;
        if (fVar != b.f.UNDEFINED) {
            linkedHashMap.put("hour", fVar.toString());
        }
        b.h hVar = this.f28736q;
        if (hVar != b.h.UNDEFINED) {
            linkedHashMap.put("minute", hVar.toString());
        }
        b.j jVar = this.f28737r;
        if (jVar != b.j.UNDEFINED) {
            linkedHashMap.put("second", jVar.toString());
        }
        b.l lVar = this.f28738s;
        if (lVar != b.l.UNDEFINED) {
            linkedHashMap.put("timeZoneName", lVar.toString());
        }
        b.EnumC0364b enumC0364b = this.f28739t;
        if (enumC0364b != b.EnumC0364b.UNDEFINED) {
            linkedHashMap.put("dateStyle", enumC0364b.toString());
        }
        b.k kVar = this.f28740u;
        if (kVar != b.k.UNDEFINED) {
            linkedHashMap.put("timeStyle", kVar.toString());
        }
        return linkedHashMap;
    }
}

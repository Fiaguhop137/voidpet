package com.facebook.hermes.intl;

import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@p276p6.a
public class NumberFormat {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static String[] f28742v = {"acre", "bit", "byte", "celsius", "centimeter", "day", "degree", "fahrenheit", "fluid-ounce", "foot", "gallon", "gigabit", "gigabyte", "gram", "hectare", "hour", "inch", "kilobit", "kilobyte", "kilogram", "kilometer", "liter", "megabit", "megabyte", "meter", "mile", "mile-scandinavian", "milliliter", "millimeter", "millisecond", "minute", "month", "ounce", "percent", "petabyte", "pound", "second", "stone", "terabit", "terabyte", "week", "yard", "year"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c.h f28743a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c.i f28748f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private c.f f28755m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f28758p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private c.b f28761s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f28744b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c.EnumC0365c f28745c = c.EnumC0365c.SYMBOL;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c.d f28746d = c.d.STANDARD;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f28747e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f28749g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f28750h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f28751i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f28752j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f28753k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f28754l = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private c.g f28756n = c.g.AUTO;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f28759q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private c.e f28760r = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private L5.b f28762t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private L5.b f28763u = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private c f28757o = new j();

    @p276p6.a
    public NumberFormat(List<String> list, Map<String, Object> map) throws L5.f {
        a(list, map);
        this.f28757o.d(this.f28762t, this.f28758p ? "" : this.f28759q, this.f28743a, this.f28746d, this.f28760r, this.f28761s).e(this.f28744b, this.f28745c).h(this.f28749g).g(this.f28750h).f(this.f28755m, this.f28753k, this.f28754l).i(this.f28755m, this.f28751i, this.f28752j).k(this.f28756n).j(this.f28747e, this.f28748f);
    }

    private void a(List list, Map map) throws L5.f {
        Object objP;
        Object objP2;
        Object objQ = L5.d.q();
        g.a aVar = g.a.STRING;
        L5.d.c(objQ, "localeMatcher", g.c(map, "localeMatcher", aVar, L5.a.f6355a, "best fit"));
        Object objC = g.c(map, "numberingSystem", aVar, L5.d.d(), L5.d.d());
        if (!L5.d.n(objC) && !b(L5.d.h(objC))) {
            throw new L5.f("Invalid numbering system !");
        }
        L5.d.c(objQ, "nu", objC);
        HashMap mapA = f.a(list, objQ, Collections.singletonList("nu"));
        L5.b bVar = (L5.b) L5.d.g(mapA).get("locale");
        this.f28762t = bVar;
        this.f28763u = bVar.d();
        Object objA = L5.d.a(mapA, "nu");
        if (L5.d.j(objA)) {
            this.f28758p = true;
            this.f28759q = this.f28757o.b(this.f28762t);
        } else {
            this.f28758p = false;
            this.f28759q = L5.d.h(objA);
        }
        h(map);
        if (this.f28743a == c.h.CURRENCY) {
            double dN = j.n(this.f28744b);
            objP = L5.d.p(dN);
            objP2 = L5.d.p(dN);
        } else {
            objP = L5.d.p(0.0d);
            objP2 = this.f28743a == c.h.PERCENT ? L5.d.p(0.0d) : L5.d.p(3.0d);
        }
        this.f28760r = (c.e) g.d(c.e.class, L5.d.h(g.c(map, "notation", aVar, new String[]{"standard", "scientific", "engineering", "compact"}, "standard")));
        g(map, objP, objP2);
        Object objC2 = g.c(map, "compactDisplay", aVar, new String[]{"short", "long"}, "short");
        if (this.f28760r == c.e.COMPACT) {
            this.f28761s = (c.b) g.d(c.b.class, L5.d.h(objC2));
        }
        this.f28749g = L5.d.e(g.c(map, "useGrouping", g.a.BOOLEAN, L5.d.d(), L5.d.o(true)));
        this.f28756n = (c.g) g.d(c.g.class, L5.d.h(g.c(map, "signDisplay", aVar, new String[]{"auto", "never", "always", "exceptZero"}, "auto")));
    }

    private boolean b(String str) {
        return L5.c.e(str, 0, str.length() - 1);
    }

    private boolean c(String str) {
        return Arrays.binarySearch(f28742v, str) >= 0;
    }

    private boolean d(String str) {
        return f(str).matches("^[A-Z][A-Z][A-Z]$");
    }

    private boolean e(String str) {
        if (c(str)) {
            return true;
        }
        int iIndexOf = str.indexOf("-per-");
        return iIndexOf >= 0 && str.indexOf("-per-", iIndexOf + 1) < 0 && c(str.substring(0, iIndexOf)) && c(str.substring(iIndexOf + 5));
    }

    private String f(String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < 'a' || cCharAt > 'z') {
                sb2.append(cCharAt);
            } else {
                sb2.append((char) (cCharAt - ' '));
            }
        }
        return sb2.toString();
    }

    private void g(Map map, Object obj, Object obj2) throws L5.f {
        Object objB = g.b(map, "minimumIntegerDigits", L5.d.p(1.0d), L5.d.p(21.0d), L5.d.p(1.0d));
        Object objA = L5.d.a(map, "minimumFractionDigits");
        Object objA2 = L5.d.a(map, "maximumFractionDigits");
        Object objA3 = L5.d.a(map, "minimumSignificantDigits");
        Object objA4 = L5.d.a(map, "maximumSignificantDigits");
        this.f28750h = (int) Math.floor(L5.d.f(objB));
        if (!L5.d.n(objA3) || !L5.d.n(objA4)) {
            this.f28755m = c.f.SIGNIFICANT_DIGITS;
            Object objA5 = g.a("minimumSignificantDigits", objA3, L5.d.p(1.0d), L5.d.p(21.0d), L5.d.p(1.0d));
            Object objA6 = g.a("maximumSignificantDigits", objA4, objA5, L5.d.p(21.0d), L5.d.p(21.0d));
            this.f28753k = (int) Math.floor(L5.d.f(objA5));
            this.f28754l = (int) Math.floor(L5.d.f(objA6));
            return;
        }
        if (L5.d.n(objA) && L5.d.n(objA2)) {
            c.e eVar = this.f28760r;
            if (eVar == c.e.COMPACT) {
                this.f28755m = c.f.COMPACT_ROUNDING;
                return;
            }
            if (eVar == c.e.ENGINEERING) {
                this.f28755m = c.f.FRACTION_DIGITS;
                this.f28752j = 5;
                return;
            } else {
                this.f28755m = c.f.FRACTION_DIGITS;
                this.f28751i = (int) Math.floor(L5.d.f(obj));
                this.f28752j = (int) Math.floor(L5.d.f(obj2));
                return;
            }
        }
        this.f28755m = c.f.FRACTION_DIGITS;
        Object objA7 = g.a("minimumFractionDigits", objA, L5.d.p(0.0d), L5.d.p(20.0d), L5.d.d());
        Object objA8 = g.a("maximumFractionDigits", objA2, L5.d.p(0.0d), L5.d.p(20.0d), L5.d.d());
        if (L5.d.n(objA7)) {
            objA7 = L5.d.p(Math.min(L5.d.f(obj), L5.d.f(objA8)));
        } else if (L5.d.n(objA8)) {
            objA8 = L5.d.p(Math.max(L5.d.f(obj2), L5.d.f(objA7)));
        } else if (L5.d.f(objA7) > L5.d.f(objA8)) {
            throw new L5.f("minimumFractionDigits is greater than maximumFractionDigits");
        }
        this.f28751i = (int) Math.floor(L5.d.f(objA7));
        this.f28752j = (int) Math.floor(L5.d.f(objA8));
    }

    private void h(Map map) throws L5.f {
        g.a aVar = g.a.STRING;
        this.f28743a = (c.h) g.d(c.h.class, L5.d.h(g.c(map, "style", aVar, new String[]{"decimal", "percent", "currency", "unit"}, "decimal")));
        Object objC = g.c(map, "currency", aVar, L5.d.d(), L5.d.d());
        if (L5.d.n(objC)) {
            if (this.f28743a == c.h.CURRENCY) {
                throw new L5.f("Expected currency style !");
            }
        } else if (!d(L5.d.h(objC))) {
            throw new L5.f("Malformed currency code !");
        }
        Object objC2 = g.c(map, "currencyDisplay", aVar, new String[]{"symbol", "narrowSymbol", "code", "name"}, "symbol");
        Object objC3 = g.c(map, "currencySign", aVar, new String[]{"accounting", "standard"}, "standard");
        Object objC4 = g.c(map, "unit", aVar, L5.d.d(), L5.d.d());
        if (L5.d.n(objC4)) {
            if (this.f28743a == c.h.UNIT) {
                throw new L5.f("Expected unit !");
            }
        } else if (!e(L5.d.h(objC4))) {
            throw new L5.f("Malformed unit identifier !");
        }
        Object objC5 = g.c(map, "unitDisplay", aVar, new String[]{"long", "short", "narrow"}, "short");
        c.h hVar = this.f28743a;
        if (hVar == c.h.CURRENCY) {
            this.f28744b = f(L5.d.h(objC));
            this.f28745c = (c.EnumC0365c) g.d(c.EnumC0365c.class, L5.d.h(objC2));
            this.f28746d = (c.d) g.d(c.d.class, L5.d.h(objC3));
        } else if (hVar == c.h.UNIT) {
            this.f28747e = L5.d.h(objC4);
            this.f28748f = (c.i) g.d(c.i.class, L5.d.h(objC5));
        }
    }

    @p276p6.a
    public static List<String> supportedLocalesOf(List<String> list, Map<String, Object> map) throws L5.f {
        String strH = L5.d.h(g.c(map, "localeMatcher", g.a.STRING, L5.a.f6355a, "best fit"));
        String[] strArr = new String[list.size()];
        return strH.equals("best fit") ? Arrays.asList(e.d((String[]) list.toArray(strArr))) : Arrays.asList(e.h((String[]) list.toArray(strArr)));
    }

    @p276p6.a
    public String format(double d10) throws L5.f {
        return this.f28757o.c(d10);
    }

    @p276p6.a
    public List<Map<String, String>> formatToParts(double d10) throws L5.f {
        ArrayList arrayList = new ArrayList();
        AttributedCharacterIterator attributedCharacterIteratorA = this.f28757o.a(d10);
        StringBuilder sb2 = new StringBuilder();
        for (char cFirst = attributedCharacterIteratorA.first(); cFirst != 65535; cFirst = attributedCharacterIteratorA.next()) {
            sb2.append(cFirst);
            if (attributedCharacterIteratorA.getIndex() + 1 == attributedCharacterIteratorA.getRunLimit()) {
                Iterator<AttributedCharacterIterator.Attribute> it = attributedCharacterIteratorA.getAttributes().keySet().iterator();
                String strL = it.hasNext() ? this.f28757o.l(it.next(), d10) : "literal";
                String string = sb2.toString();
                sb2.setLength(0);
                HashMap map = new HashMap();
                map.put("type", strL);
                map.put("value", string);
                arrayList.add(map);
            }
        }
        return arrayList;
    }

    @p276p6.a
    public Map<String, Object> resolvedOptions() throws L5.f {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("locale", this.f28763u.g());
        linkedHashMap.put("numberingSystem", this.f28759q);
        linkedHashMap.put("style", this.f28743a.toString());
        c.h hVar = this.f28743a;
        if (hVar == c.h.CURRENCY) {
            linkedHashMap.put("currency", this.f28744b);
            linkedHashMap.put("currencyDisplay", this.f28745c.toString());
            linkedHashMap.put("currencySign", this.f28746d.toString());
        } else if (hVar == c.h.UNIT) {
            linkedHashMap.put("unit", this.f28747e);
            linkedHashMap.put("unitDisplay", this.f28748f.toString());
        }
        int i10 = this.f28750h;
        if (i10 != -1) {
            linkedHashMap.put("minimumIntegerDigits", Integer.valueOf(i10));
        }
        c.f fVar = this.f28755m;
        if (fVar == c.f.SIGNIFICANT_DIGITS) {
            int i11 = this.f28754l;
            if (i11 != -1) {
                linkedHashMap.put("maximumSignificantDigits", Integer.valueOf(i11));
            }
            int i12 = this.f28753k;
            if (i12 != -1) {
                linkedHashMap.put("minimumSignificantDigits", Integer.valueOf(i12));
            }
        } else if (fVar == c.f.FRACTION_DIGITS) {
            int i13 = this.f28751i;
            if (i13 != -1) {
                linkedHashMap.put("minimumFractionDigits", Integer.valueOf(i13));
            }
            int i14 = this.f28752j;
            if (i14 != -1) {
                linkedHashMap.put("maximumFractionDigits", Integer.valueOf(i14));
            }
        }
        linkedHashMap.put("useGrouping", Boolean.valueOf(this.f28749g));
        linkedHashMap.put("notation", this.f28760r.toString());
        if (this.f28760r == c.e.COMPACT) {
            linkedHashMap.put("compactDisplay", this.f28761s.toString());
        }
        linkedHashMap.put("signDisplay", this.f28756n.toString());
        return linkedHashMap;
    }
}

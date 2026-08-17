package com.facebook.hermes.intl;

import android.icu.text.DateFormat;
import android.icu.text.NumberingSystem;
import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import android.icu.util.TimeZone;
import android.icu.util.ULocale;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class i implements com.facebook.hermes.intl.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DateFormat f28908a = null;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28909a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f28910b;

        static {
            int[] iArr = new int[com.facebook.hermes.intl.b.k.values().length];
            f28910b = iArr;
            try {
                iArr[com.facebook.hermes.intl.b.k.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28910b[com.facebook.hermes.intl.b.k.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28910b[com.facebook.hermes.intl.b.k.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28910b[com.facebook.hermes.intl.b.k.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28910b[com.facebook.hermes.intl.b.k.UNDEFINED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[com.facebook.hermes.intl.b.EnumC0364b.values().length];
            f28909a = iArr2;
            try {
                iArr2[com.facebook.hermes.intl.b.EnumC0364b.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28909a[com.facebook.hermes.intl.b.EnumC0364b.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f28909a[com.facebook.hermes.intl.b.EnumC0364b.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f28909a[com.facebook.hermes.intl.b.EnumC0364b.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f28909a[com.facebook.hermes.intl.b.EnumC0364b.UNDEFINED.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    private static class b {
        public static String a(String str) {
            StringBuilder sb2 = new StringBuilder();
            boolean z10 = false;
            for (int i10 = 0; i10 < str.length(); i10++) {
                char cCharAt = str.charAt(i10);
                if (cCharAt == '\'') {
                    z10 = !z10;
                } else if (!z10 && ((cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z'))) {
                    sb2.append(str.charAt(i10));
                }
            }
            return sb2.toString();
        }
    }

    i() {
    }

    private static String i(L5.b bVar, com.facebook.hermes.intl.b.EnumC0364b enumC0364b, com.facebook.hermes.intl.b.k kVar) {
        if (enumC0364b == com.facebook.hermes.intl.b.EnumC0364b.UNDEFINED) {
            return ((SimpleDateFormat) DateFormat.getTimeInstance(m(kVar), (ULocale) bVar.h())).toLocalizedPattern();
        }
        return kVar == com.facebook.hermes.intl.b.k.UNDEFINED ? ((SimpleDateFormat) DateFormat.getDateInstance(l(enumC0364b), (ULocale) bVar.h())).toLocalizedPattern() : ((SimpleDateFormat) DateFormat.getDateTimeInstance(l(enumC0364b), m(kVar), (ULocale) bVar.h())).toLocalizedPattern();
    }

    private static String j(L5.b bVar, com.facebook.hermes.intl.b.m mVar, com.facebook.hermes.intl.b.d dVar, com.facebook.hermes.intl.b.n nVar, com.facebook.hermes.intl.b.i iVar, com.facebook.hermes.intl.b.c cVar, com.facebook.hermes.intl.b.f fVar, com.facebook.hermes.intl.b.h hVar, com.facebook.hermes.intl.b.j jVar, com.facebook.hermes.intl.b.l lVar, com.facebook.hermes.intl.b.g gVar, com.facebook.hermes.intl.b.EnumC0364b enumC0364b, com.facebook.hermes.intl.b.k kVar, Object obj) {
        StringBuilder sb2 = new StringBuilder();
        if (enumC0364b == com.facebook.hermes.intl.b.EnumC0364b.UNDEFINED && kVar == com.facebook.hermes.intl.b.k.UNDEFINED) {
            sb2.append(mVar.g());
            sb2.append(dVar.g());
            sb2.append(nVar.g());
            sb2.append(iVar.g());
            sb2.append(cVar.g());
            if (gVar == com.facebook.hermes.intl.b.g.H11 || gVar == com.facebook.hermes.intl.b.g.H12) {
                sb2.append(fVar.g());
            } else {
                sb2.append(fVar.h());
            }
            sb2.append(hVar.g());
            sb2.append(jVar.g());
            sb2.append(lVar.g());
        } else {
            sb2.append(i(bVar, enumC0364b, kVar));
            HashMap mapA = bVar.a();
            if (mapA.containsKey("hc")) {
                String str = (String) mapA.get("hc");
                if (str == "h11" || str == "h12") {
                    k(sb2, new char[]{'H', 'K', 'k'}, 'h');
                } else if (str == "h23" || str == "h24") {
                    k(sb2, new char[]{'h', 'H', 'K'}, 'k');
                }
            }
            if (gVar == com.facebook.hermes.intl.b.g.H11 || gVar == com.facebook.hermes.intl.b.g.H12) {
                k(sb2, new char[]{'H', 'K', 'k'}, 'h');
            } else if (gVar == com.facebook.hermes.intl.b.g.H23 || gVar == com.facebook.hermes.intl.b.g.H24) {
                k(sb2, new char[]{'h', 'H', 'K'}, 'k');
            }
            if (!L5.d.n(obj) && !L5.d.j(obj)) {
                if (L5.d.e(obj)) {
                    k(sb2, new char[]{'H', 'K', 'k'}, 'h');
                } else {
                    k(sb2, new char[]{'h', 'H', 'K'}, 'k');
                }
            }
        }
        return sb2.toString();
    }

    private static void k(StringBuilder sb2, char[] cArr, char c10) {
        for (int i10 = 0; i10 < sb2.length(); i10++) {
            for (char c11 : cArr) {
                if (sb2.charAt(i10) == c11) {
                    sb2.setCharAt(i10, c10);
                    break;
                }
            }
        }
    }

    static int l(com.facebook.hermes.intl.b.EnumC0364b enumC0364b) throws L5.f {
        int i10 = a.f28909a[enumC0364b.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        throw new L5.f("Invalid DateStyle: " + enumC0364b.toString());
    }

    static int m(com.facebook.hermes.intl.b.k kVar) throws L5.f {
        int i10 = a.f28910b[kVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        throw new L5.f("Invalid DateStyle: " + kVar.toString());
    }

    @Override // com.facebook.hermes.intl.b
    public AttributedCharacterIterator a(double d10) {
        return this.f28908a.formatToCharacterIterator(Double.valueOf(d10));
    }

    @Override // com.facebook.hermes.intl.b
    public String b(L5.b bVar) {
        return NumberingSystem.getInstance((ULocale) bVar.h()).getName();
    }

    @Override // com.facebook.hermes.intl.b
    public String c(double d10) {
        return this.f28908a.format(new Date((long) d10));
    }

    @Override // com.facebook.hermes.intl.b
    public String d(AttributedCharacterIterator.Attribute attribute, String str) {
        if (attribute == DateFormat.Field.DAY_OF_WEEK) {
            return "weekday";
        }
        if (attribute == DateFormat.Field.ERA) {
            return "era";
        }
        if (attribute == DateFormat.Field.YEAR) {
            try {
                Double.parseDouble(str);
                return "year";
            } catch (NumberFormatException unused) {
                return "yearName";
            }
        }
        if (attribute == DateFormat.Field.MONTH) {
            return "month";
        }
        if (attribute == DateFormat.Field.DAY_OF_MONTH) {
            return "day";
        }
        if (attribute == DateFormat.Field.HOUR0 || attribute == DateFormat.Field.HOUR1 || attribute == DateFormat.Field.HOUR_OF_DAY0 || attribute == DateFormat.Field.HOUR_OF_DAY1) {
            return "hour";
        }
        if (attribute == DateFormat.Field.MINUTE) {
            return "minute";
        }
        if (attribute == DateFormat.Field.SECOND) {
            return "second";
        }
        if (attribute == DateFormat.Field.TIME_ZONE) {
            return "timeZoneName";
        }
        if (attribute == DateFormat.Field.AM_PM) {
            return "dayPeriod";
        }
        return attribute.toString().equals("android.icu.text.DateFormat$Field(related year)") ? "relatedYear" : "literal";
    }

    @Override // com.facebook.hermes.intl.b
    public void e(L5.b bVar, String str, String str2, com.facebook.hermes.intl.b.e eVar, com.facebook.hermes.intl.b.m mVar, com.facebook.hermes.intl.b.d dVar, com.facebook.hermes.intl.b.n nVar, com.facebook.hermes.intl.b.i iVar, com.facebook.hermes.intl.b.c cVar, com.facebook.hermes.intl.b.f fVar, com.facebook.hermes.intl.b.h hVar, com.facebook.hermes.intl.b.j jVar, com.facebook.hermes.intl.b.l lVar, com.facebook.hermes.intl.b.g gVar, Object obj, com.facebook.hermes.intl.b.EnumC0364b enumC0364b, com.facebook.hermes.intl.b.k kVar, Object obj2) throws L5.f {
        Calendar calendar;
        L5.b bVar2;
        String strJ = j(bVar, mVar, dVar, nVar, iVar, cVar, fVar, hVar, jVar, lVar, gVar, enumC0364b, kVar, obj2);
        if (str.isEmpty()) {
            calendar = null;
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(L5.d.h(str));
            L5.b bVarD = bVar.d();
            bVarD.f("ca", arrayList);
            calendar = Calendar.getInstance((ULocale) bVarD.h());
        }
        if (str2.isEmpty()) {
            bVar2 = bVar;
        } else {
            try {
                if (NumberingSystem.getInstanceByName(L5.d.h(str2)) == null) {
                    throw new L5.f("Invalid numbering system: " + str2);
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(L5.d.h(str2));
                bVar2 = bVar;
                bVar2.f("nu", arrayList2);
            } catch (RuntimeException unused) {
                throw new L5.f("Invalid numbering system: " + str2);
            }
        }
        if (calendar != null) {
            this.f28908a = DateFormat.getPatternInstance(calendar, strJ, (ULocale) bVar2.h());
        } else {
            this.f28908a = DateFormat.getPatternInstance(strJ, (ULocale) bVar2.h());
        }
        if (L5.d.n(obj) || L5.d.j(obj)) {
            return;
        }
        this.f28908a.setTimeZone(TimeZone.getTimeZone(L5.d.h(obj)));
    }

    @Override // com.facebook.hermes.intl.b
    public String f(L5.b bVar) {
        return L5.j.d(DateFormat.getDateInstance(3, (ULocale) bVar.h()).getCalendar().getType());
    }

    @Override // com.facebook.hermes.intl.b
    public com.facebook.hermes.intl.b.g g(L5.b bVar) {
        try {
            String strA = b.a(((SimpleDateFormat) DateFormat.getTimeInstance(0, (ULocale) bVar.h())).toPattern());
            if (strA.contains(String.valueOf('h'))) {
                return com.facebook.hermes.intl.b.g.H12;
            }
            if (strA.contains(String.valueOf('K'))) {
                return com.facebook.hermes.intl.b.g.H11;
            }
            return strA.contains(String.valueOf('H')) ? com.facebook.hermes.intl.b.g.H23 : com.facebook.hermes.intl.b.g.H24;
        } catch (ClassCastException unused) {
            return com.facebook.hermes.intl.b.g.H24;
        }
    }

    @Override // com.facebook.hermes.intl.b
    public String h(L5.b bVar) {
        return Calendar.getInstance((ULocale) bVar.h()).getTimeZone().getID();
    }
}

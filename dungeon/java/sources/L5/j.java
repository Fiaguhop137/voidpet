package L5;

import android.icu.text.Collator;
import android.icu.text.NumberingSystem;
import android.icu.util.Calendar;
import android.icu.util.ULocale;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f6365a = "calendar";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f6366b = "ca";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f6367c = "numbers";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f6368d = "nu";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f6369e = "hours";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f6370f = "hc";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f6371g = "collation";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f6372h = "co";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f6373i = "colnumeric";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f6374j = "kn";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static String f6375k = "colcasefirst";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static String f6376l = "kf";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static HashMap f6377m = new a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static HashMap f6378n = new b();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Map f6379o = new c();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static Map f6380p = new d();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static Map f6381q = new e();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static Map f6382r = new f();

    class a extends HashMap {
        a() {
            put(j.f6366b, j.f6365a);
            put(j.f6368d, j.f6367c);
            put(j.f6370f, j.f6369e);
            put(j.f6372h, j.f6371g);
            put(j.f6374j, j.f6373i);
            put(j.f6376l, j.f6375k);
        }
    }

    class b extends HashMap {
        b() {
            put(j.f6365a, j.f6366b);
            put(j.f6367c, j.f6368d);
            put(j.f6369e, j.f6370f);
            put(j.f6371g, j.f6372h);
            put(j.f6373i, j.f6374j);
            put(j.f6375k, j.f6376l);
        }
    }

    class c extends HashMap {
        c() {
            put("dictionary", "dict");
            put("phonebook", "phonebk");
            put("traditional", "trad");
            put("gb2312han", "gb2312");
        }
    }

    class d extends HashMap {
        d() {
            put("gregorian", "gregory");
        }
    }

    class e extends HashMap {
        e() {
            put("traditional", "traditio");
        }
    }

    class f extends HashMap {
        f() {
            put("nu", new String[]{"adlm", "ahom", "arab", "arabext", "bali", "beng", "bhks", "brah", "cakm", "cham", "deva", "diak", "fullwide", "gong", "gonm", "gujr", "guru", "hanidec", "hmng", "hmnp", "java", "kali", "khmr", "knda", "lana", "lanatham", "laoo", "latn", "lepc", "limb", "mathbold", "mathdbl", "mathmono", "mathsanb", "mathsans", "mlym", "modi", "mong", "mroo", "mtei", "mymr", "mymrshan", "mymrtlng", "newa", "nkoo", "olck", "orya", "osma", "rohg", "saur", "segment", "shrd", "sind", "sinh", "sora", "sund", "takr", "talu", "tamldec", "telu", "thai", "tibt", "tirh", "vaii", "wara", "wcho"});
            put("co", new String[]{"big5han", "compat", "dict", "direct", "ducet", "emoji", "eor", "gb2312", "phonebk", "phonetic", "pinyin", "reformed", "searchjl", "stroke", "trad", "unihan", "zhuyin"});
            put("ca", new String[]{"buddhist", "chinese", "coptic", "dangi", "ethioaa", "ethiopic", "gregory", "hebrew", "indian", "islamic", "islamic-umalqura", "islamic-tbla", "islamic-civil", "islamic-rgsa", "iso8601", "japanese", "persian", "roc"});
        }
    }

    public static String a(String str) {
        return f6377m.containsKey(str) ? (String) f6377m.get(str) : str;
    }

    public static String b(String str) {
        return f6378n.containsKey(str) ? (String) f6378n.get(str) : str;
    }

    public static boolean c(String str, String str2, L5.b bVar) {
        ULocale uLocale = (ULocale) bVar.h();
        String[] availableNames = new String[0];
        if (str.equals("co")) {
            if (str2.equals("standard") || str2.equals("search")) {
                return false;
            }
            availableNames = Collator.getKeywordValuesForLocale("co", uLocale, false);
        } else if (str.equals("ca")) {
            availableNames = Calendar.getKeywordValuesForLocale("ca", uLocale, false);
        } else if (str.equals("nu")) {
            availableNames = NumberingSystem.getAvailableNames();
        }
        if (availableNames.length == 0) {
            return true;
        }
        return Arrays.asList(availableNames).contains(str2);
    }

    public static String d(String str) {
        return !f6380p.containsKey(str) ? str : (String) f6380p.get(str);
    }

    public static String e(String str) {
        Map map = f6379o;
        return !map.containsKey(str) ? str : (String) map.get(str);
    }

    public static Object f(String str, Object obj) {
        if (str.equals("ca") && L5.d.m(obj)) {
            return d((String) obj);
        }
        if (str.equals("nu") && L5.d.m(obj)) {
            return g((String) obj);
        }
        if (str.equals("co") && L5.d.m(obj)) {
            return e((String) obj);
        }
        if (str.equals("kn") && L5.d.m(obj) && obj.equals("yes")) {
            return L5.d.r("true");
        }
        return ((str.equals("kn") || str.equals("kf")) && L5.d.m(obj) && obj.equals("no")) ? L5.d.r("false") : obj;
    }

    public static String g(String str) {
        return !f6381q.containsKey(str) ? str : (String) f6381q.get(str);
    }
}

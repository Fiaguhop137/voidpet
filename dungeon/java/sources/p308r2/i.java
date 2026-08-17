package p308r2;

import B9.s;
import C9.AbstractC0876t;
import C9.AbstractC0877u;
import U1.AbstractC1459a;
import U1.AbstractC1460b;
import U1.InterfaceC1466h;
import U1.S;
import U1.y;
import W1.f;
import W1.j;
import W1.x;
import android.content.Context;
import android.os.Handler;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class i implements d, x {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final AbstractC0876t f52045r = AbstractC0876t.B(4300000L, 3200000L, 2400000L, 1700000L, 860000L);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final AbstractC0876t f52046s = AbstractC0876t.B(1500000L, 980000L, 750000L, 520000L, 290000L);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final AbstractC0876t f52047t = AbstractC0876t.B(2000000L, 1300000L, 1000000L, 860000L, 610000L);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final AbstractC0876t f52048u = AbstractC0876t.B(2500000L, 1700000L, 1200000L, 970000L, 680000L);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final AbstractC0876t f52049v = AbstractC0876t.B(4700000L, 2800000L, 2100000L, 1700000L, 980000L);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final AbstractC0876t f52050w = AbstractC0876t.B(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static i f52051x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f52052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC0877u f52053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d.a.C0623a f52054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC1466h f52055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f52056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final r f52057f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f52058g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f52059h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f52060i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f52061j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f52062k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f52063l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f52064m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f52065n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f52066o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f52067p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f52068q;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f52069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f52070b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f52071c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private InterfaceC1466h f52072d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f52073e;

        public b(Context context) {
            this.f52069a = context == null ? null : context.getApplicationContext();
            this.f52071c = 2000;
            this.f52072d = InterfaceC1466h.f12906a;
            this.f52073e = true;
            HashMap map = new HashMap(8);
            this.f52070b = map;
            map.put(0, 1000000L);
            map.put(2, -9223372036854775807L);
            map.put(3, -9223372036854775807L);
            map.put(4, -9223372036854775807L);
            map.put(5, -9223372036854775807L);
            map.put(10, -9223372036854775807L);
            map.put(9, -9223372036854775807L);
            map.put(7, -9223372036854775807L);
        }

        public i a() {
            return new i(this.f52069a, this.f52070b, this.f52071c, this.f52072d, this.f52073e, null);
        }
    }

    private i(Context context, Map map, int i10, InterfaceC1466h interfaceC1466h, boolean z10) {
        this.f52052a = context == null ? null : context.getApplicationContext();
        this.f52053b = AbstractC0877u.c(map);
        this.f52054c = new d.a.C0623a();
        this.f52057f = new r(i10);
        this.f52055d = interfaceC1466h;
        this.f52056e = z10;
        if (context == null) {
            this.f52065n = 0;
            this.f52063l = 1000000L;
            return;
        }
        y yVarE = y.e(context);
        int iG = yVarE.g();
        this.f52065n = iG;
        this.f52063l = l(iG);
        yVarE.k(new h(this), AbstractC1460b.a());
    }

    /* synthetic */ i(Context context, Map map, int i10, InterfaceC1466h interfaceC1466h, boolean z10, a aVar) {
        this(context, map, i10, interfaceC1466h, z10);
    }

    private static int[] k(String str) {
        str.getClass();
        switch (str) {
            case "AD":
            case "AI":
            case "BB":
            case "BQ":
            case "CW":
            case "DM":
            case "KN":
            case "KY":
            case "SX":
            case "VC":
                return new int[]{1, 2, 0, 0, 2, 2};
            case "AE":
                return new int[]{1, 4, 2, 3, 4, 1};
            case "AF":
            case "SZ":
                return new int[]{4, 4, 3, 4, 2, 2};
            case "AG":
            case "CI":
                return new int[]{2, 4, 3, 4, 2, 2};
            case "AL":
                return new int[]{1, 1, 1, 2, 2, 2};
            case "AM":
            case "PA":
                return new int[]{2, 3, 2, 3, 2, 2};
            case "AO":
                return new int[]{3, 4, 4, 3, 2, 2};
            case "AQ":
            case "ER":
            case "NU":
            case "SC":
            case "SH":
                return new int[]{4, 2, 2, 2, 2, 2};
            case "AR":
                return new int[]{2, 2, 2, 2, 1, 2};
            case "AS":
                return new int[]{2, 2, 3, 3, 2, 2};
            case "AT":
            case "EE":
            case "HU":
            case "IS":
            case "LV":
            case "MT":
            case "SE":
                return new int[]{0, 0, 0, 0, 0, 2};
            case "AU":
                return new int[]{0, 3, 1, 1, 3, 0};
            case "AW":
                return new int[]{2, 2, 3, 4, 2, 2};
            case "AX":
            case "CX":
            case "LI":
            case "MS":
            case "PM":
            case "SM":
            case "VA":
                return new int[]{0, 2, 2, 2, 2, 2};
            case "AZ":
            case "DJ":
            case "LY":
            case "SL":
                return new int[]{4, 2, 3, 3, 2, 2};
            case "BA":
            case "JO":
            case "TR":
                return new int[]{1, 1, 1, 1, 2, 2};
            case "BD":
                return new int[]{2, 1, 3, 2, 4, 2};
            case "BE":
                return new int[]{0, 0, 1, 0, 1, 2};
            case "BF":
            case "SD":
            case "SY":
            case "TD":
                return new int[]{4, 3, 4, 4, 2, 2};
            case "BG":
            case "PT":
            case "SI":
                return new int[]{0, 0, 0, 0, 1, 2};
            case "BH":
                return new int[]{1, 3, 1, 3, 4, 2};
            case "BI":
            case "GQ":
            case "HT":
            case "NE":
            case "VE":
            case "YE":
                return new int[]{4, 4, 4, 4, 2, 2};
            case "BJ":
                return new int[]{4, 4, 2, 3, 2, 2};
            case "BL":
            case "MP":
            case "PY":
                return new int[]{1, 2, 2, 2, 2, 2};
            case "BM":
                return new int[]{0, 2, 0, 0, 2, 2};
            case "BN":
                return new int[]{3, 2, 0, 0, 2, 2};
            case "BO":
                return new int[]{1, 2, 4, 4, 2, 2};
            case "BR":
                return new int[]{1, 1, 1, 1, 2, 4};
            case "BS":
                return new int[]{3, 2, 1, 1, 2, 2};
            case "BT":
                return new int[]{3, 1, 2, 2, 3, 2};
            case "BW":
                return new int[]{3, 2, 1, 0, 2, 2};
            case "BY":
                return new int[]{1, 2, 3, 3, 2, 2};
            case "BZ":
            case "CK":
                return new int[]{2, 2, 2, 1, 2, 2};
            case "CA":
            case "UA":
                return new int[]{0, 2, 1, 2, 3, 3};
            case "CD":
            case "ML":
                return new int[]{3, 3, 2, 2, 2, 2};
            case "CF":
                return new int[]{4, 2, 4, 2, 2, 2};
            case "CG":
            case "EG":
            case "MG":
                return new int[]{3, 4, 3, 3, 2, 2};
            case "CH":
                return new int[]{0, 1, 0, 0, 0, 2};
            case "CL":
            case "TH":
                return new int[]{0, 1, 2, 2, 2, 2};
            case "CM":
            case "MR":
                return new int[]{4, 3, 3, 4, 2, 2};
            case "CN":
                return new int[]{2, 0, 1, 1, 3, 1};
            case "CO":
                return new int[]{2, 3, 3, 2, 2, 2};
            case "CR":
            case "NI":
                return new int[]{2, 4, 4, 4, 2, 2};
            case "CU":
            case "KI":
            case "NR":
            case "TL":
                return new int[]{4, 2, 4, 4, 2, 2};
            case "CV":
                return new int[]{2, 3, 0, 1, 2, 2};
            case "CY":
                return new int[]{1, 0, 1, 0, 0, 2};
            case "CZ":
                return new int[]{0, 0, 2, 0, 1, 2};
            case "DE":
                return new int[]{0, 1, 4, 2, 2, 1};
            case "DK":
                return new int[]{0, 0, 2, 0, 0, 2};
            case "DO":
            case "LR":
                return new int[]{3, 4, 4, 4, 2, 2};
            case "DZ":
            case "TJ":
                return new int[]{3, 3, 4, 4, 2, 2};
            case "EC":
                return new int[]{1, 3, 2, 1, 2, 2};
            case "ES":
                return new int[]{0, 0, 0, 0, 1, 0};
            case "ET":
                return new int[]{4, 3, 4, 4, 4, 2};
            case "FI":
                return new int[]{0, 0, 0, 1, 0, 2};
            case "FJ":
                return new int[]{3, 2, 2, 3, 2, 2};
            case "FK":
            case "NF":
            case "SJ":
                return new int[]{3, 2, 2, 2, 2, 2};
            case "FM":
                return new int[]{4, 2, 4, 0, 2, 2};
            case "FO":
                return new int[]{0, 2, 2, 0, 2, 2};
            case "FR":
                return new int[]{1, 1, 1, 1, 0, 2};
            case "GA":
                return new int[]{3, 4, 0, 0, 2, 2};
            case "GB":
                return new int[]{1, 1, 3, 2, 2, 2};
            case "GD":
                return new int[]{2, 2, 0, 0, 2, 2};
            case "GE":
                return new int[]{1, 1, 0, 2, 2, 2};
            case "GF":
                return new int[]{3, 2, 3, 3, 2, 2};
            case "GG":
                return new int[]{0, 2, 1, 1, 2, 2};
            case "GH":
                return new int[]{3, 3, 3, 2, 2, 2};
            case "GI":
            case "IM":
            case "JE":
                return new int[]{0, 2, 0, 1, 2, 2};
            case "GL":
            case "MC":
                return new int[]{1, 2, 2, 0, 2, 2};
            case "GM":
            case "SS":
                return new int[]{4, 3, 2, 4, 2, 2};
            case "GN":
                return new int[]{3, 4, 4, 2, 2, 2};
            case "GP":
                return new int[]{2, 1, 1, 3, 2, 2};
            case "GR":
                return new int[]{1, 0, 0, 0, 1, 2};
            case "GT":
                return new int[]{2, 1, 2, 1, 2, 2};
            case "GU":
                return new int[]{2, 2, 4, 3, 3, 2};
            case "GW":
                return new int[]{4, 4, 1, 2, 2, 2};
            case "GY":
                return new int[]{3, 1, 1, 3, 2, 2};
            case "HK":
                return new int[]{0, 1, 0, 1, 1, 0};
            case "HR":
            case "KW":
                return new int[]{1, 0, 0, 0, 0, 2};
            case "ID":
                return new int[]{3, 1, 3, 3, 2, 4};
            case "IE":
                return new int[]{1, 1, 1, 1, 1, 2};
            case "IL":
                return new int[]{1, 2, 2, 3, 4, 2};
            case "IN":
                return new int[]{1, 1, 3, 2, 2, 3};
            case "IO":
                return new int[]{3, 2, 2, 0, 2, 2};
            case "IQ":
                return new int[]{3, 2, 3, 2, 2, 2};
            case "IR":
                return new int[]{4, 2, 3, 3, 4, 3};
            case "IT":
                return new int[]{0, 1, 1, 2, 1, 2};
            case "JM":
                return new int[]{2, 4, 3, 1, 2, 2};
            case "JP":
                return new int[]{0, 3, 2, 3, 4, 2};
            case "KE":
                return new int[]{3, 2, 1, 1, 1, 2};
            case "KG":
                return new int[]{2, 1, 1, 2, 2, 2};
            case "KH":
                return new int[]{1, 0, 4, 2, 2, 2};
            case "KM":
            case "VU":
                return new int[]{4, 3, 3, 2, 2, 2};
            case "KR":
                return new int[]{0, 2, 2, 4, 4, 4};
            case "KZ":
                return new int[]{2, 1, 2, 2, 3, 2};
            case "LA":
                return new int[]{1, 2, 1, 3, 2, 2};
            case "LB":
                return new int[]{3, 1, 1, 2, 2, 2};
            case "LC":
                return new int[]{2, 2, 1, 1, 2, 2};
            case "LK":
            case "MM":
                return new int[]{3, 2, 3, 3, 4, 2};
            case "LS":
            case "PG":
                return new int[]{4, 3, 3, 3, 2, 2};
            case "LT":
                return new int[]{0, 1, 0, 1, 0, 2};
            case "LU":
                return new int[]{4, 0, 3, 2, 1, 3};
            case "MA":
                return new int[]{3, 3, 1, 1, 2, 2};
            case "MD":
                return new int[]{1, 0, 0, 0, 2, 2};
            case "ME":
                return new int[]{2, 0, 0, 1, 3, 2};
            case "MF":
                return new int[]{1, 2, 2, 3, 2, 2};
            case "MH":
            case "TM":
            case "TV":
            case "WF":
                return new int[]{4, 2, 2, 4, 2, 2};
            case "MK":
                return new int[]{1, 0, 0, 1, 3, 2};
            case "MN":
                return new int[]{2, 0, 2, 2, 2, 2};
            case "MO":
                return new int[]{0, 2, 4, 4, 3, 1};
            case "MQ":
                return new int[]{2, 1, 2, 3, 2, 2};
            case "MU":
                return new int[]{3, 1, 0, 2, 2, 2};
            case "MV":
                return new int[]{3, 2, 1, 3, 4, 2};
            case "MW":
                return new int[]{3, 2, 2, 1, 2, 2};
            case "MX":
                return new int[]{2, 4, 4, 4, 3, 2};
            case "MY":
                return new int[]{1, 0, 4, 1, 1, 0};
            case "MZ":
            case "WS":
                return new int[]{3, 1, 2, 2, 2, 2};
            case "NA":
                return new int[]{3, 4, 3, 2, 2, 2};
            case "NC":
            case "YT":
                return new int[]{2, 3, 3, 4, 2, 2};
            case "NG":
                return new int[]{3, 4, 2, 1, 2, 2};
            case "NL":
                return new int[]{2, 1, 4, 3, 0, 4};
            case "NO":
                return new int[]{0, 0, 3, 0, 0, 2};
            case "NP":
                return new int[]{2, 2, 4, 3, 2, 2};
            case "NZ":
                return new int[]{0, 0, 1, 2, 4, 2};
            case "OM":
                return new int[]{2, 3, 1, 2, 4, 2};
            case "PE":
                return new int[]{1, 2, 4, 4, 3, 2};
            case "PF":
                return new int[]{2, 2, 3, 1, 2, 2};
            case "PH":
                return new int[]{2, 1, 2, 3, 2, 1};
            case "PK":
                return new int[]{3, 3, 3, 3, 2, 2};
            case "PL":
                return new int[]{1, 0, 2, 2, 4, 4};
            case "PR":
                return new int[]{2, 0, 2, 1, 2, 0};
            case "PS":
                return new int[]{3, 4, 1, 3, 2, 2};
            case "PW":
                return new int[]{2, 2, 4, 1, 2, 2};
            case "QA":
                return new int[]{1, 4, 4, 4, 4, 2};
            case "RE":
                return new int[]{0, 3, 2, 3, 1, 2};
            case "RO":
                return new int[]{0, 0, 1, 1, 3, 2};
            case "RS":
                return new int[]{1, 0, 0, 1, 2, 2};
            case "RU":
                return new int[]{1, 0, 0, 1, 3, 3};
            case "RW":
                return new int[]{3, 3, 2, 0, 2, 2};
            case "SA":
                return new int[]{3, 1, 1, 2, 2, 0};
            case "SB":
            case "ZW":
                return new int[]{4, 2, 4, 3, 2, 2};
            case "SG":
                return new int[]{2, 3, 3, 3, 1, 1};
            case "SK":
                return new int[]{0, 1, 1, 1, 2, 2};
            case "SN":
                return new int[]{4, 4, 3, 2, 2, 2};
            case "SO":
                return new int[]{2, 2, 3, 4, 4, 2};
            case "SR":
                return new int[]{2, 4, 4, 1, 2, 2};
            case "ST":
                return new int[]{2, 2, 1, 2, 2, 2};
            case "SV":
                return new int[]{2, 3, 2, 1, 2, 2};
            case "TC":
                return new int[]{3, 2, 1, 2, 2, 2};
            case "TG":
                return new int[]{3, 4, 1, 0, 2, 2};
            case "TN":
                return new int[]{3, 1, 1, 1, 2, 2};
            case "TO":
                return new int[]{3, 2, 4, 3, 2, 2};
            case "TT":
                return new int[]{2, 4, 1, 0, 2, 2};
            case "TW":
                return new int[]{0, 0, 0, 0, 0, 0};
            case "TZ":
                return new int[]{3, 4, 2, 1, 3, 2};
            case "UG":
                return new int[]{3, 3, 2, 3, 4, 2};
            case "US":
                return new int[]{2, 2, 4, 1, 3, 1};
            case "UY":
                return new int[]{2, 1, 1, 2, 1, 2};
            case "UZ":
                return new int[]{1, 2, 3, 4, 3, 2};
            case "VG":
                return new int[]{2, 2, 1, 1, 2, 4};
            case "VI":
                return new int[]{0, 2, 1, 2, 2, 2};
            case "VN":
                return new int[]{0, 0, 1, 2, 2, 2};
            case "XK":
                return new int[]{1, 2, 1, 1, 2, 2};
            case "ZA":
                return new int[]{2, 4, 2, 1, 1, 2};
            case "ZM":
                return new int[]{4, 4, 4, 3, 2, 2};
            default:
                return new int[]{2, 2, 2, 2, 2, 2};
        }
    }

    private long l(int i10) {
        Long lValueOf = (Long) this.f52053b.get(Integer.valueOf(i10));
        if (lValueOf == null) {
            lValueOf = (Long) this.f52053b.get(0);
        } else if (lValueOf.longValue() == -9223372036854775807L) {
            lValueOf = Long.valueOf(m(this.f52068q, i10));
        }
        if (lValueOf == null) {
            lValueOf = 1000000L;
        }
        return lValueOf.longValue();
    }

    private static long m(String str, int i10) {
        int[] iArrK = k(s.d(str));
        if (i10 != 2) {
            if (i10 == 3) {
                return ((Long) f52046s.get(iArrK[1])).longValue();
            }
            if (i10 == 4) {
                return ((Long) f52047t.get(iArrK[2])).longValue();
            }
            if (i10 == 5) {
                return ((Long) f52048u.get(iArrK[3])).longValue();
            }
            if (i10 != 7) {
                if (i10 == 9) {
                    return ((Long) f52050w.get(iArrK[5])).longValue();
                }
                if (i10 != 10) {
                    return 1000000L;
                }
                return ((Long) f52049v.get(iArrK[4])).longValue();
            }
        }
        return ((Long) f52045r.get(iArrK[0])).longValue();
    }

    public static synchronized i n(Context context) {
        try {
            if (f52051x == null) {
                f52051x = new b(context).a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f52051x;
    }

    private static boolean o(j jVar, boolean z10) {
        return z10 && !jVar.d(8);
    }

    private void p(int i10, long j10, long j11) {
        if (i10 == 0 && j10 == 0 && j11 == this.f52064m) {
            return;
        }
        this.f52064m = j11;
        this.f52054c.c(i10, j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void q(int i10) throws Throwable {
        Throwable th;
        try {
            try {
                int i11 = this.f52065n;
                if (i11 != 0) {
                    try {
                        if (!this.f52056e) {
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                if (this.f52066o) {
                    i10 = this.f52067p;
                }
                if (i11 != i10 || this.f52068q == null) {
                    this.f52065n = i10;
                    if (i10 == 1 || i10 == 0 || i10 == 8) {
                        return;
                    }
                    if (this.f52068q == null) {
                        this.f52068q = S.V(this.f52052a);
                    }
                    this.f52063l = l(i10);
                    long jC = this.f52055d.c();
                    p(this.f52058g > 0 ? (int) (jC - this.f52059h) : 0, this.f52060i, this.f52063l);
                    this.f52059h = jC;
                    this.f52060i = 0L;
                    this.f52062k = 0L;
                    this.f52061j = 0L;
                    this.f52057f.g();
                    return;
                }
                return;
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
        }
        throw th;
    }

    @Override // p308r2.d
    public x b() {
        return this;
    }

    @Override // p308r2.d
    public synchronized long c() {
        return this.f52063l;
    }

    @Override // p308r2.d
    public void d(d.a aVar) {
        this.f52054c.d(aVar);
    }

    @Override // W1.x
    public void e(f fVar, j jVar, boolean z10) {
    }

    @Override // p308r2.d
    public void f(Handler handler, d.a aVar) {
        AbstractC1459a.e(handler);
        AbstractC1459a.e(aVar);
        this.f52054c.b(handler, aVar);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0055 A[Catch: all -> 0x0072, TRY_ENTER, TryCatch #1 {all -> 0x0072, blocks: (B:3:0x0001, B:7:0x0009, B:11:0x0011, B:13:0x002e, B:23:0x0060, B:22:0x0055), top: B:38:0x0001 }] */
    @Override // W1.x
    public synchronized void g(f fVar, j jVar, boolean z10) throws Throwable {
        Throwable th;
        i iVar;
        try {
            try {
                if (o(jVar, z10)) {
                    AbstractC1459a.g(this.f52058g > 0);
                    long jC = this.f52055d.c();
                    int i10 = (int) (jC - this.f52059h);
                    this.f52061j += (long) i10;
                    long j10 = this.f52062k;
                    long j11 = this.f52060i;
                    this.f52062k = j10 + j11;
                    if (i10 > 0) {
                        this.f52057f.c((int) Math.sqrt(j11), (j11 * 8000.0f) / i10);
                        if (this.f52061j < 2000) {
                            try {
                                if (this.f52062k >= 524288) {
                                    this.f52063l = (long) this.f52057f.f(0.5f);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            this.f52063l = (long) this.f52057f.f(0.5f);
                        }
                        iVar = this;
                        iVar.p(i10, this.f52060i, this.f52063l);
                        iVar.f52059h = jC;
                        iVar.f52060i = 0L;
                    } else {
                        iVar = this;
                    }
                    iVar.f52058g--;
                    return;
                }
                return;
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        throw th;
    }

    @Override // W1.x
    public synchronized void h(f fVar, j jVar, boolean z10) {
        try {
            if (o(jVar, z10)) {
                if (this.f52058g == 0) {
                    this.f52059h = this.f52055d.c();
                }
                this.f52058g++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // W1.x
    public synchronized void i(f fVar, j jVar, boolean z10, int i10) {
        if (o(jVar, z10)) {
            this.f52060i += (long) i10;
        }
    }
}

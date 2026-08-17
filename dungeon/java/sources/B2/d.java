package B2;

import U1.F;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p380v2.C4251n;

/* JADX INFO: loaded from: classes.dex */
final class d extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long[] f550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long[] f551d;

    public d() {
        super(new C4251n());
        this.f549b = -9223372036854775807L;
        this.f550c = new long[0];
        this.f551d = new long[0];
    }

    private static Boolean g(F f10) {
        return Boolean.valueOf(f10.L() == 1);
    }

    private static Object h(F f10, int i10) {
        if (i10 == 0) {
            return j(f10);
        }
        if (i10 == 1) {
            return g(f10);
        }
        if (i10 == 2) {
            return n(f10);
        }
        if (i10 == 3) {
            return l(f10);
        }
        if (i10 == 8) {
            return k(f10);
        }
        if (i10 == 10) {
            return m(f10);
        }
        if (i10 != 11) {
            return null;
        }
        return i(f10);
    }

    private static Date i(F f10) {
        Date date = new Date((long) j(f10).doubleValue());
        f10.b0(2);
        return date;
    }

    private static Double j(F f10) {
        return Double.valueOf(Double.longBitsToDouble(f10.E()));
    }

    private static HashMap k(F f10) {
        int iP = f10.P();
        HashMap map = new HashMap(iP);
        for (int i10 = 0; i10 < iP; i10++) {
            String strN = n(f10);
            Object objH = h(f10, o(f10));
            if (objH != null) {
                map.put(strN, objH);
            }
        }
        return map;
    }

    private static HashMap l(F f10) {
        HashMap map = new HashMap();
        while (true) {
            String strN = n(f10);
            int iO = o(f10);
            if (iO == 9) {
                return map;
            }
            Object objH = h(f10, iO);
            if (objH != null) {
                map.put(strN, objH);
            }
        }
    }

    private static ArrayList m(F f10) {
        int iP = f10.P();
        ArrayList arrayList = new ArrayList(iP);
        for (int i10 = 0; i10 < iP; i10++) {
            Object objH = h(f10, o(f10));
            if (objH != null) {
                arrayList.add(objH);
            }
        }
        return arrayList;
    }

    private static String n(F f10) {
        int iT = f10.T();
        int iG = f10.g();
        f10.b0(iT);
        return new String(f10.f(), iG, iT);
    }

    private static int o(F f10) {
        return f10.L();
    }

    @Override // B2.e
    protected boolean b(F f10) {
        return true;
    }

    @Override // B2.e
    protected boolean c(F f10, long j10) {
        if (o(f10) != 2 || !"onMetaData".equals(n(f10)) || f10.a() == 0 || o(f10) != 8) {
            return false;
        }
        HashMap mapK = k(f10);
        Object obj = mapK.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.f549b = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapK.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f550c = new long[size];
                this.f551d = new long[size];
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj5 = list.get(i10);
                    Object obj6 = list2.get(i10);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f550c = new long[0];
                        this.f551d = new long[0];
                        break;
                    }
                    this.f550c[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f551d[i10] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    public long d() {
        return this.f549b;
    }

    public long[] e() {
        return this.f551d;
    }

    public long[] f() {
        return this.f550c;
    }
}

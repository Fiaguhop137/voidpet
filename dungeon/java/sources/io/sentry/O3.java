package io.sentry;

import io.sentry.util.C3799a;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class O3 implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Date f44418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f44419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicInteger f44420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f44421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f44422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Boolean f44423f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b f44424g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Long f44425h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Double f44426i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f44427j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f44428k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f44429l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f44430m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f44431n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final C3799a f44432o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Map f44433p;

    public static final class a implements InterfaceC3773r0 {
        private Exception c(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.b(EnumC3721i3.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public O3 a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) throws Exception {
            interfaceC3724j1.I();
            Integer numT2 = null;
            ConcurrentHashMap concurrentHashMap = null;
            b bVarValueOf = null;
            Date dateE1 = null;
            Date dateE2 = null;
            String strD2 = null;
            String str = null;
            Boolean boolM1 = null;
            Long lX2 = null;
            Double dS0 = null;
            String strD3 = null;
            String strD4 = null;
            String strD5 = null;
            String strD6 = null;
            String strD7 = null;
            while (true) {
                Integer num = numT2;
                ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
                b bVar = bVarValueOf;
                Date date = dateE1;
                Date date2 = dateE2;
                if (interfaceC3724j1.peek() != io.sentry.vendor.gson.stream.b.NAME) {
                    if (bVar == null) {
                        throw c("status", iLogger);
                    }
                    if (date == null) {
                        throw c("started", iLogger);
                    }
                    if (num == null) {
                        throw c("errors", iLogger);
                    }
                    if (strD6 == null) {
                        throw c("release", iLogger);
                    }
                    O3 o10 = new O3(bVar, date, date2, num.intValue(), strD2, str, boolM1, lX2, dS0, strD3, strD4, strD5, strD6, strD7);
                    o10.o(concurrentHashMap2);
                    interfaceC3724j1.T();
                    return o10;
                }
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                switch (strX0) {
                    case "duration":
                        dS0 = interfaceC3724j1.S0();
                        numT2 = num;
                        concurrentHashMap = concurrentHashMap2;
                        bVarValueOf = bVar;
                        dateE1 = date;
                        dateE2 = date2;
                        break;
                    case "started":
                        dateE1 = interfaceC3724j1.e1(iLogger);
                        numT2 = num;
                        concurrentHashMap = concurrentHashMap2;
                        bVarValueOf = bVar;
                        dateE2 = date2;
                        break;
                    case "errors":
                        numT2 = interfaceC3724j1.t2();
                        concurrentHashMap = concurrentHashMap2;
                        bVarValueOf = bVar;
                        dateE1 = date;
                        dateE2 = date2;
                        break;
                    case "status":
                        String strC = io.sentry.util.D.c(interfaceC3724j1.D2());
                        if (strC != null) {
                            bVarValueOf = b.valueOf(strC);
                            numT2 = num;
                            concurrentHashMap = concurrentHashMap2;
                        } else {
                            numT2 = num;
                            concurrentHashMap = concurrentHashMap2;
                            bVarValueOf = bVar;
                        }
                        dateE1 = date;
                        dateE2 = date2;
                        break;
                    case "did":
                        strD2 = interfaceC3724j1.D2();
                        numT2 = num;
                        concurrentHashMap = concurrentHashMap2;
                        bVarValueOf = bVar;
                        dateE1 = date;
                        dateE2 = date2;
                        break;
                    case "seq":
                        lX2 = interfaceC3724j1.x2();
                        numT2 = num;
                        concurrentHashMap = concurrentHashMap2;
                        bVarValueOf = bVar;
                        dateE1 = date;
                        dateE2 = date2;
                        break;
                    case "sid":
                        String strD8 = interfaceC3724j1.D2();
                        if (strD8 == null || !(strD8.length() == 36 || strD8.length() == 32)) {
                            iLogger.c(EnumC3721i3.ERROR, "%s sid is not valid.", strD8);
                        } else {
                            str = strD8;
                        }
                        numT2 = num;
                        concurrentHashMap = concurrentHashMap2;
                        bVarValueOf = bVar;
                        dateE1 = date;
                        dateE2 = date2;
                        break;
                    case "init":
                        boolM1 = interfaceC3724j1.m1();
                        numT2 = num;
                        concurrentHashMap = concurrentHashMap2;
                        bVarValueOf = bVar;
                        dateE1 = date;
                        dateE2 = date2;
                        break;
                    case "timestamp":
                        dateE2 = interfaceC3724j1.e1(iLogger);
                        numT2 = num;
                        concurrentHashMap = concurrentHashMap2;
                        bVarValueOf = bVar;
                        dateE1 = date;
                        break;
                    case "attrs":
                        interfaceC3724j1.I();
                        while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                            String strX1 = interfaceC3724j1.X0();
                            strX1.getClass();
                            switch (strX1) {
                                case "environment":
                                    strD5 = interfaceC3724j1.D2();
                                    break;
                                case "release":
                                    strD6 = interfaceC3724j1.D2();
                                    break;
                                case "ip_address":
                                    strD3 = interfaceC3724j1.D2();
                                    break;
                                case "user_agent":
                                    strD4 = interfaceC3724j1.D2();
                                    break;
                                default:
                                    interfaceC3724j1.k0();
                                    break;
                            }
                        }
                        interfaceC3724j1.T();
                        numT2 = num;
                        concurrentHashMap = concurrentHashMap2;
                        bVarValueOf = bVar;
                        dateE1 = date;
                        dateE2 = date2;
                        break;
                    case "abnormal_mechanism":
                        strD7 = interfaceC3724j1.D2();
                        numT2 = num;
                        concurrentHashMap = concurrentHashMap2;
                        bVarValueOf = bVar;
                        dateE1 = date;
                        dateE2 = date2;
                        break;
                    default:
                        concurrentHashMap = concurrentHashMap2 == null ? new ConcurrentHashMap() : concurrentHashMap2;
                        interfaceC3724j1.M2(iLogger, concurrentHashMap, strX0);
                        numT2 = num;
                        bVarValueOf = bVar;
                        dateE1 = date;
                        dateE2 = date2;
                        break;
                }
            }
        }
    }

    public enum b {
        Ok,
        Exited,
        Crashed,
        Abnormal
    }

    public O3(b bVar, Date date, Date date2, int i10, String str, String str2, Boolean bool, Long l10, Double d10, String str3, String str4, String str5, String str6, String str7) {
        this.f44432o = new C3799a();
        this.f44424g = bVar;
        this.f44418a = date;
        this.f44419b = date2;
        this.f44420c = new AtomicInteger(i10);
        this.f44421d = str;
        this.f44422e = str2;
        this.f44423f = bool;
        this.f44425h = l10;
        this.f44426i = d10;
        this.f44427j = str3;
        this.f44428k = str4;
        this.f44429l = str5;
        this.f44430m = str6;
        this.f44431n = str7;
    }

    public O3(String str, io.sentry.protocol.I i10, String str2, String str3) {
        this(b.Ok, AbstractC3732l.d(), AbstractC3732l.d(), 0, str, M3.a(), Boolean.TRUE, null, null, i10 != null ? i10.j() : null, null, str2, str3, null);
    }

    private double a(Date date) {
        return Math.abs(date.getTime() - this.f44418a.getTime()) / 1000.0d;
    }

    private long i(Date date) {
        long time = date.getTime();
        return time < 0 ? Math.abs(time) : time;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public O3 clone() {
        return new O3(this.f44424g, this.f44418a, this.f44419b, this.f44420c.get(), this.f44421d, this.f44422e, this.f44423f, this.f44425h, this.f44426i, this.f44427j, this.f44428k, this.f44429l, this.f44430m, this.f44431n);
    }

    public void c() {
        d(AbstractC3732l.d());
    }

    public void d(Date date) {
        InterfaceC3698e0 interfaceC3698e0A = this.f44432o.a();
        try {
            this.f44423f = null;
            if (this.f44424g == b.Ok) {
                this.f44424g = b.Exited;
            }
            if (date != null) {
                this.f44419b = date;
            } else {
                this.f44419b = AbstractC3732l.d();
            }
            Date date2 = this.f44419b;
            if (date2 != null) {
                this.f44426i = Double.valueOf(a(date2));
                this.f44425h = Long.valueOf(i(this.f44419b));
            }
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
        } catch (Throwable th) {
            if (interfaceC3698e0A != null) {
                try {
                    interfaceC3698e0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public int e() {
        return this.f44420c.get();
    }

    public String f() {
        return this.f44431n;
    }

    public Boolean g() {
        return this.f44423f;
    }

    public String h() {
        return this.f44430m;
    }

    public String j() {
        return this.f44422e;
    }

    public Date k() {
        Date date = this.f44418a;
        if (date == null) {
            return null;
        }
        return (Date) date.clone();
    }

    public b l() {
        return this.f44424g;
    }

    public boolean m() {
        return this.f44424g != b.Ok;
    }

    public void n() {
        this.f44423f = Boolean.TRUE;
    }

    public void o(Map map) {
        this.f44433p = map;
    }

    public boolean p(b bVar, String str, boolean z10) {
        return q(bVar, str, z10, null);
    }

    public boolean q(b bVar, String str, boolean z10, String str2) {
        boolean z11;
        InterfaceC3698e0 interfaceC3698e0A = this.f44432o.a();
        boolean z12 = true;
        if (bVar != null) {
            try {
                this.f44424g = bVar;
                z11 = true;
            } catch (Throwable th) {
                if (interfaceC3698e0A != null) {
                    try {
                        interfaceC3698e0A.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } else {
            z11 = false;
        }
        if (str != null) {
            this.f44428k = str;
            z11 = true;
        }
        if (z10) {
            this.f44420c.addAndGet(1);
            z11 = true;
        }
        if (str2 != null) {
            this.f44431n = str2;
        } else {
            z12 = z11;
        }
        if (z12) {
            this.f44423f = null;
            Date dateD = AbstractC3732l.d();
            this.f44419b = dateD;
            if (dateD != null) {
                this.f44425h = Long.valueOf(i(dateD));
            }
        }
        if (interfaceC3698e0A != null) {
            interfaceC3698e0A.close();
        }
        return z12;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        if (this.f44422e != null) {
            interfaceC3729k1.d("sid").e(this.f44422e);
        }
        if (this.f44421d != null) {
            interfaceC3729k1.d("did").e(this.f44421d);
        }
        if (this.f44423f != null) {
            interfaceC3729k1.d("init").k(this.f44423f);
        }
        interfaceC3729k1.d("started").j(iLogger, this.f44418a);
        interfaceC3729k1.d("status").j(iLogger, this.f44424g.name().toLowerCase(Locale.ROOT));
        if (this.f44425h != null) {
            interfaceC3729k1.d("seq").i(this.f44425h);
        }
        interfaceC3729k1.d("errors").a(this.f44420c.intValue());
        if (this.f44426i != null) {
            interfaceC3729k1.d("duration").i(this.f44426i);
        }
        if (this.f44419b != null) {
            interfaceC3729k1.d("timestamp").j(iLogger, this.f44419b);
        }
        if (this.f44431n != null) {
            interfaceC3729k1.d("abnormal_mechanism").j(iLogger, this.f44431n);
        }
        interfaceC3729k1.d("attrs");
        interfaceC3729k1.I();
        interfaceC3729k1.d("release").j(iLogger, this.f44430m);
        if (this.f44429l != null) {
            interfaceC3729k1.d("environment").j(iLogger, this.f44429l);
        }
        if (this.f44427j != null) {
            interfaceC3729k1.d("ip_address").j(iLogger, this.f44427j);
        }
        if (this.f44428k != null) {
            interfaceC3729k1.d("user_agent").j(iLogger, this.f44428k);
        }
        interfaceC3729k1.T();
        Map map = this.f44433p;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f44433p.get(str);
                interfaceC3729k1.d(str);
                interfaceC3729k1.j(iLogger, obj);
            }
        }
        interfaceC3729k1.T();
    }
}

package io.sentry;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.v1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3811v1 implements B0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final Map f46598A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private String f46599B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private Map f46600C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f46601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Callable f46602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f46603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f46604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f46605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f46606f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f46607g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f46608h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f46609i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f46610j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f46611k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List f46612l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f46613m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f46614n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f46615o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List f46616p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f46617q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f46618r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f46619s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f46620t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f46621u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f46622v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f46623w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f46624x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f46625y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Date f46626z;

    /* JADX INFO: renamed from: io.sentry.v1$b */
    public static final class b implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3811v1 a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            interfaceC3724j1.I();
            ConcurrentHashMap concurrentHashMap = null;
            C3811v1 c3811v1 = new C3811v1(null);
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                switch (strX0) {
                    case "device_manufacturer":
                        String strD2 = interfaceC3724j1.D2();
                        if (strD2 == null) {
                            break;
                        } else {
                            c3811v1.f46605e = strD2;
                            break;
                        }
                        break;
                    case "android_api_level":
                        Integer numT2 = interfaceC3724j1.t2();
                        if (numT2 == null) {
                            break;
                        } else {
                            c3811v1.f46603c = numT2.intValue();
                            break;
                        }
                        break;
                    case "build_id":
                        String strD3 = interfaceC3724j1.D2();
                        if (strD3 == null) {
                            break;
                        } else {
                            c3811v1.f46615o = strD3;
                            break;
                        }
                        break;
                    case "device_locale":
                        String strD4 = interfaceC3724j1.D2();
                        if (strD4 == null) {
                            break;
                        } else {
                            c3811v1.f46604d = strD4;
                            break;
                        }
                        break;
                    case "profile_id":
                        String strD5 = interfaceC3724j1.D2();
                        if (strD5 == null) {
                            break;
                        } else {
                            c3811v1.f46623w = strD5;
                            break;
                        }
                        break;
                    case "device_os_build_number":
                        String strD6 = interfaceC3724j1.D2();
                        if (strD6 == null) {
                            break;
                        } else {
                            c3811v1.f46607g = strD6;
                            break;
                        }
                        break;
                    case "device_model":
                        String strD7 = interfaceC3724j1.D2();
                        if (strD7 == null) {
                            break;
                        } else {
                            c3811v1.f46606f = strD7;
                            break;
                        }
                        break;
                    case "device_is_emulator":
                        Boolean boolM1 = interfaceC3724j1.m1();
                        if (boolM1 == null) {
                            break;
                        } else {
                            c3811v1.f46610j = boolM1.booleanValue();
                            break;
                        }
                        break;
                    case "duration_ns":
                        String strD8 = interfaceC3724j1.D2();
                        if (strD8 == null) {
                            break;
                        } else {
                            c3811v1.f46618r = strD8;
                            break;
                        }
                        break;
                    case "measurements":
                        Map mapJ2 = interfaceC3724j1.J2(iLogger, new io.sentry.profilemeasurements.a.C0539a());
                        if (mapJ2 == null) {
                            break;
                        } else {
                            c3811v1.f46598A.putAll(mapJ2);
                            break;
                        }
                        break;
                    case "device_physical_memory_bytes":
                        String strD9 = interfaceC3724j1.D2();
                        if (strD9 == null) {
                            break;
                        } else {
                            c3811v1.f46613m = strD9;
                            break;
                        }
                        break;
                    case "device_cpu_frequencies":
                        List list = (List) interfaceC3724j1.z3();
                        if (list == null) {
                            break;
                        } else {
                            c3811v1.f46612l = list;
                            break;
                        }
                        break;
                    case "version_code":
                        String strD10 = interfaceC3724j1.D2();
                        if (strD10 == null) {
                            break;
                        } else {
                            c3811v1.f46619s = strD10;
                            break;
                        }
                        break;
                    case "version_name":
                        String strD11 = interfaceC3724j1.D2();
                        if (strD11 == null) {
                            break;
                        } else {
                            c3811v1.f46620t = strD11;
                            break;
                        }
                        break;
                    case "environment":
                        String strD12 = interfaceC3724j1.D2();
                        if (strD12 == null) {
                            break;
                        } else {
                            c3811v1.f46624x = strD12;
                            break;
                        }
                        break;
                    case "timestamp":
                        Date dateE1 = interfaceC3724j1.e1(iLogger);
                        if (dateE1 == null) {
                            break;
                        } else {
                            c3811v1.f46626z = dateE1;
                            break;
                        }
                        break;
                    case "transaction_name":
                        String strD13 = interfaceC3724j1.D2();
                        if (strD13 == null) {
                            break;
                        } else {
                            c3811v1.f46617q = strD13;
                            break;
                        }
                        break;
                    case "device_os_name":
                        String strD14 = interfaceC3724j1.D2();
                        if (strD14 == null) {
                            break;
                        } else {
                            c3811v1.f46608h = strD14;
                            break;
                        }
                        break;
                    case "architecture":
                        String strD15 = interfaceC3724j1.D2();
                        if (strD15 == null) {
                            break;
                        } else {
                            c3811v1.f46611k = strD15;
                            break;
                        }
                        break;
                    case "transaction_id":
                        String strD16 = interfaceC3724j1.D2();
                        if (strD16 == null) {
                            break;
                        } else {
                            c3811v1.f46621u = strD16;
                            break;
                        }
                        break;
                    case "device_os_version":
                        String strD17 = interfaceC3724j1.D2();
                        if (strD17 == null) {
                            break;
                        } else {
                            c3811v1.f46609i = strD17;
                            break;
                        }
                        break;
                    case "truncation_reason":
                        String strD18 = interfaceC3724j1.D2();
                        if (strD18 == null) {
                            break;
                        } else {
                            c3811v1.f46625y = strD18;
                            break;
                        }
                        break;
                    case "trace_id":
                        String strD19 = interfaceC3724j1.D2();
                        if (strD19 == null) {
                            break;
                        } else {
                            c3811v1.f46622v = strD19;
                            break;
                        }
                        break;
                    case "platform":
                        String strD20 = interfaceC3724j1.D2();
                        if (strD20 == null) {
                            break;
                        } else {
                            c3811v1.f46614n = strD20;
                            break;
                        }
                        break;
                    case "sampled_profile":
                        String strD21 = interfaceC3724j1.D2();
                        if (strD21 == null) {
                            break;
                        } else {
                            c3811v1.f46599B = strD21;
                            break;
                        }
                        break;
                    case "transactions":
                        List listL3 = interfaceC3724j1.L3(iLogger, new C3816w1.a());
                        if (listL3 == null) {
                            break;
                        } else {
                            c3811v1.f46616p.addAll(listL3);
                            break;
                        }
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC3724j1.M2(iLogger, concurrentHashMap, strX0);
                        break;
                }
            }
            c3811v1.G(concurrentHashMap);
            interfaceC3724j1.T();
            return c3811v1;
        }
    }

    private C3811v1() {
        this(new File("dummy"), C3704f1.r());
    }

    /* synthetic */ C3811v1(a aVar) {
        this();
    }

    public C3811v1(File file, InterfaceC3723j0 interfaceC3723j0) {
        this(file, AbstractC3732l.d(), new ArrayList(), interfaceC3723j0.getName(), interfaceC3723j0.F().toString(), interfaceC3723j0.n().p().toString(), "0", 0, "", new CallableC3796u1(), null, null, null, null, null, null, null, null, "normal", new HashMap());
    }

    public C3811v1(File file, Date date, List list, String str, String str2, String str3, String str4, int i10, String str5, Callable callable, String str6, String str7, String str8, Boolean bool, String str9, String str10, String str11, String str12, String str13, Map map) {
        this.f46612l = new ArrayList();
        this.f46599B = null;
        this.f46601a = file;
        this.f46626z = date;
        this.f46611k = str5;
        this.f46602b = callable;
        this.f46603c = i10;
        this.f46604d = Locale.getDefault().toString();
        this.f46605e = str6 == null ? "" : str6;
        this.f46606f = str7 == null ? "" : str7;
        this.f46609i = str8 == null ? "" : str8;
        this.f46610j = bool != null ? bool.booleanValue() : false;
        this.f46613m = str9 != null ? str9 : "0";
        this.f46607g = "";
        this.f46608h = "android";
        this.f46614n = "android";
        this.f46615o = str10 != null ? str10 : "";
        this.f46616p = list;
        this.f46617q = str.isEmpty() ? "unknown" : str;
        this.f46618r = str4;
        this.f46619s = "";
        this.f46620t = str11 != null ? str11 : "";
        this.f46621u = str2;
        this.f46622v = str3;
        this.f46623w = M3.a();
        this.f46624x = str12 != null ? str12 : "production";
        this.f46625y = str13;
        if (!D()) {
            this.f46625y = "normal";
        }
        this.f46598A = map;
    }

    private boolean D() {
        return this.f46625y.equals("normal") || this.f46625y.equals("timeout") || this.f46625y.equals("backgrounded");
    }

    public static /* synthetic */ List a() {
        return new ArrayList();
    }

    public String B() {
        return this.f46623w;
    }

    public File C() {
        return this.f46601a;
    }

    public void E() {
        try {
            this.f46612l = (List) this.f46602b.call();
        } catch (Throwable unused) {
        }
    }

    public void F(String str) {
        this.f46599B = str;
    }

    public void G(Map map) {
        this.f46600C = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        interfaceC3729k1.d("android_api_level").j(iLogger, Integer.valueOf(this.f46603c));
        interfaceC3729k1.d("device_locale").j(iLogger, this.f46604d);
        interfaceC3729k1.d("device_manufacturer").e(this.f46605e);
        interfaceC3729k1.d("device_model").e(this.f46606f);
        interfaceC3729k1.d("device_os_build_number").e(this.f46607g);
        interfaceC3729k1.d("device_os_name").e(this.f46608h);
        interfaceC3729k1.d("device_os_version").e(this.f46609i);
        interfaceC3729k1.d("device_is_emulator").c(this.f46610j);
        interfaceC3729k1.d("architecture").j(iLogger, this.f46611k);
        interfaceC3729k1.d("device_cpu_frequencies").j(iLogger, this.f46612l);
        interfaceC3729k1.d("device_physical_memory_bytes").e(this.f46613m);
        interfaceC3729k1.d("platform").e(this.f46614n);
        interfaceC3729k1.d("build_id").e(this.f46615o);
        interfaceC3729k1.d("transaction_name").e(this.f46617q);
        interfaceC3729k1.d("duration_ns").e(this.f46618r);
        interfaceC3729k1.d("version_name").e(this.f46620t);
        interfaceC3729k1.d("version_code").e(this.f46619s);
        if (!this.f46616p.isEmpty()) {
            interfaceC3729k1.d("transactions").j(iLogger, this.f46616p);
        }
        interfaceC3729k1.d("transaction_id").e(this.f46621u);
        interfaceC3729k1.d("trace_id").e(this.f46622v);
        interfaceC3729k1.d("profile_id").e(this.f46623w);
        interfaceC3729k1.d("environment").e(this.f46624x);
        interfaceC3729k1.d("truncation_reason").e(this.f46625y);
        if (this.f46599B != null) {
            interfaceC3729k1.d("sampled_profile").e(this.f46599B);
        }
        String strF = interfaceC3729k1.f();
        interfaceC3729k1.h("");
        interfaceC3729k1.d("measurements").j(iLogger, this.f46598A);
        interfaceC3729k1.h(strF);
        interfaceC3729k1.d("timestamp").j(iLogger, this.f46626z);
        Map map = this.f46600C;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f46600C.get(str);
                interfaceC3729k1.d(str);
                interfaceC3729k1.j(iLogger, obj);
            }
        }
        interfaceC3729k1.T();
    }
}

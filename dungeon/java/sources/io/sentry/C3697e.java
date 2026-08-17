package io.sentry;

import io.sentry.util.AbstractC3801c;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3697e implements B0, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Long f45795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f45796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Long f45797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f45798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f45799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f45800f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f45801g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f45802h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private EnumC3721i3 f45803i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map f45804j;

    /* JADX INFO: renamed from: io.sentry.e$a */
    public static final class a implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3697e a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            interfaceC3724j1.I();
            Date dateD = AbstractC3732l.d();
            Map concurrentHashMap = new ConcurrentHashMap();
            String strD2 = null;
            String strD3 = null;
            String strD4 = null;
            String strD5 = null;
            EnumC3721i3 enumC3721i3A = null;
            ConcurrentHashMap concurrentHashMap2 = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                switch (strX0) {
                    case "origin":
                        strD5 = interfaceC3724j1.D2();
                        break;
                    case "data":
                        Map mapB = AbstractC3801c.b((Map) interfaceC3724j1.z3());
                        if (mapB == null) {
                            break;
                        } else {
                            concurrentHashMap = mapB;
                            break;
                        }
                        break;
                    case "type":
                        strD3 = interfaceC3724j1.D2();
                        break;
                    case "category":
                        strD4 = interfaceC3724j1.D2();
                        break;
                    case "timestamp":
                        Date dateE1 = interfaceC3724j1.e1(iLogger);
                        if (dateE1 == null) {
                            break;
                        } else {
                            dateD = dateE1;
                            break;
                        }
                        break;
                    case "level":
                        try {
                            enumC3721i3A = new EnumC3721i3.a().a(interfaceC3724j1, iLogger);
                            break;
                        } catch (Exception e10) {
                            iLogger.a(EnumC3721i3.ERROR, e10, "Error when deserializing SentryLevel", new Object[0]);
                            break;
                        }
                        break;
                    case "message":
                        strD2 = interfaceC3724j1.D2();
                        break;
                    default:
                        if (concurrentHashMap2 == null) {
                            concurrentHashMap2 = new ConcurrentHashMap();
                        }
                        interfaceC3724j1.M2(iLogger, concurrentHashMap2, strX0);
                        break;
                }
            }
            C3697e c3697e = new C3697e(dateD);
            c3697e.f45798d = strD2;
            c3697e.f45799e = strD3;
            c3697e.f45800f = concurrentHashMap;
            c3697e.f45801g = strD4;
            c3697e.f45802h = strD5;
            c3697e.f45803i = enumC3721i3A;
            c3697e.L(concurrentHashMap2);
            interfaceC3724j1.T();
            return c3697e;
        }
    }

    public C3697e() {
        this(System.currentTimeMillis());
    }

    public C3697e(long j10) {
        this.f45800f = new ConcurrentHashMap();
        this.f45797c = Long.valueOf(System.nanoTime());
        this.f45795a = Long.valueOf(j10);
        this.f45796b = null;
    }

    C3697e(C3697e c3697e) {
        this.f45800f = new ConcurrentHashMap();
        this.f45797c = Long.valueOf(System.nanoTime());
        this.f45796b = c3697e.f45796b;
        this.f45795a = c3697e.f45795a;
        this.f45798d = c3697e.f45798d;
        this.f45799e = c3697e.f45799e;
        this.f45801g = c3697e.f45801g;
        this.f45802h = c3697e.f45802h;
        Map mapB = AbstractC3801c.b(c3697e.f45800f);
        if (mapB != null) {
            this.f45800f = mapB;
        }
        this.f45804j = AbstractC3801c.b(c3697e.f45804j);
        this.f45803i = c3697e.f45803i;
    }

    public C3697e(Date date) {
        this.f45800f = new ConcurrentHashMap();
        this.f45797c = Long.valueOf(System.nanoTime());
        this.f45796b = date;
        this.f45795a = null;
    }

    private static boolean C(C3697e c3697e, C3697e c3697e2) {
        return r(c3697e, c3697e2) && io.sentry.util.w.a(c3697e.v("status_code"), c3697e2.v("status_code")) && io.sentry.util.w.a(c3697e.v("url"), c3697e2.v("url")) && io.sentry.util.w.a(c3697e.v("method"), c3697e2.v("method")) && io.sentry.util.w.a(c3697e.v("http.fragment"), c3697e2.v("http.fragment")) && io.sentry.util.w.a(c3697e.v("http.query"), c3697e2.v("http.query"));
    }

    private static int D(C3697e c3697e) {
        return io.sentry.util.w.b(Long.valueOf(c3697e.A().getTime()), c3697e.f45798d, c3697e.f45799e, c3697e.f45801g, c3697e.f45802h, c3697e.f45803i, c3697e.v("status_code"), c3697e.v("url"), c3697e.v("method"), c3697e.v("http.fragment"), c3697e.v("http.query"));
    }

    public static C3697e M(String str, String str2, String str3, String str4, Map map) {
        C3697e c3697e = new C3697e();
        c3697e.K("user");
        c3697e.F("ui." + str);
        if (str2 != null) {
            c3697e.G("view.id", str2);
        }
        if (str3 != null) {
            c3697e.G("view.class", str3);
        }
        if (str4 != null) {
            c3697e.G("view.tag", str4);
        }
        for (Map.Entry entry : map.entrySet()) {
            c3697e.w().put((String) entry.getKey(), entry.getValue());
        }
        c3697e.H(EnumC3721i3.INFO);
        return c3697e;
    }

    private static boolean r(C3697e c3697e, C3697e c3697e2) {
        return c3697e.A().getTime() == c3697e2.A().getTime() && io.sentry.util.w.a(c3697e.f45798d, c3697e2.f45798d) && io.sentry.util.w.a(c3697e.f45799e, c3697e2.f45799e) && io.sentry.util.w.a(c3697e.f45801g, c3697e2.f45801g) && io.sentry.util.w.a(c3697e.f45802h, c3697e2.f45802h) && c3697e.f45803i == c3697e2.f45803i;
    }

    private static int s(C3697e c3697e) {
        return io.sentry.util.w.b(Long.valueOf(c3697e.A().getTime()), c3697e.f45798d, c3697e.f45799e, c3697e.f45801g, c3697e.f45802h, c3697e.f45803i);
    }

    public Date A() {
        Date date = this.f45796b;
        if (date != null) {
            return (Date) date.clone();
        }
        Long l10 = this.f45795a;
        if (l10 == null) {
            throw new IllegalStateException("No timestamp set for breadcrumb");
        }
        Date dateE = AbstractC3732l.e(l10.longValue());
        this.f45796b = dateE;
        return dateE;
    }

    public String B() {
        return this.f45799e;
    }

    public void E(String str) {
        if (str == null) {
            return;
        }
        this.f45800f.remove(str);
    }

    public void F(String str) {
        this.f45801g = str;
    }

    public void G(String str, Object obj) {
        if (str == null) {
            return;
        }
        if (obj == null) {
            E(str);
        } else {
            this.f45800f.put(str, obj);
        }
    }

    public void H(EnumC3721i3 enumC3721i3) {
        this.f45803i = enumC3721i3;
    }

    public void I(String str) {
        this.f45798d = str;
    }

    public void J(String str) {
        this.f45802h = str;
    }

    public void K(String str) {
        this.f45799e = str;
    }

    public void L(Map map) {
        this.f45804j = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3697e.class != obj.getClass()) {
            return false;
        }
        C3697e c3697e = (C3697e) obj;
        return "http".equals(this.f45799e) ? C(this, c3697e) : r(this, c3697e);
    }

    public int hashCode() {
        return "http".equals(this.f45799e) ? D(this) : s(this);
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        interfaceC3729k1.d("timestamp").j(iLogger, A());
        if (this.f45798d != null) {
            interfaceC3729k1.d("message").e(this.f45798d);
        }
        if (this.f45799e != null) {
            interfaceC3729k1.d("type").e(this.f45799e);
        }
        interfaceC3729k1.d("data").j(iLogger, this.f45800f);
        if (this.f45801g != null) {
            interfaceC3729k1.d("category").e(this.f45801g);
        }
        if (this.f45802h != null) {
            interfaceC3729k1.d("origin").e(this.f45802h);
        }
        if (this.f45803i != null) {
            interfaceC3729k1.d("level").j(iLogger, this.f45803i);
        }
        Map map = this.f45804j;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f45804j.get(str);
                interfaceC3729k1.d(str);
                interfaceC3729k1.j(iLogger, obj);
            }
        }
        interfaceC3729k1.T();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public int compareTo(C3697e c3697e) {
        return this.f45797c.compareTo(c3697e.f45797c);
    }

    public String u() {
        return this.f45801g;
    }

    public Object v(String str) {
        if (str == null) {
            return null;
        }
        return this.f45800f.get(str);
    }

    public Map w() {
        return this.f45800f;
    }

    public EnumC3721i3 x() {
        return this.f45803i;
    }

    public String y() {
        return this.f45798d;
    }

    public String z() {
        return this.f45802h;
    }
}

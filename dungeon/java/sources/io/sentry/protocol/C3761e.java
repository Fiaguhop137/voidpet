package io.sentry.protocol;

import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3724j1;
import io.sentry.InterfaceC3729k1;
import io.sentry.InterfaceC3773r0;
import io.sentry.util.AbstractC3801c;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.sentry.protocol.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3761e implements B0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private String f46163A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private String f46164B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private String f46165C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private Float f46166D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private Integer f46167E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private Double f46168F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private String f46169G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private String f46170H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private Map f46171I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f46172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f46173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f46174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f46175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f46176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f46177f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String[] f46178g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Float f46179h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Boolean f46180i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Boolean f46181j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private b f46182k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Boolean f46183l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Long f46184m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Long f46185n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Long f46186o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Boolean f46187p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Long f46188q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Long f46189r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Long f46190s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Long f46191t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Integer f46192u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Integer f46193v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Float f46194w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Integer f46195x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Date f46196y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private TimeZone f46197z;

    /* JADX INFO: renamed from: io.sentry.protocol.e$a */
    public static final class a implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3761e a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            interfaceC3724j1.I();
            C3761e c3761e = new C3761e();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                switch (strX0) {
                    case "timezone":
                        c3761e.f46197z = interfaceC3724j1.D0(iLogger);
                        break;
                    case "boot_time":
                        if (interfaceC3724j1.peek() != io.sentry.vendor.gson.stream.b.STRING) {
                            break;
                        } else {
                            c3761e.f46196y = interfaceC3724j1.e1(iLogger);
                            break;
                        }
                        break;
                    case "simulator":
                        c3761e.f46183l = interfaceC3724j1.m1();
                        break;
                    case "manufacturer":
                        c3761e.f46173b = interfaceC3724j1.D2();
                        break;
                    case "processor_count":
                        c3761e.f46167E = interfaceC3724j1.t2();
                        break;
                    case "orientation":
                        c3761e.f46182k = (b) interfaceC3724j1.A1(iLogger, new b.a());
                        break;
                    case "battery_temperature":
                        c3761e.f46166D = interfaceC3724j1.p3();
                        break;
                    case "family":
                        c3761e.f46175d = interfaceC3724j1.D2();
                        break;
                    case "locale":
                        c3761e.f46164B = interfaceC3724j1.D2();
                        break;
                    case "online":
                        c3761e.f46181j = interfaceC3724j1.m1();
                        break;
                    case "battery_level":
                        c3761e.f46179h = interfaceC3724j1.p3();
                        break;
                    case "model_id":
                        c3761e.f46177f = interfaceC3724j1.D2();
                        break;
                    case "screen_density":
                        c3761e.f46194w = interfaceC3724j1.p3();
                        break;
                    case "screen_dpi":
                        c3761e.f46195x = interfaceC3724j1.t2();
                        break;
                    case "free_memory":
                        c3761e.f46185n = interfaceC3724j1.x2();
                        break;
                    case "id":
                        c3761e.f46163A = interfaceC3724j1.D2();
                        break;
                    case "name":
                        c3761e.f46172a = interfaceC3724j1.D2();
                        break;
                    case "low_memory":
                        c3761e.f46187p = interfaceC3724j1.m1();
                        break;
                    case "archs":
                        List list = (List) interfaceC3724j1.z3();
                        if (list == null) {
                            break;
                        } else {
                            String[] strArr = new String[list.size()];
                            list.toArray(strArr);
                            c3761e.f46178g = strArr;
                            break;
                        }
                        break;
                    case "brand":
                        c3761e.f46174c = interfaceC3724j1.D2();
                        break;
                    case "model":
                        c3761e.f46176e = interfaceC3724j1.D2();
                        break;
                    case "cpu_description":
                        c3761e.f46169G = interfaceC3724j1.D2();
                        break;
                    case "processor_frequency":
                        c3761e.f46168F = interfaceC3724j1.S0();
                        break;
                    case "connection_type":
                        c3761e.f46165C = interfaceC3724j1.D2();
                        break;
                    case "chipset":
                        c3761e.f46170H = interfaceC3724j1.D2();
                        break;
                    case "screen_width_pixels":
                        c3761e.f46192u = interfaceC3724j1.t2();
                        break;
                    case "external_storage_size":
                        c3761e.f46190s = interfaceC3724j1.x2();
                        break;
                    case "storage_size":
                        c3761e.f46188q = interfaceC3724j1.x2();
                        break;
                    case "usable_memory":
                        c3761e.f46186o = interfaceC3724j1.x2();
                        break;
                    case "memory_size":
                        c3761e.f46184m = interfaceC3724j1.x2();
                        break;
                    case "charging":
                        c3761e.f46180i = interfaceC3724j1.m1();
                        break;
                    case "external_free_storage":
                        c3761e.f46191t = interfaceC3724j1.x2();
                        break;
                    case "free_storage":
                        c3761e.f46189r = interfaceC3724j1.x2();
                        break;
                    case "screen_height_pixels":
                        c3761e.f46193v = interfaceC3724j1.t2();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC3724j1.M2(iLogger, concurrentHashMap, strX0);
                        break;
                }
            }
            c3761e.q0(concurrentHashMap);
            interfaceC3724j1.T();
            return c3761e;
        }
    }

    /* JADX INFO: renamed from: io.sentry.protocol.e$b */
    public enum b implements B0 {
        PORTRAIT,
        LANDSCAPE;

        /* JADX INFO: renamed from: io.sentry.protocol.e$b$a */
        public static final class a implements InterfaceC3773r0 {
            @Override // io.sentry.InterfaceC3773r0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
                return b.valueOf(interfaceC3724j1.j2().toUpperCase(Locale.ROOT));
            }
        }

        @Override // io.sentry.B0
        public void serialize(@NotNull InterfaceC3729k1 interfaceC3729k1, @NotNull ILogger iLogger) throws IOException {
            interfaceC3729k1.e(toString().toLowerCase(Locale.ROOT));
        }
    }

    public C3761e() {
    }

    C3761e(C3761e c3761e) {
        this.f46172a = c3761e.f46172a;
        this.f46173b = c3761e.f46173b;
        this.f46174c = c3761e.f46174c;
        this.f46175d = c3761e.f46175d;
        this.f46176e = c3761e.f46176e;
        this.f46177f = c3761e.f46177f;
        this.f46180i = c3761e.f46180i;
        this.f46181j = c3761e.f46181j;
        this.f46182k = c3761e.f46182k;
        this.f46183l = c3761e.f46183l;
        this.f46184m = c3761e.f46184m;
        this.f46185n = c3761e.f46185n;
        this.f46186o = c3761e.f46186o;
        this.f46187p = c3761e.f46187p;
        this.f46188q = c3761e.f46188q;
        this.f46189r = c3761e.f46189r;
        this.f46190s = c3761e.f46190s;
        this.f46191t = c3761e.f46191t;
        this.f46192u = c3761e.f46192u;
        this.f46193v = c3761e.f46193v;
        this.f46194w = c3761e.f46194w;
        this.f46195x = c3761e.f46195x;
        this.f46196y = c3761e.f46196y;
        this.f46163A = c3761e.f46163A;
        this.f46165C = c3761e.f46165C;
        this.f46166D = c3761e.f46166D;
        this.f46179h = c3761e.f46179h;
        String[] strArr = c3761e.f46178g;
        this.f46178g = strArr != null ? (String[]) strArr.clone() : null;
        this.f46164B = c3761e.f46164B;
        TimeZone timeZone = c3761e.f46197z;
        this.f46197z = timeZone != null ? (TimeZone) timeZone.clone() : null;
        this.f46167E = c3761e.f46167E;
        this.f46168F = c3761e.f46168F;
        this.f46169G = c3761e.f46169G;
        this.f46170H = c3761e.f46170H;
        this.f46171I = AbstractC3801c.b(c3761e.f46171I);
    }

    public String I() {
        return this.f46165C;
    }

    public String J() {
        return this.f46163A;
    }

    public String K() {
        return this.f46164B;
    }

    public void L(String[] strArr) {
        this.f46178g = strArr;
    }

    public void M(Float f10) {
        this.f46179h = f10;
    }

    public void N(Float f10) {
        this.f46166D = f10;
    }

    public void O(Date date) {
        this.f46196y = date;
    }

    public void P(String str) {
        this.f46174c = str;
    }

    public void Q(Boolean bool) {
        this.f46180i = bool;
    }

    public void R(String str) {
        this.f46170H = str;
    }

    public void S(String str) {
        this.f46165C = str;
    }

    public void T(Long l10) {
        this.f46191t = l10;
    }

    public void U(Long l10) {
        this.f46190s = l10;
    }

    public void V(String str) {
        this.f46175d = str;
    }

    public void W(Long l10) {
        this.f46185n = l10;
    }

    public void X(Long l10) {
        this.f46189r = l10;
    }

    public void Y(String str) {
        this.f46163A = str;
    }

    public void Z(String str) {
        this.f46164B = str;
    }

    public void a0(Boolean bool) {
        this.f46187p = bool;
    }

    public void b0(String str) {
        this.f46173b = str;
    }

    public void c0(Long l10) {
        this.f46184m = l10;
    }

    public void d0(String str) {
        this.f46176e = str;
    }

    public void e0(String str) {
        this.f46177f = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3761e.class == obj.getClass()) {
            C3761e c3761e = (C3761e) obj;
            if (io.sentry.util.w.a(this.f46172a, c3761e.f46172a) && io.sentry.util.w.a(this.f46173b, c3761e.f46173b) && io.sentry.util.w.a(this.f46174c, c3761e.f46174c) && io.sentry.util.w.a(this.f46175d, c3761e.f46175d) && io.sentry.util.w.a(this.f46176e, c3761e.f46176e) && io.sentry.util.w.a(this.f46177f, c3761e.f46177f) && Arrays.equals(this.f46178g, c3761e.f46178g) && io.sentry.util.w.a(this.f46179h, c3761e.f46179h) && io.sentry.util.w.a(this.f46180i, c3761e.f46180i) && io.sentry.util.w.a(this.f46181j, c3761e.f46181j) && this.f46182k == c3761e.f46182k && io.sentry.util.w.a(this.f46183l, c3761e.f46183l) && io.sentry.util.w.a(this.f46184m, c3761e.f46184m) && io.sentry.util.w.a(this.f46185n, c3761e.f46185n) && io.sentry.util.w.a(this.f46186o, c3761e.f46186o) && io.sentry.util.w.a(this.f46187p, c3761e.f46187p) && io.sentry.util.w.a(this.f46188q, c3761e.f46188q) && io.sentry.util.w.a(this.f46189r, c3761e.f46189r) && io.sentry.util.w.a(this.f46190s, c3761e.f46190s) && io.sentry.util.w.a(this.f46191t, c3761e.f46191t) && io.sentry.util.w.a(this.f46192u, c3761e.f46192u) && io.sentry.util.w.a(this.f46193v, c3761e.f46193v) && io.sentry.util.w.a(this.f46194w, c3761e.f46194w) && io.sentry.util.w.a(this.f46195x, c3761e.f46195x) && io.sentry.util.w.a(this.f46196y, c3761e.f46196y) && io.sentry.util.w.a(this.f46163A, c3761e.f46163A) && io.sentry.util.w.a(this.f46164B, c3761e.f46164B) && io.sentry.util.w.a(this.f46165C, c3761e.f46165C) && io.sentry.util.w.a(this.f46166D, c3761e.f46166D) && io.sentry.util.w.a(this.f46167E, c3761e.f46167E) && io.sentry.util.w.a(this.f46168F, c3761e.f46168F) && io.sentry.util.w.a(this.f46169G, c3761e.f46169G) && io.sentry.util.w.a(this.f46170H, c3761e.f46170H)) {
                return true;
            }
        }
        return false;
    }

    public void f0(Boolean bool) {
        this.f46181j = bool;
    }

    public void g0(b bVar) {
        this.f46182k = bVar;
    }

    public void h0(Integer num) {
        this.f46167E = num;
    }

    public int hashCode() {
        return (io.sentry.util.w.b(this.f46172a, this.f46173b, this.f46174c, this.f46175d, this.f46176e, this.f46177f, this.f46179h, this.f46180i, this.f46181j, this.f46182k, this.f46183l, this.f46184m, this.f46185n, this.f46186o, this.f46187p, this.f46188q, this.f46189r, this.f46190s, this.f46191t, this.f46192u, this.f46193v, this.f46194w, this.f46195x, this.f46196y, this.f46197z, this.f46163A, this.f46164B, this.f46165C, this.f46166D, this.f46167E, this.f46168F, this.f46169G, this.f46170H) * 31) + Arrays.hashCode(this.f46178g);
    }

    public void i0(Double d10) {
        this.f46168F = d10;
    }

    public void j0(Float f10) {
        this.f46194w = f10;
    }

    public void k0(Integer num) {
        this.f46195x = num;
    }

    public void l0(Integer num) {
        this.f46193v = num;
    }

    public void m0(Integer num) {
        this.f46192u = num;
    }

    public void n0(Boolean bool) {
        this.f46183l = bool;
    }

    public void o0(Long l10) {
        this.f46188q = l10;
    }

    public void p0(TimeZone timeZone) {
        this.f46197z = timeZone;
    }

    public void q0(Map map) {
        this.f46171I = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        if (this.f46172a != null) {
            interfaceC3729k1.d("name").e(this.f46172a);
        }
        if (this.f46173b != null) {
            interfaceC3729k1.d("manufacturer").e(this.f46173b);
        }
        if (this.f46174c != null) {
            interfaceC3729k1.d("brand").e(this.f46174c);
        }
        if (this.f46175d != null) {
            interfaceC3729k1.d("family").e(this.f46175d);
        }
        if (this.f46176e != null) {
            interfaceC3729k1.d("model").e(this.f46176e);
        }
        if (this.f46177f != null) {
            interfaceC3729k1.d("model_id").e(this.f46177f);
        }
        if (this.f46178g != null) {
            interfaceC3729k1.d("archs").j(iLogger, this.f46178g);
        }
        if (this.f46179h != null) {
            interfaceC3729k1.d("battery_level").i(this.f46179h);
        }
        if (this.f46180i != null) {
            interfaceC3729k1.d("charging").k(this.f46180i);
        }
        if (this.f46181j != null) {
            interfaceC3729k1.d("online").k(this.f46181j);
        }
        if (this.f46182k != null) {
            interfaceC3729k1.d("orientation").j(iLogger, this.f46182k);
        }
        if (this.f46183l != null) {
            interfaceC3729k1.d("simulator").k(this.f46183l);
        }
        if (this.f46184m != null) {
            interfaceC3729k1.d("memory_size").i(this.f46184m);
        }
        if (this.f46185n != null) {
            interfaceC3729k1.d("free_memory").i(this.f46185n);
        }
        if (this.f46186o != null) {
            interfaceC3729k1.d("usable_memory").i(this.f46186o);
        }
        if (this.f46187p != null) {
            interfaceC3729k1.d("low_memory").k(this.f46187p);
        }
        if (this.f46188q != null) {
            interfaceC3729k1.d("storage_size").i(this.f46188q);
        }
        if (this.f46189r != null) {
            interfaceC3729k1.d("free_storage").i(this.f46189r);
        }
        if (this.f46190s != null) {
            interfaceC3729k1.d("external_storage_size").i(this.f46190s);
        }
        if (this.f46191t != null) {
            interfaceC3729k1.d("external_free_storage").i(this.f46191t);
        }
        if (this.f46192u != null) {
            interfaceC3729k1.d("screen_width_pixels").i(this.f46192u);
        }
        if (this.f46193v != null) {
            interfaceC3729k1.d("screen_height_pixels").i(this.f46193v);
        }
        if (this.f46194w != null) {
            interfaceC3729k1.d("screen_density").i(this.f46194w);
        }
        if (this.f46195x != null) {
            interfaceC3729k1.d("screen_dpi").i(this.f46195x);
        }
        if (this.f46196y != null) {
            interfaceC3729k1.d("boot_time").j(iLogger, this.f46196y);
        }
        if (this.f46197z != null) {
            interfaceC3729k1.d("timezone").j(iLogger, this.f46197z);
        }
        if (this.f46163A != null) {
            interfaceC3729k1.d("id").e(this.f46163A);
        }
        if (this.f46165C != null) {
            interfaceC3729k1.d("connection_type").e(this.f46165C);
        }
        if (this.f46166D != null) {
            interfaceC3729k1.d("battery_temperature").i(this.f46166D);
        }
        if (this.f46164B != null) {
            interfaceC3729k1.d("locale").e(this.f46164B);
        }
        if (this.f46167E != null) {
            interfaceC3729k1.d("processor_count").i(this.f46167E);
        }
        if (this.f46168F != null) {
            interfaceC3729k1.d("processor_frequency").i(this.f46168F);
        }
        if (this.f46169G != null) {
            interfaceC3729k1.d("cpu_description").e(this.f46169G);
        }
        if (this.f46170H != null) {
            interfaceC3729k1.d("chipset").e(this.f46170H);
        }
        Map map = this.f46171I;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC3729k1.d(str).j(iLogger, this.f46171I.get(str));
            }
        }
        interfaceC3729k1.T();
    }
}

package io.sentry.protocol;

import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3724j1;
import io.sentry.InterfaceC3729k1;
import io.sentry.InterfaceC3773r0;
import io.sentry.util.AbstractC3801c;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3757a implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f46141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f46142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f46143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f46144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f46145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f46146f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f46147g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map f46148h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List f46149i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f46150j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Boolean f46151k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Boolean f46152l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List f46153m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Map f46154n;

    /* JADX INFO: renamed from: io.sentry.protocol.a$a, reason: collision with other inner class name */
    public static final class C0540a implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3757a a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            interfaceC3724j1.I();
            C3757a c3757a = new C3757a();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                switch (strX0) {
                    case "split_names":
                        List list = (List) interfaceC3724j1.z3();
                        if (list == null) {
                            break;
                        } else {
                            c3757a.u(list);
                            break;
                        }
                        break;
                    case "device_app_hash":
                        c3757a.f46143c = interfaceC3724j1.D2();
                        break;
                    case "start_type":
                        c3757a.f46150j = interfaceC3724j1.D2();
                        break;
                    case "view_names":
                        List list2 = (List) interfaceC3724j1.z3();
                        if (list2 == null) {
                            break;
                        } else {
                            c3757a.x(list2);
                            break;
                        }
                        break;
                    case "app_version":
                        c3757a.f46146f = interfaceC3724j1.D2();
                        break;
                    case "in_foreground":
                        c3757a.f46151k = interfaceC3724j1.m1();
                        break;
                    case "build_type":
                        c3757a.f46144d = interfaceC3724j1.D2();
                        break;
                    case "app_identifier":
                        c3757a.f46141a = interfaceC3724j1.D2();
                        break;
                    case "app_start_time":
                        c3757a.f46142b = interfaceC3724j1.e1(iLogger);
                        break;
                    case "permissions":
                        c3757a.f46148h = AbstractC3801c.b((Map) interfaceC3724j1.z3());
                        break;
                    case "app_name":
                        c3757a.f46145e = interfaceC3724j1.D2();
                        break;
                    case "app_build":
                        c3757a.f46147g = interfaceC3724j1.D2();
                        break;
                    case "is_split_apks":
                        c3757a.f46152l = interfaceC3724j1.m1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC3724j1.M2(iLogger, concurrentHashMap, strX0);
                        break;
                }
            }
            c3757a.w(concurrentHashMap);
            interfaceC3724j1.T();
            return c3757a;
        }
    }

    public C3757a() {
    }

    C3757a(C3757a c3757a) {
        this.f46147g = c3757a.f46147g;
        this.f46141a = c3757a.f46141a;
        this.f46145e = c3757a.f46145e;
        this.f46142b = c3757a.f46142b;
        this.f46146f = c3757a.f46146f;
        this.f46144d = c3757a.f46144d;
        this.f46143c = c3757a.f46143c;
        this.f46148h = AbstractC3801c.b(c3757a.f46148h);
        this.f46151k = c3757a.f46151k;
        this.f46149i = AbstractC3801c.a(c3757a.f46149i);
        this.f46150j = c3757a.f46150j;
        this.f46152l = c3757a.f46152l;
        this.f46153m = c3757a.f46153m;
        this.f46154n = AbstractC3801c.b(c3757a.f46154n);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3757a.class == obj.getClass()) {
            C3757a c3757a = (C3757a) obj;
            if (io.sentry.util.w.a(this.f46141a, c3757a.f46141a) && io.sentry.util.w.a(this.f46142b, c3757a.f46142b) && io.sentry.util.w.a(this.f46143c, c3757a.f46143c) && io.sentry.util.w.a(this.f46144d, c3757a.f46144d) && io.sentry.util.w.a(this.f46145e, c3757a.f46145e) && io.sentry.util.w.a(this.f46146f, c3757a.f46146f) && io.sentry.util.w.a(this.f46147g, c3757a.f46147g) && io.sentry.util.w.a(this.f46148h, c3757a.f46148h) && io.sentry.util.w.a(this.f46151k, c3757a.f46151k) && io.sentry.util.w.a(this.f46149i, c3757a.f46149i) && io.sentry.util.w.a(this.f46150j, c3757a.f46150j) && io.sentry.util.w.a(this.f46152l, c3757a.f46152l) && io.sentry.util.w.a(this.f46153m, c3757a.f46153m)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f46141a, this.f46142b, this.f46143c, this.f46144d, this.f46145e, this.f46146f, this.f46147g, this.f46148h, this.f46151k, this.f46149i, this.f46150j, this.f46152l, this.f46153m);
    }

    public Boolean l() {
        return this.f46151k;
    }

    public void m(String str) {
        this.f46147g = str;
    }

    public void n(String str) {
        this.f46141a = str;
    }

    public void o(String str) {
        this.f46145e = str;
    }

    public void p(Date date) {
        this.f46142b = date;
    }

    public void q(String str) {
        this.f46146f = str;
    }

    public void r(Boolean bool) {
        this.f46151k = bool;
    }

    public void s(Map map) {
        this.f46148h = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        if (this.f46141a != null) {
            interfaceC3729k1.d("app_identifier").e(this.f46141a);
        }
        if (this.f46142b != null) {
            interfaceC3729k1.d("app_start_time").j(iLogger, this.f46142b);
        }
        if (this.f46143c != null) {
            interfaceC3729k1.d("device_app_hash").e(this.f46143c);
        }
        if (this.f46144d != null) {
            interfaceC3729k1.d("build_type").e(this.f46144d);
        }
        if (this.f46145e != null) {
            interfaceC3729k1.d("app_name").e(this.f46145e);
        }
        if (this.f46146f != null) {
            interfaceC3729k1.d("app_version").e(this.f46146f);
        }
        if (this.f46147g != null) {
            interfaceC3729k1.d("app_build").e(this.f46147g);
        }
        Map map = this.f46148h;
        if (map != null && !map.isEmpty()) {
            interfaceC3729k1.d("permissions").j(iLogger, this.f46148h);
        }
        if (this.f46151k != null) {
            interfaceC3729k1.d("in_foreground").k(this.f46151k);
        }
        if (this.f46149i != null) {
            interfaceC3729k1.d("view_names").j(iLogger, this.f46149i);
        }
        if (this.f46150j != null) {
            interfaceC3729k1.d("start_type").e(this.f46150j);
        }
        if (this.f46152l != null) {
            interfaceC3729k1.d("is_split_apks").k(this.f46152l);
        }
        List list = this.f46153m;
        if (list != null && !list.isEmpty()) {
            interfaceC3729k1.d("split_names").j(iLogger, this.f46153m);
        }
        Map map2 = this.f46154n;
        if (map2 != null) {
            for (String str : map2.keySet()) {
                interfaceC3729k1.d(str).j(iLogger, this.f46154n.get(str));
            }
        }
        interfaceC3729k1.T();
    }

    public void t(Boolean bool) {
        this.f46152l = bool;
    }

    public void u(List list) {
        this.f46153m = list;
    }

    public void v(String str) {
        this.f46150j = str;
    }

    public void w(Map map) {
        this.f46154n = map;
    }

    public void x(List list) {
        this.f46149i = list;
    }
}

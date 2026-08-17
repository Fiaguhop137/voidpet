package io.sentry.protocol;

import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3724j1;
import io.sentry.InterfaceC3729k1;
import io.sentry.InterfaceC3773r0;
import io.sentry.util.AbstractC3801c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class I implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f46118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f46119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f46120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f46121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f46122e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C3765i f46123f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map f46124g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map f46125h;

    public static final class a implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public I a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            interfaceC3724j1.I();
            I i10 = new I();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                switch (strX0) {
                    case "username":
                        i10.f46120c = interfaceC3724j1.D2();
                        break;
                    case "id":
                        i10.f46119b = interfaceC3724j1.D2();
                        break;
                    case "geo":
                        i10.f46123f = new C3765i.a().a(interfaceC3724j1, iLogger);
                        break;
                    case "data":
                        i10.f46124g = AbstractC3801c.b((Map) interfaceC3724j1.z3());
                        break;
                    case "name":
                        i10.f46122e = interfaceC3724j1.D2();
                        break;
                    case "email":
                        i10.f46118a = interfaceC3724j1.D2();
                        break;
                    case "ip_address":
                        i10.f46121d = interfaceC3724j1.D2();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC3724j1.M2(iLogger, concurrentHashMap, strX0);
                        break;
                }
            }
            i10.q(concurrentHashMap);
            interfaceC3724j1.T();
            return i10;
        }
    }

    public I() {
    }

    public I(I i10) {
        this.f46118a = i10.f46118a;
        this.f46120c = i10.f46120c;
        this.f46119b = i10.f46119b;
        this.f46121d = i10.f46121d;
        this.f46122e = i10.f46122e;
        this.f46123f = i10.f46123f;
        this.f46124g = AbstractC3801c.b(i10.f46124g);
        this.f46125h = AbstractC3801c.b(i10.f46125h);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && I.class == obj.getClass()) {
            I i10 = (I) obj;
            if (io.sentry.util.w.a(this.f46118a, i10.f46118a) && io.sentry.util.w.a(this.f46119b, i10.f46119b) && io.sentry.util.w.a(this.f46120c, i10.f46120c) && io.sentry.util.w.a(this.f46121d, i10.f46121d)) {
                return true;
            }
        }
        return false;
    }

    public String h() {
        return this.f46118a;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f46118a, this.f46119b, this.f46120c, this.f46121d);
    }

    public String i() {
        return this.f46119b;
    }

    public String j() {
        return this.f46121d;
    }

    public String k() {
        return this.f46120c;
    }

    public void l(Map map) {
        this.f46124g = AbstractC3801c.b(map);
    }

    public void m(String str) {
        this.f46118a = str;
    }

    public void n(C3765i c3765i) {
        this.f46123f = c3765i;
    }

    public void o(String str) {
        this.f46119b = str;
    }

    public void p(String str) {
        this.f46121d = str;
    }

    public void q(Map map) {
        this.f46125h = map;
    }

    public void r(String str) {
        this.f46120c = str;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        if (this.f46118a != null) {
            interfaceC3729k1.d("email").e(this.f46118a);
        }
        if (this.f46119b != null) {
            interfaceC3729k1.d("id").e(this.f46119b);
        }
        if (this.f46120c != null) {
            interfaceC3729k1.d("username").e(this.f46120c);
        }
        if (this.f46121d != null) {
            interfaceC3729k1.d("ip_address").e(this.f46121d);
        }
        if (this.f46122e != null) {
            interfaceC3729k1.d("name").e(this.f46122e);
        }
        if (this.f46123f != null) {
            interfaceC3729k1.d("geo");
            this.f46123f.serialize(interfaceC3729k1, iLogger);
        }
        if (this.f46124g != null) {
            interfaceC3729k1.d("data").j(iLogger, this.f46124g);
        }
        Map map = this.f46125h;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f46125h.get(str);
                interfaceC3729k1.d(str);
                interfaceC3729k1.j(iLogger, obj);
            }
        }
        interfaceC3729k1.T();
    }
}

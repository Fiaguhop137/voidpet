package io.sentry;

import io.sentry.protocol.C3759c;
import io.sentry.protocol.C3760d;
import io.sentry.util.AbstractC3801c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.sentry.j2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3725j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private io.sentry.protocol.x f45920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3759c f45921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private io.sentry.protocol.r f45922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private io.sentry.protocol.o f45923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map f45924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f45925f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f45926g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f45927h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private io.sentry.protocol.I f45928i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected transient Throwable f45929j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f45930k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f45931l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List f45932m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private C3760d f45933n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Map f45934o;

    /* JADX INFO: renamed from: io.sentry.j2$a */
    public static final class a {
        public boolean a(AbstractC3725j2 abstractC3725j2, String str, InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            str.getClass();
            switch (str) {
                case "debug_meta":
                    abstractC3725j2.f45933n = (C3760d) interfaceC3724j1.A1(iLogger, new C3760d.a());
                    return true;
                case "server_name":
                    abstractC3725j2.f45930k = interfaceC3724j1.D2();
                    return true;
                case "contexts":
                    abstractC3725j2.f45921b.m(new C3759c.a().a(interfaceC3724j1, iLogger));
                    return true;
                case "environment":
                    abstractC3725j2.f45926g = interfaceC3724j1.D2();
                    return true;
                case "breadcrumbs":
                    abstractC3725j2.f45932m = interfaceC3724j1.L3(iLogger, new C3697e.a());
                    return true;
                case "sdk":
                    abstractC3725j2.f45922c = (io.sentry.protocol.r) interfaceC3724j1.A1(iLogger, new io.sentry.protocol.r.a());
                    return true;
                case "dist":
                    abstractC3725j2.f45931l = interfaceC3724j1.D2();
                    return true;
                case "tags":
                    abstractC3725j2.f45924e = AbstractC3801c.b((Map) interfaceC3724j1.z3());
                    return true;
                case "user":
                    abstractC3725j2.f45928i = (io.sentry.protocol.I) interfaceC3724j1.A1(iLogger, new io.sentry.protocol.I.a());
                    return true;
                case "extra":
                    abstractC3725j2.f45934o = AbstractC3801c.b((Map) interfaceC3724j1.z3());
                    return true;
                case "event_id":
                    abstractC3725j2.f45920a = (io.sentry.protocol.x) interfaceC3724j1.A1(iLogger, new io.sentry.protocol.x.a());
                    return true;
                case "release":
                    abstractC3725j2.f45925f = interfaceC3724j1.D2();
                    return true;
                case "request":
                    abstractC3725j2.f45923d = (io.sentry.protocol.o) interfaceC3724j1.A1(iLogger, new io.sentry.protocol.o.a());
                    return true;
                case "platform":
                    abstractC3725j2.f45927h = interfaceC3724j1.D2();
                    return true;
                default:
                    return false;
            }
        }
    }

    /* JADX INFO: renamed from: io.sentry.j2$b */
    public static final class b {
        public void a(AbstractC3725j2 abstractC3725j2, InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
            if (abstractC3725j2.f45920a != null) {
                interfaceC3729k1.d("event_id").j(iLogger, abstractC3725j2.f45920a);
            }
            interfaceC3729k1.d("contexts").j(iLogger, abstractC3725j2.f45921b);
            if (abstractC3725j2.f45922c != null) {
                interfaceC3729k1.d("sdk").j(iLogger, abstractC3725j2.f45922c);
            }
            if (abstractC3725j2.f45923d != null) {
                interfaceC3729k1.d("request").j(iLogger, abstractC3725j2.f45923d);
            }
            if (abstractC3725j2.f45924e != null && !abstractC3725j2.f45924e.isEmpty()) {
                interfaceC3729k1.d("tags").j(iLogger, abstractC3725j2.f45924e);
            }
            if (abstractC3725j2.f45925f != null) {
                interfaceC3729k1.d("release").e(abstractC3725j2.f45925f);
            }
            if (abstractC3725j2.f45926g != null) {
                interfaceC3729k1.d("environment").e(abstractC3725j2.f45926g);
            }
            if (abstractC3725j2.f45927h != null) {
                interfaceC3729k1.d("platform").e(abstractC3725j2.f45927h);
            }
            if (abstractC3725j2.f45928i != null) {
                interfaceC3729k1.d("user").j(iLogger, abstractC3725j2.f45928i);
            }
            if (abstractC3725j2.f45930k != null) {
                interfaceC3729k1.d("server_name").e(abstractC3725j2.f45930k);
            }
            if (abstractC3725j2.f45931l != null) {
                interfaceC3729k1.d("dist").e(abstractC3725j2.f45931l);
            }
            if (abstractC3725j2.f45932m != null && !abstractC3725j2.f45932m.isEmpty()) {
                interfaceC3729k1.d("breadcrumbs").j(iLogger, abstractC3725j2.f45932m);
            }
            if (abstractC3725j2.f45933n != null) {
                interfaceC3729k1.d("debug_meta").j(iLogger, abstractC3725j2.f45933n);
            }
            if (abstractC3725j2.f45934o == null || abstractC3725j2.f45934o.isEmpty()) {
                return;
            }
            interfaceC3729k1.d("extra").j(iLogger, abstractC3725j2.f45934o);
        }
    }

    protected AbstractC3725j2() {
        this(new io.sentry.protocol.x());
    }

    protected AbstractC3725j2(io.sentry.protocol.x xVar) {
        this.f45921b = new C3759c();
        this.f45920a = xVar;
    }

    public List B() {
        return this.f45932m;
    }

    public C3759c C() {
        return this.f45921b;
    }

    public C3760d D() {
        return this.f45933n;
    }

    public String E() {
        return this.f45931l;
    }

    public String F() {
        return this.f45926g;
    }

    public io.sentry.protocol.x G() {
        return this.f45920a;
    }

    public Map H() {
        return this.f45934o;
    }

    public String I() {
        return this.f45927h;
    }

    public String J() {
        return this.f45925f;
    }

    public io.sentry.protocol.o K() {
        return this.f45923d;
    }

    public io.sentry.protocol.r L() {
        return this.f45922c;
    }

    public String M() {
        return this.f45930k;
    }

    public Map N() {
        return this.f45924e;
    }

    public Throwable O() {
        Throwable th = this.f45929j;
        return th instanceof io.sentry.exception.a ? ((io.sentry.exception.a) th).c() : th;
    }

    public Throwable P() {
        return this.f45929j;
    }

    public io.sentry.protocol.I Q() {
        return this.f45928i;
    }

    public void R(String str) {
        Map map = this.f45924e;
        if (map == null || str == null) {
            return;
        }
        map.remove(str);
    }

    public void S(List list) {
        this.f45932m = AbstractC3801c.a(list);
    }

    public void T(C3760d c3760d) {
        this.f45933n = c3760d;
    }

    public void U(String str) {
        this.f45931l = str;
    }

    public void V(String str) {
        this.f45926g = str;
    }

    public void W(io.sentry.protocol.x xVar) {
        this.f45920a = xVar;
    }

    public void X(Map map) {
        this.f45934o = AbstractC3801c.c(map);
    }

    public void Y(String str) {
        this.f45927h = str;
    }

    public void Z(String str) {
        this.f45925f = str;
    }

    public void a0(io.sentry.protocol.o oVar) {
        this.f45923d = oVar;
    }

    public void b0(io.sentry.protocol.r rVar) {
        this.f45922c = rVar;
    }

    public void c0(String str) {
        this.f45930k = str;
    }

    public void d0(String str, String str2) {
        if (this.f45924e == null) {
            this.f45924e = new HashMap();
        }
        if (str == null) {
            return;
        }
        if (str2 == null) {
            R(str);
        } else {
            this.f45924e.put(str, str2);
        }
    }

    public void e0(Map map) {
        this.f45924e = AbstractC3801c.c(map);
    }

    public void f0(io.sentry.protocol.I i10) {
        this.f45928i = i10;
    }
}

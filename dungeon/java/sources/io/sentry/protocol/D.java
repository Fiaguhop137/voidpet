package io.sentry.protocol;

import io.sentry.B0;
import io.sentry.C3726j3;
import io.sentry.ILogger;
import io.sentry.InterfaceC3724j1;
import io.sentry.InterfaceC3729k1;
import io.sentry.InterfaceC3773r0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class D implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Long f46095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f46096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f46097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f46098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Boolean f46099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Boolean f46100f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Boolean f46101g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Boolean f46102h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C f46103i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map f46104j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Map f46105k;

    public static final class a implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public D a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            D d10 = new D();
            interfaceC3724j1.I();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                switch (strX0) {
                    case "daemon":
                        d10.f46101g = interfaceC3724j1.m1();
                        break;
                    case "priority":
                        d10.f46096b = interfaceC3724j1.t2();
                        break;
                    case "held_locks":
                        Map mapJ2 = interfaceC3724j1.J2(iLogger, new C3726j3.a());
                        if (mapJ2 == null) {
                            break;
                        } else {
                            d10.f46104j = new HashMap(mapJ2);
                            break;
                        }
                        break;
                    case "id":
                        d10.f46095a = interfaceC3724j1.x2();
                        break;
                    case "main":
                        d10.f46102h = interfaceC3724j1.m1();
                        break;
                    case "name":
                        d10.f46097c = interfaceC3724j1.D2();
                        break;
                    case "state":
                        d10.f46098d = interfaceC3724j1.D2();
                        break;
                    case "crashed":
                        d10.f46099e = interfaceC3724j1.m1();
                        break;
                    case "current":
                        d10.f46100f = interfaceC3724j1.m1();
                        break;
                    case "stacktrace":
                        d10.f46103i = (C) interfaceC3724j1.A1(iLogger, new C.a());
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC3724j1.M2(iLogger, concurrentHashMap, strX0);
                        break;
                }
            }
            d10.A(concurrentHashMap);
            interfaceC3724j1.T();
            return d10;
        }
    }

    public void A(Map map) {
        this.f46105k = map;
    }

    public Map k() {
        return this.f46104j;
    }

    public Long l() {
        return this.f46095a;
    }

    public String m() {
        return this.f46097c;
    }

    public C n() {
        return this.f46103i;
    }

    public Boolean o() {
        return this.f46100f;
    }

    public Boolean p() {
        return this.f46102h;
    }

    public void q(Boolean bool) {
        this.f46099e = bool;
    }

    public void r(Boolean bool) {
        this.f46100f = bool;
    }

    public void s(Boolean bool) {
        this.f46101g = bool;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        if (this.f46095a != null) {
            interfaceC3729k1.d("id").i(this.f46095a);
        }
        if (this.f46096b != null) {
            interfaceC3729k1.d("priority").i(this.f46096b);
        }
        if (this.f46097c != null) {
            interfaceC3729k1.d("name").e(this.f46097c);
        }
        if (this.f46098d != null) {
            interfaceC3729k1.d("state").e(this.f46098d);
        }
        if (this.f46099e != null) {
            interfaceC3729k1.d("crashed").k(this.f46099e);
        }
        if (this.f46100f != null) {
            interfaceC3729k1.d("current").k(this.f46100f);
        }
        if (this.f46101g != null) {
            interfaceC3729k1.d("daemon").k(this.f46101g);
        }
        if (this.f46102h != null) {
            interfaceC3729k1.d("main").k(this.f46102h);
        }
        if (this.f46103i != null) {
            interfaceC3729k1.d("stacktrace").j(iLogger, this.f46103i);
        }
        if (this.f46104j != null) {
            interfaceC3729k1.d("held_locks").j(iLogger, this.f46104j);
        }
        Map map = this.f46105k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f46105k.get(str);
                interfaceC3729k1.d(str);
                interfaceC3729k1.j(iLogger, obj);
            }
        }
        interfaceC3729k1.T();
    }

    public void t(Map map) {
        this.f46104j = map;
    }

    public void u(Long l10) {
        this.f46095a = l10;
    }

    public void v(Boolean bool) {
        this.f46102h = bool;
    }

    public void w(String str) {
        this.f46097c = str;
    }

    public void x(Integer num) {
        this.f46096b = num;
    }

    public void y(C c10) {
        this.f46103i = c10;
    }

    public void z(String str) {
        this.f46098d = str;
    }
}

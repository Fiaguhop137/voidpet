package io.sentry.rrweb;

import io.sentry.B0;
import io.sentry.EnumC3721i3;
import io.sentry.ILogger;
import io.sentry.InterfaceC3724j1;
import io.sentry.InterfaceC3729k1;
import io.sentry.InterfaceC3773r0;
import io.sentry.util.AbstractC3801c;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends b implements B0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f46414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f46415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f46416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f46417f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f46418g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private EnumC3721i3 f46419h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map f46420i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map f46421j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Map f46422k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map f46423l;

    /* JADX INFO: renamed from: io.sentry.rrweb.a$a, reason: collision with other inner class name */
    public static final class C0542a implements InterfaceC3773r0 {
        private void c(a aVar, InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            interfaceC3724j1.I();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                if (strX0.equals("payload")) {
                    d(aVar, interfaceC3724j1, iLogger);
                } else if (strX0.equals("tag")) {
                    String strD2 = interfaceC3724j1.D2();
                    if (strD2 == null) {
                        strD2 = "";
                    }
                    aVar.f46414c = strD2;
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    interfaceC3724j1.M2(iLogger, concurrentHashMap, strX0);
                }
            }
            aVar.v(concurrentHashMap);
            interfaceC3724j1.T();
        }

        private void d(a aVar, InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            interfaceC3724j1.I();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                switch (strX0) {
                    case "data":
                        Map mapB = AbstractC3801c.b((Map) interfaceC3724j1.z3());
                        if (mapB == null) {
                            break;
                        } else {
                            aVar.f46420i = mapB;
                            break;
                        }
                        break;
                    case "type":
                        aVar.f46416e = interfaceC3724j1.D2();
                        break;
                    case "category":
                        aVar.f46417f = interfaceC3724j1.D2();
                        break;
                    case "timestamp":
                        aVar.f46415d = interfaceC3724j1.nextDouble();
                        break;
                    case "level":
                        try {
                            aVar.f46419h = new EnumC3721i3.a().a(interfaceC3724j1, iLogger);
                            break;
                        } catch (Exception e10) {
                            iLogger.a(EnumC3721i3.DEBUG, e10, "Error when deserializing SentryLevel", new Object[0]);
                            break;
                        }
                        break;
                    case "message":
                        aVar.f46418g = interfaceC3724j1.D2();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC3724j1.M2(iLogger, concurrentHashMap, strX0);
                        break;
                }
            }
            aVar.y(concurrentHashMap);
            interfaceC3724j1.T();
        }

        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            interfaceC3724j1.I();
            a aVar = new a();
            b.a aVar2 = new b.a();
            HashMap map = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                if (strX0.equals("data")) {
                    c(aVar, interfaceC3724j1, iLogger);
                } else if (!aVar2.a(aVar, strX0, interfaceC3724j1, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    interfaceC3724j1.M2(iLogger, map, strX0);
                }
            }
            aVar.z(map);
            interfaceC3724j1.T();
            return aVar;
        }
    }

    public a() {
        super(c.Custom);
        this.f46414c = "breadcrumb";
    }

    private void p(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        interfaceC3729k1.d("tag").e(this.f46414c);
        interfaceC3729k1.d("payload");
        q(interfaceC3729k1, iLogger);
        Map map = this.f46423l;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f46423l.get(str);
                interfaceC3729k1.d(str);
                interfaceC3729k1.j(iLogger, obj);
            }
        }
        interfaceC3729k1.T();
    }

    private void q(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        if (this.f46416e != null) {
            interfaceC3729k1.d("type").e(this.f46416e);
        }
        interfaceC3729k1.d("timestamp").j(iLogger, BigDecimal.valueOf(this.f46415d));
        if (this.f46417f != null) {
            interfaceC3729k1.d("category").e(this.f46417f);
        }
        if (this.f46418g != null) {
            interfaceC3729k1.d("message").e(this.f46418g);
        }
        if (this.f46419h != null) {
            interfaceC3729k1.d("level").j(iLogger, this.f46419h);
        }
        if (this.f46420i != null) {
            interfaceC3729k1.d("data").j(iLogger, this.f46420i);
        }
        Map map = this.f46422k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f46422k.get(str);
                interfaceC3729k1.d(str);
                interfaceC3729k1.j(iLogger, obj);
            }
        }
        interfaceC3729k1.T();
    }

    public String n() {
        return this.f46417f;
    }

    public Map o() {
        return this.f46420i;
    }

    public void r(double d10) {
        this.f46415d = d10;
    }

    public void s(String str) {
        this.f46416e = str;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        new b.C0543b().a(this, interfaceC3729k1, iLogger);
        interfaceC3729k1.d("data");
        p(interfaceC3729k1, iLogger);
        Map map = this.f46421j;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f46421j.get(str);
                interfaceC3729k1.d(str);
                interfaceC3729k1.j(iLogger, obj);
            }
        }
        interfaceC3729k1.T();
    }

    public void t(String str) {
        this.f46417f = str;
    }

    public void u(Map map) {
        this.f46420i = map == null ? null : new ConcurrentHashMap(map);
    }

    public void v(Map map) {
        this.f46423l = map;
    }

    public void w(EnumC3721i3 enumC3721i3) {
        this.f46419h = enumC3721i3;
    }

    public void x(String str) {
        this.f46418g = str;
    }

    public void y(Map map) {
        this.f46422k = map;
    }

    public void z(Map map) {
        this.f46421j = map;
    }
}

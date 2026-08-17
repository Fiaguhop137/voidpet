package io.sentry.rrweb;

import io.sentry.B0;
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
public final class i extends b implements B0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f46453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f46454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f46455e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f46456f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f46457g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map f46458h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map f46459i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map f46460j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Map f46461k;

    public static final class a implements InterfaceC3773r0 {
        private void c(i iVar, InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            interfaceC3724j1.I();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                if (strX0.equals("payload")) {
                    d(iVar, interfaceC3724j1, iLogger);
                } else if (strX0.equals("tag")) {
                    String strD2 = interfaceC3724j1.D2();
                    if (strD2 == null) {
                        strD2 = "";
                    }
                    iVar.f46453c = strD2;
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    interfaceC3724j1.M2(iLogger, concurrentHashMap, strX0);
                }
            }
            iVar.p(concurrentHashMap);
            interfaceC3724j1.T();
        }

        private void d(i iVar, InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            interfaceC3724j1.I();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                switch (strX0) {
                    case "description":
                        iVar.f46455e = interfaceC3724j1.D2();
                        break;
                    case "endTimestamp":
                        iVar.f46457g = interfaceC3724j1.nextDouble();
                        break;
                    case "startTimestamp":
                        iVar.f46456f = interfaceC3724j1.nextDouble();
                        break;
                    case "op":
                        iVar.f46454d = interfaceC3724j1.D2();
                        break;
                    case "data":
                        Map mapB = AbstractC3801c.b((Map) interfaceC3724j1.z3());
                        if (mapB == null) {
                            break;
                        } else {
                            iVar.f46458h = mapB;
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
            iVar.t(concurrentHashMap);
            interfaceC3724j1.T();
        }

        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            interfaceC3724j1.I();
            i iVar = new i();
            b.a aVar = new b.a();
            HashMap map = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                if (strX0.equals("data")) {
                    c(iVar, interfaceC3724j1, iLogger);
                } else if (!aVar.a(iVar, strX0, interfaceC3724j1, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    interfaceC3724j1.M2(iLogger, map, strX0);
                }
            }
            iVar.v(map);
            interfaceC3724j1.T();
            return iVar;
        }
    }

    public i() {
        super(c.Custom);
        this.f46453c = "performanceSpan";
    }

    private void m(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        interfaceC3729k1.d("tag").e(this.f46453c);
        interfaceC3729k1.d("payload");
        n(interfaceC3729k1, iLogger);
        Map map = this.f46461k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f46461k.get(str);
                interfaceC3729k1.d(str);
                interfaceC3729k1.j(iLogger, obj);
            }
        }
        interfaceC3729k1.T();
    }

    private void n(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        if (this.f46454d != null) {
            interfaceC3729k1.d("op").e(this.f46454d);
        }
        if (this.f46455e != null) {
            interfaceC3729k1.d("description").e(this.f46455e);
        }
        interfaceC3729k1.d("startTimestamp").j(iLogger, BigDecimal.valueOf(this.f46456f));
        interfaceC3729k1.d("endTimestamp").j(iLogger, BigDecimal.valueOf(this.f46457g));
        if (this.f46458h != null) {
            interfaceC3729k1.d("data").j(iLogger, this.f46458h);
        }
        Map map = this.f46460j;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f46460j.get(str);
                interfaceC3729k1.d(str);
                interfaceC3729k1.j(iLogger, obj);
            }
        }
        interfaceC3729k1.T();
    }

    public void o(Map map) {
        this.f46458h = map == null ? null : new ConcurrentHashMap(map);
    }

    public void p(Map map) {
        this.f46461k = map;
    }

    public void q(String str) {
        this.f46455e = str;
    }

    public void r(double d10) {
        this.f46457g = d10;
    }

    public void s(String str) {
        this.f46454d = str;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        new b.C0543b().a(this, interfaceC3729k1, iLogger);
        interfaceC3729k1.d("data");
        m(interfaceC3729k1, iLogger);
        Map map = this.f46459i;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f46459i.get(str);
                interfaceC3729k1.d(str);
                interfaceC3729k1.j(iLogger, obj);
            }
        }
        interfaceC3729k1.T();
    }

    public void t(Map map) {
        this.f46460j = map;
    }

    public void u(double d10) {
        this.f46456f = d10;
    }

    public void v(Map map) {
        this.f46459i = map;
    }
}

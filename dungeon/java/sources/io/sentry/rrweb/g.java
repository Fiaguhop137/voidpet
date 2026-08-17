package io.sentry.rrweb;

import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3724j1;
import io.sentry.InterfaceC3729k1;
import io.sentry.InterfaceC3773r0;
import io.sentry.util.w;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends b implements B0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f46444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f46445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f46446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f46447f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map f46448g;

    public static final class a implements InterfaceC3773r0 {
        private void c(g gVar, InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            interfaceC3724j1.I();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                switch (strX0) {
                    case "height":
                        Integer numT2 = interfaceC3724j1.t2();
                        gVar.f46445d = numT2 != null ? numT2.intValue() : 0;
                        break;
                    case "href":
                        String strD2 = interfaceC3724j1.D2();
                        if (strD2 == null) {
                            strD2 = "";
                        }
                        gVar.f46444c = strD2;
                        break;
                    case "width":
                        Integer numT3 = interfaceC3724j1.t2();
                        gVar.f46446e = numT3 != null ? numT3.intValue() : 0;
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC3724j1.M2(iLogger, concurrentHashMap, strX0);
                        break;
                }
            }
            gVar.k(concurrentHashMap);
            interfaceC3724j1.T();
        }

        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            interfaceC3724j1.I();
            g gVar = new g();
            b.a aVar = new b.a();
            HashMap map = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                if (strX0.equals("data")) {
                    c(gVar, interfaceC3724j1, iLogger);
                } else if (!aVar.a(gVar, strX0, interfaceC3724j1, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    interfaceC3724j1.M2(iLogger, map, strX0);
                }
            }
            gVar.m(map);
            interfaceC3724j1.T();
            return gVar;
        }
    }

    public g() {
        super(c.Meta);
        this.f46444c = "";
    }

    private void j(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        interfaceC3729k1.d("href").e(this.f46444c);
        interfaceC3729k1.d("height").a(this.f46445d);
        interfaceC3729k1.d("width").a(this.f46446e);
        Map map = this.f46447f;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f46447f.get(str);
                interfaceC3729k1.d(str);
                interfaceC3729k1.j(iLogger, obj);
            }
        }
        interfaceC3729k1.T();
    }

    @Override // io.sentry.rrweb.b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f46445d == gVar.f46445d && this.f46446e == gVar.f46446e && w.a(this.f46444c, gVar.f46444c);
    }

    @Override // io.sentry.rrweb.b
    public int hashCode() {
        return w.b(Integer.valueOf(super.hashCode()), this.f46444c, Integer.valueOf(this.f46445d), Integer.valueOf(this.f46446e));
    }

    public void k(Map map) {
        this.f46448g = map;
    }

    public void l(int i10) {
        this.f46445d = i10;
    }

    public void m(Map map) {
        this.f46447f = map;
    }

    public void n(int i10) {
        this.f46446e = i10;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        new b.C0543b().a(this, interfaceC3729k1, iLogger);
        interfaceC3729k1.d("data");
        j(interfaceC3729k1, iLogger);
        interfaceC3729k1.T();
    }
}

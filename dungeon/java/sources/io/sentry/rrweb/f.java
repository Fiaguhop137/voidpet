package io.sentry.rrweb;

import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3724j1;
import io.sentry.InterfaceC3729k1;
import io.sentry.InterfaceC3773r0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends d implements B0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f46435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f46436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f46437f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map f46438g;

    public static final class a implements InterfaceC3773r0 {
        private void c(f fVar, InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            d.a aVar = new d.a();
            interfaceC3724j1.I();
            HashMap map = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                if (strX0.equals("pointerId")) {
                    fVar.f46435d = interfaceC3724j1.nextInt();
                } else if (strX0.equals("positions")) {
                    fVar.f46436e = interfaceC3724j1.L3(iLogger, new b.a());
                } else if (!aVar.a(fVar, strX0, interfaceC3724j1, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    interfaceC3724j1.M2(iLogger, map, strX0);
                }
            }
            fVar.l(map);
            interfaceC3724j1.T();
        }

        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            interfaceC3724j1.I();
            f fVar = new f();
            io.sentry.rrweb.b.a aVar = new io.sentry.rrweb.b.a();
            HashMap map = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                if (strX0.equals("data")) {
                    c(fVar, interfaceC3724j1, iLogger);
                } else if (!aVar.a(fVar, strX0, interfaceC3724j1, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    interfaceC3724j1.M2(iLogger, map, strX0);
                }
            }
            fVar.o(map);
            interfaceC3724j1.T();
            return fVar;
        }
    }

    public static final class b implements B0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f46439a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f46440b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f46441c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f46442d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map f46443e;

        public static final class a implements InterfaceC3773r0 {
            @Override // io.sentry.InterfaceC3773r0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
                interfaceC3724j1.I();
                b bVar = new b();
                HashMap map = null;
                while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strX0 = interfaceC3724j1.X0();
                    strX0.getClass();
                    switch (strX0) {
                        case "x":
                            bVar.f46440b = interfaceC3724j1.nextFloat();
                            break;
                        case "y":
                            bVar.f46441c = interfaceC3724j1.nextFloat();
                            break;
                        case "id":
                            bVar.f46439a = interfaceC3724j1.nextInt();
                            break;
                        case "timeOffset":
                            bVar.f46442d = interfaceC3724j1.nextLong();
                            break;
                        default:
                            if (map == null) {
                                map = new HashMap();
                            }
                            interfaceC3724j1.M2(iLogger, map, strX0);
                            break;
                    }
                }
                bVar.h(map);
                interfaceC3724j1.T();
                return bVar;
            }
        }

        public long e() {
            return this.f46442d;
        }

        public void f(int i10) {
            this.f46439a = i10;
        }

        public void g(long j10) {
            this.f46442d = j10;
        }

        public void h(Map map) {
            this.f46443e = map;
        }

        public void i(float f10) {
            this.f46440b = f10;
        }

        public void j(float f10) {
            this.f46441c = f10;
        }

        @Override // io.sentry.B0
        public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
            interfaceC3729k1.I();
            interfaceC3729k1.d("id").a(this.f46439a);
            interfaceC3729k1.d("x").b(this.f46440b);
            interfaceC3729k1.d("y").b(this.f46441c);
            interfaceC3729k1.d("timeOffset").a(this.f46442d);
            Map map = this.f46443e;
            if (map != null) {
                for (String str : map.keySet()) {
                    Object obj = this.f46443e.get(str);
                    interfaceC3729k1.d(str);
                    interfaceC3729k1.j(iLogger, obj);
                }
            }
            interfaceC3729k1.T();
        }
    }

    public f() {
        super(d.b.TouchMove);
    }

    private void k(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        new d.c().a(this, interfaceC3729k1, iLogger);
        List list = this.f46436e;
        if (list != null && !list.isEmpty()) {
            interfaceC3729k1.d("positions").j(iLogger, this.f46436e);
        }
        interfaceC3729k1.d("pointerId").a(this.f46435d);
        Map map = this.f46438g;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f46438g.get(str);
                interfaceC3729k1.d(str);
                interfaceC3729k1.j(iLogger, obj);
            }
        }
        interfaceC3729k1.T();
    }

    public void l(Map map) {
        this.f46438g = map;
    }

    public void m(int i10) {
        this.f46435d = i10;
    }

    public void n(List list) {
        this.f46436e = list;
    }

    public void o(Map map) {
        this.f46437f = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        new io.sentry.rrweb.b.C0543b().a(this, interfaceC3729k1, iLogger);
        interfaceC3729k1.d("data");
        k(interfaceC3729k1, iLogger);
        Map map = this.f46437f;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f46437f.get(str);
                interfaceC3729k1.d(str);
                interfaceC3729k1.j(iLogger, obj);
            }
        }
        interfaceC3729k1.T();
    }
}

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
public final class j extends b implements B0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f46462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f46463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f46464e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f46465f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f46466g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f46467h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f46468i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f46469j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f46470k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f46471l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f46472m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f46473n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f46474o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Map f46475p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Map f46476q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Map f46477r;

    public static final class a implements InterfaceC3773r0 {
        private void c(j jVar, InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            interfaceC3724j1.I();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                if (strX0.equals("payload")) {
                    d(jVar, interfaceC3724j1, iLogger);
                } else if (strX0.equals("tag")) {
                    String strD2 = interfaceC3724j1.D2();
                    if (strD2 == null) {
                        strD2 = "";
                    }
                    jVar.f46462c = strD2;
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    interfaceC3724j1.M2(iLogger, concurrentHashMap, strX0);
                }
            }
            jVar.v(concurrentHashMap);
            interfaceC3724j1.T();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        private void d(j jVar, InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            interfaceC3724j1.I();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                byte b10 = -1;
                switch (strX0.hashCode()) {
                    case -1992012396:
                        if (strX0.equals("duration")) {
                            b10 = 0;
                        }
                        break;
                    case -1627805778:
                        if (strX0.equals("segmentId")) {
                            b10 = 1;
                        }
                        break;
                    case -1221029593:
                        if (strX0.equals("height")) {
                            b10 = 2;
                        }
                        break;
                    case -410956671:
                        if (strX0.equals("container")) {
                            b10 = 3;
                        }
                        break;
                    case -296512606:
                        if (strX0.equals("frameCount")) {
                            b10 = 4;
                        }
                        break;
                    case 115029:
                        if (strX0.equals("top")) {
                            b10 = 5;
                        }
                        break;
                    case 3317767:
                        if (strX0.equals("left")) {
                            b10 = 6;
                        }
                        break;
                    case 3530753:
                        if (strX0.equals("size")) {
                            b10 = 7;
                        }
                        break;
                    case 113126854:
                        if (strX0.equals("width")) {
                            b10 = 8;
                        }
                        break;
                    case 545057773:
                        if (strX0.equals("frameRate")) {
                            b10 = 9;
                        }
                        break;
                    case 1711222099:
                        if (strX0.equals("encoding")) {
                            b10 = 10;
                        }
                        break;
                    case 2135109831:
                        if (strX0.equals("frameRateType")) {
                            b10 = 11;
                        }
                        break;
                }
                switch (b10) {
                    case 0:
                        jVar.f46465f = interfaceC3724j1.nextLong();
                        break;
                    case 1:
                        jVar.f46463d = interfaceC3724j1.nextInt();
                        break;
                    case 2:
                        Integer numT2 = interfaceC3724j1.t2();
                        jVar.f46468i = numT2 != null ? numT2.intValue() : 0;
                        break;
                    case 3:
                        String strD2 = interfaceC3724j1.D2();
                        jVar.f46467h = strD2 != null ? strD2 : "";
                        break;
                    case 4:
                        Integer numT3 = interfaceC3724j1.t2();
                        jVar.f46470k = numT3 != null ? numT3.intValue() : 0;
                        break;
                    case 5:
                        Integer numT4 = interfaceC3724j1.t2();
                        jVar.f46474o = numT4 != null ? numT4.intValue() : 0;
                        break;
                    case 6:
                        Integer numT5 = interfaceC3724j1.t2();
                        jVar.f46473n = numT5 != null ? numT5.intValue() : 0;
                        break;
                    case 7:
                        Long lX2 = interfaceC3724j1.x2();
                        jVar.f46464e = lX2 == null ? 0L : lX2.longValue();
                        break;
                    case 8:
                        Integer numT6 = interfaceC3724j1.t2();
                        jVar.f46469j = numT6 != null ? numT6.intValue() : 0;
                        break;
                    case 9:
                        Integer numT7 = interfaceC3724j1.t2();
                        jVar.f46472m = numT7 != null ? numT7.intValue() : 0;
                        break;
                    case 10:
                        String strD3 = interfaceC3724j1.D2();
                        jVar.f46466g = strD3 != null ? strD3 : "";
                        break;
                    case 11:
                        String strD4 = interfaceC3724j1.D2();
                        jVar.f46471l = strD4 != null ? strD4 : "";
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC3724j1.M2(iLogger, concurrentHashMap, strX0);
                        break;
                }
            }
            jVar.B(concurrentHashMap);
            interfaceC3724j1.T();
        }

        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            interfaceC3724j1.I();
            j jVar = new j();
            b.a aVar = new b.a();
            HashMap map = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                if (strX0.equals("data")) {
                    c(jVar, interfaceC3724j1, iLogger);
                } else if (!aVar.a(jVar, strX0, interfaceC3724j1, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    interfaceC3724j1.M2(iLogger, map, strX0);
                }
            }
            jVar.F(map);
            interfaceC3724j1.T();
            return jVar;
        }
    }

    public j() {
        super(c.Custom);
        this.f46466g = "h264";
        this.f46467h = "mp4";
        this.f46471l = "constant";
        this.f46462c = "video";
    }

    private void t(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        interfaceC3729k1.d("tag").e(this.f46462c);
        interfaceC3729k1.d("payload");
        u(interfaceC3729k1, iLogger);
        Map map = this.f46477r;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f46477r.get(str);
                interfaceC3729k1.d(str);
                interfaceC3729k1.j(iLogger, obj);
            }
        }
        interfaceC3729k1.T();
    }

    private void u(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        interfaceC3729k1.d("segmentId").a(this.f46463d);
        interfaceC3729k1.d("size").a(this.f46464e);
        interfaceC3729k1.d("duration").a(this.f46465f);
        interfaceC3729k1.d("encoding").e(this.f46466g);
        interfaceC3729k1.d("container").e(this.f46467h);
        interfaceC3729k1.d("height").a(this.f46468i);
        interfaceC3729k1.d("width").a(this.f46469j);
        interfaceC3729k1.d("frameCount").a(this.f46470k);
        interfaceC3729k1.d("frameRate").a(this.f46472m);
        interfaceC3729k1.d("frameRateType").e(this.f46471l);
        interfaceC3729k1.d("left").a(this.f46473n);
        interfaceC3729k1.d("top").a(this.f46474o);
        Map map = this.f46476q;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f46476q.get(str);
                interfaceC3729k1.d(str);
                interfaceC3729k1.j(iLogger, obj);
            }
        }
        interfaceC3729k1.T();
    }

    public void A(int i10) {
        this.f46473n = i10;
    }

    public void B(Map map) {
        this.f46476q = map;
    }

    public void C(int i10) {
        this.f46463d = i10;
    }

    public void D(long j10) {
        this.f46464e = j10;
    }

    public void E(int i10) {
        this.f46474o = i10;
    }

    public void F(Map map) {
        this.f46475p = map;
    }

    public void G(int i10) {
        this.f46469j = i10;
    }

    @Override // io.sentry.rrweb.b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f46463d == jVar.f46463d && this.f46464e == jVar.f46464e && this.f46465f == jVar.f46465f && this.f46468i == jVar.f46468i && this.f46469j == jVar.f46469j && this.f46470k == jVar.f46470k && this.f46472m == jVar.f46472m && this.f46473n == jVar.f46473n && this.f46474o == jVar.f46474o && w.a(this.f46462c, jVar.f46462c) && w.a(this.f46466g, jVar.f46466g) && w.a(this.f46467h, jVar.f46467h) && w.a(this.f46471l, jVar.f46471l);
    }

    @Override // io.sentry.rrweb.b
    public int hashCode() {
        return w.b(Integer.valueOf(super.hashCode()), this.f46462c, Integer.valueOf(this.f46463d), Long.valueOf(this.f46464e), Long.valueOf(this.f46465f), this.f46466g, this.f46467h, Integer.valueOf(this.f46468i), Integer.valueOf(this.f46469j), Integer.valueOf(this.f46470k), this.f46471l, Integer.valueOf(this.f46472m), Integer.valueOf(this.f46473n), Integer.valueOf(this.f46474o));
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        new b.C0543b().a(this, interfaceC3729k1, iLogger);
        interfaceC3729k1.d("data");
        t(interfaceC3729k1, iLogger);
        Map map = this.f46475p;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f46475p.get(str);
                interfaceC3729k1.d(str);
                interfaceC3729k1.j(iLogger, obj);
            }
        }
        interfaceC3729k1.T();
    }

    public void v(Map map) {
        this.f46477r = map;
    }

    public void w(long j10) {
        this.f46465f = j10;
    }

    public void x(int i10) {
        this.f46470k = i10;
    }

    public void y(int i10) {
        this.f46472m = i10;
    }

    public void z(int i10) {
        this.f46468i = i10;
    }
}

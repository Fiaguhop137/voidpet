package io.sentry;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class A3 extends AbstractC3725j2 implements B0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private File f44197p;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f44201t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Date f44203v;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Map f44207z;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private io.sentry.protocol.x f44200s = new io.sentry.protocol.x();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f44198q = "replay_event";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private b f44199r = b.SESSION;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private List f44205x = new ArrayList();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private List f44206y = new ArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private List f44204w = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Date f44202u = AbstractC3732l.d();

    public static final class a implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public A3 a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            AbstractC3725j2.a aVar = new AbstractC3725j2.a();
            A3 a10 = new A3();
            interfaceC3724j1.I();
            String strD2 = null;
            b bVar = null;
            Integer numT2 = null;
            Date dateE1 = null;
            HashMap map = null;
            io.sentry.protocol.x xVar = null;
            Date dateE2 = null;
            List list = null;
            List list2 = null;
            List list3 = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                switch (strX0) {
                    case "replay_id":
                        xVar = (io.sentry.protocol.x) interfaceC3724j1.A1(iLogger, new io.sentry.protocol.x.a());
                        break;
                    case "replay_start_timestamp":
                        dateE2 = interfaceC3724j1.e1(iLogger);
                        break;
                    case "type":
                        strD2 = interfaceC3724j1.D2();
                        break;
                    case "urls":
                        list = (List) interfaceC3724j1.z3();
                        break;
                    case "timestamp":
                        dateE1 = interfaceC3724j1.e1(iLogger);
                        break;
                    case "error_ids":
                        list2 = (List) interfaceC3724j1.z3();
                        break;
                    case "trace_ids":
                        list3 = (List) interfaceC3724j1.z3();
                        break;
                    case "replay_type":
                        bVar = (b) interfaceC3724j1.A1(iLogger, new b.a());
                        break;
                    case "segment_id":
                        numT2 = interfaceC3724j1.t2();
                        break;
                    default:
                        if (!aVar.a(a10, strX0, interfaceC3724j1, iLogger)) {
                            if (map == null) {
                                map = new HashMap();
                            }
                            interfaceC3724j1.M2(iLogger, map, strX0);
                            break;
                        } else {
                            break;
                        }
                        break;
                }
            }
            interfaceC3724j1.T();
            if (strD2 != null) {
                a10.p0(strD2);
            }
            if (bVar != null) {
                a10.l0(bVar);
            }
            if (numT2 != null) {
                a10.m0(numT2.intValue());
            }
            if (dateE1 != null) {
                a10.n0(dateE1);
            }
            a10.j0(xVar);
            a10.k0(dateE2);
            a10.r0(list);
            a10.i0(list2);
            a10.o0(list3);
            a10.q0(map);
            return a10;
        }
    }

    public enum b implements B0 {
        SESSION,
        BUFFER;

        public static final class a implements InterfaceC3773r0 {
            @Override // io.sentry.InterfaceC3773r0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
                return b.valueOf(interfaceC3724j1.j2().toUpperCase(Locale.ROOT));
            }
        }

        @Override // io.sentry.B0
        public void serialize(@NotNull InterfaceC3729k1 interfaceC3729k1, @NotNull ILogger iLogger) throws IOException {
            interfaceC3729k1.e(name().toLowerCase(Locale.ROOT));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && A3.class == obj.getClass()) {
            A3 a10 = (A3) obj;
            if (this.f44201t == a10.f44201t && io.sentry.util.w.a(this.f44198q, a10.f44198q) && this.f44199r == a10.f44199r && io.sentry.util.w.a(this.f44200s, a10.f44200s) && io.sentry.util.w.a(this.f44204w, a10.f44204w) && io.sentry.util.w.a(this.f44205x, a10.f44205x) && io.sentry.util.w.a(this.f44206y, a10.f44206y)) {
                return true;
            }
        }
        return false;
    }

    public Date g0() {
        return this.f44202u;
    }

    public File h0() {
        return this.f44197p;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f44198q, this.f44199r, this.f44200s, Integer.valueOf(this.f44201t), this.f44204w, this.f44205x, this.f44206y);
    }

    public void i0(List list) {
        this.f44205x = list;
    }

    public void j0(io.sentry.protocol.x xVar) {
        this.f44200s = xVar;
    }

    public void k0(Date date) {
        this.f44203v = date;
    }

    public void l0(b bVar) {
        this.f44199r = bVar;
    }

    public void m0(int i10) {
        this.f44201t = i10;
    }

    public void n0(Date date) {
        this.f44202u = date;
    }

    public void o0(List list) {
        this.f44206y = list;
    }

    public void p0(String str) {
        this.f44198q = str;
    }

    public void q0(Map map) {
        this.f44207z = map;
    }

    public void r0(List list) {
        this.f44204w = list;
    }

    public void s0(File file) {
        this.f44197p = file;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        interfaceC3729k1.d("type").e(this.f44198q);
        interfaceC3729k1.d("replay_type").j(iLogger, this.f44199r);
        interfaceC3729k1.d("segment_id").a(this.f44201t);
        interfaceC3729k1.d("timestamp").j(iLogger, this.f44202u);
        if (this.f44200s != null) {
            interfaceC3729k1.d("replay_id").j(iLogger, this.f44200s);
        }
        if (this.f44203v != null) {
            interfaceC3729k1.d("replay_start_timestamp").j(iLogger, this.f44203v);
        }
        if (this.f44204w != null) {
            interfaceC3729k1.d("urls").j(iLogger, this.f44204w);
        }
        if (this.f44205x != null) {
            interfaceC3729k1.d("error_ids").j(iLogger, this.f44205x);
        }
        if (this.f44206y != null) {
            interfaceC3729k1.d("trace_ids").j(iLogger, this.f44206y);
        }
        new AbstractC3725j2.b().a(this, interfaceC3729k1, iLogger);
        Map map = this.f44207z;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC3729k1.d(str).j(iLogger, this.f44207z.get(str));
            }
        }
        interfaceC3729k1.T();
    }
}

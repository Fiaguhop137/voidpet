package io.sentry;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: io.sentry.k3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3731k3 implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private io.sentry.protocol.x f45947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Y3 f45948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Double f45949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f45950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private EnumC3746n3 f45951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Integer f45952f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map f45953g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map f45954h;

    /* JADX INFO: renamed from: io.sentry.k3$a */
    public static final class a implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3731k3 a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            interfaceC3724j1.I();
            io.sentry.protocol.x xVar = null;
            Double dS0 = null;
            String strD2 = null;
            HashMap map = null;
            EnumC3746n3 enumC3746n3 = null;
            Map mapJ2 = null;
            Integer numT2 = null;
            Y3 y10 = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                switch (strX0) {
                    case "span_id":
                        y10 = (Y3) interfaceC3724j1.A1(iLogger, new Y3.a());
                        break;
                    case "severity_number":
                        numT2 = interfaceC3724j1.t2();
                        break;
                    case "body":
                        strD2 = interfaceC3724j1.D2();
                        break;
                    case "timestamp":
                        dS0 = interfaceC3724j1.S0();
                        break;
                    case "level":
                        enumC3746n3 = (EnumC3746n3) interfaceC3724j1.A1(iLogger, new EnumC3746n3.a());
                        break;
                    case "attributes":
                        mapJ2 = interfaceC3724j1.J2(iLogger, new C3736l3.a());
                        break;
                    case "trace_id":
                        xVar = (io.sentry.protocol.x) interfaceC3724j1.A1(iLogger, new io.sentry.protocol.x.a());
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        interfaceC3724j1.M2(iLogger, map, strX0);
                        break;
                }
            }
            interfaceC3724j1.T();
            if (xVar == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"trace_id\"");
                iLogger.b(EnumC3721i3.ERROR, "Missing required field \"trace_id\"", illegalStateException);
                throw illegalStateException;
            }
            if (dS0 == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"timestamp\"");
                iLogger.b(EnumC3721i3.ERROR, "Missing required field \"timestamp\"", illegalStateException2);
                throw illegalStateException2;
            }
            if (strD2 == null) {
                IllegalStateException illegalStateException3 = new IllegalStateException("Missing required field \"body\"");
                iLogger.b(EnumC3721i3.ERROR, "Missing required field \"body\"", illegalStateException3);
                throw illegalStateException3;
            }
            if (enumC3746n3 == null) {
                IllegalStateException illegalStateException4 = new IllegalStateException("Missing required field \"level\"");
                iLogger.b(EnumC3721i3.ERROR, "Missing required field \"level\"", illegalStateException4);
                throw illegalStateException4;
            }
            C3731k3 c3731k3 = new C3731k3(xVar, dS0, strD2, enumC3746n3);
            c3731k3.a(mapJ2);
            c3731k3.b(numT2);
            c3731k3.c(y10);
            c3731k3.d(map);
            return c3731k3;
        }
    }

    public C3731k3(io.sentry.protocol.x xVar, Double d10, String str, EnumC3746n3 enumC3746n3) {
        this.f45947a = xVar;
        this.f45949c = d10;
        this.f45950d = str;
        this.f45951e = enumC3746n3;
    }

    public void a(Map map) {
        this.f45953g = map;
    }

    public void b(Integer num) {
        this.f45952f = num;
    }

    public void c(Y3 y10) {
        this.f45948b = y10;
    }

    public void d(Map map) {
        this.f45954h = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        interfaceC3729k1.d("timestamp").j(iLogger, AbstractC3732l.c(this.f45949c));
        interfaceC3729k1.d("trace_id").j(iLogger, this.f45947a);
        if (this.f45948b != null) {
            interfaceC3729k1.d("span_id").j(iLogger, this.f45948b);
        }
        interfaceC3729k1.d("body").e(this.f45950d);
        interfaceC3729k1.d("level").j(iLogger, this.f45951e);
        if (this.f45952f != null) {
            interfaceC3729k1.d("severity_number").j(iLogger, this.f45952f);
        }
        if (this.f45953g != null) {
            interfaceC3729k1.d("attributes").j(iLogger, this.f45953g);
        }
        Map map = this.f45954h;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC3729k1.d(str).j(iLogger, this.f45954h.get(str));
            }
        }
        interfaceC3729k1.T();
    }
}

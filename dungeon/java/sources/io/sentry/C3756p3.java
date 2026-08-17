package io.sentry;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: io.sentry.p3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3756p3 implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private io.sentry.protocol.x f46038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Y3 f46039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Double f46040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f46041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f46042e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f46043f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Double f46044g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map f46045h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map f46046i;

    /* JADX INFO: renamed from: io.sentry.p3$a */
    public static final class a implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3756p3 a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            interfaceC3724j1.I();
            HashMap map = null;
            io.sentry.protocol.x xVar = null;
            Double dS0 = null;
            String strD2 = null;
            String strD3 = null;
            Double dS1 = null;
            Map mapJ2 = null;
            Y3 y10 = null;
            String strD4 = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                switch (strX0) {
                    case "span_id":
                        y10 = (Y3) interfaceC3724j1.A1(iLogger, new Y3.a());
                        break;
                    case "name":
                        strD2 = interfaceC3724j1.D2();
                        break;
                    case "type":
                        strD3 = interfaceC3724j1.D2();
                        break;
                    case "unit":
                        strD4 = interfaceC3724j1.D2();
                        break;
                    case "timestamp":
                        dS0 = interfaceC3724j1.S0();
                        break;
                    case "value":
                        dS1 = interfaceC3724j1.S0();
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
            if (strD3 == null) {
                IllegalStateException illegalStateException3 = new IllegalStateException("Missing required field \"type\"");
                iLogger.b(EnumC3721i3.ERROR, "Missing required field \"type\"", illegalStateException3);
                throw illegalStateException3;
            }
            if (strD2 == null) {
                IllegalStateException illegalStateException4 = new IllegalStateException("Missing required field \"name\"");
                iLogger.b(EnumC3721i3.ERROR, "Missing required field \"name\"", illegalStateException4);
                throw illegalStateException4;
            }
            if (dS1 == null) {
                IllegalStateException illegalStateException5 = new IllegalStateException("Missing required field \"value\"");
                iLogger.b(EnumC3721i3.ERROR, "Missing required field \"value\"", illegalStateException5);
                throw illegalStateException5;
            }
            C3756p3 c3756p3 = new C3756p3(xVar, dS0, strD2, strD3, dS1);
            c3756p3.a(mapJ2);
            c3756p3.b(y10);
            c3756p3.c(strD4);
            c3756p3.d(map);
            return c3756p3;
        }
    }

    public C3756p3(io.sentry.protocol.x xVar, Double d10, String str, String str2, Double d11) {
        this.f46038a = xVar;
        this.f46040c = d10;
        this.f46041d = str;
        this.f46043f = str2;
        this.f46044g = d11;
    }

    public void a(Map map) {
        this.f46045h = map;
    }

    public void b(Y3 y10) {
        this.f46039b = y10;
    }

    public void c(String str) {
        this.f46042e = str;
    }

    public void d(Map map) {
        this.f46046i = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        interfaceC3729k1.d("timestamp").j(iLogger, AbstractC3732l.c(this.f46040c));
        interfaceC3729k1.d("type").e(this.f46043f);
        interfaceC3729k1.d("name").e(this.f46041d);
        interfaceC3729k1.d("value").i(this.f46044g);
        interfaceC3729k1.d("trace_id").j(iLogger, this.f46038a);
        if (this.f46039b != null) {
            interfaceC3729k1.d("span_id").j(iLogger, this.f46039b);
        }
        if (this.f46042e != null) {
            interfaceC3729k1.d("unit").j(iLogger, this.f46042e);
        }
        if (this.f46045h != null) {
            interfaceC3729k1.d("attributes").j(iLogger, this.f46045h);
        }
        Map map = this.f46046i;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC3729k1.d(str).j(iLogger, this.f46046i.get(str));
            }
        }
        interfaceC3729k1.T();
    }
}

package io.sentry;

import io.sentry.protocol.C3760d;
import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3774r1 implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C3760d f46322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private io.sentry.protocol.x f46323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private io.sentry.protocol.x f46324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private io.sentry.protocol.r f46325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f46326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f46327f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f46328g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f46329h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f46330i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private double f46331j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final File f46332k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f46333l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private io.sentry.protocol.profiling.a f46334m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Map f46335n;

    /* JADX INFO: renamed from: io.sentry.r1$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.sentry.protocol.x f46336a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.sentry.protocol.x f46337b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map f46338c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final File f46339d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final double f46340e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f46341f;

        public a(io.sentry.protocol.x xVar, io.sentry.protocol.x xVar2, Map map, File file, AbstractC3750o2 abstractC3750o2, String str) {
            this.f46336a = xVar;
            this.f46337b = xVar2;
            this.f46338c = new ConcurrentHashMap(map);
            this.f46339d = file;
            this.f46340e = AbstractC3732l.m(abstractC3750o2.p());
            this.f46341f = str;
        }

        public C3774r1 a(C3833z3 c3833z3) {
            return new C3774r1(this.f46336a, this.f46337b, this.f46339d, this.f46338c, Double.valueOf(this.f46340e), this.f46341f, c3833z3);
        }
    }

    /* JADX INFO: renamed from: io.sentry.r1$b */
    public static final class b implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3774r1 a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            interfaceC3724j1.I();
            C3774r1 c3774r1 = new C3774r1();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                switch (strX0) {
                    case "debug_meta":
                        C3760d c3760d = (C3760d) interfaceC3724j1.A1(iLogger, new C3760d.a());
                        if (c3760d == null) {
                            break;
                        } else {
                            c3774r1.f46322a = c3760d;
                            break;
                        }
                        break;
                    case "measurements":
                        Map mapJ2 = interfaceC3724j1.J2(iLogger, new io.sentry.profilemeasurements.a.C0539a());
                        if (mapJ2 == null) {
                            break;
                        } else {
                            c3774r1.f46326e.putAll(mapJ2);
                            break;
                        }
                        break;
                    case "profile":
                        io.sentry.protocol.profiling.a aVar = (io.sentry.protocol.profiling.a) interfaceC3724j1.A1(iLogger, new io.sentry.protocol.profiling.a.b());
                        if (aVar == null) {
                            break;
                        } else {
                            c3774r1.f46334m = aVar;
                            break;
                        }
                        break;
                    case "environment":
                        String strD2 = interfaceC3724j1.D2();
                        if (strD2 == null) {
                            break;
                        } else {
                            c3774r1.f46329h = strD2;
                            break;
                        }
                        break;
                    case "timestamp":
                        Double dS0 = interfaceC3724j1.S0();
                        if (dS0 == null) {
                            break;
                        } else {
                            c3774r1.f46331j = dS0.doubleValue();
                            break;
                        }
                        break;
                    case "profiler_id":
                        io.sentry.protocol.x xVar = (io.sentry.protocol.x) interfaceC3724j1.A1(iLogger, new io.sentry.protocol.x.a());
                        if (xVar == null) {
                            break;
                        } else {
                            c3774r1.f46323b = xVar;
                            break;
                        }
                        break;
                    case "version":
                        String strD3 = interfaceC3724j1.D2();
                        if (strD3 == null) {
                            break;
                        } else {
                            c3774r1.f46330i = strD3;
                            break;
                        }
                        break;
                    case "release":
                        String strD4 = interfaceC3724j1.D2();
                        if (strD4 == null) {
                            break;
                        } else {
                            c3774r1.f46328g = strD4;
                            break;
                        }
                        break;
                    case "client_sdk":
                        io.sentry.protocol.r rVar = (io.sentry.protocol.r) interfaceC3724j1.A1(iLogger, new io.sentry.protocol.r.a());
                        if (rVar == null) {
                            break;
                        } else {
                            c3774r1.f46325d = rVar;
                            break;
                        }
                        break;
                    case "platform":
                        String strD5 = interfaceC3724j1.D2();
                        if (strD5 == null) {
                            break;
                        } else {
                            c3774r1.f46327f = strD5;
                            break;
                        }
                        break;
                    case "sampled_profile":
                        String strD6 = interfaceC3724j1.D2();
                        if (strD6 == null) {
                            break;
                        } else {
                            c3774r1.f46333l = strD6;
                            break;
                        }
                        break;
                    case "chunk_id":
                        io.sentry.protocol.x xVar2 = (io.sentry.protocol.x) interfaceC3724j1.A1(iLogger, new io.sentry.protocol.x.a());
                        if (xVar2 == null) {
                            break;
                        } else {
                            c3774r1.f46324c = xVar2;
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
            c3774r1.u(concurrentHashMap);
            interfaceC3724j1.T();
            return c3774r1;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C3774r1() {
        io.sentry.protocol.x xVar = io.sentry.protocol.x.f46302b;
        this(xVar, xVar, new File("dummy"), new HashMap(), Double.valueOf(0.0d), "android", C3833z3.empty());
    }

    public C3774r1(io.sentry.protocol.x xVar, io.sentry.protocol.x xVar2, File file, Map map, Double d10, String str, C3833z3 c3833z3) {
        this.f46333l = null;
        this.f46323b = xVar;
        this.f46324c = xVar2;
        this.f46332k = file;
        this.f46326e = map;
        this.f46322a = null;
        this.f46325d = c3833z3.getSdkVersion();
        this.f46328g = c3833z3.getRelease() != null ? c3833z3.getRelease() : "";
        this.f46329h = c3833z3.getEnvironment();
        this.f46327f = str;
        this.f46330i = "2";
        this.f46331j = d10.doubleValue();
    }

    private BigDecimal m(Double d10) {
        return BigDecimal.valueOf(d10.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3774r1)) {
            return false;
        }
        C3774r1 c3774r1 = (C3774r1) obj;
        return Objects.equals(this.f46322a, c3774r1.f46322a) && Objects.equals(this.f46323b, c3774r1.f46323b) && Objects.equals(this.f46324c, c3774r1.f46324c) && Objects.equals(this.f46325d, c3774r1.f46325d) && Objects.equals(this.f46326e, c3774r1.f46326e) && Objects.equals(this.f46327f, c3774r1.f46327f) && Objects.equals(this.f46328g, c3774r1.f46328g) && Objects.equals(this.f46329h, c3774r1.f46329h) && Objects.equals(this.f46330i, c3774r1.f46330i) && Objects.equals(this.f46333l, c3774r1.f46333l) && Objects.equals(this.f46335n, c3774r1.f46335n) && Objects.equals(this.f46334m, c3774r1.f46334m);
    }

    public int hashCode() {
        return Objects.hash(this.f46322a, this.f46323b, this.f46324c, this.f46325d, this.f46326e, this.f46327f, this.f46328g, this.f46329h, this.f46330i, this.f46333l, this.f46334m, this.f46335n);
    }

    public io.sentry.protocol.x n() {
        return this.f46324c;
    }

    public C3760d o() {
        return this.f46322a;
    }

    public String p() {
        return this.f46327f;
    }

    public File q() {
        return this.f46332k;
    }

    public void r(C3760d c3760d) {
        this.f46322a = c3760d;
    }

    public void s(String str) {
        this.f46333l = str;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        if (this.f46322a != null) {
            interfaceC3729k1.d("debug_meta").j(iLogger, this.f46322a);
        }
        interfaceC3729k1.d("profiler_id").j(iLogger, this.f46323b);
        interfaceC3729k1.d("chunk_id").j(iLogger, this.f46324c);
        if (this.f46325d != null) {
            interfaceC3729k1.d("client_sdk").j(iLogger, this.f46325d);
        }
        if (!this.f46326e.isEmpty()) {
            String strF = interfaceC3729k1.f();
            interfaceC3729k1.h("");
            interfaceC3729k1.d("measurements").j(iLogger, this.f46326e);
            interfaceC3729k1.h(strF);
        }
        interfaceC3729k1.d("platform").j(iLogger, this.f46327f);
        interfaceC3729k1.d("release").j(iLogger, this.f46328g);
        if (this.f46329h != null) {
            interfaceC3729k1.d("environment").j(iLogger, this.f46329h);
        }
        interfaceC3729k1.d("version").j(iLogger, this.f46330i);
        if (this.f46333l != null) {
            interfaceC3729k1.d("sampled_profile").j(iLogger, this.f46333l);
        }
        interfaceC3729k1.d("timestamp").j(iLogger, m(Double.valueOf(this.f46331j)));
        if (this.f46334m != null) {
            interfaceC3729k1.d("profile").j(iLogger, this.f46334m);
        }
        Map map = this.f46335n;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC3729k1.d(str).j(iLogger, this.f46335n.get(str));
            }
        }
        interfaceC3729k1.T();
    }

    public void t(io.sentry.protocol.profiling.a aVar) {
        this.f46334m = aVar;
    }

    public void u(Map map) {
        this.f46335n = map;
    }
}

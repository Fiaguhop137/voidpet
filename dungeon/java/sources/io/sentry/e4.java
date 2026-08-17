package io.sentry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class e4 implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.protocol.x f45808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f45809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f45810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f45811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f45812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f45813f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f45814g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f45815h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f45816i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final io.sentry.protocol.x f45817j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Map f45818k;

    public static final class a implements InterfaceC3773r0 {
        private Exception c(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.b(EnumC3721i3.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e4 a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) throws Exception {
            interfaceC3724j1.I();
            ConcurrentHashMap concurrentHashMap = null;
            io.sentry.protocol.x xVarA = null;
            String strJ2 = null;
            String strD2 = null;
            String strD3 = null;
            String strD4 = null;
            String strD5 = null;
            String strD6 = null;
            String strD7 = null;
            io.sentry.protocol.x xVarA2 = null;
            String strD8 = null;
            while (true) {
                io.sentry.protocol.x xVar = xVarA;
                String str = strJ2;
                if (interfaceC3724j1.peek() != io.sentry.vendor.gson.stream.b.NAME) {
                    if (xVar == null) {
                        throw c("trace_id", iLogger);
                    }
                    if (str == null) {
                        throw c("public_key", iLogger);
                    }
                    e4 e4Var = new e4(xVar, str, strD2, strD3, strD4, strD5, strD6, strD7, xVarA2, strD8);
                    e4Var.c(concurrentHashMap);
                    interfaceC3724j1.T();
                    return e4Var;
                }
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                switch (strX0) {
                    case "replay_id":
                        xVarA2 = new io.sentry.protocol.x.a().a(interfaceC3724j1, iLogger);
                        xVarA = xVar;
                        strJ2 = str;
                        break;
                    case "user_id":
                        strD4 = interfaceC3724j1.D2();
                        xVarA = xVar;
                        strJ2 = str;
                        break;
                    case "environment":
                        strD3 = interfaceC3724j1.D2();
                        xVarA = xVar;
                        strJ2 = str;
                        break;
                    case "sample_rand":
                        strD8 = interfaceC3724j1.D2();
                        xVarA = xVar;
                        strJ2 = str;
                        break;
                    case "sample_rate":
                        strD6 = interfaceC3724j1.D2();
                        xVarA = xVar;
                        strJ2 = str;
                        break;
                    case "release":
                        strD2 = interfaceC3724j1.D2();
                        xVarA = xVar;
                        strJ2 = str;
                        break;
                    case "trace_id":
                        xVarA = new io.sentry.protocol.x.a().a(interfaceC3724j1, iLogger);
                        strJ2 = str;
                        break;
                    case "sampled":
                        strD7 = interfaceC3724j1.D2();
                        xVarA = xVar;
                        strJ2 = str;
                        break;
                    case "public_key":
                        strJ2 = interfaceC3724j1.j2();
                        xVarA = xVar;
                        break;
                    case "transaction":
                        strD5 = interfaceC3724j1.D2();
                        xVarA = xVar;
                        strJ2 = str;
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC3724j1.M2(iLogger, concurrentHashMap, strX0);
                        xVarA = xVar;
                        strJ2 = str;
                        break;
                }
            }
        }
    }

    e4(io.sentry.protocol.x xVar, String str) {
        this(xVar, str, null, null, null, null, null, null, null);
    }

    e4(io.sentry.protocol.x xVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, io.sentry.protocol.x xVar2) {
        this(xVar, str, str2, str3, str4, str5, str6, str7, xVar2, null);
    }

    e4(io.sentry.protocol.x xVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, io.sentry.protocol.x xVar2, String str8) {
        this.f45808a = xVar;
        this.f45809b = str;
        this.f45810c = str2;
        this.f45811d = str3;
        this.f45812e = str4;
        this.f45813f = str5;
        this.f45814g = str6;
        this.f45816i = str7;
        this.f45817j = xVar2;
        this.f45815h = str8;
    }

    public String a() {
        return this.f45815h;
    }

    public String b() {
        return this.f45814g;
    }

    public void c(Map map) {
        this.f45818k = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        interfaceC3729k1.d("trace_id").j(iLogger, this.f45808a);
        interfaceC3729k1.d("public_key").e(this.f45809b);
        if (this.f45810c != null) {
            interfaceC3729k1.d("release").e(this.f45810c);
        }
        if (this.f45811d != null) {
            interfaceC3729k1.d("environment").e(this.f45811d);
        }
        if (this.f45812e != null) {
            interfaceC3729k1.d("user_id").e(this.f45812e);
        }
        if (this.f45813f != null) {
            interfaceC3729k1.d("transaction").e(this.f45813f);
        }
        if (this.f45814g != null) {
            interfaceC3729k1.d("sample_rate").e(this.f45814g);
        }
        if (this.f45815h != null) {
            interfaceC3729k1.d("sample_rand").e(this.f45815h);
        }
        if (this.f45816i != null) {
            interfaceC3729k1.d("sampled").e(this.f45816i);
        }
        if (this.f45817j != null) {
            interfaceC3729k1.d("replay_id").j(iLogger, this.f45817j);
        }
        Map map = this.f45818k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f45818k.get(str);
                interfaceC3729k1.d(str);
                interfaceC3729k1.j(iLogger, obj);
            }
        }
        interfaceC3729k1.T();
    }
}

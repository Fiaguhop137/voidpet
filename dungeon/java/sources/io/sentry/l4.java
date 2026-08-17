package io.sentry;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class l4 implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.protocol.x f45963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f45964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f45965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f45966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map f45967e;

    public static final class a implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l4 a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            interfaceC3724j1.I();
            io.sentry.protocol.x xVarA = null;
            String strD2 = null;
            String strD3 = null;
            String strD4 = null;
            HashMap map = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                switch (strX0) {
                    case "comments":
                        strD4 = interfaceC3724j1.D2();
                        break;
                    case "name":
                        strD2 = interfaceC3724j1.D2();
                        break;
                    case "email":
                        strD3 = interfaceC3724j1.D2();
                        break;
                    case "event_id":
                        xVarA = new io.sentry.protocol.x.a().a(interfaceC3724j1, iLogger);
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
            if (xVarA != null) {
                l4 l4Var = new l4(xVarA, strD2, strD3, strD4);
                l4Var.a(map);
                return l4Var;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"event_id\"");
            iLogger.b(EnumC3721i3.ERROR, "Missing required field \"event_id\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public l4(io.sentry.protocol.x xVar, String str, String str2, String str3) {
        this.f45963a = xVar;
        this.f45964b = str;
        this.f45965c = str2;
        this.f45966d = str3;
    }

    public void a(Map map) {
        this.f45967e = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        interfaceC3729k1.d("event_id");
        this.f45963a.serialize(interfaceC3729k1, iLogger);
        if (this.f45964b != null) {
            interfaceC3729k1.d("name").e(this.f45964b);
        }
        if (this.f45965c != null) {
            interfaceC3729k1.d("email").e(this.f45965c);
        }
        if (this.f45966d != null) {
            interfaceC3729k1.d("comments").e(this.f45966d);
        }
        Map map = this.f45967e;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC3729k1.d(str).j(iLogger, this.f45967e.get(str));
            }
        }
        interfaceC3729k1.T();
    }

    public String toString() {
        return "UserFeedback{eventId=" + this.f45963a + ", name='" + this.f45964b + "', email='" + this.f45965c + "', comments='" + this.f45966d + "'}";
    }
}

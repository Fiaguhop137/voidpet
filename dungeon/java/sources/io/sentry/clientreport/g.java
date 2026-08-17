package io.sentry.clientreport;

import io.sentry.B0;
import io.sentry.EnumC3721i3;
import io.sentry.ILogger;
import io.sentry.InterfaceC3724j1;
import io.sentry.InterfaceC3729k1;
import io.sentry.InterfaceC3773r0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f45768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f45769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Long f45770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f45771d;

    public static final class a implements InterfaceC3773r0 {
        private Exception c(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.b(EnumC3721i3.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) throws Exception {
            interfaceC3724j1.I();
            String strD2 = null;
            String strD3 = null;
            Long lX2 = null;
            HashMap map = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                switch (strX0) {
                    case "quantity":
                        lX2 = interfaceC3724j1.x2();
                        break;
                    case "reason":
                        strD2 = interfaceC3724j1.D2();
                        break;
                    case "category":
                        strD3 = interfaceC3724j1.D2();
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
            if (strD2 == null) {
                throw c("reason", iLogger);
            }
            if (strD3 == null) {
                throw c("category", iLogger);
            }
            if (lX2 == null) {
                throw c("quantity", iLogger);
            }
            g gVar = new g(strD2, strD3, lX2);
            gVar.d(map);
            return gVar;
        }
    }

    public g(String str, String str2, Long l10) {
        this.f45768a = str;
        this.f45769b = str2;
        this.f45770c = l10;
    }

    public String a() {
        return this.f45769b;
    }

    public Long b() {
        return this.f45770c;
    }

    public String c() {
        return this.f45768a;
    }

    public void d(Map map) {
        this.f45771d = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        interfaceC3729k1.d("reason").e(this.f45768a);
        interfaceC3729k1.d("category").e(this.f45769b);
        interfaceC3729k1.d("quantity").i(this.f45770c);
        Map map = this.f45771d;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC3729k1.d(str).j(iLogger, this.f45771d.get(str));
            }
        }
        interfaceC3729k1.T();
    }

    public String toString() {
        return "DiscardedEvent{reason='" + this.f45768a + "', category='" + this.f45769b + "', quantity=" + this.f45770c + '}';
    }
}

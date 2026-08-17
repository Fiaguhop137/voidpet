package io.sentry.protocol;

import io.sentry.B0;
import io.sentry.EnumC3721i3;
import io.sentry.ILogger;
import io.sentry.InterfaceC3724j1;
import io.sentry.InterfaceC3729k1;
import io.sentry.InterfaceC3773r0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3767k implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Number f46224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f46225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f46226c;

    /* JADX INFO: renamed from: io.sentry.protocol.k$a */
    public static final class a implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3767k a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            interfaceC3724j1.I();
            Number number = null;
            String strD2 = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                if (strX0.equals("unit")) {
                    strD2 = interfaceC3724j1.D2();
                } else if (strX0.equals("value")) {
                    number = (Number) interfaceC3724j1.z3();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    interfaceC3724j1.M2(iLogger, concurrentHashMap, strX0);
                }
            }
            interfaceC3724j1.T();
            if (number != null) {
                C3767k c3767k = new C3767k(number, strD2);
                c3767k.a(concurrentHashMap);
                return c3767k;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"value\"");
            iLogger.b(EnumC3721i3.ERROR, "Missing required field \"value\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public C3767k(Number number, String str) {
        this.f46224a = number;
        this.f46225b = str;
    }

    public void a(Map map) {
        this.f46226c = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        interfaceC3729k1.d("value").i(this.f46224a);
        if (this.f46225b != null) {
            interfaceC3729k1.d("unit").e(this.f46225b);
        }
        Map map = this.f46226c;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f46226c.get(str);
                interfaceC3729k1.d(str);
                interfaceC3729k1.j(iLogger, obj);
            }
        }
        interfaceC3729k1.T();
    }
}

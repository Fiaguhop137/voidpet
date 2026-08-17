package io.sentry.protocol;

import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3724j1;
import io.sentry.InterfaceC3729k1;
import io.sentry.InterfaceC3773r0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class G implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f46116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f46117b;

    public static final class a implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public G a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            interfaceC3724j1.I();
            String strD2 = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                if (strX0.equals("source")) {
                    strD2 = interfaceC3724j1.D2();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    interfaceC3724j1.M2(iLogger, concurrentHashMap, strX0);
                }
            }
            G g10 = new G(strD2);
            g10.a(concurrentHashMap);
            interfaceC3724j1.T();
            return g10;
        }
    }

    public G(String str) {
        this.f46116a = str;
    }

    public void a(Map map) {
        this.f46117b = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        if (this.f46116a != null) {
            interfaceC3729k1.d("source").j(iLogger, this.f46116a);
        }
        Map map = this.f46117b;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f46117b.get(str);
                interfaceC3729k1.d(str);
                interfaceC3729k1.j(iLogger, obj);
            }
        }
        interfaceC3729k1.T();
    }
}

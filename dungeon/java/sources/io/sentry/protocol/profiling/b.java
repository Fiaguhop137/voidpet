package io.sentry.protocol.profiling;

import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3724j1;
import io.sentry.InterfaceC3729k1;
import io.sentry.InterfaceC3773r0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f46273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f46274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f46275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f46276d;

    public static final class a implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            interfaceC3724j1.I();
            b bVar = new b();
            HashMap map = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                switch (strX0) {
                    case "thread_id":
                        bVar.f46275c = interfaceC3724j1.D2();
                        break;
                    case "timestamp":
                        bVar.f46273a = interfaceC3724j1.nextDouble();
                        break;
                    case "stack_id":
                        bVar.f46274b = interfaceC3724j1.nextInt();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        interfaceC3724j1.M2(iLogger, map, strX0);
                        break;
                }
            }
            bVar.e(map);
            interfaceC3724j1.T();
            return bVar;
        }
    }

    private BigDecimal d(Double d10) {
        return BigDecimal.valueOf(d10.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    public void e(Map map) {
        this.f46276d = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        interfaceC3729k1.d("timestamp").j(iLogger, d(Double.valueOf(this.f46273a)));
        interfaceC3729k1.d("stack_id").j(iLogger, Integer.valueOf(this.f46274b));
        if (this.f46275c != null) {
            interfaceC3729k1.d("thread_id").j(iLogger, this.f46275c);
        }
        Map map = this.f46276d;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC3729k1.d(str).j(iLogger, this.f46276d.get(str));
            }
        }
        interfaceC3729k1.T();
    }
}

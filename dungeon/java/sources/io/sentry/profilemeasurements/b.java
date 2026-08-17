package io.sentry.profilemeasurements;

import io.sentry.AbstractC3732l;
import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3724j1;
import io.sentry.InterfaceC3729k1;
import io.sentry.InterfaceC3773r0;
import io.sentry.util.w;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map f46050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f46051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f46052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f46053d;

    public static final class a implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            Double dValueOf;
            interfaceC3724j1.I();
            b bVar = new b();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                switch (strX0) {
                    case "elapsed_since_start_ns":
                        String strD2 = interfaceC3724j1.D2();
                        if (strD2 == null) {
                            break;
                        } else {
                            bVar.f46052c = strD2;
                            break;
                        }
                        break;
                    case "timestamp":
                        try {
                            dValueOf = interfaceC3724j1.S0();
                            break;
                        } catch (NumberFormatException unused) {
                            Date dateE1 = interfaceC3724j1.e1(iLogger);
                            dValueOf = dateE1 != null ? Double.valueOf(AbstractC3732l.b(dateE1)) : null;
                        }
                        if (dValueOf == null) {
                            break;
                        } else {
                            bVar.f46051b = dValueOf.doubleValue();
                            break;
                        }
                        break;
                    case "value":
                        Double dS0 = interfaceC3724j1.S0();
                        if (dS0 == null) {
                            break;
                        } else {
                            bVar.f46053d = dS0.doubleValue();
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
            bVar.e(concurrentHashMap);
            interfaceC3724j1.T();
            return bVar;
        }
    }

    public b() {
        this(0L, 0, 0L);
    }

    public b(Long l10, Number number, long j10) {
        this.f46052c = l10.toString();
        this.f46053d = number.doubleValue();
        this.f46051b = AbstractC3732l.m(j10);
    }

    private BigDecimal d(Double d10) {
        return BigDecimal.valueOf(d10.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    public void e(Map map) {
        this.f46050a = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (w.a(this.f46050a, bVar.f46050a) && this.f46052c.equals(bVar.f46052c) && this.f46053d == bVar.f46053d && this.f46051b == bVar.f46051b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return w.b(this.f46050a, this.f46052c, Double.valueOf(this.f46053d));
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        interfaceC3729k1.d("value").j(iLogger, Double.valueOf(this.f46053d));
        interfaceC3729k1.d("elapsed_since_start_ns").j(iLogger, this.f46052c);
        interfaceC3729k1.d("timestamp").j(iLogger, d(Double.valueOf(this.f46051b)));
        Map map = this.f46050a;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f46050a.get(str);
                interfaceC3729k1.d(str);
                interfaceC3729k1.j(iLogger, obj);
            }
        }
        interfaceC3729k1.T();
    }
}

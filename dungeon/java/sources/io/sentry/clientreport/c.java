package io.sentry.clientreport;

import io.sentry.AbstractC3732l;
import io.sentry.B0;
import io.sentry.EnumC3721i3;
import io.sentry.ILogger;
import io.sentry.InterfaceC3724j1;
import io.sentry.InterfaceC3729k1;
import io.sentry.InterfaceC3773r0;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Date f45761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f45762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f45763c;

    public static final class a implements InterfaceC3773r0 {
        private Exception c(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.b(EnumC3721i3.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) throws Exception {
            ArrayList arrayList = new ArrayList();
            interfaceC3724j1.I();
            Date dateE1 = null;
            HashMap map = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                if (strX0.equals("discarded_events")) {
                    arrayList.addAll(interfaceC3724j1.L3(iLogger, new g.a()));
                } else if (strX0.equals("timestamp")) {
                    dateE1 = interfaceC3724j1.e1(iLogger);
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    interfaceC3724j1.M2(iLogger, map, strX0);
                }
            }
            interfaceC3724j1.T();
            if (dateE1 == null) {
                throw c("timestamp", iLogger);
            }
            if (arrayList.isEmpty()) {
                throw c("discarded_events", iLogger);
            }
            c cVar = new c(dateE1, arrayList);
            cVar.b(map);
            return cVar;
        }
    }

    public c(Date date, List list) {
        this.f45761a = date;
        this.f45762b = list;
    }

    public List a() {
        return this.f45762b;
    }

    public void b(Map map) {
        this.f45763c = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        interfaceC3729k1.d("timestamp").e(AbstractC3732l.h(this.f45761a));
        interfaceC3729k1.d("discarded_events").j(iLogger, this.f45762b);
        Map map = this.f45763c;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC3729k1.d(str).j(iLogger, this.f45763c.get(str));
            }
        }
        interfaceC3729k1.T();
    }
}

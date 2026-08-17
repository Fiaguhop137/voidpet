package io.sentry.protocol.profiling;

import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3724j1;
import io.sentry.InterfaceC3729k1;
import io.sentry.InterfaceC3773r0;
import io.sentry.protocol.B;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f46268a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f46269b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f46270c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f46271d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map f46272e;

    public static final class b implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            interfaceC3724j1.I();
            a aVar = new a();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                switch (strX0) {
                    case "frames":
                        List listL3 = interfaceC3724j1.L3(iLogger, new B.a());
                        if (listL3 == null) {
                            break;
                        } else {
                            aVar.f46270c = listL3;
                            break;
                        }
                        break;
                    case "stacks":
                        List list = (List) interfaceC3724j1.A1(iLogger, new c(null));
                        if (list == null) {
                            break;
                        } else {
                            aVar.f46269b = list;
                            break;
                        }
                        break;
                    case "samples":
                        List listL4 = interfaceC3724j1.L3(iLogger, new io.sentry.protocol.profiling.b.a());
                        if (listL4 == null) {
                            break;
                        } else {
                            aVar.f46268a = listL4;
                            break;
                        }
                        break;
                    case "thread_metadata":
                        Map mapJ2 = interfaceC3724j1.J2(iLogger, new io.sentry.protocol.profiling.c.a());
                        if (mapJ2 == null) {
                            break;
                        } else {
                            aVar.f46271d = mapJ2;
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
            aVar.e(concurrentHashMap);
            interfaceC3724j1.T();
            return aVar;
        }
    }

    private static final class c implements InterfaceC3773r0 {
        private c() {
        }

        /* synthetic */ c(C0541a c0541a) {
            this();
        }

        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public List a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            ArrayList arrayList = new ArrayList();
            interfaceC3724j1.N();
            while (interfaceC3724j1.hasNext()) {
                ArrayList arrayList2 = new ArrayList();
                interfaceC3724j1.N();
                while (interfaceC3724j1.hasNext()) {
                    arrayList2.add(Integer.valueOf(interfaceC3724j1.nextInt()));
                }
                interfaceC3724j1.J();
                arrayList.add(arrayList2);
            }
            interfaceC3724j1.J();
            return arrayList;
        }
    }

    public void e(Map map) {
        this.f46272e = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        interfaceC3729k1.d("samples").j(iLogger, this.f46268a);
        interfaceC3729k1.d("stacks").j(iLogger, this.f46269b);
        interfaceC3729k1.d("frames").j(iLogger, this.f46270c);
        interfaceC3729k1.d("thread_metadata").j(iLogger, this.f46271d);
        Map map = this.f46272e;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC3729k1.d(str).j(iLogger, this.f46272e.get(str));
            }
        }
        interfaceC3729k1.T();
    }
}

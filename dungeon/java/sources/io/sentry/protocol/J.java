package io.sentry.protocol;

import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3724j1;
import io.sentry.InterfaceC3729k1;
import io.sentry.InterfaceC3773r0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class J implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f46126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f46127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f46128c;

    public static final class a implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public J a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            interfaceC3724j1.I();
            String strD2 = null;
            List listL3 = null;
            HashMap map = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                if (strX0.equals("rendering_system")) {
                    strD2 = interfaceC3724j1.D2();
                } else if (strX0.equals("windows")) {
                    listL3 = interfaceC3724j1.L3(iLogger, new K.a());
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    interfaceC3724j1.M2(iLogger, map, strX0);
                }
            }
            interfaceC3724j1.T();
            J j10 = new J(strD2, listL3);
            j10.a(map);
            return j10;
        }
    }

    public J(String str, List list) {
        this.f46126a = str;
        this.f46127b = list;
    }

    public void a(Map map) {
        this.f46128c = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        if (this.f46126a != null) {
            interfaceC3729k1.d("rendering_system").e(this.f46126a);
        }
        if (this.f46127b != null) {
            interfaceC3729k1.d("windows").j(iLogger, this.f46127b);
        }
        Map map = this.f46128c;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC3729k1.d(str).j(iLogger, this.f46128c.get(str));
            }
        }
        interfaceC3729k1.T();
    }
}

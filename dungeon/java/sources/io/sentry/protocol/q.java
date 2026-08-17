package io.sentry.protocol;

import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3724j1;
import io.sentry.InterfaceC3729k1;
import io.sentry.InterfaceC3773r0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f46280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f46281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f46282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f46283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map f46284e;

    public static final class a implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public q a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            q qVar = new q();
            interfaceC3724j1.I();
            HashMap map = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                switch (strX0) {
                    case "sdk_name":
                        qVar.f46280a = interfaceC3724j1.D2();
                        break;
                    case "version_patchlevel":
                        qVar.f46283d = interfaceC3724j1.t2();
                        break;
                    case "version_major":
                        qVar.f46281b = interfaceC3724j1.t2();
                        break;
                    case "version_minor":
                        qVar.f46282c = interfaceC3724j1.t2();
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
            qVar.e(map);
            return qVar;
        }
    }

    public void e(Map map) {
        this.f46284e = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        if (this.f46280a != null) {
            interfaceC3729k1.d("sdk_name").e(this.f46280a);
        }
        if (this.f46281b != null) {
            interfaceC3729k1.d("version_major").i(this.f46281b);
        }
        if (this.f46282c != null) {
            interfaceC3729k1.d("version_minor").i(this.f46282c);
        }
        if (this.f46283d != null) {
            interfaceC3729k1.d("version_patchlevel").i(this.f46283d);
        }
        Map map = this.f46284e;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC3729k1.d(str).j(iLogger, this.f46284e.get(str));
            }
        }
        interfaceC3729k1.T();
    }
}

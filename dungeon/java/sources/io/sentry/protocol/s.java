package io.sentry.protocol;

import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3724j1;
import io.sentry.InterfaceC3729k1;
import io.sentry.InterfaceC3773r0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f46290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f46291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f46292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Long f46293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C f46294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private l f46295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map f46296g;

    public static final class a implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public s a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            s sVar = new s();
            interfaceC3724j1.I();
            HashMap map = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                switch (strX0) {
                    case "thread_id":
                        sVar.f46293d = interfaceC3724j1.x2();
                        break;
                    case "module":
                        sVar.f46292c = interfaceC3724j1.D2();
                        break;
                    case "type":
                        sVar.f46290a = interfaceC3724j1.D2();
                        break;
                    case "value":
                        sVar.f46291b = interfaceC3724j1.D2();
                        break;
                    case "mechanism":
                        sVar.f46295f = (l) interfaceC3724j1.A1(iLogger, new l.a());
                        break;
                    case "stacktrace":
                        sVar.f46294e = (C) interfaceC3724j1.A1(iLogger, new C.a());
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
            sVar.q(map);
            return sVar;
        }
    }

    public l g() {
        return this.f46295f;
    }

    public String h() {
        return this.f46292c;
    }

    public C i() {
        return this.f46294e;
    }

    public Long j() {
        return this.f46293d;
    }

    public String k() {
        return this.f46290a;
    }

    public void l(l lVar) {
        this.f46295f = lVar;
    }

    public void m(String str) {
        this.f46292c = str;
    }

    public void n(C c10) {
        this.f46294e = c10;
    }

    public void o(Long l10) {
        this.f46293d = l10;
    }

    public void p(String str) {
        this.f46290a = str;
    }

    public void q(Map map) {
        this.f46296g = map;
    }

    public void r(String str) {
        this.f46291b = str;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        if (this.f46290a != null) {
            interfaceC3729k1.d("type").e(this.f46290a);
        }
        if (this.f46291b != null) {
            interfaceC3729k1.d("value").e(this.f46291b);
        }
        if (this.f46292c != null) {
            interfaceC3729k1.d("module").e(this.f46292c);
        }
        if (this.f46293d != null) {
            interfaceC3729k1.d("thread_id").i(this.f46293d);
        }
        if (this.f46294e != null) {
            interfaceC3729k1.d("stacktrace").j(iLogger, this.f46294e);
        }
        if (this.f46295f != null) {
            interfaceC3729k1.d("mechanism").j(iLogger, this.f46295f);
        }
        Map map = this.f46296g;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC3729k1.d(str).j(iLogger, this.f46296g.get(str));
            }
        }
        interfaceC3729k1.T();
    }
}

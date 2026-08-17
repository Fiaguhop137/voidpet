package io.sentry.protocol;

import io.sentry.B0;
import io.sentry.EnumC3721i3;
import io.sentry.ILogger;
import io.sentry.InterfaceC3724j1;
import io.sentry.InterfaceC3729k1;
import io.sentry.InterfaceC3773r0;
import io.sentry.util.AbstractC3801c;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: io.sentry.protocol.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3764h implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f46203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f46204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f46205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private x f46206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private x f46207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f46208f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map f46209g;

    /* JADX INFO: renamed from: io.sentry.protocol.h$a */
    public static final class a implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3764h a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            interfaceC3724j1.I();
            String strD2 = null;
            String strD3 = null;
            String strD4 = null;
            x xVarA = null;
            x xVarA2 = null;
            String strD5 = null;
            HashMap map = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                switch (strX0) {
                    case "associated_event_id":
                        xVarA = new x.a().a(interfaceC3724j1, iLogger);
                        break;
                    case "replay_id":
                        xVarA2 = new x.a().a(interfaceC3724j1, iLogger);
                        break;
                    case "url":
                        strD5 = interfaceC3724j1.D2();
                        break;
                    case "name":
                        strD4 = interfaceC3724j1.D2();
                        break;
                    case "contact_email":
                        strD3 = interfaceC3724j1.D2();
                        break;
                    case "message":
                        strD2 = interfaceC3724j1.D2();
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
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"message\"");
                iLogger.b(EnumC3721i3.ERROR, "Missing required field \"message\"", illegalStateException);
                throw illegalStateException;
            }
            C3764h c3764h = new C3764h(strD2);
            c3764h.f46204b = strD3;
            c3764h.f46205c = strD4;
            c3764h.f46206d = xVarA;
            c3764h.f46207e = xVarA2;
            c3764h.f46208f = strD5;
            c3764h.f46209g = map;
            return c3764h;
        }
    }

    public C3764h(C3764h c3764h) {
        this.f46203a = c3764h.f46203a;
        this.f46204b = c3764h.f46204b;
        this.f46205c = c3764h.f46205c;
        this.f46206d = c3764h.f46206d;
        this.f46207e = c3764h.f46207e;
        this.f46208f = c3764h.f46208f;
        this.f46209g = AbstractC3801c.b(c3764h.f46209g);
    }

    public C3764h(String str) {
        g(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3764h)) {
            return false;
        }
        C3764h c3764h = (C3764h) obj;
        return io.sentry.util.w.a(this.f46203a, c3764h.f46203a) && io.sentry.util.w.a(this.f46204b, c3764h.f46204b) && io.sentry.util.w.a(this.f46205c, c3764h.f46205c) && io.sentry.util.w.a(this.f46206d, c3764h.f46206d) && io.sentry.util.w.a(this.f46207e, c3764h.f46207e) && io.sentry.util.w.a(this.f46208f, c3764h.f46208f) && io.sentry.util.w.a(this.f46209g, c3764h.f46209g);
    }

    public void g(String str) {
        if (str.length() > 4096) {
            this.f46203a = str.substring(0, 4096);
        } else {
            this.f46203a = str;
        }
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f46203a, this.f46204b, this.f46205c, this.f46206d, this.f46207e, this.f46208f, this.f46209g);
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        interfaceC3729k1.d("message").e(this.f46203a);
        if (this.f46204b != null) {
            interfaceC3729k1.d("contact_email").e(this.f46204b);
        }
        if (this.f46205c != null) {
            interfaceC3729k1.d("name").e(this.f46205c);
        }
        if (this.f46206d != null) {
            interfaceC3729k1.d("associated_event_id");
            this.f46206d.serialize(interfaceC3729k1, iLogger);
        }
        if (this.f46207e != null) {
            interfaceC3729k1.d("replay_id");
            this.f46207e.serialize(interfaceC3729k1, iLogger);
        }
        if (this.f46208f != null) {
            interfaceC3729k1.d("url").e(this.f46208f);
        }
        Map map = this.f46209g;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC3729k1.d(str).j(iLogger, this.f46209g.get(str));
            }
        }
        interfaceC3729k1.T();
    }

    public String toString() {
        return "Feedback{message='" + this.f46203a + "', contactEmail='" + this.f46204b + "', name='" + this.f46205c + "', associatedEventId=" + this.f46206d + ", replayId=" + this.f46207e + ", url='" + this.f46208f + "', unknown=" + this.f46209g + '}';
    }
}

package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.InterfaceC3724j1;
import io.sentry.InterfaceC3729k1;
import io.sentry.util.w;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f46424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f46425b = System.currentTimeMillis();

    public static final class a {
        public boolean a(b bVar, String str, InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            str.getClass();
            if (str.equals("type")) {
                bVar.f46424a = (c) w.c((c) interfaceC3724j1.A1(iLogger, new c.a()), "");
                return true;
            }
            if (!str.equals("timestamp")) {
                return false;
            }
            bVar.f46425b = interfaceC3724j1.nextLong();
            return true;
        }
    }

    /* JADX INFO: renamed from: io.sentry.rrweb.b$b, reason: collision with other inner class name */
    public static final class C0543b {
        public void a(b bVar, InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
            interfaceC3729k1.d("type").j(iLogger, bVar.f46424a);
            interfaceC3729k1.d("timestamp").a(bVar.f46425b);
        }
    }

    protected b(c cVar) {
        this.f46424a = cVar;
    }

    public long e() {
        return this.f46425b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f46425b == bVar.f46425b && this.f46424a == bVar.f46424a;
    }

    public void f(long j10) {
        this.f46425b = j10;
    }

    public int hashCode() {
        return w.b(this.f46424a, Long.valueOf(this.f46425b));
    }
}

package io.sentry.util;

import io.sentry.InterfaceC3698e0;

/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f46572b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Object f46571a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3799a f46573c = new C3799a();

    public interface a {
        Object a();
    }

    public p(a aVar) {
        this.f46572b = aVar;
    }

    public Object a() {
        if (this.f46571a == null) {
            InterfaceC3698e0 interfaceC3698e0A = this.f46573c.a();
            try {
                if (this.f46571a == null) {
                    this.f46571a = this.f46572b.a();
                }
                if (interfaceC3698e0A != null) {
                    interfaceC3698e0A.close();
                }
            } catch (Throwable th) {
                if (interfaceC3698e0A != null) {
                    try {
                        interfaceC3698e0A.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        return this.f46571a;
    }

    public void b() {
        InterfaceC3698e0 interfaceC3698e0A = this.f46573c.a();
        try {
            this.f46571a = null;
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
        } catch (Throwable th) {
            if (interfaceC3698e0A != null) {
                try {
                    interfaceC3698e0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void c(Object obj) {
        InterfaceC3698e0 interfaceC3698e0A = this.f46573c.a();
        try {
            this.f46571a = obj;
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
        } catch (Throwable th) {
            if (interfaceC3698e0A != null) {
                try {
                    interfaceC3698e0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}

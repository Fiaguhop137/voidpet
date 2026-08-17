package io.sentry;

import io.sentry.util.C3799a;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: io.sentry.g3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3711g3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile C3711g3 f45854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C3799a f45855d = new C3799a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile Boolean f45856e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C3799a f45857f = new C3799a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f45858a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f45859b = new CopyOnWriteArraySet();

    private C3711g3() {
    }

    public static C3711g3 d() {
        if (f45854c == null) {
            InterfaceC3698e0 interfaceC3698e0A = f45855d.a();
            try {
                if (f45854c == null) {
                    f45854c = new C3711g3();
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
        return f45854c;
    }

    public void a(String str) {
        io.sentry.util.w.c(str, "integration is required.");
        this.f45858a.add(str);
    }

    public void b(String str, String str2) {
        io.sentry.util.w.c(str, "name is required.");
        io.sentry.util.w.c(str2, "version is required.");
        this.f45859b.add(new io.sentry.protocol.y(str, str2));
        InterfaceC3698e0 interfaceC3698e0A = f45857f.a();
        try {
            f45856e = null;
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

    public boolean c(ILogger iLogger) {
        Boolean bool = f45856e;
        if (bool != null) {
            return bool.booleanValue();
        }
        InterfaceC3698e0 interfaceC3698e0A = f45857f.a();
        try {
            boolean z10 = false;
            for (io.sentry.protocol.y yVar : this.f45859b) {
                if (yVar.a().startsWith("maven:io.sentry:") && !"8.33.0".equalsIgnoreCase(yVar.b())) {
                    iLogger.c(EnumC3721i3.ERROR, "The Sentry SDK has been configured with mixed versions. Expected %s to match core SDK version %s but was %s", yVar.a(), "8.33.0", yVar.b());
                    z10 = true;
                }
            }
            if (z10) {
                EnumC3721i3 enumC3721i3 = EnumC3721i3.ERROR;
                iLogger.c(enumC3721i3, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                iLogger.c(enumC3721i3, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                iLogger.c(enumC3721i3, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                iLogger.c(enumC3721i3, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
            }
            f45856e = Boolean.valueOf(z10);
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
            return z10;
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

    public Set e() {
        return this.f45858a;
    }

    public Set f() {
        return this.f45859b;
    }
}

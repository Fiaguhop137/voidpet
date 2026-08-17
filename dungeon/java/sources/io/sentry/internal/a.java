package io.sentry.internal;

import io.sentry.C3711g3;
import io.sentry.InterfaceC3698e0;
import io.sentry.util.C3799a;
import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile a f45893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final C3799a f45894e = new C3799a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f45895a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0538a f45896b = new C0538a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C3799a f45897c = new C3799a();

    /* JADX INFO: renamed from: io.sentry.internal.a$a, reason: collision with other inner class name */
    public static final class C0538a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile String f45898a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile String f45899b;
    }

    private a() {
    }

    public static a a() {
        if (f45893d == null) {
            InterfaceC3698e0 interfaceC3698e0A = f45894e.a();
            try {
                if (f45893d == null) {
                    f45893d = new a();
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
        return f45893d;
    }

    public void b() {
        if (this.f45895a) {
            return;
        }
        try {
            InterfaceC3698e0 interfaceC3698e0A = this.f45897c.a();
            try {
                if (this.f45895a) {
                    if (interfaceC3698e0A != null) {
                        interfaceC3698e0A.close();
                    }
                    this.f45895a = true;
                    return;
                }
                Enumeration<URL> resources = ClassLoader.getSystemClassLoader().getResources("META-INF/MANIFEST.MF");
                while (resources.hasMoreElements()) {
                    try {
                        Attributes mainAttributes = new Manifest(resources.nextElement().openStream()).getMainAttributes();
                        if (mainAttributes != null) {
                            String value = mainAttributes.getValue("Sentry-Opentelemetry-SDK-Name");
                            String value2 = mainAttributes.getValue("Implementation-Version");
                            String value3 = mainAttributes.getValue("Sentry-SDK-Name");
                            String value4 = mainAttributes.getValue("Sentry-SDK-Package-Name");
                            if (value != null && value2 != null) {
                                this.f45896b.f45898a = value;
                                this.f45896b.f45899b = value2;
                                String value5 = mainAttributes.getValue("Sentry-Opentelemetry-Version-Name");
                                if (value5 != null) {
                                    C3711g3.d().b("maven:io.opentelemetry:opentelemetry-sdk", value5);
                                    C3711g3.d().a("OpenTelemetry");
                                }
                                String value6 = mainAttributes.getValue("Sentry-Opentelemetry-Javaagent-Version-Name");
                                if (value6 != null) {
                                    C3711g3.d().b("maven:io.opentelemetry.javaagent:opentelemetry-javaagent", value6);
                                    C3711g3.d().a("OpenTelemetry-Agent");
                                }
                                if (value.equals("sentry.java.opentelemetry.agentless")) {
                                    C3711g3.d().a("OpenTelemetry-Agentless");
                                }
                                if (value.equals("sentry.java.opentelemetry.agentless-spring")) {
                                    C3711g3.d().a("OpenTelemetry-Agentless-Spring");
                                }
                            }
                            if (value3 != null && value2 != null && value4 != null && value3.startsWith("sentry.java")) {
                                C3711g3.d().b(value4, value2);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                if (interfaceC3698e0A != null) {
                    interfaceC3698e0A.close();
                }
                this.f45895a = true;
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
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f45895a = true;
            throw th3;
        }
        this.f45895a = true;
    }
}

package io.sentry;

import io.sentry.util.C3799a;
import java.io.File;

/* JADX INFO: renamed from: io.sentry.n2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3745n2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C3745n2 f46022d = new C3745n2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f46023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f46024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3799a f46025c = new C3799a();

    private C3745n2() {
    }

    public static C3745n2 a() {
        return f46022d;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x004e  */
    public Boolean b(String str, boolean z10) {
        InterfaceC3698e0 interfaceC3698e0A = this.f46025c.a();
        try {
            if (this.f46023a) {
                Boolean bool = this.f46024b;
                if (interfaceC3698e0A != null) {
                    interfaceC3698e0A.close();
                }
                return bool;
            }
            if (str == null) {
                if (interfaceC3698e0A != null) {
                    interfaceC3698e0A.close();
                }
                return null;
            }
            boolean z11 = true;
            this.f46023a = true;
            File file = new File(str, "last_crash");
            File file2 = new File(str, ".sentry-native/last_crash");
            try {
                try {
                    if (!file.exists()) {
                        if (!file2.exists()) {
                            z11 = false;
                        } else if (z10) {
                            file2.delete();
                        }
                        this.f46024b = Boolean.valueOf(z11);
                        if (interfaceC3698e0A != null) {
                            interfaceC3698e0A.close();
                        }
                        return this.f46024b;
                    }
                    file.delete();
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
            }
            this.f46024b = Boolean.valueOf(z11);
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
            return this.f46024b;
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

    public void c() {
        InterfaceC3698e0 interfaceC3698e0A = this.f46025c.a();
        try {
            this.f46023a = false;
            this.f46024b = null;
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

    public void d(boolean z10) {
        InterfaceC3698e0 interfaceC3698e0A = this.f46025c.a();
        try {
            if (!this.f46023a) {
                this.f46024b = Boolean.valueOf(z10);
                this.f46023a = true;
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
}

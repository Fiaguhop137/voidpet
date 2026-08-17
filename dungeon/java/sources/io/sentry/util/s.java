package io.sentry.util;

import io.sentry.C3833z3;
import io.sentry.EnumC3721i3;
import io.sentry.ILogger;

/* JADX INFO: loaded from: classes3.dex */
public class s {
    public boolean c(String str, ILogger iLogger) {
        return g(str, iLogger) != null;
    }

    public boolean d(String str, C3833z3 c3833z3) {
        return c(str, c3833z3 != null ? c3833z3.getLogger() : null);
    }

    public p e(String str, ILogger iLogger) {
        return new p(new r(this, str, iLogger));
    }

    public p f(String str, C3833z3 c3833z3) {
        return new p(new q(this, str, c3833z3));
    }

    public Class g(String str, ILogger iLogger) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            if (iLogger == null) {
                return null;
            }
            iLogger.c(EnumC3721i3.INFO, "Class not available: " + str, new Object[0]);
            return null;
        } catch (UnsatisfiedLinkError e10) {
            if (iLogger == null) {
                return null;
            }
            iLogger.b(EnumC3721i3.ERROR, "Failed to load (UnsatisfiedLinkError) " + str, e10);
            return null;
        } catch (Throwable th) {
            if (iLogger == null) {
                return null;
            }
            iLogger.b(EnumC3721i3.ERROR, "Failed to initialize " + str, th);
            return null;
        }
    }
}

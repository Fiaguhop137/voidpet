package io.sentry.internal.modules;

import io.sentry.EnumC3721i3;
import io.sentry.ILogger;
import io.sentry.util.AbstractC3800b;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ClassLoader f45919e;

    public f(ILogger iLogger) {
        this(iLogger, f.class.getClassLoader());
    }

    f(ILogger iLogger, ClassLoader classLoader) {
        super(iLogger);
        this.f45919e = AbstractC3800b.a(classLoader);
    }

    @Override // io.sentry.internal.modules.d
    protected Map b() {
        TreeMap treeMap = new TreeMap();
        try {
            InputStream resourceAsStream = this.f45919e.getResourceAsStream("sentry-external-modules.txt");
            try {
                if (resourceAsStream != null) {
                    Map mapC = c(resourceAsStream);
                    resourceAsStream.close();
                    return mapC;
                }
                this.f45915a.c(EnumC3721i3.INFO, "%s file was not found.", "sentry-external-modules.txt");
                if (resourceAsStream != null) {
                    resourceAsStream.close();
                    return treeMap;
                }
                return treeMap;
            } catch (Throwable th) {
                if (resourceAsStream != null) {
                    try {
                        resourceAsStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e10) {
            this.f45915a.b(EnumC3721i3.INFO, "Access to resources failed.", e10);
        } catch (SecurityException e11) {
            this.f45915a.b(EnumC3721i3.INFO, "Access to resources denied.", e11);
        }
    }
}

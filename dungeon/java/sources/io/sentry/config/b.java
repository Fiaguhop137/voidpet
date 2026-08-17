package io.sentry.config;

import io.sentry.EnumC3721i3;
import io.sentry.ILogger;
import io.sentry.util.AbstractC3800b;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/* JADX INFO: loaded from: classes3.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f45774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ClassLoader f45775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ILogger f45776c;

    public b(ILogger iLogger) {
        this("sentry.properties", b.class.getClassLoader(), iLogger);
    }

    public b(String str, ClassLoader classLoader, ILogger iLogger) {
        this.f45774a = str;
        this.f45775b = AbstractC3800b.a(classLoader);
        this.f45776c = iLogger;
    }

    public Properties a() {
        try {
            InputStream resourceAsStream = this.f45775b.getResourceAsStream(this.f45774a);
            if (resourceAsStream == null) {
                if (resourceAsStream != null) {
                    resourceAsStream.close();
                }
                return null;
            }
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(resourceAsStream);
                try {
                    Properties properties = new Properties();
                    properties.load(bufferedInputStream);
                    bufferedInputStream.close();
                    resourceAsStream.close();
                    return properties;
                } catch (Throwable th) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    resourceAsStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException e10) {
            this.f45776c.a(EnumC3721i3.ERROR, e10, "Failed to load Sentry configuration from classpath resource: %s", this.f45774a);
            return null;
        }
    }
}
